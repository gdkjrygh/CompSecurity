// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.util.FloatMath;

final class y
{

    public static final y a = new y(0.0F);
    public static final y b = new y(-90F);
    public static final y c = new y(90F);
    public float d;
    public float e;
    public float f;

    public y(float f1)
    {
        d = 0.0F;
        e = 0.0F;
        f = 0.0F;
        a(f1);
    }

    public final void a(float f1)
    {
        d = f1;
        e = FloatMath.cos(0.01745329F * f1);
        f = FloatMath.sin(0.01745329F * f1);
    }

}
