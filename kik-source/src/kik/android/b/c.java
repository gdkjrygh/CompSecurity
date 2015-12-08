// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.b.a.b;
import com.kik.g.as;
import com.kik.n.a.c.a;
import com.kik.n.a.c.e;
import com.kik.n.a.c.g;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package kik.android.b:
//            a

final class c
    implements as
{

    final kik.android.b.a a;

    c(kik.android.b.a a1)
    {
        a = a1;
        super();
    }

    public final Object a(Object obj)
    {
        e e1;
        a.a a1;
        e1 = (e)obj;
        if (e1 == null)
        {
            return null;
        }
        a1 = new a.a((byte)0);
        Object obj1 = e1.g();
        if (e1.h() == null)
        {
            obj = e1.b();
        } else
        {
            obj = e1.h();
        }
        a1.c = ((String) (obj));
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj1)).iterator();
_L4:
        if (((Iterator) (obj)).hasNext())
        {
            obj1 = (g)((Iterator) (obj)).next();
            switch (kik.android.b.a._cls1.a[((g) (obj1)).c().ordinal()])
            {
            case 1: // '\001'
                a1.b = true;
                break;

            case 2: // '\002'
                a1.a = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (e1.f() != null)
        {
            if (e1.f().d() != null)
            {
                a1.d = e1.f().d().c();
            }
            if (e1.f().c() != null)
            {
                a1.e = e1.f().c().c();
            }
        }
        return a1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
