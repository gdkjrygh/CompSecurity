// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            j

public class b
    implements Serializable, Cloneable
{

    protected String a;
    protected String b;
    protected JSONArray c;
    private final HashMap d = new HashMap();

    protected b(String s)
    {
        a = s;
    }

    private void b(String s, Object obj)
    {
        d.put(s, obj);
    }

    public Object a(String s, Object obj)
    {
        if (d.containsKey(s))
        {
            obj = d.get(s);
        }
        return obj;
    }

    public Set a()
    {
        return d.entrySet();
    }

    public void a(String s, double d1)
    {
        b(s, Double.valueOf(d1));
    }

    public void a(String s, float f)
    {
        b(s, Float.valueOf(f));
    }

    public void a(String s, int i)
    {
        b(s, Integer.valueOf(i));
    }

    public void a(String s, j j1)
    {
        b(s, j1);
    }

    public void a(String s, CharSequence charsequence)
    {
        b(s, charsequence.toString());
    }

    public void a(String s, String s1)
    {
        b(s, s1);
    }

    public void a(String s, Collection collection)
    {
        b(s, collection);
    }

    public void a(String s, boolean flag)
    {
        b(s, Boolean.valueOf(flag));
    }

    public String b()
    {
        return a;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        Object obj;
        Object obj1;
        String s;
        Object obj2;
        obj = new b(a);
        obj.b = b;
        Iterator iterator;
        if (c != null)
        {
            try
            {
                obj.c = new JSONArray(c.toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((JSONException) (obj1)).printStackTrace();
            }
        }
        obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        iterator = d.entrySet().iterator();
_L1:
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_155;
            }
            obj2 = (java.util.Map.Entry)iterator.next();
            s = (String)((java.util.Map.Entry) (obj2)).getKey();
            obj2 = ((java.util.Map.Entry) (obj2)).getValue();
            if (!(obj2 instanceof j))
            {
                break MISSING_BLOCK_LABEL_144;
            }
            ((b) (obj)).b(s, ((j)obj2).clone());
        } while (true);
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        ((b) (obj)).b(s, obj2);
          goto _L1
        obj1;
        JVM INSTR monitorexit ;
        return obj;
    }
}
