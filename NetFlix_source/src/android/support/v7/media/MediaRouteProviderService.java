// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProvider, MediaRouteProviderDescriptor, MediaRouteDiscoveryRequest, MediaRouteSelector, 
//            MediaRouteProviderProtocol

public abstract class MediaRouteProviderService extends Service
{
    private final class ClientRecord
        implements android.os.IBinder.DeathRecipient
    {

        private final SparseArray mControllers = new SparseArray();
        public MediaRouteDiscoveryRequest mDiscoveryRequest;
        public final Messenger mMessenger;
        public final int mVersion;
        final MediaRouteProviderService this$0;

        public void binderDied()
        {
            mPrivateHandler.obtainMessage(1, mMessenger).sendToTarget();
        }

        public boolean createRouteController(String s, int i)
        {
            if (mControllers.indexOfKey(i) < 0)
            {
                s = mProvider.onCreateRouteController(s);
                if (s != null)
                {
                    mControllers.put(i, s);
                    return true;
                }
            }
            return false;
        }

        public void dispose()
        {
            int j = mControllers.size();
            for (int i = 0; i < j; i++)
            {
                ((MediaRouteProvider.RouteController)mControllers.valueAt(i)).onRelease();
            }

            mControllers.clear();
            mMessenger.getBinder().unlinkToDeath(this, 0);
            setDiscoveryRequest(null);
        }

        public MediaRouteProvider.RouteController getRouteController(int i)
        {
            return (MediaRouteProvider.RouteController)mControllers.get(i);
        }

        public boolean hasMessenger(Messenger messenger)
        {
            return mMessenger.getBinder() == messenger.getBinder();
        }

        public boolean register()
        {
            try
            {
                mMessenger.getBinder().linkToDeath(this, 0);
            }
            catch (RemoteException remoteexception)
            {
                binderDied();
                return false;
            }
            return true;
        }

        public boolean releaseRouteController(int i)
        {
            MediaRouteProvider.RouteController routecontroller = (MediaRouteProvider.RouteController)mControllers.get(i);
            if (routecontroller != null)
            {
                mControllers.remove(i);
                routecontroller.onRelease();
                return true;
            } else
            {
                return false;
            }
        }

        public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
        {
            if (mDiscoveryRequest != mediaroutediscoveryrequest && (mDiscoveryRequest == null || !mDiscoveryRequest.equals(mediaroutediscoveryrequest)))
            {
                mDiscoveryRequest = mediaroutediscoveryrequest;
                return updateCompositeDiscoveryRequest();
            } else
            {
                return false;
            }
        }

        public String toString()
        {
            return MediaRouteProviderService.getClientId(mMessenger);
        }

        public ClientRecord(Messenger messenger, int i)
        {
            this$0 = MediaRouteProviderService.this;
            super();
            mMessenger = messenger;
            mVersion = i;
        }
    }

    private final class PrivateHandler extends Handler
    {

