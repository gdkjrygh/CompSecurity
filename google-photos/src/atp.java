// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class atp
{

    private final atu a;
    private final atq b;

    public atp(Context context, jw jw)
    {
        this(new atu(context, jw));
    }

    private atp(atu atu1)
    {
        b = new atq();
        a = atu1;
    }

    public final List a(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        class1 = a.b(class1);
        this;
        JVM INSTR monitorexit ;
        return class1;
        class1;
        throw class1;
    }

    public final List a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj2;
        obj2 = obj.getClass();
        obj1 = (atr)b.a.get(obj2);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj1 = null;
_L1:
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        obj1 = Collections.unmodifiableList(a.a(((Class) (obj2))));
        if ((atr)b.a.put(obj2, new atr(((List) (obj1)))) != null)
        {
            obj = String.valueOf(obj2);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 34)).append("Already cached loaders for model: ").append(((String) (obj))).toString());
        }
        break MISSING_BLOCK_LABEL_128;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj1 = ((atr) (obj1)).a;
          goto _L1
        int j;
        j = ((List) (obj1)).size();
        obj2 = new ArrayList(j);
        int i = 0;
_L4:
        if (i >= j) goto _L3; else goto _L2
_L2:
        atm atm1 = (atm)((List) (obj1)).get(i);
        if (atm1.a(obj))
        {
            ((List) (obj2)).add(atm1);
        }
        i++;
          goto _L4
_L3:
        return ((List) (obj2));
    }

    public final void a(Class class1, Class class2, ato ato1)
    {
        this;
        JVM INSTR monitorenter ;
        a.a(class1, class2, ato1);
        b.a();
        this;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    public final void b(Class class1, Class class2, ato ato1)
    {
        this;
        JVM INSTR monitorenter ;
        a.b(class1, class2, ato1);
        b.a();
        this;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    public final void c(Class class1, Class class2, ato ato1)
    {
        this;
        JVM INSTR monitorenter ;
        for (class1 = a.c(class1, class2, ato1).iterator(); class1.hasNext(); ((ato)class1.next()).a()) { }
        break MISSING_BLOCK_LABEL_49;
        class1;
        throw class1;
        b.a();
        this;
        JVM INSTR monitorexit ;
    }
}
