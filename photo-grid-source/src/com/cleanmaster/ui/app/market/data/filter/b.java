// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import com.cleanmaster.data.filter.a;
import com.cleanmaster.data.filter.c;
import com.cleanmaster.data.filter.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            c, d, f, h, 
//            g, e, a

public class b
    implements com.cleanmaster.data.filter.b
{

    public static d a = new d();
    public static a b = new a();
    protected int c;
    protected int d;

    public b()
    {
        c = -1;
        d = -1;
    }

    public static com.cleanmaster.data.filter.b a(String s)
    {
        ArrayList arraylist = new ArrayList();
        try
        {
            s = new JSONObject(s);
            a(arraylist, ((b) (com.cleanmaster.ui.app.market.data.filter.c.b(s))));
            a(arraylist, ((b) (com.cleanmaster.ui.app.market.data.filter.d.b(s))));
            a(arraylist, ((b) (f.b(s))));
            a(arraylist, ((b) (h.b(s))));
            a(arraylist, ((b) (g.b(s))));
            a(arraylist, ((b) (com.cleanmaster.ui.app.market.data.filter.e.c(s))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        if (arraylist.isEmpty())
        {
            return a;
        } else
        {
            return a(arraylist);
        }
    }

    private static com.cleanmaster.data.filter.b a(ArrayList arraylist)
    {
        if (arraylist.size() == 1)
        {
            return (com.cleanmaster.data.filter.b)arraylist.get(0);
        }
        c c1 = new c((com.cleanmaster.data.filter.b)arraylist.remove(0), (com.cleanmaster.data.filter.b)arraylist.remove(0));
        Iterator iterator = arraylist.iterator();
        for (arraylist = c1; iterator.hasNext(); arraylist = new c(arraylist, (com.cleanmaster.data.filter.b)iterator.next())) { }
        return arraylist;
    }

    private static void a(ArrayList arraylist, b b1)
    {
        if (b1 != null)
        {
            arraylist.add(b1);
        }
    }

    public b a(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            c = jsonobject.optInt("lt", -1);
            d = jsonobject.optInt("gt", -1);
        }
        return this;
    }

    protected boolean a(int i)
    {
        while (c == -1 || i <= c) 
        {
            return true;
        }
        return false;
    }

    public final boolean a(com.cleanmaster.ui.app.market.data.filter.a a1)
    {
        boolean flag = b(a1);
        if (a1 == null)
        {
            flag = true;
        }
        return flag;
    }

    public volatile boolean a(Object obj)
    {
        return a((com.cleanmaster.ui.app.market.data.filter.a)obj);
    }

    public boolean a(Set set, Collection collection)
    {
        if (set == null || set.isEmpty() || collection == null || collection.isEmpty())
        {
            return false;
        }
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (set.contains((String)collection.next()))
            {
                return true;
            }
        }

        return false;
    }

    protected boolean b(int i)
    {
        while (d == -1 || i >= d) 
        {
            return true;
        }
        return false;
    }

    protected boolean b(com.cleanmaster.ui.app.market.data.filter.a a1)
    {
        return true;
    }

    public String toString()
    {
        return String.format("%s", new Object[] {
            getClass().getSimpleName()
        });
    }

}
