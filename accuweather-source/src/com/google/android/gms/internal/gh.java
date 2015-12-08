// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            gj, go, gq

public abstract class gh
{

    protected final go BA;
    private final String BB;
    private gq BC;

    protected gh(String s, String s1, String s2)
    {
        gj.ak(s);
        BB = s;
        BA = new go(s1);
        if (!TextUtils.isEmpty(s2))
        {
            BA.ap(s2);
        }
    }

    public void a(long l, int i)
    {
    }

    public final void a(gq gq1)
    {
        BC = gq1;
        if (BC == null)
        {
            dZ();
        }
    }

    protected final void a(String s, long l, String s1)
        throws IOException
    {
        BA.a("Sending text message: %s to: %s", new Object[] {
            s, s1
        });
        BC.a(BB, s, l, s1);
    }

    public void ai(String s)
    {
    }

    protected final long dY()
    {
        return BC.dW();
    }

    public void dZ()
    {
    }

    public final String getNamespace()
    {
        return BB;
    }
}
