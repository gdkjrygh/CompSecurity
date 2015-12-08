// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            he, hi

public static class 
{

    private List BV;
    private String BW;
    private boolean BX;
    private Account BY;

    public  D(boolean flag)
    {
        BX = flag;
        return this;
    }

    public BX a(hi hi1)
    {
        if (BV == null)
        {
            BV = new ArrayList();
        }
        BV.add(hi1);
        return this;
    }

    public BV ar(String s)
    {
        BW = s;
        return this;
    }

    public he fj()
    {
        String s = BW;
        boolean flag = BX;
        Account account = BY;
        hi ahi[];
        if (BV != null)
        {
            ahi = (hi[])BV.toArray(new hi[BV.size()]);
        } else
        {
            ahi = null;
        }
        return new he(s, flag, account, ahi);
    }

    public ()
    {
    }
}
