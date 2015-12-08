// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import com.skype.android.util.Conditional;

// Referenced classes of package com.skype.android.concurrent:
//            AsyncCallback, AsyncResult

public class ConditionalAsyncCallback
    implements AsyncCallback
{

    private Conditional a;
    private AsyncCallback b;

    public ConditionalAsyncCallback(Conditional conditional, AsyncCallback asynccallback)
    {
        if (conditional == null)
        {
            throw new IllegalArgumentException("null conditional");
        } else
        {
            a = conditional;
            b = asynccallback;
            return;
        }
    }

    public final Conditional a()
    {
        return a;
    }

    public void done(AsyncResult asyncresult)
    {
        if (b != null && a.a())
        {
            b.done(asyncresult);
        }
    }
}
