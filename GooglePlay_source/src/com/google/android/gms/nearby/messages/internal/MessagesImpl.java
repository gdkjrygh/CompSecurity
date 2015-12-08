// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl, MessageWrapper, PublishRequest, NearbyMessagesCallback, 
//            INearbyMessagesService, UnpublishRequest, SubscribeRequest, UnsubscribeRequest

public final class MessagesImpl
    implements Messages
{
    static abstract class StatusMethodImpl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status;
        }

        public StatusMethodImpl(GoogleApiClient googleapiclient)
        {
            super(MessagesImpl.CLIENT_KEY, googleapiclient);
        }
    }


    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

        public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new MessagesClientImpl(context, looper, connectioncallbacks, onconnectionfailedlistener, clientsettings, (MessagesOptions)obj);
        }

        public final int getPriority()
        {
            return 0x7fffffff;
        }

    };
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();

    public MessagesImpl()
    {
    }

    public final PendingResult publish(final GoogleApiClient final_googleapiclient, final Message message, Strategy strategy)
    {
        com.google.android.gms.nearby.messages.PublishOptions.Builder builder = new com.google.android.gms.nearby.messages.PublishOptions.Builder();
        builder.mStrategy = (Strategy)Preconditions.checkNotNull(strategy);
        strategy = builder.build();
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(strategy);
        return final_googleapiclient.execute(new StatusMethodImpl(strategy) {

            final MessagesImpl this$0;
            final Message val$message;
            final PublishOptions val$options;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (MessagesClientImpl)client;
                Object obj = MessageWrapper.create(message);
                PublishOptions publishoptions = options;
                client.checkConnected();
                obj = new PublishRequest(((MessageWrapper) (obj)), publishoptions.mStrategy, NearbyMessagesCallback.withStatus(this), ((MessagesClientImpl) (client)).mZeroPartyPackageName, ((MessagesClientImpl) (client)).mRealClientPackageName, ((MessagesClientImpl) (client)).mIsIgnoreNearbyPermission, MessagesClientImpl.PublishCallbackWrapper.access$300(publishoptions.mCallback), ((MessagesClientImpl) (client)).mUseRealClientApiKey);
                ((INearbyMessagesService)client.getService()).publish(((PublishRequest) (obj)));
            }

            
            {
                this$0 = MessagesImpl.this;
                message = message1;
                options = publishoptions;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult subscribe(final GoogleApiClient final_googleapiclient, final MessageListener listener, Strategy strategy)
    {
        com.google.android.gms.nearby.messages.SubscribeOptions.Builder builder = new com.google.android.gms.nearby.messages.SubscribeOptions.Builder();
        builder.mStrategy = strategy;
        strategy = builder.build();
        Preconditions.checkNotNull(listener);
        Preconditions.checkNotNull(strategy);
        return final_googleapiclient.execute(new StatusMethodImpl(strategy) {

            final MessagesImpl this$0;
            final MessageListener val$listener;
            final SubscribeOptions val$options;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (MessagesClientImpl)client;
                Object obj = listener;
                SubscribeOptions subscribeoptions = options;
                client.checkConnected();
                obj = new SubscribeRequest(((MessagesClientImpl) (client)).mMessageListenerCache.getWrapper(obj), subscribeoptions.mStrategy, NearbyMessagesCallback.withStatus(this), subscribeoptions.mFilter, ((MessagesClientImpl) (client)).mZeroPartyPackageName, ((MessagesClientImpl) (client)).mRealClientPackageName, null, ((MessagesClientImpl) (client)).mIsIgnoreNearbyPermission, MessagesClientImpl.SubscribeCallbackWrapper.access$400(subscribeoptions.mCallback), ((MessagesClientImpl) (client)).mUseRealClientApiKey);
                ((INearbyMessagesService)client.getService()).subscribe(((SubscribeRequest) (obj)));
            }

            
            {
                this$0 = MessagesImpl.this;
                listener = messagelistener;
                options = subscribeoptions;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult unpublish(final GoogleApiClient final_googleapiclient, Message message)
    {
        Preconditions.checkNotNull(message);
        return final_googleapiclient.execute(new StatusMethodImpl(message) {

            final MessagesImpl this$0;
            final Message val$message;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (MessagesClientImpl)client;
                Object obj = MessageWrapper.create(message);
                client.checkConnected();
                obj = new UnpublishRequest(((MessageWrapper) (obj)), NearbyMessagesCallback.withStatus(this), ((MessagesClientImpl) (client)).mZeroPartyPackageName, ((MessagesClientImpl) (client)).mRealClientPackageName, ((MessagesClientImpl) (client)).mUseRealClientApiKey);
                ((INearbyMessagesService)client.getService()).unpublish(((UnpublishRequest) (obj)));
            }

            
            {
                this$0 = MessagesImpl.this;
                message = message1;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult unsubscribe(final GoogleApiClient final_googleapiclient, MessageListener messagelistener)
    {
        Preconditions.checkNotNull(messagelistener);
        return final_googleapiclient.execute(new StatusMethodImpl(messagelistener) {

            final MessagesImpl this$0;
            final MessageListener val$listener;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                Object obj = (MessagesClientImpl)client;
                client = listener;
                ((MessagesClientImpl) (obj)).checkConnected();
                UnsubscribeRequest unsubscriberequest = new UnsubscribeRequest(((MessagesClientImpl) (obj)).mMessageListenerCache.getWrapper(client), NearbyMessagesCallback.withStatus(this), ((MessagesClientImpl) (obj)).mZeroPartyPackageName, ((MessagesClientImpl) (obj)).mRealClientPackageName, ((MessagesClientImpl) (obj)).mUseRealClientApiKey);
                ((INearbyMessagesService)((MessagesClientImpl) (obj)).getService()).unsubscribe(unsubscriberequest);
                obj = ((MessagesClientImpl) (obj)).mMessageListenerCache;
                if (client != null)
                {
                    ((MessagesClientImpl.WrapperCache) (obj)).mMap.remove(client);
                }
            }

            
            {
                this$0 = MessagesImpl.this;
                listener = messagelistener;
                super(final_googleapiclient);
            }
        });
    }

}
