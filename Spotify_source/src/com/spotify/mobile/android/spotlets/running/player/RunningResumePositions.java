// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.player;

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import gcf;
import ggb;
import gin;
import gip;
import giq;
import gng;
import gni;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class RunningResumePositions
{

    public static final gip a = gip.b("running.resume-positions");
    private static long e;
    public final ObjectMapper b;
    public gin c;
    public ResumePositions d;

    public RunningResumePositions(Context context)
    {
        dmz.a(ggb);
        ggb.a();
        c = ((giq)dmz.a(giq)).b(context);
        b = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public final void a()
    {
        if (d == null)
        {
            if (c.f(a))
            {
                Object obj = c.a(a, null);
                long l;
                if (obj != null)
                {
                    try
                    {
                        d = (ResumePositions)b.readValue(((String) (obj)), com/spotify/mobile/android/spotlets/running/player/RunningResumePositions$ResumePositions);
                    }
                    catch (IOException ioexception)
                    {
                        Logger.c("Failed reading resume positions: %s", new Object[] {
                            ioexception.getMessage()
                        });
                    }
                }
            }
            if (d == null)
            {
                d = new ResumePositions(null);
            }
        }
        l = gcf.a();
        obj = d.items.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (((ResumePosition)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()).timestamp + e < l)
            {
                ((Iterator) (obj)).remove();
            }
        } while (true);
    }

    static 
    {
        e = TimeUnit.HOURS.toMillis(1L);
    }

    private class ResumePositions
        implements JacksonModel
    {
        private class LRUHashMap extends LinkedHashMap
            implements JacksonModel
        {

            private static final long serialVersionUID = 0xc07672b844093c2bL;

            protected boolean removeEldestEntry(java.util.Map.Entry entry)
            {
                return super.size() > 100;
            }

            public LRUHashMap()
            {
                super(Math.max(101, 0), 1.0F, true);
            }
        }


        public final LRUHashMap items;

        public ResumePositions(LRUHashMap lruhashmap)
        {
            if (lruhashmap == null)
            {
                lruhashmap = new LRUHashMap();
            }
            items = lruhashmap;
        }
    }


    private class ResumePosition
        implements JacksonModel
    {

        public final int page;
        public final long position;
        public final long timestamp;
        public final int track;

        public ResumePosition(int i, int j, long l, long l1)
        {
            page = i;
            track = j;
            position = l;
            timestamp = l1;
        }
    }

}
