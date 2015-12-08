// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.diagnostics;

import Cf;
import Ch;
import Cj;
import LA;
import PG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import pi;

public class DiagnosticsView extends RelativeLayout
    implements Observer
{
    static abstract class a extends BaseAdapter
        implements Ch.c
    {

        private final LayoutInflater a;

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = a.inflate(0x7f04005b, viewgroup, false);
            }
            view = (TextView)view1.findViewById(0x7f0d0249);
            viewgroup = (TextView)view1.findViewById(0x7f0d024a);
            Cj cj = (Cj)getItem(i);
            view.setText(cj.j.toString());
            viewgroup.setText(cj.b());
            return view1;
        }

        protected a(LayoutInflater layoutinflater)
        {
            a = layoutinflater;
        }
    }

    final class b extends a
    {

        final LinkedList a = new LinkedList();

        public final void a(Cf cf)
        {
        }

        public final void a(Cj cj)
        {
        }

        public final void a(Cj cj, pi pi)
        {
            a.addFirst(cj);
            if (a.size() > 100)
            {
                a.removeLast();
            }
            notifyDataSetChanged();
        }

        public final int getCount()
        {
            return a.size();
        }

        public final Object getItem(int i)
        {
            return a.get(i);
        }

        public b(LayoutInflater layoutinflater)
        {
            super(layoutinflater);
        }
    }

    final class c extends a
    {

        private final List a = new ArrayList();

        public final void a(Cf cf)
        {
        }

        public final void a(Cj cj)
        {
            a.add(cj);
            notifyDataSetChanged();
        }

        public final void a(Cj cj, pi pi)
        {
            a.remove(cj);
            notifyDataSetChanged();
        }

        public final int getCount()
        {
            return a.size();
        }

        public final Object getItem(int i)
        {
            return a.get(i);
        }

        public c(LayoutInflater layoutinflater)
        {
            super(layoutinflater);
        }
    }

    static final class d
        implements Ch.c
    {

        final Ch.c a[];

        public final void a(Cf cf)
        {
            PG.a(new Runnable(this, cf) {

                private Cf a;
                private d b;

                public final void run()
                {
                    Ch.c ac[] = b.a;
                    int j = ac.length;
                    for (int i = 0; i < j; i++)
                    {
                        ac[i].a(a);
                    }

                }

            
            {
                b = d1;
                a = cf;
                super();
            }
            });
        }

        public final void a(Cj cj)
        {
            PG.a(new Runnable(this, cj) {

                private Cj a;
                private d b;

                public final void run()
                {
                    Ch.c ac[] = b.a;
                    int j = ac.length;
                    for (int i = 0; i < j; i++)
                    {
                        ac[i].a(a);
                    }

                }

            
            {
                b = d1;
                a = cj;
                super();
            }
            });
        }

        public final void a(Cj cj, pi pi)
        {
            PG.a(new Runnable(this, cj, pi) {

                private Cj a;
                private pi b;
                private d c;

                public final void run()
                {
                    Ch.c ac[] = c.a;
                    int j = ac.length;
                    for (int i = 0; i < j; i++)
                    {
                        ac[i].a(a, b);
                    }

                }

            
            {
                c = d1;
                a = cj;
                b = pi;
                super();
            }
            });
        }

        public transient d(Ch.c ac[])
        {
            a = ac;
        }
    }


    public DiagnosticsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, Ch.a(), LA.a());
    }

    public DiagnosticsView(Context context, AttributeSet attributeset, Ch ch, LA la)
    {
        super(context, attributeset);
        if (ReleaseManager.f())
        {
            la.addObserver(this);
            attributeset = (LayoutInflater)context.getSystemService("layout_inflater");
            attributeset.inflate(0x7f04005c, this, true);
            ListView listview = (ListView)findViewById(0x7f0d024c);
            context = new c(attributeset);
            listview.setAdapter(context);
            listview = (ListView)findViewById(0x7f0d024f);
            attributeset = new b(attributeset);
            listview.setAdapter(attributeset);
            ch.c = new d(new Ch.c[] {
                context, attributeset
            });
            ((ViewGroup)findViewById(0x7f0d024d)).setOnClickListener(new android.view.View.OnClickListener(listview) {

                private ListView a;

                public final void onClick(View view)
                {
                    if (a.getVisibility() == 0)
                    {
                        a.setVisibility(8);
                        return;
                    } else
                    {
                        a.setVisibility(0);
                        return;
                    }
                }

            
            {
                a = listview;
                super();
            }
            });
            ((Button)findViewById(0x7f0d024e)).setOnClickListener(new android.view.View.OnClickListener(attributeset) {

                private b a;

                public final void onClick(View view)
                {
                    view = a;
                    ((b) (view)).a.clear();
                    view.notifyDataSetChanged();
                }

            
            {
                a = b1;
                super();
            }
            });
            a(la);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    private void a(LA la)
    {
        if (!la.g())
        {
            setVisibility(8);
            return;
        } else
        {
            setVisibility(0);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public void update(Observable observable, Object obj)
    {
        a((LA)observable);
    }
}
