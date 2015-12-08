// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//            bs, bA, aN

public final class bz
    implements bs
{

    private bA a;

    public bz(bA ba)
    {
        a = ba;
    }

    public static List d()
    {
        ArrayList arraylist = new ArrayList();
        bA aba[] = bA.values();
        int j = aba.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new bz(aba[i]));
        }

        return arraylist;
    }

    public final String a()
    {
        return a.name();
    }

    public final aN b()
    {
        return a.a();
    }

    public final String c()
    {
        return a.b();
    }
}
