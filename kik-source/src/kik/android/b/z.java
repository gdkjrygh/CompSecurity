// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.as;
import com.kik.n.a.b.c;
import java.util.ArrayList;

// Referenced classes of package kik.android.b:
//            s

final class z
    implements as
{

    final String a;
    final s b;

    z(s s, String s1)
    {
        b = s;
        a = s1;
        super();
    }

    public final Object a(Object obj)
    {
        c c1 = (c)obj;
        obj = c1;
        if (c1 == null)
        {
            obj = (new c()).a(a);
        }
        ((c) (obj)).a(new ArrayList());
        ((c) (obj)).a(null);
        return obj;
    }
}
