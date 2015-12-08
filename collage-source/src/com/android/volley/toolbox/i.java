// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.c;
import com.android.volley.g;
import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.s;

// Referenced classes of package com.android.volley.toolbox:
//            e

public class i extends k
{

    private static final Object f = new Object();
    private final com.android.volley.m.b a;
    private final android.graphics.Bitmap.Config b;
    private final int c;
    private final int d;
    private android.widget.ImageView.ScaleType e;

    public i(String s1, com.android.volley.m.b b1, int j, int l, android.graphics.Bitmap.Config config, com.android.volley.m.a a1)
    {
        this(s1, b1, j, l, android.widget.ImageView.ScaleType.CENTER_INSIDE, config, a1);
    }

    public i(String s1, com.android.volley.m.b b1, int j, int l, android.widget.ImageView.ScaleType scaletype, android.graphics.Bitmap.Config config, com.android.volley.m.a a1)
    {
        super(0, s1, a1);
        a(new c(1000, 2, 2.0F));
        a = b1;
        b = config;
        c = j;
        d = l;
        e = scaletype;
    }

    static int a(int j, int l, int i1, int j1)
    {
        double d1 = Math.min((double)j / (double)i1, (double)l / (double)j1);
        float f1;
        for (f1 = 1.0F; (double)(f1 * 2.0F) <= d1; f1 *= 2.0F) { }
        return (int)f1;
    }

    private static int a(int j, int l, int i1, int j1, android.widget.ImageView.ScaleType scaletype)
    {
        if (j != 0 || l != 0) goto _L2; else goto _L1
_L1:
        int k1 = i1;
_L4:
        return k1;
_L2:
        if (scaletype != android.widget.ImageView.ScaleType.FIT_XY)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = j;
        if (j == 0)
        {
            return i1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        double d1;
        if (j == 0)
        {
            return (int)(((double)l / (double)j1) * (double)i1);
        }
        k1 = j;
        if (l == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        d1 = (double)j1 / (double)i1;
        if (scaletype != android.widget.ImageView.ScaleType.CENTER_CROP)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = j;
        if ((double)j * d1 < (double)l)
        {
            return (int)((double)l / d1);
        }
        if (true) goto _L4; else goto _L5
_L5:
        k1 = j;
        if ((double)j * d1 > (double)l)
        {
            return (int)((double)l / d1);
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    private m b(g g1)
    {
        Object obj = g1.b;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (c == 0 && d == 0)
        {
            options.inPreferredConfig = b;
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
        } else
        {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            int j = options.outWidth;
            int l = options.outHeight;
            int i1 = a(c, d, j, l, e);
            int j1 = a(d, c, l, j, e);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(j, l, i1, j1);
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            if (obj != null && (((Bitmap) (obj)).getWidth() > i1 || ((Bitmap) (obj)).getHeight() > j1))
            {
                Bitmap bitmap = Bitmap.createScaledBitmap(((Bitmap) (obj)), i1, j1, true);
                ((Bitmap) (obj)).recycle();
                obj = bitmap;
            }
        }
        if (obj == null)
        {
            return m.a(new com.android.volley.i(g1));
        } else
        {
            return m.a(obj, com.android.volley.toolbox.e.a(g1));
        }
    }

    protected m a(g g1)
    {
        obj;
        JVM INSTR monitorenter ;
        m m1;
        synchronized (f)
        {
            m1 = b(g1);
        }
        return m1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        s.c("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(g1.b.length), e()
        });
        g1 = m.a(new com.android.volley.i(outofmemoryerror));
        obj;
        JVM INSTR monitorexit ;
        return g1;
        g1;
        obj;
        JVM INSTR monitorexit ;
        throw g1;
    }

    protected void a(Bitmap bitmap)
    {
        a.a(bitmap);
    }

    protected void b(Object obj)
    {
        a((Bitmap)obj);
    }

    public com.android.volley.k.a u()
    {
        return com.android.volley.k.a.a;
    }

}
