// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;

public final class dql extends dqx
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private final CardView k;
    private final TextView l;
    private final TextView m;

    public dql(ViewGroup viewgroup, doh doh1)
    {
        super(a(0x7f03011c, viewgroup), doh1);
        k = (CardView)ctz.a(a.findViewById(0x7f11049e));
        l = (TextView)ctz.a(a.findViewById(0x7f11026e));
        m = (TextView)ctz.a(a.findViewById(0x7f1102a3));
        a.setOnClickListener(this);
        a.setOnLongClickListener(this);
        int i = viewgroup.getResources().getInteger(0x7f0e0001);
        ((LinearLayout)a).setWeightSum(i);
        ((android.widget.LinearLayout.LayoutParams)a.findViewById(0x7f1102a2).getLayoutParams()).weight = i - 1;
        ((android.widget.LinearLayout.LayoutParams)k.getLayoutParams()).weight = 1.0F;
    }

    protected final void a(drf drf, doj doj)
    {
        boolean flag = false;
        drf = (dra)drf;
        k.a();
        super.j.a.b().a(k.b(), drf.getImage(), com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.b);
        l.setText(drf.getTitle());
        doj = drf.getCaption();
        boolean flag1;
        if (doj != null)
        {
            k.a(doj);
        } else
        {
            k.c();
        }
        doj = drf.getDescription();
        if (doj != null)
        {
            m.setText(doj);
            m.setVisibility(0);
        } else
        {
            m.setVisibility(8);
        }
        flag1 = b(drf.getLink(), drf.getPlayable());
        a.setClickable(flag1);
        a.setFocusable(flag1);
        doj = a;
        if (drf.getLongClickLink() != null)
        {
            flag = true;
        }
        doj.setLongClickable(flag);
    }

    public final void onClick(View view)
    {
        a(((dra)w()).getLink(), ((dra)w()).getPlayable());
    }

    public final boolean onLongClick(View view)
    {
        return a(((dra)w()).getLongClickLink(), null);
    }
}
