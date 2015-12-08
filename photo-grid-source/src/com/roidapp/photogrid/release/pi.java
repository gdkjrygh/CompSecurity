// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;

// Referenced classes of package com.roidapp.photogrid.release:
//            oi, ml, rm, rf, 
//            pj, ig

public final class pi extends oi
{

    private int r;

    public pi(Activity activity, ig aig[], ml ml1, int i)
    {
        r = 1;
        b = activity;
        c = aig;
        d = ml1;
        r = i;
    }

    public final void a()
    {
        if (c == null)
        {
            d.sendEmptyMessage(7);
        }
        int i1 = c.length;
        rm rm1;
        int i;
        int j;
        int k;
        int l;
        if (r == 1)
        {
            l = f;
            k = (int)((float)l * 0.75F);
            j = f + 10;
            i = k * i1 + (i1 + 1) * 5;
        } else
        {
            k = f;
            l = (int)((float)k * 0.75F);
            i = f + 10;
            j = l * i1 + (i1 + 1) * 5;
        }
        rm1 = new rm(b, i, j, c, k, l, r, c(), d);
        d.a(8, 1);
        rf.b(b);
        rm1.b();
        (new Thread(new pj(this, rm1))).start();
    }

    public final void a(int i)
    {
    }
}
