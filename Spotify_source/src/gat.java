// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.spotify.mobile.android.util.Assertion;
import java.util.List;

public final class gat
{

    Context a;
    gav b;
    ftg c;
    fto d;
    gdj e;
    PopupWindow f;
    private ListView g;
    private final android.widget.AdapterView.OnItemClickListener h = new android.widget.AdapterView.OnItemClickListener() {

        private gat a;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            boolean flag2 = true;
            int j;
            boolean flag;
            if (i < a.c.getCount())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertion.a(flag, "position is outside adapter length");
            j = a.c.b(i);
            if (j != 0x80000000)
            {
                i = a.c.a(i, j);
                switch (j)
                {
                default:
                    Assertion.a((new StringBuilder("ID ")).append(l).append("is unknown.").toString());
                    return;

                case 0: // '\0'
                    ((gdk)a.e.getItem(i)).a(a.a);
                    a.f.dismiss();
                    a.e.notifyDataSetChanged();
                    return;

                case 1: // '\001'
                    adapterview = (gfp)a.d.getItem(i);
                    break;
                }
                if (a.d.a == i)
                {
                    if (((gfp) (adapterview)).c)
                    {
                        boolean flag1;
                        if (!adapterview.b())
                        {
                            flag1 = flag2;
                        } else
                        {
                            flag1 = false;
                        }
                        adapterview.a(flag1);
                    }
                } else
                {
                    adapterview.a(false);
                }
                if (a.b != null)
                {
                    a.b.a(adapterview);
                }
                a.f.dismiss();
                adapterview = a.d;
                if (((fto) (adapterview)).a != i)
                {
                    adapterview.a = i;
                    adapterview.notifyDataSetChanged();
                    return;
                }
            }
        }

            
            {
                a = gat.this;
                super();
            }
    };

    public gat(Context context, LayoutInflater layoutinflater, gav gav)
    {
        a = context;
        b = gav;
        layoutinflater = layoutinflater.inflate(0x7f0300d1, null);
        f = new PopupWindow(layoutinflater, context.getResources().getDimensionPixelSize(0x7f0c0027), -2);
        f.setOutsideTouchable(true);
        f.setFocusable(true);
        f.setBackgroundDrawable(new BitmapDrawable(context.getResources(), null));
        g = (ListView)layoutinflater.findViewById(0x102000a);
        g.setOnItemClickListener(h);
        c = new ftg(context);
        c.e = new gau(this, context);
    }

    public final void a(View view)
    {
        f.showAsDropDown(view);
    }

    public final void a(List list)
    {
        Assertion.a(list, "We need a non-null filterOptions list");
        if (!list.isEmpty())
        {
            e = new gdj(a, list);
            c.a(e, 0x7f0802c7, 0);
            c.b(new int[] {
                0
            });
            g.setAdapter(c);
        }
    }

    public final void a(List list, gfp gfp1)
    {
        Assertion.a(list, "We need a non-null sortOptions list");
        Assertion.b(list.isEmpty(), "sortOptions must contain at least one item each.");
        int i = list.indexOf(gfp1);
        ((gfp)list.get(i)).a(gfp1.b());
        d = new fto(a, list, i);
        c.a(d, 0x7f0802c8, 1);
        c.b(new int[] {
            1
        });
        g.setAdapter(c);
    }

    public final void dismiss()
    {
        if (f.isShowing())
        {
            f.dismiss();
        }
    }
}
