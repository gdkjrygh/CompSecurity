// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ci;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.widget.popupmenu.f;
import com.pandora.android.provider.b;
import com.pandora.radio.data.w;
import java.util.Iterator;
import java.util.List;
import p.l.c;
import p.l.g;
import p.l.j;

public class d extends ArrayAdapter
{
    private static class a
    {

        TextView a;
        TextView b;
        ImageView c;
        View d;

        private a()
        {
        }

    }


    private LayoutInflater a;

    public d(Context context)
    {
        super(context, 0x7f040071, 0x1020014);
        a = LayoutInflater.from(context);
    }

    private f a(View view, int i)
    {
        view = new f(getContext(), view);
        view.a(new com.android.widget.popupmenu.f.b(i) {

            final int a;
            final d b;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                w w1 = (w)b.getItem(a);
                if (w1 == null)
                {
                    return true;
                }
                p.cm.j j1 = new p.cm.j();
                p.cw.c c1 = b.a.b();
                String s = w1.b();
                if (w1.i() == com.pandora.radio.data.m.a.a)
                {
                    menuitem = w1.f();
                } else
                {
                    menuitem = w1.g();
                }
                j1.execute(new Object[] {
                    c1, s, menuitem, w1.a()
                });
                return true;
            }

            
            {
                b = d.this;
                a = i;
                super();
            }
        });
        view.a(0x7f120004);
        return view;
    }

    static f a(d d1, View view, int i)
    {
        return d1.a(view, i);
    }

    private void a(int i, a a1, View view)
    {
        if (getCount() == 1)
        {
            a1.d.setVisibility(4);
            a1.d.setOnClickListener(null);
            return;
        } else
        {
            a1.d.setVisibility(0);
            a1.d.setOnClickListener(new android.view.View.OnClickListener(a1, i) {

                final a a;
                final int b;
                final d c;

                public void onClick(View view1)
                {
                    d.a(c, a.d, b).c();
                }

            
            {
                c = d.this;
                a = a1;
                b = i;
                super();
            }
            });
            return;
        }
    }

    private void b(List list)
    {
        for (list = list.iterator(); list.hasNext(); add((w)list.next())) { }
    }

    public boolean a(List list)
    {
        clear();
        if (list == null || list.size() <= 0)
        {
            notifyDataSetInvalidated();
            return false;
        } else
        {
            b(list);
            notifyDataSetChanged();
            return true;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        a a1;
        w w1;
        if (view == null)
        {
            view = a.inflate(0x7f0400a6, null);
            a1 = new a();
            a1.a = (TextView)view.findViewById(0x7f1002b0);
            a1.b = (TextView)view.findViewById(0x7f1002b1);
            a1.c = (ImageView)view.findViewById(0x7f1002ae);
            a1.d = view.findViewById(0x7f1002af);
            view.setTag(a1);
        } else
        {
            a1 = (a)view.getTag();
            a1.b.setVisibility(0);
        }
        w1 = (w)getItem(i);
        if (w1.i() == com.pandora.radio.data.m.a.b)
        {
            a1.a.setText(w1.g());
            a1.b.setText(w1.f());
        } else
        {
            a1.a.setText(w1.f());
            a1.b.setVisibility(8);
        }
        a(i, a1, viewgroup);
        viewgroup = w1.h();
        if (viewgroup != null && !viewgroup.isEmpty())
        {
            g.b(getContext()).a(viewgroup).a(0x7f0200e9).a(a1.c);
            return view;
        } else
        {
            a1.c.setImageResource(0x7f0200e9);
            return view;
        }
    }
}
