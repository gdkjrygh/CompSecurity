// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.CBSwipeRefreshLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.android.volley.r;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.CBCollageStructResponse;
import com.cardinalblue.android.piccollage.model.gson.NotificationResponse;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.view.a.q;
import com.cardinalblue.android.piccollage.view.a.s;
import org.json.JSONException;

public abstract class f extends Fragment
    implements android.support.v4.widget.CBSwipeRefreshLayout.OnRefreshListener, android.widget.AdapterView.OnItemClickListener, com.android.volley.m.a, com.cardinalblue.android.piccollage.view.a.q.a, com.cardinalblue.android.piccollage.view.a.s.a
{

    protected CBSwipeRefreshLayout a;
    private s b;
    private ViewSwitcher c;
    private View d;
    private View e;

    public f()
    {
    }

    static void a(f f1)
    {
        f1.c();
    }

    static void b(f f1)
    {
        f1.f();
    }

    static s c(f f1)
    {
        return f1.b;
    }

    private void c()
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 1);
            e();
            return;
        } else
        {
            d();
            a(0, new com.android.volley.m.b() {

                final f a;

                public void a(NotificationResponse notificationresponse)
                {
                    com.cardinalblue.android.piccollage.view.fragments.f.b(a);
                    ((q)f.c(a).c()).addAll(notificationresponse.getNotifications());
                    f.c(a).a(notificationresponse.canReadMore());
                    f.c(a).notifyDataSetChanged();
                }

                public volatile void a(Object obj)
                {
                    a((NotificationResponse)obj);
                }

            
            {
                a = f.this;
                super();
            }
            }, this);
            return;
        }
    }

    private void d()
    {
        g();
        e.setVisibility(0);
        d.setVisibility(8);
    }

    private void e()
    {
        g();
        d.setVisibility(0);
        e.setVisibility(8);
    }

    private void f()
    {
        boolean flag;
        if (c.getCurrentView().getId() == 0x7f1001b8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            c.showNext();
        }
    }

    private void g()
    {
        boolean flag;
        if (c.getCurrentView().getId() == 0x7f1001b7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            c.showNext();
        }
    }

    public final void a()
    {
        a(((q)b.c()).getCount(), new com.android.volley.m.b() {

            final f a;

            public void a(NotificationResponse notificationresponse)
            {
                com.cardinalblue.android.piccollage.view.fragments.f.b(a);
                f.c(a).b();
                ((q)f.c(a).c()).addAll(notificationresponse.getNotifications());
                f.c(a).a(notificationresponse.canReadMore());
                f.c(a).notifyDataSetChanged();
            }

            public volatile void a(Object obj)
            {
                a((NotificationResponse)obj);
            }

            
            {
                a = f.this;
                super();
            }
        }, ((com.android.volley.m.a) (this)));
    }

    protected abstract void a(int i, com.android.volley.m.b b1, com.android.volley.m.a a1);

    protected abstract void a(View view);

    public void a(r r)
    {
        if (b.a())
        {
            b.b();
        }
        if (a != null)
        {
            a.setRefreshing(false);
        }
        e();
    }

    public void a(NotificationResponse notificationresponse)
    {
        f();
        ((q)b.c()).clear();
        ((q)b.c()).addAll(notificationresponse.getNotifications());
        b.a(notificationresponse.canReadMore());
        b.notifyDataSetChanged();
    }

    public final void a(PicUser picuser, View view)
    {
        com.cardinalblue.android.piccollage.a.b.aw("avatar");
        Intent intent = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
        intent.putExtra("user", picuser);
        picuser = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), view, getString(0x7f0703aa));
        ActivityCompat.startActivity(getActivity(), intent, picuser.toBundle());
    }

    public final void a(WebPhoto webphoto, View view)
    {
        com.cardinalblue.android.piccollage.a.b.aw("click_url");
        com.cardinalblue.android.piccollage.controller.network.f.a(k.a(), webphoto.getId(), new com.android.volley.m.b() {

            final f a;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s1)
            {
                Intent intent;
                try
                {
                    s1 = (CBCollageStructResponse)k.b(s1, com/cardinalblue/android/piccollage/model/CBCollageStructResponse);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    com.cardinalblue.android.piccollage.a.f.a(s1);
                    return;
                }
                if (s1 == null)
                {
                    break MISSING_BLOCK_LABEL_64;
                }
                if (s1.b())
                {
                    intent = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
                    intent.setAction("piccollage.intent.action.VIEW_COLLAGE");
                    intent.putExtra("web_photo_data", s1.a());
                    a.startActivity(intent);
                }
            }

            
            {
                a = f.this;
                super();
            }
        }, null);
    }

    protected abstract int b();

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b(), null);
        getActivity().setTitle(0x7f0700e5);
        setHasOptionsMenu(true);
        a(layoutinflater);
        c = (ViewSwitcher)layoutinflater.findViewById(0x7f1001b6);
        d = layoutinflater.findViewById(0x7f100202);
        e = layoutinflater.findViewById(0x7f100213);
        ((TextView)layoutinflater.findViewById(0x7f1001ad)).setText(0x7f0700f8);
        viewgroup = (Button)layoutinflater.findViewById(0x7f1001ae);
        viewgroup.setText(0x7f070249);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            final f a;

            public void onClick(View view)
            {
                f.a(a);
            }

            
            {
                a = f.this;
                super();
            }
        });
        b = new s(getActivity(), new q(getActivity()));
        b.b(this);
        ((q)b.c()).a(this);
        viewgroup = (ListView)layoutinflater.findViewById(0x7f1001ba);
        viewgroup.setOnItemClickListener(this);
        viewgroup.setAdapter(b);
        c();
        a = (CBSwipeRefreshLayout)layoutinflater.findViewById(0x7f1001b9);
        a.setOnRefreshListener(this);
        a.setColorScheme(new int[] {
            0x1060015, 0x1060019, 0x1060013, 0x1060017
        });
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ((q)b.c()).a(null);
        b.a(this);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = (com.cardinalblue.android.piccollage.model.gson.NotificationResponse.Notifications.Notif)((q)b.c()).getItem(i);
            if (adapterview != null)
            {
                com.cardinalblue.android.piccollage.a.b.l(adapterview.getType(), adapterview.getFlurryEvent());
                com.cardinalblue.android.piccollage.a.b.aw("click_url");
                if (!TextUtils.isEmpty(adapterview.getClickUrl()))
                {
                    if ((new PICAppRoutesService()).b(Uri.parse(adapterview.getClickUrl())) != 18)
                    {
                        break label0;
                    }
                    adapterview = (new android.app.AlertDialog.Builder(getActivity())).setTitle("Coming soon!").setCancelable(false).setPositiveButton("ok", null).create();
                    k.b(getActivity(), adapterview);
                    com.cardinalblue.android.piccollage.a.b.bZ();
                }
            }
            return;
        }
        adapterview = PICAppRoutesService.d(adapterview.getClickUrl());
        adapterview.putExtra("extra_start_from", "activity");
        getActivity().startService(adapterview);
    }
}
