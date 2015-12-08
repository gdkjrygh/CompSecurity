// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mh, lz, mf, mi

public class mc
{

    protected final Class amV;
    protected final boolean amW;
    protected final int tag;
    protected final int type;

    private mc(int j, Class class1, int k, boolean flag)
    {
        type = j;
        amV = class1;
        tag = k;
        amW = flag;
    }

    public static mc a(int j, Class class1, int k)
    {
        return new mc(j, class1, k, false);
    }

    protected void a(mh mh1, List list)
    {
        list.add(u(lz.p(mh1.amZ)));
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
            if (!amW)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            for (int j = 0; j < list.size(); j++)
            {
                mh mh1 = (mh)list.get(j);
                if (eM(mh1.tag) && mh1.amZ.length != 0)
                {
                    a(mh1, arraylist);
                }
            }

            int i1 = arraylist.size();
            if (i1 == 0)
            {
                return null;
            }
            Object obj = amV.cast(Array.newInstance(amV.getComponentType(), i1));
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
        mh mh2;
        for (mh2 = null; mh2 == null && l >= 0; l--)
        {
            mh mh3 = (mh)list.get(l);
            if (eM(mh3.tag) && mh3.amZ.length != 0)
            {
                mh2 = mh3;
            }
        }

        if (mh2 == null)
        {
            return null;
        } else
        {
            return amV.cast(u(lz.p(mh2.amZ)));
        }
    }

    protected Object u(lz lz1)
    {
        Class class1;
        if (amW)
        {
            class1 = amV.getComponentType();
        } else
        {
            class1 = amV;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        mf mf1;
        try
        {
            mf1 = (mf)class1.newInstance();
            lz1.a(mf1, mi.eO(tag));
        }
        // Misplaced declaration of an exception variable
        catch (lz lz1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), lz1);
        }
        // Misplaced declaration of an exception variable
        catch (lz lz1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), lz1);
        }
        // Misplaced declaration of an exception variable
        catch (lz lz1)
        {
            throw new IllegalArgumentException("Error reading extension field", lz1);
        }
        return mf1;
_L3:
        mf1 = (mf)class1.newInstance();
        lz1.a(mf1);
        return mf1;
    }
}
