// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            am, cm, aj, ae, 
//            de, cu, bg, aq, 
//            bf, cy, di

public abstract class be extends am
    implements Set
{

    be()
    {
    }

    private static int a(int i)
    {
        int k;
        if (i < 0x2ccccccc)
        {
            int j = Integer.highestOneBit(i - 1) << 1;
            do
            {
                k = j;
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
            ad.a(flag, "collection too large");
            k = 0x40000000;
        }
        return k;
    }

    private static transient be a(int i, Object aobj[])
    {
        int k = i;
_L13:
        k;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 136
    //                   1 140;
           goto _L1 _L2 _L3
_L1:
        Object aobj2[];
        int j;
        int l;
        int j1;
        int k1;
        j1 = a(k);
        aobj2 = new Object[j1];
        k1 = j1 - 1;
        l = 0;
        i = 0;
        j = 0;
_L8:
        if (l >= k) goto _L5; else goto _L4
_L4:
        Object obj;
        int i1;
        int l1;
        obj = cm.a(aobj[l], l);
        l1 = obj.hashCode();
        i1 = aj.a(l1);
_L11:
        Object obj1;
        int i2;
        i2 = i1 & k1;
        obj1 = aobj2[i2];
        if (obj1 != null) goto _L7; else goto _L6
_L6:
        i1 = i + 1;
        aobj[i] = obj;
        aobj2[i2] = obj;
        j += l1;
        i = i1;
_L10:
        l++;
          goto _L8
_L2:
        return ae.a;
_L3:
        return a(aobj[0]);
_L7:
        if (obj1.equals(obj)) goto _L10; else goto _L9
_L9:
        i1++;
          goto _L11
_L5:
        Arrays.fill(aobj, i, k, null);
        if (i == 1)
        {
            return new de(aobj[0], j);
        }
        if (j1 == a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (true) goto _L13; else goto _L12
_L12:
        Object aobj1[] = aobj;
        if (i < aobj.length)
        {
            aobj1 = cm.b(aobj, i);
        }
        return new cu(aobj1, j, aobj2, k1);
    }

    public static be a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
            if ((iterable instanceof be) && !(iterable instanceof bg))
            {
                be be1 = (be)iterable;
                if (!be1.e())
                {
                    return be1;
                }
            } else
            if (iterable instanceof EnumSet)
            {
                return aq.a(EnumSet.copyOf((EnumSet)iterable));
            }
            iterable = ((Iterable) (iterable.toArray()));
            return a(iterable.length, ((Object []) (iterable)));
        }
        iterable = iterable.iterator();
        if (!iterable.hasNext())
        {
            return ae.a;
        }
        Object obj = iterable.next();
        if (!iterable.hasNext())
        {
            return a(obj);
        } else
        {
            iterable = (new bf()).c(obj).b(iterable);
            obj = a(((bf) (iterable)).b, ((bf) (iterable)).a);
            iterable.b = ((be) (obj)).size();
            return ((be) (obj));
        }
    }

    public static be a(Object obj)
    {
        return new de(obj);
    }

    public static be a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return a(aobj.length, (Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return ae.a;

        case 1: // '\001'
            return a(aobj[0]);
        }
    }

    public static be g()
    {
        return ae.a;
    }

    public abstract di a();

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof be) && i_() && ((be)obj).i_() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return cy.a(this, obj);
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

    boolean i_()
    {
        return false;
    }

    public Iterator iterator()
    {
        return a();
    }
}
