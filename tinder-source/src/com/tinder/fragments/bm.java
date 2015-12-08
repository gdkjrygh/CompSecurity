// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.h;
import android.support.v4.g.i;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.activities.ActivityMain;
import com.tinder.activities.ActivityProfile;
import com.tinder.adapters.t;
import com.tinder.adapters.u;
import com.tinder.c.ah;
import com.tinder.c.m;
import com.tinder.c.s;
import com.tinder.d.c;
import com.tinder.e.ac;
import com.tinder.e.ae;
import com.tinder.e.af;
import com.tinder.e.aj;
import com.tinder.e.aq;
import com.tinder.e.au;
import com.tinder.e.g;
import com.tinder.enums.PaywallPerk;
import com.tinder.enums.RateType;
import com.tinder.enums.ReportCause;
import com.tinder.enums.UserType;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ab;
import com.tinder.managers.ag;
import com.tinder.managers.e;
import com.tinder.managers.x;
import com.tinder.managers.y;
import com.tinder.managers.z;
import com.tinder.model.Badge;
import com.tinder.model.Career;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.Job;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.School;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.utils.a;
import com.tinder.utils.aa;
import com.tinder.utils.ad;
import com.tinder.utils.o;
import com.tinder.utils.v;
import com.tinder.views.BadgeView;
import com.tinder.views.CustomButton;
import com.tinder.views.CustomTextView;
import com.tinder.views.InterestsView;
import com.tinder.views.OverScrollView;
import com.tinder.views.SkippableViewPager;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            by, bp, bo, bn, 
//            bc, bq, br

