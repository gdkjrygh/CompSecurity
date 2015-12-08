// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.os.Binder;
import android.util.SparseArray;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Router;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.spotify.cosmos.android:
//            Router, ResolverException

public class RemoteNativeRouter extends Binder
    implements com.spotify.cosmos.android.Router
{

    public static final int INVALID_SUBSCRIPTION_ID = -1;
    private static final String TAG = com/spotify/cosmos/android/RemoteNativeRouter.getSimpleName();
    private final Router mNativeRouter;
    private boolean mRouterDestroyed;
    private final Object mSubscriptionMutex;
    private final SparseArray mSubscriptions;

    public RemoteNativeRouter()
    {
        mSubscriptions = new SparseArray();
        mSubscriptionMutex = new Object();
        mRouterDestroyed = false;
        mNativeRouter = new NativeRouter();
    }

    public RemoteNativeRouter(Router router)
    {
        mSubscriptions = new SparseArray();
        mSubscriptionMutex = new Object();
        mRouterDestroyed = false;
        mNativeRouter = router;
    }

    private void checkCallbackCollision(int i, String s)
    {
        Object obj = (SubscriptionResolveCallback)mSubscriptions.get(i);
        if (obj != null)
        {
            Locale locale = Locale.US;
            if (((SubscriptionResolveCallback) (obj)).mCallbackReceiver != null)
            {
                obj = ((SubscriptionResolveCallback) (obj)).mCallbackReceiver.getClass();
            } else
            {
                obj = "null";
            }
            s = String.format(locale, "Callback for %s overrides existed callback { id = %d, receiver = %s } ", new Object[] {
                s, Integer.valueOf(i), obj
            });
            Logger.c(TAG, new Object[] {
                "Callback ID collision", new ResolverException(s)
            });
        }
    }

    public void destroy()
    {
        if (mRouterDestroyed)
        {
            throw new IllegalStateException("Router already destroyed");
        }
        Object obj = mSubscriptionMutex;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        SubscriptionResolveCallback subscriptionresolvecallback;
        if (i >= mSubscriptions.size())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        int j = mSubscriptions.keyAt(i);
        subscriptionresolvecallback = (SubscriptionResolveCallback)mSubscriptions.get(j);
        if (subscriptionresolvecallback == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        subscriptionresolvecallback.destroy();
        break MISSING_BLOCK_LABEL_100;
        mSubscriptions.clear();
        obj;
        JVM INSTR monitorexit ;
        mNativeRouter.destroy();
        mRouterDestroyed = true;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Router getNativeRouter()
    {
        return mNativeRouter;
    }

    public int resolve(String s, String s1, Map map, byte abyte0[], Resolver.CallbackReceiver callbackreceiver)
    {
        if (mRouterDestroyed)
        {
            throw new IllegalStateException("Router already destroyed");
        }
        map = new Request(s, s1, map, abyte0);
        int i;
        if (callbackreceiver == null)
        {
            s = new NullResolveCallback();
        } else
        {
            s = new CancellingResolveCallback(callbackreceiver);
        }
        i = s.getId();
        if (i != -1)
        {
            synchronized (mSubscriptionMutex)
            {
                checkCallbackCollision(i, s1);
                mSubscriptions.put(i, s);
            }
        }
        mNativeRouter.resolve(map, new WeakResolveCallbackWrapper(s));
        return i;
        s;
        abyte0;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int subscribe(String s, String s1, Map map, byte abyte0[], Resolver.CallbackReceiver callbackreceiver)
    {
        if (mRouterDestroyed)
        {
            throw new IllegalStateException("Router already destroyed");
        }
        if (callbackreceiver == null)
        {
            throw new IllegalArgumentException("Cannot call subscribe with null callback receiver");
        }
        s = new Request(s, s1, map, abyte0);
        abyte0 = new SubscriptionResolveCallback(callbackreceiver);
        int i = abyte0.getId();
        synchronized (mSubscriptionMutex)
        {
            checkCallbackCollision(i, s1);
            mSubscriptions.put(i, abyte0);
        }
        mNativeRouter.resolve(s, new WeakResolveCallbackWrapper(abyte0));
        return i;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void unsubscribe(int i)
    {
        if (i == -1)
        {
            return;
        }
        Object obj = mSubscriptionMutex;
        obj;
        JVM INSTR monitorenter ;
        SubscriptionResolveCallback subscriptionresolvecallback = (SubscriptionResolveCallback)mSubscriptions.get(i);
        if (subscriptionresolvecallback == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        subscriptionresolvecallback.destroy();
        mSubscriptions.remove(i);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }





    private class SubscriptionResolveCallback
        implements ResolveCallback
    {

        private Resolver.CallbackReceiver mCallbackReceiver;
        private boolean mIsCancelled;
        final RemoteNativeRouter this$0;

        public void destroy()
        {
            mIsCancelled = true;
        }

        public int getId()
        {
            return mCallbackReceiver.getId();
        }

        public void onError(Throwable throwable)
        {
            if (!mRouterDestroyed && !mIsCancelled)
            {
                mCallbackReceiver.sendOnError(throwable);
            }
        }

        public boolean onResolved(Response response)
        {
            if (!mRouterDestroyed) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            if (mIsCancelled)
            {
                synchronized (mSubscriptionMutex)
                {
                    mSubscriptions.remove(getId());
                }
                return false;
            }
            break MISSING_BLOCK_LABEL_52;
            exception;
            response;
            JVM INSTR monitorexit ;
            throw exception;
            mCallbackReceiver.sendOnResolved(response);
            if (!mIsCancelled)
            {
                return true;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }


        private SubscriptionResolveCallback(Resolver.CallbackReceiver callbackreceiver)
        {
            this$0 = RemoteNativeRouter.this;
            super();
            mCallbackReceiver = callbackreceiver;
            mIsCancelled = false;
        }

    }


    private class NullResolveCallback extends SubscriptionResolveCallback
    {

        final RemoteNativeRouter this$0;

        public int getId()
        {
            return -1;
        }

        public void onError(Throwable throwable)
        {
        }

        public boolean onResolved(Response response)
        {
            return false;
        }

        public NullResolveCallback()
        {
            this$0 = RemoteNativeRouter.this;
            super(null);
        }
    }


    private class WeakResolveCallbackWrapper
        implements ResolveCallback
    {

        private final WeakReference mRef;

        public void onError(Throwable throwable)
        {
            ResolveCallback resolvecallback = (ResolveCallback)mRef.get();
            if (resolvecallback != null)
            {
                resolvecallback.onError(throwable);
            }
        }

        public boolean onResolved(Response response)
        {
            ResolveCallback resolvecallback = (ResolveCallback)mRef.get();
            if (resolvecallback != null)
            {
                boolean flag;
                try
                {
                    flag = resolvecallback.onResolved(response);
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Assertion.a("Caught an Exception in ResolveCallback.onResolved", response);
                    return false;
                }
                if (flag)
                {
                    return true;
                }
            }
            return false;
        }

        public WeakResolveCallbackWrapper(ResolveCallback resolvecallback)
        {
            mRef = new WeakReference(resolvecallback);
        }
    }


    private class CancellingResolveCallback extends SubscriptionResolveCallback
    {

        final RemoteNativeRouter this$0;

        public boolean onResolved(Response response)
        {
            if (super.onResolved(response))
            {
                unsubscribe(getId());
            }
            return false;
        }

        private CancellingResolveCallback(Resolver.CallbackReceiver callbackreceiver)
        {
            this$0 = RemoteNativeRouter.this;
            super(callbackreceiver);
        }

    }

}
