// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import dmz;
import dzx;
import eek;
import fni;
import fnm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            Format

public class AdSlot
    implements JacksonModel, eek
{

    public static final AdSlot MOBILE_SCREENSAVER;
    public static final AdSlot PREROLL;
    public static final AdSlot STREAM;
    public static final AdSlot WATCHNOW;
    public List inventory_types;
    private dzx mOnRegistered;
    public String slot_id;

    public AdSlot(String s, List list, dzx dzx1)
    {
        slot_id = s;
        inventory_types = list;
        mOnRegistered = dzx1;
    }

    public static AdSlot valueOf(String s)
    {
        if (PREROLL.getSlotId().equals(s))
        {
            return PREROLL;
        }
        if (WATCHNOW.getSlotId().equals(s))
        {
            return WATCHNOW;
        }
        if (MOBILE_SCREENSAVER.getSlotId().equals(s))
        {
            return MOBILE_SCREENSAVER;
        } else
        {
            return STREAM;
        }
    }

    public String getCosmosEndpoint()
    {
        return (new StringBuilder("sp://ads/v1/adslots/")).append(getSlotId()).toString();
    }

    public String getSlotId()
    {
        return slot_id;
    }

    public com.spotify.mobile.android.util.ClientEvent.SubEvent getSubEvent()
    {
        if (equals(PREROLL))
        {
            return com.spotify.mobile.android.util.ClientEvent.SubEvent.cS;
        }
        if (equals(WATCHNOW))
        {
            return com.spotify.mobile.android.util.ClientEvent.SubEvent.cU;
        }
        if (equals(MOBILE_SCREENSAVER))
        {
            return com.spotify.mobile.android.util.ClientEvent.SubEvent.dc;
        } else
        {
            return com.spotify.mobile.android.util.ClientEvent.SubEvent.cT;
        }
    }

    public void onRegistered(fnm fnm)
    {
        mOnRegistered.a(fnm);
    }

    public String toString()
    {
        return slot_id;
    }

    static 
    {
        PREROLL = new AdSlot("preroll", Collections.singletonList(Format.AUDIO), new dzx() {

            public final void a(fnm fnm1)
            {
                com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType statetype = com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a;
                boolean flag = ((fni) (fnm1.m)).a;
                ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(statetype, flag);
            }

        });
        WATCHNOW = new AdSlot("watchnow", Arrays.asList(new Format[] {
            Format.AUDIO, Format.VIDEO
        }), new dzx() {

            public final void a(fnm fnm1)
            {
                AdEventReporter adeventreporter = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
                if (((fni) (fnm1.m)).a)
                {
                    adeventreporter.a(AdSlot.WATCHNOW);
                    adeventreporter.e();
                    ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a, true);
                } else
                {
                    ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a, false);
                }
                ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.f, true);
            }

        });
        STREAM = new AdSlot("stream", Collections.singletonList(Format.VIDEO), new dzx() {

            public final void a(fnm fnm)
            {
            }

        });
        MOBILE_SCREENSAVER = new AdSlot("mobile-screensaver", Arrays.asList(new Format[] {
            Format.BANNER
        }), new dzx() {

            public final void a(fnm fnm)
            {
            }

        });
    }
}
