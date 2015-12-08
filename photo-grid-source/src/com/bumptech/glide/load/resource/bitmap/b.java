// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.i.d;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.f;
import java.io.OutputStream;

public final class b
    implements f
{

    private android.graphics.Bitmap.CompressFormat a;
    private int b;

    public b()
    {
        this((byte)0);
    }

    private b(byte byte0)
    {
        a = null;
        b = 90;
    }

    public final String a()
    {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public final boolean a(Object obj, OutputStream outputstream)
    {
        Bitmap bitmap = (Bitmap)((x)obj).b();
        long l = d.a();
        if (a != null)
        {
            obj = a;
        } else
        if (bitmap.hasAlpha())
        {
            obj = android.graphics.Bitmap.CompressFormat.PNG;
        } else
        {
            obj = android.graphics.Bitmap.CompressFormat.JPEG;
        }
        bitmap.compress(((android.graphics.Bitmap.CompressFormat) (obj)), b, outputstream);
        if (Log.isLoggable("BitmapEncoder", 2))
        {
            (new StringBuilder("Compressed with type: ")).append(obj).append(" of size ").append(h.a(bitmap)).append(" in ").append(d.a(l));
        }
        return true;
    }
}
