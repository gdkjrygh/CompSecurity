// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.artist.ArtistMessageTrackView;
import com.pandora.android.provider.b;
import com.pandora.android.util.ag;
import com.pandora.android.view.AudioAdViewPhone;
import com.pandora.android.view.NowPlayingView;
import com.pandora.android.view.TrackView;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import p.bt.a;
import p.bz.x;
import p.cn.e;

public class o extends ag
{
    public static interface a
    {

        public abstract void a(TrackView trackview);
    }

    public static interface b
    {

        public abstract void a(float f1);

        public abstract void ad();

        public abstract void r();

        public abstract void v();
    }


    protected e a;
    private a f;
    private b g;
    private String h;
    private final com.pandora.android.coachmark.e i;

    public o(Context context, e e1, String s, com.pandora.android.coachmark.e e2)
    {
        super(context);
        a = null;
        g();
        a = e1;
        h = s;
        i = e2;
        com.pandora.android.provider.b.a.e().c(this);
    }

    private void g()
    {
        c();
    }

    public int a(Object obj)
    {
        obj = ((NowPlayingView)obj).getTrackKey();
        int j = a.c(((String) (obj)));
        if (j >= 0)
        {
            return j;
        } else
        {
            return -2;
        }
    }

    public View a(int j)
    {
        int k = b(j);
        NowPlayingView nowplayingview = (NowPlayingView)b.a(j, k);
        if (nowplayingview != null)
        {
            aa aa1 = a.a(j);
            String s = a.b(aa1.w(), j);
            if (!aa1.equals(nowplayingview.getTrackData()))
            {
                nowplayingview.a(aa1, s, h);
            }
            return nowplayingview;
        }
        nowplayingview = (NowPlayingView)b.b(j, k);
        if (nowplayingview != null)
        {
            aa aa2 = a.a(j);
            nowplayingview.a(aa2, a.b(aa2.w(), j), h);
            return nowplayingview;
        } else
        {
            return null;
        }
    }

    protected View a(int j, View view)
    {
        aa aa1 = a.a(j);
        String s1 = a.b(aa1.w(), j);
        String s;
        if (j == 0)
        {
            s = h;
        } else
        {
            s = null;
        }
        h = null;
        if (view != null)
        {
            ((NowPlayingView)view).a(aa1, s1, s);
            return view;
        } else
        {
            return TrackView.a(c, aa1, s1, f, g, s, i);
        }
    }

    public void a(ViewGroup viewgroup, int j, Object obj)
    {
        ((NowPlayingView)obj).b();
        super.a(viewgroup, j, obj);
    }

    public void a(a a1)
    {
        f = a1;
    }

    public void a(b b1)
    {
        g = b1;
    }

    public void a(String s)
    {
        h = s;
    }

    public int b()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.d();
        }
    }

    public int b(int j)
    {
        if (j >= 0 && a.a(j) != null)
        {
            return a.a(j).l().ordinal();
        } else
        {
            return -1;
        }
    }

    public void b(ViewGroup viewgroup, int j, Object obj)
    {
        View view = d;
        super.b(viewgroup, j, obj);
        if (view != d)
        {
            if (view != null)
            {
                view.setSelected(false);
            }
            if (d != null)
            {
                d.setSelected(true);
            }
        }
    }

    public int c(View view)
    {
        if (view instanceof ArtistMessageTrackView)
        {
            return ac.c.ordinal();
        }
        if (view instanceof AudioAdViewPhone)
        {
            return ac.b.ordinal();
        }
        if (view instanceof TrackView)
        {
            return ac.a.ordinal();
        } else
        {
            return -1;
        }
    }

    public int d()
    {
        return ac.values().length;
    }

    public View e()
    {
        return d;
    }

    public void f()
    {
        com.pandora.android.provider.b.a.e().b(this);
    }

    public void onTrackHistoryEvent(x x)
    {
        c();
    }
}
