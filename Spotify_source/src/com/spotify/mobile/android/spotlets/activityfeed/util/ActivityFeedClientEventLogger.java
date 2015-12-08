// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.util;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StoryModel;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dmz;
import fop;
import java.util.Collections;
import java.util.HashSet;

public final class ActivityFeedClientEventLogger
{

    public com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment.Type a;
    public HashSet b;
    private final Context c;

    public ActivityFeedClientEventLogger(Context context, Bundle bundle)
    {
        dmz.a(fop);
        c = context;
        b = new HashSet();
        if (bundle != null)
        {
            context = bundle.getStringArray("activity_feed_logger_logged_story_impressions");
            if (context != null)
            {
                Collections.addAll(b, context);
            }
        }
    }

    private void a(ClientEvent clientevent, long l)
    {
        clientevent.a("duration_in_ms", String.valueOf(l));
        a(clientevent, ((StoryModel) (null)), 0);
    }

    public final void a(long l, long l1, long l2)
    {
        a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.P, com.spotify.mobile.android.util.ClientEvent.SubEvent.bZ), l2 - l);
        a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.P, com.spotify.mobile.android.util.ClientEvent.SubEvent.bY), l2 - l1);
    }

    public final void a(StoryAction storyaction, StoryModel storymodel, int i)
    {
        com.spotify.mobile.android.util.ClientEvent.SubEvent subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.a;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[StoryAction.values().length];
                try
                {
                    a[StoryAction.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[StoryAction.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[StoryAction.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[StoryAction.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[storyaction.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 65
    //                   2 72
    //                   3 79
    //                   4 86;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        storyaction = subevent;
_L7:
        a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, storyaction), storymodel, i);
        return;
_L2:
        storyaction = com.spotify.mobile.android.util.ClientEvent.SubEvent.bT;
        continue; /* Loop/switch isn't completed */
_L3:
        storyaction = com.spotify.mobile.android.util.ClientEvent.SubEvent.bU;
        continue; /* Loop/switch isn't completed */
_L4:
        storyaction = com.spotify.mobile.android.util.ClientEvent.SubEvent.bV;
        continue; /* Loop/switch isn't completed */
_L5:
        storyaction = com.spotify.mobile.android.util.ClientEvent.SubEvent.N;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(ClientEvent clientevent, StoryModel storymodel, int i)
    {
        ctz.a(a);
        if (storymodel != null)
        {
            clientevent.a("index", Integer.toString(i));
            clientevent.a("comment", storymodel.getDescription());
            clientevent.a("target_uri", storymodel.getId());
            clientevent.a("item_name", storymodel.getResource().getName());
            clientevent.a("item_uri", storymodel.getResource().getUri());
        }
        if (a == com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment.Type.a)
        {
            fop.a(c, ViewUri.q, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
        }
    }

    private class StoryAction extends Enum
    {

        public static final StoryAction a;
        public static final StoryAction b;
        public static final StoryAction c;
        public static final StoryAction d;
        private static final StoryAction e[];

        public static StoryAction valueOf(String s)
        {
            return (StoryAction)Enum.valueOf(com/spotify/mobile/android/spotlets/activityfeed/util/ActivityFeedClientEventLogger$StoryAction, s);
        }

        public static StoryAction[] values()
        {
            return (StoryAction[])e.clone();
        }

        static 
        {
            a = new StoryAction("USER_LINK", 0);
            b = new StoryAction("ITEM_SECTION_LINK", 1);
            c = new StoryAction("REPLAYS_LINK", 2);
            d = new StoryAction("PLAY_BUTTON", 3);
            e = (new StoryAction[] {
                a, b, c, d
            });
        }

        private StoryAction(String s, int i)
        {
            super(s, i);
        }
    }

}
