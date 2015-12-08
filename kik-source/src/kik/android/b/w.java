// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import com.kik.g.as;
import com.kik.n.a.b.i;

// Referenced classes of package kik.android.b:
//            s

final class w
    implements as
{

    final s a;

    w(s s)
    {
        a = s;
        super();
    }

    public final Object a(Object obj)
    {
        obj = (i)obj;
        if (obj != null)
        {
            obj = ((i) (obj)).d();
            if (com.kik.n.a.b.i.b.b.equals(obj))
            {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }
}
