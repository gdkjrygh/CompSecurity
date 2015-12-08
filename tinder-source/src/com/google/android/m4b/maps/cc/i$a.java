// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.ao.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bx.i;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            i

public static final class a
    implements a
{

    private final Bitmap a;
    private final com.google.android.m4b.maps.bm.d b;
    private final int c;
    private final int d;

    public final float a()
    {
        return (float)c;
    }

    public final j a(d d1, i k)
    {
        boolean flag = true;
        j j1 = (j)b.c(a);
        k = j1;
        if (j1 == null)
        {
            k = new j(d1, (byte)0);
            k.d = true;
            k.e = false;
            if (android.os.d.VERSION.SDK_INT < 9)
            {
                flag = false;
            }
            if (flag && !b.c)
            {
                k.a(a);
            } else
            {
                k.b(a);
            }
            b.b(a, k);
        }
        k.b();
        return k;
    }

    public final j a(i k)
    {
        k = (j)b.c(a);
        if (k != null)
        {
            k.b();
        }
        return k;
    }

    public final float b()
    {
        return (float)d;
    }

    public final float c()
    {
        return 0.0F;
    }

    public final float d()
    {
        return 0.0F;
    }

    public final float e()
    {
        return (float)d;
    }

    (Bitmap bitmap, float f, com.google.android.m4b.maps.bm. )
    {
        a = bitmap;
        b = ;
        c = (int)((float)a.getWidth() * f);
        d = (int)((float)a.getHeight() * f);
    }
}
