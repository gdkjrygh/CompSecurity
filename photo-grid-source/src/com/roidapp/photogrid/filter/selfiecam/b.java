// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.aq;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.rf;

public final class b
    implements aq
{

    private final Integer a[];
    private final String b;
    private final Activity c;
    private final boolean d;
    private boolean e;

    public b(Activity activity, Integer ainteger[], String s, boolean flag, boolean flag1)
    {
        b = s;
        a = ainteger;
        c = activity;
        d = flag;
        e = flag1;
    }

    public final Bitmap a(int i)
    {
        Bitmap bitmap1 = com.roidapp.imagelib.b.d.a(b, i, -1);
        if (bitmap1 != null) goto _L2; else goto _L1
_L1:
        bitmap1 = null;
_L4:
        return bitmap1;
_L2:
        Bitmap bitmap;
        int j = Math.min(bitmap1.getHeight(), bitmap1.getWidth());
        int k = Math.max(bitmap1.getHeight(), bitmap1.getWidth());
        if ((float)k * ((float)i / (float)j) >= 4096F)
        {
            j = k;
        }
        if (j == i)
        {
            break; /* Loop/switch isn't completed */
        }
        float f = (float)i / (float)j;
        rf.a();
        Bitmap bitmap2 = rf.a(bitmap1, f, f);
        if (bitmap2 == null || bitmap2.isRecycled() || bitmap2 == bitmap1)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap = bitmap2;
        if (bitmap1 != null)
        {
            bitmap = bitmap2;
            if (!bitmap1.isRecycled())
            {
                bitmap1.recycle();
                bitmap = bitmap2;
            }
        }
_L5:
        SharedPreferences sharedpreferences = c.getSharedPreferences(c.getPackageName(), 0);
        bitmap1 = bitmap;
        if (!e)
        {
            bitmap1 = bitmap;
            if (sharedpreferences.getBoolean("WATER_MARK", false))
            {
                Bitmap bitmap3 = com.roidapp.imagelib.b.c.a(c, bitmap);
                bitmap1 = bitmap;
                if (bitmap3 != null)
                {
                    bitmap1 = bitmap;
                    if (!bitmap3.isRecycled())
                    {
                        bitmap.recycle();
                        return bitmap3;
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        bitmap = bitmap1;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final Integer[] a()
    {
        return a;
    }

    public final boolean b()
    {
        return d;
    }

    public final String c()
    {
        return ap.a(c);
    }

    public final boolean d()
    {
        return true;
    }

    public final boolean e()
    {
        boolean flag = false;
        if (c.getSharedPreferences(c.getPackageName(), 0).getBoolean("WATER_MARK", false))
        {
            flag = true;
        }
        return flag;
    }
}
