// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            bi, bc, bd

public final class bb
    implements bi
{
    private static interface a
    {

        public abstract bd a();

        public abstract bd b();
    }

    private static final class b extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private volatile boolean b;
    private volatile int c;
    private bc.c d;
    private List e;
    private final a f;

    private List a(bc.c c1)
    {
        ArrayList arraylist = new ArrayList();
        for (c1 = c1.entrySet().iterator(); c1.hasNext(); arraylist.add(f.a()))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)c1.next();
            entry.getKey();
            entry.getValue();
        }

        return arraylist;
    }

    private Map e()
    {
        if (c != b.b) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (c != b.b)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        Object obj1 = e;
        obj = new LinkedHashMap();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Iterator) (obj1)).next()) { }
        break MISSING_BLOCK_LABEL_66;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        d = new bc.c(this, ((Map) (obj)));
        c = b.c;
        this;
        JVM INSTR monitorexit ;
_L2:
        return Collections.unmodifiableMap(d);
    }

    final List a()
    {
        if (c != b.a) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (c == b.a)
        {
            e = a(d);
            c = b.c;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return Collections.unmodifiableList(e);
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final List b()
    {
        if (c != b.b)
        {
            if (c == b.a)
            {
                e = a(d);
            }
            d = null;
            c = b.b;
        }
        return e;
    }

    final bd c()
    {
        return f.b();
    }

    public final void d()
    {
        if (!b)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof bb))
        {
            return false;
        } else
        {
            obj = (bb)obj;
            return bc.a(e(), ((bb) (obj)).e());
        }
    }

    public final int hashCode()
    {
        return bc.a(e());
    }
}
