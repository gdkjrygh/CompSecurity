// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package com.microsoft.advertising.android:
//            p

public static final class  extends WeakHashMap
    implements , Iterable
{

    public final void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        super.put(obj, Boolean.TRUE);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final Iterator iterator()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator1 = (new ArrayList(super.keySet())).iterator();
        this;
        JVM INSTR monitorexit ;
        return iterator1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = super.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public ()
    {
    }
}
