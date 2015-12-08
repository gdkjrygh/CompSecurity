// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            gi, gb

static final class wk
    implements Callable
{

    final Callable wk;

    public Object call()
        throws Exception
    {
        Object obj;
        try
        {
            Process.setThreadPriority(10);
            obj = wk.call();
        }
        catch (Exception exception)
        {
            gb.e(exception);
            return null;
        }
        return obj;
    }

    (Callable callable)
    {
        wk = callable;
        super();
    }
}
