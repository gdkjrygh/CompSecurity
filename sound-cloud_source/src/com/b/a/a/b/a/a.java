// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.b.a;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public final class a
    implements com.b.a.a.b.a
{

    private final com.b.a.a.b.a a;
    private final Comparator b;

    public a(com.b.a.a.b.a a1, Comparator comparator)
    {
        a = a1;
        b = comparator;
    }

    private boolean a(String s, Bitmap bitmap)
    {
        com.b.a.a.b.a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        Iterator iterator = a.a().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s1 = (String)iterator.next();
        if (b.compare(s, s1) != 0) goto _L4; else goto _L3
_L3:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        a.b(s1);
        a1;
        JVM INSTR monitorexit ;
        return a.a(s, bitmap);
        s;
        a1;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        s1 = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final volatile Object a(Object obj)
    {
        obj = (String)obj;
        return (Bitmap)a.a(obj);
    }

    public final Collection a()
    {
        return a.a();
    }

    public final volatile boolean a(Object obj, Object obj1)
    {
        return a((String)obj, (Bitmap)obj1);
    }

    public final volatile void b(Object obj)
    {
        obj = (String)obj;
        a.b(obj);
    }
}
