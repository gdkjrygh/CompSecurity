// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.view.PorcelainCompactCardView;

public final class dqr extends dqx
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private final PorcelainCompactCardView k;

    public dqr(ViewGroup viewgroup, doh doh1)
    {
        super(new PorcelainCompactCardView(viewgroup.getContext()), doh1);
        k = (PorcelainCompactCardView)a;
        k.a(false);
        k.setOnClickListener(this);
        k.setOnLongClickListener(this);
    }

    public final void a(drf drf, doj doj)
    {
        drf = (drb)drf;
        k.a((CharSequence)drf.getText());
        super.j.a.b().a(k.c, drf.getImage(), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.b);
        super.j.a.a().a(drf.getPlayable());
        boolean flag = b(drf.getLink(), drf.getPlayable());
        k.setFocusable(flag);
        k.setClickable(flag);
        doj = k;
        if (drf.getLongClickLink() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        doj.setLongClickable(flag);
    }

    public final void onClick(View view)
    {
        a(((drb)w()).getLink(), ((drb)w()).getPlayable());
    }

    public final boolean onLongClick(View view)
    {
        return a(((drb)w()).getLongClickLink(), null);
    }
}
