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

        public final void binderDied()
        {
            mPrivateHandler.obtainMessage(1, mMessenger).sendToTarget();
        }

        public final boolean createRouteController(String s, int i)
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

        public final void dispose()
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

        public final MediaRouteProvider.RouteController getRouteController(int i)
        {
            return (MediaRouteProvider.RouteController)mControllers.get(i);
        }

        public final boolean hasMessenger(Messenger messenger)
        {
            return mMessenger.getBinder() == messenger.getBinder();
        }

        public final boolean register()
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

        public final boolean releaseRouteController(int i)
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

        public final boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
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

        public final String toString()
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

        public final void handleMessage(Message message)
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

        PrivateHandler(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class ProviderCallback extends MediaRouteProvider.Callback
    {

        final MediaRouteProviderService this$0;

        public final void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            sendDescriptorChanged(mediarouteproviderdescriptor);
        }

        private ProviderCallback()
        {
            this$0 = MediaRouteProviderService.this;
            super();
        }

        ProviderCallback(_cls1 _pcls1)
        {
            this();
        }
    }

    private static final class ReceiveHandler extends Handler
    {

        private final WeakReference mServiceRef;

        private boolean processMessage(int i, Messenger messenger, int j, int k, Object obj, Bundle bundle)
        {
            MediaRouteProviderService mediarouteproviderservice;
            boolean flag;
            flag = false;
            mediarouteproviderservice = (MediaRouteProviderService)mServiceRef.get();
            if (mediarouteproviderservice == null) goto _L2; else goto _L1
_L1:
            i;
            JVM INSTR tableswitch 1 10: default 76
        //                       1 78
        //                       2 88
        //                       3 96
        //                       4 122
        //                       5 132
        //                       6 142
        //                       7 173
        //                       8 197
        //                       9 221
        //                       10 244;
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
            if (bundle == null)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = bundle.getInt("unselectReason", 0);
            }
            return mediarouteproviderservice.onUnselectRoute(messenger, j, k, i);
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

        public final void handleMessage(Message message)
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
                        (new StringBuilder()).append(MediaRouteProviderService.getClientId(messenger)).append(": Message failed, what=").append(i).append(", requestId=").append(j).append(", arg=").append(k).append(", obj=").append(obj).append(", data=").append(message);
                    }
                    MediaRouteProviderService.sendGenericFailure(messenger, j);
                }
                return;
            } else
            {
                boolean _tmp = MediaRouteProviderService.DEBUG;
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
    private final PrivateHandler mPrivateHandler = new PrivateHandler(null);
    private MediaRouteProvider mProvider;
    private final ProviderCallback mProviderCallback = new ProviderCallback(null);
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
        return (new StringBuilder("Client connection ")).append(messenger.getBinder().toString()).toString();
    }

    private void onBinderDied(Messenger messenger)
    {
        int i = findClient(messenger);
        if (i >= 0)
        {
            messenger = (ClientRecord)mClients.remove(i);
            if (DEBUG)
            {
                (new StringBuilder()).append(messenger).append(": Binder died");
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
                (new StringBuilder()).append(clientrecord).append(": Route controller created, controllerId=").append(j).append(", routeId=").append(s);
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
        if (j > 0 && findClient(messenger) < 0)
        {
            ClientRecord clientrecord = new ClientRecord(messenger, j);
            if (clientrecord.register())
            {
                mClients.add(clientrecord);
                if (DEBUG)
                {
                    (new StringBuilder()).append(clientrecord).append(": Registered, version=").append(j);
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
                (new StringBuilder()).append(clientrecord).append(": Route controller released, controllerId=").append(j);
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
                _cls1 _lcls1 = null;
                if (requestId != 0)
                {
                    _lcls1 = new _cls1();
                }
                if (routecontroller.onControlRequest(intent, _lcls1))
                {
                    if (DEBUG)
                    {
                        (new StringBuilder()).append(client).append(": Route control request delivered, controllerId=").append(controllerId).append(", intent=").append(intent);
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
                    (new StringBuilder()).append(clientrecord).append(": Route selected, controllerId=").append(j);
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
                (new StringBuilder()).append(clientrecord).append(": Set discovery request, request=").append(mediaroutediscoveryrequest).append(", actuallyChanged=").append(flag).append(", compositeDiscoveryRequest=").append(mCompositeDiscoveryRequest);
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
                    (new StringBuilder()).append(clientrecord).append(": Route volume changed, controllerId=").append(j).append(", volume=").append(k);
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
                (new StringBuilder()).append(clientrecord).append(": Unregistered");
            }
            clientrecord.dispose();
            sendGenericSuccess(messenger, i);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean onUnselectRoute(Messenger messenger, int i, int j, int k)
    {
        ClientRecord clientrecord = getClient(messenger);
        if (clientrecord != null)
        {
            MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
            if (routecontroller != null)
            {
                routecontroller.onUnselect(k);
                if (DEBUG)
                {
                    (new StringBuilder()).append(clientrecord).append(": Route unselected, controllerId=").append(j);
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
                    (new StringBuilder()).append(clientrecord).append(": Route volume updated, controllerId=").append(j).append(", delta=").append(k);
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
                (new StringBuilder()).append(clientrecord).append(": Sent descriptor change event, descriptor=").append(mediarouteproviderdescriptor);
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
            (new StringBuilder("Could not send message to ")).append(getClientId(messenger));
        }
    }

    private boolean updateCompositeDiscoveryRequest()
    {
        Object obj1 = null;
        int j = mClients.size();
        int i = 0;
        boolean flag = false;
        Object obj = null;
        while (i < j) 
        {
            Object obj2 = ((ClientRecord)mClients.get(i)).mDiscoveryRequest;
            if (obj2 != null && (!((MediaRouteDiscoveryRequest) (obj2)).getSelector().isEmpty() || ((MediaRouteDiscoveryRequest) (obj2)).isActiveScan()))
            {
                flag = ((MediaRouteDiscoveryRequest) (obj2)).isActiveScan() | flag;
                if (obj == null)
                {
                    obj = obj1;
                    obj1 = obj2;
                } else
                {
                    if (obj1 == null)
                    {
                        obj1 = new MediaRouteSelector.Builder(((MediaRouteDiscoveryRequest) (obj)).getSelector());
                    }
                    ((MediaRouteSelector.Builder) (obj1)).addSelector(((MediaRouteDiscoveryRequest) (obj2)).getSelector());
                    obj2 = obj;
                    obj = obj1;
                    obj1 = obj2;
                }
            } else
            {
                Object obj3 = obj;
                obj = obj1;
                obj1 = obj3;
            }
            i++;
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        if (obj1 != null)
        {
            obj = new MediaRouteDiscoveryRequest(((MediaRouteSelector.Builder) (obj1)).build(), flag);
        }
        if (mCompositeDiscoveryRequest != obj && (mCompositeDiscoveryRequest == null || !mCompositeDiscoveryRequest.equals(obj)))
        {
            mCompositeDiscoveryRequest = ((MediaRouteDiscoveryRequest) (obj));
            mProvider.setDiscoveryRequest(((MediaRouteDiscoveryRequest) (obj)));
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
                        throw new IllegalStateException((new StringBuilder("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ")).append(s).append(".  Service package name: ").append(getPackageName()).append(".").toString());
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






















    private class _cls1 extends MediaRouter.ControlRequestCallback
    {

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
                    (new StringBuilder()).append(client).append(": Route control request failed, controllerId=").append(controllerId).append(", intent=").append(intent).append(", error=").append(s).append(", data=").append(bundle);
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
                (new StringBuilder()).append(client).append(": Route control request succeeded, controllerId=").append(controllerId).append(", intent=").append(intent).append(", data=").append(bundle);
            }
            if (findClient(messenger) >= 0)
            {
                MediaRouteProviderService.sendReply(messenger, 3, requestId, 0, bundle, null);
            }
        }

        _cls1()
        {
            this$0 = MediaRouteProviderService.this;
            client = clientrecord;
            controllerId = i;
            intent = intent1;
            messenger = messenger1;
            requestId = j;
            super();
        }
    }

}
