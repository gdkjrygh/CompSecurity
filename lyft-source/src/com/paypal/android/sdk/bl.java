// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//            be, bm, aD

public final class bl
    implements be
{

    private bm a;

    public bl(bm bm1)
    {
        a = bm1;
    }

    public static List d()
    {
        ArrayList arraylist = new ArrayList();
        bm abm[] = bm.values();
        int j = abm.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new bl(abm[i]));
        }

        return arraylist;
    }

    public final String a()
    {
        return a.name();
    }

    public final aD b()
    {
        return a.a();
    }

    public final String c()
    {
        return a.b();
    }
}
