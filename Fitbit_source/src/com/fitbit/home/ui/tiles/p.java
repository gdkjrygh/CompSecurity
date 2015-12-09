// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.ui.FlipImageView;
import java.util.Date;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            d, e

public abstract class p extends d
{

    protected int r;
    protected int s;
    protected View t;
    protected e u;
    protected Date v;
    protected TextView w;
    protected FlipImageView x;
    protected ViewGroup y;

    public p()
    {
        r = 0x80000000;
        s = 0x80000000;
    }

    protected abstract boolean N_();

    public void O_()
    {
        u = null;
        if (N_())
        {
            Q_();
            o();
            return;
        } else
        {
            R_();
            q();
            return;
        }
    }

    protected abstract int P_();

    protected void Q_()
    {
    }

    protected abstract void R_();

    public final View a(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(i()).inflate(0x7f0401b1, viewgroup, false);
        x = (FlipImageView)viewgroup.findViewById(0x7f110464);
        w = (TextView)viewgroup.findViewById(0x7f110465);
        y = (ViewGroup)viewgroup.findViewById(0x7f110466);
        LayoutInflater.from(i()).inflate(P_(), y, true);
        a(((View) (viewgroup)));
        return viewgroup;
    }

    protected void a(View view)
    {
    }

    public void a(Date date)
    {
        v = date;
    }

    protected abstract String b();

    public void b(e e1)
    {
        u = e1;
        if (N_())
        {
            Q_();
            o();
            return;
        } else
        {
            R_();
            q();
            return;
        }
    }

    protected abstract int c();

    protected void o()
    {
        w.setText(b());
        x.setImageResource(c());
        x.a();
        w.setVisibility(0);
        y.setVisibility(4);
    }

    protected boolean p()
    {
        return u != null && u.d;
    }

    protected void q()
    {
        w.setVisibility(4);
        y.setVisibility(0);
    }

    protected boolean r()
    {
        return u != null && u.a;
    }
}
