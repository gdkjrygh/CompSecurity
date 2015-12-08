// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.b;

import com.a.a.b.a.f;
import com.a.a.b.a.i;
import com.a.a.b.d;
import com.a.a.b.d.c;

public final class e
{

    private final String a;
    private final String b;
    private final f c;
    private final com.a.a.b.a.e d;
    private final i e;
    private final c f;
    private final Object g;
    private final boolean h;
    private final android.graphics.BitmapFactory.Options i = new android.graphics.BitmapFactory.Options();

    public e(String s, String s1, f f1, i j, c c1, d d1)
    {
        a = s;
        b = s1;
        c = f1;
        d = d1.j();
        e = j;
        f = c1;
        g = d1.n();
        h = d1.m();
        s = d1.k();
        s1 = i;
        s1.inDensity = ((android.graphics.BitmapFactory.Options) (s)).inDensity;
        s1.inDither = ((android.graphics.BitmapFactory.Options) (s)).inDither;
        s1.inInputShareable = ((android.graphics.BitmapFactory.Options) (s)).inInputShareable;
        s1.inJustDecodeBounds = ((android.graphics.BitmapFactory.Options) (s)).inJustDecodeBounds;
        s1.inPreferredConfig = ((android.graphics.BitmapFactory.Options) (s)).inPreferredConfig;
        s1.inPurgeable = ((android.graphics.BitmapFactory.Options) (s)).inPurgeable;
        s1.inSampleSize = ((android.graphics.BitmapFactory.Options) (s)).inSampleSize;
        s1.inScaled = ((android.graphics.BitmapFactory.Options) (s)).inScaled;
        s1.inScreenDensity = ((android.graphics.BitmapFactory.Options) (s)).inScreenDensity;
        s1.inTargetDensity = ((android.graphics.BitmapFactory.Options) (s)).inTargetDensity;
        s1.inTempStorage = ((android.graphics.BitmapFactory.Options) (s)).inTempStorage;
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            s1.inPreferQualityOverSpeed = ((android.graphics.BitmapFactory.Options) (s)).inPreferQualityOverSpeed;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            s1.inBitmap = ((android.graphics.BitmapFactory.Options) (s)).inBitmap;
            s1.inMutable = ((android.graphics.BitmapFactory.Options) (s)).inMutable;
        }
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final f c()
    {
        return c;
    }

    public final com.a.a.b.a.e d()
    {
        return d;
    }

    public final i e()
    {
        return e;
    }

    public final c f()
    {
        return f;
    }

    public final Object g()
    {
        return g;
    }

    public final boolean h()
    {
        return h;
    }

    public final android.graphics.BitmapFactory.Options i()
    {
        return i;
    }
}
