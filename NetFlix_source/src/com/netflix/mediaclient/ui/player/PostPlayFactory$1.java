// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayFactory

static class stPlayType
{

    static final int $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[];

    static 
    {
        $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType = new int[stPlayType.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[stPlayType.EpisodesForMDX.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[stPlayType.EpisodesForPhone.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[stPlayType.EpisodesForTablet.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
