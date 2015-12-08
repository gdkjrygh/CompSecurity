// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour.a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.velour.a:
//            b

public final class c
{

    public final b a;
    private final c b;
    private final Set c;
    private final Set d;

    protected c()
    {
        throw new RuntimeException("b/21354055");
    }

    private void b()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); iterator.next()) { }
        d.clear();
    }

    private void c()
    {
        for (Iterator iterator = (new HashSet(c)).iterator(); iterator.hasNext(); ((c)iterator.next()).a()) { }
        c.clear();
    }

    public final void a()
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj1 = a;
        Object obj = ((b) (obj1)).c;
        obj;
        JVM INSTR monitorenter ;
        String s;
        Exception exception;
        boolean flag;
        if (((b) (obj1)).b.remove(this) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        s = String.valueOf(this);
        obj1 = String.valueOf(obj1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 48 + String.valueOf(obj1).length())).append("Attempted to remove nonexisting dependent ").append(s).append(" from ").append(((String) (obj1))).toString());
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((b) (obj1)).e == 1 && ((b) (obj1)).b.isEmpty())
        {
            ((b) (obj1)).a();
        }
        obj;
        JVM INSTR monitorexit ;
_L2:
        b();
        c();
        if (b != null)
        {
            b.c.remove(this);
        }
        return;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("@").append(Integer.toHexString(System.identityHashCode(this))).append("{jar=").append(a).append("}").toString();
    }
}
