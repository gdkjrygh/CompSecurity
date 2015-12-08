// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.as;
import com.kik.n.a.b.c;
import com.kik.n.a.b.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package kik.android.b:
//            s

final class aa
    implements as
{

    final String a;
    final boolean b = true;
    final s c;

    aa(s s, String s1)
    {
        c = s;
        a = s1;
        super();
    }

    public final Object a(Object obj)
    {
        Object obj1;
        Iterator iterator;
        obj = (c)obj;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = (new c()).a(a);
        }
        if (((c) (obj1)).b() == null)
        {
            ((c) (obj1)).a(new ArrayList());
        }
        iterator = ((c) (obj1)).b().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (i)iterator.next();
        if (obj == null || !com.kik.n.a.b.i.a.a.equals(((i) (obj)).c())) goto _L4; else goto _L3
_L3:
        Object obj2 = obj;
        if (obj == null)
        {
            obj2 = (new i()).a(com.kik.n.a.b.i.a.a);
            ((c) (obj1)).b().add(obj2);
        }
        if (b)
        {
            obj = com.kik.n.a.b.i.b.b;
        } else
        {
            obj = com.kik.n.a.b.i.b.c;
        }
        ((i) (obj2)).a(((com.kik.n.a.b.i.b) (obj)));
        return obj1;
_L2:
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
    }
}
