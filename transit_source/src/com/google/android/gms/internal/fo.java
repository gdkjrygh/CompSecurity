// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            fn

public class fo
{

    private String it;
    private String rA[];
    private String rB;
    private String rC;
    private String rD;
    private String rE;
    private ArrayList rF;
    private String rG[];

    public fo(Context context)
    {
        rF = new ArrayList();
        rC = context.getPackageName();
        rB = context.getPackageName();
        rF.add("https://www.googleapis.com/auth/plus.login");
    }

    public fo Z(String s)
    {
        it = s;
        return this;
    }

    public transient fo d(String as[])
    {
        rF.clear();
        rF.addAll(Arrays.asList(as));
        return this;
    }

    public fo dg()
    {
        rF.clear();
        return this;
    }

    public fn dh()
    {
        if (it == null)
        {
            it = "<<default account>>";
        }
        String as[] = (String[])rF.toArray(new String[rF.size()]);
        return new fn(it, as, rG, rA, rB, rC, rD, rE);
    }

    public transient fo e(String as[])
    {
        rG = as;
        return this;
    }
}
