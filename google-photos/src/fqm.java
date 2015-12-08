// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.TextView;

public final class fqm extends afn
{

    long o;
    private final TextView p;
    private final ViewStub q;
    private final nug r = new fqo(this);
    private final nug s = new fqp(this);
    private final android.widget.CompoundButton.OnCheckedChangeListener t = new fqr(this);
    private final hyy u;
    private final hzh v;
    private final ViewStub w;
    private CheckBox x;
    private boolean y;
    private fra z;

    public fqm(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.qa, viewgroup, false));
        p = (TextView)a.findViewById(au.p);
        q = (ViewStub)a.findViewById(au.c);
        w = (ViewStub)a.findViewById(au.f);
        viewgroup = viewgroup.getContext();
        u = (hyy)olm.a(viewgroup, hyy);
        v = (hzh)olm.a(viewgroup, hzh);
        z = (fra)olm.b(viewgroup, fra);
        a.setOnLongClickListener(new fqn(this));
        a.addOnAttachStateChangeListener(new fqq(this));
        p.setOnClickListener(new fqs(this));
        p.setOnLongClickListener(new fqt(this));
    }

    public static int a(Context context)
    {
        return context.getResources().getDimensionPixelSize(c.de);
    }

    static TextView a(fqm fqm1)
    {
        return fqm1.p;
    }

    static void a(fqm fqm1, boolean flag)
    {
        if (fqm1.x != null || flag)
        {
            CheckBox checkbox = fqm1.t();
            int k;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            checkbox.setVisibility(k);
            olm.a(fqm1.t().getContext(), dfo);
            dfo.a(fqm1.t(), fqm1.o);
            if (!flag)
            {
                fqm1.t().setChecked(false);
            }
        }
    }

    static boolean a(fqm fqm1, View view)
    {
        view = (fqv)olm.b(view.getContext(), fqv);
        if (view != null)
        {
            boolean flag;
            if (!fqm1.t().isChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (view.a(flag, fqm1.o))
            {
                fqm1.t().setChecked(flag);
                return true;
            }
        }
        return false;
    }

    static fra b(fqm fqm1)
    {
        return fqm1.z;
    }

    static boolean b(fqm fqm1, boolean flag)
    {
        fqm1.y = flag;
        return flag;
    }

    static ViewStub c(fqm fqm1)
    {
        return fqm1.w;
    }

    static hyy d(fqm fqm1)
    {
        return fqm1.u;
    }

    static long e(fqm fqm1)
    {
        return fqm1.o;
    }

    static CheckBox f(fqm fqm1)
    {
        return fqm1.t();
    }

    static nug g(fqm fqm1)
    {
        return fqm1.r;
    }

    static boolean h(fqm fqm1)
    {
        return fqm1.y;
    }

    static nug i(fqm fqm1)
    {
        return fqm1.s;
    }

    static hzh j(fqm fqm1)
    {
        return fqm1.v;
    }

    private CheckBox t()
    {
        if (x == null)
        {
            x = (CheckBox)q.inflate();
            x.setOnCheckedChangeListener(t);
            x.addOnAttachStateChangeListener(new fqu(this));
            olm.a(x.getContext(), dfo);
            dfo.a(x, o);
            y = true;
            ((hzh)olm.a(x.getContext(), hzh)).a.a(s, true);
            y = false;
        }
        return x;
    }
}
