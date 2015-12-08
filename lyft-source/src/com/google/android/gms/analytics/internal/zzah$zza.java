// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzah, zzr, zzaf, zzab

class c
{

    final zzah a;
    private int b;
    private ByteArrayOutputStream c;

    public int a()
    {
        return b;
    }

    public boolean a(zzab zzab)
    {
        zzu.a(zzab);
        if (b + 1 > a.q().m())
        {
            return false;
        }
        String s = a.a(zzab, false);
        if (s == null)
        {
            a.p().a(zzab, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        if (j > a.q().e())
        {
            a.p().a(zzab, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = j;
        if (c.size() > 0)
        {
            i = j + 1;
        }
        if (i + c.size() > a.q().g())
        {
            return false;
        }
        try
        {
            if (c.size() > 0)
            {
                c.write(zzah.c());
            }
            c.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab)
        {
            a.e("Failed to write payload when batching hits", zzab);
            return true;
        }
        b = b + 1;
        return true;
    }

    public byte[] b()
    {
        return c.toByteArray();
    }

    public (zzah zzah1)
    {
        a = zzah1;
        super();
        c = new ByteArrayOutputStream();
    }
}
