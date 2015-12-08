// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.ko;
import com.google.android.gms.internal.kq;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            Moment, ItemScope

public static class 
{

    private final Set acp = new HashSet();
    private String adc;
    private ko adk;
    private ko adl;
    private String qU;
    private String xD;

    public Moment build()
    {
        return new kq(acp, xD, adk, adc, adl, qU);
    }

    public qU setId(String s)
    {
        xD = s;
        acp.add(Integer.valueOf(2));
        return this;
    }

    public acp setResult(ItemScope itemscope)
    {
        adk = (ko)itemscope;
        acp.add(Integer.valueOf(4));
        return this;
    }

    public acp setStartDate(String s)
    {
        adc = s;
        acp.add(Integer.valueOf(5));
        return this;
    }

    public acp setTarget(ItemScope itemscope)
    {
        adl = (ko)itemscope;
        acp.add(Integer.valueOf(6));
        return this;
    }

    public acp setType(String s)
    {
        qU = s;
        acp.add(Integer.valueOf(7));
        return this;
    }

    public ()
    {
    }
}
