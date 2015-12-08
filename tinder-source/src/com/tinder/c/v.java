// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.CycleInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.c;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.e.au;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.managers.af;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ad;
import com.tinder.utils.k;
import com.tinder.utils.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class v extends Dialog
    implements android.view.View.OnClickListener
{

    af a;
    private final int b = 4;
    private final String c = "#ffce66";
    private final String d = "#cecece";
    private int e;
    private int f;
    private int g;
    private int h;
    private String i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private EditText p;
    private ViewGroup q;
    private ViewGroup r;
    private ViewGroup s;

    public v(Context context, int i1, String s1)
    {
        super(context, 0x7f0b0166);
        g = -1;
        h = 0;
        ManagerApp.h().a(this);
        getWindow().setWindowAnimations(0x7f0b01df);
        setContentView(0x7f03004e);
        j = (TextView)findViewById(0x7f0e014b);
        k = (TextView)findViewById(0x7f0e0149);
        l = (TextView)findViewById(0x7f0e0152);
        m = (TextView)findViewById(0x7f0e0153);
        p = (EditText)findViewById(0x7f0e0154);
        q = (ViewGroup)findViewById(0x7f0e014c);
        r = (ViewGroup)findViewById(0x7f0e0155);
        n = (TextView)findViewById(0x7f0e0157);
        o = (TextView)findViewById(0x7f0e0156);
        s = (ViewGroup)findViewById(0x7f0e0148);
        n.setOnClickListener(this);
        ad.b(n);
        o.setOnClickListener(this);
        ad.b(o);
        p.setFilters(new InputFilter[] {
            new l()
        });
        e = Color.parseColor("#ffce66");
        f = Color.parseColor("#cecece");
        i = s1;
        g = i1;
        if (g == 0)
        {
            c();
            return;
        }
        if (1 == i1)
        {
            b();
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid mode argument");
        }
    }

    static int a(v v1)
    {
        return v1.e;
    }

    private void a()
    {
        String s1 = "?";
        if (g == 5) goto _L2; else goto _L1
_L1:
        g;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 278
    //                   1 296
    //                   2 290
    //                   3 284;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        SparksEvent sparksevent = new SparksEvent("Rate.Cancel");
        sparksevent.put("mode", s1);
        sparksevent.put("cause", i);
        if (h > 0)
        {
            sparksevent.put("stars", Integer.valueOf(h));
        }
        com.tinder.managers.a.a(sparksevent);
_L2:
        if (1 == g || 2 == g)
        {
            ae.b.putBoolean("ADD_FEEDBACK_TO_MENU", true).commit();
            if (com.tinder.utils.a.b())
            {
                s.getLayoutTransition().disableTransitionType(1);
                s.getLayoutTransition().disableTransitionType(0);
                s.getLayoutTransition().disableTransitionType(4);
                s.getLayoutTransition().disableTransitionType(2);
                s.getLayoutTransition().disableTransitionType(3);
            }
            k.setVisibility(0);
            m.setPadding(0, 0, 0, 0);
            m.setText(0x7f060226);
            l.setVisibility(8);
            j.setVisibility(8);
            m.setVisibility(0);
            p.setVisibility(8);
            n.setText(0x7f060151);
            o.setVisibility(4);
        } else
        if (3 == g)
        {
            ae.b.putBoolean("ADD_RATE_TO_MENU", true).commit();
            if (com.tinder.utils.a.b())
            {
                s.getLayoutTransition().disableTransitionType(1);
                s.getLayoutTransition().disableTransitionType(0);
                s.getLayoutTransition().disableTransitionType(4);
                s.getLayoutTransition().disableTransitionType(2);
                s.getLayoutTransition().disableTransitionType(3);
            }
            findViewById(0x7f0e014a).setVisibility(0);
            m.setVisibility(4);
            m.setVisibility(8);
            n.setText(0x7f060151);
            o.setVisibility(4);
            q.setVisibility(4);
            q.setVisibility(8);
            r.setVisibility(0);
            k.setVisibility(0);
            l.setVisibility(4);
            l.setVisibility(8);
        }
        g = 5;
        return;
_L4:
        s1 = "stars";
        continue; /* Loop/switch isn't completed */
_L7:
        s1 = "askReview";
        continue; /* Loop/switch isn't completed */
_L6:
        s1 = "askFeedback";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "enterFeedback";
        if (true) goto _L3; else goto _L8
_L8:
    }

    static EditText b(v v1)
    {
        return v1.p;
    }

    private void b()
    {
        g = 1;
        j.setVisibility(8);
        m.setVisibility(8);
        q.setVisibility(8);
        o.setText(0x7f060074);
        n.setText(0x7f0601ca);
        p.setVisibility(0);
        r.setVisibility(0);
        p.setMovementMethod(new ScrollingMovementMethod());
        p.postDelayed(new Runnable() {

            final v a;

            public final void run()
            {
                ad.a(a.getContext(), v.b(a));
            }

            
            {
                a = v.this;
                super();
            }
        }, 100L);
    }

    private void c()
    {
        g = 0;
        j.setText(0x7f0600d6);
        m.setText(0x7f0601f9);
        q.setVisibility(0);
        r.setVisibility(8);
        for (int i1 = 0; i1 < q.getChildCount(); i1++)
        {
            ImageView imageview = (ImageView)q.getChildAt(i1);
            imageview.setOnClickListener(this);
            imageview.setColorFilter(f);
        }

    }

    private boolean d()
    {
        String s1 = p.getText().toString().trim();
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        Object obj = new SparksEvent("Rate.Feedback");
        ((SparksEvent) (obj)).put("text", s1);
        ((SparksEvent) (obj)).put("cause", i);
        if (h > 0)
        {
            ((SparksEvent) (obj)).put("stars", Integer.valueOf(h));
        }
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        ae.b.putBoolean("HAS_SENT_FEEDBACK", true).commit();
        obj = a;
        int i1 = h;
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s1.trim()))
        {
            com.tinder.utils.v.b("Feedback body is empty after trim. NO OP");
            return true;
        }
        s1 = s1.trim();
        String s2 = Build.MODEL;
        String s3 = com.tinder.utils.k.c();
        String s4 = Build.MANUFACTURER;
        String s5 = com.tinder.utils.k.d();
        String s6 = ManagerApp.e();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("description", s1);
            jsonobject.put("model", s2);
            jsonobject.put("dataProvider", s3);
            jsonobject.put("manufacturer", s4);
            jsonobject.put("osVersion", s5);
            jsonobject.put("tiVersion", s6);
        }
        catch (JSONException jsonexception)
        {
            com.tinder.utils.v.b(jsonexception.toString());
            return true;
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        jsonobject.put("stars", i1);
        obj = new d(1, ((af) (obj)).a.N, jsonobject, new com.tinder.managers.af._cls1(((af) (obj))), null, com.tinder.managers.d.b());
        obj.j = new c(10000, 3, 3F);
        ManagerApp.b().a(((Request) (obj)));
        return true;
    }

    public final void onBackPressed()
    {
        a();
        super.onBackPressed();
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131624269 2131624279: default 64
    //                   2131624269 65
    //                   2131624270 65
    //                   2131624271 65
    //                   2131624272 65
    //                   2131624273 65
    //                   2131624274 64
    //                   2131624275 64
    //                   2131624276 64
    //                   2131624277 64
    //                   2131624278 719
    //                   2131624279 511;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L1 _L1 _L1 _L1 _L3 _L4
_L1:
        return;
_L2:
        int j1 = q.indexOfChild(view);
        h = j1 + 1;
        int i1;
        if (h >= 4)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ae.b.putBoolean("HAS_RATED", true).commit();
        view = new SparksEvent("Rate.SelectStar");
        view.put("stars", Integer.valueOf(h));
        com.tinder.managers.a.a(view);
        view = new CycleInterpolator(0.5F);
        if (i1 != 0)
        {
            i1 = 0;
            while (i1 < q.getChildCount()) 
            {
                ImageView imageview = (ImageView)q.getChildAt(i1);
                if (i1 <= j1)
                {
                    imageview.animate().setStartDelay(i1 * 60).scaleX(1.225F).scaleY(1.225F).setInterpolator(view).setListener(new au(imageview) {

                        final ImageView a;
                        final v b;

                        public final void onAnimationStart(Animator animator)
                        {
                            a.setColorFilter(com.tinder.c.v.a(b));
                        }

            
            {
                b = v.this;
                a = imageview;
                super();
            }
                    }).start();
                } else
                {
                    imageview.setColorFilter(f);
                }
                imageview.setClickable(false);
                i1++;
            }
            g = 3;
            if (com.tinder.utils.a.b())
            {
                s.getLayoutTransition().disableTransitionType(4);
                s.getLayoutTransition().setAnimateParentHierarchy(false);
                s.getLayoutTransition().setDuration(300L);
            }
            l.setVisibility(0);
            r.setVisibility(0);
            m.setText(0x7f060135);
            m.setVisibility(0);
            j.setVisibility(8);
            m.setPadding(0, 0, 0, 0);
            return;
        }
        if (com.tinder.utils.a.b())
        {
            s.getLayoutTransition().disableTransitionType(4);
            s.getLayoutTransition().disableTransitionType(1);
            s.getLayoutTransition().disableTransitionType(0);
        }
        g = 2;
        j.setVisibility(4);
        m.setVisibility(4);
        j.setText(0x7f060073);
        m.setText(0x7f060229);
        m.setVisibility(4);
        j.setVisibility(0);
        m.setVisibility(0);
        r.setVisibility(0);
        o.setText(0x7f060141);
        n.setText(0x7f060224);
        q.setVisibility(8);
        m.setPadding(0, 0, 0, 0);
        return;
_L4:
        switch (g)
        {
        default:
            dismiss();
            return;

        case 3: // '\003'
            view = new SparksEvent("Rate.Review");
            view.put("stars", Integer.valueOf(h));
            view.put("cause", i);
            com.tinder.managers.a.a(view);
            view = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tinder"));
            view.addFlags(0x10000000);
            getContext().startActivity(view);
            dismiss();
            return;

        case 2: // '\002'
            b();
            return;

        case 1: // '\001'
            break;
        }
        if (d())
        {
            ad.c(p);
            g = 4;
            p.setVisibility(8);
            m.setPadding(0, 0, 0, 0);
            m.setVisibility(4);
            m.setText(0x7f06022a);
            m.setVisibility(0);
            k.setVisibility(0);
            n.setText(0x7f060151);
            o.setVisibility(4);
            return;
        }
          goto _L1
_L3:
        a();
        ad.c(p);
        return;
    }

    public final void show()
    {
        super.show();
        String s1;
        SparksEvent sparksevent;
        if (g == 0)
        {
            s1 = "stars";
        } else
        {
            s1 = "askFeedback";
        }
        sparksevent = new SparksEvent("Rate.Show");
        sparksevent.put("cause", i);
        sparksevent.put("mode", s1);
        com.tinder.managers.a.a(sparksevent);
    }
}
