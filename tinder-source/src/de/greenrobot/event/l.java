// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            j

final class l
{

    final Object a;
    final j b;
    final int c = 0;
    volatile boolean d;

    l(Object obj, j j1)
    {
        a = obj;
        b = j1;
        d = true;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof l)
        {
            obj = (l)obj;
            flag = flag1;
            if (a == ((l) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((l) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a.hashCode() + b.d.hashCode();
    }
}
