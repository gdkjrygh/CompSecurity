// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;


final class aa
{

    static final int a[];

    static 
    {
        a = new int[android.widget.ImageView.ScaleType.values().length];
        try
        {
            a[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
