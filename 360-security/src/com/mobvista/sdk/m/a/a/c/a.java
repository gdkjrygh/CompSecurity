// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.a.c;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;

// Referenced classes of package com.mobvista.sdk.m.a.a.c:
//            b, c, d

public abstract class a
{

    protected boolean a;
    protected Handler b;
    private d c;

    public a()
    {
        b = new b(this, Looper.getMainLooper());
    }

    static d a(a a1)
    {
        return a1.c;
    }

    private void a(int i)
    {
        c c1 = new c(this, i);
        com.mobvista.sdk.m.a.e.a.a().c(c1);
    }

    protected abstract Object a(Map map, byte abyte0[]);

    protected abstract String a();

    public final void a(int i, d d)
    {
        a = false;
        if (d != null)
        {
            c = d;
        }
        a(i);
    }

    public final void a(d d)
    {
        c = d;
    }
}
