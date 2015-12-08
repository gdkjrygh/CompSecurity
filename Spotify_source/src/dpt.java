// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.collection.PorcelainLinearCollection;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import java.util.List;

public final class dpt extends dok
    implements PorcelainLinearCollection
{

    private final List b;
    private final List e;
    private dps f;

    public dpt(List list, List list1)
    {
        this(list, list1, (byte)0);
    }

    private dpt(List list, List list1, byte byte0)
    {
        super(null);
        b = (List)ctz.a(list);
        e = (List)ctz.a(list1);
        f = PorcelainJsonImmutableLinearCollection.EMPTY;
    }

    public final void a(dps dps1)
    {
        f = (dps)ctz.a(dps1);
    }

    public final drf getItem(int i)
    {
        ctz.a(i, getItemCount());
        int j = b.size();
        if (i < j)
        {
            return (drf)b.get(i);
        }
        i -= j;
        j = f.getItemCount();
        if (i < j)
        {
            return f.getItem(i);
        } else
        {
            return (drf)e.get(i - j);
        }
    }

    public final int getItemCount()
    {
        return b.size() + f.getItemCount() + e.size();
    }

    public final Iterable getPlayables()
    {
        return cuv.c(ImmutableList.a((Iterable)c.a(b), f.getPlayables(), (Iterable)c.a(e)));
    }
}
