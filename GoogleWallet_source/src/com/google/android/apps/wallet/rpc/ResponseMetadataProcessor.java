// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.wallet.rpc:
//            RpcRejectionProcessedEvent, MetadataRejectionException

public class ResponseMetadataProcessor
{
    static final class Response
    {

        public long mRequestBeginTimeMillis;
        public com.google.wallet.proto.NanoWalletTransport.ResponseMetadata mResponseMetadata;

        public Response(com.google.wallet.proto.NanoWalletTransport.ResponseMetadata responsemetadata, long l)
        {
            mResponseMetadata = responsemetadata;
            mRequestBeginTimeMillis = l;
        }
    }

    public static interface RpcRejectionObserver
    {

        public abstract void onUpdate(com.google.wallet.proto.NanoWalletTransport.ResponseMetadata responsemetadata);
    }


    private static final String TAG = com/google/android/apps/wallet/rpc/ResponseMetadataProcessor.getSimpleName();
    private final AppControl mAppControl;
    private final AtomicBoolean mCurrentlyHandlingError = new AtomicBoolean(false);
    private final EventBus mEventBus;
    private volatile long mLastFinishedProcessingMillis;
    private final Handler mMainThreadHandler;
    private volatile Optional mRpcRejectionObserver;
    private volatile Optional mUnprocessedResponse;
    private final SharedPreferences sharedPreferences;

    ResponseMetadataProcessor(AppControl appcontrol, Handler handler, EventBus eventbus, SharedPreferences sharedpreferences)
    {
        mRpcRejectionObserver = Optional.absent();
        mUnprocessedResponse = Optional.absent();
        mLastFinishedProcessingMillis = 0L;
        mAppControl = appcontrol;
        mMainThreadHandler = handler;
        mEventBus = eventbus;
        sharedPreferences = sharedpreferences;
    }

    private void fireRpcRejectionObserverIfNeeded()
    {
        if (mRpcRejectionObserver.isPresent() && mUnprocessedResponse.isPresent())
        {
            boolean flag;
            if (((Response)mUnprocessedResponse.get()).mRequestBeginTimeMillis < mLastFinishedProcessingMillis)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && ((Response)mUnprocessedResponse.get()).mResponseMetadata.rejections.length != 0 && mCurrentlyHandlingError.compareAndSet(false, true))
            {
                WLog.d(TAG, "Firing rpc rejection handler.");
                ((RpcRejectionObserver)mRpcRejectionObserver.get()).onUpdate(((Response)mUnprocessedResponse.get()).mResponseMetadata);
                return;
            }
        }
    }

    public final void clearRpcRejectionObserver()
    {
        ThreadPreconditions.checkOnUiThread();
        WLog.d(TAG, "Clearing rpc rejection observer.");
        mRpcRejectionObserver = Optional.absent();
    }

    public final void onMetadataProcessed()
    {
        ThreadPreconditions.checkOnUiThread();
        mUnprocessedResponse = Optional.absent();
        mLastFinishedProcessingMillis = SystemClock.elapsedRealtime();
        mCurrentlyHandlingError.set(false);
        mEventBus.post(new RpcRejectionProcessedEvent());
    }

    public final void processMetadata(final Optional responseMetadataOptional, final long requestBeginTimeMillis)
        throws MetadataRejectionException
    {
        mMainThreadHandler.post(new Runnable() {

            final ResponseMetadataProcessor this$0;
            final long val$requestBeginTimeMillis;
            final Optional val$responseMetadataOptional;

            public final void run()
            {
                if (!mAppControl.getBoolean(AppControlKey.RESPONSE_METADATA_HANDLING))
                {
                    return;
                }
                if (responseMetadataOptional.isPresent())
                {
                    Response response = new Response((com.google.wallet.proto.NanoWalletTransport.ResponseMetadata)responseMetadataOptional.get(), requestBeginTimeMillis);
                    mUnprocessedResponse = Optional.of(response);
                } else
                {
                    mUnprocessedResponse = Optional.absent();
                }
                fireRpcRejectionObserverIfNeeded();
            }

            
            {
                this$0 = ResponseMetadataProcessor.this;
                responseMetadataOptional = optional;
                requestBeginTimeMillis = l;
                super();
            }
        });
        if (responseMetadataOptional.isPresent())
        {
            responseMetadataOptional = (com.google.wallet.proto.NanoWalletTransport.ResponseMetadata)responseMetadataOptional.get();
            if (((com.google.wallet.proto.NanoWalletTransport.ResponseMetadata) (responseMetadataOptional)).profileToken != null)
            {
                SharedPreference.PROFILE_TOKEN.put(sharedPreferences, com.google.wallet.proto.NanoWalletTransport.ProfileToken.toByteArray(((com.google.wallet.proto.NanoWalletTransport.ResponseMetadata) (responseMetadataOptional)).profileToken));
            }
            if (((com.google.wallet.proto.NanoWalletTransport.ResponseMetadata) (responseMetadataOptional)).rejections.length > 0)
            {
                responseMetadataOptional = Iterables.transform(Arrays.asList(((com.google.wallet.proto.NanoWalletTransport.ResponseMetadata) (responseMetadataOptional)).rejections), new Function() {

                    final ResponseMetadataProcessor this$0;

                    private static Integer apply(com.google.wallet.proto.NanoWalletTransport.ResponseMetadata.RejectedRequestInfo rejectedrequestinfo)
                    {
                        return rejectedrequestinfo.reason;
                    }

                    public final volatile Object apply(Object obj)
                    {
                        return apply((com.google.wallet.proto.NanoWalletTransport.ResponseMetadata.RejectedRequestInfo)obj);
                    }

            
            {
                this$0 = ResponseMetadataProcessor.this;
                super();
            }
                });
                throw new MetadataRejectionException(Joiner.on(',').join(responseMetadataOptional));
            }
        }
    }

    public final void registerRpcRejectionObserver(RpcRejectionObserver rpcrejectionobserver)
    {
        ThreadPreconditions.checkOnUiThread();
        WLog.d(TAG, "Registering RPC Rejection handler for RPC Response Metadata.");
        mRpcRejectionObserver = Optional.of(rpcrejectionobserver);
        fireRpcRejectionObserverIfNeeded();
    }




/*
    static Optional access$102(ResponseMetadataProcessor responsemetadataprocessor, Optional optional)
    {
        responsemetadataprocessor.mUnprocessedResponse = optional;
        return optional;
    }

*/

}
