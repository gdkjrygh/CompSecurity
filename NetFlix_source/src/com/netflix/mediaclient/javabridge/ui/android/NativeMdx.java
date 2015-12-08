// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.mdx.InitErrorEvent;
import com.netflix.mediaclient.event.nrdp.mdx.InitEvent;
import com.netflix.mediaclient.event.nrdp.mdx.StateEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.DeviceFoundEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.DeviceLostEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.RemoteDeviceReadyEvent;
import com.netflix.mediaclient.event.nrdp.mdx.pair.PairingDeletedEvent;
import com.netflix.mediaclient.event.nrdp.mdx.pair.PairingResponseEvent;
import com.netflix.mediaclient.event.nrdp.mdx.pair.RegPairResponseEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.MessageDeliveredEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.MessageEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.MessagingErrorEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.SessionEndedEvent;
import com.netflix.mediaclient.event.nrdp.mdx.session.StartSessionResponseEvent;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.invoke.Invoke;
import com.netflix.mediaclient.javabridge.invoke.mdx.ClearDeviceMap;
import com.netflix.mediaclient.javabridge.invoke.mdx.Configure;
import com.netflix.mediaclient.javabridge.invoke.mdx.Exit;
import com.netflix.mediaclient.javabridge.invoke.mdx.Init;
import com.netflix.mediaclient.javabridge.invoke.mdx.discovery.IsRemoteDeviceReady;
import com.netflix.mediaclient.javabridge.invoke.mdx.discovery.LaunchNetflix;
import com.netflix.mediaclient.javabridge.invoke.mdx.pair.DeletePairing;
import com.netflix.mediaclient.javabridge.invoke.mdx.pair.PairingRequest;
import com.netflix.mediaclient.javabridge.invoke.mdx.pair.RegistrationPairingRequest;
import com.netflix.mediaclient.javabridge.invoke.mdx.session.EndSession;
import com.netflix.mediaclient.javabridge.invoke.mdx.session.SendMessage;
import com.netflix.mediaclient.javabridge.invoke.mdx.session.StartSession;
import com.netflix.mediaclient.javabridge.invoke.registration.Ping;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.DiscoveryController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.PairingController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.RemoteDevice;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.SessionController;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdObject

