// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            i, ae, g, al, 
//            c

private final class c
{

    final i a;
    private int b;
    private ByteArrayOutputStream c;

    public final int a()
    {
        return b;
    }

    public final boolean a(c c1)
    {
        y.a(c1);
        if (b + 1 > ae.g())
        {
            return false;
        }
        String s = a.a(c1, false);
        if (s == null)
        {
            a.n().a(c1, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int k = abyte0.length;
        if (k > ae.c())
        {
            a.n().a(c1, "Hit size exceeds the maximum size limit");
            return true;
        }
        int j = k;
        if (c.size() > 0)
        {
            j = k + 1;
        }
        if (c.size() + j > ((Integer)al.A.a()).intValue())
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

    public final byte[] b()
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
