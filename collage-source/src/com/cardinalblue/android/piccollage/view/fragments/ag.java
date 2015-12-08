// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import bolts.i;
import com.android.volley.r;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.j;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.squareup.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            j

public class ag extends Fragment
{
    public static class a extends ArrayAdapter
        implements com.android.volley.m.a, com.android.volley.m.b
    {

        public void a(r r)
        {
            com.cardinalblue.android.piccollage.a.f.a(r);
        }

        public volatile void a(Object obj)
        {
            a((String)obj);
        }

        public void a(String s)
        {
            try
            {
                for (s = com.cardinalblue.android.piccollage.controller.network.f.d(s).iterator(); s.hasNext(); add((String)s.next())) { }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.cardinalblue.android.piccollage.a.f.a(s);
                return;
            }
            notifyDataSetChanged();
            return;
        }

        public a(Context context)
        {
            super(context, 0x7f0300f3, 0x7f100232);
            com.cardinalblue.android.piccollage.controller.network.f.a(this, this);
        }
    }


    private int a;
    private int b;
    private com.cardinalblue.android.piccollage.view.fragments.j c;
    private ViewSwitcher d;
    private a e;
    private String f;
    private TextView g;
    private SuperRecyclerView h;

    public ag()
    {
        f = null;
    }

    static TextView a(ag ag1, TextView textview)
    {
        ag1.g = textview;
        return textview;
    }

    static ViewSwitcher a(ag ag1)
    {
        return ag1.d;
    }

    private void a()
    {
        Point point = k.b();
        int i = point.x;
        int l = point.y;
        int i1 = getActivity().getResources().getInteger(0x7f09001e);
        a = (i - getActivity().getResources().getDimensionPixelSize(0x7f0b0062) * (i1 + 1)) / i1;
        b = (l * a) / i;
    }

