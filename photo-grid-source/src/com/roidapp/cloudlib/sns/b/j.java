// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class j
{

    private static j a;
    private Map b;

    private j()
    {
        b = Collections.synchronizedSortedMap(new TreeMap());
    }

    static j a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/roidapp/cloudlib/sns/b/j;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new j();
        }
        com/roidapp/cloudlib/sns/b/j;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/roidapp/cloudlib/sns/b/j;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final String a(String s)
    {
        return (String)b.get(s);
    }

    final void a(String s, String s1)
    {
        b.put(s, s1);
    }

    final void b()
    {
        b.clear();
    }
}
