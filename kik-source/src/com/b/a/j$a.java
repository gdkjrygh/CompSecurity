// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            j, z, y, aa

private static final class ject
{

    private transient Object a[];
    private int b;
    private transient int c;

    private static int a(int i, int k)
    {
        if (i + 2 < k)
        {
            return i + 2;
        } else
        {
            return 0;
        }
    }

    private static int a(Object obj, int i)
    {
        int k = System.identityHashCode(obj);
        return (k << 1) - (k << 8) & i - 1;
    }

    public final boolean a(int i, Object obj, z z1, int k)
    {
        boolean flag;
        int j1;
        flag = false;
        Object aobj[] = a;
        j1 = aobj.length;
        int l = a(obj, j1);
        do
        {
            Object obj2 = aobj[l];
            if (obj2 == null)
            {
                break;
            }
            if (obj2 == obj)
            {
                if ((obj instanceof java.util.Entry) && obj.getClass().getName().startsWith("java.util"))
                {
                    return true;
                } else
                {
                    z1.b = z1.f.a(((Integer)aobj[l + 1]).intValue(), z1, z1.f.a(y.a(k, 6), z1, z1.b));
                    return false;
                }
            }
            l = a(l, j1);
        } while (true);
        aobj[l] = obj;
        aobj[l + 1] = Integer.valueOf(i);
        i = b + 1;
        b = i;
        if (i < c) goto _L2; else goto _L1
_L1:
        int i1;
        i1 = j1 * 2;
        obj = ((Object) (a));
        j1 = obj.length;
        if (j1 != 0x40000000) goto _L4; else goto _L3
_L3:
        if (c == 0x1fffffff)
        {
            throw new IllegalStateException("Capacity exhausted.");
        }
        c = 0x1fffffff;
_L2:
        return true;
_L4:
        if (j1 < i1)
        {
            z1 = ((z) (new Object[i1]));
            c = i1 / 3;
            for (i = ((flag) ? 1 : 0); i < j1; i += 2)
            {
                Object obj1 = obj[i];
                if (obj1 == null)
                {
                    continue;
                }
                Object obj3 = obj[i + 1];
                obj[i] = null;
                obj[i + 1] = null;
                for (k = a(obj1, i1); z1[k] != null; k = a(k, i1)) { }
                z1[k] = obj1;
                z1[k + 1] = obj3;
            }

            a = z1;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public ject()
    {
        c = 21;
        a = new Object[64];
    }
}
