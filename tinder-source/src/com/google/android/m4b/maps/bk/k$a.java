// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            k

final class tion extends k
{

    public final boolean a(int i, int j, int l)
    {
        throw new UnsupportedOperationException("Cannot add triangle to immutable empty mesh");
    }

    public final double b()
    {
        return 0.0D;
    }

    public final int c()
    {
        return 0;
    }

    public final int d()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj || super.equals(obj))
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof k)
            {
                flag = flag1;
                if (((k)obj).c() == 0)
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return 0;
    }

    public tion()
    {
    }
}
