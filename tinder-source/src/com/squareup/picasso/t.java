// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            r, ab

public abstract class t
{
    public static final class a
    {

        final Picasso.LoadedFrom a;
        final Bitmap b;
        final InputStream c;
        final int d;

        public a(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
        {
            this((Bitmap)ab.a(bitmap, "bitmap == null"), null, loadedfrom, 0);
        }

        a(Bitmap bitmap, InputStream inputstream, Picasso.LoadedFrom loadedfrom, int i)
        {
            boolean flag1 = true;
            super();
            boolean flag;
            if (bitmap != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (inputstream == null)
            {
                flag1 = false;
            }
            if (!(flag1 ^ flag))
            {
                throw new AssertionError();
            } else
            {
                b = bitmap;
                c = inputstream;
                a = (Picasso.LoadedFrom)ab.a(loadedfrom, "loadedFrom == null");
                d = i;
                return;
            }
        }

        public a(InputStream inputstream, Picasso.LoadedFrom loadedfrom)
        {
            this(null, (InputStream)ab.a(inputstream, "stream == null"), loadedfrom, 0);
        }
    }


    public t()
    {
    }

    static void a(int i, int j, int k, int l, android.graphics.BitmapFactory.Options options, r r1)
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
                if (r1.k)
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

    static void a(int i, int j, android.graphics.BitmapFactory.Options options, r r1)
    {
        a(i, j, options.outWidth, options.outHeight, options, r1);
    }

    static boolean a(android.graphics.BitmapFactory.Options options)
    {
        return options != null && options.inJustDecodeBounds;
    }

    static android.graphics.BitmapFactory.Options d(r r1)
    {
        boolean flag1 = r1.c();
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (r1.q != null)
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
                options1.inPreferredConfig = r1.q;
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

    public abstract boolean a(r r1);

    public abstract a b(r r1)
        throws IOException;

    boolean b()
    {
        return false;
    }
}
