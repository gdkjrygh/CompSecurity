// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

public final class ipu extends am
{

    public View a;
    private View ad;
    public Animation b;
    private ioj c[];
    private ioj d;
    private boolean e;
    private int f;
    private Intent g;
    private View h;

    public ipu()
    {
        e = false;
        f = 0;
    }

    private void a(ioj ioj1, int i, int j)
    {
        if (super.r != null)
        {
            f = j;
            g = new Intent();
            g.putExtra("stories_edit_type", i);
            if (i == 1 || i == 3)
            {
                g.putExtra("stories_edit_place", ioj1);
                return;
            }
        }
    }

    static void a(ipu ipu1, View view, int i)
    {
        view = (ioj)view.getTag(s.bW);
        if (i == 3)
        {
            view = ipu1.d;
        }
        if (i == 2 || i == 3 || !view.equals(ipu1.d))
        {
            ipu1.a(((ioj) (view)), i, -1);
            return;
        } else
        {
            ipu1.a(((ioj) (view)), i, 0);
            return;
        }
    }

    static boolean a(ipu ipu1)
    {
        return ipu1.e;
    }

    static boolean a(ipu ipu1, boolean flag)
    {
        ipu1.e = true;
        return true;
    }

    static Animation b(ipu ipu1)
    {
        return ipu1.b;
    }

    static View c(ipu ipu1)
    {
        return ipu1.a;
    }

    static View d(ipu ipu1)
    {
        return ipu1.h;
    }

    static int e(ipu ipu1)
    {
        return ipu1.f;
    }

    static Intent f(ipu ipu1)
    {
        return ipu1.g;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.q.getParcelableArray("stories_edit_place");
        c = new ioj[viewgroup.length];
        for (int i = 0; i < viewgroup.length; i++)
        {
            c[i] = (ioj)viewgroup[i];
        }

        d = (ioj)super.q.getParcelable("stories_current_place");
        h = layoutinflater.inflate(b.AK, null);
        layoutinflater = h.findViewById(s.bv);
        viewgroup = (ListView)layoutinflater.findViewById(s.aR);
        viewgroup.setAdapter(new ipz(c, O_()));
        viewgroup.setOnItemClickListener(new ipv(this));
        layoutinflater.findViewById(s.aN).setOnClickListener(new ipw(this));
        b = AnimationUtils.loadAnimation(O_(), s.aJ);
        b.setInterpolator(O_(), s.aD);
        b.setDuration(250L);
        b.setAnimationListener(new ipx(this));
        a = layoutinflater;
        h.setVisibility(0);
        ad = h.findViewById(s.bt);
        ad.setVisibility(0);
        ad.setOnTouchListener(new ipy(this));
        if (bundle == null)
        {
            layoutinflater = AnimationUtils.loadAnimation(O_(), s.aK);
            layoutinflater.setInterpolator(O_(), s.aE);
            layoutinflater.setDuration(250L);
            a.startAnimation(layoutinflater);
        }
        return h;
    }
}
