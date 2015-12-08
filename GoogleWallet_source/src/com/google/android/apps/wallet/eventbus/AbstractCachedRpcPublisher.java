// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import android.os.SystemClock;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            InitializedEventPublisher, EventBus, RpcCache

public abstract class AbstractCachedRpcPublisher
    implements InitializedEventPublisher
{

    private final ActionExecutor actionExecutor;
    private long cacheExpirationTimeMillis;
    private final long cacheLifetimeMillis;
    private final EventBus eventBus;
    private final RpcCache rpcCache;
    private boolean rpcInFlight;
    private final ThreadChecker threadChecker;

    protected AbstractCachedRpcPublisher(RpcCache rpccache, EventBus eventbus, ActionExecutor actionexecutor, ThreadChecker threadchecker, long l)
    {
        cacheExpirationTimeMillis = 0x8000000000000000L;
        rpcCache = rpccache;
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        threadChecker = threadchecker;
        cacheLifetimeMillis = l;
    }

    private void asyncFetchDataFromServerAndPostEvent()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        if (rpcInFlight)
        {
            return;
        } else
        {
            rpcInFlight = true;
            actionExecutor.executeAction(new Callable() {

                final AbstractCachedRpcPublisher this$0;

                public final Object call()
                    throws Exception
                {
                    return rpcCache.readFromServer();
                }

            
            {
                this$0 = AbstractCachedRpcPublisher.this;
                super();
            }
            }, new AsyncCallback() {

                final AbstractCachedRpcPublisher this$0;

                public final void onFailure(Exception exception)
                {
                    rpcInFlight = false;
                    eventBus.post(buildErrorEvent(exception));
                }

                public final void onSuccess(Object obj)
                {
                    rpcInFlight = false;
                    postAndCacheNewData(obj);
                }

            
            {
                this$0 = AbstractCachedRpcPublisher.this;
                super();
            }
            });
            return;
        }
    }

    private void asyncReadDataFromCacheAndPostEvent()
    {
        final long originalCacheExpirationTimeMillis = cacheExpirationTimeMillis;
        actionExecutor.executeAction(new Callable() {

            final AbstractCachedRpcPublisher this$0;

            public final Object call()
            {
                return rpcCache.readFromCache();
            }

            
            {
                this$0 = AbstractCachedRpcPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final AbstractCachedRpcPublisher this$0;
            final long val$originalCacheExpirationTimeMillis;

            public final void onFailure(Exception exception)
            {
                if (originalCacheExpirationTimeMillis != cacheExpirationTimeMillis)
                {
                    return;
                } else
                {
                    eventBus.post(buildErrorEvent(exception));
                    return;
                }
            }

            public final void onSuccess(Object obj)
            {
                while (originalCacheExpirationTimeMillis != cacheExpirationTimeMillis || obj == null) 
                {
                    return;
                }
                eventBus.post(buildEvent(obj));
            }

            
            {
                this$0 = AbstractCachedRpcPublisher.this;
                originalCacheExpirationTimeMillis = l;
                super();
            }
        });
    }

    private void asyncWriteDataToCache(final Object data)
    {
        actionExecutor.executeAction(new Callable() {

            final AbstractCachedRpcPublisher this$0;
            final Object val$data;

            private Void call()
            {
                rpcCache.writeToCache(data);
                afterWriteToCache();
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = AbstractCachedRpcPublisher.this;
                data = obj;
                super();
            }
        });
    }

    private boolean hasCacheExpired()
    {
        return SystemClock.elapsedRealtime() > cacheExpirationTimeMillis;
    }

    protected void afterWriteToCache()
    {
    }

    protected abstract Object buildErrorEvent(Exception exception);

    protected abstract Object buildEvent(Object obj);

    protected boolean canReadFromCache()
    {
        return true;
    }

    public final void generateAndPostEvent()
    {
        generateAndPostEvent(true);
    }

    protected final void generateAndPostEvent(boolean flag)
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        if (!overrideIfDisabled())
        {
            if (!flag)
            {
                cacheExpirationTimeMillis = 0x8000000000000000L;
            }
            if (!flag || !canReadFromCache())
            {
                asyncFetchDataFromServerAndPostEvent();
                return;
            }
            asyncReadDataFromCacheAndPostEvent();
            if (hasCacheExpired())
            {
                asyncFetchDataFromServerAndPostEvent();
                return;
            }
        }
    }

    public final void generateAndPostEventDontPreserveCache()
    {
        generateAndPostEvent(false);
    }

    protected boolean overrideIfDisabled()
    {
        return false;
    }

    protected final void postAndCacheNewData(Object obj)
    {
        Object obj1 = threadChecker;
        ThreadChecker.checkOnUiThread();
        cacheExpirationTimeMillis = SystemClock.elapsedRealtime() + cacheLifetimeMillis;
        obj1 = buildEvent(obj);
        eventBus.post(obj1);
        asyncWriteDataToCache(obj);
    }





/*
    static boolean access$302(AbstractCachedRpcPublisher abstractcachedrpcpublisher, boolean flag)
    {
        abstractcachedrpcpublisher.rpcInFlight = flag;
        return flag;
    }

*/
}
