// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusCommonExtras, h

public class i
{

    private String Dd;
    private String alF[];
    private String alG;
    private String alH;
    private String alI;
    private PlusCommonExtras alK;
    private final ArrayList alL = new ArrayList();
    private String alM[];

    public i(Context context)
    {
        alH = context.getPackageName();
        alG = context.getPackageName();
        alK = new PlusCommonExtras();
        alL.add("https://www.googleapis.com/auth/plus.login");
    }

    public i ch(String s)
    {
        Dd = s;
        return this;
    }

    public transient i g(String as[])
    {
        alL.clear();
        alL.addAll(Arrays.asList(as));
        return this;
    }

    public transient i h(String as[])
    {
        alM = as;
        return this;
    }

    public i np()
    {
        alL.clear();
        return this;
    }

    public h nq()
    {
        if (Dd == null)
        {
            Dd = "<<default account>>";
        }
        String as[] = (String[])alL.toArray(new String[alL.size()]);
        return new h(Dd, as, alM, alF, alG, alH, alI, alK);
    }
}
