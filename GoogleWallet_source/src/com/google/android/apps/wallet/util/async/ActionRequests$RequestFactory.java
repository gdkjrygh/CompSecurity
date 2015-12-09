// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequests

public static final class callbackHandler
{

    private final Handler callbackHandler;

    public final  createMultiRequest(Callable acallable[])
    {
        return new l(acallable, callbackHandler, null);
    }

    public final  createRequest(Callable callable)
    {
        return new it>(callable, callbackHandler, null);
    }

    public (Handler handler)
    {
        callbackHandler = handler;
    }
}
