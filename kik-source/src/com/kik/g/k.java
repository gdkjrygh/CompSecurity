// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kik.g:
//            e, i

public class k
{

    private e a;
    private Object b;

    public k(Object obj)
    {
        b = obj;
        a = new e(b);
    }

    public final e a()
    {
        return a;
    }

    public void a(Object obj)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((e.a)iterator.next()).a.a(b, obj)) { }
    }
}
