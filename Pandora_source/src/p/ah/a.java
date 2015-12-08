// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ah;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p.s.k;

// Referenced classes of package p.ah:
//            d

public class a
    implements d
{

    private final android.graphics.Bitmap.CompressFormat a;
    private final int b;

    public a()
    {
        this(android.graphics.Bitmap.CompressFormat.JPEG, 100);
    }

    public a(android.graphics.Bitmap.CompressFormat compressformat, int i)
    {
        a = compressformat;
        b = i;
    }

    public String a()
    {
        return "BitmapBytesTranscoder.com.bumptech.glide.load.resource.transcode";
    }

    public k a(k k1)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ((Bitmap)k1.b()).compress(a, b, bytearrayoutputstream);
        k1.d();
        return new p.ac.a(bytearrayoutputstream.toByteArray());
    }
}
