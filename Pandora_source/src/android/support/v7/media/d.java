// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            a

public final class d
{
    public static final class a
    {

        private final Bundle a = new Bundle();
        private ArrayList b;

        public a a(android.support.v7.media.a a1)
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

        public a a(Collection collection)
        {
            if (collection == null)
            {
                throw new IllegalArgumentException("routes must not be null");
            }
            if (!collection.isEmpty())
            {
                for (collection = collection.iterator(); collection.hasNext(); a((android.support.v7.media.a)collection.next())) { }
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
                    arraylist.add(((android.support.v7.media.a)b.get(i)).o());
                }

                a.putParcelableArrayList("routes", arraylist);
            }
            return new d(a, b);
        }

        public a()
        {
        }
    }


    private final Bundle a;
    private List b;

    private d(Bundle bundle, List list)
    {
        a = bundle;
        b = list;
    }


    public static d a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new d(bundle, null);
        } else
        {
            return null;
        }
    }

    private void d()
    {
        if (b == null)
        {
            ArrayList arraylist = a.getParcelableArrayList("routes");
            if (arraylist == null || arraylist.isEmpty())
            {
                b = Collections.emptyList();
            } else
            {
                int j = arraylist.size();
                b = new ArrayList(j);
                int i = 0;
                while (i < j) 
                {
                    b.add(android.support.v7.media.a.a((Bundle)arraylist.get(i)));
                    i++;
                }
            }
        }
    }

    public List a()
    {
        d();
        return b;
    }

    public boolean b()
    {
        d();
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            android.support.v7.media.a a1 = (android.support.v7.media.a)b.get(i);
            if (a1 == null || !a1.n())
            {
                return false;
            }
        }

        return true;
    }

    public Bundle c()
    {
        return a;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteProviderDescriptor{ ");
        stringbuilder.append("routes=").append(Arrays.toString(a().toArray()));
        stringbuilder.append(", isValid=").append(b());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
