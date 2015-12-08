// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pandora.radio.util:
//            k, f

public static class b
{

    public final String a;
    public final List b;

    public List a(int i)
    {
        ArrayList arraylist = new ArrayList(b.size());
        arraylist.add(new f((new StringBuilder()).append("type").append(i).toString(), a));
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f f1 = (f)iterator.next();
            String s = f1.getValue();
            if (s != null && s.length() > 0)
            {
                arraylist.add(new f((new StringBuilder()).append("type").append(i).append(".").append(f1.getName()).toString(), s));
            }
        } while (true);
        return arraylist;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("eventType \"").append(a).append("\"").append(" : ").append(b.toString());
        return stringbuilder.toString();
    }

    public transient (String s, f af[])
    {
        af = new ArrayList(Arrays.asList(af));
        af.removeAll(Collections.singleton(null));
        af.add(new f("client_timestamp", k.a(System.currentTimeMillis())));
        a = s;
        b = af;
    }
}
