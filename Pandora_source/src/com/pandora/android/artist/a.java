// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.j;
import com.pandora.android.activity.ForegroundMonitorService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import p.bz.d;
import p.cm.ac;
import p.cn.e;
import p.cw.c;
import p.dd.ap;
import p.dd.at;
import p.dd.bh;

public class com.pandora.android.artist.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/artist/a$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("AUDIO_IMPRESSION", 0);
            b = new a("AUDIO_TILE_IMPRESSION", 1);
            c = new a("FOLLOW_ON_IMPRESSION", 2);
            d = new a("SKIP", 3);
            e = new a("AUDIO_TILE_CLICK", 4);
            f = new a("FOLLOW_ON_CLICK", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s1, int i)
        {
            super(s1, i);
        }
    }


    private com.pandora.radio.data.c a;
    private y b;

    public com.pandora.android.artist.a()
    {
        a("Created");
        b.a.b().b(this);
        b.a.e().c(this);
    }

    public static void a(Context context, com.pandora.radio.data.c c1)
    {
        a(c1, a.f);
        if (!s.a(c1.e()))
        {
            b(context, c1);
        }
    }

    public static void a(com.pandora.radio.data.c c1, a a1)
    {
        (new ac()).a_(new Object[] {
            b.a.b(), c1, a1
        });
        p.df.a.a("ArtistMessageFollowOnManager", "sendArtisMessageMetric: metric<%s>, artistMessageTrackData %s", new Object[] {
            a1, c1
        });
    }

    private void a(String s1)
    {
        p.df.a.c("ArtistMessageFollowOnManager", "ArtistMessageFolloOnManager - %s", new Object[] {
            s1
        });
    }

    private void a(bh bh1)
    {
        bh1 = bh1.b;
        if (bh1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.pandora.radio.data.c c1;
        if (bh1.l() != com.pandora.radio.data.ac.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        a("ArtistMessage handleTrackStarted ");
        c1 = (com.pandora.radio.data.c)bh1;
        a((com.pandora.radio.data.c)bh1, a.a);
        if (ForegroundMonitorService.a() || !c1.r_()) goto _L1; else goto _L3
_L3:
        a = c1;
        return;
        if (!bh1.M()) goto _L1; else goto _L4
_L4:
        a = null;
        return;
    }

    private CoachmarkBuilder b()
    {
        CoachmarkBuilder coachmarkbuilder = null;
        if (c())
        {
            a("createArtistMessageFollowOnBuilder");
            coachmarkbuilder = (new CoachmarkBuilder()).b(false).b(a.t()).a(a.f()).c(0x7f0800a5).e(a.d()).a(com.pandora.android.coachmark.e.b.a).a(a).f(false).a(com.pandora.android.coachmark.e.e.p);
        }
        return coachmarkbuilder;
    }

    public static void b(Context context, com.pandora.radio.data.c c1)
    {
        String s1 = c1.e();
        if (!s.a(s1))
        {
            if (c1.s_())
            {
                c1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                c1.addFlags(32768);
                if (c1.resolveActivity(context.getPackageManager()) != null)
                {
                    context.startActivity(c1);
                    return;
                }
            } else
            {
                s.a(s1, c1.b(), c1.d());
                return;
            }
        }
    }

    private boolean c()
    {
        return a != null && !e.a().b(a) && b.b() == a.q();
    }

    public void a()
    {
        a("cleanup");
        b.a.b().c(this);
        b.a.e().b(this);
        a = null;
    }

    public void onApplicationFocusChanged(d d1)
    {
        if (d1.b != p.bz.d.a.b)
        {
            a((new StringBuilder()).append("onApplicationFocusChanged: foreground = true; activity = ").append(d1.a).toString());
            d1 = b();
            if (d1 != null)
            {
                PandoraIntent pandoraintent = new PandoraIntent("show_coachmark");
                pandoraintent.putExtra("intent_coachmark_builder", d1);
                pandoraintent.putExtra("intent_track_data", a);
                b.a.C().a(pandoraintent);
                a = null;
                return;
            }
        }
    }

    public void onSkipTrack(ap ap1)
    {
        ap1 = ap1.a;
        if (ap1 != null && ap1.l() == com.pandora.radio.data.ac.c)
        {
            a((com.pandora.radio.data.c)ap1, com.pandora.android.artist.a.d);
        }
    }

    public void onStationData(at at1)
    {
        b = at1.a;
    }

    public void onTrackState(bh bh1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 5: // '\005'
            a(bh1);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }
}
