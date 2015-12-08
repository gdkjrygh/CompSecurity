// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.a.d;
import com.tinder.activities.ActivityLogin;
import com.tinder.adapters.n;
import com.tinder.b.g;
import com.tinder.base.f;
import com.tinder.c.ah;
import com.tinder.c.an;
import com.tinder.c.m;
import com.tinder.d.a;
import com.tinder.e.ab;
import com.tinder.e.ae;
import com.tinder.e.ag;
import com.tinder.e.ap;
import com.tinder.e.c;
import com.tinder.e.q;
import com.tinder.enums.ReportCause;
import com.tinder.enums.UserType;
import com.tinder.events.match.EventMatchUpdated;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ac;
import com.tinder.managers.e;
import com.tinder.managers.i;
import com.tinder.managers.z;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.tinder.utils.v;
import com.tinder.views.BadgeView;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            ag, ah, ai, bm

public final class af extends f
    implements android.support.v4.view.ViewPager.f, ab, ae, c
{

    private m A;
    private int B;
    private int C;
    private ah D;
    private User E;
    i c;
    z d;
    com.tinder.managers.d e;
    ac f;
    a g;
    de.greenrobot.event.c h;
    e i;
    public ViewPager j;
    public n k;
    private int l;
    private int m;
    private int n;
    private ImageView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private View s;
    private View t;
    private View u;
    private View v;
    private BadgeView w;
    private boolean x;
    private boolean y;
    private Match z;

    public af()
    {
        x = false;
        y = false;
    }

    static int a(af af1, int i1)
    {
        af1.m = i1;
        return i1;
    }

    static ViewPager a(af af1)
    {
        return af1.j;
    }

    static m a(af af1, m m1)
    {
        af1.A = m1;
        return m1;
    }

    public static af a(Match match)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("match", match);
        bundle.putBoolean("background", false);
        match = new af();
        match.setArguments(bundle);
        return match;
    }

    private void a(float f1)
    {
        if (l == 0 || m == 0)
        {
            return;
        } else
        {
            u.setPivotX(0.0F);
            float f2 = (float)(int)com.tinder.utils.o.a(f1, 0.0F, l, 1.0F, m) / (float)l;
            u.setScaleX(f2);
            int i1 = (int)com.tinder.utils.o.a(f1, 0.0F, 0.0F, 1.0F, (float)l + (float)n * 1.1F);
            u.setTranslationX(i1);
            return;
        }
    }

    private void a(ReportCause reportcause, String s1, boolean flag)
    {
        ac ac1;
        Match match;
        Object obj;
        int i1;
        if (f())
        {
            return;
        }
        ac1 = f;
        obj = c;
        match = z;
        i1 = 0;
        com.tinder.managers.i._cls5.a[reportcause.ordinal()];
        JVM INSTR tableswitch 1 5: default 72
    //                   1 292
    //                   2 298
    //                   3 304
    //                   4 310
    //                   5 317;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_317;
_L7:
        match.addReportedMask(i1);
        Match match1 = ((i) (obj)).a(match.getId());
        if (match1 != null)
        {
            match1.addReportedMask(i1);
        }
        new g();
        com.tinder.b.g.c(match);
        (new StringBuilder("reportCause: ")).append(reportcause.ordinal()).append(" other details text: ").append(s1);
        i1 = reportcause.ordinal();
        match1 = ((i) (obj)).a(match.getId());
        obj = new JSONObject();
        String s2;
        try
        {
            ((JSONObject) (obj)).put("cause", i1);
            if (!TextUtils.isEmpty(s1))
            {
                ((JSONObject) (obj)).put("text", s1);
            }
        }
        catch (JSONException jsonexception)
        {
            com.tinder.utils.v.b(String.valueOf(jsonexception));
        }
        s2 = (new StringBuilder()).append(ac1.a.p).append(match.getId()).toString();
        reportcause = new com.tinder.managers.ac._cls3(ac1, this, match1, match, s1, reportcause, flag);
        s1 = new com.tinder.managers.ac._cls4(ac1, this, match1);
        ManagerApp.h().g();
        reportcause = new d(1, s2, ((JSONObject) (obj)), reportcause, s1, com.tinder.managers.d.b());
        ManagerApp.b().a(reportcause);
        return;
_L2:
        i1 = 2;
          goto _L7
_L3:
        i1 = 1;
          goto _L7
_L4:
        i1 = 5;
          goto _L7
_L5:
        i1 = 7;
          goto _L7
        i1 = 9;
          goto _L7
    }

    static void a(af af1, q q1)
    {
        if (q1 == null || q1.l())
        {
            af1.c(1);
            af1.j.setCurrentItem(1, true);
            return;
        } else
        {
            af1.c(0);
            af1.j.setCurrentItem(0, true);
            return;
        }
    }

    static void a(af af1, ReportCause reportcause, String s1)
    {
        if (reportcause != null)
        {
            af1.a(reportcause, s1, true);
        }
        Object obj = ((q)af1.getActivity()).k();
        if (obj != null)
        {
            i i1 = af1.c;
            String s2 = ((Match) (obj)).getId();
            obj = (new StringBuilder()).append(i1.c.h).append(s2).toString();
            Match match = i1.a(s2);
            reportcause = new com.tinder.managers.i._cls13(i1, af1, match, s1, reportcause, s2);
            af1 = new com.tinder.managers.i._cls2(i1, ((String) (obj)), af1, match);
            ManagerApp.h().g();
            af1 = new d(3, ((String) (obj)), null, reportcause, af1, com.tinder.managers.d.b());
            ManagerApp.b().a(af1);
        }
    }

    static void a(af af1, ReportCause reportcause, String s1, boolean flag)
    {
        af1.a(reportcause, s1, flag);
    }

    private void a(boolean flag)
    {
        long l1 = 0L;
        User user = d.b();
        SparksEvent sparksevent = new SparksEvent("Chat.Open");
        if (z != null && z.getPerson() != null)
        {
            String s2 = z.getPerson().userId;
            g.j();
            String s1;
            long l2;
            if (z.hasMessages())
            {
                l1 = com.b.a.d.a(z.getMessages()).a(com.tinder.fragments.ag.a()).a();
                l2 = (long)z.getMessages().size() - l1;
                if (((Message)z.getMessages().last()).isFromMe())
                {
                    s1 = "self";
                } else
                {
                    s1 = "other";
                }
            } else
            {
                s1 = "none";
                l2 = 0L;
            }
            sparksevent.put("otherId", s2);
            sparksevent.put("numMessagesOther", Long.valueOf(l2));
            sparksevent.put("numMessagesMe", Long.valueOf(l1));
            sparksevent.put("lastMessageFrom", s1);
        }
        if (z != null)
        {
            sparksevent.put("matchId", z.getId());
        }
        sparksevent.put("fromPush", Boolean.valueOf(flag));
        sparksevent.put("superLike", Boolean.valueOf(z.isTheSuperLiker(user)));
        sparksevent.put("didSuperLike", Boolean.valueOf(z.superLikerIsThem()));
        i.a(sparksevent);
        com.tinder.managers.a.a(sparksevent);
    }

    static boolean a(Message message)
    {
        return message.isFromMe();
    }

    static int b(af af1, int i1)
    {
        af1.l = i1;
        return i1;
    }

    static m b(af af1)
    {
        return af1.A;
    }

    static boolean b(Message message)
    {
        return message.isFromMe();
    }

    static Match c(af af1)
    {
        return af1.z;
    }

    private void c(int i1)
    {
        if (i1 == 0)
        {
            q.setTextColor(B);
            r.setTextColor(C);
            a(0.0F);
            return;
        } else
        {
            q.setTextColor(C);
            r.setTextColor(B);
            a(1.0F);
            return;
        }
    }

    static boolean c(Message message)
    {
        return message.isFromMe();
    }

    static TextView d(af af1)
    {
        return af1.r;
    }

    static TextView e(af af1)
    {
        return af1.q;
    }

    static View f(af af1)
    {
        return af1.u;
    }

    private boolean f()
    {
        if (z == null)
        {
            android.support.v4.app.i i1 = getActivity();
            if (i1 != null && (i1 instanceof q))
            {
                ((q)i1).r();
            }
            return true;
        } else
        {
            return false;
        }
    }

    static int g(af af1)
    {
        return af1.l;
    }

    private void g()
    {
        long l2 = 0L;
        boolean flag = true;
        if (f())
        {
            return;
        }
        SparksEvent sparksevent = new SparksEvent("Chat.OpenProfile");
        if (z.getPerson() != null)
        {
            sparksevent.put("otherId", z.getPerson().userId);
        }
        sparksevent.put("matchId", z.getId());
        Object obj;
        long l1;
        if (E != null)
        {
            byte byte0;
            if (!TextUtils.isEmpty(E.getNearByLocationName()))
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            sparksevent.put("location", Integer.valueOf(byte0));
            if (E.getInstagramDataSet() != null)
            {
                if (!TextUtils.isEmpty(E.getInstagramDataSet().username))
                {
                    sparksevent.put("instagramName", E.getInstagramDataSet().username);
                }
                if (E.getInstagramDataSet().mediaCount != 0)
                {
                    sparksevent.put("photoTotal", Integer.valueOf(E.getInstagramDataSet().mediaCount));
                }
            }
            obj = d.b();
            if (!z.isSuperlike() || obj == null || !TextUtils.equals(((User) (obj)).getId(), z.getSuperLiker()))
            {
                flag = false;
            }
            sparksevent.put("superLike", Boolean.valueOf(flag));
            sparksevent.put("didSuperLike", Boolean.valueOf(z.superLikerIsThem()));
        }
        if (z != null && z.hasMessages())
        {
            l1 = com.b.a.d.a(z.getMessages()).a(com.tinder.fragments.ah.a()).a();
            l2 = (long)z.getMessages().size() - l1;
            if (((Message)z.getMessages().last()).isFromMe())
            {
                obj = "self";
            } else
            {
                obj = "other";
            }
        } else
        {
            obj = "none";
            l1 = 0L;
        }
        sparksevent.put("numMessagesOther", Long.valueOf(l2));
        sparksevent.put("numMessagesMe", Long.valueOf(l1));
        sparksevent.put("lastMessageFrom", obj);
        com.tinder.managers.a.a(sparksevent);
    }

    static void h(af af1)
    {
        af1.c(0);
    }

    static n i(af af1)
    {
        return af1.k;
    }

    static View j(af af1)
    {
        return af1.v;
    }

    static ah k(af af1)
    {
        return af1.D;
    }

    static boolean l(af af1)
    {
        return af1.y;
    }

    static boolean m(af af1)
    {
        af1.y = true;
        return true;
    }

    static boolean n(af af1)
    {
        return af1.x;
    }

    static boolean o(af af1)
    {
        af1.x = true;
        return true;
    }

    public final void C_()
    {
        (new an(getActivity(), new ap() {

            final af a;

            public final void a(ReportCause reportcause, String s1)
            {
                if (com.tinder.fragments.af.n(a) || af.l(a))
                {
                    return;
                }
                com.tinder.fragments.af.o(a);
                if (reportcause != null)
                {
                    com.tinder.fragments.af.a(a, reportcause, s1, true);
                }
                com.tinder.fragments.af.a(a, reportcause, s1);
            }

            
            {
                a = af.this;
                super();
            }
        })).show();
    }

    public final void a()
    {
        ((q)getActivity()).o();
    }

    public final void a(int i1)
    {
        if (i1 == 1 || i1 == 2)
        {
            ad.a(j, true);
            return;
        } else
        {
            ad.a(j, false);
            return;
        }
    }

    public final void a(int i1, float f1, int j1)
    {
        if (i1 == 0)
        {
            a(f1);
            return;
        } else
        {
            a(1.0F);
            return;
        }
    }

    public final void a(Match match, ReportCause reportcause)
    {
        long l2 = 0L;
        if (f())
        {
            return;
        }
        long l1;
        if (match != null && match.hasMessages())
        {
            Object obj = match.getMessages().iterator();
            l1 = 0L;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                if (((Message)((Iterator) (obj)).next()).isFromMe())
                {
                    l1 = 1L + l1;
                }
            } while (true);
            l2 = (long)match.getMessages().size() - l1;
            if (((Message)match.getMessages().last()).isFromMe())
            {
                match = "self";
            } else
            {
                match = "other";
            }
        } else
        {
            match = "none";
            l1 = 0L;
        }
        obj = new SparksEvent("Chat.Block");
        ((SparksEvent) (obj)).put("matchId", z.getId());
        if (z.getPerson() != null)
        {
            ((SparksEvent) (obj)).put("otherId", z.getPerson().userId);
        }
        ((SparksEvent) (obj)).put("numMessagesOther", Long.valueOf(l2));
        ((SparksEvent) (obj)).put("numMessagesMe", Long.valueOf(l1));
        ((SparksEvent) (obj)).put("lastMessageFrom", match);
        if (reportcause != null)
        {
            ((SparksEvent) (obj)).put("reportReason", reportcause.getAnalyticsValue());
        }
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        if (getActivity() != null)
        {
            Toast.makeText(getActivity(), getString(0x7f060072), 1).show();
            a();
        }
        x = false;
    }

    public final void a(Match match, String s1, String s2, ReportCause reportcause, boolean flag)
    {
        long l1 = 0L;
        String s3;
        long l2;
        if (match.hasMessages())
        {
            l1 = com.b.a.d.a(match.getMessages()).a(com.tinder.fragments.ai.a()).a();
            l2 = (long)match.getMessages().size() - l1;
            SparksEvent sparksevent;
            if (((Message)match.getMessages().last()).isFromMe())
            {
                s3 = "self";
            } else
            {
                s3 = "other";
            }
        } else
        {
            s3 = "none";
            l2 = 0L;
        }
        sparksevent = new SparksEvent("Chat.Report");
        sparksevent.put("reason", reportcause.getAnalyticsValue());
        if (match.getPerson() != null)
        {
            sparksevent.put("otherId", match.getPerson().userId);
        }
        sparksevent.put("matchId", s1);
        sparksevent.put("numMessagesOther", Long.valueOf(l2));
        sparksevent.put("numMessagesMe", Long.valueOf(l1));
        sparksevent.put("lastMessageFrom", s3);
        if (!TextUtils.isEmpty(s2))
        {
            sparksevent.put("other", s2);
        }
        if (flag)
        {
            sparksevent.put("blocked", Boolean.valueOf(true));
        }
        com.tinder.managers.a.a(sparksevent);
        if (!flag && getActivity() != null && D != null)
        {
            (new Timer()).schedule(new TimerTask() {

                final af a;

                public final void run()
                {
                    a.getActivity().runOnUiThread(new Runnable(this) {

                        final _cls12 a;

                        public final void run()
                        {
                            af.k(a.a).l();
                        }

            
            {
                a = _pcls12;
                super();
            }
                    });
                }

            
            {
                a = af.this;
                super();
            }
            }, 2500L);
        }
        y = false;
    }

    public final void b()
    {
        if (getActivity() != null)
        {
            Toast.makeText(getActivity(), getString(0x7f060071), 1).show();
        }
        x = false;
    }

    public final void b(int i1)
    {
        c(i1);
        if (i1 == 0)
        {
            a(false);
            a(0.0F);
        } else
        if (z != null && z.getPerson() != null)
        {
            d.a(z.getPerson().userId, this);
            if (getActivity().getCurrentFocus() != null)
            {
                ad.a(getActivity().getCurrentFocus().getWindowToken(), getActivity());
            }
            a(1.0F);
            return;
        }
    }

    public final void c()
    {
        if (getActivity() != null)
        {
            Toast.makeText(getActivity(), getString(0x7f0601a7), 1).show();
        }
        y = false;
        if (D != null)
        {
            D.m();
        }
    }

    public final void d()
    {
        D = ac.a(getActivity(), new ag() {

            final af a;

            public final void a(ReportCause reportcause, String s1)
            {
                if (af.l(a))
                {
                    return;
                } else
                {
                    com.tinder.fragments.af.m(a);
                    com.tinder.fragments.af.a(a, reportcause, s1, false);
                    return;
                }
            }

            
            {
                a = af.this;
                super();
            }
        }, z);
        D.show();
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        com.tinder.utils.o.a(this, i1, j1, intent);
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (e.f())
        {
            z = (Match)getArguments().getParcelable("match");
            if (!f())
            {
                bundle = (q)getActivity();
                a(bundle.m());
                bundle.n();
            }
        } else
        {
            bundle = new Intent(getActivity(), com/tinder/activities/ActivityLogin);
            Bundle bundle1 = new Bundle();
            bundle1.putString("extra_show_intro", "");
            bundle.putExtras(bundle1);
            startActivity(bundle);
            getActivity().finish();
        }
        B = android.support.v4.b.a.b(getContext(), 0x7f0d0101);
        C = android.support.v4.b.a.b(getContext(), 0x7f0d0002);
        if (z != null)
        {
            ((q)getActivity()).a(z);
            k = new n(getChildFragmentManager(), z);
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03009a, viewgroup, false);
        s = layoutinflater.findViewById(0x7f0e02ad);
        t = layoutinflater.findViewById(0x7f0e02aa);
        v = layoutinflater.findViewById(0x7f0e00a3);
        u = layoutinflater.findViewById(0x7f0e0048);
        r = (TextView)layoutinflater.findViewById(0x7f0e02ae);
        q = (TextView)layoutinflater.findViewById(0x7f0e02a9);
        p = (TextView)layoutinflater.findViewById(0x7f0e02ac);
        o = (ImageView)layoutinflater.findViewById(0x7f0e02ab);
        j = (ViewPager)layoutinflater.findViewById(0x7f0e02af);
        j.setOffscreenPageLimit(2);
        w = (BadgeView)layoutinflater.findViewById(0x7f0e01f6);
        if (getArguments().getBoolean("background"))
        {
            layoutinflater.setBackgroundColor(android.support.v4.b.a.b(getContext(), 0x7f0d0113));
        }
        return layoutinflater;
    }

    public final void onDestroy()
    {
        ad.c(A);
        ad.c(D);
        super.onDestroy();
    }

    public final void onDestroyView()
    {
        j.removeOnPageChangeListener(this);
        super.onDestroyView();
    }

    public final void onPause()
    {
        super.onPause();
        ((q)getActivity()).a(null);
    }

    public final void onProfileLoadFailed()
    {
        Toast.makeText(ManagerApp.c(), 0x7f0600b7, 1).show();
        g();
    }

    public final void onProfileLoaded(User user)
    {
        if (E == null || !E.equals(user))
        {
            E = user;
            bm bm1 = k.c;
            if (bm1 != null)
            {
                bm1.a(user);
            }
        }
        if (E != null && z != null && z.getPerson() != null && TextUtils.equals(E.getId(), z.getPerson().userId) && !E.hasSamePhotos(z.getPerson().profilePhotos))
        {
            z.getPerson().profilePhotos = E.getPhotos();
            (new Thread(new Runnable() {

                final af a;

                public final void run()
                {
                    new g();
                    com.tinder.b.g.c(com.tinder.fragments.af.c(a));
                }

            
            {
                a = af.this;
                super();
            }
            })).run();
            h.d(new EventMatchUpdated(z));
        }
        g();
    }

    public final void onResume()
    {
        super.onResume();
        ((q)getActivity()).a(this);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        if (f())
        {
            com.tinder.utils.v.b("Attempted to init the match fragment without a match set!");
        } else
        {
            boolean flag = z.hasMessages();
            if (z.hasNewMessage())
            {
                com.tinder.utils.ac.a().b = true;
            }
            Object obj1 = ad.a(getActivity());
            Object obj = new com.tinder.utils.g(o);
            o.setTag(obj);
            long l1;
            if (z.getPerson() != null)
            {
                obj1 = z.getPerson().getAvatarUrl(0, ((com.tinder.enums.UserPhotoSize) (obj1)));
                if (TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    Picasso.a(getActivity()).a(0x7f02004f).a(0x7f09011a, 0x7f09011a).b().a(((com.squareup.picasso.x) (obj)));
                } else
                {
                    Picasso.a(getActivity()).a(((String) (obj1))).a(0x7f09011a, 0x7f09011a).b().a().a(((com.squareup.picasso.x) (obj)));
                }
                p.setText(z.getPerson().name);
            }
            j.setAdapter(k);
            j.addOnPageChangeListener(this);
            k.notifyDataSetChanged();
            q.setOnClickListener(new android.view.View.OnClickListener() {

                final af a;

                public final void onClick(View view1)
                {
                    com.tinder.fragments.af.a(a).setCurrentItem(0);
                }

            
            {
                a = af.this;
                super();
            }
            });
            r.setOnClickListener(new android.view.View.OnClickListener() {

                final af a;

                public final void onClick(View view1)
                {
                    com.tinder.fragments.af.a(a).setCurrentItem(1);
                }

            
            {
                a = af.this;
                super();
            }
            });
            s.setOnClickListener(new android.view.View.OnClickListener() {

                final af a;

                public final void onClick(View view1)
                {
                    if (!ad.c(af.b(a)))
                    {
                        Match match = a.c.a(com.tinder.fragments.af.c(a).getId());
                        view1 = match;
                        if (match == null)
                        {
                            view1 = com.tinder.fragments.af.c(a);
                        }
                        com.tinder.fragments.af.a(a, new m(a.getActivity(), a, view1, null));
                        af.b(a).show();
                    }
                }

            
            {
                a = af.this;
                super();
            }
            });
            ad.b(o);
            o.setOnClickListener(new android.view.View.OnClickListener() {

                final af a;

                public final void onClick(View view1)
                {
                    a.a();
                }

            
            {
                a = af.this;
                super();
            }
            });
            t.setOnClickListener(new android.view.View.OnClickListener() {

                final af a;

                public final void onClick(View view1)
                {
                    a.a();
                }

            
            {
                a = af.this;
                super();
            }
            });
            obj = getActivity();
            n = ((Activity) (obj)).getResources().getDimensionPixelSize(0x7f0900d7);
            j.post(new Runnable() {

                final af a;

                public final void run()
                {
                    com.tinder.fragments.af.a(a, com.tinder.fragments.af.d(a).getWidth());
                    af.b(a, com.tinder.fragments.af.e(a).getWidth());
                    com.tinder.fragments.af.f(a).getLayoutParams().width = com.tinder.fragments.af.g(a);
                    com.tinder.fragments.af.f(a).setLayoutParams(com.tinder.fragments.af.f(a).getLayoutParams());
                    af.h(a);
                }

            
            {
                a = af.this;
                super();
            }
            });
            obj = new Runnable(new Runnable(((Activity) (obj))) {

                final Activity a;
                final af b;

                public final void run()
                {
                    com.tinder.fragments.af.i(b).b = 2;
                    com.tinder.fragments.af.i(b).notifyDataSetChanged();
                    com.tinder.fragments.af.a(b, (q)a);
                    bm bm1 = com.tinder.fragments.af.i(b).c;
                    if (bm1 != null)
                    {
                        Match match = com.tinder.fragments.af.c(b);
                        bm1.f = UserType.MATCH;
                        bm1.h = match;
                        bm1.a(match.getPerson().getAvatarUrlsForSize(ad.a(bm1.getActivity())));
                        bm1.d.setText(match.getName());
                        (new StringBuilder("Match refresh career ")).append(bm1.h.getPerson().userId);
                        bm1.a(bm1.getView());
                    }
                }

            
            {
                b = af.this;
                a = activity;
                super();
            }
            }, flag) {

                final Runnable a;
                final boolean b;
                final af c;

                public final void run()
                {
                    af.j(c).setVisibility(8);
                    com.tinder.fragments.af.i(c).b = 1;
                    com.tinder.fragments.af.i(c).notifyDataSetChanged();
                    ViewPager viewpager = com.tinder.fragments.af.a(c);
                    Runnable runnable = a;
                    long l2;
                    if (b)
                    {
                        l2 = 300L;
                    } else
                    {
                        l2 = 600L;
                    }
                    viewpager.postDelayed(runnable, l2);
                }

            
            {
                c = af.this;
                a = runnable;
                b = flag;
                super();
            }
            };
            obj1 = j;
            if (flag)
            {
                l1 = 450L;
            } else
            {
                l1 = 0L;
            }
            ((ViewPager) (obj1)).postDelayed(((Runnable) (obj)), l1);
            w.displayBadge(z);
        }
        super.onViewCreated(view, bundle);
    }
}
