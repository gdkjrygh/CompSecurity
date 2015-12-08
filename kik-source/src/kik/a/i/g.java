// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import com.kik.g.as;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package kik.a.i:
//            a

final class g
    implements as
{

    final a a;

    g(a a1)
    {
        a = a1;
        super();
    }

    public final Object a(Object obj)
    {
        obj = (List)obj;
        if (obj == null)
        {
            return null;
        } else
        {
            return new ArrayList(((java.util.Collection) (obj)));
        }
    }
}