        final MediaRouteProviderService this$0;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                onBinderDied((Messenger)message.obj);
                break;
            }
        }

        private PrivateHandler()
        {
            this$0 = MediaRouteProviderService.this;
            super();
        }

    }

    private final class ProviderCallback extends MediaRouteProvider.Callback
    {

        final MediaRouteProviderService this$0;

        public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            sendDescriptorChanged(mediarouteproviderdescriptor);
        }

        private ProviderCallback()
        {
            this$0 = MediaRouteProviderService.this;
            super();
        }

    }

    private static final class ReceiveHandler extends Handler
    {

        private final WeakReference mServiceRef;

        private boolean processMessage(int i, Messenger messenger, int j, int k, Object obj, Bundle bundle)
        {
            MediaRouteProviderService mediarouteproviderservice = (MediaRouteProviderService)mServiceRef.get();
            if (mediarouteproviderservice == null) goto _L2; else goto _L1
_L1:
            i;
            JVM INSTR tableswitch 1 10: default 72
        //                       1 74
        //                       2 84
        //                       3 92
        //                       4 118
        //                       5 128
        //                       6 138
        //                       7 148
        //                       8 172
        //                       9 196
        //                       10 219;
               goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L2:
            return false;
_L3:
            return mediarouteproviderservice.onRegisterClient(messenger, j, k);
_L4:
            return mediarouteproviderservice.onUnregisterClient(messenger, j);
_L5:
            obj = bundle.getString("routeId");
            if (obj != null)
            {
                return mediarouteproviderservice.onCreateRouteController(messenger, j, k, ((String) (obj)));
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
_L6:
            return mediarouteproviderservice.onReleaseRouteController(messenger, j, k);
_L7:
            return mediarouteproviderservice.onSelectRoute(messenger, j, k);
_L8:
            return mediarouteproviderservice.onUnselectRoute(messenger, j, k);
_L9:
            i = bundle.getInt("volume", -1);
            if (i >= 0)
            {
                return mediarouteproviderservice.onSetRouteVolume(messenger, j, k, i);
            }
            if (true) goto _L2; else goto _L10
_L10:
            i = bundle.getInt("volume", 0);
            if (i != 0)
            {
                return mediarouteproviderservice.onUpdateRouteVolume(messenger, j, k, i);
            }
            continue; /* Loop/switch isn't completed */
_L11:
            if (obj instanceof Intent)
            {
                return mediarouteproviderservice.onRouteControlRequest(messenger, j, k, (Intent)obj);
            }
            continue; /* Loop/switch isn't completed */
_L12:
            if (obj == null || (obj instanceof Bundle))
            {
                obj = MediaRouteDiscoveryRequest.fromBundle((Bundle)obj);
                if (obj == null || !((MediaRouteDiscoveryRequest) (obj)).isValid())
                {
                    obj = null;
                }
                return mediarouteproviderservice.onSetDiscoveryRequest(messenger, j, ((MediaRouteDiscoveryRequest) (obj)));
            }
            if (true) goto _L2; else goto _L13
_L13:
        }

        public void handleMessage(Message message)
        {
            Messenger messenger = message.replyTo;
            if (MediaRouteProviderProtocol.isValidRemoteMessenger(messenger))
            {
                int i = message.what;
                int j = message.arg1;
                int k = message.arg2;
                Object obj = message.obj;
                message = message.peekData();
                if (!processMessage(i, messenger, j, k, obj, message))
                {
                    if (MediaRouteProviderService.DEBUG)
                    {
                        Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(MediaRouteProviderService.getClientId(messenger)).append(": Message failed, what=").append(i).append(", requestId=").append(j).append(", arg=").append(k).append(", obj=").append(obj).append(", data=").append(message).toString());
                    }
                    MediaRouteProviderService.sendGenericFailure(messenger, j);
                }
            } else
            if (MediaRouteProviderService.DEBUG)
            {
                Log.d("MediaRouteProviderSrv", "Ignoring message without valid reply messenger.");
                return;
            }
        }

        public ReceiveHandler(MediaRouteProviderService mediarouteproviderservice)
        {
            mServiceRef = new WeakReference(mediarouteproviderservice);
        }
    }


    private static final boolean DEBUG = Log.isLoggable("MediaRouteProviderSrv", 3);
    private static final int PRIVATE_MSG_CLIENT_DIED = 1;
    public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
    private static final String TAG = "MediaRouteProviderSrv";
    private final ArrayList mClients = new ArrayList();
    private MediaRouteDiscoveryRequest mCompositeDiscoveryRequest;
    private final PrivateHandler mPrivateHandler = new PrivateHandler();
    private MediaRouteProvider mProvider;
    private final ProviderCallback mProviderCallback = new ProviderCallback();
    private final ReceiveHandler mReceiveHandler = new ReceiveHandler(this);
    private final Messenger mReceiveMessenger;

    public MediaRouteProviderService()
    {
        mReceiveMessenger = new Messenger(mReceiveHandler);
    }

    private int findClient(Messenger messenger)
    {
        int j = mClients.size();
        for (int i = 0; i < j; i++)
        {
            if (((ClientRecord)mClients.get(i)).hasMessenger(messenger))
            {
                return i;
            }
        }

        return -1;
    }

    private ClientRecord getClient(Messenger messenger)
    {
        int i = findClient(messenger);
        if (i >= 0)
        {
            return (ClientRecord)mClients.get(i);
        } else
        {
            return null;
        }
    }

    private static String getClientId(Messenger messenger)
    {
        return (new StringBuilder()).append("Client connection ").append(messenger.getBinder().toString()).toString();
    }

    private void onBinderDied(Messenger messenger)
    {
        int i = findClient(messenger);
        if (i >= 0)
        {
            messenger = (ClientRecord)mClients.remove(i);
            if (DEBUG)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(messenger).append(": Binder died").toString());
            }
            messenger.dispose();
        }
    }

    private boolean onCreateRouteController(Messenger messenger, int i, int j, String s)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null && clientrecord.createRouteController(s, j))
        {
            if (DEBUG)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Route controller created").append(", controllerId=").append(j).append(", routeId=").append(s).toString());
            }
            sendGenericSuccess(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean onRegisterClient(Messenger messenger, int i, int j)
    {
        if (j >= 1 && findClient(messenger) < 0)
        {
            ClientRecord clientrecord = new ClientRecord(messenger, j);
            if (clientrecord.register())
            {
                mClients.add(clientrecord);
                if (DEBUG)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Registered, version=").append(j).toString());
                }
                if (i != 0)
                {
                    Object obj = mProvider.getDescriptor();
                    if (obj != null)
                    {
                        obj = ((MediaRouteProviderDescriptor) (obj)).asBundle();
                    } else
                    {
                        obj = null;
                    }
                    sendReply(messenger, 2, i, 1, obj, null);
                }
                return true;
            }
        }
        return false;
    }

    private boolean onReleaseRouteController(Messenger messenger, int i, int j)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null && clientrecord.releaseRouteController(j))
        {
            if (DEBUG)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Route controller released").append(", controllerId=").append(j).toString());
            }
            sendGenericSuccess(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean onRouteControlRequest(final Messenger messenger, final int requestId, final int controllerId, final Intent intent)
    {
        final ClientRecord client = getClient(messenger);
        if (client != null)
        {
            MediaRouteProvider.RouteController routecontroller = client.getRouteController(controllerId);
            if (routecontroller != null)
            {
                MediaRouter.ControlRequestCallback controlrequestcallback = null;
                if (requestId != 0)
                {
                    controlrequestcallback = new MediaRouter.ControlRequestCallback() {

                        final MediaRouteProviderService this$0;
                        final ClientRecord val$client;
                        final int val$controllerId;
                        final Intent val$intent;
                        final Messenger val$messenger;
                        final int val$requestId;

                        public void onError(String s, Bundle bundle)
                        {
label0:
                            {
                                if (MediaRouteProviderService.DEBUG)
                                {
                                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(client).append(": Route control request failed").append(", controllerId=").append(controllerId).append(", intent=").append(intent).append(", error=").append(s).append(", data=").append(bundle).toString());
                                }
                                if (findClient(messenger) >= 0)
                                {
                                    if (s == null)
                                    {
                                        break label0;
                                    }
                                    Bundle bundle1 = new Bundle();
                                    bundle1.putString("error", s);
                                    MediaRouteProviderService.sendReply(messenger, 4, requestId, 0, bundle, bundle1);
                                }
                                return;
                            }
                            MediaRouteProviderService.sendReply(messenger, 4, requestId, 0, bundle, null);
                        }

                        public void onResult(Bundle bundle)
                        {
                            if (MediaRouteProviderService.DEBUG)
                            {
                                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(client).append(": Route control request succeeded").append(", controllerId=").append(controllerId).append(", intent=").append(intent).append(", data=").append(bundle).toString());
                            }
                            if (findClient(messenger) >= 0)
                            {
                                MediaRouteProviderService.sendReply(messenger, 3, requestId, 0, bundle, null);
                            }
                        }

            
            {
                this$0 = MediaRouteProviderService.this;
                client = clientrecord;
                controllerId = i;
                intent = intent1;
                messenger = messenger1;
                requestId = j;
                super();
            }
                    };
                }
                if (routecontroller.onControlRequest(intent, controlrequestcallback))
                {
                    if (DEBUG)
                    {
                        Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(client).append(": Route control request delivered").append(", controllerId=").append(controllerId).append(", intent=").append(intent).toString());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean onSelectRoute(Messenger messenger, int i, int j)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null)
        {
            MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
            if (routecontroller != null)
            {
                routecontroller.onSelect();
                if (DEBUG)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Route selected").append(", controllerId=").append(j).toString());
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private boolean onSetDiscoveryRequest(Messenger messenger, int i, MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null)
        {
            boolean flag = clientrecord.setDiscoveryRequest(mediaroutediscoveryrequest);
            if (DEBUG)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Set discovery request, request=").append(mediaroutediscoveryrequest).append(", actuallyChanged=").append(flag).append(", compositeDiscoveryRequest=").append(mCompositeDiscoveryRequest).toString());
            }
            sendGenericSuccess(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean onSetRouteVolume(Messenger messenger, int i, int j, int k)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null)
        {
            MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
            if (routecontroller != null)
            {
                routecontroller.onSetVolume(k);
                if (DEBUG)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Route volume changed").append(", controllerId=").append(j).append(", volume=").append(k).toString());
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private boolean onUnregisterClient(Messenger messenger, int i)
    {
        int j = findClient(messenger);
        if (j >= 0)
        {
            ClientRecord clientrecord = (ClientRecord)mClients.remove(j);
            if (DEBUG)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Unregistered").toString());
            }
            clientrecord.dispose();
            sendGenericSuccess(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean onUnselectRoute(Messenger messenger, int i, int j)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null)
        {
            MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
            if (routecontroller != null)
            {
                routecontroller.onUnselect();
                if (DEBUG)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Route unselected").append(", controllerId=").append(j).toString());
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private boolean onUpdateRouteVolume(Messenger messenger, int i, int j, int k)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null)
        {
            MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
            if (routecontroller != null)
            {
                routecontroller.onUpdateVolume(k);
                if (DEBUG)
                {
                    Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Route volume updated").append(", controllerId=").append(j).append(", delta=").append(k).toString());
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private void sendDescriptorChanged(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
    {
        Bundle bundle;
        int j;
        if (mediarouteproviderdescriptor != null)
        {
            bundle = mediarouteproviderdescriptor.asBundle();
        } else
        {
            bundle = null;
        }
        j = mClients.size();
        for (int i = 0; i < j; i++)
        {
            ClientRecord clientrecord = (ClientRecord)mClients.get(i);
            sendReply(clientrecord.mMessenger, 5, 0, 0, bundle, null);
            if (DEBUG)
            {
                Log.d("MediaRouteProviderSrv", (new StringBuilder()).append(clientrecord).append(": Sent descriptor change event, descriptor=").append(mediarouteproviderdescriptor).toString());
            }
        }

    }

    private static void sendGenericFailure(Messenger messenger, int i)
    {
        if (i != 0)
        {
            sendReply(messenger, 0, i, 0, null, null);
        }
    }

    private static void sendGenericSuccess(Messenger messenger, int i)
    {
        if (i != 0)
        {
            sendReply(messenger, 1, i, 0, null, null);
        }
    }

    private static void sendReply(Messenger messenger, int i, int j, int k, Object obj, Bundle bundle)
    {
        Message message = Message.obtain();
        message.what = i;
        message.arg1 = j;
        message.arg2 = k;
        message.obj = obj;
        message.setData(bundle);
        try
        {
            messenger.send(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MediaRouteProviderSrv", (new StringBuilder()).append("Could not send message to ").append(getClientId(messenger)).toString(), ((Throwable) (obj)));
        }
    }

    private boolean updateCompositeDiscoveryRequest()
    {
        MediaRouteDiscoveryRequest mediaroutediscoveryrequest = null;
        MediaRouteSelector.Builder builder = null;
        boolean flag = false;
        int j = mClients.size();
        int i = 0;
        while (i < j) 
        {
label0:
            {
                MediaRouteDiscoveryRequest mediaroutediscoveryrequest2 = ((ClientRecord)mClients.get(i)).mDiscoveryRequest;
                boolean flag1 = flag;
                MediaRouteDiscoveryRequest mediaroutediscoveryrequest1 = mediaroutediscoveryrequest;
                MediaRouteSelector.Builder builder1 = builder;
                if (mediaroutediscoveryrequest2 == null)
                {
                    break label0;
                }
                if (mediaroutediscoveryrequest2.getSelector().isEmpty())
                {
                    flag1 = flag;
                    mediaroutediscoveryrequest1 = mediaroutediscoveryrequest;
                    builder1 = builder;
                    if (!mediaroutediscoveryrequest2.isActiveScan())
                    {
                        break label0;
                    }
                }
                flag1 = flag | mediaroutediscoveryrequest2.isActiveScan();
                if (mediaroutediscoveryrequest == null)
                {
                    mediaroutediscoveryrequest1 = mediaroutediscoveryrequest2;
                    builder1 = builder;
                } else
                {
                    builder1 = builder;
                    if (builder == null)
                    {
                        builder1 = new MediaRouteSelector.Builder(mediaroutediscoveryrequest.getSelector());
                    }
                    builder1.addSelector(mediaroutediscoveryrequest2.getSelector());
                    mediaroutediscoveryrequest1 = mediaroutediscoveryrequest;
                }
            }
            i++;
            flag = flag1;
            mediaroutediscoveryrequest = mediaroutediscoveryrequest1;
            builder = builder1;
        }
        if (builder != null)
        {
            mediaroutediscoveryrequest = new MediaRouteDiscoveryRequest(builder.build(), flag);
        }
        if (mCompositeDiscoveryRequest != mediaroutediscoveryrequest && (mCompositeDiscoveryRequest == null || !mCompositeDiscoveryRequest.equals(mediaroutediscoveryrequest)))
        {
            mCompositeDiscoveryRequest = mediaroutediscoveryrequest;
            mProvider.setDiscoveryRequest(mediaroutediscoveryrequest);
            return true;
        } else
        {
            return false;
        }
    }

    public MediaRouteProvider getMediaRouteProvider()
    {
        return mProvider;
    }

    public IBinder onBind(Intent intent)
    {
        if (intent.getAction().equals("android.media.MediaRouteProviderService"))
        {
            if (mProvider == null)
            {
                intent = onCreateMediaRouteProvider();
                if (intent != null)
                {
                    String s = intent.getMetadata().getPackageName();
                    if (!s.equals(getPackageName()))
                    {
                        throw new IllegalStateException((new StringBuilder()).append("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ").append(s).append(".  Service package name: ").append(getPackageName()).append(".").toString());
                    }
                    mProvider = intent;
                    mProvider.setCallback(mProviderCallback);
                }
            }
            if (mProvider != null)
            {
                return mReceiveMessenger.getBinder();
            }
        }
        return null;
    }

    public abstract MediaRouteProvider onCreateMediaRouteProvider();





















}
