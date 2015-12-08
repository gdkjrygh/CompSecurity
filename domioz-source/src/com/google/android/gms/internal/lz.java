// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.p;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal:
//            lq, lk, mb, ma, 
//            lu

final class lz extends lq
{

    private final lk a;
    private final ExecutorService b;

    public lz(lk lk1, ExecutorService executorservice)
    {
        a = lk1;
        b = executorservice;
    }

    static p a(lz lz1)
    {
        return lz1.a.d();
    }

    public final void a(String s, String s1, lu lu)
    {
        b.submit(new mb(this, s, s1, lu));
    }

    public final void a(String s, List list, lu lu)
    {
        b.submit(new ma(this, list, s, lu));
    }
}
