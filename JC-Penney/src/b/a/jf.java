// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Comparator;

// Referenced classes of package b.a:
//            gx, jd

final class jf
    implements Comparator
{

    final jd a;

    jf(jd jd)
    {
        a = jd;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (gx)obj;
        obj1 = (gx)obj1;
        return ((gx) (obj)).g() - ((gx) (obj1)).g();
    }

    public final boolean equals(Object obj)
    {
        return obj == this;
    }
}
