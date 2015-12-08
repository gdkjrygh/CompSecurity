// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.util.HashMap;
import kik.a.d.d;
import kik.a.e.v;

// Referenced classes of package kik.android.util:
//            r, u

public final class aa
{

    private static HashMap a = new HashMap();

    public static int a(int i, int j, float f)
    {
        f = Math.max(0.0F, Math.min(1.0F, f));
        float f1 = 1.0F - f;
        float f2 = (i & 0xff000000) >> 24;
        float f3 = (0xff000000 & j) >> 24;
        float f4 = (i & 0xff0000) >> 16;
        float f5 = (0xff0000 & j) >> 16;
        float f6 = (i & 0xff00) >> 8;
        float f7 = (0xff00 & j) >> 8;
        float f8 = i & 0xff;
        float f9 = j & 0xff;
        i = (int)(f2 * f + f3 * f1);
        j = (int)(f4 * f + f5 * f1);
        int k = (int)(f6 * f + f7 * f1);
        return (int)(f * f8 + f1 * f9) & 0xff | ((i & 0xff) << 24 | (j & 0xff) << 16 | (k & 0xff) << 8);
    }

    public static boolean a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return false;
        } else
        {
            return kik.android.util.r.d(r.a(bitmap, 10, 10));
        }
    }

    public static boolean a(v v1, d d1)
    {
        if (d1 != null)
        {
            d1 = d1.b();
            if (v1 != null && d1 != null)
            {
                if (a.containsKey(d1))
                {
                    return ((Boolean)a.get(d1)).booleanValue();
                }
                v1 = v1.b(d1, false);
                if (v1 != null)
                {
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(v1.getAbsolutePath(), options);
                    if (!options.mCancel && options.outWidth != -1 && options.outHeight != -1)
                    {
                        options.inSampleSize = u.a(options, 10, 400);
                        options.inJustDecodeBounds = false;
                        options.inDither = false;
                        boolean flag = a(BitmapFactory.decodeFile(v1.getAbsolutePath(), options));
                        a.put(d1, Boolean.valueOf(flag));
                        return flag;
                    }
                }
            }
        }
        return false;
    }

}
