// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            ed, gs, ef, gj

public class ee
{

    private final String oA;

    public ee(String s)
    {
        oA = s;
    }

    public boolean a(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = ed.e(intent);
            intent = ed.f(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(ed.D(s1)))
                {
                    gs.W("Developer payload not match.");
                    return false;
                }
                if (oA != null && !ef.b(oA, s1, intent))
                {
                    gs.W("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String ct()
    {
        return gj._mthdo();
    }
}
