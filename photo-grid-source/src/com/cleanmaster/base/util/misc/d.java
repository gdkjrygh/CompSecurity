// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.base.util.misc;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.cleanmaster.base.util.misc:
//            f

abstract class d
{

    f b;

    d()
    {
    }

    public static boolean a(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((java.util.Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i);

    public final Object[] a(Object aobj[])
    {
        int j = a();
        if (aobj.length < j)
        {
            aobj = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j);
        }
        for (int i = 0; i < j; i++)
        {
            aobj[i] = a(i);
        }

        if (aobj.length > j)
        {
            aobj[j] = null;
        }
        return aobj;
    }

    protected abstract Map b();

    protected abstract void b(int i);

    protected abstract void c();

    public final Object[] d()
    {
        int j = a();
        Object aobj[] = new Object[j];
        for (int i = 0; i < j; i++)
        {
            aobj[i] = a(i);
        }

        return aobj;
    }
}
