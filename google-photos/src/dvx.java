// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public final class dvx
    implements dvr
{

    private final dwa a;
    private final List b;
    private final List c;

    public dvx(dwa dwa1, List list, List list1)
    {
        a = dwa1;
        b = list;
        c = list1;
    }

    private static void a(View view, egf egf1, int i, diy diy1)
    {
        view = (ImageView)view.findViewById(i);
        view.setVisibility(0);
        egf1.a(diy1.d, view);
    }

    public final int a()
    {
        if (b == null || b.isEmpty())
        {
            return q.D;
        } else
        {
            return a.a();
        }
    }

    public final void a(dwk dwk1)
    {
        a.a(dwk1);
        if (c == null) goto _L2; else goto _L1
_L1:
        LinearLayout linearlayout;
        egf egf1;
        int i;
        linearlayout = dwk1.p;
        egf1 = (egf)olm.a(linearlayout.getContext(), egf);
        i = 0;
_L7:
        if (i >= c.size() || i >= 4) goto _L2; else goto _L3
_L3:
        Object obj = (dvy)c.get(i);
        ((dvy) (obj)).a;
        JVM INSTR tableswitch 1 3: default 104
    //                   1 113
    //                   2 104
    //                   3 344;
           goto _L4 _L5 _L4 _L6
_L4:
        i++;
          goto _L7
_L5:
        int j = b.kb;
_L8:
        View view;
        List list;
        TextView textview;
        ImageView imageview;
        TextView textview1;
        if (c.size() == 1)
        {
            dwk1.r.setVisibility(8);
            dwk1.q.setVisibility(0);
            view = dwk1.q.getChildAt(0);
        } else
        {
            view = linearlayout.getChildAt(i);
        }
        textview1 = (TextView)view.findViewById(q.H);
        textview = (TextView)view.findViewById(q.q);
        imageview = (ImageView)view.findViewById(q.g);
        list = ((dvy) (obj)).b;
        textview1.setText(((dvy) (obj)).c);
        if (b.a(((dvy) (obj)).d))
        {
            obj = null;
        } else
        {
            obj = ((dvy) (obj)).d[0];
        }
        textview.setText(((CharSequence) (obj)));
        imageview.setImageResource(j);
        view.findViewById(q.j).setVisibility(8);
        view.findViewById(q.l).setVisibility(8);
        view.findViewById(q.h).setVisibility(8);
        view.findViewById(q.k).setVisibility(8);
        view.findViewById(q.m).setVisibility(8);
        view.findViewById(q.i).setVisibility(8);
        if (list.size() == 1)
        {
            a(view, egf1, q.j, (diy)list.get(0));
        } else
        if (list.size() == 2)
        {
            a(view, egf1, q.l, (diy)list.get(0));
            a(view, egf1, q.h, (diy)list.get(1));
        } else
        if (list.size() == 3)
        {
            a(view, egf1, q.k, (diy)list.get(0));
            a(view, egf1, q.m, (diy)list.get(1));
            a(view, egf1, q.h, (diy)list.get(2));
        } else
        if (list.size() > 3)
        {
            a(view, egf1, q.k, (diy)list.get(0));
            a(view, egf1, q.m, (diy)list.get(1));
            Object obj1 = (ImageView)view.findViewById(q.h);
            ((ImageView) (obj1)).setVisibility(0);
            ((ImageView) (obj1)).setImageResource(b.ka);
            obj1 = (TextView)view.findViewById(q.i);
            ((TextView) (obj1)).setVisibility(0);
            ((TextView) (obj1)).setText(Integer.toString(list.size() - 2));
        }
        view.setVisibility(0);
          goto _L4
_L6:
        j = b.kc;
          goto _L8
_L2:
          goto _L4
    }
}
