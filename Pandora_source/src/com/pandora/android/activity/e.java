// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.pandora.android.data.AlarmData;
import com.pandora.android.util.p;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.StationProvider;
import com.pandora.radio.provider.i;
import com.pandora.radio.util.j;
import java.util.ArrayList;
import p.ca.ab;
import p.ca.af;
import p.ca.aj;
import p.ca.q;
import p.ca.s;
import p.ca.t;
import p.ca.v;
import p.ca.x;
import p.cb.a;
import p.cb.d;
import p.cb.f;
import p.cb.g;
import p.cp.b;
import p.cw.c;

public class e
{

    public static x a(Context context, p p1, Intent intent)
    {
        Object obj = null;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.values().length];
                try
                {
                    a[p.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    a[p.i.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    a[p.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    a[p.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[p.h.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[p.d.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[p.c.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[p.b.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[p.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[p.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[p.l.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[p.n.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[p.m.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[p.q.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[p.p.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[p.o.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[p.r.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[p.u.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[p.v.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[p.w.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[p.z.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[p.s.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.t.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.x.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.y.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.A.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.activity._cls1.a[p1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Stations content:  ").append(p1).toString());

        case 2: // '\002'
            context = (j)intent.getSerializableExtra("intent_search_result_consumer");
            if (context == null)
            {
                throw new IllegalStateException("intent_search_result_consumer is missing from intent.");
            }
            obj = v.a(intent.getStringExtra("intent_genre_category_name"), intent.getStringExtra("intent_genre_name"), intent.getStringExtra("intent_category_gcat"), intent.getStringExtra("intent_category_ad_url"), (ArrayList)intent.getSerializableExtra("intent_stations_list"), context);
            // fall through

        case 1: // '\001'
            return ((x) (obj));

        case 3: // '\003'
            return p.ca.j.a(p.cp.b.b(intent.getStringExtra("intent_station_token")), true, -1, true, true);

        case 4: // '\004'
            p1 = intent.getStringExtra("intent_station_token");
            if (!StationProvider.b())
            {
                StationProvider.a(com.pandora.android.provider.b.a.b());
            }
            intent = com.pandora.android.provider.b.a.b().y().a(context, p1);
            if (intent != null && !intent.k())
            {
                return q.a(p.cp.b.c(p1), true, null, q.a, 1986, "saveClicked", context.getString(0x7f08013d));
            } else
            {
                return p.ca.j.a(p.cp.b.b(p1), true, -1, true, true);
            }

        case 5: // '\005'
            context = (j)intent.getSerializableExtra("intent_search_result_consumer");
            if (context == null)
            {
                throw new IllegalStateException("intent_search_result_consumer is missing from intent.");
            } else
            {
                return t.a(context);
            }

        case 6: // '\006'
            p1 = intent.getStringExtra("intent_station_token");
            context = com.pandora.android.provider.b.a.b().y().a(context, p1).d();
            return p.ca.c.a(new com.pandora.android.util.c(intent.getStringExtra("intent_station_token"), context, null), p1, intent.getBooleanExtra("intent_advertiser_station", false));

        case 7: // '\007'
            boolean flag = intent.getBooleanExtra("intent_advertiser_station", false);
            return af.a(new com.pandora.radio.util.c(null), false, flag);

        case 8: // '\b'
            p1 = (j)intent.getSerializableExtra("intent_search_result_consumer");
            break;
        }
        if (p1 == null)
        {
            throw new UnsupportedOperationException("INTENT_SEARCH_RESULT_CONSUMER is missing");
        }
        obj = (MusicSearchData)intent.getParcelableExtra("intent_search_results");
        String s1 = intent.getStringExtra("intent_search_query");
        if (obj == null || ((MusicSearchData) (obj)).g() == 0)
        {
            Toast.makeText(context, 0x7f08016e, 1).show();
            return null;
        } else
        {
            return af.a(p1, intent.getBooleanExtra("intent_search_add_variety", false), intent.getBooleanExtra("intent_advertiser_station", false), ((MusicSearchData) (obj)), s1);
        }
    }

    public static x b(Context context, p p1, Intent intent)
    {
        context = null;
        switch (com.pandora.android.activity._cls1.a[p1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid FeedView content :  ").append(p1).toString());

        case 10: // '\n'
            context = s.a(false);
            // fall through

        case 9: // '\t'
            return context;
        }
    }

    public static x c(Context context, p p1, Intent intent)
    {
        Object obj = null;
        switch (com.pandora.android.activity._cls1.a[p1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Profile content:  ").append(p1).toString());

        case 11: // '\013'
            p1 = intent.getStringExtra("intent_webname");
            context = obj;
            if (p1 != null)
            {
                context = p.ca.j.a(p.cp.b.e(p1), true, -1, true, true);
            }
            return context;

        case 12: // '\f'
            return p.ca.j.a(p.cp.b.j(), true, -1, true, true);

        case 13: // '\r'
            return q.a(p.cp.b.i(), true, null, q.a, 1310, "saveClicked", context.getString(0x7f08013c));

        case 14: // '\016'
            return p.ca.j.a(p.cp.b.m(), true, -1, true, true);

        case 15: // '\017'
            return p.ca.j.a(p.cp.b.l(), true, -1, true, true);

        case 16: // '\020'
            return p.ca.j.a(p.cp.b.k(), true, -1, true, true);
        }
    }

    public static x d(Context context, p p1, Intent intent)
    {
        context = null;
        switch (com.pandora.android.activity._cls1.a[p1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Settings content:  ").append(p1).toString());

        case 18: // '\022'
            context = new a();
            // fall through

        case 17: // '\021'
            return context;

        case 19: // '\023'
            return new d();

        case 20: // '\024'
            return new p.cb.b();

        case 21: // '\025'
            return new p.cb.e();

        case 22: // '\026'
            return ab.a(p.cp.b.e(), true, -1);

        case 23: // '\027'
            return new f();

        case 24: // '\030'
            return g.e();

        case 25: // '\031'
            return aj.a((AlarmData)intent.getExtras().get("intent_alarm_data"));

        case 26: // '\032'
            return new com.pandora.android.artist.c();
        }
    }
}
