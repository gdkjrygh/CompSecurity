// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ah;

import java.util.HashMap;
import java.util.Map;
import p.ap.g;

// Referenced classes of package p.ah:
//            f, d

public class e
{

    private static final g a = new g();
    private final Map b = new HashMap();

    public e()
    {
    }

    public d a(Class class1, Class class2)
    {
        if (!class1.equals(class2)) goto _L2; else goto _L1
_L1:
        obj = f.b();
_L4:
        return ((d) (obj));
_L2:
        d d1;
        synchronized (a)
        {
            a.a(class1, class2);
            d1 = (d)b.get(a);
        }
        obj = d1;
        if (d1 != null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("No transcoder registered for ").append(class1).append(" and ").append(class2).toString());
        class1;
        obj;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public void a(Class class1, Class class2, d d1)
    {
        b.put(new g(class1, class2), d1);
    }

}
