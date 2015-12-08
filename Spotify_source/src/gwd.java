// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.io.InputStream;

public final class gwd
{

    final com.squareup.picasso.Picasso.LoadedFrom a;
    final Bitmap b;
    final InputStream c;
    final int d;

    public gwd(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        this((Bitmap)gwm.a(bitmap, "bitmap == null"), null, loadedfrom, 0);
    }

    public gwd(Bitmap bitmap, InputStream inputstream, com.squareup.picasso.Picasso.LoadedFrom loadedfrom, int i)
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
            a = (com.squareup.picasso.Picasso.LoadedFrom)gwm.a(loadedfrom, "loadedFrom == null");
            d = i;
            return;
        }
    }

    public gwd(InputStream inputstream, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        this(null, (InputStream)gwm.a(inputstream, "stream == null"), loadedfrom, 0);
    }
}
