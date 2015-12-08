// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            cy, eu, da, eo

public class cz
{

    private final String mz;

    public cz(String s)
    {
        mz = s;
    }

    public boolean a(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = cy.d(intent);
            intent = cy.e(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(cy.p(s1)))
                {
                    eu.D("Developer payload not match.");
                    return false;
                }
                if (mz != null && !da.b(mz, s1, intent))
                {
                    eu.D("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String bm()
    {
        return eo.bT();
    }
}
