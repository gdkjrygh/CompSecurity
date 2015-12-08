// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import com.snapchat.android.app.feature.messaging.feed.ui.fragment.FeedAdapter;
import java.util.List;

public final class qh extends FeedAdapter
    implements OV.a, Filterable
{
    public static interface a
    {

        public abstract void a(List list);
    }


    private final List e;
    private final a f;
    private final LB g;
    private qd h;

    public qh(List list, a a1, LB lb)
    {
        super(list);
        e = list;
        f = a1;
        g = lb;
    }

    public final int a(String s)
    {
        for (int i = 0; i < c.size(); i++)
        {
            if (TextUtils.equals(s, ((pT)c.get(i)).V_()))
            {
                return i;
            }
        }

        return -1;
    }

    public final volatile void a(android.support.v7.widget.RecyclerView.v v, int i)
    {
        a((pY)v, i);
    }

    public final void a(List list)
    {
        if (list == null)
        {
            c = e;
        } else
        {
            c = list;
        }
        f.a(list);
        super.a.b();
    }

    public final void a(pY py, int i)
    {
        py.c(true);
        if (!f(i))
        {
            py.a((pT)c.get(i));
            if (d != null)
            {
                d.a(py);
                return;
            }
        }
    }

    public final Filter getFilter()
    {
        if (h == null)
        {
            h = new qd(c, g, this);
        }
        return h;
    }
}
