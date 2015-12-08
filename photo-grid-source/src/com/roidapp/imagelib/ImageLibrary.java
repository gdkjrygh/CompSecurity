// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib;

import android.app.Application;
import android.content.Context;

// Referenced classes of package com.roidapp.imagelib:
//            a

public class ImageLibrary extends Application
{

    private static ImageLibrary a;
    private a b;
    private String c;
    private boolean d;

    private ImageLibrary()
    {
        c = "";
        d = true;
    }

    public static ImageLibrary a()
    {
        if (a == null)
        {
            a = new ImageLibrary();
        }
        return a;
    }

    public static String b()
    {
        return "/.Filter";
    }

    public static String c()
    {
        return "/.Crop";
    }

    public static String d()
    {
        return "/.FreeCrop";
    }

    public static String e()
    {
        return "/.VideoTemp";
    }

    public static String f()
    {
        return "/.VideoPreviewTemp";
    }

    public static String g()
    {
        return "/.BackgroundImage";
    }

    public final String a(Context context)
    {
        return b.a(context);
    }

    public final void a(a a1)
    {
        b = a1;
    }

    public final void a(String s)
    {
        b.a(s);
    }

    public final Integer[] a(Context context, String s)
    {
        return b.a(context, s);
    }

    public final Integer[] a(String s, int i)
    {
        return b.a(s, i);
    }

    public final String b(Context context)
    {
        return b.b(context);
    }

    public final String h()
    {
        return b.a();
    }
}
