// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishCallback;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeCallback;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessageWrapper

final class MessagesClientImpl extends GmsClient
{
    private static final class MessageListenerWrapper extends IMessageListener.Stub
    {

        private final MessageListener mListener;

        public final void onMessageFound(MessageWrapper messagewrapper)
            throws RemoteException
        {
            mListener.onFound(messagewrapper.message);
        }

        public final void onMessageLost(MessageWrapper messagewrapper)
            throws RemoteException
        {
            messagewrapper = messagewrapper.message;
        }

        private MessageListenerWrapper(MessageListener messagelistener)
        {
            mListener = messagelistener;
        }

        MessageListenerWrapper(MessageListener messagelistener, byte byte0)
        {
            this(messagelistener);
        }
    }

    private static final class PublishCallbackWrapper extends IPublishCallback.Stub
    {

        private final PublishCallback callback;

        public final void onExpired()
        {
        }


/*
        static PublishCallbackWrapper access$300(PublishCallback publishcallback)
        {
            if (publishcallback == null)
            {
                return null;
            } else
            {
                return new PublishCallbackWrapper(publishcallback);
            }
        }

*/

        private PublishCallbackWrapper(PublishCallback publishcallback)
        {
            callback = publishcallback;
        }
    }

    private static final class StatusCallbackWrapper extends IStatusCallback.Stub
    {

        private final StatusCallback callback;

        public final void onPermissionChanged(boolean flag)
        {
        }

        private StatusCallbackWrapper(StatusCallback statuscallback)
        {
            callback = statuscallback;
        }

        StatusCallbackWrapper(StatusCallback statuscallback, byte byte0)
        {
            this(statuscallback);
        }
    }

    private static final class SubscribeCallbackWrapper extends ISubscribeCallback.Stub
    {

        private final SubscribeCallback callback;

        public final void onExpired()
        {
        }


/*
        static SubscribeCallbackWrapper access$400(SubscribeCallback subscribecallback)
        {
            if (subscribecallback == null)
            {
                return null;
            } else
            {
                return new SubscribeCallbackWrapper(subscribecallback);
            }
        }

*/

        private SubscribeCallbackWrapper(SubscribeCallback subscribecallback)
        {
            callback = subscribecallback;
        }
    }

    private static abstract class WrapperCache
    {

        final SimpleArrayMap mMap;

        protected abstract IBinder createWrapper(Object obj);

        final IBinder getWrapper(Object obj)
        {
            IBinder ibinder;
            if (obj == null)
            {
                ibinder = null;
            } else
            {
                IBinder ibinder2 = (IBinder)mMap.get(obj);
                ibinder = ibinder2;
                if (ibinder2 == null)
                {
                    IBinder ibinder1 = createWrapper(obj);
                    mMap.put(obj, ibinder1);
                    return ibinder1;
                }
            }
            return ibinder;
        }

        private WrapperCache()
        {
            mMap = new SimpleArrayMap(1);
        }

        WrapperCache(byte byte0)
        {
            this();
        }
    }


    final boolean mIsIgnoreNearbyPermission;
    final WrapperCache mMessageListenerCache = new WrapperCache() {

        final MessagesClientImpl this$0;

        protected final volatile IBinder createWrapper(Object obj)
        {
            return new MessageListenerWrapper((MessageListener)obj, (byte)0);
        }

            
            {
                this$0 = MessagesClientImpl.this;
                super((byte)0);
            }
    };
    final String mRealClientPackageName;
    private final WrapperCache mStatusCallbackCache = new WrapperCache() {

        final MessagesClientImpl this$0;

        protected final volatile IBinder createWrapper(Object obj)
        {
            return new StatusCallbackWrapper((StatusCallback)obj, (byte)0);
        }

            
            {
                this$0 = MessagesClientImpl.this;
                super((byte)0);
            }
    };
    final boolean mUseRealClientApiKey;
    final String mZeroPartyPackageName;

    MessagesClientImpl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ClientSettings clientsettings, MessagesOptions messagesoptions)
    {
        super(context, looper, 62, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        mRealClientPackageName = clientsettings.mRealClientPackageName;
        if (messagesoptions != null)
        {
            mZeroPartyPackageName = messagesoptions.zeroPartyPackageName;
            mIsIgnoreNearbyPermission = messagesoptions.isIgnoreNearbyPermission;
            mUseRealClientApiKey = messagesoptions.useRealClientApiKey;
            return;
        } else
        {
            mZeroPartyPackageName = null;
            mIsIgnoreNearbyPermission = false;
            mUseRealClientApiKey = false;
            return;
        }
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return INearbyMessagesService.Stub.asInterface(ibinder);
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }
}
