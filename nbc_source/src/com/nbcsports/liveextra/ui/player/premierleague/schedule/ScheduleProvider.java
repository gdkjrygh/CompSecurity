// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.squareup.okhttp.OkHttpClient;

public class ScheduleProvider extends PremierLeaguePollingProvider
{
    public static class ScheduleSubscriber extends OverlayPollingSubscriber
    {

        public ScheduleSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/Schedule$Collection);
        }
    }


    public ScheduleProvider(PremierLeagueEngine premierleagueengine, ScheduleSubscriber schedulesubscriber)
    {
        super(premierleagueengine, schedulesubscriber, PremiereLeagueFeedName.Schedule);
    }

    public void showGoLive(boolean flag)
    {
    }
}
