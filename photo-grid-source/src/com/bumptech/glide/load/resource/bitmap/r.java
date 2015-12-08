// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.c.j;
import com.bumptech.glide.load.e;
import java.io.IOException;

public final class r
    implements e
{

    private final e a;
    private final e b;

    public r(e e1, e e2)
    {
        a = e1;
        b = e2;
    }

    private x a(j j1, int i, int k)
    {
        x x1 = null;
        java.io.InputStream inputstream = j1.a();
        x x = x1;
        if (inputstream != null)
        {
            try
            {
                x = a.a(inputstream, i, k);
            }
            catch (IOException ioexception)
            {
                Log.isLoggable("ImageVideoDecoder", 2);
                ioexception = x1;
            }
        }
        x1 = x;
        if (x == null)
        {
            j1 = j1.b();
            x1 = x;
            if (j1 != null)
            {
                x1 = b.a(j1, i, k);
            }
        }
        return x1;
    }

    public final volatile x a(Object obj, int i, int k)
    {
        return a((j)obj, i, k);
    }

    public final String a()
    {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
