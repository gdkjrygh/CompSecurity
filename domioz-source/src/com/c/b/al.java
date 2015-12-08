// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.c.b:
//            bj, aa, au, ar, 
//            bc, aj, q, v, 
//            k, ao

public final class al
{

    private final Context a;
    private v b;
    private ExecutorService c;
    private k d;
    private ao e;
    private ar f;
    private List g;
    private android.graphics.Bitmap.Config h;
    private boolean i;
    private boolean j;

    public al(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null.");
        } else
        {
            a = context.getApplicationContext();
            return;
        }
    }

    public final aj a()
    {
        Context context = a;
        if (b == null)
        {
            b = bj.a(context);
        }
        if (d == null)
        {
            d = new aa(context);
        }
        if (c == null)
        {
            c = new au();
        }
        if (f == null)
        {
            f = ar.a;
        }
        bc bc1 = new bc(d);
        return new aj(context, new q(context, c, aj.a, b, d, bc1), d, e, f, g, bc1, h, i, j);
    }
}
