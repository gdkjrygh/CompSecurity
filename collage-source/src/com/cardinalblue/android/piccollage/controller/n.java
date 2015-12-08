// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bolts.i;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.a.m;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeSearchResponse;
import com.cardinalblue.android.piccollage.view.SearchWebViewSwitcher;
import com.cardinalblue.android.piccollage.view.a.t;
import com.cardinalblue.android.piccollage.view.j;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import java.util.List;
import java.util.concurrent.Callable;

public class n
{
    public static interface a
    {

        public abstract boolean b(CBYoutubeData cbyoutubedata);
    }

    public static interface b
    {

        public abstract void a(View view, boolean flag);

        public abstract void a(CBYoutubeData cbyoutubedata);
    }


    protected t a;
    protected t b;
    protected final b c;
    protected m d;
    protected String e;
    public int f;
    public int g;
    public int h;
    private final SearchWebViewSwitcher i;
    private final Context j;
    private final ImageView k;
    private final Button l;
    private SuperRecyclerView m;
    private SuperRecyclerView n;
    private ProgressBar o;
    private TextView p;
    private String q;

    public n(Context context, View view, b b1, a a1)
    {
        f = 0;
        g = 1;
        h = 2;
        c = b1;
        j = context;
        i = (SearchWebViewSwitcher)view;
        o = (ProgressBar)view.findViewById(0x7f10019b);
        p = (TextView)view.findViewById(0x7f1001ad);
        k = (ImageView)view.findViewById(0x7f1001ac);
        l = (Button)view.findViewById(0x7f1001ae);
        a = new t(context, a1);
        b = new t(context, a1);
        m = (SuperRecyclerView)view.findViewById(0x7f10020e);
        a.a(c);
        int i1 = context.getResources().getInteger(0x7f09001f);
        int j1 = context.getResources().getDimensionPixelSize(0x7f0b0123);
        m.setLayoutManager(new GridLayoutManager(context, i1));
        m.a(new j(j1));
        n = (SuperRecyclerView)view.findViewById(0x7f10020d);
        b.a(c);
        n.setLayoutManager(new GridLayoutManager(context, i1));
        n.a(new j(j1));
        m.setAdapter(a);
        m.setOnMoreListener(new com.malinskiy.superrecyclerview.a() {

            final n a;

            public void a(int k1, int l1, int i2)
            {
                a.d = new m(true, new com.cardinalblue.android.piccollage.controller.a.m.a(this) {

                    final _cls1 a;

                    public void a(CBYoutubeSearchResponse cbyoutubesearchresponse)
                    {
                        n.a(a.a).a(a.a.h);
                        com.cardinalblue.android.piccollage.controller.n.b(a.a).a();
                        a.a.a.a(cbyoutubesearchresponse.getVideos());
                        SuperRecyclerView superrecyclerview = com.cardinalblue.android.piccollage.controller.n.b(a.a);
                        boolean flag;
                        if (!TextUtils.isEmpty(cbyoutubesearchresponse.getNextPageUrl()))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        superrecyclerview.setCanLoadMore(flag);
                        a.a.a.notifyDataSetChanged();
                    }

                    public void a(Throwable throwable)
                    {
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                a.d.a(new String[] {
                    a.e
                });
            }

            
            {
                a = n.this;
                super();
            }
        });
        n.setAdapter(b);
        n.setOnMoreListener(new com.malinskiy.superrecyclerview.a() {

            final n a;

            public void a(int k1, int l1, int i2)
            {
                a.d = new m(true, new com.cardinalblue.android.piccollage.controller.a.m.a(this) {

                    final _cls2 a;

                    public void a(CBYoutubeSearchResponse cbyoutubesearchresponse)
                    {
                        n.a(a.a).a(a.a.g);
                        n.c(a.a).a();
                        a.a.b.a(cbyoutubesearchresponse.getVideos());
                        SuperRecyclerView superrecyclerview = n.c(a.a);
                        boolean flag;
                        if (!TextUtils.isEmpty(cbyoutubesearchresponse.getNextPageUrl()))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        superrecyclerview.setCanLoadMore(flag);
                        a.a.b.notifyDataSetChanged();
                    }

                    public void a(Throwable throwable)
                    {
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
                a.d.a(new String[] {
                    n.d(a)
                });
            }

            
            {
                a = n.this;
                super();
            }
        });
        c();
    }

    static SearchWebViewSwitcher a(n n1)
    {
        return n1.i;
    }

    static SuperRecyclerView b(n n1)
    {
        return n1.m;
    }

    static SuperRecyclerView c(n n1)
    {
        return n1.n;
    }

    static String d(n n1)
    {
        return n1.q;
    }

    protected Context a()
    {
        return j;
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        i.a(f);
        o.setVisibility(8);
        p.setVisibility(4);
        k.setImageResource(0x7f020227);
        l.setText(0x7f070249);
        l.setOnClickListener(onclicklistener);
        k.setVisibility(0);
        l.setVisibility(0);
    }

    protected void a(m m1)
    {
        if (m1 != null && m1.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            m1.a(null);
            m1.cancel(true);
        }
    }

    protected void a(String s)
    {
        i.a(f);
        o.setVisibility(8);
        s = j.getResources().getString(0x7f07020c, new Object[] {
            s
        });
        p.setText(s);
        p.setVisibility(0);
        k.setVisibility(8);
        l.setVisibility(8);
    }

    protected boolean a(CBYoutubeSearchResponse cbyoutubesearchresponse)
    {
        boolean flag = false;
        List list = cbyoutubesearchresponse.getVideos();
        if (list == null || list.size() == 0)
        {
            return false;
        }
        b.b(list);
        q = cbyoutubesearchresponse.getNextPageUrl();
        cbyoutubesearchresponse = n;
        if (!TextUtils.isEmpty(q))
        {
            flag = true;
        }
        cbyoutubesearchresponse.setCanLoadMore(flag);
        i.a(g);
        return true;
    }

    public View b()
    {
        return i;
    }

    public void b(String s)
    {
        c();
        a(d);
        com.cardinalblue.android.piccollage.a.b.ab(s);
        d = new m(false, new com.cardinalblue.android.piccollage.controller.a.m.a(s) {

            final String a;
            final n b;

            public void a(CBYoutubeSearchResponse cbyoutubesearchresponse)
            {
                boolean flag = b.b(cbyoutubesearchresponse);
                if (!flag)
                {
                    b.a(a);
                }
                if (b.c != null)
                {
                    b.c.a(b.b(), flag);
                }
            }

            public void a(Throwable throwable)
            {
                if (com.cardinalblue.android.b.k.b(b.a()))
                {
                    b.a(a);
                } else
                {
                    com.cardinalblue.android.b.k.a(b.a(), 0x7f07021d, 0);
                    b.a(new android.view.View.OnClickListener(this) {

                        final _cls5 a;

                        public void onClick(View view)
                        {
                            a.b.b(a.a);
                        }

            
            {
                a = _pcls5;
                super();
            }
                    });
                }
                if (b.c != null)
                {
                    b.c.a(b.b(), false);
                }
            }

            
            {
                b = n.this;
                a = s;
                super();
            }
        });
        d.execute(new String[] {
            s
        });
    }

    protected boolean b(CBYoutubeSearchResponse cbyoutubesearchresponse)
    {
        boolean flag = false;
        List list = cbyoutubesearchresponse.getVideos();
        if (list == null || list.size() == 0)
        {
            return false;
        }
        a.b(list);
        e = cbyoutubesearchresponse.getNextPageUrl();
        cbyoutubesearchresponse = m;
        if (!TextUtils.isEmpty(e))
        {
            flag = true;
        }
        cbyoutubesearchresponse.setCanLoadMore(flag);
        i.a(h);
        return true;
    }

    protected void c()
    {
        i.a(f);
        o.setVisibility(0);
        p.setVisibility(8);
        k.setVisibility(8);
        l.setVisibility(8);
    }

    public void d()
    {
        a(d);
    }

    public void e()
    {
        a.notifyDataSetChanged();
        b.notifyDataSetChanged();
    }

    public void f()
    {
        if (b.getItemCount() == 0)
        {
            g();
            return;
        } else
        {
            i.a(g);
            return;
        }
    }

    public void g()
    {
        c();
        bolts.j.a(new Callable() {

            final n a;

            public CBYoutubeSearchResponse a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.h();
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = n.this;
                super();
            }
        }).a(new i() {

            final n a;

            public Object then(bolts.j j1)
                throws Exception
            {
                if (j1.c() || j1.d())
                {
                    if (a.c != null)
                    {
                        a.c.a(a.b(), false);
                    }
                    com.cardinalblue.android.piccollage.controller.n.b(a).setCanLoadMore(false);
                    if (!com.cardinalblue.android.b.k.b(a.a()))
                    {
                        com.cardinalblue.android.b.k.a(a.a(), 0x7f07021d, 0);
                        a.a(new android.view.View.OnClickListener(this) {

                            final _cls3 a;

                            public void onClick(View view)
                            {
                                a.a.g();
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                    }
                } else
                {
                    boolean flag = a.a((CBYoutubeSearchResponse)j1.e());
                    if (a.c != null)
                    {
                        a.c.a(a.b(), flag);
                        return null;
                    }
                }
                return null;
            }

            
            {
                a = n.this;
                super();
            }
        }, k.a);
    }
}
