// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            l, bb, j, d

class m
{

    final l a;
    private int b;
    private ByteArrayOutputStream c;

    public m(l l1)
    {
        a = l1;
        super();
        c = new ByteArrayOutputStream();
    }

    public int a()
    {
        return b;
    }

    public boolean a(d d)
    {
        u.a(d);
        if (b + 1 > a.q().m())
        {
            return false;
        }
        String s = a.a(d, false);
        if (s == null)
        {
            a.p().a(d, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int k = abyte0.length;
        if (k > a.q().e())
        {
            a.p().a(d, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = k;
        if (c.size() > 0)
        {
            i = k + 1;
        }
        if (i + c.size() > a.q().g())
        {
            return false;
        }
        try
        {
            if (c.size() > 0)
            {
                c.write(l.c());
            }
            c.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            a.e("Failed to write payload when batching hits", d);
            return true;
        }
        b = b + 1;
        return true;
    }

    public byte[] b()
    {
        return c.toByteArray();
    }
}
