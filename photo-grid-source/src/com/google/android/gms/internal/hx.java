// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal:
//            wp, hy, tj, hz, 
//            vo, xm

public final class hx
    implements wp
{

    private final Executor a;

    public hx(Handler handler)
    {
        a = new hy(this, handler);
    }

    public final void a(tj tj1, vo vo1)
    {
        a(tj1, vo1, null);
    }

    public final void a(tj tj1, vo vo1, Runnable runnable)
    {
        tj1.l();
        tj1.a("post-response");
        a.execute(new hz(this, tj1, vo1, runnable));
    }

    public final void a(tj tj1, xm xm)
    {
        tj1.a("post-error");
        xm = vo.a(xm);
        a.execute(new hz(this, tj1, xm, null));
    }
}
