// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import java.util.ArrayList;

public class Configuration
{
    public class Crittercisms
    {

        public Values dev;
        public Values prod;
        final Configuration this$0;

        public Crittercisms()
        {
            this$0 = Configuration.this;
            super();
        }
    }

    public class Email
    {

        public String body;
        public String subject;
        final Configuration this$0;

        public Email()
        {
            this$0 = Configuration.this;
            super();
        }
    }

    public class Localytics
    {

        public Values dev;
        public Values prod;
        final Configuration this$0;

        public Localytics()
        {
            this$0 = Configuration.this;
            super();
        }
    }

    public class RateViewPrompting
    {

        public int POIViewCount;
        public int daysBetweenPrompts;
        final Configuration this$0;

        public RateViewPrompting()
        {
            this$0 = Configuration.this;
            super();
        }
    }

    public class ShareTemplates
    {

        public Email email;
        public String facebook;
        public String googleplus;
        final Configuration this$0;
        public String twitter;

        public ShareTemplates()
        {
            this$0 = Configuration.this;
            super();
        }
    }

    public class TourSponsorData
    {

        public String detailImageURL;
        public String id;
        public String listImageURL;
        public String stripImageURL;
        final Configuration this$0;

        public TourSponsorData()
        {
            this$0 = Configuration.this;
            super();
        }
    }

    public class Values
    {

        public String appID;
        public String key;
        final Configuration this$0;

        public Values()
        {
            this$0 = Configuration.this;
            super();
        }
    }


    public Crittercisms crittercisms;
    public int daysBetweenUpdateReminder;
    public int initialMapViewPOICount;
    public Localytics localytics;
    public String minimumVersion;
    public String notificationVersion;
    public String playStoreURL;
    public String poiDatabaseRefreshDate;
    public String poiServiceHost;
    public RateViewPrompting rateAppPrompting;
    public boolean requiredToNotify;
    public ShareTemplates shareTemplates;
    public String shareURL;
    public int sponsorImageDisplaySecs;
    public String sponsorImageURL;
    public String suggestServiceHost;
    public int supriseMeQualityMin;
    public ArrayList tourSponsorData;
    public String version;

    public Configuration()
    {
        poiServiceHost = "";
        suggestServiceHost = "";
        poiDatabaseRefreshDate = "2014-01-01";
        supriseMeQualityMin = 0;
        initialMapViewPOICount = 0;
        daysBetweenUpdateReminder = 10;
        shareURL = "";
    }
}
