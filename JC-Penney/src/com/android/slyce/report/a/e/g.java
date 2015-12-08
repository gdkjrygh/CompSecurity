// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.e;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.android.slyce.report.a.e:
//            c

public class g
    implements c
{

    private byte a[];
    private TreeMap b;

    public g()
    {
        b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public void a(String s, String s1)
    {
        b.put(s, s1);
    }

    public void a(byte abyte0[])
    {
        a = abyte0;
    }

    public String b(String s)
    {
        String s1 = (String)b.get(s);
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return s;
    }

    public Iterator b()
    {
        return Collections.unmodifiableSet(b.keySet()).iterator();
    }

    public boolean c(String s)
    {
        return b.containsKey(s);
    }

    public byte[] c()
    {
        return a;
    }
}
