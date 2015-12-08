// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v7.media:
//            d, a

public static final class ption
{

    private final Bundle a = new Bundle();
    private ArrayList b;

    public ption a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("route must not be null");
        }
        if (b == null)
        {
            b = new ArrayList();
        } else
        if (b.contains(a1))
        {
            throw new IllegalArgumentException("route descriptor already added");
        }
        b.add(a1);
        return this;
    }

    public b a(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("routes must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); a((a)collection.next())) { }
        }
        return this;
    }

    public d a()
    {
        if (b != null)
        {
            int j = b.size();
            ArrayList arraylist = new ArrayList(j);
            for (int i = 0; i < j; i++)
            {
                arraylist.add(((a)b.get(i)).o());
            }

            a.putParcelableArrayList("routes", arraylist);
        }
        return new d(a, b, null);
    }

    public ption()
    {
    }
}
