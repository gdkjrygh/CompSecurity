// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.porcelain.holder.PorcelainType;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;

public abstract class dqx extends abo
{

    final doh j;
    private drf k;

    public dqx(View view, doh doh1)
    {
        super(view);
        j = (doh)ctz.a(doh1);
    }

    public static View a(int i, ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(i, viewgroup, false);
    }

    public static dqx a(int i, ViewGroup viewgroup, doh doh1)
    {
        return PorcelainType.a(i).a(viewgroup, doh1);
    }

    protected static boolean b(PorcelainNavigationLink porcelainnavigationlink, drz drz1)
    {
        return porcelainnavigationlink != null || drz1 != null && drz1.isPlayable();
    }

    public abstract void a(drf drf1, doj doj);

    protected final boolean a(View view)
    {
        view = ((View) (view.getTag(0x7f1100e8)));
        if (view instanceof PorcelainNavigationLink)
        {
            return a((PorcelainNavigationLink)view, ((drz) (null)));
        }
        if (view instanceof drz)
        {
            return a(((PorcelainNavigationLink) (null)), (drz)view);
        } else
        {
            return false;
        }
    }

    protected final boolean a(PorcelainNavigationLink porcelainnavigationlink, drz drz1)
    {
        drp drp = null;
        if (!b(porcelainnavigationlink, drz1))
        {
            return false;
        }
        int i = d();
        if (porcelainnavigationlink != null)
        {
            j.b.a(porcelainnavigationlink, i, -1);
            drz1 = porcelainnavigationlink.getUri();
            porcelainnavigationlink = com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger.InteractionAction.a;
        } else
        if (drz1 != null && drz1.isPlayable())
        {
            j.b.a(drz1, i);
            drz1 = drz1.getUri();
            porcelainnavigationlink = com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger.InteractionAction.b;
        } else
        {
            drz1 = null;
            porcelainnavigationlink = drp;
        }
        drp = w().getMetricsInfo();
        if (drz1 != null && drp != null)
        {
            j.c.a(drz1, com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger.InteractionType.a, porcelainnavigationlink, drp);
        }
        return drz1 != null;
    }

    public final void b(drf drf1, doj doj)
    {
        try
        {
            k = drf1;
        }
        // Misplaced declaration of an exception variable
        catch (drf drf1)
        {
            doj = new AssertionError("Item mapped to wrong holder");
            doj.initCause(drf1);
            throw doj;
        }
        a(k, doj);
    }

    protected void u()
    {
    }

    public final void v()
    {
        u();
    }

    protected final drf w()
    {
        return (drf)ctz.a(k);
    }
}
