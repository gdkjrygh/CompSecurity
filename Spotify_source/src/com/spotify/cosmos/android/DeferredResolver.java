// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.content.Context;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.spotify.cosmos.android:
//            Resolver, LifeCycleInspector, InternalSubscription, ResolverException

public class DeferredResolver extends Resolver
{

    private final Object mConnectionMutex = new Object();
    private final List mResolverCallbacks = Collections.synchronizedList(new ArrayList());

    protected DeferredResolver(Context context)
    {
        super(context);
        connect();
    }

    private void deliverResolverConnected()
    {
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mResolverCallbacks.iterator(); iterator.hasNext(); ((StateObserver)iterator.next()).onConnected()) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        mResolverCallbacks.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    private void deliverResolverConnectionFailed(Resolver.ConnectionError connectionerror)
    {
        Object obj = mConnectionMutex;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mResolverCallbacks.iterator(); iterator.hasNext(); ((StateObserver)iterator.next()).onConnectionFailed(connectionerror)) { }
        break MISSING_BLOCK_LABEL_49;
        connectionerror;
        obj;
        JVM INSTR monitorexit ;
        throw connectionerror;
        mResolverCallbacks.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    private void registerResolverCallbacks(StateObserver stateobserver)
    {
        if (stateobserver != null)
        {
            synchronized (mConnectionMutex)
            {
                mResolverCallbacks.add(stateobserver);
            }
            return;
        } else
        {
            return;
        }
        stateobserver;
        obj;
        JVM INSTR monitorexit ;
        throw stateobserver;
    }

    public void connect(StateObserver stateobserver)
    {
        if (stateobserver != null)
        {
            registerResolverCallbacks(stateobserver);
        }
        if (isConnected())
        {
            deliverResolverConnected();
        }
        super.connect();
    }

    public void destroy()
    {
        mResolverCallbacks.clear();
        LifeCycleInspector.noteRemoval(this);
        super.destroy();
    }

    protected void notifyOnConnected()
    {
        super.notifyOnConnected();
        deliverResolverConnected();
    }

    protected void notifyOnConnectionFailed(Resolver.ConnectionError connectionerror)
    {
        super.notifyOnConnectionFailed(connectionerror);
        deliverResolverConnectionFailed(connectionerror);
    }

    public Response resolve(Request request)
    {
        return super.resolve(request);
    }

    public boolean resolve(final Request request, final Resolver.CallbackReceiver receiver)
    {
        if (isConnected())
        {
            return super.resolve(request, receiver);
        } else
        {
            registerResolverCallbacks(new StateObserver() {

                final DeferredResolver this$0;
                final Resolver.CallbackReceiver val$receiver;
                final Request val$request;

                public void onConnected()
                {
                    resolve(request, receiver);
                }

                public void onConnectionFailed(Resolver.ConnectionError connectionerror)
                {
                    receiver.sendOnError(new ResolverException(connectionerror.name()));
                }

            
            {
                this$0 = DeferredResolver.this;
                request = request1;
                receiver = callbackreceiver;
                super();
            }
            });
            return true;
        }
    }

    InternalSubscription subscribeInternal(final Request request, final Resolver.CallbackReceiver receiver)
    {
        if (isConnected())
        {
            return new SubscriptionProxy(super.subscribeInternal(request, receiver));
        } else
        {
            final SubscriptionProxy subscription = new SubscriptionProxy(null);
            registerResolverCallbacks(new StateObserver() {

                final DeferredResolver this$0;
                final Resolver.CallbackReceiver val$receiver;
                final Request val$request;
                final SubscriptionProxy val$subscription;

                public void onConnected()
                {
                    subscription.setSubscription(subscribeInternal(request, receiver));
                }

                public void onConnectionFailed(Resolver.ConnectionError connectionerror)
                {
                    receiver.sendOnError(new ResolverException(connectionerror.name()));
                }

            
            {
                this$0 = DeferredResolver.this;
                subscription = subscriptionproxy;
                request = request1;
                receiver = callbackreceiver;
                super();
            }
            });
            return subscription;
        }
    }


    private class StateObserver
    {

        public abstract void onConnected();

        public abstract void onConnectionFailed(Resolver.ConnectionError connectionerror);
    }


    private class SubscriptionProxy
        implements InternalSubscription
    {

        private boolean mShouldUnsubscribe;
        private InternalSubscription mSubscription;

        private boolean hasSubscription()
        {
            return mSubscription != null;
        }

        private void setSubscription(InternalSubscription internalsubscription)
        {
            mSubscription = internalsubscription;
            if (mShouldUnsubscribe)
            {
                unsubscribe();
            }
        }

        public boolean isActive()
        {
            return !mShouldUnsubscribe && (mSubscription == null || mSubscription.isActive());
        }

        public void setDestroyed()
        {
            if (mSubscription != null)
            {
                mSubscription.setDestroyed();
            }
        }

        public boolean unsubscribe()
        {
            if (hasSubscription())
            {
                return mSubscription.unsubscribe();
            } else
            {
                mShouldUnsubscribe = true;
                return false;
            }
        }


        public SubscriptionProxy(InternalSubscription internalsubscription)
        {
            mSubscription = internalsubscription;
        }
    }

}
