// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            l, k, ap

public final class r extends l
{

    final k e;

    public r(k k1)
    {
        e = k1;
        super(k1, 0, null);
    }

    protected final boolean a()
    {
        if (k.c(e))
        {
            boolean flag;
            if (k.d(e) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ap.a(flag, "mConnectionProgressReportCallbacks should not be null if mReportProgress");
            k.d(e).a();
            return true;
        } else
        {
            e.d();
            return true;
        }
    }
}
