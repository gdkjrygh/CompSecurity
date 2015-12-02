// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.d;

import com.google.common.a.hq;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.d.d:
//            j

public class h extends j
{

    private final String a;
    private List b;

    public h(String s)
    {
        b = hq.a();
        a = s;
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(");
        Iterator iterator = b.iterator();
        for (boolean flag = true; iterator.hasNext(); flag = false)
        {
            j j1 = (j)iterator.next();
            if (!flag)
            {
                stringbuilder.append(" ");
                stringbuilder.append(a);
                stringbuilder.append(" ");
            }
            stringbuilder.append(j1.a());
        }

        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    public void a(j j1)
    {
        b.add(j1);
    }

    public String[] b()
    {
        java.util.ArrayList arraylist = hq.a();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.addAll(Arrays.asList(((j)iterator.next()).b()))) { }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }
}
