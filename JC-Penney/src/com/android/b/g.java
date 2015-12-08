// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.b:
//            y, h, q, v, 
//            i, ac

public class g
    implements y
{

    private final Executor a;

    public g(Handler handler)
    {
        a = new h(this, handler);
    }

    public void a(q q1, ac ac)
    {
        q1.a("post-error");
        ac = v.a(ac);
        a.execute(new i(this, q1, ac, null));
    }

    public void a(q q1, v v1)
    {
        a(q1, v1, null);
    }

    public void a(q q1, v v1, Runnable runnable)
    {
        q1.u();
        q1.a("post-response");
        a.execute(new i(this, q1, v1, runnable));
    }
}
