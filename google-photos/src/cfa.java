// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

final class cfa extends aen
{

    final List c = new ArrayList();
    int d;
    cqa e;
    final cez f;

    cfa(cez cez1)
    {
        f = cez1;
        super();
        d = -1;
    }

    public final int a()
    {
        return c.size();
    }

    public final afn a(ViewGroup viewgroup, int i)
    {
        return new cfb(this, LayoutInflater.from(viewgroup.getContext()).inflate(c.A, viewgroup, false));
    }

    public final void a(afn afn, int i)
    {
        cfb cfb1 = (cfb)afn;
        cqa cqa1 = (cqa)c.get(i);
        cfb1.p.setText(cqa1.b);
        TextView textview;
        boolean flag;
        if (cqa1.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview = cfb1.q;
        if (flag)
        {
            afn = cqa1.a;
        } else
        {
            afn = f.g().getString(c.bL);
        }
        textview.setText(afn);
        if (flag && cqa1.c != null)
        {
            cfb1.s.setText(cqa1.c);
            cfb1.r.setText(" \u2022 ");
        } else
        {
            cfb1.s.setText("");
            cfb1.r.setText("");
        }
        if (cqa1.d.equals(Uri.EMPTY))
        {
            cfb1.t.setVisibility(8);
            cfb1.u.setVisibility(0);
        } else
        {
            aly.a(f).a(cqa1.d).a(cfb1.t);
            cfb1.t.setVisibility(0);
            cfb1.u.setVisibility(8);
        }
        if (i == d)
        {
            cfb1.v.setVisibility(0);
            cfb1.o.setBackgroundColor(f.g().getColor(b.ds));
            return;
        } else
        {
            cfb1.v.setVisibility(8);
            cfb1.o.setBackgroundColor(f.g().getColor(b.dr));
            return;
        }
    }
}
