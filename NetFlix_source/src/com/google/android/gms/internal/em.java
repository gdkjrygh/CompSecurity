// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            eo, er, et

public abstract class em
{

    protected final er yY;
    private final String yZ;
    private et za;

    protected em(String s, String s1, String s2)
    {
        eo.W(s);
        yZ = s;
        yY = new er(s1);
        if (!TextUtils.isEmpty(s2))
        {
            yY.ab(s2);
        }
    }

    public void U(String s)
    {
    }

    public void a(long l, int i)
    {
    }

    public final void a(et et1)
    {
        za = et1;
        if (za == null)
        {
            dF();
        }
    }

    protected final void a(String s, long l, String s1)
        throws IOException
    {
        yY.a("Sending text message: %s to: %s", new Object[] {
            s, s1
        });
        za.a(yZ, s, l, s1);
    }

    protected final long dE()
    {
        return za.dD();
    }

    public void dF()
    {
    }

    public final String getNamespace()
    {
        return yZ;
    }
}
