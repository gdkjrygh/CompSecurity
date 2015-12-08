// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.activities.ActivityBlend;
import com.tinder.activities.ActivityMain;
import com.tinder.activities.ActivityPassport;
import com.tinder.activities.ActivityUsername;
import com.tinder.adapters.j;
import com.tinder.base.f;
import com.tinder.enums.Blend;
import com.tinder.enums.PaywallPerk;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.y;
import com.tinder.managers.z;
import com.tinder.model.Paywall;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;
import com.tinder.model.User;
import com.tinder.utils.v;
import com.tinder.views.CustomTextView;
import com.tinder.views.LinearAdapterLayout;
import com.tinder.views.RangeSeekBar;
import org.json.JSONException;
import org.json.JSONObject;

public final class u extends f
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener, android.widget.SeekBar.OnSeekBarChangeListener, com.tinder.views.RangeSeekBar.OnRangeSeekBarChangeListener
{

    View A;
    y B;
    ad C;
    ae D;
    z E;
    aa F;
    ab G;
    private final int H = 4;
    private int I;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private Blend S;
    private int T;
    private RangeSeekBar U;
    private Blend V;
    j c;
    SwitchCompat d;
    SeekBar e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    SwitchCompat j;
    SwitchCompat k;
    View l;
    View m;
    View n;
    LinearAdapterLayout o;
    com.tinder.adapters.j.a p;
    View q;
    View r;
    View s;
    CustomTextView t;
    View u;
    View v;
    View w;
    TextView x;
    View y;
    View z;

    public u()
    {
    }

    static Blend a(u u1)
    {
        return u1.V;
    }

    private void a()
    {
        User user = E.b();
        if (user != null && !user.getUsername().isEmpty())
        {
            r.setVisibility(0);
            s.setVisibility(0);
            t.setText(user.getUsername());
            u.setVisibility(0);
            v.setVisibility(0);
            y.setVisibility(8);
            z.setVisibility(4);
            return;
        } else
        {
            t.setText(getString(0x7f060079));
            r.setVisibility(8);
            s.setVisibility(8);
            u.setVisibility(8);
            v.setVisibility(8);
            y.setVisibility(0);
            z.setVisibility(0);
            return;
        }
    }

    private void a(int i1)
    {
        String s1;
        if (M)
        {
            s1 = getString(0x7f0601da);
        } else
        {
            s1 = getString(0x7f0601d9);
        }
        if (!M)
        {
            i1 = Math.round((float)i1 * 1.60934F);
        }
        f.setText((new StringBuilder()).append(i1).append(s1).toString());
    }

    static void a(u u1, boolean flag, Blend blend)
    {
        u1.a(flag, blend);
    }

    private void a(boolean flag, Blend blend)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        static final class _cls9
        {

            static final int a[];

            static 
            {
                a = new int[Blend.values().length];
                try
                {
                    a[Blend.OPTIMAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Blend.POPULARITY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Blend.DISTANCE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Blend.RECENT_ACTIVITY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.tinder.fragments._cls9.a[blend.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 60
    //                   2 70
    //                   3 80
    //                   4 90;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        blend = getString(0x7f060154);
_L8:
        x.setText(blend);
        return;
_L3:
        blend = getString(0x7f060154);
        continue; /* Loop/switch isn't completed */
_L4:
        blend = getString(0x7f060175);
        continue; /* Loop/switch isn't completed */
_L5:
        blend = getString(0x7f06009e);
        continue; /* Loop/switch isn't completed */
_L6:
        blend = getString(0x7f06018e);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void b()
    {
        h.setText("");
        if (Q)
        {
            h.append(getString(0x7f060114));
        }
        if (P)
        {
            if (Q)
            {
                h.append(", ");
            }
            h.append(getString(0x7f0600c6));
        }
    }

    static void b(u u1)
    {
        u1.F.a(u1. new com.tinder.e.ak() {

            final u a;

            public final void a()
            {
                Object obj = new SparksEvent("Passport.MapOpen");
                ((SparksEvent) (obj)).put("from", Integer.valueOf(2));
                com.tinder.managers.a.a(((SparksEvent) (obj)));
                obj = new Intent(a.getActivity(), com/tinder/activities/ActivityPassport);
                a.startActivityForResult(((Intent) (obj)), 8800);
            }

            public final void b()
            {
                SparksEvent sparksevent = new SparksEvent("Passport.MapOpen");
                sparksevent.put("from", Integer.valueOf(2));
                com.tinder.managers.a.a(sparksevent);
                ((Paywall)a.getActivity()).launchPlusSubscriptionPaywall(1, PaywallPerk.PASSPORT);
            }

            public final void c()
            {
                Toast.makeText(ManagerApp.c(), 0x7f0600ab, 1).show();
            }

            
            {
                a = u.this;
                super();
            }
        });
    }

    private void c()
    {
        U.setSelectedMinValue(Integer.valueOf(I));
        U.setSelectedMaxValue(Integer.valueOf(J));
        g.setText(String.format("%d - %d", new Object[] {
            Integer.valueOf(I), Integer.valueOf(J)
        }));
        if (J == 55)
        {
            g.setText(String.format("%s+", new Object[] {
                g.getText()
            }));
        }
    }

    private boolean d()
    {
        boolean flag1 = false;
        boolean flag;
        if (ae.D() && V != null && V != ab.c(ae.C()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (P != C.b() || Q != C.i || I != C.f || e() != C.g || R != C.k || N || flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    private int e()
    {
        if (J == 55)
        {
            return 1000;
        } else
        {
            return J;
        }
    }

    private void f()
    {
        byte byte0 = -1;
        if (V != null && !V.equals(ab.c(ae.C())))
        {
            SparksEvent sparksevent = new SparksEvent("Menu.BlendSelect");
            sparksevent.put("blend", Integer.valueOf(V.source));
            com.tinder.managers.a.a(sparksevent);
        }
        int i1 = e();
        z z1 = E;
        boolean flag = R;
        boolean flag1 = Q;
        boolean flag2 = P;
        float f1 = T;
        int j1 = I;
        Blend blend = V;
        ActivityMain activitymain = (ActivityMain)getActivity();
        (new StringBuilder(" isDiscoverable = ")).append(flag).append(" interestedInMales=").append(flag1).append(", interestedInFemales=").append(flag2).append(", distanceFilter=").append(f1).append(", ageMin=").append(j1).append(", ageMax=").append(i1);
        JSONObject jsonobject;
        if (flag1 && flag2)
        {
            z1.d.b(-1);
        } else
        if (flag1)
        {
            z1.d.b(0);
        } else
        {
            z1.d.b(1);
        }
        z1.d.a(f1);
        z1.d.c(j1);
        z1.d.d(i1);
        jsonobject = new JSONObject();
        if (!flag2 || !flag1)
        {
            if (flag1)
            {
                byte0 = 0;
            } else
            {
                byte0 = 1;
            }
        }
        if (blend == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (ae.a())
        {
            jsonobject.put("blend", blend.name);
        }
        jsonobject.put("discoverable", flag);
        jsonobject.put("gender_filter", byte0);
        jsonobject.put("age_filter_min", j1);
        jsonobject.put("age_filter_max", i1);
        jsonobject.put("distance_filter", Math.round(f1));
_L2:
        z1.a(jsonobject, activitymain);
        return;
        JSONException jsonexception;
        jsonexception;
        com.tinder.utils.v.b(jsonexception.toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 != 8800 || j1 != -1) goto _L2; else goto _L1
_L1:
        intent = (TinderLocation)intent.getParcelableExtra("tinderlocation");
        if (intent == null) goto _L4; else goto _L3
_L3:
        ((ActivityMain)getActivity()).a(intent);
        c.d = com.tinder.managers.y.a(4);
        c.a(intent);
        p.b.setColorFilter(j.b);
        p.c.setVisibility(4);
_L6:
        return;
_L4:
        com.tinder.utils.v.b("No location in data passed back by ActivityPassport");
        return;
_L2:
        if (i1 != 8134)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent == null) goto _L6; else goto _L5
_L5:
        intent = intent.getStringExtra("blend");
        if (intent == null) goto _L6; else goto _L7
_L7:
        V = ab.c(intent);
        a(false, V);
        return;
        if (i1 != 8833) goto _L6; else goto _L8
_L8:
        a();
        return;
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        switch (compoundbutton.getId())
        {
        default:
            return;

        case 2131624530: 
            R = flag;
            return;

        case 2131624539: 
            P = flag;
            if (!flag)
            {
                j.setChecked(true);
            }
            b();
            return;

        case 2131624538: 
            Q = flag;
            break;
        }
        if (!flag)
        {
            k.setChecked(true);
        }
        b();
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            if (d())
            {
                f();
            }
            ((ActivityMain)getActivity()).r();
            return;

        case 2131624531: 
            i.setVisibility(4);
            o.setVisibility(0);
            view = new SparksEvent("Passport.MenuOpen");
            view.put("recsExhausted", Boolean.valueOf(G.e));
            view.put("from", Integer.valueOf(2));
            com.tinder.managers.a.a(view);
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030096, viewgroup, false);
        d = (SwitchCompat)layoutinflater.findViewById(0x7f0e0252);
        e = (SeekBar)layoutinflater.findViewById(0x7f0e025f);
        f = (TextView)layoutinflater.findViewById(0x7f0e025d);
        g = (TextView)layoutinflater.findViewById(0x7f0e0260);
        h = (TextView)layoutinflater.findViewById(0x7f0e0258);
        j = (SwitchCompat)layoutinflater.findViewById(0x7f0e025a);
        k = (SwitchCompat)layoutinflater.findViewById(0x7f0e025b);
        l = layoutinflater.findViewById(0x7f0e008a);
        m = layoutinflater.findViewById(0x7f0e008c);
        n = layoutinflater.findViewById(0x7f0e008b);
        q = layoutinflater.findViewById(0x7f0e0266);
        r = layoutinflater.findViewById(0x7f0e026a);
        s = layoutinflater.findViewById(0x7f0e026c);
        t = (CustomTextView)layoutinflater.findViewById(0x7f0e0267);
        u = layoutinflater.findViewById(0x7f0e0269);
        v = layoutinflater.findViewById(0x7f0e026b);
        w = layoutinflater.findViewById(0x7f0e0262);
        x = (CustomTextView)layoutinflater.findViewById(0x7f0e0264);
        y = layoutinflater.findViewById(0x7f0e0268);
        z = layoutinflater.findViewById(0x7f0e026d);
        A = layoutinflater.findViewById(0x7f0e0265);
        return layoutinflater;
    }

    public final void onPause()
    {
        if (d())
        {
            C.d(true);
            f();
        }
        super.onPause();
    }

    public final void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
    {
        T = Math.max(1, i1);
        a(T);
        if (flag)
        {
            N = true;
        }
    }

    public final void onRangeSeekBarValuesChanged(RangeSeekBar rangeseekbar, Object obj, Object obj1)
    {
        rangeseekbar = (Integer)obj;
        obj = (Integer)obj1;
        O = true;
        I = rangeseekbar.intValue();
        J = ((Integer) (obj)).intValue();
        c();
    }

    public final void onResume()
    {
        super.onResume();
        R = C.k;
        d.setChecked(R);
        if (ae.D() && ae.t())
        {
            if (S == null)
            {
                S = ab.c(ae.C());
                Blend blend = S;
                F.a(new com.tinder.e.ak(blend) {

                    final Blend a;
                    final u b;

                    public final void a()
                    {
                        com.tinder.fragments.u.a(b, false, a);
                    }

                    public final void b()
                    {
                        com.tinder.fragments.u.a(b, true, a);
                    }

                    public final void c()
                    {
                        com.tinder.fragments.u.a(b, true, a);
                    }

            
            {
                b = u.this;
                a = blend;
                super();
            }
                });
            }
            w.setVisibility(0);
            return;
        } else
        {
            w.setVisibility(8);
            return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (E.b() != null)
        {
            view = E.b().getAge();
            if (view != null)
            {
                int i1;
                int j1;
                if (Integer.parseInt(view) < 18)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    A.setVisibility(8);
                }
                if (i1 != 0)
                {
                    j1 = 13;
                } else
                {
                    j1 = 18;
                }
                K = j1;
                if (i1 != 0)
                {
                    j1 = 17;
                } else
                {
                    j1 = 55;
                }
                L = j1;
                if (i1 != 0 && C.f >= 18)
                {
                    I = K;
                    J = L;
                    O = true;
                } else
                {
                    I = Math.max(C.f, K);
                    J = Math.min(C.g, L);
                }
            }
        }
        U = new RangeSeekBar(BitmapFactory.decodeResource(getResources(), 0x7f0201dd), BitmapFactory.decodeResource(getResources(), 0x7f0201df), Integer.valueOf(K), Integer.valueOf(L), getActivity());
        U.setLineHeight(getResources().getDimensionPixelSize(0x7f090196));
        U.setSliderSecondaryColor(android.support.v4.b.a.b(getContext(), 0x7f0d008e));
        U.setSliderPrimaryColor(android.support.v4.b.a.b(getContext(), 0x7f0d0101));
        U.setThumbColor(android.support.v4.b.a.b(getContext(), 0x7f0d0101));
        U.setPadding(getResources().getDimensionPixelOffset(0x7f09015c), 0, 0, 0);
        view = (FrameLayout)getView().findViewById(0x7f0e0261);
        bundle = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        view.addView(U, bundle);
        U.setNotifyWhileDragging(true);
        U.setContentDescription("age_range_bar");
        U.setOnRangeSeekBarChangeListener(this);
        e.setOnSeekBarChangeListener(this);
        d.setOnCheckedChangeListener(this);
        j.setOnCheckedChangeListener(this);
        k.setOnCheckedChangeListener(this);
        P = C.b();
        Q = C.i;
        M = C.j;
        T = (int)C.a();
        k.setChecked(P);
        j.setChecked(Q);
        view = new android.view.View.OnClickListener() {

            final u a;

            public final void onClick(View view1)
            {
                ((ActivityMain)a.getActivity()).r();
            }

            
            {
                a = u.this;
                super();
            }
        };
        n.setOnClickListener(view);
        l.setOnClickListener(view);
        m.setOnClickListener(view);
        q.setOnClickListener(new android.view.View.OnClickListener() {

            final u a;

            public final void onClick(View view1)
            {
                a.startActivityForResult(new Intent(a.getActivity(), com/tinder/activities/ActivityUsername), 8833);
            }

            
            {
                a = u.this;
                super();
            }
        });
        r.setOnClickListener(new android.view.View.OnClickListener() {

            final u a;

            public final void onClick(View view1)
            {
                view1 = a.E.b();
                if (view1 != null)
                {
                    String s1 = view1.getUsername();
                    if (ManagerApp.a)
                    {
                        view1 = "https://prodtest2-website.gotinder.com/@";
                    } else
                    {
                        view1 = a.getString(0x7f06021e);
                    }
                    view1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append(view1).append(s1).toString()));
                    a.startActivity(view1);
                }
            }

            
            {
                a = u.this;
                super();
            }
        });
        s.setOnClickListener(new android.view.View.OnClickListener() {

            final u a;

            public final void onClick(View view1)
            {
                view1 = a.E.b();
                if (view1 != null)
                {
                    Object obj = view1.getUsername();
                    if (ManagerApp.a)
                    {
                        view1 = "https://prodtest2-website.gotinder.com/@";
                    } else
                    {
                        view1 = a.getString(0x7f06021e);
                    }
                    view1 = (new StringBuilder()).append(view1).append(((String) (obj))).toString();
                    obj = new Intent("android.intent.action.SEND");
                    ((Intent) (obj)).setType("text/plain");
                    ((Intent) (obj)).putExtra("android.intent.extra.TEXT", view1);
                    a.startActivity(Intent.createChooser(((Intent) (obj)), a.getResources().getString(0x7f0601d6)));
                    com.tinder.managers.a.a("DeepLink.ShareID");
                }
            }

            
            {
                a = u.this;
                super();
            }
        });
        V = ab.c(ae.C());
        w.setOnClickListener(new android.view.View.OnClickListener() {

            final u a;

            public final void onClick(View view1)
            {
                view1 = new SparksEvent("Menu.OpenBlendPage");
                ae ae1 = a.D;
                view1.put("blend", Integer.valueOf(ab.c(ae.C()).source));
                com.tinder.managers.a.a(view1);
                view1 = new Intent(a.getActivity(), com/tinder/activities/ActivityBlend);
                view1.putExtra("blend", com.tinder.fragments.u.a(a).name);
                a.startActivityForResult(view1, 8134);
            }

            
            {
                a = u.this;
                super();
            }
        });
        a();
        c();
        i1 = Math.max(1, T);
        e.setProgress(i1);
        a(i1);
        view = getView();
        if (view == null)
        {
            com.tinder.utils.v.b("Cannot set up passport without a view set.");
            return;
        }
        bundle = (ViewGroup)view.findViewById(0x7f0e0253);
        if (!ae.t())
        {
            bundle.setVisibility(8);
            view.findViewById(0x7f0e0257).setVisibility(8);
            return;
        }
        bundle.setOnClickListener(this);
        bundle.getLayoutTransition().setInterpolator(0, new OvershootInterpolator());
        view = B.b;
        o = (LinearAdapterLayout)getView().findViewById(0x7f0e0256);
        c = new j(com.tinder.managers.y.a(4));
        c.a(view);
        p = new com.tinder.adapters.j.a();
        bundle = LayoutInflater.from(getContext()).inflate(0x7f030026, o, false);
        p.b = (ImageView)bundle.findViewById(0x7f0e00af);
        p.b.setImageResource(0x7f02021d);
        p.b.setColorFilter(j.a);
        o.setHeader(bundle);
        p.a = (TextView)bundle.findViewById(0x7f0e00b1);
        p.a.setText(0x7f060128);
        p.c = (ImageView)bundle.findViewById(0x7f0e00b0);
        bundle = LayoutInflater.from(getContext()).inflate(0x7f030026, o, false);
        bundle.setTag("footer");
        bundle.setBackgroundResource(0x7f0201d8);
        ((ImageView)bundle.findViewById(0x7f0e00af)).setVisibility(4);
        TextView textview = (TextView)bundle.findViewById(0x7f0e00b1);
        textview.setText(0x7f06005c);
        textview.setTextColor(getResources().getColorStateList(0x7f0d0124));
        o.setFooter(bundle);
        o.setOnClickListenerForItems(new android.view.View.OnClickListener() {

            final u a;

            public final void onClick(View view1)
            {
                int k1 = a.o.indexOfChild(view1);
                boolean flag;
                if (view1.getTag() != null && view1.getTag().equals("footer"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    u.b(a);
                    return;
                }
                if (k1 == 0)
                {
                    a.c.a(null);
                    a.p.c.setVisibility(0);
                    a.p.b.setColorFilter(j.a);
                    view1 = a.getString(0x7f060128);
                    SparksEvent sparksevent = new SparksEvent("Passport.MenuMyLocation");
                    sparksevent.put("from", Integer.valueOf(2));
                    com.tinder.managers.a.a(sparksevent);
                    ((ActivityMain)a.getActivity()).x();
                    a.i.setText(view1);
                    return;
                }
                view1 = (TinderLocation)a.c.getItem(k1 - 1);
                ((ActivityMain)a.getActivity()).a(view1);
                String s1 = view1.getDisplayLabel();
                if (ae.a())
                {
                    a.p.c.setVisibility(4);
                    a.p.b.setColorFilter(j.b);
                    a.i.setText(s1);
                    a.c.a(view1);
                    a.i.setText(s1);
                }
                AsyncTask.execute(new Runnable(this, view1) {

                    final TinderLocation a;
                    final _cls6 b;

                    public final void run()
                    {
                        SparksEvent sparksevent = new SparksEvent("Passport.MenuChooseLocation");
                        sparksevent.put("newLat", Double.valueOf(a.getLatitude()));
                        sparksevent.put("newLon", Double.valueOf(a.getLongitude()));
                        com.tinder.managers.a.a(sparksevent);
                    }

            
            {
                b = _pcls6;
                a = tinderlocation;
                super();
            }
                });
            }

            
            {
                a = u.this;
                super();
            }
        });
        o.setAdapter(c);
        i = (TextView)getView().findViewById(0x7f0e0255);
        if (view == null)
        {
            i.setText(0x7f060128);
            p.c.setVisibility(0);
            p.b.setColorFilter(j.a);
            return;
        } else
        {
            i.setText(view.getDisplayLabel());
            p.b.setColorFilter(j.b);
            return;
        }
    }
}
