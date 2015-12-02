// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.NetworkInfo;

public abstract class cgu
{

    public cgu()
    {
    }

    static void a(int i, int j, int k, int l, android.graphics.BitmapFactory.Options options, cgr cgr1)
    {
        int i1 = 1;
        if (l > j || k > i)
        {
            if (j == 0)
            {
                i1 = (int)Math.floor((float)k / (float)i);
            } else
            if (i == 0)
            {
                i1 = (int)Math.floor((float)l / (float)j);
            } else
            {
                j = (int)Math.floor((float)l / (float)j);
                i = (int)Math.floor((float)k / (float)i);
                if (cgr1.k)
                {
                    i1 = Math.max(j, i);
                } else
                {
                    i1 = Math.min(j, i);
                }
            }
        }
        options.inSampleSize = i1;
        options.inJustDecodeBounds = false;
    }

    static void a(int i, int j, android.graphics.BitmapFactory.Options options, cgr cgr1)
    {
        a(i, j, options.outWidth, options.outHeight, options, cgr1);
    }

    static boolean a(android.graphics.BitmapFactory.Options options)
    {
        return options != null && options.inJustDecodeBounds;
    }

    static android.graphics.BitmapFactory.Options d(cgr cgr1)
    {
        boolean flag1 = cgr1.d();
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (cgr1.q != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        options = null;
        if (flag1 || flag)
        {
            android.graphics.BitmapFactory.Options options1 = new android.graphics.BitmapFactory.Options();
            options1.inJustDecodeBounds = flag1;
            options = options1;
            if (flag)
            {
                options1.inPreferredConfig = cgr1.q;
                options = options1;
            }
        }
        return options;
    }

    int a()
    {
        return 0;
    }

    boolean a(NetworkInfo networkinfo)
    {
        return false;
    }

    public abstract boolean a(cgr cgr1);

    public abstract cgv b(cgr cgr1);

    boolean b()
    {
        return false;
    }
}
