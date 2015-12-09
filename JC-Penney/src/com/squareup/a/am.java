// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.squareup.a:
//            bm, ab, av, as, 
//            be, ak, r, w, 
//            k, ap

public class am
{

    private final Context a;
    private w b;
    private ExecutorService c;
    private k d;
    private ap e;
    private as f;
    private List g;
    private android.graphics.Bitmap.Config h;
    private boolean i;
    private boolean j;

    public am(Context context)
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

    public ak a()
    {
        Context context = a;
        if (b == null)
        {
            b = bm.a(context);
        }
        if (d == null)
        {
            d = new ab(context);
        }
        if (c == null)
        {
            c = new av();
        }
        if (f == null)
        {
            f = as.a;
        }
        be be1 = new be(d);
        return new ak(context, new r(context, c, ak.a, b, d, be1), d, e, f, g, be1, h, i, j);
    }
}
