// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;


// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            d

public class e
{

    int a;
    String b;

    public e(int i, String s)
    {
        a = i;
        if (s == null || s.trim().length() == 0)
        {
            b = com.aviary.android.feather.cds.billing.util.d.a(i);
            return;
        } else
        {
            b = (new StringBuilder()).append(s).append(" (response: ").append(com.aviary.android.feather.cds.billing.util.d.a(i)).append(")").toString();
            return;
        }
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean c()
    {
        return a == 0;
    }

    public boolean d()
    {
        return !c();
    }

    public String toString()
    {
        return (new StringBuilder()).append("IabResult: ").append(b()).toString();
    }
}
