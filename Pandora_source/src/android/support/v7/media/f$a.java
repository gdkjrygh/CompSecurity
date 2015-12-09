// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            f

public static final class a
{

    private ArrayList a;

    public a a(f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            a(((Collection) (f1.a())));
            return this;
        }
    }

    public a a(String s)
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

    public a a(Collection collection)
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

    public f a()
    {
        if (a == null)
        {
            return f.a;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", a);
            return new f(bundle, a, null);
        }
    }

    public ption()
    {
    }

    public ption(f f1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        f.b(f1);
        if (!f.c(f1).isEmpty())
        {
            a = new ArrayList(f.c(f1));
        }
    }
}
