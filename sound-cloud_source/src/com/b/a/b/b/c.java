// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.b;

import com.b.a.b.a.e;
import com.b.a.b.d.b;

public final class c
{

    final String a;
    final String b;
    final e c;
    final int d;
    final int e;
    final b f;
    final Object g;
    final boolean h;
    final android.graphics.BitmapFactory.Options i = new android.graphics.BitmapFactory.Options();
    private final String j;

    public c(String s, String s1, String s2, e e1, int k, b b1, com.b.a.b.c c1)
    {
        a = s;
        b = s1;
        j = s2;
        c = e1;
        d = c1.j;
        e = k;
        f = b1;
        g = c1.n;
        h = c1.m;
        s = c1.k;
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
}
