// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mg, ly, me, mh

public class mb
{

    protected final Class amY;
    protected final boolean amZ;
    protected final int tag;
    protected final int type;

    private mb(int j, Class class1, int k, boolean flag)
    {
        type = j;
        amY = class1;
        tag = k;
        amZ = flag;
    }

    public static mb a(int j, Class class1, int k)
    {
        return new mb(j, class1, k, false);
    }

    protected void a(mg mg1, List list)
    {
        list.add(u(ly.p(mg1.anc)));
    }

    protected boolean eM(int j)
    {
        return j == tag;
    }

    final Object i(List list)
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
            if (!amZ)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            for (int j = 0; j < list.size(); j++)
            {
                mg mg1 = (mg)list.get(j);
                if (eM(mg1.tag) && mg1.anc.length != 0)
                {
                    a(mg1, arraylist);
                }
            }

            int i1 = arraylist.size();
            if (i1 == 0)
            {
                return null;
            }
            Object obj = amY.cast(Array.newInstance(amY.getComponentType(), i1));
            int k = ((flag) ? 1 : 0);
            do
            {
                list = ((List) (obj));
                if (k >= i1)
                {
                    break;
                }
                Array.set(obj, k, arraylist.get(k));
                k++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        int l = list.size() - 1;
        mg mg2;
        for (mg2 = null; mg2 == null && l >= 0; l--)
        {
            mg mg3 = (mg)list.get(l);
            if (eM(mg3.tag) && mg3.anc.length != 0)
            {
                mg2 = mg3;
            }
        }

        if (mg2 == null)
        {
            return null;
        } else
        {
            return amY.cast(u(ly.p(mg2.anc)));
        }
    }

    protected Object u(ly ly1)
    {
        Class class1;
        if (amZ)
        {
            class1 = amY.getComponentType();
        } else
        {
            class1 = amY;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        me me1;
        try
        {
            me1 = (me)class1.newInstance();
            ly1.a(me1, mh.eO(tag));
        }
        // Misplaced declaration of an exception variable
        catch (ly ly1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), ly1);
        }
        // Misplaced declaration of an exception variable
        catch (ly ly1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), ly1);
        }
        // Misplaced declaration of an exception variable
        catch (ly ly1)
        {
            throw new IllegalArgumentException("Error reading extension field", ly1);
        }
        return me1;
_L3:
        me1 = (me)class1.newInstance();
        ly1.a(me1);
        return me1;
    }
}
