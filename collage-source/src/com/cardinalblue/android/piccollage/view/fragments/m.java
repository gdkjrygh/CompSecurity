// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.volley.r;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.PicUsersListActivity;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.controller.a.d;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.view.NoInternetWarningBar;
import com.cardinalblue.android.piccollage.view.j;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.malinskiy.superrecyclerview.a;
import java.io.IOException;
import java.util.List;

public class m extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.view.View.OnClickListener, com.cardinalblue.android.piccollage.view.a.f.b
{

    private WebPhoto a;
    private String b;
    private CBCollagesResponse c;
    private com.cardinalblue.android.piccollage.view.a.f d;
    private SuperRecyclerView e;
    private NoInternetWarningBar f;
    private TextView g;
    private boolean h;
    private final BroadcastReceiver i = new BroadcastReceiver() {

        final m a;

        public void onReceive(Context context, Intent intent)
        {
            if (com.cardinalblue.android.piccollage.view.fragments.m.a(a) == null)
            {
                return;
            }
            if (k.b(context))
            {
                com.cardinalblue.android.piccollage.view.fragments.m.a(a).setVisibility(8);
                return;
            } else
            {
                com.cardinalblue.android.piccollage.view.fragments.m.a(a).setVisibility(0);
                return;
            }
        }

            
            {
                a = m.this;
                super();
            }
    };

    public m()
    {
        c = null;
        h = false;
    }

    static NoInternetWarningBar a(m m1)
    {
        return m1.f;
    }

    public static m a(WebPhoto webphoto, String s)
    {
        m m1 = new m();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_webphoto", webphoto);
        bundle.putString("start_from", s);
        m1.setArguments(bundle);
        return m1;
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        h = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static String b(m m1)
    {
        return m1.b;
    }

    static WebPhoto c(m m1)
    {
        return m1.a;
    }

    private void e()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getActivity().registerReceiver(i, intentfilter);
    }

    private void f()
    {
        getActivity().unregisterReceiver(i);
    }

    private void g()
    {
        getLoaderManager().destroyLoader(0);
        getLoaderManager().initLoader(0, null, this);
    }

