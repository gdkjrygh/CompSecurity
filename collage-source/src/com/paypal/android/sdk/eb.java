// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//            du, ec, au

public final class eb
    implements du
{

    private ec a;

    public eb(ec ec1)
    {
        a = ec1;
    }

    public static List d()
    {
        ArrayList arraylist = new ArrayList();
        ec aec[] = ec.values();
        int j = aec.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new eb(aec[i]));
        }

        return arraylist;
    }

    public final String a()
    {
        return a.name();
    }

    public final au b()
    {
        return a.a();
    }

    public final String c()
    {
        return a.b();
    }
}
