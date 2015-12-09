// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import p.k.d;
import p.k.k;
import p.k.l;
import p.k.n;
import p.k.t;

// Referenced classes of package com.android.volley.toolbox:
//            e

public class i extends l
{

    private static final Object e = new Object();
    private final p.k.n.b a;
    private final android.graphics.Bitmap.Config b;
    private final int c;
    private final int d;

    public i(String s1, p.k.n.b b1, int j, int i1, android.graphics.Bitmap.Config config, p.k.n.a a1)
    {
        super(0, s1, a1);
        a(new d(1000, 2, 2.0F));
        a = b1;
        b = config;
        c = j;
        d = i1;
    }

    static int a(int j, int i1, int j1, int k1)
    {
        double d1 = Math.min((double)j / (double)j1, (double)i1 / (double)k1);
        float f;
        for (f = 1.0F; (double)(f * 2.0F) <= d1; f *= 2.0F) { }
        return (int)f;
    }

    private static int b(int j, int i1, int j1, int k1)
    {
        int l1;
        if (j == 0 && i1 == 0)
        {
            l1 = j1;
        } else
        {
            if (j == 0)
            {
                return (int)(((double)i1 / (double)k1) * (double)j1);
            }
            l1 = j;
            if (i1 != 0)
            {
                double d1 = (double)k1 / (double)j1;
                l1 = j;
                if ((double)j * d1 > (double)i1)
                {
                    return (int)((double)i1 / d1);
                }
            }
        }
        return l1;
    }

    private n b(p.k.i j)
    {
        Object obj = j.b;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (c == 0 && d == 0)
        {
            options.inPreferredConfig = b;
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
        } else
        {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            int i1 = options.outWidth;
            int j1 = options.outHeight;
            int k1 = b(c, d, i1, j1);
            int l1 = b(d, c, j1, i1);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i1, j1, k1, l1);
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            if (obj != null && (((Bitmap) (obj)).getWidth() > k1 || ((Bitmap) (obj)).getHeight() > l1))
            {
                Bitmap bitmap = Bitmap.createScaledBitmap(((Bitmap) (obj)), k1, l1, true);
                ((Bitmap) (obj)).recycle();
                obj = bitmap;
            }
        }
        if (obj == null)
        {
            return n.a(new k(j));
        } else
        {
            return n.a(obj, com.android.volley.toolbox.e.a(j));
        }
    }

    protected n a(p.k.i j)
    {
        obj;
        JVM INSTR monitorenter ;
        n n1;
        synchronized (e)
        {
            n1 = b(j);
        }
        return n1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        t.c("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(j.b.length), c()
        });
        j = n.a(new k(outofmemoryerror));
        obj;
        JVM INSTR monitorexit ;
        return j;
        j;
        obj;
        JVM INSTR monitorexit ;
        throw j;
    }

    protected void a(Bitmap bitmap)
    {
        a.a(bitmap);
    }

    protected volatile void a(Object obj)
    {
        a((Bitmap)obj);
    }

    public p.k.l.a s()
    {
        return p.k.l.a.a;
    }

}
