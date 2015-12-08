// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.holder.PorcelainCarouselViewHolder;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;

public final class dqn
    implements dpx
{

    private PorcelainCarouselViewHolder b;

    private dqn(PorcelainCarouselViewHolder porcelaincarouselviewholder)
    {
        b = porcelaincarouselviewholder;
        super();
    }

    public dqn(PorcelainCarouselViewHolder porcelaincarouselviewholder, byte byte0)
    {
        this(porcelaincarouselviewholder);
    }

    public final void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
    {
        ((dqx) (b)).j.b.a(porcelainnavigationlink, b.d(), i);
    }

    public final void a(drz drz, int i)
    {
        ((dqx) (b)).j.b.a(drz, b.d());
    }
}
