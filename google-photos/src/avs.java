// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class avs extends avf
{

    private static final byte b[];

    public avs(Context context)
    {
        super(context);
    }

    protected final Bitmap a(aqm aqm, Bitmap bitmap, int i, int j)
    {
        return awc.b(aqm, bitmap, i, j);
    }

    public final void a(MessageDigest messagedigest)
    {
        messagedigest.update(b);
    }

    public final boolean equals(Object obj)
    {
        return obj instanceof avs;
    }

    public final int hashCode()
    {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }

    static 
    {
        b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);
    }
}
