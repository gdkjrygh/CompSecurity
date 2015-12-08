// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cn;

import android.provider.BaseColumns;
import com.pandora.radio.provider.h;

public class b
{
    static class a
        implements BaseColumns
    {

        static final String a[] = {
            "_id", "station_id", "adData_id", "title", "creator", "album", "artUrl", "trackToken", "audioToken", "nowPlayingStationAdUrl", 
            "allowFeedback", "songRating", "duration", "trackGain", "audioUrlMap", "adImpressionRegistered", "amazonSongDigitalAsin", "artistExplorerUrl", "audioReceiptUrl", "lastHeardPosition", 
            "lastHeardTime", "songDetailUrl", "backstageAdUrl", "amazonAlbumUrl", "amazonAlbumAsin", "competitiveSepIndicator", "socialAdUrl", "measureTimeForMonthlyCap", "allowStartStationFromTrack", "allowBuyTrack", 
            "allowTiredOfTrack", "allowBookmarkTrack", "allowShareTrack", "stationId", "amazonAlbumDigitalAsin", "allowSkipTrackWithoutLimit", "shareLandingUrl", "additionalAudioUrl", "songIdentity", "sessionId", 
            "dateCreated", "artistMessage_id", "artistTwitterHandle", "featured", "audioSkipUrl"
        };

        static com.pandora.radio.provider.d.a[] a()
        {
            int i = 0;
            com.pandora.radio.provider.d.a aa[] = h.b();
            int j = aa.length;
            com.pandora.radio.provider.d.a aa1[] = new com.pandora.radio.provider.d.a[j + 2];
            aa1[0] = com.pandora.radio.provider.d.a.b("sessionId");
            aa1[1] = com.pandora.radio.provider.d.a.a("dateCreated");
            for (; i < j; i++)
            {
                aa1[i + 2] = aa[i];
            }

            return aa1;
        }

    }


    static final String a = String.format("%s ASC", new Object[] {
        "dateCreated"
    });

}
