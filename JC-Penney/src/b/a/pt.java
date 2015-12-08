// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.lang.reflect.Method;
import java.util.Comparator;

// Referenced classes of package b.a:
//            ps

final class pt
    implements Comparator
{

    final ps a;

    pt(ps ps)
    {
        a = ps;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Method)obj;
        obj1 = (Method)obj1;
        return ((Method) (obj)).toString().compareTo(((Method) (obj1)).toString());
    }
}
