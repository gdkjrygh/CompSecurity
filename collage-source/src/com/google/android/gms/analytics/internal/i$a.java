// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            i, af, g, c

private class c
{

    final i a;
    private int b;
    private ByteArrayOutputStream c;

    public int a()
    {
        return b;
    }

    public boolean a(c c1)
    {
        z.a(c1);
        if (b + 1 > a.q().m())
        {
            return false;
        }
        String s = a.a(c1, false);
        if (s == null)
        {
            a.p().a(c1, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int k = abyte0.length;
        if (k > a.q().e())
        {
            a.p().a(c1, "Hit size exceeds the maximum size limit");
            return true;
        }
        int j = k;
        if (c.size() > 0)
        {
            j = k + 1;
        }
        if (j + c.size() > a.q().g())
        {
            return false;
        }
        try
        {
            if (c.size() > 0)
            {
                c.write(i.c());
            }
            c.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            a.e("Failed to write payload when batching hits", c1);
            return true;
        }
        b = b + 1;
        return true;
    }

    public byte[] b()
    {
        return c.toByteArray();
    }

    public (i j)
    {
        a = j;
        super();
        c = new ByteArrayOutputStream();
    }
}
