// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.ui.player.dataviews.PanelBottom;
import com.nbcsports.liveextra.ui.player.dataviews.PanelSide;
import com.nbcsports.liveextra.ui.player.dataviews.PanelTop;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueComponent;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueModule;
import com.phunware.nbc.sochi.fragments.TempPassDialogFragment;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, ActionBarSponsorView, AdOverlay, AltCamOverlay, 
//            PlayerControlBar, PlayerQosOverlayView, PlayerToolbar, PlayerView

public static interface ueComponent
{

    public abstract PlayerActivity activity();

    public abstract void inject(ActionBarSponsorView actionbarsponsorview);

    public abstract void inject(AdOverlay adoverlay);

    public abstract void inject(AltCamOverlay altcamoverlay);

    public abstract void inject(PlayerActivity playeractivity);

    public abstract void inject(PlayerControlBar playercontrolbar);

    public abstract void inject(PlayerQosOverlayView playerqosoverlayview);

    public abstract void inject(PlayerToolbar playertoolbar);

    public abstract void inject(PlayerView playerview);

    public abstract void inject(PanelBottom panelbottom);

    public abstract void inject(PanelSide panelside);

    public abstract void inject(PanelTop paneltop);

    public abstract void inject(TempPassDialogFragment temppassdialogfragment);

    public abstract PremierLeagueComponent premierLeague(PremierLeagueModule premierleaguemodule);
}
