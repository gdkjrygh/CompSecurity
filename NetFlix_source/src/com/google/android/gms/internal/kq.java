// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kv, kn, kt, kw

public class kq
{

    protected final Class adV;
    protected final boolean adW;
    protected final int tag;
    protected final int type;

    private kq(int i, Class class1, int j, boolean flag)
    {
        type = i;
        adV = class1;
        tag = j;
        adW = flag;
    }

    public static kq a(int i, Class class1, int j)
    {
        return new kq(i, class1, j, false);
    }

    protected void a(kv kv1, List list)
    {
        list.add(o(kn.n(kv1.adZ)));
    }

    protected boolean dd(int i)
    {
        return i == tag;
    }

    final Object f(List list)
    {
        boolean flag = false;
        if (list != null) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
label0:
        {
            if (!adW)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < list.size(); i++)
            {
                kv kv1 = (kv)list.get(i);
                if (dd(kv1.tag) && kv1.adZ.length != 0)
                {
                    a(kv1, arraylist);
                }
            }

            int l = arraylist.size();
            if (l == 0)
            {
                return null;
            }
            Object obj = adV.cast(Array.newInstance(adV.getComponentType(), l));
            int j = ((flag) ? 1 : 0);
            do
            {
                list = ((List) (obj));
                if (j >= l)
                {
                    break;
                }
                Array.set(obj, j, arraylist.get(j));
                j++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        int k = list.size() - 1;
        kv kv2;
        for (kv2 = null; kv2 == null && k >= 0; k--)
        {
            kv kv3 = (kv)list.get(k);
            if (dd(kv3.tag) && kv3.adZ.length != 0)
            {
                kv2 = kv3;
            }
        }

        if (kv2 == null)
        {
            return null;
        } else
        {
            return adV.cast(o(kn.n(kv2.adZ)));
        }
    }

    protected Object o(kn kn1)
    {
        Class class1;
        if (adW)
        {
            class1 = adV.getComponentType();
        } else
        {
            class1 = adV;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        kt kt1;
        try
        {
            kt1 = (kt)class1.newInstance();
            kn1.a(kt1, kw.df(tag));
        }
        // Misplaced declaration of an exception variable
        catch (kn kn1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), kn1);
        }
        // Misplaced declaration of an exception variable
        catch (kn kn1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), kn1);
        }
        // Misplaced declaration of an exception variable
        catch (kn kn1)
        {
            throw new IllegalArgumentException("Error reading extension field", kn1);
        }
        return kt1;
_L3:
        kt1 = (kt)class1.newInstance();
        kn1.a(kt1);
        return kt1;
    }
}
