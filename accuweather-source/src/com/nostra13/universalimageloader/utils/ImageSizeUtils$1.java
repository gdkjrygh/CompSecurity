// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.utils;

import com.nostra13.universalimageloader.core.assist.ViewScaleType;

// Referenced classes of package com.nostra13.universalimageloader.utils:
//            ImageSizeUtils

static class pe
{

    static final int $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType[];

    static 
    {
        $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType = new int[ViewScaleType.values().length];
        try
        {
            $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType[ViewScaleType.FIT_INSIDE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$nostra13$universalimageloader$core$assist$ViewScaleType[ViewScaleType.CROP.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
