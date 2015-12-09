// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.ads.sponsorship.SponsoredHeaderView;

public final class efl extends jz
{

    private SponsoredHeaderView b;

    private efl(SponsoredHeaderView sponsoredheaderview)
    {
        b = sponsoredheaderview;
        super();
    }

    public efl(SponsoredHeaderView sponsoredheaderview, byte byte0)
    {
        this(sponsoredheaderview);
    }

    public final int a(Object obj)
    {
        if (obj.equals(SponsoredHeaderView.l(b)))
        {
            return -1;
        } else
        {
            return super.a(obj) + 1;
        }
    }

    public final Parcelable a()
    {
        if (SponsoredHeaderView.k(b) != null)
        {
            return SponsoredHeaderView.k(b).a();
        } else
        {
            return null;
        }
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        if (i == 0)
        {
            viewgroup.addView(SponsoredHeaderView.l(b));
            return SponsoredHeaderView.l(b);
        } else
        {
            return SponsoredHeaderView.k(b).a(viewgroup, i - 1);
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        if (SponsoredHeaderView.k(b) != null)
        {
            SponsoredHeaderView.k(b).a(viewgroup);
        }
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        if (i == 0)
        {
            viewgroup.removeView(SponsoredHeaderView.l(b));
            return;
        } else
        {
            SponsoredHeaderView.k(b).a(viewgroup, i - 1, obj);
            return;
        }
    }

    public final boolean a(View view, Object obj)
    {
        if (obj == SponsoredHeaderView.l(b))
        {
            return view == SponsoredHeaderView.l(b);
        } else
        {
            return SponsoredHeaderView.k(b).a(view, obj);
        }
    }

    public final int b()
    {
        if (SponsoredHeaderView.k(b) != null)
        {
            return SponsoredHeaderView.k(b).b() + 1;
        } else
        {
            return 1;
        }
    }

    public final CharSequence b(int i)
    {
        if (i == 0)
        {
            return super.b(0);
        } else
        {
            return SponsoredHeaderView.k(b).b(i - 1);
        }
    }

    public final void b(ViewGroup viewgroup, int i, Object obj)
    {
        if (SponsoredHeaderView.k(b) != null)
        {
            SponsoredHeaderView.k(b).b(viewgroup, i, obj);
        }
    }

    public final float c(int i)
    {
        if (i == 0)
        {
            return super.c(0);
        } else
        {
            return SponsoredHeaderView.k(b).c(i - 1);
        }
    }
}
