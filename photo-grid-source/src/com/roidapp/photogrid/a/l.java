// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;


// Referenced classes of package com.roidapp.photogrid.a:
//            d

public final class l
{

    int a;
    String b;

    public l(int i, String s)
    {
        a = i;
        if (s == null || s.trim().length() == 0)
        {
            b = com.roidapp.photogrid.a.d.a(i);
            return;
        } else
        {
            b = (new StringBuilder()).append(s).append(" (response: ").append(com.roidapp.photogrid.a.d.a(i)).append(")").toString();
            return;
        }
    }

    public final int a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final boolean c()
    {
        return a == 0;
    }

    public final boolean d()
    {
        return !c();
    }

    public final String toString()
    {
        return (new StringBuilder("IabResult: ")).append(b).toString();
    }
}
