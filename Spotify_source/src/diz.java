// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.AbsListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

public final class diz
    implements android.widget.AbsListView.OnScrollListener, Runnable
{

    android.widget.AbsListView.OnScrollListener a;
    private int b;
    private boolean c;
    private StickyListView d;

    private diz(StickyListView stickylistview)
    {
        d = stickylistview;
        super();
    }

    public diz(StickyListView stickylistview, byte byte0)
    {
        this(stickylistview);
    }

    private void a()
    {
        if (d.b != StickyListView.c(d))
        {
            d.requestLayout();
        }
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (!StickyListView.a(d))
        {
            a();
            StickyListView.b(d);
            if (a != null)
            {
                a.onScroll(abslistview, i, j, k);
                return;
            }
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (!StickyListView.a(d))
        {
            b = i;
            boolean flag1 = c;
            boolean flag;
            if (b != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            a();
            StickyListView.b(d);
            if (a != null)
            {
                a.onScrollStateChanged(abslistview, i);
            }
            if (!flag1 && c)
            {
                km.a(d, this);
                return;
            }
        }
    }

    public final void run()
    {
        if (!StickyListView.a(d))
        {
            a();
            StickyListView.b(d);
            if (c && d.getWindowToken() != null)
            {
                km.a(d, this);
                return;
            }
        }
    }
}
