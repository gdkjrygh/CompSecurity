// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import java.util.List;

public class SplashData
{
    public static class EventListing
    {

        String date;
        String description;
        String dma;
        int duration;
        int eventId;
        int eventType;
        ExtendedInfo extendedInfo;
        int featureType;
        String imageUrl;
        String network;
        String rsn;
        String sport;
        String title;
        String url;

        public EventListing()
        {
        }
    }

    public static class ExtendedInfo
    {

        String awayTeam;
        String awayTeamName;
        String dateTime;
        int gameId;
        String homeTeam;
        String homeTeamName;
        int pid;

        public ExtendedInfo()
        {
        }
    }

    public static class VodListing
    {

        String duration;
        String headline;
        int streamId;
        String target;
        String thumbnail;
        String url;

        public VodListing()
        {
        }
    }


    List eventListings;
    int isDaylightSavings;
    List vodListings;

    public SplashData()
    {
    }
}
