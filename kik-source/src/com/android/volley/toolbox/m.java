// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.e;
import com.android.volley.k;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.x;

// Referenced classes of package com.android.volley.toolbox:
//            f

public class m extends n
{

    private static final Object e = new Object();
    private final com.android.volley.r.b a;
    private final android.graphics.Bitmap.Config b;
    private final int c;
    private final int d;

    public m(String s, com.android.volley.r.b b1, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        super(s, a1);
        a(new e(1000, 2, 2.0F));
        a = b1;
        b = config;
        c = i;
        d = j;
    }

    private static int a(int i, int j, int l, int i1)
    {
        int j1;
        if (i == 0 && j == 0)
        {
            j1 = l;
        } else
        {
            if (i == 0)
            {
                return (int)(((double)j / (double)i1) * (double)l);
            }
            j1 = i;
            if (j != 0)
            {
                double d1 = (double)i1 / (double)l;
                j1 = i;
                if ((double)i * d1 > (double)j)
                {
                    return (int)((double)j / d1);
                }
            }
        }
        return j1;
    }

    private static int b(int i, int j, int l, int i1)
    {
        double d1 = Math.min((double)i / (double)l, (double)j / (double)i1);
        float f1;
        for (f1 = 1.0F; (double)(f1 * 2.0F) <= d1; f1 *= 2.0F) { }
        return (int)f1;
    }

    protected r a(k k1)
    {
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = k1.b;
        obj1 = new android.graphics.BitmapFactory.Options();
        if (c != 0 || d != 0) goto _L2; else goto _L1
_L1:
        obj1.inPreferredConfig = b;
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
_L6:
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = r.a(new com.android.volley.m());
        k1 = ((k) (obj));
_L8:
        obj2;
        JVM INSTR monitorexit ;
        return k1;
_L2:
        int l;
        int i1;
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        int i = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        int j = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        l = a(c, d, i, j);
        i1 = a(d, c, j, i);
        obj1.inJustDecodeBounds = false;
        obj1.inSampleSize = b(i, j, l, i1);
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((Bitmap) (obj)).getWidth() <= l && ((Bitmap) (obj)).getHeight() <= i1) goto _L6; else goto _L7
_L7:
        obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), l, i1, true);
        ((Bitmap) (obj)).recycle();
        obj = obj1;
          goto _L6
        obj;
        x.c("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(k1.b.length), d()
        });
        k1 = r.a(new com.android.volley.m(((Throwable) (obj))));
        obj2;
        JVM INSTR monitorexit ;
        return k1;
        k1;
        obj2;
        JVM INSTR monitorexit ;
        throw k1;
_L4:
        obj = r.a(obj, f.a(k1));
        k1 = ((k) (obj));
          goto _L8
    }

    protected void a(Bitmap bitmap)
    {
        a.a(bitmap);
    }

    protected void b(Object obj)
    {
        a((Bitmap)obj);
    }

    public final com.android.volley.n.a o()
    {
        return com.android.volley.n.a.a;
    }

}
