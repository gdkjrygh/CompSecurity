// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.util.SparseArray;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.cosmos.android:
//            RemoteNativeRouter

class <init>
    implements ResolveCallback
{

    private mIsCancelled mCallbackReceiver;
    private boolean mIsCancelled;
    final RemoteNativeRouter this$0;

    public void destroy()
    {
        mIsCancelled = true;
    }

    public int getId()
    {
        return mCallbackReceiver.mCallbackReceiver();
    }

    public void onError(Throwable throwable)
    {
        if (!RemoteNativeRouter.access$000(RemoteNativeRouter.this) && !mIsCancelled)
        {
            mCallbackReceiver.mCallbackReceiver(throwable);
        }
    }

    public boolean onResolved(Response response)
    {
        if (!RemoteNativeRouter.access$000(RemoteNativeRouter.this)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (mIsCancelled)
        {
            synchronized (RemoteNativeRouter.access$100(RemoteNativeRouter.this))
            {
                RemoteNativeRouter.access$200(RemoteNativeRouter.this).remove(getId());
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_52;
        exception;
        response;
        JVM INSTR monitorexit ;
        throw exception;
        mCallbackReceiver.mCallbackReceiver(response);
        if (!mIsCancelled)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }


    private ( )
    {
        this$0 = RemoteNativeRouter.this;
        super();
        mCallbackReceiver = ;
        mIsCancelled = false;
    }

    mIsCancelled(mIsCancelled miscancelled, mIsCancelled miscancelled1)
    {
        this(miscancelled);
    }
}
