// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            cz, ev, db, ep

public class da
{

    private final String mx;

    public da(String s)
    {
        mx = s;
    }

    public boolean a(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = cz.d(intent);
            intent = cz.e(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(cz.p(s1)))
                {
                    ev.D("Developer payload not match.");
                    return false;
                }
                if (mx != null && !db.b(mx, s1, intent))
                {
                    ev.D("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String bh()
    {
        return ep.bO();
    }
}
