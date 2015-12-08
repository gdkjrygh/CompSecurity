// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hd, hh

public static class 
{

    private List CO;
    private String CP;
    private boolean CQ;
    private Account CR;

    public  F(boolean flag)
    {
        CQ = flag;
        return this;
    }

    public CQ a(hh hh1)
    {
        if (CO == null)
        {
            CO = new ArrayList();
        }
        CO.add(hh1);
        return this;
    }

    public CO ar(String s)
    {
        CP = s;
        return this;
    }

    public hd fD()
    {
        String s = CP;
        boolean flag = CQ;
        Account account = CR;
        hh ahh[];
        if (CO != null)
        {
            ahh = (hh[])CO.toArray(new hh[CO.size()]);
        } else
        {
            ahh = null;
        }
        return new hd(s, flag, account, ahh);
    }

    public ()
    {
    }
}
