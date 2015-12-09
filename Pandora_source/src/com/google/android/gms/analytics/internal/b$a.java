// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzv;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            b, zzq, zzae, zzaa

private class c
{

    final b a;
    private int b;
    private ByteArrayOutputStream c;

    public int a()
    {
        return b;
    }

    public boolean a(zzaa zzaa)
    {
        zzv.zzr(zzaa);
        if (b + 1 > a.zzgI().zzib())
        {
            return false;
        }
        String s = a.a(zzaa, false);
        if (s == null)
        {
            a.zzgH().zza(zzaa, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        if (j > a.zzgI().zzhT())
        {
            a.zzgH().zza(zzaa, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = j;
        if (c.size() > 0)
        {
            i = j + 1;
        }
        if (i + c.size() > a.zzgI().zzhV())
        {
            return false;
        }
        try
        {
            if (c.size() > 0)
            {
                c.write(com.google.android.gms.analytics.internal.b.b());
            }
            c.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (zzaa zzaa)
        {
            a.zze("Failed to write payload when batching hits", zzaa);
            return true;
        }
        b = b + 1;
        return true;
    }

    public byte[] b()
    {
        return c.toByteArray();
    }

    public (b b1)
    {
        a = b1;
        super();
        c = new ByteArrayOutputStream();
    }
}
