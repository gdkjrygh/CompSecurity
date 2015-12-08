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
import com.pandora.radio.data.h;
import com.pandora.radio.data.i;
import com.pandora.radio.data.y;
import java.util.ArrayList;
import java.util.List;
import p.cm.ao;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;

public class b extends ArrayAdapter
{
    private static class a
    {

        TextView a;
        TextView b;
        TextView c;
        ImageView d;
        View e;

        private a()
        {
        }

    }


    private LayoutInflater a;
    private y b;

    public b(Context context, y y)
    {
        super(context, 0x7f04008c);
        a = LayoutInflater.from(context);
        b = y;
    }

    private f a(View view, int k)
    {
        view = new f(getContext(), view);
        view.a(new com.android.widget.popupmenu.f.b(k) {

            final int a;
            final b b;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                menuitem.getItemId();
                JVM INSTR tableswitch 2131755800 2131755800: default 24
            //                           2131755800 26;
                   goto _L1 _L2
_L1:
                return true;
_L2:
                b.a(b, a);
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                b = b.this;
                a = k;
                super();
            }
        });
        view.a(0x7f120005);
        return view;
    }

    static f a(b b1, View view, int k)
    {
        return b1.a(view, k);
    }

    private void a(int k)
    {
        p.cw.c c1 = com.pandora.android.provider.b.a.b();
        h h1 = (h)getItem(k);
        (new ao(b, h1, this)).execute(new Object[] {
            c1, h1, Integer.valueOf(0)
        });
    }

    private void a(int k, a a1, ViewGroup viewgroup)
    {
        a1.e.setVisibility(0);
        a1.e.setOnClickListener(new android.view.View.OnClickListener(a1, k) {

            final a a;
            final int b;
            final b c;

            public void onClick(View view)
            {
                b.a(c, a.e, b).c();
            }

            
            {
                c = b.this;
                a = a1;
                b = k;
                super();
            }
        });
    }

    static void a(b b1, int k)
    {
        b1.a(k);
    }

    private boolean a(h ah[])
    {
        clear();
        if (ah == null || ah.length <= 0)
        {
            notifyDataSetInvalidated();
            return false;
        } else
        {
            b(ah);
            notifyDataSetChanged();
            return true;
        }
    }

    private String b(int k)
    {
        if (k == 1)
        {
            return getContext().getString(0x7f080279);
        }
        if (k == 2)
        {
            return getContext().getString(0x7f08027b);
        } else
        {
            return null;
        }
    }

    private void b(h ah[])
    {
        int l = ah.length;
        for (int k = 0; k < l; k++)
        {
            add(ah[k]);
        }

    }

    public boolean a(i k)
    {
        h ah[] = null;
        if (k != null)
        {
            ah = b(k);
        }
        return a(ah);
    }

    h[] b(i k)
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        if (k != null)
        {
            h ah[] = k.b;
            if (ah != null && ah.length > 0)
            {
                arraylist.add(new h(com.pandora.radio.data.h.a.b));
                for (int l = 0; l < ah.length; l++)
                {
                    arraylist.add(ah[l]);
                }

            }
            k = k.a;
            if (k != null && k.length > 0)
            {
                arraylist.add(new h(com.pandora.radio.data.h.a.a));
                for (int i1 = ((flag) ? 1 : 0); i1 < k.length; i1++)
                {
                    arraylist.add(k[i1]);
                }

            }
        }
        return (h[])arraylist.toArray(new h[arraylist.size()]);
    }

    public int getItemViewType(int k)
    {
        com.pandora.radio.data.h.a a1 = ((h)getItem(k)).c();
        if (a1 == com.pandora.radio.data.h.a.a)
        {
            return 1;
        }
        return a1 != com.pandora.radio.data.h.a.b ? 0 : 2;
    }

    public View getView(int k, View view, ViewGroup viewgroup)
    {
        Object obj = (h)getItem(k);
        int i1 = getItemViewType(k);
        int l = 0x7f0400a6;
        if (i1 == 1 || i1 == 2)
        {
            l = 0x7f040070;
        }
        a a1;
        if (view == null)
        {
            view = a.inflate(l, null);
            view.setBackgroundResource(0x7f0b00ae);
            a1 = new a();
            if (i1 == 1 || i1 == 2)
            {
                a1.a = (TextView)view.findViewById(0x1020014);
            } else
            {
                a1.b = (TextView)view.findViewById(0x7f1002b0);
                a1.c = (TextView)view.findViewById(0x7f1002b1);
                a1.d = (ImageView)view.findViewById(0x7f1002ae);
            }
            view.setTag(a1);
        } else
        {
            a1 = (a)view.getTag();
        }
        if (i1 == 0)
        {
            a1.c.setVisibility(0);
            if (((h) (obj)).i() == com.pandora.radio.data.m.a.b)
            {
                a1.b.setText(((h) (obj)).g());
                a1.c.setText(((h) (obj)).f());
            } else
            {
                a1.b.setText(((h) (obj)).f());
                a1.c.setVisibility(8);
            }
            obj = ((h) (obj)).h();
            if (obj != null && !((String) (obj)).isEmpty())
            {
                g.b(getContext()).a(((String) (obj))).a(0x7f0200e9).a(a1.d);
            } else
            {
                a1.d.setImageResource(0x7f0200e9);
            }
            a1.e = view.findViewById(0x7f1002af);
            a(k, a1, viewgroup);
            return view;
        } else
        {
            a1.a.setText(b(i1));
            return view;
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }
}
