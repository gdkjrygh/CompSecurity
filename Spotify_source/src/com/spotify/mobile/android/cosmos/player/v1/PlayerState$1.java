// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v1;


// Referenced classes of package com.spotify.mobile.android.cosmos.player.v1:
//            PlayerState

class tion
{

    static final int $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[];

    static 
    {
        $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action = new int[tion.values().length];
        try
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[tion.PLAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[tion.RESUME.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[tion.PAUSE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[tion.SKIP_PREV.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[tion.SKIP_NEXT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$spotify$mobile$android$cosmos$player$v1$PlayerState$Action[tion.UPDATE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
