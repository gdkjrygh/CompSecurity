// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompat

public static final class 
{

    private String a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private Bitmap e;
    private Uri f;
    private Bundle g;
    private Uri h;

    public final  a(Bitmap bitmap)
    {
        e = bitmap;
        return this;
    }

    public final e a(Uri uri)
    {
        f = uri;
        return this;
    }

    public final f a(Bundle bundle)
    {
        g = bundle;
        return this;
    }

    public final g a(CharSequence charsequence)
    {
        b = charsequence;
        return this;
    }

    public final b a(String s)
    {
        a = s;
        return this;
    }

    public final MediaDescriptionCompat a()
    {
        return new MediaDescriptionCompat(a, b, c, d, e, f, g, h, (byte)0);
    }

    public final h b(Uri uri)
    {
        h = uri;
        return this;
    }

    public final h b(CharSequence charsequence)
    {
        c = charsequence;
        return this;
    }

    public final c c(CharSequence charsequence)
    {
        d = charsequence;
        return this;
    }

    public ()
    {
    }
}
