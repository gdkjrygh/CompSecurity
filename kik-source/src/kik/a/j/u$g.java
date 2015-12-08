// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.as;
import kik.a.d.ab;

// Referenced classes of package kik.a.j:
//            u

private static final class a
    implements as
{

    private Class a;

    public final volatile Object a(Object obj)
    {
        obj = (ab)obj;
        if (obj != null)
        {
            return ((ab) (obj)).a(a);
        } else
        {
            return null;
        }
    }

    public ass(Class class1)
    {
        a = class1;
    }
}
