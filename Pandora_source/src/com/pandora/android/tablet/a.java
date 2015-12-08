// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.widget.Toast;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.artist.c;
import com.pandora.android.data.AlarmData;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.data.af;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import java.util.ArrayList;
import p.ca.aa;
import p.ca.ab;
import p.ca.ag;
import p.ca.aj;
import p.ca.ak;
import p.ca.am;
import p.ca.an;
import p.ca.ap;
import p.ca.as;
import p.ca.at;
import p.ca.av;
import p.ca.aw;
import p.ca.ba;
import p.ca.bc;
import p.ca.j;
import p.ca.s;
import p.ca.u;
import p.ca.w;
import p.ca.z;
import p.cb.b;
import p.cb.d;
import p.cb.e;
import p.cb.f;
import p.cb.g;

public class com.pandora.android.tablet.a
{
    public static class a
    {

        public boolean a;
        public boolean b;
        public boolean c;

        public a()
        {
            a = false;
            b = false;
            c = false;
        }
    }


    private static final TabletHome.d g;
    TabletHome.c a;
    TabletHome.a b;
    TabletHome.d c;
    TabletHome.e d;
    TabletHome.b e;
    TabletHome.b f;
    private final com.pandora.android.coachmark.e h;
    private h i;
    private Fragment j;
    private Fragment k;
    private Fragment l;
    private Fragment m;
    private Fragment n;
    private boolean o;
    private final Context p;

    com.pandora.android.tablet.a(h h1, Context context, com.pandora.android.coachmark.e e1)
    {
        d = com.pandora.android.tablet.TabletHome.e.b;
        o = false;
        i = h1;
        h = e1;
        android.support.v4.app.h.a(true);
        p = context;
    }

