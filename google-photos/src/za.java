// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class za
{

    private ArrayList a;

    public za()
    {
    }

    public za(yz yz1)
    {
        if (yz1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        yz.a(yz1);
        if (!yz.b(yz1).isEmpty())
        {
            a = new ArrayList(yz.b(yz1));
        }
    }

    private za a(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("categories must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); a((String)collection.next())) { }
        }
        return this;
    }

    public final yz a()
    {
        if (a == null)
        {
            return yz.c;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", a);
            return new yz(bundle, a);
        }
    }

    public final za a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("category must not be null");
        }
        if (a == null)
        {
            a = new ArrayList();
        }
        if (!a.contains(s))
        {
            a.add(s);
        }
        return this;
    }

    public final za a(yz yz1)
    {
        if (yz1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            a(((Collection) (yz1.a())));
            return this;
        }
    }
}
