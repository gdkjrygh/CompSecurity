// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.Intent;
import java.util.Locale;

public final class Referrer extends Enum
{

    private static final Referrer $VALUES[];
    public static final Referrer ACTIVITIES_NOTIFICATION;
    public static final Referrer FACEBOOK;
    public static final Referrer GOOGLE;
    public static final Referrer GOOGLE_CRAWLER;
    public static final Referrer GOOGLE_PLUS;
    public static final Referrer HOME_BUTTON;
    private static final String HOST_FACEBOOK = "facebook.com";
    private static final String HOST_GOOGLE = "google.com";
    public static final Referrer MOBI;
    private static final String ORDINAL_EXTRA = "ReferrerOrdinal";
    public static final Referrer OTHER;
    public static final Referrer PLAYBACK_NOTIFICATION;
    public static final Referrer PLAYBACK_WIDGET;
    public static final Referrer STREAM_NOTIFICATION;
    public static final Referrer TWITTER;
    private final String referrerTag;

    private Referrer(String s, int i, String s1)
    {
        super(s, i);
        referrerTag = s1;
    }

    public static Referrer fromHost(String s)
    {
        String s1;
        byte byte0;
        s1 = s;
        if (s.indexOf("www.") == 0)
        {
            s1 = s.substring(4);
        }
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 48
    //                   -1536293812: 76
    //                   -364826023: 90;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_90;
_L4:
        switch (byte0)
        {
        default:
            return OTHER;

        case 0: // '\0'
            return GOOGLE;

        case 1: // '\001'
            return FACEBOOK;
        }
_L2:
        if (s1.equals("google.com"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s1.equals("facebook.com"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public static Referrer fromIntent(Intent intent)
    {
        return values()[intent.getIntExtra("ReferrerOrdinal", 0)];
    }

    public static Referrer fromOrigin(String s)
    {
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return OTHER;
        }
        return s;
    }

    public static boolean hasReferrer(Intent intent)
    {
        return intent.hasExtra("ReferrerOrdinal");
    }

    public static Referrer valueOf(String s)
    {
        return (Referrer)Enum.valueOf(com/soundcloud/android/analytics/Referrer, s);
    }

    public static Referrer[] values()
    {
        return (Referrer[])$VALUES.clone();
    }

    public final void addToIntent(Intent intent)
    {
        intent.putExtra("ReferrerOrdinal", ordinal());
    }

    public final String get()
    {
        return referrerTag;
    }

    static 
    {
        OTHER = new Referrer("OTHER", 0, "other");
        HOME_BUTTON = new Referrer("HOME_BUTTON", 1, "home_button");
        FACEBOOK = new Referrer("FACEBOOK", 2, "facebook");
        TWITTER = new Referrer("TWITTER", 3, "twitter");
        MOBI = new Referrer("MOBI", 4, "mobi");
        GOOGLE = new Referrer("GOOGLE", 5, "google");
        GOOGLE_PLUS = new Referrer("GOOGLE_PLUS", 6, "google_plus");
        STREAM_NOTIFICATION = new Referrer("STREAM_NOTIFICATION", 7, "stream_notification");
        ACTIVITIES_NOTIFICATION = new Referrer("ACTIVITIES_NOTIFICATION", 8, "activities_notification");
        PLAYBACK_NOTIFICATION = new Referrer("PLAYBACK_NOTIFICATION", 9, "playback_notification");
        PLAYBACK_WIDGET = new Referrer("PLAYBACK_WIDGET", 10, "playback_widget");
        GOOGLE_CRAWLER = new Referrer("GOOGLE_CRAWLER", 11, "google_crawler");
        $VALUES = (new Referrer[] {
            OTHER, HOME_BUTTON, FACEBOOK, TWITTER, MOBI, GOOGLE, GOOGLE_PLUS, STREAM_NOTIFICATION, ACTIVITIES_NOTIFICATION, PLAYBACK_NOTIFICATION, 
            PLAYBACK_WIDGET, GOOGLE_CRAWLER
        });
    }
}
