// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;


public class h
{

    public static final String a = String.format("COALESCE(%s AND NOT %s, %s) COLLATE NOCASE DESC, %s COLLATE NOCASE ASC", new Object[] {
        "isQuickMix", "isShared", "stationName", "stationName"
    });
    public static final String b = String.format("COALESCE(%s AND NOT %s, %s) DESC, %s DESC", new Object[] {
        "isQuickMix", "isShared", "dateCreated", "dateCreated"
    });
    public static final String c = String.format("%s.%s IN ", new Object[] {
        "stations", "_id"
    });
    public static final String d = String.format("NOT %s", new Object[] {
        "isQuickMix"
    });
    public static final String e = String.format("(%s AND %s)", new Object[] {
        "isQuickMix", "isShared"
    });
    public static final String f = String.format("NOT %s.%s AND NOT %s.%s", new Object[] {
        "stations", "isQuickMix", "stations", "isShared"
    });
    public static final String g = String.format("(%s AND (select count(1) from %s where NOT %s AND NOT (%s and %s)) > 0)", new Object[] {
        "isQuickMix", "stations", "onePlaylist", "isQuickMix", "isShared"
    });
    public static final String h = String.format("%s OR %s OR %s", new Object[] {
        d, e, g
    });
    public static final String i = String.format("NOT %s", new Object[] {
        "isPendingDelete"
    });
    public static final String j = String.format("(%s == 1)", new Object[] {
        "supportsArtistAudioMessages"
    });
    public static final String k = String.format("(%s == 1)", new Object[] {
        "enableArtistAudioMessages"
    });
    public static final String l[] = {
        String.format("%s.%s as %s", new Object[] {
            "stations", "_id", "_id"
        }), String.format("%s.%s", new Object[] {
            "stations", "stationToken"
        }), String.format("%s.%s", new Object[] {
            "stations", "stationName"
        }), String.format("%s.%s", new Object[] {
            "stations", "isQuickMix"
        }), String.format("%s.%s", new Object[] {
            "stations", "isShared"
        }), String.format("%s.%s", new Object[] {
            "stations", "allowAddMusic"
        }), String.format("%s.%s", new Object[] {
            "stations", "allowRename"
        }), String.format("%s.%s", new Object[] {
            "stations", "allowDelete"
        }), String.format("%s.%s", new Object[] {
            "stations", "requiresCleanAds"
        }), String.format("%s.%s", new Object[] {
            "stations", "suppressVideoAds"
        }), 
        String.format("%s.%s", new Object[] {
            "stations", "supportImpressionTargeting"
        }), String.format("%s.%s", new Object[] {
            "stations", "dateCreated"
        }), String.format("%s.%s", new Object[] {
            "stations", "artUrl"
        }), String.format("%s.%s", new Object[] {
            "stations", "seeds"
        }), String.format("%s.%s", new Object[] {
            "stations", "stationId"
        }), String.format("%s.%s", new Object[] {
            "stations", "onePlaylist"
        }), String.format("%s.%s", new Object[] {
            "stations", "unlimitedSkips"
        }), String.format("%s.%s", new Object[] {
            "stations", "expireTimeMillis"
        }), String.format("%s.%s", new Object[] {
            "stations", "expireWarnBeforeMillis"
        }), String.format("%s.%s", new Object[] {
            "stations", "isAdvertiser"
        }), 
        String.format("%s.%s", new Object[] {
            "stations", "stationDescription"
        }), String.format("%s.%s", new Object[] {
            "stations", "isPendingDelete"
        }), String.format("%s.%s", new Object[] {
            "stations", "stationNameWithTwitterHandle"
        }), String.format("%s.%s", new Object[] {
            "stations", "enableArtistAudioMessages"
        }), String.format("%s.%s", new Object[] {
            "stations", "supportsArtistAudioMessages"
        }), String.format("%s.%s", new Object[] {
            "extendedStationData", "personalizationProgress"
        }), String.format("%s.%s", new Object[] {
            "extendedStationData", "totalThumbsDown"
        }), String.format("%s.%s", new Object[] {
            "extendedStationData", "totalThumbsUp"
        })
    };
    public static final String m[] = {
        "_id", "station_id", "adData_id", "title", "creator", "album", "artUrl", "trackToken", "audioToken", "nowPlayingStationAdUrl", 
        "allowFeedback", "songRating", "duration", "trackGain", "audioUrlMap", "adImpressionRegistered", "amazonSongDigitalAsin", "artistExplorerUrl", "audioReceiptUrl", "lastHeardPosition", 
        "lastHeardTime", "songDetailUrl", "backstageAdUrl", "amazonAlbumUrl", "amazonAlbumAsin", "competitiveSepIndicator", "socialAdUrl", "measureTimeForMonthlyCap", "allowStartStationFromTrack", "allowBuyTrack", 
        "allowTiredOfTrack", "allowBookmarkTrack", "allowShareTrack", "stationId", "amazonAlbumDigitalAsin", "allowSkipTrackWithoutLimit", "shareLandingUrl", "additionalAudioUrl", "songIdentity", "artistMessage_id", 
        "featured", "audioSkipUrl", "artistTwitterHandle"
    };
    public static final String n[] = {
        "_id", "adToken", "clickThroughUrl", "adTrackingTokens", "dismissed", "html", "height", "impressionUrl", "impressionSent", "isAudioAdFollowOnBanner", 
        "isVideoAdFollowOnBanner", "bannerRenderTrackerUrl", "bannerRenderDarkTrackerUrl", "bannerDisplayAfterDarkTrackerUrl", "bannerRenderTracked", "type", "bannerRenderDarkImpressionSent", "bannerRenderDisplayAfterDarkImpressionSent", "interstitialHtml"
    };
    public static final String o[] = {
        "_id", "artistMessageId", "artistMessageUID", "artistMessageButtonText", "artistMessageButtonUrl", "artistMessageCoachmarkArtUrl", "artistMessageText", "artistMessageUseExternalBrowser", "artistMessageCaptionUrl"
    };
    public static final String p = String.format("%s DESC", new Object[] {
        "dateCreated"
    });
    public static final String q[] = {
        "stationToken", "seedId", "titleName", "artistName", "artUrl", "musicToken", "dateCreated"
    };

