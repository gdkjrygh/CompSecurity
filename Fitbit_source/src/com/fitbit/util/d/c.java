// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.d;


// Referenced classes of package com.fitbit.util.d:
//            b

public abstract class c
    implements b
{

    public c()
    {
    }

    public abstract boolean a(Object obj);

    public transient boolean a(Object aobj[])
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (aobj != null)
        {
            flag = flag1;
            if (aobj.length > 0)
            {
                aobj = ((Object []) (aobj[0]));
                flag = flag1;
                if (aobj != null)
                {
                    flag = a(((Object) (aobj)));
                }
            }
        }
        return flag;
    }
}
