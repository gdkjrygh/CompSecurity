// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;


// Referenced classes of package com.facebook.ads:
//            InterstitialAdActivity

static class pe
{

    static final int a[];

    static 
    {
        a = new int[pe.values().length];
        try
        {
            a[pe.VIDEO.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[pe.DISPLAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
