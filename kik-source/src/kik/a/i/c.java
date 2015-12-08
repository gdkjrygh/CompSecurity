// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import com.kik.n.a.b.e;
import com.kik.n.a.b.g;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package kik.a.i:
//            b

final class c
    implements Comparator
{

    final b a;

    c(b b)
    {
        a = b;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (java.util.Map.Entry)obj;
        long l = ((g)((e)((java.util.Map.Entry)obj1).getValue()).b().get(0)).f().longValue();
        long l1 = ((g)((e)((java.util.Map.Entry) (obj)).getValue()).b().get(0)).f().longValue();
        if (l == l1)
        {
            return 0;
        }
        return l <= l1 ? -1 : 1;
    }
}
