// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.OutputStream;
import p.ap.d;
import p.ap.h;
import p.q.f;
import p.s.k;

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

    public volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((k)obj, outputstream);
    }

    public boolean a(k k1, OutputStream outputstream)
    {
        k1 = (Bitmap)k1.b();
        long l = d.a();
        android.graphics.Bitmap.CompressFormat compressformat = a(((Bitmap) (k1)));
        k1.compress(compressformat, b, outputstream);
        if (Log.isLoggable("BitmapEncoder", 2))
        {
            Log.v("BitmapEncoder", (new StringBuilder()).append("Compressed with type: ").append(compressformat).append(" of size ").append(h.a(k1)).append(" in ").append(d.a(l)).toString());
        }
        return true;
    }
}
