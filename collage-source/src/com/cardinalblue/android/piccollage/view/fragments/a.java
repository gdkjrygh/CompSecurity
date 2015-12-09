// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.activities.ConfigDebugActivity;
import com.cardinalblue.android.piccollage.activities.FindFriendsActivity;
import com.cardinalblue.android.piccollage.activities.HelpActivity;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicEditAccountActivity;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.controller.p;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.view.c.b;
import com.cardinalblue.android.piccollage.view.c.c;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import org.json.JSONException;

public class a extends Fragment
    implements android.view.View.OnClickListener
{

    long a[];
    int b;
    Toast c;
    private Button d;
    private Button e;
    private final Vector f = new Vector();
    private View g;
    private View h;
    private View i;
    private View j;
    private com.cardinalblue.android.piccollage.auth.a.d k;
    private View l;

    public a()
    {
        a = new long[3];
    }

    private void a()
    {
        byte byte0 = 8;
        boolean flag = PicAuth.h().b();
        Object obj = d;
        int i1;
        if (!flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((Button) (obj)).setVisibility(i1);
        obj = e;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((Button) (obj)).setVisibility(i1);
        obj = g;
        i1 = byte0;
        if (flag)
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        obj = (ImageView)g.findViewById(0x7f1000b2);
        obj = (com.androidquery.a)(new com.androidquery.a(getActivity())).b(((View) (obj)));
        if (flag)
        {
            ((com.androidquery.a) (obj)).a(PicAuth.h().i().getProfileImageUrl(), false, true);
            return;
        } else
        {
            ((com.androidquery.a) (obj)).d(0x7f020224);
            return;
        }
    }

    private void a(View view)
    {
        d = (Button)view.findViewById(0x7f1000a1);
        d.setTag(Integer.valueOf(0));
        d.setOnClickListener(this);
        e = (Button)view.findViewById(0x7f1000ae);
        e.setTag(Integer.valueOf(1));
        e.setOnClickListener(this);
        g = view.findViewById(0x7f1000a2);
        g.setTag(Integer.valueOf(2));
        a(g, 0x7f0201b2, 0x7f070135);
    }

    private void a(View view, int i1, int j1)
    {
        ImageView imageview = (ImageView)view.findViewById(0x7f1000b2);
        TextView textview = (TextView)view.findViewById(0x7f1000b5);
        imageview.setImageResource(i1);
        textview.setText(j1);
        view.setClickable(true);
        view.setOnClickListener(this);
    }

    private void a(com.androidquery.a a1)
    {
        f.add(new b(this, (com.androidquery.a)a1.a(0x7f1000a4), 1));
        f.add(new c(this, (com.androidquery.a)a1.a(0x7f1000a5), 4));
        ((com.androidquery.a)a1.a(0x7f1000a3)).c();
    }

    private void b()
    {
        a();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((com.cardinalblue.android.piccollage.view.c.a)iterator.next()).d()) { }
    }

    private void b(View view)
    {
        h = view.findViewById(0x7f1000a6);
        h.setTag(Integer.valueOf(256));
        a(h, 0x7f0201eb, 0x7f07021f);
        i = view.findViewById(0x7f1000a7);
        i.setTag(Integer.valueOf(1792));
        a(i, 0x7f0201bb, 0x7f0701da);
        l = view.findViewById(0x7f1000a8);
        l.setTag(Integer.valueOf(2816));
        a(l, 0x7f0201f6, 0x7f070242);
        View view1 = view.findViewById(0x7f1000a9);
        view1.setTag(Integer.valueOf(512));
        a(view1, 0x7f0201b8, 0x7f0701b1);
        view1 = view.findViewById(0x7f1000aa);
        view1.setTag(Integer.valueOf(1280));
        a(view1, 0x7f0201e7, 0x7f070210);
        view1 = view.findViewById(0x7f1000ab);
        view1.setTag(Integer.valueOf(768));
        a(view1, 0x7f0201ba, 0x7f0702b2);
        view1 = view.findViewById(0x7f1000ac);
        view1.setTag(Integer.valueOf(2560));
        a(view1, 0x7f0201b7, 0x7f0701af);
        j = view.findViewById(0x7f1000ad);
        j.setTag(Integer.valueOf(2048));
        a(j, 0x7f0201b3, 0x7f0703a4);
    }

    private void c()
    {
        startActivityForResult(new Intent(getActivity(), com/cardinalblue/android/piccollage/auth/PicEditAccountActivity), 5);
    }

    private void d()
    {
        View view = j;
        int i1;
        if (com.cardinalblue.android.b.d.a())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        for (intent = f.iterator(); intent.hasNext(); ((com.cardinalblue.android.piccollage.view.c.a)intent.next()).a(i1)) { }
        i1;
        JVM INSTR tableswitch 4 5: default 64
    //                   4 65
    //                   5 77;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        b();
        com.cardinalblue.android.b.k.i(getActivity());
        return;
_L3:
        if (j1 == -1)
        {
            com.cardinalblue.android.piccollage.controller.network.f.b(getActivity(), "me", new com.android.volley.m.b() {

                final a a;

                public volatile void a(Object obj)
                {
                    a((String)obj);
                }

                public void a(String s)
                {
                    try
                    {
                        PicAuth.h().c(com.cardinalblue.android.piccollage.controller.network.f.u(s).toJSONString());
                        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.model.gson.PicUser.PicUserDataChangedEvent());
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(s);
                    }
                }

            
            {
                a = a.this;
                super();
            }
            }, null);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onClick(View view)
    {
        view = (Integer)view.getTag();
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (view.intValue())
        {
        default:
            return;

        case 0: // '\0'
            com.cardinalblue.android.piccollage.a.b.C();
            com.cardinalblue.android.piccollage.a.b.m("login");
            k.a(getActivity(), 4, "setting");
            return;

        case 1: // '\001'
            com.cardinalblue.android.piccollage.a.b.B();
            com.cardinalblue.android.piccollage.a.b.m("logout");
            k.a();
            b();
            view = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/HomeActivity);
            view.setFlags(0x4000000);
            startActivity(view);
            getActivity().finish();
            return;

        case 2: // '\002'
            com.cardinalblue.android.piccollage.a.b.z();
            com.cardinalblue.android.piccollage.a.b.m("edit");
            c();
            return;

        case 512: 
            com.cardinalblue.android.piccollage.a.b.A();
            com.cardinalblue.android.piccollage.a.b.m("find friend");
            startActivity(new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/FindFriendsActivity));
            return;

        case 1280: 
            com.cardinalblue.android.piccollage.a.b.w();
            com.cardinalblue.android.piccollage.a.b.m("news");
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse(com.cardinalblue.android.piccollage.controller.network.f.e()));
            startActivity(view);
            return;

        case 768: 
            com.cardinalblue.android.piccollage.a.b.x();
            com.cardinalblue.android.piccollage.a.b.m("help");
            startActivity(new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/HelpActivity));
            return;

        case 2560: 
            com.cardinalblue.android.piccollage.a.b.y();
            com.cardinalblue.android.piccollage.a.b.m("uservoice");
            com.cardinalblue.android.piccollage.a.i.c(getActivity());
            return;

        case 1536: 
            if (PicAuth.h().b())
            {
                view = "yes";
            } else
            {
                view = "no";
            }
            com.cardinalblue.android.piccollage.a.b.n(view);
            com.cardinalblue.android.piccollage.a.b.m("restore");
            (new p(getActivity())).a();
            return;

        case 2048: 
            startActivity(new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/ConfigDebugActivity));
            return;

        case 1792: 
            if (b > 0)
            {
                System.arraycopy(a, 1, a, 0, a.length - 1);
                a[a.length - 1] = SystemClock.uptimeMillis();
                if (a[0] >= SystemClock.uptimeMillis() - 500L)
                {
                    b = b - 1;
                } else
                {
                    b = 8;
                }
                if (b == 0)
                {
                    if (c != null)
                    {
                        c.cancel();
                    }
                    view = String.format("Debug mode enabled", new Object[] {
                        Integer.valueOf(b)
                    });
                    c = Toast.makeText(getActivity(), view, 0);
                    c.show();
                    com.cardinalblue.android.b.d.a(true);
                    d();
                    return;
                }
                if (b <= 3)
                {
                    view = String.format(Locale.getDefault(), "%d taps to enable debug mode", new Object[] {
                        Integer.valueOf(b)
                    });
                    c = Toast.makeText(getActivity(), view, 0);
                    c.show();
                    return;
                }
            }
            break;

        case 2304: 
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse("http://img.au-market.com/mapi/policy/7240200000001"));
            startActivity(view);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030019, viewgroup, false);
        viewgroup = new com.androidquery.a(layoutinflater);
        k = new com.cardinalblue.android.piccollage.auth.a.d();
        a(layoutinflater);
        a(viewgroup);
        b(layoutinflater);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f1000af);
        bundle = new StringBuilder();
        bundle.append(getActivity().getApplicationInfo().loadLabel(getActivity().getPackageManager()));
        bundle.append(" ").append(com.cardinalblue.android.b.c.a(getActivity()));
        viewgroup.setText(bundle.toString());
        viewgroup = (TextView)layoutinflater.findViewById(0x7f1000b0);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f1000b1);
        viewgroup.setVisibility(0);
        viewgroup.setTag(Integer.valueOf(1536));
        viewgroup.setOnClickListener(this);
        getActivity().setTitle(0x7f070259);
        com.cardinalblue.android.piccollage.a.b.v();
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((com.cardinalblue.android.piccollage.view.c.a)iterator.next()).c()) { }
    }

    public void onPause()
    {
        super.onPause();
        ((CompoundButton)h.findViewById(0x7f1000b7)).setOnCheckedChangeListener(null);
        ((CompoundButton)i.findViewById(0x7f1000b7)).setOnCheckedChangeListener(null);
        ((CompoundButton)l.findViewById(0x7f1000b7)).setOnCheckedChangeListener(null);
    }

    public void onResume()
    {
        super.onResume();
        boolean flag = com.cardinalblue.android.b.k.j().getBoolean("ENABLE_NOTIFICATION", true);
        CompoundButton compoundbutton = (CompoundButton)h.findViewById(0x7f1000b7);
        compoundbutton.setChecked(flag);
        compoundbutton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final a a;

            public void onCheckedChanged(CompoundButton compoundbutton1, boolean flag1)
            {
                com.cardinalblue.android.b.k.j().edit().putBoolean("ENABLE_NOTIFICATION", flag1).apply();
            }

            
            {
                a = a.this;
                super();
            }
        });
        flag = com.cardinalblue.android.b.k.j().getBoolean("ENABLE_HD", true);
        compoundbutton = (CompoundButton)i.findViewById(0x7f1000b7);
        compoundbutton.setChecked(flag);
        compoundbutton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final a a;

            public void onCheckedChanged(CompoundButton compoundbutton1, boolean flag1)
            {
                com.cardinalblue.android.b.k.j().edit().putBoolean("ENABLE_HD", flag1).apply();
            }

            
            {
                a = a.this;
                super();
            }
        });
        flag = com.cardinalblue.android.b.k.j().getBoolean("key_create_collage_reminder_notification", true);
        compoundbutton = (CompoundButton)l.findViewById(0x7f1000b7);
        compoundbutton.setChecked(flag);
        compoundbutton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final a a;

            public void onCheckedChanged(CompoundButton compoundbutton1, boolean flag1)
            {
                com.cardinalblue.android.b.k.j().edit().putBoolean("key_create_collage_reminder_notification", flag1).apply();
            }

            
            {
                a = a.this;
                super();
            }
        });
    }

    public void onStart()
    {
        super.onStart();
        b();
        int i1;
        if (com.cardinalblue.android.b.d.a())
        {
            i1 = -1;
        } else
        {
            i1 = 9;
        }
        b = i1;
        c = null;
        d();
    }

    public void onStop()
    {
        super.onStop();
        if (c != null)
        {
            c.cancel();
        }
    }
}
