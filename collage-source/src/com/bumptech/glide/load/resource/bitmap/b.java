// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.g.d;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.f;
import java.io.OutputStream;

public class b
    implements f
{

    private android.graphics.Bitmap.CompressFormat a;
    private int b;

    public b()
    {
        this(null, 90);
    }

    public b(android.graphics.Bitmap.CompressFormat compressformat, int i)
    {
        a = compressformat;
        b = i;
    }

    private android.graphics.Bitmap.CompressFormat a(Bitmap bitmap)
    {
        if (a != null)
        {
            return a;
        }
        if (bitmap.hasAlpha())
        {
            return android.graphics.Bitmap.CompressFormat.PNG;
        } else
        {
            return android.graphics.Bitmap.CompressFormat.JPEG;
        }
    }

    public String a()
    {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public boolean a(j j1, OutputStream outputstream)
    {
        j1 = (Bitmap)j1.b();
        long l = d.a();
        android.graphics.Bitmap.CompressFormat compressformat = a(((Bitmap) (j1)));
        j1.compress(compressformat, b, outputstream);
        if (Log.isLoggable("BitmapEncoder", 2))
        {
            Log.v("BitmapEncoder", (new StringBuilder()).append("Compressed with type: ").append(compressformat).append(" of size ").append(h.a(j1)).append(" in ").append(d.a(l)).toString());
        }
        return true;
    }

    public volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((j)obj, outputstream);
    }
}
