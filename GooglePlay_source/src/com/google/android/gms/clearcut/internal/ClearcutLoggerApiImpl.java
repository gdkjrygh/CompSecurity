// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import android.content.Context;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.ClearcutLoggerApi;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.protobuf.nano.MessageNano;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            ClearcutLoggerClientImpl, IClearcutLoggerService

public final class ClearcutLoggerApiImpl
    implements ClearcutLoggerApi
{
    public static interface ApiClientMaker
    {

        public abstract GoogleApiClient make(Context context);
    }

    public static final class ApiClientMakerImpl
        implements ApiClientMaker
    {

        public final GoogleApiClient make(Context context)
        {
            return (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addApi(ClearcutLogger.API).build();
        }

        public ApiClientMakerImpl()
        {
        }
    }

    static abstract class BaseClearcutLoggerApiMethodImpl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    {

        public BaseClearcutLoggerApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(ClearcutLogger.CLIENT_KEY, googleapiclient);
        }
    }

    final class MethodImpl extends BaseClearcutLoggerApiMethodImpl
    {

        private final LogEventParcelable mLogEvent;
        final ClearcutLoggerApiImpl this$0;

        protected final volatile Result createFailedResult(Status status)
        {
            return status;
        }

        protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            client = (ClearcutLoggerClientImpl)client;
            IClearcutLoggerCallbacks.Stub stub = new IClearcutLoggerCallbacks.Stub() {

                final MethodImpl this$1;

                public final void onLogEvent(Status status)
                {
                    setResult(status);
                }

            
            {
                this$1 = MethodImpl.this;
                super();
            }
            };
            LogEventParcelable logeventparcelable;
            try
            {
                ClearcutLoggerApiImpl.access$800(mLogEvent);
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.common.api.Api.Client client)
            {
                Log.e("ClearcutLoggerApiImpl", (new StringBuilder("MessageNanoProducer ")).append(mLogEvent.extensionProducer.toString()).append(" threw: ").append(client.toString()).toString());
                return;
            }
            logeventparcelable = mLogEvent;
            ((IClearcutLoggerService)client.getService()).logEvent(stub, logeventparcelable);
        }

        public final boolean equals(Object obj)
        {
            if (!(obj instanceof MethodImpl))
            {
                return false;
            } else
            {
                obj = (MethodImpl)obj;
                return mLogEvent.equals(((MethodImpl) (obj)).mLogEvent);
            }
        }

        public final String toString()
        {
            return (new StringBuilder("MethodImpl(")).append(mLogEvent).append(")").toString();
        }

        MethodImpl(LogEventParcelable logeventparcelable, GoogleApiClient googleapiclient)
        {
            this$0 = ClearcutLoggerApiImpl.this;
            super(googleapiclient);
            mLogEvent = logeventparcelable;
        }
    }

    private static final class QueueLength
    {

        private int mSize;

        public final void decrement()
        {
            this;
            JVM INSTR monitorenter ;
            if (mSize == 0)
            {
                throw new RuntimeException("too many decrements");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            mSize = mSize - 1;
            if (mSize == 0)
            {
                notifyAll();
            }
            this;
            JVM INSTR monitorexit ;
        }

        public final void increment()
        {
            this;
            JVM INSTR monitorenter ;
            mSize = mSize + 1;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        private QueueLength()
        {
            mSize = 0;
        }

        QueueLength(byte byte0)
        {
            this();
        }
    }


    private static final long MANAGED_API_CLIENT_IDLE_MILLIS;
    private static ScheduledExecutorService mExecutor;
    private static final Object mExecutorLock = new Object();
    private static final QueueLength sQueueLength = new QueueLength((byte)0);
    private final Runnable DISCONNECTOR;
    private GoogleApiClient mApiClient;
    private final ApiClientMaker mApiClientMaker;
    private final Clock mClock;
    private final long mDisconnectTimeMillis;
    private ScheduledFuture mManagedApiClientDisconnect;
    private final Object mManagedApiClientLock;
    private long mMinimumTimeToDisconnectMillis;

    public ClearcutLoggerApiImpl()
    {
        this(((Clock) (new DefaultClock())), MANAGED_API_CLIENT_IDLE_MILLIS, ((ApiClientMaker) (new ApiClientMakerImpl())));
    }

    private ClearcutLoggerApiImpl(Clock clock, long l, ApiClientMaker apiclientmaker)
    {
        mManagedApiClientLock = new Object();
        mMinimumTimeToDisconnectMillis = 0L;
        mManagedApiClientDisconnect = null;
        mApiClient = null;
        DISCONNECTOR = new Runnable() {

            final ClearcutLoggerApiImpl this$0;

            public final void run()
            {
                synchronized (mManagedApiClientLock)
                {
                    if (mMinimumTimeToDisconnectMillis <= mClock.elapsedRealtime() && mApiClient != null)
                    {
                        Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
                        mApiClient.disconnect();
                        mApiClient;
                    }
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = ClearcutLoggerApiImpl.this;
                super();
            }
        };
        mClock = clock;
        mDisconnectTimeMillis = l;
        mApiClientMaker = apiclientmaker;
    }

    private ScheduledExecutorService getExecutor()
    {
        synchronized (mExecutorLock)
        {
            if (mExecutor == null)
            {
                mExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {

                    final ClearcutLoggerApiImpl this$0;

                    public final Thread newThread(Runnable runnable)
                    {
                        return new Thread(runnable. new Runnable() {

                            final _cls2 this$1;
                            final Runnable val$r;

                            public final void run()
                            {
                                Process.setThreadPriority(10);
                                r.run();
                            }

            
            {
                this$1 = final__pcls2;
                r = Runnable.this;
                super();
            }
                        });
                    }

            
            {
                this$0 = ClearcutLoggerApiImpl.this;
                super();
            }
                });
            }
        }
        return mExecutor;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final PendingResult logEventAsync(final Context apiClient, final LogEventParcelable pendingResult)
    {
        synchronized (mManagedApiClientLock)
        {
            if (mApiClient == null)
            {
                mApiClient = mApiClientMaker.make(apiClient);
                mApiClient.connect();
            }
            mMinimumTimeToDisconnectMillis = mClock.elapsedRealtime() + mDisconnectTimeMillis;
            if (mManagedApiClientDisconnect != null)
            {
                mManagedApiClientDisconnect.cancel(false);
            }
            mManagedApiClientDisconnect = getExecutor().schedule(DISCONNECTOR, mDisconnectTimeMillis, TimeUnit.MILLISECONDS);
            apiClient = mApiClient;
            sQueueLength.increment();
            pendingResult = new MethodImpl(pendingResult, apiClient);
            pendingResult.addStatusListener(new com.google.android.gms.common.api.PendingResult.StatusListener() {

                final ClearcutLoggerApiImpl this$0;

                public final void onComplete(Status status)
                {
                    ClearcutLoggerApiImpl.sQueueLength.decrement();
                }

            
            {
                this$0 = ClearcutLoggerApiImpl.this;
                super();
            }
            });
            getExecutor().execute(new Runnable() {

                final ClearcutLoggerApiImpl this$0;
                final GoogleApiClient val$apiClient;
                final BaseClearcutLoggerApiMethodImpl val$pendingResult;

                public final void run()
                {
                    apiClient.enqueue(pendingResult);
                }

            
            {
                this$0 = ClearcutLoggerApiImpl.this;
                apiClient = googleapiclient;
                pendingResult = baseclearcutloggerapimethodimpl;
                super();
            }
            });
        }
        return pendingResult;
        apiClient;
        obj;
        JVM INSTR monitorexit ;
        throw apiClient;
    }

    static 
    {
        MANAGED_API_CLIENT_IDLE_MILLIS = TimeUnit.MILLISECONDS.convert(2L, TimeUnit.MINUTES);
    }






/*
    static GoogleApiClient access$402$795ae0f9(ClearcutLoggerApiImpl clearcutloggerapiimpl)
    {
        clearcutloggerapiimpl.mApiClient = null;
        return null;
    }

*/



/*
    static void access$800(LogEventParcelable logeventparcelable)
    {
        if (logeventparcelable.extensionProducer != null && logeventparcelable.logEvent.sourceExtension.length == 0)
        {
            logeventparcelable.logEvent.sourceExtension = logeventparcelable.extensionProducer.toProtoBytes();
        }
        if (logeventparcelable.clientVisualElementsProducer != null && logeventparcelable.logEvent.clientVe.length == 0)
        {
            logeventparcelable.logEvent.clientVe = logeventparcelable.clientVisualElementsProducer.toProtoBytes();
        }
        logeventparcelable.logEventBytes = MessageNano.toByteArray(logeventparcelable.logEvent);
        return;
    }

*/
}
