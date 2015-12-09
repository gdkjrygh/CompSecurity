// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdEvent;
import java.util.Map;

public final class edy
{

    public static final dzw a = new dzw() {

        public final void a(AdEvent adevent, Context context)
        {
            com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event event;
            Object obj;
            Map map;
            boolean flag2;
            flag2 = true;
            context = adevent.getAd();
            event = adevent.getEvent();
            obj = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
            if (com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType.d.equals(context.getFeaturedActionType()) && com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.PLAY.equals(event))
            {
                ((AdEventReporter) (obj)).d();
            }
            map = context.getFeatureData();
            if (map == null) goto _L2; else goto _L1
_L1:
            boolean flag;
            boolean flag1;
            if (context.getAdType() == com.spotify.mobile.android.spotlets.ads.model.Ad.AdType.END_CARD_AD && com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.PLAY.equals(event))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ("Ad-Free Listening".equals(map.get("rewardType")) && map.containsKey("rewardValue"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag || !flag1) goto _L2; else goto _L3
_L3:
            flag = flag2;
_L5:
            if (flag)
            {
                ((AdEventReporter) (obj)).a("time", Integer.parseInt((String)adevent.getAd().getFeatureData().get("rewardValue")));
                ((AdEventReporter) (obj)).e();
            }
            obj = (edt)dmz.a(edt);
            if (adevent.getAd().getAdType().equals(com.spotify.mobile.android.spotlets.ads.model.Ad.AdType.OFFER_AD) && adevent.getEvent().equals(com.spotify.mobile.android.spotlets.ads.model.AdEvent.Event.PLAY))
            {
                obj.a = adevent;
            }
            adevent = edx.a(context, event);
            ((gnq)dmz.a(gnq)).a(adevent);
            return;
_L2:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
        }

    };

}
