// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class omk
{

    private final Context a;
    private final Class b;
    private HashMap c;

    public omk(Context context, Class class1)
    {
        a = context;
        b = class1;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        c = new HashMap();
        iterator = olm.c(a, b).iterator();
_L1:
        List list;
        omj omj1;
        Class class1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        omj1 = (omj)iterator.next();
        class1 = omj1.a();
        list = (List)c.get(class1);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        obj = new ArrayList();
        c.put(class1, obj);
        ((List) (obj)).add(omj1);
          goto _L1
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final List a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        class1 = (List)c.get(class1);
        this;
        JVM INSTR monitorexit ;
        return class1;
        class1;
        throw class1;
    }
}
