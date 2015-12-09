// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.android.volley.r;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.malinskiy.superrecyclerview.a;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            j

public class o extends Fragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{

    private j a;
    private SuperRecyclerView b;
    private ViewSwitcher c;
    private String d;
    private int e;

    public o()
    {
    }

    public static o a(String s, int i, Bundle bundle)
    {
        o o1 = new o();
        o1.setArguments(b(s, i, bundle));
        return o1;
    }

    static String a(o o1)
    {
        return o1.d;
    }

    private void a()
    {
        if (c.getDisplayedChild() == 0)
        {
            c.showNext();
        }
    }

    private void a(int i, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        f.a(d, i, b1, a1);
    }

    private void a(com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        b();
        f.a(d, 0, b1, a1);
    }

    private void a(CBCollagesResponse cbcollagesresponse)
    {
        a.a(cbcollagesresponse);
        int i = a.getItemCount();
        SuperRecyclerView superrecyclerview = b;
        boolean flag;
        if (cbcollagesresponse.getTotal() > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        superrecyclerview.setCanLoadMore(flag);
        a.notifyDataSetChanged();
    }

    static void a(o o1, int i, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        o1.a(i, b1, a1);
    }

    static void a(o o1, CBCollagesResponse cbcollagesresponse)
    {
        o1.a(cbcollagesresponse);
    }

    public static Bundle b(String s, int i, Bundle bundle)
    {
        Bundle bundle1 = new Bundle();
        bundle1.putString("extra_feed_name", s);
        if (i > 0)
        {
            bundle1.putInt("extra_activity_title_id", i);
        }
        if (bundle != null)
        {
            bundle1.putAll(bundle);
        }
        return bundle1;
    }

    static j b(o o1)
    {
        return o1.a;
    }

    private void b()
    {
        if (c.getDisplayedChild() == 1)
        {
            c.showPrevious();
        }
    }

    private void b(CBCollagesResponse cbcollagesresponse)
    {
        a.b(cbcollagesresponse);
        int i = a.getItemCount();
        SuperRecyclerView superrecyclerview = b;
        boolean flag;
        if (cbcollagesresponse.getTotal() > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        superrecyclerview.setCanLoadMore(flag);
        a.notifyDataSetChanged();
    }

    static void b(o o1, CBCollagesResponse cbcollagesresponse)
    {
        o1.b(cbcollagesresponse);
    }

    static SuperRecyclerView c(o o1)
    {
        return o1.b;
    }

    static void d(o o1)
    {
        o1.a();
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
        d = getArguments().getString("extra_feed_name");
        e = getArguments().getInt("extra_activity_title_id", -1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bb, viewgroup, false);
        c = (ViewSwitcher)layoutinflater.findViewById(0x7f1000c1);
        b = (SuperRecyclerView)layoutinflater.findViewById(0x7f1001d6);
        viewgroup = k.b();
        int i = ((Point) (viewgroup)).x;
        int l = ((Point) (viewgroup)).y;
        int i1 = getActivity().getResources().getInteger(0x7f09001e);
        i1 = (i - getActivity().getResources().getDimensionPixelSize(0x7f0b0062) * (i1 + 1)) / i1;
        i = (l * i1) / i;
        a = new j(getActivity(), i1, i);
        a.a(d);
        b.setRefreshListener(this);
        b.setOnMoreListener(new a() {

            final o a;

            public void a(int j1, int k1, int l1)
            {
                if (!TextUtils.isEmpty(com.cardinalblue.android.piccollage.view.fragments.o.a(a)))
                {
                    com.cardinalblue.android.piccollage.view.fragments.o.a(a, o.b(a).getItemCount(), new com.android.volley.m.b(this) {

                        final _cls1 a;

                        public void a(CBCollagesResponse cbcollagesresponse)
                        {
                            com.cardinalblue.android.piccollage.view.fragments.o.a(a.a, cbcollagesresponse);
                            o.c(a.a).a();
                        }

                        public volatile void a(Object obj)
                        {
                            a((CBCollagesResponse)obj);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }, new com.android.volley.m.a(this) {

                        final _cls1 a;

                        public void a(r r)
                        {
                            com.cardinalblue.android.piccollage.a.f.a(r);
                            o.c(a.a).a();
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
            }

            
            {
                a = o.this;
                super();
            }
        });
        b.setEmptyInflateId(0x7f0300a9);
        b.setOnEmptyViewChanged(new com.malinskiy.superrecyclerview.SuperRecyclerView.b() {

            final o a;

            public void a()
            {
                TextView textview = (TextView)o.c(a).getEmptyView();
                if (textview != null)
                {
                    textview.setText(String.format(a.getActivity().getString(0x7f07020c), new Object[] {
                        com.cardinalblue.android.piccollage.view.fragments.o.a(a)
                    }));
                }
            }

            
            {
                a = o.this;
                super();
            }
        });
        b.setAdapter(a);
        a.a(new android.widget.AdapterView.OnItemClickListener() {

            final o a;

            public void onItemClick(AdapterView adapterview, View view, int j1, long l1)
            {
                if (!k.b(a.getActivity()))
                {
                    k.a(a.getActivity(), 0x7f07021d, 1);
                    return;
                } else
                {
                    adapterview = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
                    adapterview.setAction("piccollage.intent.action.VIEW_MULTIPLE_COLLAGES");
                    adapterview.putExtra("position", j1);
                    adapterview.putExtra("web_photos_data", o.b(a).a());
                    adapterview.putExtra("extra_start_from", com.cardinalblue.android.piccollage.view.fragments.o.a(a));
                    adapterview.putExtra("feed_accessor", FeedAccessorFactory.a(8, null));
                    a.startActivityForResult(adapterview, 1);
                    return;
                }
            }

            
            {
                a = o.this;
                super();
            }
        });
        a(new com.android.volley.m.b() {

            final o a;

            public void a(CBCollagesResponse cbcollagesresponse)
            {
                o.b(a, cbcollagesresponse);
                com.cardinalblue.android.piccollage.view.fragments.o.d(a);
            }

            public volatile void a(Object obj)
            {
                a((CBCollagesResponse)obj);
            }

            
            {
                a = o.this;
                super();
            }
        }, new com.android.volley.m.a() {

            final o a;

            public void a(r r)
            {
                com.cardinalblue.android.piccollage.a.f.a(r);
                com.cardinalblue.android.piccollage.view.fragments.o.d(a);
            }

            
            {
                a = o.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onRefresh()
    {
        a(new com.android.volley.m.b() {

            final o a;

            public void a(CBCollagesResponse cbcollagesresponse)
            {
                o.b(a, cbcollagesresponse);
                com.cardinalblue.android.piccollage.view.fragments.o.d(a);
                o.c(a).getSwipeToRefresh().setRefreshing(false);
            }

            public volatile void a(Object obj)
            {
                a((CBCollagesResponse)obj);
            }

            
            {
                a = o.this;
                super();
            }
        }, new com.android.volley.m.a() {

            final o a;

            public void a(r r)
            {
                com.cardinalblue.android.piccollage.a.f.a(r);
                com.cardinalblue.android.piccollage.view.fragments.o.d(a);
                o.c(a).getSwipeToRefresh().setRefreshing(false);
            }

            
            {
                a = o.this;
                super();
            }
        });
    }

    public void onResume()
    {
        super.onResume();
        if (e != -1)
        {
            getActivity().setTitle(e);
        }
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
