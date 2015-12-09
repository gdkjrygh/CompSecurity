// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.servicemgr.LoMoType;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            LoMoViewPagerAdapter

static class pe
{

    static final int $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[];
    static final int $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[];

    static 
    {
        $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType = new int[LoMoType.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[LoMoType.BILLBOARD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[LoMoType.CONTINUE_WATCHING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$LoMoType[LoMoType.CHARACTERS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type = new int[pe.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[pe.STANDARD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[pe.LOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[pe.ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[pe.IQ.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[pe.CW.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[pe.BILLBOARD.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$lomo$LoMoViewPagerAdapter$Type[pe.CHARACTER.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