    private void a(CBCollagesResponse cbcollagesresponse)
    {
        c.a(cbcollagesresponse);
        int i = c.getItemCount();
        SuperRecyclerView superrecyclerview = h;
        boolean flag;
        if (cbcollagesresponse.getTotal() > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        superrecyclerview.setCanLoadMore(flag);
        c.notifyDataSetChanged();
    }

    static void a(ag ag1, CBCollagesResponse cbcollagesresponse)
    {
        ag1.b(cbcollagesresponse);
    }

    static a b(ag ag1)
    {
        return ag1.e;
    }

    private void b(CBCollagesResponse cbcollagesresponse)
    {
        c.b(null);
        c.notifyDataSetChanged();
        c.b(cbcollagesresponse);
        int i = c.getItemCount();
        SuperRecyclerView superrecyclerview = h;
        boolean flag;
        if (cbcollagesresponse.getTotal() > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        superrecyclerview.setCanLoadMore(flag);
        c.notifyDataSetChanged();
    }

    static void b(ag ag1, CBCollagesResponse cbcollagesresponse)
    {
        ag1.a(cbcollagesresponse);
    }

    static SuperRecyclerView c(ag ag1)
    {
        return ag1.h;
    }

    static String d(ag ag1)
    {
        return ag1.f;
    }

    static com.cardinalblue.android.piccollage.view.fragments.j e(ag ag1)
    {
        return ag1.c;
    }

    protected void a(String s)
    {
        if (g == null)
        {
            return;
        } else
        {
            g.setText(String.format(getActivity().getString(0x7f07020c), new Object[] {
                s
            }));
            return;
        }
    }

    public void onActivityResult(int i, int l, Intent intent)
    {
        i;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (l == -1 && intent != null && intent.hasExtra("web_photos_data"))
        {
            a((CBCollagesResponse)intent.getParcelableExtra("web_photos_data"));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            f = bundle.getString("saved_query_string");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f0300c9, viewgroup, false);
        d = (ViewSwitcher)viewgroup.findViewById(0x7f100207);
        bundle = (ListView)viewgroup.findViewById(0x7f100208);
        e = new a(getActivity());
        bundle.addHeaderView(layoutinflater.inflate(0x7f0300de, null));
        bundle.setAdapter(e);
        bundle.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ag a;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (i > 0)
                {
                    adapterview = (String)com.cardinalblue.android.piccollage.view.fragments.ag.b(a).getItem(i - 1);
                    com.cardinalblue.android.piccollage.controller.d.a().c(new ah.a(adapterview));
                }
            }

            
            {
                a = ag.this;
                super();
            }
        });
        h = (SuperRecyclerView)viewgroup.findViewById(0x7f1001d6);
        layoutinflater = new GridLayoutManager(getActivity(), getResources().getInteger(0x7f09001e));
        h.setLayoutManager(layoutinflater);
        h.a(new j(getResources().getDimensionPixelSize(0x7f0b0062)));
        h.setEmptyInflateId(0x7f0300a9);
        h.setOnEmptyViewChanged(new com.malinskiy.superrecyclerview.SuperRecyclerView.b() {

            final ag a;

            public void a()
            {
                View view = ag.c(a).getEmptyView();
                if (view == null)
                {
                    return;
                } else
                {
                    ag.a(a, (TextView)view);
                    return;
                }
            }

            
            {
                a = ag.this;
                super();
            }
        });
        a();
        c = new com.cardinalblue.android.piccollage.view.fragments.j(getActivity(), a, b);
        c.a("collage search");
        h.setOnMoreListener(new com.malinskiy.superrecyclerview.a() {

            final ag a;

            public void a(int i, int l, int i1)
            {
                if (!TextUtils.isEmpty(com.cardinalblue.android.piccollage.view.fragments.ag.d(a)))
                {
                    bolts.j.a(new Callable(this) {

                        final _cls5 a;

                        public CBCollagesResponse a()
                            throws Exception
                        {
                            return com.cardinalblue.android.piccollage.controller.network.f.a(com.cardinalblue.android.piccollage.view.fragments.ag.d(a.a), ag.e(a.a).getItemCount());
                        }

                        public Object call()
                            throws Exception
                        {
                            return a();
                        }

            
            {
                a = _pcls5;
                super();
            }
                    }).a(new i(this) {

                        final _cls5 a;

                        public Void a(bolts.j j1)
                            throws Exception
                        {
                            ag.c(a.a).a();
                            if (j1.d() || j1.c())
                            {
                                com.cardinalblue.android.piccollage.a.f.a(j1.f());
                                return null;
                            } else
                            {
                                com.cardinalblue.android.piccollage.view.fragments.ag.b(a.a, (CBCollagesResponse)j1.e());
                                return null;
                            }
                        }

                        public Object then(bolts.j j1)
                            throws Exception
                        {
                            return a(j1);
                        }

            
            {
                a = _pcls5;
                super();
            }
                    }, bolts.j.b);
                }
            }

            
            {
                a = ag.this;
                super();
            }
        });
        h.setAdapter(c);
        c.a(new android.widget.AdapterView.OnItemClickListener() {

            final ag a;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (!k.b(a.getActivity()))
                {
                    k.a(a.getActivity(), 0x7f07021d, 1);
                    return;
                } else
                {
                    com.cardinalblue.android.piccollage.a.b.bm();
                    adapterview = new Intent(a.getActivity().getApplicationContext(), com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
                    adapterview.setAction("piccollage.intent.action.VIEW_MULTIPLE_COLLAGES");
                    adapterview.putExtra("position", i);
                    adapterview.putExtra("web_photos_data", ag.e(a).a());
                    adapterview.putExtra("extra_start_from", "collage search");
                    adapterview.putExtra("feed_accessor", FeedAccessorFactory.a(8, null));
                    a.startActivityForResult(adapterview, 1);
                    return;
                }
            }

            
            {
                a = ag.this;
                super();
            }
        });
        return viewgroup;
    }

    public void onQuery(ah.b b1)
    {
        b1 = b1.a;
        if (!TextUtils.isEmpty(b1))
        {
            f = b1;
            a(b1);
            (new com.cardinalblue.android.b.k.b(getActivity())).a(getString(0x7f0701fa)).a(new Callable(b1) {

                final String a;
                final ag b;

                public Object call()
                    throws Exception
                {
                    return com.cardinalblue.android.piccollage.controller.network.f.a(a, 0);
                }

            
            {
                b = ag.this;
                a = s;
                super();
            }
            }).a().a(new i() {

                final ag a;

                public Object then(bolts.j j1)
                    throws Exception
                {
                    ag.a(a).setDisplayedChild(1);
                    if (j1.d() || j1.c())
                    {
                        com.cardinalblue.android.piccollage.a.f.a(j1.f());
                        return null;
                    } else
                    {
                        ag.a(a, (CBCollagesResponse)j1.e());
                        return null;
                    }
                }

            
            {
                a = ag.this;
                super();
            }
            }, k.a);
            return;
        } else
        {
            f = null;
            d.setDisplayedChild(0);
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        String s;
        if (f == null)
        {
            s = "";
        } else
        {
            s = f;
        }
        bundle.putString("saved_query_string", s);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.b(this);
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }
}
