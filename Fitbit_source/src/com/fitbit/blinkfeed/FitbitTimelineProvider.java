// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.blinkfeed;

import android.accounts.Account;
import android.content.Intent;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.ao;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.badges.Badge;
import com.fitbit.e.a;
import com.fitbit.onboarding.landing.LandingActivity_;
import com.fitbit.serverinteraction.PublicAPI;
import com.htc.blinkfeed.BlinkFeed;
import com.htc.blinkfeed.data.Cover;
import com.htc.blinkfeed.data.Story;
import com.htc.blinkfeed.data.Timeline;
import com.htc.blinkfeed.data.User;
import com.htc.blinkfeed.provider.TimelineProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

public class FitbitTimelineProvider
    implements TimelineProvider
{

    private static final String a = "FitbitTimelineProvider";
    private static final String b = "com.fitbit.FitbitMobile";

    public FitbitTimelineProvider()
    {
    }

    private static List a()
    {
        Object obj = dg.d().a();
        ao ao1 = dg.d().b();
        List list = Collections.emptyList();
        try
        {
            obj = ao1.U(((PublicAPI) (obj)).b(null, false));
        }
        catch (ServerCommunicationException servercommunicationexception)
        {
            com.fitbit.e.a.a("FitbitTimelineProvider", "Unable to get badges: ", servercommunicationexception, new Object[0]);
            return list;
        }
        catch (JSONException jsonexception)
        {
            com.fitbit.e.a.a("FitbitTimelineProvider", "Unable to parse badges: ", jsonexception, new Object[0]);
            return list;
        }
        return ((List) (obj));
    }

    private static List a(List list, Long long1)
    {
        long1 = new Date(long1.longValue());
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Badge badge = (Badge)list.next();
            if (badge.e().before(long1))
            {
                arraylist.add(badge);
            }
        } while (true);
        return arraylist;
    }

    public Timeline a(Account account, String s, Long long1)
    {
        String s1 = FitBitApplication.a().getString(0x7f080059);
        s = a();
        account = s;
        if (long1 != null)
        {
            account = s;
            if (long1.longValue() > 0L)
            {
                account = a(((List) (s)), long1);
            }
        }
        s = BlinkFeed.createTimeline();
        Story story;
        for (account = account.iterator(); account.hasNext(); s.addStory(story))
        {
            long1 = (Badge)account.next();
            story = new Story();
            story.setId(Integer.toString(long1.hashCode()));
            story.setHighlight(true);
            story.setTitle(long1.k());
            story.setCreated(long1.e().getTime());
            story.getCover().setLowQualityImage(long1.i());
            story.getPublisher().setId("com.fitbit.FitbitMobile");
            story.getPublisher().setName(s1);
            story.setType(com.htc.blinkfeed.data.Story.Type.TEXT);
            Intent intent = LandingActivity_.b(FitBitApplication.a()).a();
            intent.setFlags(0x10000000);
            intent.putExtra("com.fitbit.onboarding.landing.LandingActivity.INIT_BADGE_EXTRA", long1.c());
            story.setAction(intent);
        }

        return s;
    }

    public Timeline getTimeline(Account account, String s, Object obj)
    {
        return a(account, s, (Long)obj);
    }
}
