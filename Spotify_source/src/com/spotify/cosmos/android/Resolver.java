// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.common.collect.ImmutableSet;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.spotify.cosmos.android:
//            ResolverException, RemoteNativeRouter, RemoteRouterSubscription, InternalSubscription, 
//            Subscription

public class Resolver
{

    public static final String ACTION_COSMOS_PROXY = "com.spotify.mobile.service.action.COSMOS_PROXY";
    private final Set mConnectionCallbacks = Collections.synchronizedSet(new LinkedHashSet());
    private final Object mConnectionMutex = new Object();
    private final Context mContext;
    private RemoteNativeRouter mRemoteRouter;
    private final InternalServiceConnection mServiceConnection = new InternalServiceConnection();
    private State mState;
    private final Map mSubscriptionCallbacks = new HashMap();
    private final Map mSubscriptions = new HashMap();

    protected Resolver(Context context)
    {
        mState = State.DISCONNECTED;
        mContext = context;
    }

    private void closeAllSubscriptions()
    {
        for (cvh cvh = ImmutableSet.a(mSubscriptionCallbacks.keySet()).a(); cvh.hasNext(); unsubscribe(((Integer)cvh.next()).intValue())) { }
    }

    private void deliverOnConnected(Resolver resolver, ConnectionCallback connectioncallback)
    {
        connectioncallback.onServiceConnected(resolver);
    }

    private void doConnect()
    {
        mState = State.CONNECTING;
        Intent intent = new Intent("com.spotify.mobile.service.action.COSMOS_PROXY");
        intent.setPackage(mContext.getPackageName());
        if (!mContext.bindService(intent, mServiceConnection, 1))
        {
            notifyOnConnectionFailed(ConnectionError.BIND_SERVICE_FAILED);
            mState = State.DISCONNECTED;
        }
    }

    private void doDisconnect()
    {
        closeAllSubscriptions();
        mContext.unbindService(mServiceConnection);
        mRemoteRouter = null;
        mState = State.DISCONNECTED;
    }

