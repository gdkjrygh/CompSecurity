// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.MySuggestionProvider;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.a.l;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.SearchWebViewSwitcher;
import com.cardinalblue.android.piccollage.view.a.o;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.malinskiy.superrecyclerview.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            e, WebSearchActivity

public class d extends Fragment
    implements com.malinskiy.superrecyclerview.a
{
    private static class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 25;
               goto _L1 _L2
_L1:
            d d1;
            return;
_L2:
            if ((d1 = (d)a.get()) != null)
            {
                com.cardinalblue.android.piccollage.activities.d.a(d1, message.obj.toString());
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public a(d d1)
        {
            a = new WeakReference(d1);
        }
    }

    public class b extends android.support.v7.widget.RecyclerView.Adapter
    {

        Context a;
        ArrayList b;
        final d c;

        public void a()
        {
            b.clear();
        }

        public void a(Collection collection)
        {
            b.addAll(collection);
        }

        public int getItemCount()
        {
            return b.size();
        }

        public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i1)
        {
            String s = (String)b.get(i1);
            viewholder = (TextView)viewholder.itemView;
            viewholder.setText(s);
            viewholder.setOnClickListener(new android.view.View.OnClickListener(this, s) {

                final String a;
                final b b;

                public void onClick(View view)
                {
                    ((WebSearchActivity)b.c.getActivity()).a(a);
                }

            
            {
                b = b1;
                a = s;
                super();
            }
            });
        }

        public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i1)
        {
            return new a(this, (TextView)((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f0300e6, viewgroup, false));
        }

        public b(Context context)
        {
            c = d.this;
            super();
            b = new ArrayList();
            a = context;
        }
    }

    class b.a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        final b a;

        public b.a(b b1, View view)
        {
            a = b1;
            super(view);
        }
    }


    protected o a;
    private SearchWebViewSwitcher b;
    private SuperRecyclerView c;
    private ProgressBar d;
    private TextView e;
    private Button f;
    private ImageView g;
    private l h;
    private String i;
    private b j;
    private e k;
    private boolean l;
    private Handler m;

    public d()
    {
        m = new a(this);
    }

    static e a(d d1)
    {
        return d1.k;
    }

    private void a()
    {
        b.a(0);
        d.setVisibility(0);
        f.setVisibility(8);
        g.setVisibility(8);
        e.setVisibility(8);
    }

    private void a(android.view.View.OnClickListener onclicklistener)
    {
        b.a(0);
        d.setVisibility(8);
        e.setVisibility(0);
        g.setVisibility(0);
        f.setVisibility(0);
        f.setOnClickListener(onclicklistener);
    }

    static void a(d d1, android.view.View.OnClickListener onclicklistener)
    {
        d1.a(onclicklistener);
    }

    static void a(d d1, String s)
    {
        d1.b(s);
    }

    private static void a(l l1)
    {
        if (l1 != null && l1.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            l1.a(null);
            l1.cancel(true);
        }
    }

    private void a(String s)
    {
        m.removeMessages(0);
        s = m.obtainMessage(0, s);
        m.sendMessageDelayed(s, 50L);
    }

    static b b(d d1)
    {
        return d1.j;
    }

    static void b(d d1, String s)
    {
        d1.d(s);
    }

    private void b(String s)
    {
        bolts.j.a(new Callable(s) {

            final String a;
            final d b;

            public List a()
                throws Exception
            {
                Object obj;
                ArrayList arraylist;
                if (d.c(b))
                {
                    obj = MySuggestionProvider.b;
                } else
                {
                    obj = MySuggestionProvider.a;
                }
                obj = b.getActivity().getContentResolver().query(((android.net.Uri) (obj)), null, null, new String[] {
                    a
                }, null);
                arraylist = new ArrayList();
                if (((Cursor) (obj)).moveToFirst())
                {
                    int i1 = ((Cursor) (obj)).getColumnIndex("suggest_text_1");
                    for (; !((Cursor) (obj)).isAfterLast(); ((Cursor) (obj)).moveToNext())
                    {
                        arraylist.add(((Cursor) (obj)).getString(i1));
                    }

                }
                ((Cursor) (obj)).close();
                return arraylist;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = d.this;
                a = s;
                super();
            }
        }).c(new i() {

            final d a;

            public Object then(j j1)
                throws Exception
            {
                if (((List)j1.e()).isEmpty())
                {
                    throw new com.cardinalblue.android.piccollage.model.k.a("no suggestion result");
                } else
                {
                    com.cardinalblue.android.piccollage.activities.d.b(a).a();
                    com.cardinalblue.android.piccollage.activities.d.b(a).a((Collection)j1.e());
                    com.cardinalblue.android.piccollage.activities.d.b(a).notifyDataSetChanged();
                    return null;
                }
            }

            
            {
                a = d.this;
                super();
            }
        }, k.a).a(new i() {

            final d a;

            public Object then(j j1)
                throws Exception
            {
                if ((j1.c() || j1.d()) && !com.cardinalblue.android.b.k.b(a.getActivity()))
                {
                    com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f07021d, 0);
                    com.cardinalblue.android.piccollage.activities.d.a(a, new android.view.View.OnClickListener(this) {

                        final _cls1 a;

                        public void onClick(View view)
                        {
                            com.cardinalblue.android.piccollage.activities.d.a(a.a).b();
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    com.cardinalblue.android.piccollage.activities.d.a(a).c();
                }
                return null;
            }

            
            {
                a = d.this;
                super();
            }
        }, k.a);
    }

    static String c(d d1, String s)
    {
        d1.i = s;
        return s;
    }

    private void c(String s)
    {
        k.c();
        a();
        a(h);
        com.cardinalblue.android.piccollage.a.b.aa(s);
        h = new l(false, new com.cardinalblue.android.piccollage.controller.a.l.a(s) {

            final String a;
            final d b;

            public void a(CBCollagesResponse cbcollagesresponse)
            {
                if (b.getActivity().isFinishing())
                {
                    return;
                }
                List list = cbcollagesresponse.getPhotos();
                if (list == null || list.size() == 0)
                {
                    com.cardinalblue.android.piccollage.activities.d.b(b, a);
                    return;
                }
                b.a.b(list);
                d.c(b, cbcollagesresponse.getNextPageUrl());
                cbcollagesresponse = d.e(b);
                boolean flag;
                if (!TextUtils.isEmpty(d.d(b)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                cbcollagesresponse.setCanLoadMore(flag);
                d.f(b).a(2);
            }

            public void a(Throwable throwable)
            {
                if (b.getActivity().isFinishing())
                {
                    return;
                }
                if (!com.cardinalblue.android.b.k.b(b.getActivity()))
                {
                    com.cardinalblue.android.b.k.a(b.getActivity(), 0x7f07021d, 0);
                    com.cardinalblue.android.piccollage.activities.d.a(b, new android.view.View.OnClickListener(this) {

                        final _cls4 a;

                        public void onClick(View view)
                        {
                            d.d(a.b, a.a);
                        }

            
            {
                a = _pcls4;
                super();
            }
                    });
                    return;
                } else
                {
                    com.cardinalblue.android.piccollage.activities.d.b(b, a);
                    com.cardinalblue.android.b.k.a(b.getActivity(), 0x7f0700f8, 0);
                    return;
                }
            }

            
            {
                b = d.this;
                a = s;
                super();
            }
        });
        h.execute(new String[] {
            s
        });
    }

    static boolean c(d d1)
    {
        return d1.l;
    }

    static String d(d d1)
    {
        return d1.i;
    }

    static void d(d d1, String s)
    {
        d1.c(s);
    }

    private void d(String s)
    {
        b.a(0);
        d.setVisibility(8);
        f.setVisibility(8);
        g.setVisibility(8);
        e.setVisibility(0);
        s = getResources().getString(0x7f07020c, new Object[] {
            s
        });
        e.setText(s);
    }

    static SuperRecyclerView e(d d1)
    {
        return d1.c;
    }

    static SearchWebViewSwitcher f(d d1)
    {
        return d1.b;
    }

    public void a(int i1, int j1, int k1)
    {
        if (h == null || h.getStatus() == android.os.AsyncTask.Status.FINISHED)
        {
            h = new l(true, new com.cardinalblue.android.piccollage.controller.a.l.a() {

                final d a;

                public void a(CBCollagesResponse cbcollagesresponse)
                {
                    d.e(a).a();
                    List list;
                    if (!a.getActivity().isFinishing())
                    {
                        if ((list = cbcollagesresponse.getPhotos()) != null && list.size() != 0)
                        {
                            a.a.a(list);
                            d.c(a, cbcollagesresponse.getNextPageUrl());
                            cbcollagesresponse = d.e(a);
                            boolean flag;
                            if (!TextUtils.isEmpty(d.d(a)))
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            cbcollagesresponse.setCanLoadMore(flag);
                            return;
                        }
                    }
                }

                public void a(Throwable throwable)
                {
                    d.e(a).a();
                    com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f0700f8, 0);
                }

            
            {
                a = d.this;
                super();
            }
            });
        }
        if (h.getStatus() == android.os.AsyncTask.Status.PENDING)
        {
            h.execute(new String[] {
                i
            });
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        k = (e)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300d4, viewgroup, false);
        b = (SearchWebViewSwitcher)layoutinflater.findViewById(0x7f1000c1);
        d = (ProgressBar)layoutinflater.findViewById(0x7f10019b);
        e = (TextView)layoutinflater.findViewById(0x7f1001ad);
        f = (Button)layoutinflater.findViewById(0x7f1001ae);
        g = (ImageView)layoutinflater.findViewById(0x7f1001ac);
        c = (SuperRecyclerView)layoutinflater.findViewById(0x7f1000d7);
        c.setOnMoreListener(this);
        int i1 = getResources().getInteger(0x7f090025);
        viewgroup = new GridLayoutManager(getActivity(), i1);
        c.setLayoutManager(viewgroup);
        c.a(new com.cardinalblue.android.piccollage.view.j(getResources().getDimensionPixelSize(0x7f0b009d)));
        a = new o(getActivity(), k);
        c.setAdapter(a);
        viewgroup = (SuperRecyclerView)layoutinflater.findViewById(0x7f100216);
        viewgroup.setLayoutManager(new LinearLayoutManager(getActivity()));
        j = new b(getActivity());
        viewgroup.setAdapter(j);
        l = getArguments().getBoolean("is_search_background", false);
        viewgroup = getArguments().getString("keyword", null);
        if (!TextUtils.isEmpty(viewgroup))
        {
            c(viewgroup);
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        a(h);
    }

    public void onDetach()
    {
        super.onDetach();
        k = null;
    }

    public void onQuery(com.cardinalblue.android.piccollage.view.fragments.ah.b b1)
    {
        c(b1.a);
    }

    public void onSearchViewChanged(WebSearchActivity.a a1)
    {
        if (a1.a)
        {
            b.a(1);
        }
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.a().a(this);
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a().b(this);
    }

    public void onSuggestQuery(com.cardinalblue.android.piccollage.view.fragments.ah.c c1)
    {
        a(c1.a);
    }
}
