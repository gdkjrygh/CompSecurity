// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;


// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequests

final class val.exception
    implements Runnable
{

    final val.exception this$0;
    final Exception val$exception;
    final Object val$result;

    public final void run()
    {
        mplete(val$result, val$exception);
    }

    ()
    {
        this$0 = final_;
        val$result = obj;
        val$exception = Exception.this;
        super();
    }
}