public final class bm extends h
    implements android.support.v4.view.ViewPager.f, android.view.View.OnClickListener, com.tinder.adapters.t.a, ae, af, aq, g, by, com.tinder.views.OverScrollView.OverScrollListener
{

    static final boolean a = com.tinder.utils.o.e();
    private static aa t;
    private View A;
    private ImageView B;
    private SkippableViewPager C;
    private CirclePageIndicator D;
    private View E;
    private ah F;
    private m G;
    private ac H;
    private u I;
    private RelativeLayout J;
    private CustomTextView K;
    private ViewPager L;
    private CustomTextView M;
    private CustomButton N;
    private t O;
    private com.tinder.adapters.d P;
    private CirclePageIndicator Q;
    private LinearLayout R;
    private ProgressBar S;
    private Handler T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private int ac;
    private boolean ad;
    private View ae;
    private View af;
    private View ag;
    private ImageView ah;
    private ImageView ai;
    private TextView aj;
    private CustomTextView ak;
    private CustomTextView al[];
    private String am;
    private c an;
    private com.tinder.d.d ao;
    private LinearLayout ap;
    private View aq;
    private int ar;
    boolean b;
    int c;
    TextView d;
    InterestsView e;
    UserType f;
    User g;
    Match h;
    public boolean i;
    com.tinder.managers.d j;
    com.tinder.managers.ae k;
    com.tinder.managers.ad l;
    z m;
    com.tinder.managers.ac n;
    x o;
    y p;
    ab q;
    e r;
    ag s;
    private TextView u;
    private TextView v;
    private TextView w;
    private RelativeLayout x;
    private OverScrollView y;
    private View z;

    public bm()
    {
        i = true;
        am = "key_ig_photo_index";
    }

    static ah A(bm bm1)
    {
        return bm1.F;
    }

    static Handler B(bm bm1)
    {
        return bm1.T;
    }

    static int C(bm bm1)
    {
        return bm1.ab;
    }

    static int a(bm bm1, int i1)
    {
        bm1.ab = i1;
        return i1;
    }

    static LinearLayout a(bm bm1)
    {
        return bm1.ap;
    }

    static LinearLayout a(bm bm1, LinearLayout linearlayout)
    {
        bm1.ap = linearlayout;
        return linearlayout;
    }

    public static bm a(User user, ac ac1, int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2)
    {
        bm bm1 = new bm();
        Bundle bundle = new Bundle();
        bundle.putParcelable("user", user);
        bundle.putSerializable("userType", UserType.REC);
        bundle.putSerializable("imgW", Integer.valueOf(l1));
        bm1.setArguments(bundle);
        int l2 = ManagerApp.c().getResources().getDimensionPixelSize(0x7f090076);
        int i3 = (int)com.tinder.utils.ad.a(1.0F);
        user = new aa();
        user.a = l1;
        user.b = i2;
        user.c = j1;
        user.d = k1;
        user.i = com.tinder.utils.ad.b(1.0F) - (float)i3;
        user.h = (float)((aa) (user)).a / (float)i3;
        user.l = 2.0F;
        user.k = 2.0F;
        user.j = 40F;
        user.e = j2;
        user.f = k2;
        user.g = (float)(-l2) - ((aa) (user)).l;
        t = user;
        bm1.U = i1;
        bm1.ar = i1;
        bm1.H = ac1;
        return bm1;
    }

    public static bm a(User user, UserType usertype)
    {
        bm bm1 = new bm();
        Bundle bundle = new Bundle();
        bundle.putParcelable("user", user);
        bundle.putSerializable("userType", usertype);
        bm1.setArguments(bundle);
        return bm1;
    }

    static void a(Context context, String s1)
    {
        b(context, s1);
    }

    private void a(RateType ratetype)
    {
        if (!W)
        {
            l();
            if (H != null)
            {
                H.a(ratetype);
                return;
            }
        }
    }

    static void a(bm bm1, View view)
    {
        Object obj;
        bm1.E = view.findViewById(0x7f0e01bc);
        view = bm1.E.findViewById(0x7f0e008a);
        obj = (TextView)bm1.E.findViewById(0x7f0e01be);
        ImageButton imagebutton = (ImageButton)bm1.E.findViewById(0x7f0e01bd);
        view.setOnClickListener(bm1);
        ((TextView) (obj)).setOnClickListener(bm1);
        if (imagebutton != null)
        {
            imagebutton.setOnClickListener(bm1);
        }
        if (bm1.g == null) goto _L2; else goto _L1
_L1:
        ((TextView) (obj)).setText(bm1.g.getName());
_L8:
        if (UserType.REC != bm1.f) goto _L4; else goto _L3
_L3:
        view = bm1.E.findViewById(0x7f0e01c0);
        obj = bm1.E.findViewById(0x7f0e01c1);
        View view1 = bm1.E.findViewById(0x7f0e01c2);
        view.setOnClickListener(bm1);
        ((View) (obj)).setOnClickListener(bm1);
        view1.setOnClickListener(bm1);
        com.tinder.utils.a.a(new View[] {
            view, obj
        });
        bm1.T.post(bm1. new Runnable() {

            final bm a;

            public final void run()
            {
                com.tinder.fragments.bm.e(a);
            }

            
            {
                a = bm.this;
                super();
            }
        });
_L6:
        return;
_L2:
        if (bm1.h != null)
        {
            ((TextView) (obj)).setText(bm1.h.getName());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (UserType.ME != bm1.f) goto _L6; else goto _L5
_L5:
        bm1.E.findViewById(0x7f0e01bf).setOnClickListener(bm1);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(bm bm1, ReportCause reportcause, String s1)
    {
        if (bm1.g == null)
        {
            com.tinder.utils.v.b("Not reporting user becauser user is null");
            return;
        }
        com.tinder.managers.ac ac1 = bm1.n;
        String s3 = bm1.g.getId();
        (new StringBuilder("reportCause: ")).append(reportcause.ordinal()).append(" causeText: ").append(s1);
        int i1 = reportcause.ordinal();
        JSONObject jsonobject = new JSONObject();
        String s2;
        try
        {
            jsonobject.put("cause", i1);
            if (!TextUtils.isEmpty(s1))
            {
                jsonobject.put("text", s1);
            }
        }
        catch (JSONException jsonexception)
        {
            com.tinder.utils.v.b(String.valueOf(jsonexception));
        }
        s2 = (new StringBuilder()).append(ac1.a.q).append(s3).toString();
        reportcause = new com.tinder.managers.ac._cls1(ac1, bm1, s3, reportcause, s1);
        bm1 = new com.tinder.managers.ac._cls2(ac1, bm1);
        ManagerApp.h().g();
        bm1 = new d(1, s2, jsonobject, reportcause, bm1, com.tinder.managers.d.b());
        ManagerApp.b().a(bm1);
    }

    static void a(bm bm1, boolean flag)
    {
        bm1.a(flag);
    }

    private void a(boolean flag)
    {
        byte byte1 = 4;
        Object obj = B;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        ((ImageView) (obj)).setVisibility(byte0);
        obj = z;
        if (flag)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
    }

    static boolean a(Message message)
    {
        return message.isFromMe();
    }

    static View b(bm bm1)
    {
        return bm1.ae;
    }

    static View b(bm bm1, View view)
    {
        bm1.ae = view;
        return view;
    }

    private static void b(Context context, String s1)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://instagram.com/_u/")).append(s1).toString()));
        intent.setFlags(0x10000000);
        intent.setPackage("com.instagram.android");
        boolean flag;
        if (context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            context.startActivity(intent);
            return;
        } else
        {
            s1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://instagram.com/")).append(s1).toString()));
            s1.setFlags(0x10000000);
            context.startActivity(s1);
            return;
        }
    }

    static void b(bm bm1, int i1)
    {
        boolean flag2 = true;
        boolean flag = false;
        if (bm1.g != null && bm1.g.getInstagramPhotos() != null && !bm1.g.getInstagramPhotos().isEmpty())
        {
            t t1 = bm1.O;
            boolean flag1;
            if (t1.m != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            String.format("mMapPositionPage != null? [%s] ", new Object[] {
                Boolean.valueOf(flag1)
            });
            if (t1.m != null)
            {
                StringBuilder stringbuilder = new StringBuilder("!mMapPositionPage.isEmpty():");
                int j1;
                if (!t1.m.isEmpty())
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                stringbuilder.append(flag1);
                if (!t1.m.isEmpty())
                {
                    (new StringBuilder("mapposition page size:")).append(t1.m.size());
                }
            }
            j1 = ((flag) ? 1 : 0);
            if (t1.m != null)
            {
                j1 = ((flag) ? 1 : 0);
                if (!t1.m.isEmpty())
                {
                    j1 = ((Integer)t1.m.get(Integer.valueOf(i1))).intValue();
                }
            }
            bm1.L.setCurrentItem(j1);
        }
    }

    static boolean b(Message message)
    {
        return message.isFromMe();
    }

    static View c(bm bm1)
    {
        return bm1.ag;
    }

    static View c(bm bm1, View view)
    {
        bm1.ag = view;
        return view;
    }

    static boolean c(Message message)
    {
        return message.isFromMe();
    }

    static View d(bm bm1)
    {
        return bm1.af;
    }

    static View d(bm bm1, View view)
    {
        bm1.af = view;
        return view;
    }

    static void e(bm bm1)
    {
        boolean flag = bm1.j();
        if (!bm1.W && t != null)
        {
            bm1.W = true;
            bm1.y.setBackgroundColor(0);
            bm1.C.setVisibility(4);
            bm1.a(true);
            if (bm1.g != null && bm1.g.isSuperLike())
            {
                bm1.A.setVisibility(0);
            }
            com.tinder.utils.ad.c(bm1.z, t.h);
            bm1.D.setAlpha(0.0F);
            int i1 = (int)TypedValue.applyDimension(1, 2.0F, bm1.getResources().getDisplayMetrics());
            bm1.B.setTranslationY(t.d);
            bm1.z.setTranslationY(i1 + t.d);
            com.tinder.utils.ad.c(bm1.B, t.h);
            bm1.x.setTranslationY(t.i);
            if (bm1.ad)
            {
                bm1.E.setTranslationY(t.g);
            }
            if (a)
            {
                bm1.B.setTranslationZ(t.k);
                if (bm1.ad)
                {
                    bm1.E.setTranslationZ(t.l);
                }
                bm1.x.setTranslationZ(t.j);
            }
            bm1.A.setY(t.f);
            bm1.A.setX(t.e);
            if (bm1.getView() != null)
            {
                bm1.getView().postDelayed(bm1. new Runnable(flag) {

                    final boolean a;
                    final bm b;

                    public final void run()
                    {
                        com.facebook.a.e e1 = com.tinder.utils.a.a();
                        e1.a(0.0D);
                        e1.c(12D);
                        e1.j = 0.0010000000474974513D;
                        e1.a(com.facebook.a.f.a(40D, 7D));
                        e1.a(new com.facebook.a.d(this) {

                            final _cls3 a;

                            public final void onSpringActivate(com.facebook.a.e e1)
                            {
                                if (bm.w(a.b) != null)
                                {
                                    bm.w(a.b).a();
                                }
                                com.tinder.fragments.bm.a(a.b, false);
                                if (bm.b(a.b) != null)
                                {
                                    bm.b(a.b).setVisibility(0);
                                }
                                if (com.tinder.fragments.bm.c(a.b) != null)
                                {
                                    com.tinder.fragments.bm.c(a.b).setVisibility(0);
                                }
                                if (com.tinder.fragments.bm.x(a.b))
                                {
                                    com.tinder.fragments.bm.d(a.b).setVisibility(0);
                                }
                            }

                            public final void onSpringAtRest(com.facebook.a.e e1)
                            {
                                com.tinder.fragments.bm.s(a.b).animate().alpha(1.0F).setDuration(90L).setInterpolator(new DecelerateInterpolator()).start();
                                com.tinder.fragments.bm.a(a.b, true);
                                com.tinder.fragments.bm.t(a.b).setVisibility(0);
                                com.tinder.fragments.bm.u(a.b).setBackgroundColor(-1);
                                com.tinder.fragments.bm.v(a.b);
                            }

                            public final void onSpringUpdate(com.facebook.a.e e1)
                            {
                                float f1;
                                f1 = (float)e1.d.a;
                                if (e1.a() && com.tinder.fragments.bm.a)
                                {
                                    bm.n(a.b).animate().translationZ(0.0F).setDuration(90L).start();
                                    if (com.tinder.fragments.bm.o(a.b))
                                    {
                                        bm.p(a.b).animate().translationZ(0.0F).setDuration(90L).start();
                                    }
                                }
                                bm.q(a.b).setTranslationY(com.tinder.utils.o.a(f1, 0.0F, com.tinder.fragments.bm.g().d, 1.0F, 0.0F));
                                com.tinder.utils.ad.c(bm.q(a.b), com.tinder.utils.o.a(f1, 0.0F, com.tinder.fragments.bm.g().h, 1.0F, 1.0F));
                                bm.n(a.b).setTranslationY(com.tinder.utils.o.a(f1, 0.0F, com.tinder.fragments.bm.g().i, 1.0F, 0.0F));
                                bm.n(a.b).setAlpha(f1);
                                if (com.tinder.fragments.bm.o(a.b))
                                {
                                    bm.p(a.b).setTranslationY((1.0F - f1) * com.tinder.fragments.bm.g().g);
                                }
                                if (bm.b(a.b) != null)
                                {
                                    bm.b(a.b).setTranslationX((float)(-a.b.c) * (1.0F - f1));
                                    bm.b(a.b).setRotation(180F * f1);
                                }
                                if (!a.a) goto _L2; else goto _L1
_L1:
                                com.tinder.fragments.bm.d(a.b).setTranslationY(100F * (1.0F - f1));
_L4:
                                if (com.tinder.fragments.bm.c(a.b) != null)
                                {
                                    com.tinder.fragments.bm.c(a.b).setTranslationX((float)a.b.c * (1.0F - f1));
                                    com.tinder.fragments.bm.c(a.b).setRotation((1.0F - f1) * 180F);
                                }
                                return;
_L2:
                                if (com.tinder.fragments.bm.m(a.b).isSuperLike())
                                {
                                    bm.r(a.b).setAlpha(1.0F - f1);
                                }
                                if (true) goto _L4; else goto _L3
_L3:
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                        e1.b(1.0D);
                    }

            
            {
                b = bm.this;
                a = flag;
                super();
            }
                }, 50L);
                return;
            }
        }
    }

    static UserType f(bm bm1)
    {
        return bm1.f;
    }

    static c g(bm bm1)
    {
        return bm1.an;
    }

    static aa g()
    {
        return t;
    }

    static CustomTextView h(bm bm1)
    {
        return bm1.M;
    }

    private void h()
    {
        if (g == null)
        {
            com.tinder.utils.v.b("Cannot set user text because user object is null!");
            return;
        }
        d.setText(String.format("%s, ", new Object[] {
            g.getName()
        }));
        w.setText(g.getAge());
        Object obj = g.getBio().trim();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            u.setMaxEms(500);
            u.setText(((CharSequence) (obj)));
            u.setVisibility(0);
        } else
        {
            u.setVisibility(8);
            aq.setVisibility(8);
        }
        if (UserType.ME == f)
        {
            v.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(g.getNearByLocationName()))
        {
            v.setText(g.getNearByLocation(getResources()));
            return;
        }
        int j1 = g.getDistance(l);
        if (j1 > 0)
        {
            int i1;
            if (l.j)
            {
                i1 = 0x7f080002;
            } else
            {
                i1 = 0x7f080001;
            }
            obj = new SpannableString(getResources().getQuantityString(i1, j1, new Object[] {
                Integer.valueOf(j1)
            }));
        } else
        {
            obj = new SpannableString(getString(0x7f0601e0));
        }
        v.setText(((CharSequence) (obj)));
    }

    static CustomButton i(bm bm1)
    {
        return bm1.N;
    }

    private void i()
    {
        int i1 = O.i;
        if (i1 != 0)
        {
            android.view.ViewGroup.LayoutParams layoutparams = L.getLayoutParams();
            layoutparams.height = i1;
            L.setLayoutParams(layoutparams);
        }
    }

    static int j(bm bm1)
    {
        return bm1.ac;
    }

    private boolean j()
    {
        return af != null && g != null && !g.isSuperLike() && b && !g.isBrand();
    }

    static t k(bm bm1)
    {
        return bm1.O;
    }

    private void k()
    {
        if (q.i.numRemaining <= 0)
        {
            ((ActivityMain)getActivity()).a(g, ar, new com.tinder.c.ak.a() {

                final bm a;

                public final void a()
                {
                    ((ActivityMain)a.getActivity()).launchPlusSubscriptionPaywall(4, PaywallPerk.SUPER_LIKE);
                }

            
            {
                a = bm.this;
                super();
            }
            }, null);
            return;
        } else
        {
            a(RateType.SUPERLIKE);
            return;
        }
    }

    static Match l(bm bm1)
    {
        return bm1.h;
    }

    private void l()
    {
        android.support.v4.app.i i1 = getActivity();
        if (f != null) goto _L2; else goto _L1
_L1:
        com.tinder.utils.v.b("Not reporting any exit callbacks because we don't know what kind of user we had");
_L8:
        return;
_L2:
        static final class _cls15
        {

            static final int a[];

            static 
            {
                a = new int[UserType.values().length];
                try
                {
                    a[UserType.REC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[UserType.MATCH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[UserType.ME.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.tinder.fragments._cls15.a[f.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 57
    //                   2 66
    //                   3 81;
           goto _L3 _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        onCancel(getDialog());
        return;
_L5:
        if (!(i1 instanceof ActivityMain)) goto _L8; else goto _L7
_L7:
        ((ActivityMain)i1).r();
        return;
        if (!(i1 instanceof ActivityMain)) goto _L8; else goto _L9
_L9:
        ((ActivityMain)i1).r();
        return;
    }

    static User m(bm bm1)
    {
        return bm1.g;
    }

    static RelativeLayout n(bm bm1)
    {
        return bm1.x;
    }

    static boolean o(bm bm1)
    {
        return bm1.ad;
    }

    static View p(bm bm1)
    {
        return bm1.E;
    }

    static ImageView q(bm bm1)
    {
        return bm1.B;
    }

    static View r(bm bm1)
    {
        return bm1.A;
    }

    static CirclePageIndicator s(bm bm1)
    {
        return bm1.D;
    }

    static SkippableViewPager t(bm bm1)
    {
        return bm1.C;
    }

    static OverScrollView u(bm bm1)
    {
        return bm1.y;
    }

    static boolean v(bm bm1)
    {
        bm1.W = false;
        return false;
    }

    static ac w(bm bm1)
    {
        return bm1.H;
    }

    static boolean x(bm bm1)
    {
        return bm1.j();
    }

    static u y(bm bm1)
    {
        return bm1.I;
    }

    static void z(bm bm1)
    {
        bm1.k();
    }

    public final void C_()
    {
    }

    public final void a()
    {
        long l1 = 0L;
        if (f == UserType.ME || g == null) goto _L2; else goto _L1
_L1:
        Object obj;
        if (f == UserType.REC)
        {
            obj = new SparksEvent("Recs.OpenInstagram");
        } else
        if (f == UserType.MATCH)
        {
            SparksEvent sparksevent = new SparksEvent("Chat.OpenInstagram");
            long l2;
            if (h != null && h.hasMessages())
            {
                l1 = com.b.a.d.a(h.getMessages()).a(com.tinder.fragments.bp.a()).a();
                l2 = (long)h.getMessages().size() - l1;
                if (((Message)h.getMessages().last()).isFromMe())
                {
                    obj = "self";
                } else
                {
                    obj = "other";
                }
            } else
            {
                obj = "none";
                l2 = 0L;
            }
            sparksevent.put("numMessagesOther", Long.valueOf(l2));
            sparksevent.put("numMessagesMe", Long.valueOf(l1));
            sparksevent.put("lastMessageFrom", obj);
            obj = sparksevent;
        } else
        {
            obj = null;
        }
        if (obj != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        ((SparksEvent) (obj)).put("from", Integer.valueOf(1));
        ((SparksEvent) (obj)).put("otherId", g.getId());
        ((SparksEvent) (obj)).put("instagramName", g.getInstagramDataSet().username);
        com.tinder.managers.a.a(((SparksEvent) (obj)));
_L2:
        if (g != null && g.getInstagramDataSet() != null)
        {
            b(getActivity(), g.getInstagramDataSet().username);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void a(int i1)
    {
    }

    public final void a(int i1, float f1, int j1)
    {
    }

    final void a(View view)
    {
        ManagerApp.h().j();
        String s1 = com.tinder.managers.ae.p();
        ak = (CustomTextView)view.findViewById(0x7f0e02bc);
        al = (new CustomTextView[] {
            (CustomTextView)view.findViewById(0x7f0e02bd), (CustomTextView)view.findViewById(0x7f0e02be)
        });
        if (g == null || s1 == null)
        {
            com.tinder.utils.v.b("Cannot refresh career, user object (or ID) is null");
        } else
        {
            view = g.getCareer();
            CustomTextView customtextview;
            int i1;
            if (view.hasJobs())
            {
                if (g.getId().equals(s1))
                {
                    if (view.getMyJob() != null)
                    {
                        ak.setText(view.getMyJob().getSpannedStrict());
                    }
                } else
                {
                    ak.setText(view.getJob().getSpanned());
                }
            }
            customtextview = ak;
            if (ak.getText().toString().isEmpty())
            {
                i1 = 8;
            } else
            {
                i1 = 0;
            }
            customtextview.setVisibility(i1);
            if (view.hasSchools())
            {
                view = view.getSchools();
                i1 = 0;
                int j1 = 0;
                while (i1 < view.size()) 
                {
                    int k1;
label0:
                    {
                        if (!((School)view.get(i1)).isDisplayed)
                        {
                            k1 = j1;
                            if (s1.equals(g.getId()))
                            {
                                break label0;
                            }
                        }
                        k1 = j1;
                        if (j1 < al.length)
                        {
                            al[j1].setText(((School)view.get(i1)).getName());
                            al[j1].setVisibility(0);
                            k1 = j1 + 1;
                        }
                    }
                    i1++;
                    j1 = k1;
                }
            }
        }
        return;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_78;
_L1:
    }

    public final void a(View view, int i1)
    {
        long l2 = 0L;
        if (f != UserType.REC || g == null) goto _L2; else goto _L1
_L1:
        SparksEvent sparksevent = new SparksEvent("Recs.ProfileInstagramSelect");
        sparksevent.put("photoIndex", view.getTag());
        sparksevent.put("otherId", g.getId());
        sparksevent.put("instagramName", g.getInstagramDataSet().username);
        com.tinder.managers.a.a(sparksevent);
_L4:
        com.tinder.c.s.b b1 = new com.tinder.c.s.b();
        Object obj = new Rect();
        view.getGlobalVisibleRect(((Rect) (obj)));
        int k1 = ((Rect) (obj)).left;
        int j1;
        int l1;
        int i2;
        int j2;
        if (f == UserType.REC)
        {
            j1 = ((Rect) (obj)).top + com.tinder.utils.ad.c(getActivity());
        } else
        {
            j1 = ((Rect) (obj)).top;
        }
        l1 = O.a;
        i2 = O.b;
        j2 = O.g;
        b1.a = view.getWidth();
        b1.b = view.getHeight();
        b1.c = k1;
        b1.d = j1;
        b1.e = com.tinder.utils.ad.c(getActivity());
        b1.f = l1;
        b1.g = i2;
        b1.h = j2;
        if (g != null)
        {
            (new s(getActivity(), h, ((Integer)view.getTag()).intValue(), i1, g.getInstagramDataSet(), b1, g.getId(), f, new com.tinder.c.s.a() {

                final bm a;

                public final void a()
                {
                    long l4 = 0L;
                    if (com.tinder.fragments.bm.f(a) == UserType.ME) goto _L2; else goto _L1
_L1:
                    Object obj1;
                    if (com.tinder.fragments.bm.f(a) == UserType.REC)
                    {
                        obj1 = new SparksEvent("Recs.OpenInstagram");
                    } else
                    if (com.tinder.fragments.bm.f(a) == UserType.MATCH)
                    {
                        SparksEvent sparksevent1 = new SparksEvent("Chat.OpenInstagram");
                        long l5;
                        if (bm.l(a) != null && bm.l(a).hasMessages())
                        {
                            l4 = com.b.a.d.a(bm.l(a).getMessages()).a(com.tinder.fragments.bq.a()).a();
                            l5 = (long)bm.l(a).getMessages().size() - l4;
                            if (((Message)bm.l(a).getMessages().last()).isFromMe())
                            {
                                obj1 = "self";
                            } else
                            {
                                obj1 = "other";
                            }
                        } else
                        {
                            obj1 = "none";
                            l5 = 0L;
                        }
                        sparksevent1.put("numMessagesOther", Long.valueOf(l5));
                        sparksevent1.put("numMessagesMe", Long.valueOf(l4));
                        sparksevent1.put("lastMessageFrom", obj1);
                        obj1 = sparksevent1;
                    } else
                    {
                        obj1 = null;
                    }
                    if (obj1 != null) goto _L4; else goto _L3
_L3:
                    return;
_L4:
                    ((SparksEvent) (obj1)).put("from", Integer.valueOf(2));
                    ((SparksEvent) (obj1)).put("otherId", com.tinder.fragments.bm.m(a).getId());
                    ((SparksEvent) (obj1)).put("instagramName", com.tinder.fragments.bm.m(a).getInstagramDataSet().username);
                    com.tinder.managers.a.a(((SparksEvent) (obj1)));
_L2:
                    if (com.tinder.fragments.bm.m(a).getInstagramDataSet() != null)
                    {
                        com.tinder.fragments.bm.a(a.getActivity(), com.tinder.fragments.bm.m(a).getInstagramDataSet().username);
                        return;
                    }
                    if (true) goto _L3; else goto _L5
_L5:
                }

                public final void a(int k2)
                {
                    com.tinder.fragments.bm.a(a, k2);
                    bm.b(a, bm.C(a));
                }

            
            {
                a = bm.this;
                super();
            }
            })).show();
        }
        return;
_L2:
        if (f == UserType.MATCH && g != null)
        {
            obj = new SparksEvent("Chat.ProfileInstagramSelect");
            String s1;
            long l3;
            if (h != null && h.hasMessages())
            {
                l2 = com.b.a.d.a(h.getMessages()).a(com.tinder.fragments.bo.a()).a();
                l3 = (long)h.getMessages().size() - l2;
                if (((Message)h.getMessages().last()).isFromMe())
                {
                    s1 = "self";
                } else
                {
                    s1 = "other";
                }
            } else
            {
                s1 = "none";
                l3 = 0L;
            }
            ((SparksEvent) (obj)).put("numMessagesOther", Long.valueOf(l3));
            ((SparksEvent) (obj)).put("numMessagesMe", Long.valueOf(l2));
            ((SparksEvent) (obj)).put("lastMessageFrom", s1);
            ((SparksEvent) (obj)).put("photoIndex", view.getTag());
            ((SparksEvent) (obj)).put("otherId", g.getId());
            ((SparksEvent) (obj)).put("instagramName", g.getInstagramDataSet().username);
            com.tinder.managers.a.a(((SparksEvent) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(ConnectionsGroup connectionsgroup, int i1)
    {
        if (g == null)
        {
            com.tinder.utils.v.b("Connections load finished before user was set.");
        } else
        {
            if (1 == i1)
            {
                g.setConnections(connectionsgroup);
                b();
                return;
            }
            if (i1 == 0)
            {
                connectionsgroup = g.getConnections();
                if (connectionsgroup != null && !connectionsgroup.getUnbuiltConnections().isEmpty())
                {
                    com.tinder.managers.f.a(connectionsgroup, P.i, this);
                    return;
                }
            }
        }
    }

    public final void a(User user)
    {
        boolean flag = false;
        int i1;
        if (UserType.ME == f)
        {
            i1 = 600;
        } else
        {
            i1 = 0;
        }
        g = user;
        if (user != null && getView() != null)
        {
            BadgeView badgeview = (BadgeView)getView().findViewById(0x7f0e01f6);
            badgeview.displayBadge(user);
            int j1;
            if (i)
            {
                j1 = 0;
            } else
            {
                j1 = 8;
            }
            badgeview.setVisibility(j1);
            user = user.getFirstBadge();
            if (user != null)
            {
                aj.setText(((Badge) (user)).description);
                aj.setTextColor(user.getColor(getContext()));
                user = aj;
                if (aj.getText().length() > 0)
                {
                    j1 = 0;
                } else
                {
                    j1 = 8;
                }
                user.setVisibility(j1);
            }
            a(((List) (g.getAvatarUrlsForSize(com.tinder.utils.ad.a(getActivity())))));
            h();
            a(getView());
            if (b && f != UserType.ME)
            {
                boolean flag1;
                if (f == UserType.REC)
                {
                    flag1 = g.isSuperLike();
                } else
                if (f == UserType.MATCH && h != null)
                {
                    flag1 = h.isSuperlike();
                } else
                {
                    flag1 = false;
                }
                user = ai;
                if (flag1)
                {
                    j1 = ((flag) ? 1 : 0);
                } else
                {
                    j1 = 8;
                }
                user.setVisibility(j1);
            }
            T.postDelayed(new Runnable() {

                final bm a;

                public final void run()
                {
                    a.b();
                }

            
            {
                a = bm.this;
                super();
            }
            }, i1);
            T.postDelayed(new Runnable() {

                final bm a;

                public final void run()
                {
                    bm bm1;
label0:
                    {
                        if (a.isVisible())
                        {
                            bm1 = a;
                            if (bm1.g != null && bm1.getView() != null)
                            {
                                break label0;
                            }
                            com.tinder.utils.v.b("Attempted to set interests with either a null user or a null view");
                        }
                        return;
                    }
                    int k1 = bm1.g.getCommonInterests().size();
                    k1 = bm1.g.getUncommonInterests().size() + k1;
                    TextView textview = (TextView)bm1.getView().findViewById(0x7f0e02d2);
                    if (k1 == 0)
                    {
                        textview.setVisibility(8);
                        bm1.e.setVisibility(8);
                        bm1.getView().findViewById(0x7f0e02d2).setVisibility(8);
                        bm1.getView().findViewById(0x7f0e02d3).setVisibility(8);
                        bm1.getView().findViewById(0x7f0e02d1).setVisibility(8);
                        return;
                    } else
                    {
                        textview.setText(bm1.getResources().getQuantityString(0x7f080006, k1, new Object[] {
                            Integer.valueOf(k1)
                        }));
                        bm1.e.setUser(bm1.g);
                        bm1.e.setVisibility(0);
                        textview.setVisibility(0);
                        bm1.getView().findViewById(0x7f0e02d2).setVisibility(0);
                        bm1.getView().findViewById(0x7f0e02d3).setVisibility(0);
                        bm1.getView().findViewById(0x7f0e02d1).setVisibility(0);
                        return;
                    }
                }

            
            {
                a = bm.this;
                super();
            }
            }, i1);
            T.postDelayed(new Runnable() {

                final bm a;

                public final void run()
                {
                    if (a.isVisible())
                    {
                        a.c();
                    }
                }

            
            {
                a = bm.this;
                super();
            }
            }, i1);
        }
    }

    public final void a(Runnable runnable)
    {
        if (!W)
        {
            boolean flag = j();
            if (getActivity() instanceof ActivityProfile)
            {
                getActivity().finish();
                return;
            }
            W = true;
            y.smoothScrollTo(0, 0);
            ValueAnimator valueanimator = new ValueAnimator();
            valueanimator.setFloatValues(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setDuration(310L);
            valueanimator.setInterpolator(new AnticipateInterpolator(1.45F));
            valueanimator.setStartDelay(y.getScrollY() / 230);
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(flag) {

                final boolean a;
                final bm b;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    float f1;
                    f1 = valueanimator1.getAnimatedFraction();
                    if (com.tinder.fragments.bm.g() != null)
                    {
                        bm.q(b).setTranslationY((float)com.tinder.fragments.bm.g().d * f1);
                        com.tinder.utils.ad.c(bm.q(b), com.tinder.utils.o.a(f1, 0.0F, 1.0F, 1.0F, com.tinder.fragments.bm.g().h));
                        bm.n(b).setTranslationY(com.tinder.fragments.bm.g().i * f1);
                        if (com.tinder.fragments.bm.o(b))
                        {
                            bm.p(b).setTranslationY(com.tinder.fragments.bm.g().g * f1);
                        }
                    }
                    com.tinder.fragments.bm.s(b).setAlpha(1.0F - f1);
                    if (bm.b(b) != null)
                    {
                        bm.b(b).setTranslationX((float)(-b.c) * f1);
                        bm.b(b).setRotation(-180F * f1);
                    }
                    if (!a) goto _L2; else goto _L1
_L1:
                    com.tinder.fragments.bm.d(b).setTranslationY(100F * f1);
_L4:
                    if (com.tinder.fragments.bm.c(b) != null)
                    {
                        com.tinder.fragments.bm.c(b).setTranslationX((float)b.c * f1);
                        com.tinder.fragments.bm.c(b).setRotation(f1 * 180F);
                    }
                    return;
_L2:
                    if (com.tinder.fragments.bm.m(b) != null && com.tinder.fragments.bm.m(b).isSuperLike())
                    {
                        bm.r(b).setAlpha(f1);
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                b = bm.this;
                a = flag;
                super();
            }
            });
            valueanimator.addListener(new au(runnable) {

                final Runnable a;
                final bm b;

                public final void onAnimationEnd(Animator animator)
                {
                    com.tinder.fragments.bm.v(b);
                    if (a != null)
                    {
                        a.run();
                    }
                }

                public final void onAnimationStart(Animator animator)
                {
                    if (bm.w(b) != null)
                    {
                        bm.w(b).b();
                    }
                    com.tinder.fragments.bm.u(b).setBackgroundColor(0);
                    com.tinder.fragments.bm.a(b, false);
                    com.tinder.fragments.bm.t(b).setVisibility(4);
                    if (com.tinder.fragments.bm.y(b).getCount() > 1)
                    {
                        com.tinder.fragments.bm.s(b).setVisibility(0);
                    }
                    if (com.tinder.fragments.bm.a && com.tinder.fragments.bm.g() != null)
                    {
                        bm.n(b).setTranslationZ(com.tinder.fragments.bm.g().j);
                        if (com.tinder.fragments.bm.o(b))
                        {
                            bm.p(b).setTranslationZ(com.tinder.fragments.bm.g().l);
                        }
                    }
                }

            
            {
                b = bm.this;
                a = runnable;
                super();
            }
            });
            valueanimator.start();
            if (H != null)
            {
                H.a(C.getCurrentItem());
                return;
            }
        }
    }

    public final void a(String s1, ReportCause reportcause, String s2)
    {
        SparksEvent sparksevent = new SparksEvent("Recs.Report");
        sparksevent.put("otherId", s1);
        sparksevent.put("reason", reportcause.getAnalyticsValue());
        r.a(sparksevent);
        if (s2 != null)
        {
            sparksevent.put("other", s2);
        }
        com.tinder.managers.a.a(sparksevent);
        (new Timer()).schedule(new TimerTask() {

            final bm a;

            public final void run()
            {
                bm.B(a).post(new Runnable(this) {

                    final _cls13 a;

                    public final void run()
                    {
                        bm.A(a.a).l();
                    }

            
            {
                a = _pcls13;
                super();
            }
                });
            }

            
            {
                a = bm.this;
                super();
            }
        }, 2500L);
    }

    public final void a(List list)
    {
        Object obj;
        byte byte0;
        if (!com.tinder.utils.o.a(list))
        {
            Picasso.a(getActivity()).a((String)list.get(0)).a(B, null);
        } else
        {
            com.tinder.utils.v.b("fragment view profile", "Profile is missing the image!");
        }
        obj = D;
        if (list.size() < 2)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((CirclePageIndicator) (obj)).setVisibility(byte0);
        obj = I;
        obj.a = list;
        ((u) (obj)).notifyDataSetChanged();
        C.setCurrentItem(U, false);
    }

    public final void b()
    {
        if (g == null)
        {
            com.tinder.utils.v.b("Attempted to set connections with a null user");
        } else
        {
            int i1 = g.getNumConnections();
            boolean flag = com.tinder.managers.ae.x();
            Object obj = g.getConnections();
            View view = getView();
            if (view != null)
            {
                Object obj1 = (TextView)view.findViewById(0x7f0e02c4);
                if (UserType.ME == f)
                {
                    ((TextView) (obj1)).setText(getResources().getQuantityString(0x7f080003, i1, new Object[] {
                        Integer.valueOf(i1)
                    }));
                    ((TextView)view.findViewById(0x7f0e02c5)).setVisibility(0);
                    view.findViewById(0x7f0e02c2).setVisibility(0);
                    view.findViewById(0x7f0e02c3).setVisibility(0);
                    return;
                }
                if (i1 > 0)
                {
                    if (flag && obj == null)
                    {
                        m.a(g.getId(), this);
                        return;
                    }
                    if (obj != null && ((ConnectionsGroup) (obj)).needsFill())
                    {
                        com.tinder.managers.f.a(((ConnectionsGroup) (obj)), P.i, this);
                        return;
                    }
                    if (obj != null)
                    {
                        int l1 = ((ConnectionsGroup) (obj)).getCompleteConnections().size();
                        ((TextView) (obj1)).setText(getResources().getQuantityString(0x7f080000, i1, new Object[] {
                            Integer.valueOf(i1)
                        }));
                        obj1 = P;
                        obj1.j = ((ConnectionsGroup) (obj)).getCompleteConnections();
                        if (((com.tinder.adapters.d) (obj1)).j != null && ((com.tinder.adapters.d) (obj1)).j.size() > 0)
                        {
                            int k1 = ((com.tinder.adapters.d) (obj1)).j.size();
                            if (k1 <= ((com.tinder.adapters.d) (obj1)).b)
                            {
                                obj1.a = 1;
                            }
                            int j1 = k1;
                            if (k1 > ((com.tinder.adapters.d) (obj1)).c)
                            {
                                j1 = ((com.tinder.adapters.d) (obj1)).c;
                            }
                            obj1.d = (int)Math.ceil((float)j1 / (float)((com.tinder.adapters.d) (obj1)).e);
                            obj1.g = ((com.tinder.adapters.d) (obj1)).a * ((com.tinder.adapters.d) (obj1)).h + ((com.tinder.adapters.d) (obj1)).f * 2;
                        }
                        P.c = 600;
                        obj = (ViewPager)view.findViewById(0x7f0e02c6);
                        ((ViewPager) (obj)).setVisibility(0);
                        ((ViewPager) (obj)).setAdapter(P);
                        ((ViewPager) (obj)).setPageMargin(getResources().getDimensionPixelSize(0x7f090158));
                        if (l1 > P.e)
                        {
                            CirclePageIndicator circlepageindicator = (CirclePageIndicator)view.findViewById(0x7f0e02c7);
                            circlepageindicator.setVisibility(0);
                            circlepageindicator.setViewPager(((ViewPager) (obj)));
                        }
                        view.findViewById(0x7f0e02c2).setVisibility(0);
                        view.findViewById(0x7f0e02c3).setVisibility(0);
                        ((ViewPager) (obj)).setCurrentItem(0, false);
                        return;
                    }
                } else
                {
                    m.a(g.getId(), this);
                    return;
                }
            }
        }
    }

    public final void b(int i1)
    {
        long l2 = 0L;
        boolean flag = true;
        Picasso.a(ManagerApp.c()).a((String)I.a.get(i1)).a(B, null);
        if (UserType.MATCH == f && h != null)
        {
            if (h.getPerson() == null || h.getPerson().profilePhotos == null || i1 >= h.getPerson().profilePhotos.size())
            {
                flag = false;
            }
            if (flag)
            {
                SparksEvent sparksevent = new SparksEvent("Chat.PhotoView");
                sparksevent.put("otherId", h.getPerson().userId);
                sparksevent.put("photoId", ((ProfilePhoto)h.getPerson().profilePhotos.get(i1)).getPhotoId());
                Object obj;
                long l1;
                if (h != null && h.hasMessages())
                {
                    l1 = com.b.a.d.a(h.getMessages()).a(com.tinder.fragments.bn.a()).a();
                    l2 = (long)h.getMessages().size() - l1;
                    if (((Message)h.getMessages().last()).isFromMe())
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
        } else
        if (UserType.REC == f)
        {
            if (g != null && i1 < g.getPhotos().size())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && g != null && i1 < g.getPhotos().size())
            {
                obj = new SparksEvent("Recs.PhotoView");
                ((SparksEvent) (obj)).put("otherId", g.getId());
                ((SparksEvent) (obj)).put("photoId", ((ProfilePhoto)g.getPhotos().get(i1)).getPhotoId());
                ((SparksEvent) (obj)).put("didSuperLike", Boolean.valueOf(g.isSuperLike()));
                com.tinder.managers.a.a(((SparksEvent) (obj)));
            }
            ar = i1;
            return;
        }
    }

    protected final void c()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        int j1;
label0:
        {
            Object obj;
label1:
            {
                List list;
                boolean flag1;
                int k1;
                int l1;
                if (UserType.ME == f)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!TextUtils.isEmpty(com.tinder.managers.ae.v()))
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                L.setVisibility(0);
                R.setVisibility(8);
                i();
                list = g.getInstagramPhotos();
                (new StringBuilder("setInstagram photosize: ")).append(list.size());
                k1 = O.a;
                l1 = O.b;
                obj = Q;
                if (list.size() < k1 * l1)
                {
                    k1 = 8;
                } else
                {
                    k1 = 0;
                }
                ((CirclePageIndicator) (obj)).setVisibility(k1);
                if (!flag1 && list.size() != 0 && i1 == 0)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                if (k1 != 0)
                {
                    M.setVisibility(0);
                    N.setVisibility(0);
                } else
                {
                    M.setVisibility(8);
                    N.setVisibility(8);
                }
                if (!flag1 && com.tinder.utils.o.a(list) || flag1 && i1 == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    J.setVisibility(8);
                    return;
                }
                J.setVisibility(0);
                if (g.getInstagramDataSet() != null)
                {
                    j1 = g.getInstagramDataSet().mediaCount;
                } else
                {
                    j1 = 0;
                }
                if (list.isEmpty())
                {
                    break; /* Loop/switch isn't completed */
                }
                S.setVisibility(8);
                L.setVisibility(0);
                L.setAdapter(O);
                L.setCurrentItem(ac);
                i();
                Q.setOnPageChangeListener(new android.support.v4.view.ViewPager.i() {

                    final bm a;

                    public final void b(int i2)
                    {
                        long l2;
                        boolean flag2;
                        l2 = 0L;
                        flag2 = true;
                        if (com.tinder.fragments.bm.f(a) == UserType.ME || bm.j(a) == i2) goto _L2; else goto _L1
_L1:
                        Object obj1;
                        byte byte0;
                        if (bm.j(a) > i2)
                        {
                            byte0 = 2;
                        } else
                        {
                            byte0 = 1;
                        }
                        if (i2 + 1 != bm.k(a).getCount())
                        {
                            flag2 = false;
                        }
                        obj1 = null;
                        if (com.tinder.fragments.bm.f(a) != UserType.REC) goto _L4; else goto _L3
_L3:
                        obj1 = new SparksEvent("Recs.ProfileInstagramPage");
_L7:
                        if (obj1 != null) goto _L6; else goto _L5
_L5:
                        com.tinder.utils.v.b("Event not sent, user type was neither match nor rec");
_L2:
                        return;
_L4:
                        if (com.tinder.fragments.bm.f(a) == UserType.MATCH)
                        {
                            SparksEvent sparksevent = new SparksEvent("Chat.ProfileInstagramPage");
                            obj1 = "none";
                            long l3;
                            if (bm.l(a) != null && bm.l(a).hasMessages())
                            {
                                l2 = com.b.a.d.a(bm.l(a).getMessages()).a(com.tinder.fragments.br.a()).a();
                                l3 = (long)bm.l(a).getMessages().size() - l2;
                                if (((Message)bm.l(a).getMessages().last()).isFromMe())
                                {
                                    obj1 = "self";
                                } else
                                {
                                    obj1 = "other";
                                }
                            } else
                            {
                                l3 = 0L;
                            }
                            sparksevent.put("numMessagesOther", Long.valueOf(l3));
                            sparksevent.put("numMessagesMe", Long.valueOf(l2));
                            sparksevent.put("lastMessageFrom", obj1);
                            obj1 = sparksevent;
                        }
                        if (true) goto _L7; else goto _L6
_L6:
                        ((SparksEvent) (obj1)).put("direction", Integer.valueOf(byte0));
                        ((SparksEvent) (obj1)).put("pageNumber", Integer.valueOf(i2));
                        ((SparksEvent) (obj1)).put("endOfPhotos", Boolean.valueOf(flag2));
                        ((SparksEvent) (obj1)).put("otherId", com.tinder.fragments.bm.m(a).getId());
                        ((SparksEvent) (obj1)).put("instagramName", com.tinder.fragments.bm.m(a).getInstagramDataSet().username);
                        com.tinder.managers.a.a(((SparksEvent) (obj1)));
                        return;
                    }

            
            {
                a = bm.this;
                super();
            }
                });
                if (getActivity() != null)
                {
                    obj = String.format(getResources().getQuantityString(0x7f080005, j1), new Object[] {
                        Integer.valueOf(j1)
                    });
                    K.setText(((CharSequence) (obj)));
                }
                obj = O;
                obj.f = list;
                if (list == null || list.size() <= 0)
                {
                    break label0;
                }
                j1 = ((t) (obj)).f.size();
                (new StringBuilder("LTSMOOTH photos per page determined by rows * columns: ")).append(((t) (obj)).e);
                i1 = j1;
                if (j1 > ((t) (obj)).c)
                {
                    i1 = ((t) (obj)).c;
                }
                j1 = i1 / ((t) (obj)).e;
                if (i1 % ((t) (obj)).e == 0)
                {
                    String.format("LTSMOOTH modulus operation for %s mod %s came out to 0", new Object[] {
                        Integer.valueOf(i1), Integer.valueOf(((t) (obj)).e)
                    });
                    if (!((t) (obj)).k)
                    {
                        break label1;
                    }
                }
                j1++;
            }
            obj.d = j1;
            (new StringBuilder("LTSMOOTH after all that, we wind up with [")).append(j1).append("] pages");
            j1 = ((t) (obj)).j + ((t) (obj)).g * 2;
            if (i1 <= ((t) (obj)).e)
            {
                k1 = i1 / ((t) (obj)).a;
                obj.i = (i1 % ((t) (obj)).a + k1) * j1 + ((t) (obj)).h;
            } else
            {
                obj.i = ((t) (obj)).a * j1 + ((t) (obj)).h;
            }
        }
        ((t) (obj)).notifyDataSetChanged();
        L.setAdapter(O);
        L.setCurrentItem(ac);
        Q.a(L, 0);
        L.setCurrentItem(ac);
        i();
        S.setVisibility(8);
        L.setVisibility(0);
        if (getView() != null)
        {
            getView().findViewById(0x7f0e02c8).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        L.setVisibility(8);
        R.setVisibility(0);
        if (g == null || g.getInstagramDataSet() == null) goto _L5; else goto _L4
_L4:
        String s1;
        boolean flag;
        if (TextUtils.equals("null", g.getInstagramDataSet().lastFetchTime))
        {
            s1 = "";
        } else
        {
            s1 = g.getInstagramDataSet().lastFetchTime;
        }
        if (!TextUtils.isEmpty(s1) || i1 == 0) goto _L5; else goto _L6
_L6:
        flag = true;
_L8:
        if (flag)
        {
            K.setText(0x7f0600e5);
            S.setVisibility(0);
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        String s2 = String.format(getResources().getQuantityString(0x7f080005, j1), new Object[] {
            Integer.valueOf(j1)
        });
        K.setText(s2);
        S.setVisibility(8);
        R.setVisibility(0);
        if (getView() != null)
        {
            getView().findViewById(0x7f0e02c8).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }

    public final void c(int i1)
    {
        if (1 == i1)
        {
            if (g != null)
            {
                ConnectionsGroup connectionsgroup = g.getConnections();
                if (connectionsgroup != null)
                {
                    connectionsgroup.setIgnoreUnresolvableIds(true);
                }
            }
            b();
        }
    }

    public final void d()
    {
        F = com.tinder.managers.ac.a(getActivity(), new com.tinder.e.ag() {

            final bm a;

            public final void a(ReportCause reportcause, String s1)
            {
                com.tinder.fragments.bm.a(a, reportcause, s1);
            }

            
            {
                a = bm.this;
                super();
            }
        }, null);
        F.show();
    }

    public final String e()
    {
        return "fragment view profile";
    }

    public final void f()
    {
        Toast.makeText(getActivity(), 0x7f0601a7, 0).show();
        if (F != null)
        {
            F.m();
        }
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        String.format("onActivityResult: requestCode[%s] responseCode[%s]", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        aa = true;
        g = m.b();
        intent = com.tinder.managers.d.c();
        if (intent != null && g != null)
        {
            intent = ((UserMeta) (intent)).instagramDataSet;
            if (intent != null)
            {
                i1 = ((InstagramDataSet) (intent)).photos.size();
            } else
            {
                i1 = 0;
            }
            String.format("FragmentProfileView onResume photosize: %d", new Object[] {
                Integer.valueOf(i1)
            });
            g.setInstagramDataSet(intent);
        }
        I.c = true;
        a(g);
        h();
_L4:
        return;
_L2:
        if (i1 != 7) goto _L4; else goto _L3
_L3:
        switch (j1)
        {
        default:
            com.tinder.managers.a.a(new SparksEvent("Account.InstagramLoginFail"));
            ao.e();
            return;

        case 0: // '\0'
            break;

        case -1: 
            intent = intent.getStringExtra("access_code");
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!TextUtils.isEmpty(intent))
        {
            an.a(intent);
            return;
        } else
        {
            com.tinder.managers.a.a(new SparksEvent("Account.InstagramLoginFail"));
            ao.e();
            return;
        }
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
        b = com.tinder.managers.ae.z();
        c = com.tinder.utils.ad.a(context) / 3;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        X = true;
        if (UserType.REC == f)
        {
            a(new Runnable() {

                final bm a;

                public final void run()
                {
                    a.dismissAllowingStateLoss();
                }

            
            {
                a = bm.this;
                super();
            }
            });
            return;
        } else
        {
            super.onCancel(dialoginterface);
            return;
        }
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 10: default 96
    //                   2131624074: 97
    //                   2131624381: 97
    //                   2131624382: 97
    //                   2131624383: 229
    //                   2131624384: 102
    //                   2131624385: 221
    //                   2131624386: 274
    //                   2131624389: 110
    //                   2131624656: 341
    //                   2131624808: 336;
           goto _L1 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L2:
        l();
        return;
_L4:
        a(RateType.PASS);
        return;
_L7:
        if (com.tinder.managers.ae.j())
        {
            k();
            return;
        } else
        {
            view = new bc();
            Bundle bundle = new Bundle();
            bundle.putParcelable("user", g);
            view.setArguments(bundle);
            view.b = new com.tinder.e.f() {

                final bm a;

                public final void a()
                {
                    SparksEvent sparksevent = new SparksEvent("SuperLikeTutorial.Select");
                    sparksevent.put("from", Integer.valueOf(2));
                    sparksevent.put("action", Integer.valueOf(1));
                    com.tinder.managers.a.a(sparksevent);
                }

                public final void b()
                {
                    com.tinder.fragments.bm.z(a);
                    SparksEvent sparksevent = new SparksEvent("SuperLikeTutorial.Select");
                    sparksevent.put("from", Integer.valueOf(2));
                    sparksevent.put("action", Integer.valueOf(2));
                    com.tinder.managers.a.a(sparksevent);
                }

            
            {
                a = bm.this;
                super();
            }
            };
            view.show(getChildFragmentManager(), "superlikeReminder");
            s.a("super_like_action", new aj() {

                final bm a;

                public final void a()
                {
                    com.tinder.managers.ae ae1 = a.k;
                    com.tinder.managers.ae.a(true);
                }

            
            {
                a = bm.this;
                super();
            }
            });
            view = new SparksEvent("SuperLikeTutorial.View");
            view.put("from", Integer.valueOf(2));
            com.tinder.managers.a.a(view);
            return;
        }
_L5:
        a(RateType.LIKE);
        return;
_L3:
        com.tinder.managers.a.a("Profile.Edit");
        view = new Intent(getActivity(), com/tinder/activities/ActivityEditProfile);
        view.addFlags(0x10000);
        view.putExtra("instagramConnectValue", 1);
        startActivityForResult(view, 1);
        return;
_L6:
        if (!W && !com.tinder.utils.ad.c(G))
        {
            android.support.v4.app.i i1 = getActivity();
            if (b)
            {
                view = ah;
            } else
            {
                view = null;
            }
            G = new m(i1, this, null, view);
            G.show();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        l();
        return;
_L8:
        if (f != null)
        {
            switch (com.tinder.fragments._cls15.a[f.ordinal()])
            {
            default:
                an.a(1);
                return;

            case 1: // '\001'
                an.a(3);
                return;

            case 2: // '\002'
                an.a(2);
                break;
            }
            return;
        }
        if (true) goto _L1; else goto _L10
_L10:
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        f = (UserType)bundle1.getSerializable("userType");
        g = (User)bundle1.getParcelable("user");
        if (bundle != null)
        {
            ab = bundle.getInt(am);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        return new Dialog(getActivity(), 0x7f0b0167);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        T = new Handler(Looper.getMainLooper());
        return layoutinflater.inflate(0x7f03009b, viewgroup, false);
    }

    public final void onOverScroll(double d1)
    {
        if (d1 < 0.0D)
        {
            return;
        } else
        {
            C.setPivotX(V / 2);
            C.setPivotY(V);
            com.tinder.utils.ad.c(C, com.tinder.utils.o.a((float)d1, 0.0F, 1.0F, 1.0F, (float)y.getOverScrollMax() / (float)V + 1.0F));
            D.setAlpha((float)(1.0D - d1));
            return;
        }
    }

    public final void onPause()
    {
        if (UserType.REC == f && g != null)
        {
            if (X)
            {
                SparksEvent sparksevent = new SparksEvent("Recs.ProfileClose");
                sparksevent.put("otherId", g.getId());
                sparksevent.put("didSuperLike", Boolean.valueOf(g.isSuperLike()));
                com.tinder.managers.a.a(sparksevent);
            } else
            {
                Y = true;
                com.tinder.managers.a.a("Recs.End");
            }
        }
        ac = L.getCurrentItem();
        Z = true;
        super.onPause();
    }

    public final void onResume()
    {
        byte byte0;
        byte0 = 1;
        super.onResume();
        if (UserType.REC != f || !Y) goto _L2; else goto _L1
_L1:
        com.tinder.managers.a.a("Recs.Start");
_L8:
        if (!Z) goto _L4; else goto _L3
_L3:
        if (aa) goto _L6; else goto _L5
_L5:
        (new Handler()).postDelayed(new Runnable() {

            final bm a;

            public final void run()
            {
                a.c();
            }

            
            {
                a = bm.this;
                super();
            }
        }, 500L);
_L4:
        return;
_L2:
        if (UserType.REC == f && g != null)
        {
            SparksEvent sparksevent = new SparksEvent("Recs.ProfileOpen");
            sparksevent.put("otherId", g.getId());
            if (!TextUtils.isEmpty(g.getNearByLocationName()))
            {
                byte0 = 2;
            }
            sparksevent.put("location", Integer.valueOf(byte0));
            InstagramDataSet instagramdataset = g.getInstagramDataSet();
            if (instagramdataset != null)
            {
                if (!TextUtils.isEmpty(g.getInstagramDataSet().username))
                {
                    sparksevent.put("instagramName", instagramdataset.username);
                }
                if (g.getInstagramDataSet().mediaCount != 0)
                {
                    sparksevent.put("photoTotal", Integer.valueOf(instagramdataset.mediaCount));
                }
            }
            sparksevent.put("didSuperLike", Boolean.valueOf(g.isSuperLike()));
            g.getCareer().appendAnalyticsInfo(sparksevent);
            com.tinder.managers.a.a(sparksevent);
        } else
        if (UserType.ME == f)
        {
            Object obj = com.tinder.managers.d.c();
            if (obj != null && g != null)
            {
                obj = ((UserMeta) (obj)).instagramDataSet;
                int i1;
                if (obj != null)
                {
                    i1 = ((InstagramDataSet) (obj)).photos.size();
                } else
                {
                    i1 = 0;
                }
                String.format("FragmentProfileView onResume photosize: %d", new Object[] {
                    Integer.valueOf(i1)
                });
                g.setInstagramDataSet(((InstagramDataSet) (obj)));
            }
            com.tinder.managers.a.a("Profile.View");
        }
        continue; /* Loop/switch isn't completed */
_L6:
        aa = false;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt(am, ab);
        super.onSaveInstanceState(bundle);
    }

    public final void onStart()
    {
        super.onStart();
        if (UserType.REC == f)
        {
            Dialog dialog = getDialog();
            if (dialog != null)
            {
                dialog.getWindow().setLayout(-1, -1);
                dialog.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

                    final bm a;

                    public final boolean onKey(DialogInterface dialoginterface, int i1, KeyEvent keyevent)
                    {
                        if (i1 == 4 && keyevent.getAction() == 1)
                        {
                            a.a(new Runnable(this) {

                                final _cls10 a;

                                public final void run()
                                {
                                    a.a.dismissAllowingStateLoss();
                                }

            
            {
                a = _pcls10;
                super();
            }
                            });
                            return true;
                        } else
                        {
                            return false;
                        }
                    }

            
            {
                a = bm.this;
                super();
            }
                });
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        if (UserType.ME == f && com.tinder.utils.o.e())
        {
            view.setOutlineProvider(new ViewOutlineProvider() {

                final bm a;

                public final void getOutline(View view1, Outline outline)
                {
                    outline.setRect(0, 0, view1.getWidth(), view1.getHeight());
                }

            
            {
                a = bm.this;
                super();
            }
            });
            view.setTranslationZ(26F);
            view.setClipToOutline(false);
        }
        V = (int)com.tinder.utils.ad.a(1.0F);
        I = new u(getActivity());
        I.b = this;
        C = (SkippableViewPager)view.findViewById(0x7f0e02b1);
        bundle = C.getLayoutParams();
        bundle.width = V;
        bundle.height = V;
        C.setLayoutParams(bundle);
        C.setAdapter(I);
        C.setOnClickListener(this);
        D = (CirclePageIndicator)view.findViewById(0x7f0e02b4);
        D.a(C, U);
        D.setOnPageChangeListener(this);
        z = view.findViewById(0x7f0e02b2);
        B = (ImageView)view.findViewById(0x7f0e02b3);
        bundle = (android.widget.RelativeLayout.LayoutParams)B.getLayoutParams();
        bundle.width = V;
        bundle.height = V;
        B.setLayoutParams(bundle);
        y = (OverScrollView)view.findViewById(0x7f0e02b0);
        y.setOverScrollListener(this);
        x = (RelativeLayout)view.findViewById(0x7f0e02b5);
        d = (TextView)view.findViewById(0x7f0e02b8);
        w = (TextView)view.findViewById(0x7f0e02b9);
        u = (TextView)view.findViewById(0x7f0e02c1);
        v = (TextView)view.findViewById(0x7f0e02bf);
        aj = (TextView)view.findViewById(0x7f0e02bb);
        e = (InterestsView)view.findViewById(0x7f0e02d3);
        P = new com.tinder.adapters.d(view.getContext());
        ai = (ImageView)view.findViewById(0x7f0e02b7);
        A = view.findViewById(0x7f0e02d6);
        aq = view.findViewById(0x7f0e02c0);
        boolean flag;
        if (f != UserType.REC || !b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad = flag;
        if (ad)
        {
            bundle = (ViewStub)view.findViewById(0x7f0e02d4);
            bundle.setOnInflateListener(new android.view.ViewStub.OnInflateListener() {

                final bm a;

                public final void onInflate(ViewStub viewstub, View view1)
                {
                    com.tinder.fragments.bm.a(a, view1);
                }

            
            {
                a = bm.this;
                super();
            }
            });
            int i1;
            if (f == UserType.REC)
            {
                i1 = 0x7f030076;
            } else
            {
                i1 = 0x7f030075;
            }
            bundle.setLayoutResource(i1);
            if (UserType.MATCH == f)
            {
                bundle.setVisibility(8);
                y.setPadding(0, 0, 0, 0);
            } else
            {
                bundle.setVisibility(0);
            }
            ah = (ImageView)view.findViewById(0x7f0e01c2);
            ah.setVisibility(8);
        } else
        {
            bundle = (ViewStub)view.findViewById(0x7f0e02d5);
            bundle.setOnInflateListener(new android.view.ViewStub.OnInflateListener() {

                final bm a;

                public final void onInflate(ViewStub viewstub, View view1)
                {
                    com.tinder.fragments.bm.a(a, (LinearLayout)view1.findViewById(0x7f0e01c4));
                    bm.b(a, com.tinder.fragments.bm.a(a).findViewById(0x7f0e01c0));
                    com.tinder.fragments.bm.c(a, com.tinder.fragments.bm.a(a).findViewById(0x7f0e01c1));
                    com.tinder.fragments.bm.d(a, com.tinder.fragments.bm.a(a).findViewById(0x7f0e01c5));
                    if (com.tinder.utils.o.e())
                    {
                        viewstub = new ViewOutlineProvider(this) {

                            final _cls16 a;

                            public final void getOutline(View view, Outline outline)
                            {
                                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                            }

            
            {
                a = _pcls16;
                super();
            }
                        };
                        bm.b(a).setOutlineProvider(viewstub);
                        com.tinder.fragments.bm.c(a).setOutlineProvider(viewstub);
                        com.tinder.fragments.bm.d(a).setOutlineProvider(viewstub);
                    }
                    bm.b(a).setOnClickListener(a);
                    com.tinder.fragments.bm.c(a).setOnClickListener(a);
                    com.tinder.fragments.bm.d(a).setOnClickListener(a);
                    bm.b(a).setVisibility(4);
                    com.tinder.fragments.bm.c(a).setVisibility(4);
                    com.tinder.fragments.bm.d(a).setVisibility(4);
                    com.tinder.fragments.bm.e(a);
                }

            
            {
                a = bm.this;
                super();
            }
            });
            bundle.setLayoutResource(0x7f030077);
            bundle.setVisibility(0);
            y.setPadding(0, 0, 0, 0);
            ((ViewStub)view.findViewById(0x7f0e02d4)).setVisibility(8);
            ah = (ImageView)view.findViewById(0x7f0e01c2);
            ah.setColorFilter(getResources().getColor(0x7f0d0101));
            ah.setOnClickListener(this);
            com.tinder.utils.a.a(af, 0.7F, 200L, 200L);
            com.tinder.utils.a.a(ae, 0.7F, 200L, 200L);
            com.tinder.utils.a.a(ag, 0.7F, 200L, 200L);
        }
        J = (RelativeLayout)view.findViewById(0x7f0e02c9);
        K = (CustomTextView)view.findViewById(0x7f0e02ca);
        M = (CustomTextView)view.findViewById(0x7f0e02cf);
        N = (CustomButton)view.findViewById(0x7f0e02d0);
        L = (ViewPager)view.findViewById(0x7f0e02ce);
        R = (LinearLayout)view.findViewById(0x7f0e02cd);
        S = (ProgressBar)view.findViewById(0x7f0e02cb);
        Q = (CirclePageIndicator)view.findViewById(0x7f0e02cc);
        O = new t(getActivity(), this);
        N.setOnClickListener(this);
        ao = new com.tinder.d.e() {

            final bm a;

            public final void a(String s1)
            {
                com.tinder.fragments.bm.h(a).setVisibility(8);
                com.tinder.fragments.bm.i(a).setVisibility(8);
            }

            public final void c()
            {
                if (com.tinder.fragments.bm.f(a) == UserType.MATCH)
                {
                    a.o.a(a.getParentFragment());
                    return;
                } else
                {
                    a.o.a(a.getParentFragment().getParentFragment());
                    return;
                }
            }

            public final void e()
            {
                (new com.tinder.c.d(a.getActivity(), com.tinder.fragments.bm.g(a))).show();
            }

            public final void g()
            {
                (new com.tinder.c.c(a.getActivity())).show();
            }

            
            {
                a = bm.this;
                super();
            }
        };
        an = new com.tinder.g.a(ao, j);
        a(g);
        i1 = (com.tinder.utils.ad.a(getActivity()) - (int)com.tinder.utils.ad.a(60F, getActivity())) / 3;
        N.setWidth(i1);
        a(view);
    }

    public final void u()
    {
        onActivityResult(1, -1, null);
    }

    public final void v()
    {
    }

}
