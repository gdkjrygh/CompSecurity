// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.AnimatorSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer;

public final class fjn
{

    public com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type a;
    public AbsListView b;
    public ViewGroup c;
    public fjs d;
    private final TooltipContainer e;

    fjn(TooltipContainer tooltipcontainer)
    {
        e = tooltipcontainer;
    }

    public final void a(View view)
    {
        boolean flag1 = true;
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag, "Cannot show tinkerbell without a configuration");
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag, "Tooltip type is not set");
        if (e.c())
        {
            return;
        }
        TooltipContainer tooltipcontainer = e;
        Object obj = d;
        tooltipcontainer.g = Optional.b(obj);
        ((fjs) (obj)).a(new com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer._cls2(tooltipcontainer));
        if (b != null)
        {
            tooltipcontainer = e;
            tooltipcontainer.e = b;
            tooltipcontainer.e.setOnScrollListener(tooltipcontainer.i);
        }
        if (c != null)
        {
            e.f = c;
        }
        tooltipcontainer = e;
        obj = a;
        if (tooltipcontainer.d == obj && tooltipcontainer.c == view && tooltipcontainer.c())
        {
            tooltipcontainer.b(view);
            return;
        }
        tooltipcontainer.d = ((com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type) (obj));
        int i;
        int j;
        int k;
        if (tooltipcontainer.h != null && tooltipcontainer.h.isRunning())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            tooltipcontainer.h.end();
        }
        ctz.a(view);
        i = TooltipContainer.c(view) - TooltipContainer.c(tooltipcontainer);
        j = tooltipcontainer.getMeasuredHeight();
        k = view.getHeight();
        obj = tooltipcontainer.a;
        if (i >= j - i - k)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((fjo) (obj)).b(flag);
        if (!tooltipcontainer.a(view))
        {
            tooltipcontainer.b();
        } else
        {
            view.addOnAttachStateChangeListener(tooltipcontainer.j);
            tooltipcontainer.a.a(false);
            if (tooltipcontainer.g.b())
            {
                fjo fjo1 = tooltipcontainer.a;
                fjs fjs1 = (fjs)tooltipcontainer.g.c();
                fjo1.m = Optional.b(fjs1);
                fjs1.a(LayoutInflater.from(fjo1.getContext()), fjo1.n);
            }
            tooltipcontainer.c = view;
            tooltipcontainer.b = false;
            tooltipcontainer.post(new com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer._cls1(tooltipcontainer));
        }
        tooltipcontainer.a(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.a);
    }
}