    private Fragment a(Intent intent, TabletHome.d d1, String s1)
    {
        boolean flag = false;
        p.df.a.a("TabletStateHelper", (new StringBuilder()).append("Getting new fragment for ThirdPane: ").append(d1).toString());
        static class _cls1
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[TabletHome.d.values().length];
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.h.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.k.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    c[TabletHome.d.l.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                try
                {
                    c[TabletHome.d.m.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    c[TabletHome.d.n.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    c[TabletHome.d.o.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    c[TabletHome.d.r.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.j.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    c[TabletHome.d.p.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.i.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    c[TabletHome.d.q.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.y.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.c.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.d.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.g.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.f.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.e.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    c[TabletHome.d.a.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.b.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.s.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    c[TabletHome.d.t.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.u.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    c[TabletHome.d.x.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    c[TabletHome.d.v.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    c[com.pandora.android.tablet.TabletHome.d.w.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                b = new int[TabletHome.c.values().length];
                try
                {
                    b[TabletHome.c.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[com.pandora.android.tablet.TabletHome.c.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[com.pandora.android.tablet.TabletHome.c.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[com.pandora.android.tablet.TabletHome.c.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[com.pandora.android.tablet.TabletHome.c.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.pandora.android.tablet.TabletHome.c.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.pandora.android.tablet.TabletHome.c.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.pandora.android.tablet.TabletHome.c.g.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[TabletHome.a.values().length];
                try
                {
                    a[com.pandora.android.tablet.TabletHome.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[TabletHome.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.tablet.TabletHome.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.tablet.TabletHome.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.tablet._cls1.c[d1.ordinal()])
        {
        default:
            throw new IllegalStateException(String.format("ThirdPane.%s has no new Fragment implementation", new Object[] {
                d1
            }));

        case 18: // '\022'
            return at.c(aw.b(s1, true, -1, true, true));

        case 12: // '\f'
        case 13: // '\r'
            return av.c(aw.b(s1, true, -1, true, true));

        case 1: // '\001'
            return ak.e();

        case 2: // '\002'
            return p.cb.a.e();

        case 11: // '\013'
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = (AlarmData)intent.getParcelableExtra("intent_alarm_data");
            }
            return aj.a(intent);

        case 3: // '\003'
        case 7: // '\007'
            return p.cb.d.e();

        case 4: // '\004'
            return p.cb.b.e();

        case 6: // '\006'
            return new c();

        case 8: // '\b'
            return p.cb.f.e();

        case 9: // '\t'
            return p.cb.g.e();

        case 10: // '\n'
            return ab.a(p.cp.b.e(), true, -1);

        case 5: // '\005'
            return p.cb.e.e();

        case 14: // '\016'
            return a(intent, p.cp.b.j());

        case 15: // '\017'
            return a(intent, p.cp.b.m());

        case 16: // '\020'
            return a(intent, p.cp.b.l());

        case 17: // '\021'
            return a(intent, p.cp.b.k());

        case 19: // '\023'
            if (intent != null)
            {
                flag = intent.getBooleanExtra("intent_find_people_show_empty_state", false);
            }
            return s.a(flag);

        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            return b(intent, s1);

        case 23: // '\027'
        case 24: // '\030'
            return b(intent, s1);

        case 25: // '\031'
            return p.cj.c.a(intent.getExtras());
        }
    }

    private Fragment a(Intent intent, String s1)
    {
        if (com.pandora.android.util.s.a(s1))
        {
            p.df.a.a("TabletStateHelper", "Illegal State: Attempt to launch third pane without url");
            return a(intent, com.pandora.android.tablet.TabletHome.d.c, ((String) (null)));
        } else
        {
            intent = new aw();
            intent.setArguments(aw.b(s1, true, -1, true, true));
            intent.a(d);
            return intent;
        }
    }

    private String a(Intent intent, TabletHome.d d1)
    {
        String s1;
        String s2;
        s2 = d(intent);
        if (intent != null)
        {
            s1 = intent.getStringExtra("intent_webname");
        } else
        {
            s1 = com.pandora.android.provider.b.a.d().j();
        }
        com.pandora.android.tablet._cls1.c[d1.ordinal()];
        JVM INSTR tableswitch 13 24: default 88
    //                   13 192
    //                   14 120
    //                   15 124
    //                   16 128
    //                   17 132
    //                   18 208
    //                   19 88
    //                   20 136
    //                   21 136
    //                   22 136
    //                   23 164
    //                   24 164;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L8 _L8 _L8 _L9 _L9
_L1:
        p.df.a.a("TabletStateHelper", "ThirdPane.%s has no URL logic.", new Object[] {
            d1
        });
        d1 = null;
_L11:
        return d1;
_L3:
        return p.cp.b.j();
_L4:
        return p.cp.b.m();
_L5:
        return p.cp.b.l();
_L6:
        return p.cp.b.k();
_L8:
        if (intent != null)
        {
            intent = intent.getStringExtra("intent_detail_url");
        } else
        {
            intent = null;
        }
        d1 = intent;
        if (intent == null) goto _L11; else goto _L10
_L10:
        return p.cp.b.a(intent);
_L9:
        if (intent != null)
        {
            intent = intent.getStringExtra("intent_station_token");
        } else
        {
            intent = null;
        }
        if (intent == null)
        {
            return null;
        } else
        {
            return p.cp.b.b(intent);
        }
_L2:
        if (!com.pandora.android.util.s.a(s2))
        {
            return s2;
        } else
        {
            return p.cp.b.e(s1);
        }
_L7:
        if (!com.pandora.android.util.s.a(s2))
        {
            return s2;
        } else
        {
            return p.cp.b.f(s1);
        }
    }

    private void a(TabletHome.d d1, Fragment fragment, Intent intent, String s1)
    {
        com.pandora.android.tablet._cls1.c[d1.ordinal()];
        JVM INSTR tableswitch 14 24: default 68
    //                   14 85
    //                   15 85
    //                   16 85
    //                   17 85
    //                   18 68
    //                   19 68
    //                   20 85
    //                   21 85
    //                   22 85
    //                   23 85
    //                   24 85;
           goto _L1 _L2 _L2 _L2 _L2 _L1 _L1 _L2 _L2 _L2 _L2 _L2
_L1:
        p.df.a.a("TabletStateHelper", "ThirdPane.%s has no restoration logic.", new Object[] {
            d1
        });
_L4:
        return;
_L2:
        if (!o && !com.pandora.android.util.s.a(s1))
        {
            a((aw)fragment, s1);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(aw aw1, String s1)
    {
        if (!aw1.d(s1))
        {
            aw1.e(s1);
        }
    }

    private boolean a(Intent intent, TabletHome.a a1)
    {
        boolean flag1 = false;
        boolean flag = false;
        Fragment fragment;
        boolean flag2;
        if (a1 == null)
        {
            if (com.pandora.android.provider.b.a.b().d().t() == null)
            {
                intent = com.pandora.android.tablet.TabletHome.a.b;
            } else
            {
                intent = TabletHome.a.a;
            }
        } else
        {
            intent = a1;
        }
        a1 = i.a();
        if (b == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        b = intent;
        p.df.a.a("TabletStateHelper", (new StringBuilder()).append("TabletState.setCenterPane() --> centerPaneContent : ").append(b).toString());
        _cls1.a[b.ordinal()];
        JVM INSTR tableswitch 1 4: default 124
    //                   1 162
    //                   2 238
    //                   3 383
    //                   4 422;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_383;
_L5:
        break MISSING_BLOCK_LABEL_422;
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid CenterPane content :  ").append(b).toString());
_L2:
        if (!b(p/ca/aw, a1))
        {
            l = new aw();
            l.setArguments(p.ca.j.b(p.cp.b.a(), true, -1, true, true));
            a1.b(0x7f1002c7, l, "center_pane1");
            flag = true;
        }
_L6:
        if (flag)
        {
            a1.c();
            i.b();
            return true;
        } else
        {
            return flag2;
        }
_L3:
        intent = i.a("center_pane1");
        fragment = i.a("center_pane2");
        if (a(((Fragment) (intent)), p/ca/ba))
        {
            l = intent;
            a1.c(l);
            flag = flag1;
        } else
        {
            l = (Fragment)ba.a(true, true, h);
            a1.b(0x7f1002c7, l, "center_pane1");
            flag = true;
        }
        if (a(fragment, p/ca/bc))
        {
            m = fragment;
            a1.c(m);
        } else
        {
            m = bc.d(true);
            a1.b(0x7f1002c8, m, "center_pane2");
            flag = true;
        }
          goto _L6
        if (!b(p/ca/z, a1))
        {
            l = z.a();
            a1.b(0x7f1002c7, l, "center_pane1");
            flag = true;
        }
          goto _L6
        throw new IllegalArgumentException((new StringBuilder()).append("Not valid for ").append(com.pandora.android.tablet.TabletHome.b.b).append(" configuration : ").append(b).toString());
    }

    private boolean a(Intent intent, TabletHome.c c1)
    {
        boolean flag;
        flag = false;
        a = c1;
        p.df.a.a("TabletStateHelper", (new StringBuilder()).append("TabletState.setStationPane() --> stationPaneContent : ").append(a).toString());
        c1 = i.a();
        com.pandora.android.tablet._cls1.b[a.ordinal()];
        JVM INSTR tableswitch 1 8: default 100
    //                   1 131
    //                   2 188
    //                   3 229
    //                   4 345
    //                   5 388
    //                   6 465
    //                   7 510
    //                   8 563;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid StationPane content :  ").append(a).toString());
_L2:
        if (!a(p/ca/ap, ((k) (c1))))
        {
            j = ap.e();
            flag = true;
        }
_L11:
        if (flag)
        {
            c1.b(0x7f1002bf, j, "station_pane");
            c1.c();
            i.b();
        }
        return flag;
_L3:
        if (!a(p/ca/u, ((k) (c1))))
        {
            j = u.a((com.pandora.radio.util.j)intent.getSerializableExtra("intent_search_result_consumer"), intent.getBundleExtra("intent_extra_key"));
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!a(p/ca/w, ((k) (c1))))
        {
            com.pandora.radio.util.j j1 = (com.pandora.radio.util.j)intent.getSerializableExtra("intent_search_result_consumer");
            if (j1 == null)
            {
                throw new UnsupportedOperationException((new StringBuilder()).append("INTENT_SEARCH_RESULT_CONSUMER is missing for ").append(a).toString());
            }
            j = w.a(intent.getStringExtra("intent_genre_category_name"), intent.getStringExtra("intent_genre_name"), intent.getStringExtra("intent_category_gcat"), intent.getStringExtra("intent_category_ad_url"), (ArrayList)intent.getSerializableExtra("intent_stations_list"), j1, intent.getBundleExtra("intent_extra_key"));
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (!a(p/ca/am, ((k) (c1))))
        {
            intent = intent.getStringExtra("intent_station_list_sort_order");
            j = an.b(p.getString(0x7f080264), intent);
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!a(p/ca/ag, ((k) (c1))))
        {
            String s1 = intent.getStringExtra("intent_station_token");
            j = ag.b(new com.pandora.android.util.c(s1, com.pandora.android.provider.b.a.b().y().a(p, s1).d(), null), intent.getBooleanExtra("intent_search_add_variety", false), intent.getBooleanExtra("intent_advertiser_station", false));
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (!a(p/ca/ag, ((k) (c1))))
        {
            flag = intent.getBooleanExtra("intent_advertiser_station", false);
            j = ag.b(new com.pandora.radio.util.c(null), false, flag);
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (!a(p/ca/as, ((k) (c1))))
        {
            com.pandora.radio.util.j j2 = (com.pandora.radio.util.j)intent.getSerializableExtra("intent_search_result_consumer");
            j = as.a((StationRecommendations)intent.getParcelableExtra("intent_station_recommendations"), j2, intent.getBundleExtra("intent_extra_key"));
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        MusicSearchData musicsearchdata = (MusicSearchData)intent.getParcelableExtra("intent_search_results");
        boolean flag1 = intent.getBooleanExtra("intent_search_add_variety", false);
        String s2 = intent.getStringExtra("intent_search_query");
        boolean flag2 = intent.getBooleanExtra("intent_advertiser_station", false);
        if ((TabletHome.d)intent.getSerializableExtra("tablet_home_third_pane_view") == com.pandora.android.tablet.TabletHome.d.b)
        {
            a(intent, com.pandora.android.tablet.TabletHome.d.b, true);
        } else
        if (!a(p/ca/ag, ((k) (c1))))
        {
            if (musicsearchdata == null || musicsearchdata.g() == 0)
            {
                com.pandora.android.util.s.k();
                if (intent.getIntExtra("intent_search_id", 0) != 0x2942b588)
                {
                    Toast.makeText(p, 0x7f08016e, 1).show();
                }
                if (!a(p/ca/ap, ((k) (c1))))
                {
                    j = ap.e();
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                intent = (com.pandora.radio.util.j)intent.getSerializableExtra("intent_search_result_consumer");
                if (intent == null)
                {
                    throw new UnsupportedOperationException("INTENT_SEARCH_RESULT_CONSUMER is missing");
                }
                j = ag.c(intent, flag1, flag2, musicsearchdata, s2);
                flag = true;
            }
        } else
        {
            intent = new PandoraIntent("action_populate_search_results");
            intent.putExtra("intent_search_results", musicsearchdata);
            intent.putExtra("intent_advertiser_station", flag2);
            intent.putExtra("intent_search_query", s2);
            intent.putExtra("intent_search_add_variety", flag1);
            intent.putExtra("intent_task_id", p.ca.af.n);
            com.pandora.android.provider.b.a.C().a(intent);
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    private boolean a(Fragment fragment, Class class1)
    {
        return fragment != null && class1.isInstance(fragment);
    }

    private boolean a(Class class1)
    {
        return a(i.a("third_pane"), class1);
    }

    private boolean a(Class class1, k k1)
    {
        k1 = i.a("station_pane");
        if (a(((Fragment) (k1)), class1))
        {
            j = k1;
            return true;
        } else
        {
            return false;
        }
    }

    private Fragment b(Intent intent, String s1)
    {
        if (com.pandora.android.util.s.a(s1))
        {
            p.df.a.a("TabletStateHelper", "Illegal State: Attempt to launch third pane without url");
            return a(intent, TabletHome.d.a, ((String) (null)));
        } else
        {
            intent = new aw();
            intent.setArguments(aw.b(s1, true, -1, true, true));
            intent.a(d);
            return intent;
        }
    }

    private TabletHome.e b(TabletHome.d d1)
    {
        switch (com.pandora.android.tablet._cls1.c[d1.ordinal()])
        {
        default:
            throw new IllegalStateException(String.format("ThirdPane.%s has no associated ThirdPaneType!!", new Object[] {
                d1
            }));

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            return com.pandora.android.tablet.TabletHome.e.c;

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            return com.pandora.android.tablet.TabletHome.e.b;

        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
            return TabletHome.e.a;

        case 25: // '\031'
            return com.pandora.android.tablet.TabletHome.e.d;
        }
    }

    private void b(Bundle bundle)
    {
        if (bundle != null && !bundle.isEmpty())
        {
            c = (TabletHome.d)bundle.get("third_pane");
        }
    }

    private boolean b(TabletHome.d d1, Fragment fragment, Intent intent, String s1)
    {
        switch (com.pandora.android.tablet._cls1.c[d1.ordinal()])
        {
        default:
            p.df.a.a("TabletStateHelper", "ThirdPane.%s has no force-refresh logic", new Object[] {
                d1
            });
            return false;

        case 18: // '\022'
            ((at)fragment).d(s1);
            return true;

        case 13: // '\r'
            ((av)fragment).b(s1, true);
            return true;

        case 25: // '\031'
            n = a(intent, d1, s1);
            break;
        }
        i.a().b(0x7f1002cb, n, "third_pane").b();
        i.b();
        return true;
    }

    private boolean b(Class class1, k k1)
    {
        Fragment fragment = i.a("center_pane1");
        Fragment fragment1 = i.a("center_pane2");
        if (a(fragment1, class1))
        {
            m = fragment1;
            k1.b(m);
        }
        if (a(fragment, class1))
        {
            l = fragment;
            k1.c(l);
            return true;
        } else
        {
            return false;
        }
    }

    private Class c(TabletHome.d d1)
    {
        switch (com.pandora.android.tablet._cls1.c[d1.ordinal()])
        {
        default:
            throw new IllegalStateException(String.format("ThirdPane.%s has no associated Fragment class!!", new Object[] {
                d1
            }));

        case 18: // '\022'
            return p/ca/at;

        case 12: // '\f'
        case 13: // '\r'
            return p/ca/av;

        case 1: // '\001'
            return p/ca/ak;

        case 2: // '\002'
            return p/cb/a;

        case 11: // '\013'
            return p/ca/aj;

        case 3: // '\003'
        case 7: // '\007'
            return p/cb/d;

        case 4: // '\004'
            return p/cb/b;

        case 6: // '\006'
            return com/pandora/android/artist/c;

        case 8: // '\b'
            return p/cb/f;

        case 9: // '\t'
            return p/cb/g;

        case 10: // '\n'
            return p/ca/ab;

        case 5: // '\005'
            return p/cb/e;

        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            return p/ca/aw;

        case 19: // '\023'
            return p/ca/s;

        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
            return p/ca/aw;

        case 25: // '\031'
            return p/cj/c;
        }
    }

    private String d(Intent intent)
    {
        if (intent != null && intent.getExtras() != null)
        {
            return intent.getStringExtra("intent_detail_url");
        } else
        {
            return null;
        }
    }

    private Bundle j()
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("third_pane", c);
        return bundle;
    }

    private void k()
    {
        Fragment fragment = i.a("center_single_pane");
        if (fragment != null)
        {
            i.a().a(fragment).b();
            k = null;
        }
    }

    Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("tablet_home_configuration", e);
        bundle.putSerializable("tablet_home_station_pane_view", a);
        bundle.putSerializable("tablet_home_center_pane_view", b);
        bundle.putSerializable("tablet_home_third_pane_view", c);
        bundle.putBundle("intent_tablet_third_pane_state", j());
        return bundle;
    }

    void a(Bundle bundle)
    {
        boolean flag;
        if (bundle != null && !bundle.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        if (o && bundle.containsKey("intent_tablet_third_pane_state"))
        {
            b(bundle.getBundle("intent_tablet_third_pane_state"));
        }
    }

    void a(TabletHome.b b1)
    {
        e = b1;
        if (e != com.pandora.android.tablet.TabletHome.b.c)
        {
            f = e;
        }
    }

    void a(boolean flag)
    {
        if (flag)
        {
            e = com.pandora.android.tablet.TabletHome.b.c;
            return;
        }
        if (f == null)
        {
            f = com.pandora.android.tablet.TabletHome.b.b;
        }
        e = f;
    }

    boolean a(Intent intent)
    {
        b = (TabletHome.a)intent.getSerializableExtra("tablet_home_center_pane_view");
        p.df.a.a("TabletStateHelper", (new StringBuilder()).append("TabletState.setSinglePane --> centerPaneContent : ").append(b).toString());
        switch (_cls1.a[b.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid CenterPane content :  ").append(b).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            throw new IllegalArgumentException((new StringBuilder()).append("Not valid for ").append(TabletHome.b.a).append(" configuration : ").append(b).toString());

        case 4: // '\004'
            intent = i.a();
            break;
        }
        Fragment fragment = i.a("station_pane");
        if (fragment != null)
        {
            intent.a(fragment);
            j = null;
            a = null;
        }
        fragment = i.a("center_pane2");
        if (fragment != null)
        {
            intent.a(fragment);
            m = null;
        }
        fragment = i.a("center_pane1");
        if (fragment != null)
        {
            intent.a(fragment);
            l = null;
        }
        fragment = i.a("third_pane");
        if (fragment != null)
        {
            intent.b(fragment);
            n = null;
            c = null;
        }
        c = null;
        fragment = i.a("center_single_pane");
        if (a(fragment, p/ca/aa))
        {
            intent.c(fragment);
            k = fragment;
            return true;
        } else
        {
            k = aa.a();
            intent.b(0x7f1002c4, k, "center_single_pane");
            intent.c();
            i.b();
            return false;
        }
    }

    boolean a(Intent intent, TabletHome.d d1, boolean flag)
    {
        c = d1;
        d = b(d1);
        boolean flag1 = false;
        Class class1 = c(d1);
        String s1 = a(intent, d1);
        if (a(class1))
        {
            n = i.a("third_pane");
            a(d1, n, intent, s1);
            if (flag)
            {
                flag1 = b(d1, n, intent, s1);
            }
        } else
        {
            n = a(intent, d1, s1);
            i.a().b(0x7f1002cb, n, "third_pane").b();
            i.b();
            flag1 = true;
        }
        com.pandora.android.provider.b.a.b().o().b(d.toString());
        return flag1;
    }

    boolean a(Intent intent, TabletHome.d d1, boolean flag, long l1)
    {
        boolean flag1 = flag;
        if (!flag)
        {
            flag1 = flag;
            if (l1 > 0L)
            {
                if (System.currentTimeMillis() - l1 > 0x927c0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
            }
        }
        return a(intent, d1, flag1);
    }

    boolean a(TabletHome.a a1)
    {
        return b == a1;
    }

    boolean a(TabletHome.c c1)
    {
        return a == c1;
    }

    boolean a(TabletHome.d d1)
    {
        return c == d1;
    }

    a b(Intent intent)
    {
        p.df.a.a("TabletStateHelper", (new StringBuilder()).append("TabletHome.TabletStateHelper.setStationPaneCenterPane() -->").append(intent.getExtras()).toString());
        k();
        a a1 = new a();
        TabletHome.c c1 = (TabletHome.c)intent.getSerializableExtra("tablet_home_station_pane_view");
        Object obj = (TabletHome.a)intent.getSerializableExtra("tablet_home_center_pane_view");
        a1.a = a(intent, c1);
        if (obj != null || b == null)
        {
            a1.b = a(intent, ((TabletHome.a) (obj)));
        }
        obj = (TabletHome.d)intent.getSerializableExtra("tablet_home_third_pane_view");
        if (c == null || obj == com.pandora.android.tablet.TabletHome.d.b)
        {
            TabletHome.d d1 = ((TabletHome.d) (obj));
            if (obj == null)
            {
                d1 = g;
            }
            a1.c = a(intent, d1, false);
        }
        return a1;
    }

    void b()
    {
        c = null;
    }

    Fragment c()
    {
        return j;
    }

    a c(Intent intent)
    {
        k();
        a a2 = new a();
        TabletHome.a a1 = (TabletHome.a)intent.getSerializableExtra("tablet_home_center_pane_view");
        a2.c = a(intent, (TabletHome.d)intent.getSerializableExtra("tablet_home_third_pane_view"), intent.getBooleanExtra("intent_force_refresh", false));
        if (b == null || a1 != null)
        {
            a2.b = a(intent, a1);
        }
        if (a == null)
        {
            TabletHome.c c2 = (TabletHome.c)intent.getSerializableExtra("tablet_home_station_pane_view");
            TabletHome.c c1 = c2;
            if (c2 == null)
            {
                c1 = TabletHome.c.a;
            }
            a2.a = a(intent, c1);
        }
        return a2;
    }

    Fragment d()
    {
        return l;
    }

    Fragment e()
    {
        return m;
    }

    Fragment f()
    {
        return n;
    }

    TabletHome.e g()
    {
        return d;
    }

    boolean h()
    {
        return a(null, g, false);
    }

    boolean i()
    {
        return e == com.pandora.android.tablet.TabletHome.b.c;
    }

    static 
    {
        g = TabletHome.d.a;
    }
}
