// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.base.f;
import com.tinder.c.v;
import com.tinder.enums.PaywallPerk;
import com.tinder.enums.UserPhotoSize;
import com.tinder.events.EventGlobalsLoaded;
import com.tinder.events.iab.EventPurchaseConfirmed;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.z;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.ad;
import com.tinder.views.BadgeView;
import com.tinder.views.BlurredDrawable;
import com.tinder.views.CustomDrawerLayout;
import de.greenrobot.event.c;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class FragmentSideMenu extends f
    implements x
{

    public static String c = "";
    public static PaywallPerk d;
    TextView e;
    TextView f;
    ImageView g;
    View h;
    ImageView i;
    View j;
    View k;
    View l;
    View m;
    View n;
    public View o;
    z p;
    com.tinder.managers.f q;
    d r;
    com.tinder.managers.x s;
    c t;
    private BadgeView u;
    private BlurredDrawable v;
    private int w;
    private int x;
    private v y;
    private String z[];

    public FragmentSideMenu()
    {
    }

    static v a(FragmentSideMenu fragmentsidemenu)
    {
        return fragmentsidemenu.y;
    }

    static v a(FragmentSideMenu fragmentsidemenu, v v1)
    {
        fragmentsidemenu.y = v1;
        return v1;
    }

    public static void b()
    {
    }

    public final void a()
    {
        if (!ae.a())
        {
            ManagerApp.h().j();
            if (ae.t())
            {
                o.setVisibility(0);
                Resources resources = getResources();
                String as[] = resources.getStringArray(0x7f070003);
                int i1 = (new Random()).nextInt(as.length - 1);
                String s1 = as[i1];
                f.setText(s1);
                if (z == null || z.length == 0)
                {
                    Object obj = new Configuration(resources.getConfiguration());
                    obj.locale = Locale.ENGLISH;
                    obj = new Resources(getResources().getAssets(), resources.getDisplayMetrics(), ((Configuration) (obj)));
                    z = ((Resources) (obj)).getStringArray(0x7f070003);
                    ((Resources) (obj)).updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                }
                c = z[i1];
                switch (i1)
                {
                default:
                    return;

                case 0: // '\0'
                    d = PaywallPerk.SUPER_LIKE;
                    return;

                case 1: // '\001'
                    d = PaywallPerk.PASSPORT;
                    return;

                case 2: // '\002'
                    d = PaywallPerk.NO_ADS;
                    return;

                case 3: // '\003'
                    d = PaywallPerk.UNDO;
                    break;
                }
                return;
            }
        }
        o.setVisibility(8);
    }

    public final void c()
    {
        boolean flag = ae.a.getBoolean("ADD_FEEDBACK_TO_MENU", false);
        boolean flag1 = ae.a.getBoolean("ADD_RATE_TO_MENU", false);
        (new StringBuilder("show feedback option ")).append(flag).append(" show rate option ").append(flag1);
        if (flag)
        {
            m.setVisibility(0);
            n.setVisibility(8);
            return;
        }
        if (flag1)
        {
            n.setVisibility(0);
            m.setVisibility(8);
            return;
        } else
        {
            n.setVisibility(8);
            m.setVisibility(8);
            return;
        }
    }

    public void onAttach(Context context)
    {
        super.onAttach(context);
        ManagerApp.h().a(this);
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        i.setImageDrawable(v);
        v.blurBitmap(bitmap, 24);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b2, viewgroup, false);
        e = (TextView)layoutinflater.findViewById(0x7f0e0342);
        g = (ImageView)layoutinflater.findViewById(0x7f0e0341);
        h = layoutinflater.findViewById(0x7f0e033e);
        i = (ImageView)layoutinflater.findViewById(0x7f0e033f);
        j = layoutinflater.findViewById(0x7f0e0348);
        k = layoutinflater.findViewById(0x7f0e0345);
        l = layoutinflater.findViewById(0x7f0e034b);
        m = layoutinflater.findViewById(0x7f0e0352);
        n = layoutinflater.findViewById(0x7f0e034e);
        u = (BadgeView)layoutinflater.findViewById(0x7f0e01f6);
        o = layoutinflater.findViewById(0x7f0e0355);
        f = (TextView)o.findViewById(0x7f0e0357);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        t.b(this);
        super.onDestroyView();
    }

    public void onEventMainThread(EventGlobalsLoaded eventglobalsloaded)
    {
        if (eventglobalsloaded.getUserMeta() != null)
        {
            eventglobalsloaded = p.b();
            if (eventglobalsloaded != null)
            {
                u.displayBadge(eventglobalsloaded);
                e.setText(eventglobalsloaded.getName());
            }
        }
        a();
    }

    public void onEventMainThread(EventPurchaseConfirmed eventpurchaseconfirmed)
    {
        a();
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    public void onResume()
    {
        super.onResume();
        v = new BlurredDrawable(getActivity());
        Object obj = p.b();
        u.setFiltered(true);
        if (obj != null)
        {
            u.displayBadge(((com.tinder.d.f) (obj)));
            e.setText(((User) (obj)).getName());
        }
        w = getActivity().getResources().getDimensionPixelSize(0x7f090127);
        x = getActivity().getResources().getDimensionPixelSize(0x7f090188);
        e.setTag(this);
        ad.a(h, 0.85F);
        h.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentSideMenu a;

            public final void onClick(View view)
            {
                com.tinder.managers.a.a("Menu.Profile");
                ((ActivityMain)a.getActivity()).q();
            }

            
            {
                a = FragmentSideMenu.this;
                super();
            }
        });
        j.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentSideMenu a;

            public final void onClick(View view)
            {
                com.tinder.managers.a.a("Menu.Settings");
                view = (ActivityMain)a.getActivity();
                ((ActivityMain) (view)).j.closeDrawer();
                ActivityMainPagerAdapter activitymainpageradapter = ((ActivityMain) (view)).i;
                activitymainpageradapter.d.add(com.tinder.adapters.ActivityMainPagerAdapter.ModalType.e);
                activitymainpageradapter.notifyDataSetChanged();
                view.t();
            }

            
            {
                a = FragmentSideMenu.this;
                super();
            }
        });
        l.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentSideMenu a;

            public final void onClick(View view)
            {
                com.tinder.managers.a.a(new SparksEvent("Menu.Faq"));
                view = a.q;
                com.tinder.managers.f.a a1 = new com.tinder.managers.f.a(this) {

                    final _cls3 a;

                    public final void a(String s1)
                    {
                        if (a.a.getActivity() != null)
                        {
                            Object obj = a.a.s;
                            i i1 = a.a.getActivity();
                            StringBuilder stringbuilder = new StringBuilder();
                            boolean flag = ae.a();
                            if (!TextUtils.isEmpty(s1))
                            {
                                stringbuilder.append("fbe=");
                                stringbuilder.append(s1);
                            }
                            if (((com.tinder.managers.x) (obj)).a.b() != null)
                            {
                                stringbuilder.append("&u=");
                                stringbuilder.append(((com.tinder.managers.x) (obj)).a.b().getId());
                            }
                            if (flag)
                            {
                                stringbuilder.append("&p=true");
                            }
                            stringbuilder.append("&d=Android");
                            stringbuilder.append("&m=");
                            stringbuilder.append(Build.MODEL);
                            stringbuilder.append("&os=");
                            stringbuilder.append(android.os.Build.VERSION.SDK_INT);
                            stringbuilder.append("&ti=");
                            stringbuilder.append(ManagerApp.e());
                            stringbuilder.append("&loc=");
                            stringbuilder.append(Locale.getDefault());
                            s1 = stringbuilder.toString();
                            s1 = (new StringBuilder()).append("https://www.gotinder.com/faq").append('?').append(s1).toString();
                            obj = new Intent("android.intent.action.VIEW");
                            ((Intent) (obj)).setData(Uri.parse(s1));
                            i1.startActivity(((Intent) (obj)));
                        }
                    }

            
            {
                a = _pcls3;
                super();
            }
                };
                String s1 = com.tinder.managers.f.a();
                view = new com.tinder.managers.f._cls6(view, (new StringBuilder("https://graph.facebook.com/me/?access_token=")).append(s1).toString(), new com.tinder.managers.f._cls4(view, a1), new com.tinder.managers.f._cls5(view, a1));
                ManagerApp.b().a(view);
            }

            
            {
                a = FragmentSideMenu.this;
                super();
            }
        });
        k.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentSideMenu a;

            public final void onClick(View view)
            {
                com.tinder.managers.a.a("Menu.Discovery");
                view = (ActivityMain)a.getActivity();
                ((ActivityMain) (view)).j.closeDrawer();
                ActivityMainPagerAdapter activitymainpageradapter = ((ActivityMain) (view)).i;
                activitymainpageradapter.d.add(com.tinder.adapters.ActivityMainPagerAdapter.ModalType.f);
                activitymainpageradapter.notifyDataSetChanged();
                view.t();
            }

            
            {
                a = FragmentSideMenu.this;
                super();
            }
        });
        n.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentSideMenu a;

            public final void onClick(View view)
            {
                if (!ad.b(com.tinder.fragments.FragmentSideMenu.a(a)))
                {
                    com.tinder.fragments.FragmentSideMenu.a(a, new v(a.getActivity(), 0, "menu"));
                    com.tinder.fragments.FragmentSideMenu.a(a).show();
                }
            }

            
            {
                a = FragmentSideMenu.this;
                super();
            }
        });
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentSideMenu a;

            public final void onClick(View view)
            {
                if (!ad.b(com.tinder.fragments.FragmentSideMenu.a(a)))
                {
                    com.tinder.fragments.FragmentSideMenu.a(a, new v(a.getActivity(), 1, "menu"));
                    com.tinder.fragments.FragmentSideMenu.a(a).show();
                }
            }

            
            {
                a = FragmentSideMenu.this;
                super();
            }
        });
        o.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentSideMenu a;

            public final void onClick(View view)
            {
                if (a.getActivity() != null)
                {
                    ((ActivityMain)a.getActivity()).launchPlusSubscriptionPaywall(5, com.tinder.fragments.FragmentSideMenu.d);
                }
            }

            
            {
                a = FragmentSideMenu.this;
                super();
            }
        });
        if (obj != null)
        {
            java.util.ArrayList arraylist = ((User) (obj)).getAvatarUrlsForSize(UserPhotoSize.MED);
            if (!arraylist.isEmpty())
            {
                Picasso.a(getActivity()).a((String)arraylist.get(0)).a(0x7f090186, 0x7f090186).b().a(g, null);
            }
            obj = ((User) (obj)).getAvatarUrlsForSize(UserPhotoSize.LARGE);
            if (!((List) (obj)).isEmpty())
            {
                Picasso.a(getActivity()).a((String)((List) (obj)).get(0)).b(w, x).b().a(this);
            }
        }
        c();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a();
        t.a(this, true);
    }

}
