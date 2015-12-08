// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.rules;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import dmx;
import dmz;
import eeq;
import eet;
import eeu;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class AdRules
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, dmx
{

    private static final String b = com/spotify/mobile/android/spotlets/ads/rules/AdRules.getSimpleName();
    public Map a;
    private boolean c;

    public AdRules()
    {
        dmz.a(eeu);
        a = eeu.a();
    }

    public final void a(StateType statetype, boolean flag)
    {
        a(new eeq(statetype, flag));
    }

    public final void a(eeq eeq1)
    {
        String s = b;
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((eet)iterator.next()).a(eeq1)) { }
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        boolean flag = PlayerTrackUtil.isAd(playerstate.track());
        if (flag != c)
        {
            a(StateType.g, flag);
            c = flag;
        }
    }


    private class StateType extends Enum
    {

        public static final StateType a;
        public static final StateType b;
        public static final StateType c;
        public static final StateType d;
        public static final StateType e;
        public static final StateType f;
        public static final StateType g;
        private static final StateType h[];

        public static StateType valueOf(String s)
        {
            return (StateType)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/rules/AdRules$StateType, s);
        }

        public static StateType[] values()
        {
            return (StateType[])h.clone();
        }

        static 
        {
            a = new StateType("CAR_CONNECTED", 0);
            b = new StateType("DISABLED_NAVIGATION_ITEM", 1);
            c = new StateType("MIDROLL_VIDEO_ADS", 2);
            d = new StateType("ON_SPONSORED_PAGE", 3);
            e = new StateType("PLAYING_FROM_SPONSORED_CONTEXT", 4);
            f = new StateType("WATCH_NOW_SLOT", 5);
            g = new StateType("STREAMING_AD_IN_PROGRESS", 6);
            h = (new StateType[] {
                a, b, c, d, e, f, g
            });
        }

        private StateType(String s, int i)
        {
            super(s, i);
        }
    }

}
