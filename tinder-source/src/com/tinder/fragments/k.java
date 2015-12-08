// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.activities.ActivityLogin;
import com.tinder.activities.ActivityMain;
import com.tinder.base.f;
import com.tinder.c.ap;
import com.tinder.c.b;
import com.tinder.c.u;
import com.tinder.e.aq;
import com.tinder.e.e;
import com.tinder.e.s;
import com.tinder.enums.Gender;
import com.tinder.events.EventLoggedOut;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.z;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            by

public final class k extends f
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.widget.CompoundButton.OnCheckedChangeListener, com.tinder.c.a.a, com.tinder.c.b.a, aq, e, s, by
{

    z c;
    d d;
    com.tinder.managers.ad e;
    ae f;
    c g;
    private TextView h;
    private EditText i;
    private RadioButton j;
    private RadioButton k;
    private SwitchCompat l;
    private SwitchCompat m;
    private SwitchCompat n;
    private u o;
    private ap p;
    private Gender q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private com.tinder.c.a z;

    public k()
    {
    }

    private boolean f()
    {
        boolean flag;
        if (q != c.b().getGender())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private void g()
    {
        h.setText("");
        if (t)
        {
            h.setText(getString(0x7f06011e));
            j.setTextColor(getActivity().getResources().getColor(0x7f0d0113));
            k.setTextColor(getActivity().getResources().getColor(0x7f0d008b));
            return;
        } else
        {
            h.setText(getString(0x7f0600f3));
            j.setTextColor(getActivity().getResources().getColor(0x7f0d008b));
            k.setTextColor(getActivity().getResources().getColor(0x7f0d0113));
            return;
        }
    }

    private void h()
    {
        if (o == null)
        {
            o = new u(getActivity());
        }
        if (!o.isShowing() && getActivity() != null)
        {
            o.show();
        }
    }

    private void i()
    {
        ad.c(o);
        if (getActivity() != null)
        {
            if (u)
            {
                u = false;
            }
        } else
        {
            com.tinder.utils.v.a("ActivityMain null");
        }
        if (v && getActivity().getSupportFragmentManager() != null)
        {
            v = false;
            return;
        } else
        {
            (new StringBuilder("Not going back: mWasBackPressed=")).append(v);
            return;
        }
    }

    public final void a()
    {
        com.tinder.managers.a.b(new SparksEvent("Account.Delete"));
        h();
        d.a(this, 3);
    }

    public final void b()
    {
        if (!s)
        {
            com.tinder.managers.a.b(new SparksEvent("Account.FbLogout"));
            h();
            s = true;
            d.d();
        }
    }

    public final void c()
    {
        if (getActivity() != null)
        {
            ad.c(o);
            Intent intent = new Intent(getActivity(), com/tinder/activities/ActivityLogin);
            Bundle bundle = new Bundle();
            bundle.putString("extra_show_intro", "");
            intent.putExtras(bundle);
            intent.putExtra("show delete account dialog", true);
            startActivity(intent);
            getActivity().setResult(321);
            r = true;
            getActivity().finish();
        }
    }

    public final void d()
    {
        if (getActivity() != null)
        {
            ad.c(o);
            Toast.makeText(getActivity(), getActivity().getString(0x7f0600bd), 1).show();
        }
    }

    public final String e()
    {
        return "fragment app settings";
    }

    public final void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        (new StringBuilder("checked=")).append(compoundbutton);
        compoundbutton.getId();
        JVM INSTR tableswitch 2131624482 2131624488: default 60
    //                   2131624482 128
    //                   2131624483 171
    //                   2131624484 214
    //                   2131624485 60
    //                   2131624486 60
    //                   2131624487 92
    //                   2131624488 67;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5 _L6
_L1:
        com.tinder.utils.v.a("button not recognized");
_L8:
        return;
_L6:
        if (!flag) goto _L8; else goto _L7
_L7:
        t = flag;
        e.a(t);
        g();
        return;
_L5:
        if (!flag) goto _L8; else goto _L9
_L9:
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = flag;
        e.a(t);
        g();
        return;
_L2:
        w = flag;
        e.c = flag;
        ae.b.putBoolean("KEY_NEW_MATCH_PUSH_ENABLED", flag);
        ae.b.commit();
        c.a();
        return;
_L3:
        x = flag;
        e.d = flag;
        ae.b.putBoolean("KEY_NEW_MESSAGE_PUSH_ENABLED", flag);
        ae.b.commit();
        c.a();
        return;
_L4:
        y = flag;
        ae.b.putBoolean("KEY_SUPERLIKE_PUSH_ENABLED", flag).commit();
        c.a();
        return;
    }

    public final void onClick(View view)
    {
        (new StringBuilder("view=")).append(view);
        view.getId();
        JVM INSTR lookupswitch 10: default 108
    //                   2131624074: 186
    //                   2131624075: 186
    //                   2131624363: 186
    //                   2131624455: 178
    //                   2131624489: 263
    //                   2131624490: 109
    //                   2131624491: 197
    //                   2131624492: 230
    //                   2131624493: 162
    //                   2131624496: 121;
           goto _L1 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L5:
        ((ActivityMain)getActivity()).a(true);
        return;
_L9:
        if (z == null || !z.isShowing())
        {
            z = new com.tinder.c.a(getActivity(), this);
            z.show();
            return;
        }
          goto _L1
_L8:
        (new b(getActivity(), this)).show();
        return;
_L3:
        getActivity().onBackPressed();
        return;
_L2:
        ((ActivityMain)getActivity()).r();
        return;
_L6:
        p = new ap(getActivity(), "http://www.gotinder.com/privacy/", getString(0x7f060178));
        p.show();
        return;
_L7:
        p = new ap(getActivity(), "http://www.gotinder.com/terms/", getString(0x7f0601fb));
        p.show();
        return;
_L4:
        com.tinder.managers.a.a("Menu.Share");
        view = new Intent("android.intent.action.SEND");
        view.setType("text/plain");
        view.putExtra("android.intent.extra.TEXT", getString(0x7f0601d3));
        startActivity(Intent.createChooser(view, getString(0x7f0601d0)));
        return;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03008e, viewgroup, false);
        layoutinflater.findViewById(0x7f0e008a).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0e008b).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0e01ab).setOnClickListener(this);
        viewgroup = layoutinflater.findViewById(0x7f0e022a);
        boolean flag;
        if (c.b() != null)
        {
            bundle = c.b();
            if (bundle.getAge() != null)
            {
                if (Integer.valueOf(bundle.getAge()).intValue() < 18)
                {
                    viewgroup.setVisibility(8);
                } else
                {
                    viewgroup.setOnClickListener(this);
                    ad.b(viewgroup);
                }
            }
        }
        viewgroup = layoutinflater.findViewById(0x7f0e022d);
        viewgroup.setOnClickListener(this);
        ad.b(viewgroup);
        bundle = layoutinflater.findViewById(0x7f0e022b);
        bundle.setOnClickListener(this);
        ad.b(bundle);
        bundle = layoutinflater.findViewById(0x7f0e022c);
        bundle.setOnClickListener(this);
        ad.b(bundle);
        bundle = layoutinflater.findViewById(0x7f0e0229);
        bundle.setOnClickListener(this);
        ad.b(bundle);
        layoutinflater.findViewById(0x7f0e0230).setOnClickListener(this);
        bundle = (TextView)layoutinflater.findViewById(0x7f0e022f);
        h = (TextView)layoutinflater.findViewById(0x7f0e0225);
        j = (RadioButton)layoutinflater.findViewById(0x7f0e0228);
        k = (RadioButton)layoutinflater.findViewById(0x7f0e0227);
        i = (EditText)layoutinflater.findViewById(0x7f0e022e);
        viewgroup.post(new Runnable(viewgroup) {

            final View a;
            final k b;

            public final void run()
            {
                if (!b.isAdded() || b.getActivity() == null)
                {
                    com.tinder.utils.v.b("Not changing logout button since we are not attached to an activity.");
                    return;
                } else
                {
                    android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)a.getLayoutParams();
                    layoutparams.topMargin = b.getResources().getDimensionPixelSize(0x7f090110);
                    a.setLayoutParams(layoutparams);
                    return;
                }
            }

            
            {
                b = k.this;
                a = view;
                super();
            }
        });
        l = (SwitchCompat)layoutinflater.findViewById(0x7f0e0222);
        m = (SwitchCompat)layoutinflater.findViewById(0x7f0e0223);
        n = (SwitchCompat)layoutinflater.findViewById(0x7f0e0224);
        if (ae.z())
        {
            n.setVisibility(0);
        }
        bundle.setText(String.format(getString(0x7f060217), new Object[] {
            ManagerApp.n
        }));
        i.setVisibility(8);
        j.setOnCheckedChangeListener(this);
        k.setOnCheckedChangeListener(this);
        l.setOnCheckedChangeListener(this);
        m.setOnCheckedChangeListener(this);
        n.setOnCheckedChangeListener(this);
        viewgroup = c.b();
        if (viewgroup != null)
        {
            q = viewgroup.getGender();
        }
        t = e.j;
        w = e.c;
        x = e.d;
        y = ae.b();
        if (q == Gender.MALE)
        {
            q = Gender.MALE;
        } else
        {
            q = Gender.FEMALE;
        }
        j.setChecked(t);
        viewgroup = k;
        if (!t)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup.setChecked(flag);
        l.setChecked(w);
        m.setChecked(x);
        n.setChecked(y);
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        ad.c(o);
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        ad.c(z);
        ad.c(p);
    }

    public final void onEventMainThread(EventLoggedOut eventloggedout)
    {
        eventloggedout = new Intent(getActivity(), com/tinder/activities/ActivityLogin);
        eventloggedout.setFlags(32768);
        eventloggedout.putExtra("extra_show_intro", "");
        startActivity(eventloggedout);
        getActivity().finish();
        ad.c(o);
    }

    public final void onMenuItemClick(int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 2130837723: 
            ((ActivityMain)getActivity()).h();
            break;
        }
        u = true;
        v = false;
        if (r || s || !f())
        {
            break MISSING_BLOCK_LABEL_304;
        }
        h();
        Object obj = e;
        z z1 = c;
        boolean flag = ((com.tinder.managers.ad) (obj)).i;
        boolean flag1 = ((com.tinder.managers.ad) (obj)).b();
        float f1 = ((com.tinder.managers.ad) (obj)).a();
        int j1 = ((com.tinder.managers.ad) (obj)).f;
        int k1 = ((com.tinder.managers.ad) (obj)).g;
        obj = q;
        (new StringBuilder("interestedInMales=")).append(flag).append(", interestedInFemales=").append(flag1).append(", distanceFilter=").append(f1).append(", ageMin=").append(j1).append(", ageMax=").append(k1);
        (new StringBuilder("bio=")).append(null).append(", gender=").append(obj);
        JSONObject jsonobject = new JSONObject();
        if (flag1 && flag)
        {
            i1 = -1;
        } else
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        jsonobject.put("gender", ((Gender) (obj)).ordinal());
        jsonobject.putOpt("bio", null);
        jsonobject.put("gender_filter", i1);
        jsonobject.put("age_filter_min", j1);
        jsonobject.put("age_filter_max", k1);
        jsonobject.put("distance_filter", Math.round(f1));
        z1.a(jsonobject, this);
_L2:
        e.d(f());
        return;
        JSONException jsonexception;
        jsonexception;
        com.tinder.utils.v.b(jsonexception.toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onPause()
    {
        g.b(this);
        super.onPause();
    }

    public final void onResume()
    {
        g.a(this, false);
        super.onResume();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (ad.a(motionevent))
        {
            ad.a(view, false);
            return false;
        } else
        {
            ad.a(view, true);
            return false;
        }
    }

    public final void u()
    {
        Toast.makeText(ManagerApp.c(), ManagerApp.c().getString(0x7f06020f), 1).show();
        i();
    }

    public final void v()
    {
        Toast.makeText(ManagerApp.c(), ManagerApp.c().getString(0x7f0600c2), 1).show();
        i();
    }
}
