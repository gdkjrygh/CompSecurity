// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;


public final class m
{

    private float a[];

    public m()
    {
        a = new float[9];
        a();
    }

    private m a()
    {
        for (int i = 1; i < a.length - 1; i++)
        {
            a[i] = 0.0F;
        }

        a[0] = 1.0F;
        a[4] = 1.0F;
        a[8] = 1.0F;
        return this;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 9; i += 3)
        {
            float f = a[i];
            float f1 = a[i + 1];
            float f2 = a[i + 2];
            stringbuilder.append((new StringBuilder(50)).append(f).append(", ").append(f1).append(", ").append(f2).append("\n").toString());
        }

        return stringbuilder.toString();
    }
}
