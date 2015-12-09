// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;


// Referenced classes of package com.google.a.b:
//            be, av

abstract class az extends be
{

    az()
    {
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = d().get(((java.util.Map.Entry) (obj)).getKey());
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

    abstract av d();

    final boolean e()
    {
        return false;
    }

    public int size()
    {
        return d().size();
    }
}
