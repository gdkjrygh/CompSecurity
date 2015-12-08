// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.SpotifyIconView;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.view.PorcelainCompactCardView;
import com.squareup.picasso.Picasso;

public final class dqv extends dqx
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    private final PorcelainCompactCardView k;
    private final Drawable l;

    public dqv(ViewGroup viewgroup, doh doh1)
    {
        super(new PorcelainCompactCardView(viewgroup.getContext(), new dtf(viewgroup.getContext().getResources().getDimensionPixelSize(0x7f0c008d))), doh1);
        k = (PorcelainCompactCardView)a;
        k.a(false);
        k.setOnClickListener(this);
        k.setOnLongClickListener(this);
        l = dgo.a(k.getContext(), 0x7f0101cc);
    }

    protected final void a(drf drf, doj doj1)
    {
        dri dri1 = (dri)drf;
        PorcelainIcon porcelainicon = dri1.getIcon();
        Object obj = k;
        boolean flag;
        if (porcelainicon != null)
        {
            drf = porcelainicon.mIcon;
        } else
        {
            drf = null;
        }
        obj.a = drf;
        if (drf != null)
        {
            ((PorcelainCompactCardView) (obj)).b.a(drf);
            ((PorcelainCompactCardView) (obj)).b.setVisibility(0);
        } else
        {
            ((PorcelainCompactCardView) (obj)).b.setVisibility(8);
        }
        k.a(dri1.getTitle());
        obj = dri1.getBackgroundImageUri();
        if (porcelainicon != null)
        {
            super.j.a.b().a(k.c);
            ((gft)dmz.a(gft)).a().a(((String) (obj))).a(l).a(k.c, null);
        } else
        {
            android.os.Parcelable parcelable = doj1.b.a(dri1);
            drf = parcelable;
            if (!(parcelable instanceof PorcelainImage))
            {
                drf = dpa.a(PorcelainIcon.e);
                drf.a = ((String) (obj));
                drf = drf.a();
                doj1.b.a(dri1, drf);
            }
            drf = (PorcelainImage)drf;
            super.j.a.b().a(k.c, drf, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.ImageSize.c, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate.IconSize.b);
        }
        flag = b(dri1.getLink(), dri1.getPlayable());
        k.setClickable(flag);
        k.setFocusable(flag);
        drf = k;
        if (dri1.getLongClickLink() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        drf.setLongClickable(flag);
    }

    public final void onClick(View view)
    {
        view = (dri)w();
        a(view.getLink(), view.getPlayable());
    }

    public final boolean onLongClick(View view)
    {
        return a(((dri)w()).getLongClickLink(), null);
    }
}
