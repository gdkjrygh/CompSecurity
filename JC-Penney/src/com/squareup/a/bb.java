// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.net.NetworkInfo;

// Referenced classes of package com.squareup.a:
//            ax, bc

public abstract class bb
{

    public bb()
    {
    }

    static void a(int i, int j, int k, int l, android.graphics.BitmapFactory.Options options, ax ax1)
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
                if (ax1.k)
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

    static void a(int i, int j, android.graphics.BitmapFactory.Options options, ax ax1)
    {
        a(i, j, options.outWidth, options.outHeight, options, ax1);
    }

    static boolean a(android.graphics.BitmapFactory.Options options)
    {
        return options != null && options.inJustDecodeBounds;
    }

    static android.graphics.BitmapFactory.Options c(ax ax1)
    {
        boolean flag1 = ax1.d();
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (ax1.q != null)
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
                options1.inPreferredConfig = ax1.q;
                options = options1;
            }
        }
        return options;
    }

    int a()
    {
        return 0;
    }

    public abstract bc a(ax ax1, int i);

    public abstract boolean a(ax ax1);

    boolean a(boolean flag, NetworkInfo networkinfo)
    {
        return false;
    }

    boolean b()
    {
        return false;
    }
}
