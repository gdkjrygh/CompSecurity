// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Comparator;

// Referenced classes of package b.a:
//            he, jd

final class je
    implements Comparator
{

    final jd a;

    je(jd jd)
    {
        a = jd;
        super();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (he)obj;
        obj1 = (he)obj1;
        return ((he) (obj)).a - ((he) (obj1)).a;
    }

    public final boolean equals(Object obj)
    {
        return obj == this;
    }
}
