// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import com.google.android.gms.internal.dx;

public class zzc extends dx
{

    private final Drawable a;
    private final Uri b;
    private final double c;

    public zzc(Drawable drawable, Uri uri, double d1)
    {
        a = drawable;
        b = uri;
        c = d1;
    }

    public double getScale()
    {
        return c;
    }

    public Uri getUri()
    {
        return b;
    }

    public a zzdv()
    {
        return d.a(a);
    }
}
