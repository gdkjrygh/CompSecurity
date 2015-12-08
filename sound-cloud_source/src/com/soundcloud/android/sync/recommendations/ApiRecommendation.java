// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.recommendations;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ModelCollection;
import java.util.HashMap;
import java.util.Map;

class ApiRecommendation
{
    static final class Reason extends Enum
    {

        private static final Reason $VALUES[];
        public static final Reason LIKED;
        public static final Reason LISTENED_TO;
        public static final Reason UNKNOWN;

        public static Reason valueOf(String s)
        {
            return (Reason)Enum.valueOf(com/soundcloud/android/sync/recommendations/ApiRecommendation$Reason, s);
        }

        public static Reason[] values()
        {
            return (Reason[])$VALUES.clone();
        }

        static 
        {
            LIKED = new Reason("LIKED", 0);
            LISTENED_TO = new Reason("LISTENED_TO", 1);
            UNKNOWN = new Reason("UNKNOWN", 2);
            $VALUES = (new Reason[] {
                LIKED, LISTENED_TO, UNKNOWN
            });
        }

        private Reason(String s, int i)
        {
            super(s, i);
        }
    }


    static final Map relationKeys;
    private final ModelCollection recommendedTracks;
    private final String relationKey;
    private final ApiTrack seedTrack;

    public ApiRecommendation(ApiTrack apitrack, String s, ModelCollection modelcollection)
    {
        seedTrack = apitrack;
        recommendedTracks = modelcollection;
        relationKey = s;
    }

    Reason getRecommendationReason()
    {
        if (relationKeys.containsKey(relationKey))
        {
            return (Reason)relationKeys.get(relationKey);
        } else
        {
            return Reason.UNKNOWN;
        }
    }

    Iterable getRecommendations()
    {
        return recommendedTracks;
    }

    ApiTrack getSeedTrack()
    {
        return seedTrack;
    }

    static 
    {
        HashMap hashmap = new HashMap(Reason.values().length);
        relationKeys = hashmap;
        hashmap.put("liked", Reason.LIKED);
        relationKeys.put("listened_to", Reason.LISTENED_TO);
        relationKeys.put("curated", Reason.LISTENED_TO);
        relationKeys.put("reposted", Reason.LISTENED_TO);
        relationKeys.put("uploaded", Reason.LISTENED_TO);
    }
}
