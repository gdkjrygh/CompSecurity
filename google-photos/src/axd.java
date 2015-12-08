// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

public final class axd
    implements axg
{

    private final android.graphics.Bitmap.CompressFormat a;
    private final int b;

    public axd()
    {
        this(android.graphics.Bitmap.CompressFormat.JPEG, 100);
    }

    private axd(android.graphics.Bitmap.CompressFormat compressformat, int i)
    {
        a = compressformat;
        b = 100;
    }

    public final aqa a(aqa aqa1)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ((Bitmap)aqa1.b()).compress(a, b, bytearrayoutputstream);
        aqa1.d();
        return new awj(bytearrayoutputstream.toByteArray());
    }
}