    private void notifyOnDisconnected()
    {
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mConnectionCallbacks.iterator(); iterator.hasNext(); ((ConnectionCallback)iterator.next()).onServiceDisconnected(this)) { }
        break MISSING_BLOCK_LABEL_49;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public void connect()
    {
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        class _cls2
        {

            static final int $SwitchMap$com$spotify$cosmos$android$Resolver$State[];

            static 
            {
                $SwitchMap$com$spotify$cosmos$android$Resolver$State = new int[State.values().length];
                try
                {
                    $SwitchMap$com$spotify$cosmos$android$Resolver$State[State.DISCONNECTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$spotify$cosmos$android$Resolver$State[State.CONNECTED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$spotify$cosmos$android$Resolver$State[State.CONNECTING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.spotify.cosmos.android.Resolver.State[mState.ordinal()];
        JVM INSTR tableswitch 1 1: default 51
    //                   1 39;
           goto _L1 _L2
_L1:
        return;
_L2:
        doConnect();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void destroy()
    {
        synchronized (mConnectionMutex)
        {
            mConnectionCallbacks.clear();
        }
        disconnect();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void disconnect()
    {
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        switch (_cls2..SwitchMap.com.spotify.cosmos.android.Resolver.State[mState.ordinal()])
        {
        default:
            mState = State.DISCONNECTED;
            break;

        case 1: // '\001'
            break;

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_50;
        }
_L2:
        return;
        doDisconnect();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean get(String s, CallbackReceiver callbackreceiver)
    {
        return resolve(new Request("GET", s), callbackreceiver);
    }

    public boolean isConnected()
    {
        return mState == State.CONNECTED;
    }

    public boolean isConnecting()
    {
        return mState == State.CONNECTING;
    }

    protected void notifyOnConnected()
    {
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mConnectionCallbacks.iterator(); iterator.hasNext(); deliverOnConnected(this, (ConnectionCallback)iterator.next())) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    protected void notifyOnConnectionFailed(ConnectionError connectionerror)
    {
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mConnectionCallbacks.iterator(); iterator.hasNext(); ((ConnectionCallback)iterator.next()).onServiceConnectionFailed(this, connectionerror)) { }
        break MISSING_BLOCK_LABEL_50;
        connectionerror;
        obj;
        JVM INSTR monitorexit ;
        throw connectionerror;
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean post(String s, CallbackReceiver callbackreceiver)
    {
        return resolve(new Request("POST", s), callbackreceiver);
    }

    public void registerConnectionCallback(ConnectionCallback connectioncallback)
    {
        synchronized (mConnectionMutex)
        {
            mConnectionCallbacks.add(connectioncallback);
            if (isConnected())
            {
                deliverOnConnected(this, connectioncallback);
            }
        }
        return;
        connectioncallback;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallback;
    }

    public Response resolve(Request request)
    {
        AtomicReference atomicreference;
        CountDownLatch countdownlatch = new CountDownLatch(1);
        atomicreference = new AtomicReference();
        AtomicReference atomicreference1 = new AtomicReference();
        if (!resolve(request, ((CallbackReceiver) (new CallbackReceiver(atomicreference1) {
            private class CallbackReceiver
            {

                private static final AtomicInteger ID_GEN = new AtomicInteger(0);
                private final Handler mHandler;
                private final int mId = createId();

                private static int createId()
                {
                    return ID_GEN.getAndIncrement();
                }

                public boolean equals(Object obj)
                {
                    if (this != obj)
                    {
                        if (obj == null || getClass() != obj.getClass())
                        {
                            return false;
                        }
                        if (((CallbackReceiver)obj).mId != mId)
                        {
                            return false;
                        }
                    }
                    return true;
                }

                public final int getId()
                {
                    return mId;
                }

                public int hashCode()
                {
                    return mId;
                }

                public abstract void onError(Throwable throwable);

                public abstract void onResolved(Response response);

                public final void sendOnError(final Throwable error)
                {
                    if (mHandler != null)
                    {
                        mHandler.post(new Runnable() {

                            final CallbackReceiver this$0;
                            final Throwable val$error;

                            public void run()
                            {
                                onError(error);
                            }

                        
                        {
                            this$0 = CallbackReceiver.this;
                            error = throwable;
                            super();
                        }
                        });
                        return;
                    } else
                    {
                        onError(error);
                        return;
                    }
                }

                public final void sendOnResolved(Response response)
                {
                    if (mHandler != null)
                    {
                        class LocalRunnable
                            implements Runnable
                        {

                            private final Response mResponse;
                            final CallbackReceiver this$0;

                            public void run()
                            {
                                onResolved(mResponse);
                            }

                        public LocalRunnable(Response response)
                        {
                            this$0 = CallbackReceiver.this;
                            super();
                            mResponse = response;
                        }
                        }

                        mHandler.post(new LocalRunnable(response));
                        return;
                    } else
                    {
                        onResolved(response);
                        return;
                    }
                }


                public CallbackReceiver(Handler handler)
                {
                    mHandler = handler;
                }
            }


        final Resolver this$0;
        final AtomicReference val$errorRef;
        final CountDownLatch val$latch;
        final AtomicReference val$responseRef;

        protected void onError(Throwable throwable)
        {
            errorRef.set(throwable);
            latch.countDown();
        }

        protected void onResolved(Response response)
        {
            responseRef.set(response);
            latch.countDown();
        }

            
            {
                this$0 = Resolver.this;
                responseRef = atomicreference;
                latch = countdownlatch;
                errorRef = atomicreference1;
                super(final_handler);
            }
    }))))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        try
        {
            countdownlatch.await();
            request = (Throwable)atomicreference1.get();
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            throw new ResolverException(request);
        }
        if (request == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        throw new ResolverException(request);
        request = (Response)atomicreference.get();
        return request;
        throw new ResolverException("Not connect to service");
    }

    public boolean resolve(Request request, CallbackReceiver callbackreceiver)
    {
        if (mRemoteRouter != null)
        {
            int i = mRemoteRouter.resolve(request.getAction(), request.getUri(), request.getHeaders(), request.getBody(), callbackreceiver);
            if (i != -1)
            {
                synchronized (mConnectionMutex)
                {
                    mSubscriptionCallbacks.put(Integer.valueOf(i), callbackreceiver);
                }
            }
        } else
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_71;
        callbackreceiver;
        request;
        JVM INSTR monitorexit ;
        throw callbackreceiver;
        return true;
    }

    public Subscription subscribe(Request request, CallbackReceiver callbackreceiver)
    {
        return subscribeInternal(request, callbackreceiver);
    }

    public Subscription subscribe(String s, CallbackReceiver callbackreceiver)
    {
        return subscribe(new Request("SUB", s), callbackreceiver);
    }

    InternalSubscription subscribeInternal(Request request, CallbackReceiver callbackreceiver)
    {
        if (callbackreceiver == null)
        {
            throw new IllegalArgumentException("Cannot call subscribe with a null receiver");
        }
        if (mRemoteRouter != null)
        {
            int i = mRemoteRouter.subscribe(request.getAction(), request.getUri(), request.getHeaders(), request.getBody(), callbackreceiver);
            RemoteRouterSubscription remoteroutersubscription = new RemoteRouterSubscription(this, i);
            synchronized (mConnectionMutex)
            {
                mSubscriptionCallbacks.put(Integer.valueOf(i), callbackreceiver);
                mSubscriptions.put(Integer.valueOf(i), remoteroutersubscription);
            }
            return remoteroutersubscription;
        } else
        {
            return null;
        }
        callbackreceiver;
        request;
        JVM INSTR monitorexit ;
        throw callbackreceiver;
    }

    public void unregisterConnectionCallback(ConnectionCallback connectioncallback)
    {
        synchronized (mConnectionMutex)
        {
            mConnectionCallbacks.remove(connectioncallback);
        }
        return;
        connectioncallback;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallback;
    }

    boolean unsubscribe(int i)
    {
        mRemoteRouter.unsubscribe(i);
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        InternalSubscription internalsubscription;
        mSubscriptionCallbacks.remove(Integer.valueOf(i));
        internalsubscription = (InternalSubscription)mSubscriptions.remove(Integer.valueOf(i));
        if (internalsubscription == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        internalsubscription.setDestroyed();
        obj;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }




/*
    static State access$102(Resolver resolver, State state)
    {
        resolver.mState = state;
        return state;
    }

*/



/*
    static RemoteNativeRouter access$302(Resolver resolver, RemoteNativeRouter remotenativerouter)
    {
        resolver.mRemoteRouter = remotenativerouter;
        return remotenativerouter;
    }

*/



    private class InternalServiceConnection
        implements ServiceConnection
    {

        final Resolver this$0;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            componentname = ((ComponentName) (mConnectionMutex));
            componentname;
            JVM INSTR monitorenter ;
            if (ibinder == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            if (mState != State.DISCONNECTED)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            doDisconnect();
            componentname;
            JVM INSTR monitorexit ;
            return;
            mRemoteRouter = (RemoteNativeRouter)ibinder;
            mState = State.CONNECTED;
            notifyOnConnected();
            componentname;
            JVM INSTR monitorexit ;
            return;
            ibinder;
            componentname;
            JVM INSTR monitorexit ;
            throw ibinder;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            synchronized (mConnectionMutex)
            {
                closeAllSubscriptions();
                mRemoteRouter = null;
                mState = State.CONNECTING;
                notifyOnDisconnected();
            }
            return;
            exception;
            componentname;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private InternalServiceConnection()
        {
            this$0 = Resolver.this;
            super();
        }

    }


    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State CONNECTED;
        public static final State CONNECTING;
        public static final State DISCONNECTED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/cosmos/android/Resolver$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            CONNECTED = new State("CONNECTED", 0);
            CONNECTING = new State("CONNECTING", 1);
            DISCONNECTED = new State("DISCONNECTED", 2);
            $VALUES = (new State[] {
                CONNECTED, CONNECTING, DISCONNECTED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private class ConnectionCallback
    {

        public abstract void onServiceConnected(Resolver resolver);

        public abstract void onServiceConnectionFailed(Resolver resolver, ConnectionError connectionerror);

        public abstract void onServiceDisconnected(Resolver resolver);
    }


    private class ConnectionError extends Enum
    {

        private static final ConnectionError $VALUES[];
        public static final ConnectionError BIND_SERVICE_FAILED;

        public static ConnectionError valueOf(String s)
        {
            return (ConnectionError)Enum.valueOf(com/spotify/cosmos/android/Resolver$ConnectionError, s);
        }

        public static ConnectionError[] values()
        {
            return (ConnectionError[])$VALUES.clone();
        }

        static 
        {
            BIND_SERVICE_FAILED = new ConnectionError("BIND_SERVICE_FAILED", 0);
            $VALUES = (new ConnectionError[] {
                BIND_SERVICE_FAILED
            });
        }

        private ConnectionError(String s, int i)
        {
            super(s, i);
        }
    }

}
