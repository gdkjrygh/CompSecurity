// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.squareup.picasso.Picasso;

public final class eut extends euw
{

    public eut(ViewGroup viewgroup, euk euk, eun eun)
    {
        super(viewgroup, 0x7f030147, euk, eun);
    }

    protected final Drawable a(MomentContext momentcontext)
    {
        return dff.l(m);
    }

    public final void a(MomentContext momentcontext, int i)
    {
        super.a(momentcontext, i);
        Object obj = m.getResources();
        Picasso picasso;
        if (momentcontext.uri.contains(":artist"))
        {
            i = 0x7f0c0029;
        } else
        {
            i = 0x7f0c002a;
        }
        i = ((Resources) (obj)).getDimensionPixelSize(i);
        obj = k.getLayoutParams();
        obj.width = i;
        obj.height = i;
        picasso = ((gft)dmz.a(gft)).a();
        picasso.a(k);
        obj = picasso.a(a(momentcontext.imageUri)).a(dff.l(m)).b(((android.view.ViewGroup.LayoutParams) (obj)).width, ((android.view.ViewGroup.LayoutParams) (obj)).height).b();
        c(0x7f020075);
        if (momentcontext.uri.contains(":artist"))
        {
            k.setBackgroundResource(0x7f020066);
            ((gwb) (obj)).a(gft.a(k, dfo.a()));
            return;
        } else
        {
            k.setBackgroundResource(0x7f020067);
            ((gwb) (obj)).a(k, null);
            return;
        }
    }

    public final volatile void a(Object obj, int i)
    {
        a((MomentContext)obj, i);
    }

    public final void c(int i)
    {
        a.findViewById(0x7f1104e0).setBackgroundResource(i);
    }
}
