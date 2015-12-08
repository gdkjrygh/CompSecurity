// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;

public final class ei
{

    public String a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public Bitmap e;
    public Uri f;
    public Bundle g;
    public Uri h;

    public ei()
    {
    }

    public final MediaDescriptionCompat a()
    {
        return new MediaDescriptionCompat(a, b, c, d, e, f, g, h, (byte)0);
    }
}
