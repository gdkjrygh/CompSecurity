// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            i, R, s, v, 
//            g, Z, d

private final class b
{

    int a;
    ByteArrayOutputStream b;
    final i c;

    public final boolean a(d d)
    {
        zzx.zzv(d);
        if (a + 1 > R.g())
        {
            return false;
        }
        String s1 = c.a(d, false);
        if (s1 == null)
        {
            ((s) (c)).i.a().a(d, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s1.getBytes();
        int k = abyte0.length;
        if (k > R.c())
        {
            ((s) (c)).i.a().a(d, "Hit size exceeds the maximum size limit");
            return true;
        }
        int j = k;
        if (b.size() > 0)
        {
            j = k + 1;
        }
        if (b.size() + j > ((Integer)Z.A.a()).intValue())
        {
            return false;
        }
        try
        {
            if (b.size() > 0)
            {
                b.write(i.c());
            }
            b.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            c.d("Failed to write payload when batching hits", d);
            return true;
        }
        a = a + 1;
        return true;
    }

    public (i j)
    {
        c = j;
        super();
        b = new ByteArrayOutputStream();
    }
}
