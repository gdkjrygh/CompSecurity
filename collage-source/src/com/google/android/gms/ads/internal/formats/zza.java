// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

public class zza
{

    private static final int zzvA;
    static final int zzvB;
    static final int zzvC;
    private static final int zzvz;
    private final int mTextColor;
    private final String zzvD;
    private final Drawable zzvE;
    private final int zzvF;
    private final int zzvG;

    public zza(String s, Drawable drawable, Integer integer, Integer integer1, Integer integer2)
    {
        zzvD = s;
        zzvE = drawable;
        int i;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = zzvB;
        }
        zzvF = i;
        if (integer1 != null)
        {
            i = integer1.intValue();
        } else
        {
            i = zzvC;
        }
        mTextColor = i;
        if (integer2 != null)
        {
            i = integer2.intValue();
        } else
        {
            i = 12;
        }
        zzvG = i;
    }

    public int getBackgroundColor()
    {
        return zzvF;
    }

    public Drawable getIcon()
    {
        return zzvE;
    }

    public String getText()
    {
        return zzvD;
    }

    public int getTextColor()
    {
        return mTextColor;
    }

    public int getTextSize()
    {
        return zzvG;
    }

    static 
    {
        zzvz = Color.rgb(12, 174, 206);
        zzvA = Color.rgb(204, 204, 204);
        zzvB = zzvA;
        zzvC = zzvz;
    }
}