public final class NativeMdx extends NativeNrdObject
    implements MdxController
{
    class DiscoveryControllerImpl
        implements DiscoveryController
    {

        final NativeMdx this$0;

        public void isRemoteDeviceReady(String s)
        {
            invokeNrdMethod(new IsRemoteDeviceReady(s));
        }

        public void launchNetflix(String s, Map map)
        {
            invokeNrdMethod(new LaunchNetflix(s, map));
        }

        DiscoveryControllerImpl()
        {
            this$0 = NativeMdx.this;
            super();
        }
    }

    class PairingControllerImpl
        implements PairingController
    {

        final NativeMdx this$0;

        public void deletePairing(String s)
        {
            invokeNrdMethod(new DeletePairing(s));
        }

        public void pairingRequest(String s)
        {
            invokeNrdMethod(new PairingRequest(s));
        }

        public void registrationPairingRequest(String s)
        {
            invokeNrdMethod(new RegistrationPairingRequest(s, null));
        }

        public void registrationPairingRequest(String s, String s1)
        {
            invokeNrdMethod(new RegistrationPairingRequest(s, s1));
        }

        PairingControllerImpl()
        {
            this$0 = NativeMdx.this;
            super();
        }
    }

    class SessionControllerImpl
        implements SessionController
    {

        private String mMessageName;
        private int mSessionId;
        final NativeMdx this$0;

        public void endSession(int i)
        {
            invokeNrdMethod(new EndSession(i));
            mSessionId = -1;
        }

        public String getLastMessageName(int i)
        {
            if (mSessionId == i)
            {
                return mMessageName;
            } else
            {
                return null;
            }
        }

        public long sendMessage(int i, String s, JSONObject jsonobject)
        {
            mMessageName = s;
            mSessionId = i;
            s = new SendMessage(i, s, jsonobject);
            invokeNrdMethod(s);
            return s.getXid();
        }

        public void startSession(String s)
        {
            invokeNrdMethod(new StartSession(s));
        }

        SessionControllerImpl()
        {
            this$0 = NativeMdx.this;
            super();
            mSessionId = -1;
        }
    }


    protected static final String MDX_EVENT_DATA_FIELD_TYPE = "type";
    private static final String TAG = "nf_mdx";
    DiscoveryControllerImpl mDiscovery;
    PairingControllerImpl mPairing;
    private com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController.PropertyUpdateListener mPropertyListener;
    SessionControllerImpl mSession;

    public NativeMdx(Bridge bridge)
    {
        super(bridge);
        mDiscovery = new DiscoveryControllerImpl();
        mPairing = new PairingControllerImpl();
        mSession = new SessionControllerImpl();
    }

    private void handleEvents(JSONObject jsonobject)
        throws JSONException
    {
        String s = getString(jsonobject, "type", null);
        if (InitEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: InitEvent event");
            handleListener(InitEvent.TYPE.getName(), new InitEvent(jsonobject));
            return;
        }
        if (InitErrorEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: InitErrorEvent event");
            handleListener(InitErrorEvent.TYPE.getName(), new InitErrorEvent(jsonobject));
            return;
        }
        if (StateEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: StateEvent event");
            handleListener(StateEvent.TYPE.getName(), new StateEvent(jsonobject));
            return;
        }
        if (DeviceLostEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: DeviceLostEvent event");
            handleListener(DeviceLostEvent.TYPE.getName(), new DeviceLostEvent(jsonobject));
            return;
        }
        if (DeviceFoundEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: DeviceFoundEvent event");
            handleListener(DeviceFoundEvent.TYPE.getName(), new DeviceFoundEvent(jsonobject));
            return;
        }
        if (RemoteDeviceReadyEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: RemoteDeviceReadyEvent event");
            handleListener(RemoteDeviceReadyEvent.TYPE.getName(), new RemoteDeviceReadyEvent(jsonobject));
            return;
        }
        if (PairingResponseEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: PairingResponseEvent event");
            handleListener(PairingResponseEvent.TYPE.getName(), new PairingResponseEvent(jsonobject));
            return;
        }
        if (RegPairResponseEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: RegPairResponseEvent event");
            handleListener(RegPairResponseEvent.TYPE.getName(), new RegPairResponseEvent(jsonobject));
            return;
        }
        if (PairingDeletedEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: PairingDeletedEvent event");
            handleListener(PairingDeletedEvent.TYPE.getName(), new PairingDeletedEvent(jsonobject));
            return;
        }
        if (StartSessionResponseEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: StartSessionResponseEvent event");
            handleListener(StartSessionResponseEvent.TYPE.getName(), new StartSessionResponseEvent(jsonobject));
            return;
        }
        if (MessageDeliveredEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: MessageDeliveredEvent event");
            handleListener(MessageDeliveredEvent.TYPE.getName(), new MessageDeliveredEvent(jsonobject));
            return;
        }
        if (MessagingErrorEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: MessagingErrorEvent event");
            handleListener(MessagingErrorEvent.TYPE.getName(), new MessagingErrorEvent(jsonobject));
            return;
        }
        if (SessionEndedEvent.TYPE.getName().equalsIgnoreCase(s))
        {
            Log.d("nf_mdx", "NativeMdx: SessionEndedEvent event");
            handleListener(SessionEndedEvent.TYPE.getName(), new SessionEndedEvent(jsonobject));
            return;
        }
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("NativeMdx: MessageEvent event = ").append(s).toString());
        }
        handleListener(MessageEvent.TYPE.getName(), new MessageEvent(jsonobject));
    }

    private void invokeNrdMethod(Invoke invoke)
    {
        if (bridge != null && bridge.getNrdProxy() != null)
        {
            bridge.getNrdProxy().invokeMethod(invoke);
            return;
        } else
        {
            Log.e("nf_mdx", (new StringBuilder()).append("fail to invokeNrdMethod ").append(invoke.toString()).toString());
            return;
        }
    }

    public void clearDeviceMap()
    {
        invokeNrdMethod(new ClearDeviceMap());
    }

    public void configure(Map map)
    {
        invokeNrdMethod(new Configure(map));
    }

    public void exit()
    {
        invokeNrdMethod(new Exit());
    }

    public DiscoveryController getDiscovery()
    {
        return mDiscovery;
    }

    public String getName()
    {
        return "mdx";
    }

    public PairingController getPairing()
    {
        return mPairing;
    }

    public String getPath()
    {
        return "nrdp.mdx";
    }

    public SessionController getSession()
    {
        return mSession;
    }

    public void init(Map map, boolean flag, JSONArray jsonarray)
    {
        invokeNrdMethod(new Init(true, map, flag, jsonarray));
    }

    public void pingNccp()
    {
        invokeNrdMethod(new Ping());
    }

    public int processUpdate(JSONObject jsonobject)
    {
        Object obj;
        obj = getString(jsonobject, "type", null);
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("NativeMdx: processUpdate: handle type ").append(((String) (obj))).toString());
        }
        if (!"PropertyUpdate".equalsIgnoreCase(((String) (obj)))) goto _L2; else goto _L1
