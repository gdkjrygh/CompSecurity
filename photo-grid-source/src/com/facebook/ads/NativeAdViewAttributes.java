// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.graphics.Typeface;

public class NativeAdViewAttributes
{

    private Typeface a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public NativeAdViewAttributes()
    {
        a = Typeface.DEFAULT;
        b = -1;
        c = 0xff000000;
        d = 0xff4e5665;
        e = 0;
        f = 0xff4278e7;
        g = 0xff4278e7;
    }

    public int getBackgroundColor()
    {
        return b;
    }

    public int getButtonBorderColor()
    {
        return g;
    }

    public int getButtonColor()
    {
        return e;
    }

    public int getButtonTextColor()
    {
        return f;
    }

    public int getDescriptionTextColor()
    {
        return d;
    }

    public int getDescriptionTextSize()
    {
        return 10;
    }

    public int getTitleTextColor()
    {
        return c;
    }

    public int getTitleTextSize()
    {
        return 16;
    }

    public Typeface getTypeface()
    {
        return a;
    }

    public NativeAdViewAttributes setBackgroundColor(int i)
    {
        b = i;
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int i)
    {
        g = i;
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int i)
    {
        e = i;
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int i)
    {
        f = i;
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int i)
    {
        d = i;
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int i)
    {
        c = i;
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface)
    {
        a = typeface;
        return this;
    }
}
