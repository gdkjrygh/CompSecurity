// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.widget.AbsListView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public final class fts
    implements android.widget.AbsListView.OnScrollListener
{

    private int a;
    private int b;
    private int c;
    private final int d;
    private final int e;
    private final jw f;
    private final jw g;
    private ftu h;
    private ftt i;
    private Queue j;
    private boolean k;

    public fts(int l, int i1, ftu ftu1, ftt ftt1)
    {
        a = -1;
        j = new LinkedBlockingQueue();
        k = false;
        d = l;
        e = i1;
        h = ftu1;
        i = ftt1;
        f = nwk.a();
        g = nwk.a();
    }

    public fts(int l, ftu ftu1, ftt ftt1)
    {
        this(l, l + 1, ftu1, ftt1);
    }

    public final void a()
    {
        List list;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); f.a(list))
        {
            list = (List)iterator.next();
            i.a(list);
        }

        j.clear();
    }

    public final void onScroll(AbsListView abslistview, int l, int i1, int j1)
    {
        boolean flag = k;
        j1 = -1;
        if (l > c)
        {
            k = true;
            i1 = l + i1;
        } else
        {
            i1 = j1;
            if (l < c)
            {
                k = false;
                i1 = l;
            }
        }
        if (flag != k)
        {
            a();
        }
        if (i1 != -1)
        {
            boolean flag1 = k;
            int k1;
            if (flag1)
            {
                k1 = Math.min(h.a(), Math.max(i1, a));
                j1 = Math.min(h.a(), d + i1);
            } else
            {
                k1 = Math.max(0, i1 - d);
                j1 = Math.min(h.a(), Math.min(i1, b));
            }
            if (Log.isLoggable("Preloader", 2))
            {
                (new StringBuilder(76)).append("preload first=").append(i1).append(" increasing=").append(flag1).append(" start=").append(k1).append(" end=").append(j1);
            }
            if (k1 > j1)
            {
                if (Log.isLoggable("Preloader", 5))
                {
                    abslistview = String.valueOf("Start is > end in preloader. The visible item count may have decreased, start: ");
                    int l1 = a;
                    int i2 = b;
                    int j2 = d;
                    int k2 = h.a();
                    Log.w("Preloader", (new StringBuilder(String.valueOf(abslistview).length() + 173)).append(abslistview).append(k1).append(", end: ").append(j1).append(", first: ").append(i1).append(", increasing: ").append(flag1).append(", lastEnd: ").append(l1).append(", lastStart: ").append(i2).append(", loadAheadItems: ").append(j2).append(", itemSourceCount: ").append(k2).toString());
                }
            } else
            {
                a = j1;
                b = k1;
                if ((k1 != 0 || j1 != 0) && (k1 != h.a() || j1 != h.a()))
                {
                    abslistview = (List)g.a();
                    h.a(k1, j1, abslistview);
                    if (abslistview.isEmpty())
                    {
                        g.a(abslistview);
                    } else
                    {
                        if (!flag1)
                        {
                            Collections.reverse(abslistview);
                        }
                        List list = (List)f.a();
                        i.a(abslistview, list);
                        g.a(abslistview);
                        j.offer(list);
                        if (j.size() > e)
                        {
                            abslistview = (List)j.poll();
                            i.a(abslistview);
                            f.a(abslistview);
                        }
                    }
                }
            }
        }
        c = l;
    }

    public final void onScrollStateChanged(AbsListView abslistview, int l)
    {
    }
}
