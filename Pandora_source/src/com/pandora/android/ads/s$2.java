// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.yume.android.sdk.YuMeAdEvent;

// Referenced classes of package com.pandora.android.ads:
//            s

static class vent
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[YuMeAdEvent.values().length];
        try
        {
            b[YuMeAdEvent.AD_READY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            b[YuMeAdEvent.AD_AND_ASSETS_READY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            b[YuMeAdEvent.AD_NOT_READY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            b[YuMeAdEvent.AD_PRESENT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            b[YuMeAdEvent.AD_ABSENT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            b[YuMeAdEvent.AD_PLAYING.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[YuMeAdEvent.AD_COMPLETED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[YuMeAdEvent.AD_ERROR.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[YuMeAdEvent.AD_EXPIRED.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        a = new int[values().length];
        try
        {
            a[d.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[c.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
