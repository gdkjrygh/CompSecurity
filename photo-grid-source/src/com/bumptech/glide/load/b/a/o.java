// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;


final class o
{

    static final int a[];

    static 
    {
        a = new int[android.graphics.Bitmap.Config.values().length];
        try
        {
            a[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
