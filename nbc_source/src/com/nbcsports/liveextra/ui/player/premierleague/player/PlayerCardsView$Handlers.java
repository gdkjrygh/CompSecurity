// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.databinding.ObservableBoolean;
import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerCardsView

public static class vm
{

    private final HomeTeam vm;

    public void onAwayClick(View view)
    {
        vm.HomeTeam.set(false);
    }

    public void onHomeClick(View view)
    {
        vm.HomeTeam.set(true);
    }

    public ( )
    {
        vm = ;
    }
}