    public void a()
    {
        ProgressDialog progressdialog = new ProgressDialog(getActivity());
        progressdialog.setMessage(getString(0x7f0701fa));
        progressdialog.setCancelable(false);
        progressdialog.setCanceledOnTouchOutside(false);
        k.b(getActivity(), progressdialog);
        com.android.volley.b b1 = new com.android.volley.b(progressdialog) {

            final ProgressDialog a;
            final m b;

            public volatile void a(Object obj)
            {
                a((String)obj);
            }

            public void a(String s)
            {
                k.a(b.getActivity(), a);
                if (TextUtils.isEmpty(s))
                {
                    k.a(b.getActivity(), 0x7f0700f8, 0);
                    return;
                } else
                {
                    com.cardinalblue.android.piccollage.a.b.am(com.cardinalblue.android.piccollage.view.fragments.m.b(b));
                    s = Collage.a(b.getActivity(), m.c(b).getId(), com.cardinalblue.android.piccollage.view.fragments.m.b(b), s);
                    b.startActivityForResult(s, 2);
                    return;
                }
            }

            
            {
                b = m.this;
                a = progressdialog;
                super();
            }
        };
        com.android.volley.a a1 = new com.android.volley.a(progressdialog) {

            final ProgressDialog a;
            final m b;

            public void a(r r)
            {
                k.a(b.getActivity(), a);
                try
                {
                    com.cardinalblue.android.piccollage.controller.network.f.a(r);
                }
                // Misplaced declaration of an exception variable
                catch (r r)
                {
                    com.cardinalblue.android.piccollage.a.f.a(r);
                }
                k.a(b.getActivity(), 0x7f0700f8, 0);
            }

            
            {
                b = m.this;
                a = progressdialog;
                super();
            }
        };
        try
        {
            com.cardinalblue.android.piccollage.controller.network.f.c(getActivity(), a.getId(), b1, a1);
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        k.a(getActivity(), progressdialog);
        k.a(getActivity(), 0x7f0700f8, 0);
    }

    public void a(int l)
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 1);
            return;
        } else
        {
            com.cardinalblue.android.piccollage.a.b.bi();
            Intent intent = new Intent(getActivity().getApplicationContext(), com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
            intent.setAction("piccollage.intent.action.VIEW_MULTIPLE_COLLAGES");
            intent.putExtra("position", l);
            intent.putExtra("web_photos_data", c);
            intent.putExtra("feed_accessor", FeedAccessorFactory.a(8, null));
            intent.putExtra("extra_start_from", "echoes_list");
            startActivityForResult(intent, 0);
            return;
        }
    }

    public void a(Loader loader, CBCollagesResponse cbcollagesresponse)
    {
        e.getSwipeToRefresh().setRefreshing(false);
        e.a();
        if (cbcollagesresponse != null)
        {
            boolean flag;
            if (c == null || b())
            {
                d.c();
                c = cbcollagesresponse;
            } else
            {
                c.addMoreCollage(cbcollagesresponse);
            }
            loader = cbcollagesresponse.getPhotos();
            d.a(loader);
            loader = e;
            if (cbcollagesresponse != null && d.b() < cbcollagesresponse.getTotal())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loader.setCanLoadMore(flag);
            d.notifyDataSetChanged();
        }
        a(false);
    }

    boolean b()
    {
        return h;
    }

    public String c()
    {
        return a.getId();
    }

    public int d()
    {
        while (b() || c == null) 
        {
            return 0;
        }
        return c.getPhotos().size();
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        if (i1 == -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (l)
        {
        case 1: // '\001'
        default:
            super.onActivityResult(l, i1, intent);
            return;

        case 0: // '\0'
            if (c != null && intent != null && intent.hasExtra("web_photos_data"))
            {
                CBCollagesResponse cbcollagesresponse = (CBCollagesResponse)intent.getParcelableExtra("web_photos_data");
                c.addMoreCollage(cbcollagesresponse);
                d.a(cbcollagesresponse.getPhotos());
                SuperRecyclerView superrecyclerview = e;
                boolean flag;
                if (intent != null && d.b() < cbcollagesresponse.getTotal())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                superrecyclerview.setCanLoadMore(flag);
                return;
            }
            break;

        case 2: // '\002'
            e.getSwipeToRefresh().setRefreshing(true);
            g();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        com.cardinalblue.android.piccollage.a.b.bo();
        view = new Bundle();
        view.putInt("type", 2);
        view.putString("user_list_path", String.format("collages/%s/likers", new Object[] {
            a.getId()
        }));
        Intent intent = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/PicUsersListActivity);
        intent.putExtras(view);
        startActivity(intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            a = (WebPhoto)bundle.getParcelable("extra_webphoto");
            b = bundle.getString("start_from");
        }
    }

    public Loader onCreateLoader(int l, Bundle bundle)
    {
        if (l == 0)
        {
            return new d(getActivity(), this);
        } else
        {
            return null;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b9, null);
        f = (NoInternetWarningBar)layoutinflater.findViewById(0x7f1001d7);
        e = (SuperRecyclerView)layoutinflater.findViewById(0x7f1001d6);
        d = new com.cardinalblue.android.piccollage.view.a.f(getActivity());
        e.setAdapter(d);
        d.a(this);
        int l = getResources().getInteger(0x7f09001c);
        viewgroup = new GridLayoutManager(getActivity(), l);
        l = getResources().getDimensionPixelSize(0x7f0b0062);
        e.a(new j(l));
        e.setLayoutManager(viewgroup);
        e.a(new a() {

            final m a;

            public void a(int i1, int j1, int k1)
            {
                a.getLoaderManager().restartLoader(0, null, a);
            }

            
            {
                a = m.this;
                super();
            }
        }, 1);
        g = (TextView)layoutinflater.findViewById(0x7f1001d5);
        l = a.getLikeNum();
        viewgroup = new StringBuilder();
        viewgroup.append(l).append(" ");
        viewgroup.append(getResources().getQuantityString(0x7f080007, l));
        g.setText(viewgroup.toString());
        g.setOnClickListener(this);
        e.setRefreshListener(this);
        getLoaderManager().initLoader(0, null, this);
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (CBCollagesResponse)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        a(true);
    }

    public void onRefresh()
    {
        g();
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.a.b.an(b);
        e();
    }

    public void onStop()
    {
        super.onStop();
        f();
    }
}
