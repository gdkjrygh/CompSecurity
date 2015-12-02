// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            fi, fp, es, mh

class fv extends fi
{

    final transient fp a;

    fv(fp fp1)
    {
        a = fp1;
    }

    boolean a()
    {
        return a.d();
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = a.get(((java.util.Map.Entry) (obj)).getKey());
            flag = flag1;
            if (obj1 != null)
            {
                flag = flag1;
                if (obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public mh h_()
    {
        return a.a.h_();
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return a.size();
    }
}
