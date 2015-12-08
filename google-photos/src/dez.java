// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class dez
{

    private static final String c = dez.getSimpleName();
    public Map a;
    public LinkedList b;
    private final int d;

    public dez(int i)
    {
        a = new HashMap();
        b = new LinkedList();
        d = i;
    }

    private boolean a(String s)
    {
        if (s.equals(b.getLast()))
        {
            return false;
        } else
        {
            b.remove(s);
            b.add(s);
            return true;
        }
    }

    public final Object a(int i)
    {
        String s = (String)b.get(i);
        Object obj = a.get(s);
        if (obj == null)
        {
            obj = c;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "entry not found for key:".concat(s);
            } else
            {
                s = new String("entry not found for key:");
            }
            Log.e(((String) (obj)), s);
            return null;
        } else
        {
            return obj;
        }
    }

    public final Object a(String s, String s1)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return null;
        }
        if (!s1.equals(a(obj)))
        {
            s1 = ((String) (a.remove(s)));
            b.remove(s);
            c.a(b.size(), "least-recently-used list size", a.size(), "should be the same size after drop old version");
            a(s1, null);
            a();
            return null;
        }
        if (a(s))
        {
            c.a(b.size(), "least-recently-used list size", a.size(), "should be the same size after re-order");
            a();
        }
        return obj;
    }

    public abstract String a(Object obj);

    public abstract void a();

    public abstract void a(Object obj, Object obj1);

    public final void a(List list)
    {
        list = list.iterator();
        boolean flag = false;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (a.get(s) != null)
            {
                Object obj = a.remove(s);
                b.remove(s);
                c.a(b.size(), "least-recently-used list size", a.size(), "should be the same size after remove");
                a(obj, null);
                flag = true;
            }
        } while (true);
        if (flag)
        {
            a();
        }
    }

    public final int b()
    {
        return a.size();
    }

    public abstract String b(Object obj);

    public final void c(Object obj)
    {
        String s1 = b(obj);
        if (a.get(s1) == null)
        {
            a.put(s1, obj);
            b.add(s1);
            return;
        } else
        {
            String s = c;
            obj = String.valueOf(obj);
            s1 = String.valueOf(a.get(s1));
            Log.e(s, (new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(s1).length())).append("duplicate entries found:").append(((String) (obj))).append(" : ").append(s1).toString());
            return;
        }
    }

    public final void d(Object obj)
    {
        String s = b(obj);
        if (a.get(s) == null)
        {
            a.put(s, obj);
            b.add(s);
            a();
            return;
        }
        Object obj1 = a.put(s, obj);
        a(s);
        String s1;
        for (; b.size() > d; a(a.remove(s1), null))
        {
            s1 = (String)b.pollFirst();
        }

        c.a(b.size(), "least-recently-used list size", a.size(), "should be the same size after add");
        a(obj1, obj);
        a();
    }

}
