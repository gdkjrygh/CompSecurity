// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            fj, eh

final class kg extends fj
{

    final transient Object b[];
    private final transient int d;
    private final transient int e;

    kg(Object aobj[], int i, Object aobj1[], int j)
    {
        super(aobj);
        b = aobj1;
        d = j;
        e = i;
    }

    boolean c()
    {
        return true;
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = eh.a(obj.hashCode());
        do
        {
            Object obj1 = b[d & i];
            if (obj1 == null)
            {
                return false;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            i++;
        } while (true);
    }

    public int hashCode()
    {
        return e;
    }
}
