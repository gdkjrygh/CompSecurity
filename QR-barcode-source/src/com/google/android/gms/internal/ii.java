// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ik, ip, ir

public abstract class ii
{

    protected final ip Go;
    private final String Gp;
    private ir Gq;

    protected ii(String s, String s1, String s2)
    {
        ik.aF(s);
        Gp = s;
        Go = new ip(s1);
        if (!TextUtils.isEmpty(s2))
        {
            Go.aK(s2);
        }
    }

    public final void a(ir ir1)
    {
        Gq = ir1;
        if (Gq == null)
        {
            fA();
        }
    }

    protected final void a(String s, long l, String s1)
        throws IOException
    {
        Go.a("Sending text message: %s to: %s", new Object[] {
            s, s1
        });
        Gq.a(Gp, s, l, s1);
    }

    public void aD(String s)
    {
    }

    public void b(long l, int i)
    {
    }

    public void fA()
    {
    }

    protected final long fz()
    {
        return Gq.fx();
    }

    public final String getNamespace()
    {
        return Gp;
    }
}