_L1:
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("NativeMdx: processUpdate: handle prop update ").append(jsonobject.toString()).toString());
        }
        jsonobject = getJSONObject(jsonobject, "properties", null);
        if (jsonobject == null) goto _L4; else goto _L3
_L3:
        if (!jsonobject.has("remoteDeviceMap")) goto _L4; else goto _L5
_L5:
        Log.d("nf_mdx", "NativeMdx: property update for remoteDeviceMap");
        if (mPropertyListener == null) goto _L7; else goto _L6
_L6:
        jsonobject = jsonobject.getJSONArray("remoteDeviceMap");
        if (jsonobject == null)
        {
            return 0;
        }
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("NativeMdx: Devices found: ").append(jsonobject.length()).toString());
        }
        obj = new ArrayList();
        int i = 0;
_L14:
        if (i >= jsonobject.length()) goto _L9; else goto _L8
_L8:
        RemoteDevice remotedevice;
        remotedevice = RemoteDevice.toRemoteDevice(jsonobject.getJSONObject(i));
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("NativeMdx: Found: ").append(remotedevice).toString());
        }
        if (remotedevice == null) goto _L11; else goto _L10
_L10:
        Log.d("nf_mdx", "NativeMdx: add to list");
        ((ArrayList) (obj)).add(remotedevice);
          goto _L11
_L9:
        try
        {
            mPropertyListener.onRemoteDeviceMap(((ArrayList) (obj)));
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf_mdx", "NativeMdx: processUpdate: Failed", jsonobject);
        }
          goto _L12
_L4:
        if (jsonobject.has("isReady"))
        {
            if (mPropertyListener != null)
            {
                mPropertyListener.onIsReady(getBoolean(jsonobject, "isReady", false));
            }
            break MISSING_BLOCK_LABEL_420;
        }
          goto _L12
_L2:
        if (!"Event".equalsIgnoreCase(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_359;
        }
        Log.d("nf_mdx", "NativeMdx: processUpdate: handle event");
        handleEvents(getJSONObject(jsonobject, "data", null));
        return 1;
        if (!Log.isLoggable("nf_mdx", 3)) goto _L12; else goto _L13
_L13:
        Log.d("nf_mdx", (new StringBuilder()).append("NativeMdx: processUpdate: type not handled ??? ").append(((String) (obj))).toString());
        return 0;
_L12:
        return 0;
_L11:
        i++;
        if (true) goto _L14; else goto _L7
_L7:
        return 1;
        return 1;
    }

    public void removePropertyUpdateListener()
    {
        mPropertyListener = null;
    }

    public void setPropertyUpdateListener(com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController.PropertyUpdateListener propertyupdatelistener)
    {
        mPropertyListener = propertyupdatelistener;
    }

}
