// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.d.d;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.android.slyce.a.c:
//            aw, bj

public class av
{

    final bj a = new aw(this);

    public av()
    {
    }

    public av a(String s, String s1)
    {
        if (s1 != null && (s1.contains("\n") || s1.contains("\r")))
        {
            throw new IllegalArgumentException("value must not contain a new line or line feed");
        } else
        {
            String s2 = s.toLowerCase();
            a.b(s2, s1);
            ((d)a.get(s2)).a(s);
            return this;
        }
    }

    public bj a()
    {
        return a;
    }

    public String a(String s)
    {
        return a.a(s.toLowerCase());
    }

    public av b(String s)
    {
label0:
        {
            if (s != null)
            {
                s = s.trim().split(":", 2);
                if (s.length != 2)
                {
                    break label0;
                }
                b(s[0].trim(), s[1].trim());
            }
            return this;
        }
        b(s[0].trim(), "");
        return this;
    }

    public av b(String s, String s1)
    {
        String s2 = s.toLowerCase();
        a.a(s2, s1);
        ((d)a.get(s2)).a(s);
        return this;
    }

    public StringBuilder b()
    {
        StringBuilder stringbuilder = new StringBuilder(256);
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            obj = (d)a.get(obj);
            Iterator iterator1 = ((d) (obj)).iterator();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                stringbuilder.append((String)((d) (obj)).a()).append(": ").append(s).append("\r\n");
            }
        }

        stringbuilder.append("\r\n");
        return stringbuilder;
    }

    public List c(String s)
    {
        return (List)a.remove(s.toLowerCase());
    }

    public String d(String s)
    {
        s = c(s.toLowerCase());
        if (s == null || s.size() == 0)
        {
            return null;
        } else
        {
            return (String)s.get(0);
        }
    }

    public String e(String s)
    {
        return b().insert(0, (new StringBuilder()).append(s).append("\r\n").toString()).toString();
    }

    public String toString()
    {
        return b().toString();
    }
}
