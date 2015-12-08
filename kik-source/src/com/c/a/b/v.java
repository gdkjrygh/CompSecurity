// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.c.a.b:
//            k, ae, h, g, 
//            am, ai, aj, ao

public abstract class v extends k
    implements Set
{

    v()
    {
    }

    private static int a(int i)
    {
        int l;
        if (i < 0x2ccccccc)
        {
            int j = Integer.highestOneBit(i - 1) << 1;
            do
            {
                l = j;
                if ((double)j * 0.69999999999999996D >= (double)i)
                {
                    break;
                }
                j <<= 1;
            } while (true);
        } else
        {
            boolean flag;
            if (i < 0x40000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.a(flag, "collection too large");
            l = 0x40000000;
        }
        return l;
    }

    private static transient v a(int i, Object aobj[])
    {
        int l = i;
_L13:
        l;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 136
    //                   1 140;
           goto _L1 _L2 _L3
_L1:
        Object aobj2[];
        int j;
        int i1;
        int k1;
        int l1;
        k1 = a(l);
        aobj2 = new Object[k1];
        l1 = k1 - 1;
        i1 = 0;
        i = 0;
        j = 0;
_L8:
        if (i1 >= l) goto _L5; else goto _L4
_L4:
        Object obj;
        int j1;
        int i2;
        obj = ae.a(aobj[i1], i1);
        i2 = obj.hashCode();
        j1 = h.a(i2);
_L11:
        Object obj1;
        int j2;
        j2 = j1 & l1;
        obj1 = aobj2[j2];
        if (obj1 != null) goto _L7; else goto _L6
_L6:
        j1 = i + 1;
        aobj[i] = obj;
        aobj2[j2] = obj;
        j += i2;
        i = j1;
_L10:
        i1++;
          goto _L8
_L2:
        return g.a;
_L3:
        return a(aobj[0]);
_L7:
        if (obj1.equals(obj)) goto _L10; else goto _L9
_L9:
        j1++;
          goto _L11
_L5:
        Arrays.fill(aobj, i, l, null);
        if (i == 1)
        {
            return new am(aobj[0], j);
        }
        if (k1 == a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        l = i;
        if (true) goto _L13; else goto _L12
_L12:
        Object aobj1[] = aobj;
        if (i < aobj.length)
        {
            aobj1 = ae.b(aobj, i);
        }
        return new ai(aobj1, j, aobj2, l1);
    }

    public static v a(Object obj)
    {
        return new am(obj);
    }

    public static v a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return a(5, new Object[] {
            obj, obj1, obj2, obj3, obj4
        });
    }

    public static v a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return a(aobj.length, (Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return g.a;

        case 1: // '\001'
            return a(aobj[0]);
        }
    }

    public static v g()
    {
        return g.a;
    }

    public abstract ao a();

    boolean d()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof v) && d() && ((v)obj).d() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return aj.a(this, obj);
        }
    }

    public int hashCode()
    {
        Iterator iterator1 = iterator();
        int i = 0;
        while (iterator1.hasNext()) 
        {
            Object obj = iterator1.next();
            int j;
            if (obj != null)
            {
                j = obj.hashCode();
            } else
            {
                j = 0;
            }
            i = ~~(i + j);
        }
        return i;
    }

    public Iterator iterator()
    {
        return a();
    }
}
