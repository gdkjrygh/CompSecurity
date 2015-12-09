// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class mHandler
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
            if (((ment)obj).mId != mId)
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

                final Resolver.CallbackReceiver this$0;
                final Throwable val$error;

                public void run()
                {
                    onError(error);
                }

            
            {
                this$0 = Resolver.CallbackReceiver.this;
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
                final Resolver.CallbackReceiver this$0;

                public void run()
                {
                    onResolved(mResponse);
                }

            public LocalRunnable(Response response)
            {
                this$0 = Resolver.CallbackReceiver.this;
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


    public _cls1.val.error(Handler handler)
    {
        mHandler = handler;
    }
}
