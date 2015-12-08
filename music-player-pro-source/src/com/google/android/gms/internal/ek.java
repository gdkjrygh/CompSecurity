// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            ei, gr, el, gi

public class ek
{

    private final String oK;

    public ek(String s)
    {
        oK = s;
    }

    public boolean a(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = ei.e(intent);
            intent = ei.f(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(ei.D(s1)))
                {
                    gr.W("Developer payload not match.");
                    return false;
                }
                if (oK != null && !el.b(oK, s1, intent))
                {
                    gr.W("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String cC()
    {
        return gi.dx();
    }
}
