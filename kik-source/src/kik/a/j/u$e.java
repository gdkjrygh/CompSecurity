// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.as;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kik.a.d.ab;
import kik.a.f.f.ap;
import kik.a.f.f.z;

// Referenced classes of package kik.a.j:
//            u

private static final class <init>
    implements as
{

    public final Object a(Object obj)
    {
        Object obj1 = ((ap)(z)obj).d();
        obj = new HashMap();
        ab ab1;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((HashMap) (obj)).put(ab1.b(), ab1))
        {
            ab1 = (ab)((Iterator) (obj1)).next();
        }

        return obj;
    }

    private ject()
    {
    }

    ject(byte byte0)
    {
        this();
    }
}
