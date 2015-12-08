// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.m;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.c;
import com.google.android.m4b.maps.model.LatLng;
import com.tinder.a.f;
import com.tinder.adapters.g;
import com.tinder.base.a;
import com.tinder.e.au;
import com.tinder.e.p;
import com.tinder.f.ak;
import com.tinder.fragments.FragmentMap;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.d;
import com.tinder.managers.y;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;
import com.tinder.utils.ad;
import com.tinder.utils.t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivityPassport extends a
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.TextView.OnEditorActionListener, p
{

    y a;
    private FragmentMap b;
    private ListView c;
    private ProgressBar d;
    private View e;
    private View f;
    private View g;
    private ImageView h;
    private ImageView i;
    private EditText j;
    private g k;
    private TransitionDrawable q;
    private boolean r;
    private List s;
    private boolean t;

    public ActivityPassport()
    {
    }

    static g a(ActivityPassport activitypassport)
    {
        return activitypassport.k;
    }

    static boolean b(ActivityPassport activitypassport)
    {
        return activitypassport.t;
    }

    static FragmentMap c(ActivityPassport activitypassport)
    {
        return activitypassport.b;
    }

    static View d(ActivityPassport activitypassport)
    {
        return activitypassport.f;
    }

    static TransitionDrawable e(ActivityPassport activitypassport)
    {
        return activitypassport.q;
    }

    static EditText f(ActivityPassport activitypassport)
    {
        return activitypassport.j;
    }

    private void f()
    {
        r = false;
        g();
        i.animate().alpha(0.7F).setDuration(150L).start();
        g.animate().alpha(1.0F).setDuration(150L).start();
        h.animate().alpha(1.0F).setDuration(150L).start();
        e.animate().alpha(1.0F).setDuration(150L).start();
        f.animate().alpha(0.0F).setDuration(150L).setListener(new au(this) {

            final Activity a;
            final ActivityPassport b;

            public final void onAnimationEnd(Animator animator)
            {
                com.tinder.activities.ActivityPassport.d(b).setVisibility(4);
                ad.a(com.tinder.activities.ActivityPassport.f(b).getWindowToken(), a);
            }

            public final void onAnimationStart(Animator animator)
            {
                ActivityPassport.e(b).reverseTransition(150);
                com.tinder.activities.ActivityPassport.f(b).setText("");
                com.tinder.activities.ActivityPassport.f(b).clearFocus();
                com.tinder.activities.ActivityPassport.f(b).setCursorVisible(false);
                com.tinder.activities.ActivityPassport.c(b).getView().requestFocus();
            }

            
            {
                b = ActivityPassport.this;
                a = activity;
                super();
            }
        }).start();
        d.setVisibility(4);
    }

    private static void g()
    {
        ManagerApp.b().a("passport_search");
    }

    static void g(ActivityPassport activitypassport)
    {
        activitypassport.f();
    }

    protected final void A_()
    {
        super.A_();
        overridePendingTransition(0x7f04000a, 0);
    }

    public final void a(List list)
    {
        if (r)
        {
            k.a = list;
            k.notifyDataSetChanged();
        }
        d.setVisibility(4);
        if (list.isEmpty())
        {
            Toast.makeText(this, 0x7f060136, 0).show();
        }
    }

    public final void e()
    {
        d.setVisibility(4);
        Toast.makeText(this, 0x7f060136, 0).show();
    }

    public void onBackPressed()
    {
        if (r)
        {
            f();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624074: 
        case 2131624363: 
            onBackPressed();
            return;

        case 2131624466: 
            onBackPressed();
            return;

        case 2131624468: 
        case 2131624469: 
        case 2131624470: 
            if (r)
            {
                ad.a(this, j);
                return;
            } else
            {
                r = true;
                i.animate().alpha(1.0F).setDuration(150L).start();
                g.animate().alpha(0.7F).setDuration(150L).start();
                h.animate().alpha(0.7F).setDuration(150L).start();
                e.animate().alpha(0.7F).setDuration(150L).start();
                k.a = s;
                t = true;
                f.setAlpha(0.0F);
                f.animate().setDuration(135L).alpha(1.0F).setListener(new au(this) {

                    final Context a;
                    final ActivityPassport b;

                    public final void onAnimationEnd(Animator animator)
                    {
                        com.tinder.activities.ActivityPassport.f(b).setFocusableInTouchMode(true);
                        com.tinder.activities.ActivityPassport.f(b).requestFocus();
                        com.tinder.activities.ActivityPassport.f(b).setCursorVisible(true);
                        com.tinder.activities.ActivityPassport.f(b).postDelayed(new Runnable(this) {

                            final _cls3 a;

                            public final void run()
                            {
                                ad.a(a.a, com.tinder.activities.ActivityPassport.f(a.b));
                            }

            
            {
                a = _pcls3;
                super();
            }
                        }, 200L);
                    }

                    public final void onAnimationStart(Animator animator)
                    {
                        com.tinder.activities.ActivityPassport.d(b).setVisibility(0);
                        ActivityPassport.e(b).startTransition(150);
                    }

            
            {
                b = ActivityPassport.this;
                a = context;
                super();
            }
                }).start();
                k.notifyDataSetChanged();
                return;
            }

        case 2131624467: 
            if (r)
            {
                h.post(new Runnable() {

                    final ActivityPassport a;

                    public final void run()
                    {
                        com.tinder.activities.ActivityPassport.g(a);
                    }

            
            {
                a = ActivityPassport.this;
                super();
            }
                });
            }
            h.post(new Runnable() {

                final ActivityPassport a;

                public final void run()
                {
                    FragmentMap fragmentmap = com.tinder.activities.ActivityPassport.c(a);
                    double d1 = fragmentmap.b.d();
                    double d2 = fragmentmap.b.e();
                    LatLng latlng = new LatLng(d1, d2);
                    AsyncTask.execute(new com.tinder.fragments.FragmentMap._cls1(fragmentmap, d1, d2));
                    fragmentmap.a(latlng, 400, true);
                    com.google.android.m4b.maps.model.j j1 = fragmentmap.a(latlng, true);
                    fragmentmap.a.a(latlng.b, latlng.c, fragmentmap, j1);
                }

            
            {
                a = ActivityPassport.this;
                super();
            }
            });
            return;

        case 2131624473: 
        case 2131624475: 
            f();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        ManagerApp.h().a(this);
        super.onCreate(bundle);
        getWindow().setWindowAnimations(0x7f0b01df);
        setContentView(0x7f03008b);
        F();
        e = findViewById(0x7f0e008a);
        g = findViewById(0x7f0e0212);
        h = (ImageView)findViewById(0x7f0e0213);
        f = findViewById(0x7f0e0219);
        d = (ProgressBar)findViewById(0x7f0e021b);
        f = findViewById(0x7f0e0219);
        j = (EditText)findViewById(0x7f0e0215);
        i = (ImageView)findViewById(0x7f0e0214);
        bundle = findViewById(0x7f0e0216);
        b = (FragmentMap)getSupportFragmentManager().a(0x7f0e0218);
        c = (ListView)findViewById(0x7f0e021a);
        c.setOnItemClickListener(this);
        k = new g();
        c.setAdapter(k);
        i.setOnClickListener(this);
        e.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        f.setOnClickListener(this);
        d.setOnClickListener(this);
        j.setOnEditorActionListener(this);
        j.setOnClickListener(this);
        bundle.setOnClickListener(this);
        q = new TransitionDrawable(new Drawable[] {
            getResources().getDrawable(0x7f020191), getResources().getDrawable(0x7f020190)
        });
        q.setCrossFadeEnabled(true);
        ad.a(bundle, q);
        s = y.a();
    }

    public boolean onEditorAction(TextView textview, int l, KeyEvent keyevent)
    {
        boolean flag = false;
        if (l != 3) goto _L2; else goto _L1
_L1:
        textview = textview.getText().toString();
        if (!textview.toLowerCase().contains("where is uncle jon")) goto _L4; else goto _L3
_L3:
        textview = new TinderLocation();
        textview.setStateProvinceLong("Disneyland");
        textview.setCountryLong("California");
        textview.setCountryShort("\"Indeed...\"");
        textview.setLatitude(33.811112999999999D);
        textview.setLongitude(-117.921584D);
        keyevent = new ArrayList(1);
        keyevent.add(textview);
        a(keyevent);
_L8:
        ad.a(j.getWindowToken(), this);
        flag = true;
_L6:
        return flag;
_L4:
        Object obj = textview.trim();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            t = false;
            textview = k;
            textview.a = new ArrayList();
            textview.notifyDataSetChanged();
            d.setVisibility(0);
            g();
            keyevent = a;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                e();
            }
            com.tinder.managers.y._cls2 _lcls2;
            try
            {
                textview = URLEncoder.encode(((String) (obj)), "utf-8");
            }
            // Misplaced declaration of an exception variable
            catch (TextView textview)
            {
                textview = y.a.matcher(((CharSequence) (obj))).replaceAll("+");
            }
            textview = String.format(((y) (keyevent)).d.u, new Object[] {
                com.tinder.utils.t.a(), textview
            });
            obj = com.android.volley.Request.Priority.d;
            _lcls2 = new com.tinder.managers.y._cls2(keyevent, this);
            keyevent = new com.tinder.managers.y._cls3(keyevent);
            ManagerApp.h().g();
            textview = new com.tinder.a.g(((com.android.volley.Request.Priority) (obj)), 0, textview, null, _lcls2, keyevent, com.tinder.managers.d.b());
            textview.l = "passport_search";
            textview.j = new c(5000, 0, 1.0F);
            ManagerApp.b().a(textview);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (keyevent.getKeyCode() != 4) goto _L6; else goto _L5
_L5:
        onBackPressed();
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        AsyncTask.execute(new Runnable(l) {

            final int a;
            final ActivityPassport b;

            public final void run()
            {
                TinderLocation tinderlocation = (TinderLocation)com.tinder.activities.ActivityPassport.a(b).getItem(a);
                SparksEvent sparksevent = new SparksEvent("Passport.MapSearchSelect");
                sparksevent.put("searched", tinderlocation.getLabels().first);
                sparksevent.put("method", "TAP");
                sparksevent.put("popular", Boolean.valueOf(ActivityPassport.b(b)));
                com.tinder.managers.a.a(sparksevent);
            }

            
            {
                b = ActivityPassport.this;
                a = l;
                super();
            }
        });
        f();
        adapterview.postDelayed(new Runnable(l) {

            final int a;
            final ActivityPassport b;

            public final void run()
            {
                TinderLocation tinderlocation = (TinderLocation)com.tinder.activities.ActivityPassport.a(b).getItem(a);
                FragmentMap fragmentmap = com.tinder.activities.ActivityPassport.c(b);
                LatLng latlng = new LatLng(tinderlocation.getLatitude(), tinderlocation.getLongitude());
                fragmentmap.a(latlng, 850, true);
                (new Handler()).postDelayed(new com.tinder.fragments.FragmentMap._cls2(fragmentmap, latlng, tinderlocation), 850L);
            }

            
            {
                b = ActivityPassport.this;
                a = l;
                super();
            }
        }, 350L);
    }

    public void onPause()
    {
        ad.a(j.getWindowToken(), this);
        super.onPause();
    }

    protected final void y_()
    {
        super.y_();
        overridePendingTransition(0x7f04000b, 0);
    }
}
