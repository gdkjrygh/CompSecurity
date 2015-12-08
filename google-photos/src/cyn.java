// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class cyn
{

    public List a;
    public int b;
    public Set c;
    public int d;

    public cyn()
    {
        a = new ArrayList();
        b = 0;
        c = new HashSet();
        d = 0;
    }

    public final void a(cyl cyl1)
    {
        a.add(cyl1);
        b = b + cyl1.a.size();
        String s;
        for (Iterator iterator = cyl1.b.U.iterator(); iterator.hasNext(); c.add(s))
        {
            s = (String)iterator.next();
        }

        d = Math.max(d, cyl1.b.S);
    }

    public final String toString()
    {
        Object obj = a.iterator();
        String s;
        Object obj1;
        for (s = ""; ((Iterator) (obj)).hasNext(); s = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj1).length())).append(s).append(((String) (obj1))).append(",").toString())
        {
            obj1 = (cyl)((Iterator) (obj)).next();
            s = String.valueOf(s);
            obj1 = String.valueOf(((cyl) (obj1)).toString());
        }

        obj = String.valueOf(c.toString());
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(obj).length())).append(s).append(": ").append(((String) (obj))).toString();
    }
}