    public static d.a[] a()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("stationToken"), com.pandora.radio.provider.d.a.b("stationName"), com.pandora.radio.provider.d.a.a("isQuickMix"), com.pandora.radio.provider.d.a.a("isShared"), com.pandora.radio.provider.d.a.a("allowAddMusic"), com.pandora.radio.provider.d.a.a("allowRename"), com.pandora.radio.provider.d.a.a("allowDelete"), com.pandora.radio.provider.d.a.a("requiresCleanAds"), com.pandora.radio.provider.d.a.a("suppressVideoAds"), com.pandora.radio.provider.d.a.a("supportImpressionTargeting"), 
            com.pandora.radio.provider.d.a.a("dateCreated"), com.pandora.radio.provider.d.a.b("artUrl"), com.pandora.radio.provider.d.a.a("seeds"), com.pandora.radio.provider.d.a.b("stationId"), com.pandora.radio.provider.d.a.a("onePlaylist"), com.pandora.radio.provider.d.a.a("unlimitedSkips"), com.pandora.radio.provider.d.a.a("expireTimeMillis"), com.pandora.radio.provider.d.a.a("expireWarnBeforeMillis"), com.pandora.radio.provider.d.a.a("isAdvertiser"), com.pandora.radio.provider.d.a.b("stationDescription"), 
            com.pandora.radio.provider.d.a.a("isPendingDelete"), com.pandora.radio.provider.d.a.b("stationNameWithTwitterHandle"), com.pandora.radio.provider.d.a.a("enableArtistAudioMessages"), com.pandora.radio.provider.d.a.a("supportsArtistAudioMessages")
        });
    }

    public static d.a[] b()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("station_id"), com.pandora.radio.provider.d.a.b("adData_id"), com.pandora.radio.provider.d.a.b("title"), com.pandora.radio.provider.d.a.b("creator"), com.pandora.radio.provider.d.a.b("album"), com.pandora.radio.provider.d.a.b("artUrl"), com.pandora.radio.provider.d.a.b("trackToken"), com.pandora.radio.provider.d.a.b("audioToken"), com.pandora.radio.provider.d.a.b("nowPlayingStationAdUrl"), com.pandora.radio.provider.d.a.a("allowFeedback"), 
            com.pandora.radio.provider.d.a.a("songRating"), com.pandora.radio.provider.d.a.a("duration"), com.pandora.radio.provider.d.a.b("trackGain"), com.pandora.radio.provider.d.a.c("audioUrlMap"), com.pandora.radio.provider.d.a.a("adImpressionRegistered"), com.pandora.radio.provider.d.a.b("amazonSongDigitalAsin"), com.pandora.radio.provider.d.a.b("artistExplorerUrl"), com.pandora.radio.provider.d.a.b("audioReceiptUrl"), com.pandora.radio.provider.d.a.a("lastHeardPosition"), com.pandora.radio.provider.d.a.a("lastHeardTime"), 
            com.pandora.radio.provider.d.a.b("songDetailUrl"), com.pandora.radio.provider.d.a.b("backstageAdUrl"), com.pandora.radio.provider.d.a.b("amazonAlbumUrl"), com.pandora.radio.provider.d.a.b("amazonAlbumAsin"), com.pandora.radio.provider.d.a.b("competitiveSepIndicator"), com.pandora.radio.provider.d.a.b("socialAdUrl"), com.pandora.radio.provider.d.a.a("measureTimeForMonthlyCap"), com.pandora.radio.provider.d.a.a("allowStartStationFromTrack"), com.pandora.radio.provider.d.a.a("allowBuyTrack"), com.pandora.radio.provider.d.a.a("allowTiredOfTrack"), 
            com.pandora.radio.provider.d.a.a("allowBookmarkTrack"), com.pandora.radio.provider.d.a.a("allowShareTrack"), com.pandora.radio.provider.d.a.b("stationId"), com.pandora.radio.provider.d.a.b("amazonAlbumDigitalAsin"), com.pandora.radio.provider.d.a.b("allowSkipTrackWithoutLimit"), com.pandora.radio.provider.d.a.b("shareLandingUrl"), com.pandora.radio.provider.d.a.b("additionalAudioUrl"), com.pandora.radio.provider.d.a.b("songIdentity"), com.pandora.radio.provider.d.a.b("artistMessage_id"), com.pandora.radio.provider.d.a.a("featured"), 
            com.pandora.radio.provider.d.a.b("audioSkipUrl"), com.pandora.radio.provider.d.a.b("artistTwitterHandle")
        });
    }

    public static d.a[] c()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("adToken"), com.pandora.radio.provider.d.a.b("clickThroughUrl"), com.pandora.radio.provider.d.a.c("adTrackingTokens"), com.pandora.radio.provider.d.a.a("dismissed"), com.pandora.radio.provider.d.a.b("html"), com.pandora.radio.provider.d.a.a("height"), com.pandora.radio.provider.d.a.b("impressionUrl"), com.pandora.radio.provider.d.a.a("impressionSent"), com.pandora.radio.provider.d.a.a("isAudioAdFollowOnBanner"), com.pandora.radio.provider.d.a.a("isVideoAdFollowOnBanner"), 
            com.pandora.radio.provider.d.a.b("bannerRenderTrackerUrl"), com.pandora.radio.provider.d.a.b("bannerRenderDarkTrackerUrl"), com.pandora.radio.provider.d.a.b("bannerDisplayAfterDarkTrackerUrl"), com.pandora.radio.provider.d.a.a("bannerRenderTracked"), com.pandora.radio.provider.d.a.a("type", "html"), com.pandora.radio.provider.d.a.a("bannerRenderDarkImpressionSent"), com.pandora.radio.provider.d.a.a("bannerRenderDisplayAfterDarkImpressionSent"), com.pandora.radio.provider.d.a.b("interstitialHtml")
        });
    }

    public static d.a[] d()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.a("artistMessageId"), com.pandora.radio.provider.d.a.b("artistMessageUID"), com.pandora.radio.provider.d.a.b("artistMessageButtonText"), com.pandora.radio.provider.d.a.b("artistMessageButtonUrl"), com.pandora.radio.provider.d.a.b("artistMessageCoachmarkArtUrl"), com.pandora.radio.provider.d.a.b("artistMessageText"), com.pandora.radio.provider.d.a.b("artistMessageUseExternalBrowser"), com.pandora.radio.provider.d.a.b("artistMessageCaptionUrl")
        });
    }

    public static d.a[] e()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("stationToken"), com.pandora.radio.provider.d.a.b("seedId"), com.pandora.radio.provider.d.a.b("titleName"), com.pandora.radio.provider.d.a.b("artistName"), com.pandora.radio.provider.d.a.b("artUrl"), com.pandora.radio.provider.d.a.b("musicToken"), com.pandora.radio.provider.d.a.a("dateCreated")
        });
    }

    public static d.a[] f()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("stationToken"), com.pandora.radio.provider.d.a.a("personalizationProgress"), com.pandora.radio.provider.d.a.a("totalThumbsDown"), com.pandora.radio.provider.d.a.a("totalThumbsUp"), com.pandora.radio.provider.d.a.a("dateCached")
        });
    }

}
