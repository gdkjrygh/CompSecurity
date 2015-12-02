// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.c;
import com.android.volley.i;
import com.android.volley.k;
import com.android.volley.n;

// Referenced classes of package com.android.volley.toolbox:
//            d

public class h extends Request
{

    private static final Object e = new Object();
    private final com.android.volley.k.b a;
    private final android.graphics.Bitmap.Config b;
    private final int c;
    private final int d;

    public h(String s1, com.android.volley.k.b b1, int j, int l, android.graphics.Bitmap.Config config, com.android.volley.k.a a1)
    {
        super(0, s1, a1);
        a(new c(1000, 2, 2.0F));
        a = b1;
        b = config;
        c = j;
        d = l;
    }

    static int a(int j, int l, int i1, int j1)
    {
        double d1 = Math.min((double)j / (double)i1, (double)l / (double)j1);
        float f = 1.0F;
        do
        {
            if ((double)(f * 2.0F) > d1)
            {
                return (int)f;
            }
            f *= 2.0F;
        } while (true);
    }

    private static int b(int j, int l, int i1, int j1)
    {
        int k1;
        if (j == 0 && l == 0)
        {
            k1 = i1;
        } else
        {
            if (j == 0)
            {
                return (int)(((double)l / (double)j1) * (double)i1);
            }
            k1 = j;
            if (l != 0)
            {
                double d1 = (double)j1 / (double)i1;
                k1 = j;
                if ((double)j * d1 > (double)l)
                {
                    return (int)((double)l / d1);
                }
            }
        }
        return k1;
    }

    private k b(i j)
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
            int l = options.outWidth;
            int i1 = options.outHeight;
            int j1 = b(c, d, l, i1);
            int k1 = b(d, c, i1, l);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(l, i1, j1, k1);
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
            if (obj != null && (((Bitmap) (obj)).getWidth() > j1 || ((Bitmap) (obj)).getHeight() > k1))
            {
                Bitmap bitmap = Bitmap.createScaledBitmap(((Bitmap) (obj)), j1, k1, true);
                ((Bitmap) (obj)).recycle();
                obj = bitmap;
            }
        }
        if (obj == null)
        {
            return k.a(new ParseError(j));
        } else
        {
            return k.a(obj, com.android.volley.toolbox.d.a(j));
        }
    }

    protected k a(i j)
    {
        obj;
        JVM INSTR monitorenter ;
        k k1;
        synchronized (e)
        {
            k1 = b(j);
        }
        return k1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        n.c("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(j.b.length), d()
        });
        j = k.a(new ParseError(outofmemoryerror));
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

    protected void b(Object obj)
    {
        a((Bitmap)obj);
    }

    public com.android.volley.Request.Priority s()
    {
        return com.android.volley.Request.Priority.LOW;
    }

}
