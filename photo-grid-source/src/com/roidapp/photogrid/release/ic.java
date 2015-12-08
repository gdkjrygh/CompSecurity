// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.graphics.Bitmap;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.filter.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            lc, rf, ig

public final class ic
{

    public Bitmap a;
    public lc b;
    public int c;
    public int d;
    public int e;

    public ic()
    {
    }

    public final Bitmap a(Context context, ig ig, int i, int j)
    {
        if (b != null)
        {
            d = i;
            e = j;
            i = Math.round((b.l * (float)i) / 100F);
            j = Math.round((b.m * (float)j) / 100F);
            rf.a();
            a = rf.a(ig, j, i, Boolean.valueOf(false));
            break MISSING_BLOCK_LABEL_73;
        }
        do
        {
            do
            {
                return a;
            } while (az.q == 9 || az.q == 10 || a == null || a.isRecycled());
            if (az.q == 8)
            {
                context = com.roidapp.photogrid.filter.b.a(com.roidapp.photogrid.filter.b.b(context), a, ig);
            } else
            {
                context = com.roidapp.photogrid.filter.b.a(com.roidapp.photogrid.filter.b.a(context), a, ig);
            }
            if (context != null && !context.isRecycled() && context != a)
            {
                a = context;
            }
        } while (true);
    }

    public final void a()
    {
        if (a != null && !a.isRecycled())
        {
            a.recycle();
            a = null;
        }
    }
}
