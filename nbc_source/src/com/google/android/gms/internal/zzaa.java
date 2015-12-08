// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzu

public class zzaa extends ByteArrayOutputStream
{

    private final zzu zzar;

    public zzaa(zzu zzu1, int i)
    {
        zzar = zzu1;
        buf = zzar.zzb(Math.max(i, 256));
    }

    private void zzd(int i)
    {
        if (count + i <= buf.length)
        {
            return;
        } else
        {
            byte abyte0[] = zzar.zzb((count + i) * 2);
            System.arraycopy(buf, 0, abyte0, 0, count);
            zzar.zza(buf);
            buf = abyte0;
            return;
        }
    }

    public void close()
        throws IOException
    {
        zzar.zza(buf);
        buf = null;
        super.close();
    }

    public void finalize()
    {
        zzar.zza(buf);
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        zzd(1);
        super.write(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        zzd(j);
        super.write(abyte0, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }
}
