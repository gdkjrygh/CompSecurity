// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.f:
//            i, j, l

abstract class g
{

    i b;
    j c;
    l d;

    g()
    {
    }

    public static boolean a(Map map, Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!map.containsKey(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean a(Set set, Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        if (set != obj) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        if (!(obj instanceof Set)) goto _L4; else goto _L3
_L3:
        obj = (Set)obj;
        if (set.size() != ((Set) (obj)).size()) goto _L6; else goto _L5
_L5:
        flag = set.containsAll(((Collection) (obj)));
        if (!flag) goto _L6; else goto _L7
_L7:
        flag = flag1;
_L9:
        return flag;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        set;
        return false;
        set;
        return false;
    }

    public static boolean b(Map map, Collection collection)
    {
        int k = map.size();
        for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
        return k != map.size();
    }

    public static boolean c(Map map, Collection collection)
    {
        int k = map.size();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
        return k != map.size();
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int k, int i1);

    protected abstract Object a(int k, Object obj);

    protected abstract void a(int k);

    protected abstract void a(Object obj, Object obj1);

    public Object[] a(Object aobj[], int k)
    {
        int j1 = a();
        if (aobj.length < j1)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j1);
        }
        for (int i1 = 0; i1 < j1; i1++)
        {
            aobj[i1] = a(i1, k);
        }

        if (aobj.length > j1)
        {
            aobj[j1] = null;
        }
        return aobj;
    }

    protected abstract int b(Object obj);

    protected abstract Map b();

    public Object[] b(int k)
    {
        int j1 = a();
        Object aobj[] = new Object[j1];
        for (int i1 = 0; i1 < j1; i1++)
        {
            aobj[i1] = a(i1, k);
        }

        return aobj;
    }

    protected abstract void c();

    public Set d()
    {
        if (b == null)
        {
            b = new i(this);
        }
        return b;
    }

    public Set e()
    {
        if (c == null)
        {
            c = new j(this);
        }
        return c;
    }

    public Collection f()
    {
        if (d == null)
        {
            d = new l(this);
        }
        return d;
    }
}
