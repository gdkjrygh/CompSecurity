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

    private String abS[];
    private String abT;
    private String abU;
    private String abV;
    private PlusCommonExtras abX;
    private final ArrayList abY = new ArrayList();
    private String abZ[];
    private String yN;

    public i(Context context)
    {
        abU = context.getPackageName();
        abT = context.getPackageName();
        abX = new PlusCommonExtras();
        abY.add("https://www.googleapis.com/auth/plus.login");
    }

    public i bz(String s)
    {
        yN = s;
        return this;
    }

    public transient i e(String as[])
    {
        abY.clear();
        abY.addAll(Arrays.asList(as));
        return this;
    }

    public transient i f(String as[])
    {
        abZ = as;
        return this;
    }

    public i kd()
    {
        abY.clear();
        return this;
    }

    public h ke()
    {
        if (yN == null)
        {
            yN = "<<default account>>";
        }
        String as[] = (String[])abY.toArray(new String[abY.size()]);
        return new h(yN, as, abZ, abS, abT, abU, abV, abX);
    }
}
