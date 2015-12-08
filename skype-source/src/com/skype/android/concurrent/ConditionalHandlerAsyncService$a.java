// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import android.os.Handler;
import com.skype.android.util.Conditional;

// Referenced classes of package com.skype.android.concurrent:
//            AsyncCallback, ConditionalHandlerAsyncService, ConditionalAsyncCallback, AsyncResult

private final class b
    implements AsyncCallback
{

    final ConditionalHandlerAsyncService a;
    private AsyncCallback b;
    private AsyncResult c;

    static AsyncCallback a(b b1)
    {
        return b1.b;
    }

    static AsyncResult b(b b1)
    {
        return b1.c;
    }

    final boolean a()
    {
        if (b instanceof ConditionalAsyncCallback)
        {
            return ((ConditionalAsyncCallback)b).a().a();
        } else
        {
            return true;
        }
    }

    public final void done(AsyncResult asyncresult)
    {
        c = asyncresult;
        asyncresult = ConditionalHandlerAsyncService.a(a).obtainMessage(0, this);
        ConditionalHandlerAsyncService.a(a).sendMessage(asyncresult);
    }

    (ConditionalHandlerAsyncService conditionalhandlerasyncservice, AsyncCallback asynccallback)
    {
        a = conditionalhandlerasyncservice;
        super();
        b = asynccallback;
    }
}
