// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.skype.android.util.ImageCache;

// Referenced classes of package com.skype.android.mediacontent:
//            PackInfo

public class PackInfoUtils
{

    private static ImageCache a;

    public PackInfoUtils(ImageCache imagecache)
    {
        a = imagecache;
    }

    public static Bitmap a(PackInfo packinfo, Context context)
    {
        String s = a(packinfo.c());
        Bitmap bitmap = a.a(s);
        Object obj = bitmap;
        if (bitmap == null)
        {
            obj = new android.graphics.BitmapFactory.Options();
            obj.inDensity = 160;
            obj.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
            obj = BitmapFactory.decodeFile(packinfo.b(), ((android.graphics.BitmapFactory.Options) (obj)));
            a(s, ((Bitmap) (obj)));
        }
        return ((Bitmap) (obj));
    }

    public static Bitmap a(String s)
    {
        return a.a(s);
    }

    public static String a(int i)
    {
        return (new StringBuilder("tab:")).append(i).toString();
    }

    public static void a(String s, Bitmap bitmap)
    {
        a.a(s, bitmap);
    }
}
