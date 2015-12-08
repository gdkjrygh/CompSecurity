// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.am;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.m4b.maps.a.h;
import com.google.android.m4b.maps.a.j;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.m;
import com.google.android.m4b.maps.a.o;
import com.google.android.m4b.maps.a.s;

// Referenced classes of package com.google.android.m4b.maps.am:
//            d

public class g extends k
{

    private static final Object q = new Object();
    private final com.google.android.m4b.maps.a.m.b l;
    private final android.graphics.Bitmap.Config m;
    private final int n;
    private final int o;
    private android.widget.ImageView.ScaleType p;

    public g(String s1, com.google.android.m4b.maps.a.m.b b, android.graphics.Bitmap.Config config, com.google.android.m4b.maps.a.m.a a1)
    {
        this(s1, b, android.widget.ImageView.ScaleType.CENTER_INSIDE, config, a1);
    }

    private g(String s1, com.google.android.m4b.maps.a.m.b b, android.widget.ImageView.ScaleType scaletype, android.graphics.Bitmap.Config config, com.google.android.m4b.maps.a.m.a a1)
    {
        super(0, s1, a1);
        super.j = new o(1000, 2, 2.0F);
        l = b;
        m = config;
        n = 0;
        o = 0;
        p = scaletype;
    }

    private static int a(int i, int i1, int j1, int k1)
    {
        double d1 = Math.min((double)i / (double)j1, (double)i1 / (double)k1);
        float f;
        for (f = 1.0F; (double)(f * 2.0F) <= d1; f *= 2.0F) { }
        return (int)f;
    }

    private static int a(int i, int i1, int j1, int k1, android.widget.ImageView.ScaleType scaletype)
    {
        if (i != 0 || i1 != 0) goto _L2; else goto _L1
_L1:
        int l1 = j1;
_L4:
        return l1;
_L2:
        if (scaletype != android.widget.ImageView.ScaleType.FIT_XY)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i;
        if (i == 0)
        {
            return j1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        double d1;
        if (i == 0)
        {
            return (int)(((double)i1 / (double)k1) * (double)j1);
        }
        l1 = i;
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        d1 = (double)k1 / (double)j1;
        if (scaletype != android.widget.ImageView.ScaleType.CENTER_CROP)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i;
        if ((double)i * d1 < (double)i1)
        {
            return (int)((double)i1 / d1);
        }
        if (true) goto _L4; else goto _L5
_L5:
        l1 = i;
        if ((double)i * d1 > (double)i1)
        {
            return (int)((double)i1 / d1);
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected final m a(h h1)
    {
        Object obj2 = q;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = h1.b;
        obj1 = new android.graphics.BitmapFactory.Options();
        if (n != 0 || o != 0) goto _L2; else goto _L1
_L1:
        obj1.inPreferredConfig = m;
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
_L6:
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = com.google.android.m4b.maps.a.m.a(new j(h1));
        h1 = ((h) (obj));
_L8:
        obj2;
        JVM INSTR monitorexit ;
        return h1;
_L2:
        int j1;
        int k1;
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        int i = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        int i1 = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        j1 = a(n, o, i, i1, p);
        k1 = a(o, n, i1, i, p);
        obj1.inJustDecodeBounds = false;
        obj1.inSampleSize = a(i, i1, j1, k1);
        obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, ((android.graphics.BitmapFactory.Options) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (((Bitmap) (obj)).getWidth() <= j1 && ((Bitmap) (obj)).getHeight() <= k1) goto _L6; else goto _L7
_L7:
        obj1 = Bitmap.createScaledBitmap(((Bitmap) (obj)), j1, k1, true);
        ((Bitmap) (obj)).recycle();
        obj = obj1;
          goto _L6
        obj;
        s.c("Caught OOM for %d byte image, url=%s", new Object[] {
            Integer.valueOf(h1.b.length), super.b
        });
        h1 = com.google.android.m4b.maps.a.m.a(new j(((Throwable) (obj))));
        obj2;
        JVM INSTR monitorexit ;
        return h1;
        h1;
        obj2;
        JVM INSTR monitorexit ;
        throw h1;
_L4:
        obj = com.google.android.m4b.maps.a.m.a(obj, com.google.android.m4b.maps.am.d.a(h1));
        h1 = ((h) (obj));
          goto _L8
    }

    protected final void a(Object obj)
    {
        obj = (Bitmap)obj;
        l.a(obj);
    }

    public final com.google.android.m4b.maps.a.k.a d()
    {
        return com.google.android.m4b.maps.a.k.a.a;
    }

}
