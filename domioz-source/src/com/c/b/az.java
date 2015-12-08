// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.net.NetworkInfo;

// Referenced classes of package com.c.b:
//            aw, ba

public abstract class az
{

    public az()
    {
    }

    static void a(int i, int j, int k, int l, android.graphics.BitmapFactory.Options options, aw aw1)
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
                if (aw1.k)
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

    static void a(int i, int j, android.graphics.BitmapFactory.Options options, aw aw1)
    {
        a(i, j, options.outWidth, options.outHeight, options, aw1);
    }

    static boolean a(android.graphics.BitmapFactory.Options options)
    {
        return options != null && options.inJustDecodeBounds;
    }

    static android.graphics.BitmapFactory.Options d(aw aw1)
    {
        boolean flag1 = aw1.c();
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (aw1.q != null)
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
                options1.inPreferredConfig = aw1.q;
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

    public abstract boolean a(aw aw1);

    public abstract ba b(aw aw1);

    boolean b()
    {
        return false;
    }
}
