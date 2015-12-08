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

    private String abV[];
    private String abW;
    private String abX;
    private String abY;
    private PlusCommonExtras aca;
    private final ArrayList acb = new ArrayList();
    private String acc[];
    private String yQ;

    public i(Context context)
    {
        abX = context.getPackageName();
        abW = context.getPackageName();
        aca = new PlusCommonExtras();
        acb.add("https://www.googleapis.com/auth/plus.login");
    }

    public i bz(String s)
    {
        yQ = s;
        return this;
    }

    public transient i e(String as[])
    {
        acb.clear();
        acb.addAll(Arrays.asList(as));
        return this;
    }

    public transient i f(String as[])
    {
        acc = as;
        return this;
    }

    public i ki()
    {
        acb.clear();
        return this;
    }

    public h kj()
    {
        if (yQ == null)
        {
            yQ = "<<default account>>";
        }
        String as[] = (String[])acb.toArray(new String[acb.size()]);
        return new h(yQ, as, acc, abV, abW, abX, abY, aca);
    }
}
