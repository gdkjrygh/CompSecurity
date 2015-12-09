// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;


// Referenced classes of package com.aviary.android.feather.headless.moa:
//            MoaHD

static class 
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[android.graphics.onfig.values().length];
        try
        {
            b[android.graphics.onfig.ARGB_8888.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[android.graphics.onfig.RGB_565.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[android.graphics.onfig.ALPHA_8.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[android.graphics.onfig.ARGB_4444.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        a = new int[android.graphics.ompressFormat.values().length];
        try
        {
            a[android.graphics.ompressFormat.JPEG.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[android.graphics.ompressFormat.PNG.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
