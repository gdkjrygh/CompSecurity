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

    private String Um[];
    private String Un;
    private String Uo;
    private String Up;
    private PlusCommonExtras Ur;
    private final ArrayList Us = new ArrayList();
    private String Ut[];
    private String wG;

    public i(Context context)
    {
        Uo = context.getPackageName();
        Un = context.getPackageName();
        Ur = new PlusCommonExtras();
        Us.add("https://www.googleapis.com/auth/plus.login");
    }

    public i bh(String s)
    {
        wG = s;
        return this;
    }

    public transient i e(String as[])
    {
        Us.clear();
        Us.addAll(Arrays.asList(as));
        return this;
    }

    public transient i f(String as[])
    {
        Ut = as;
        return this;
    }

    public i iY()
    {
        Us.clear();
        return this;
    }

    public h iZ()
    {
        if (wG == null)
        {
            wG = "<<default account>>";
        }
        String as[] = (String[])Us.toArray(new String[Us.size()]);
        return new h(wG, as, Ut, Um, Un, Uo, Up, Ur);
    }
}
