// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.NetworkInfo;

public abstract class gwc
{

    public gwc()
    {
    }

    public static void a(int i, int j, int k, int l, android.graphics.BitmapFactory.Options options, gvz gvz1)
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
                if (gvz1.k)
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

    static void a(int i, int j, android.graphics.BitmapFactory.Options options, gvz gvz1)
    {
        a(i, j, options.outWidth, options.outHeight, options, gvz1);
    }

    static boolean a(android.graphics.BitmapFactory.Options options)
    {
        return options != null && options.inJustDecodeBounds;
    }

    public static android.graphics.BitmapFactory.Options d(gvz gvz1)
    {
        boolean flag1 = gvz1.c();
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (gvz1.n != null)
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
                options1.inPreferredConfig = gvz1.n;
                options = options1;
            }
        }
        return options;
    }

    public int a()
    {
        return 0;
    }

    public boolean a(NetworkInfo networkinfo)
    {
        return false;
    }

    public abstract boolean a(gvz gvz1);

    public abstract gwd b(gvz gvz1);

    public boolean b()
    {
        return false;
    }
}
