// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class aye
{

    private final List a = new ArrayList();

    public aye()
    {
    }

    public final anc a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ayf ayf1 = (ayf)iterator.next();
        if (!ayf1.a.isAssignableFrom(class1)) goto _L4; else goto _L3
_L3:
        class1 = ayf1.b;
_L6:
        this;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        class1 = null;
        if (true) goto _L6; else goto _L5
_L5:
        class1;
        throw class1;
    }

    public final void a(Class class1, anc anc)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(new ayf(class1, anc));
        this;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }
}
