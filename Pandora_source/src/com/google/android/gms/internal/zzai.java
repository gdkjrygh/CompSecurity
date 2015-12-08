// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal:
//            zzaf, zzah

public class zzai extends zzaf
{

    private MessageDigest zzpE;

    public zzai()
    {
    }

    byte[] zza(String as[])
    {
        byte abyte0[] = new byte[as.length];
        for (int i = 0; i < as.length; i++)
        {
            abyte0[i] = zzf(zzah.zzq(as[i]));
        }

        return abyte0;
    }

    byte zzf(int i)
    {
        return (byte)(i & 0xff ^ (0xff00 & i) >> 8 ^ (0xff0000 & i) >> 16 ^ (0xff000000 & i) >> 24);
    }

    public byte[] zzn(String s)
    {
        byte abyte0[];
        abyte0 = zza(s.split(" "));
        zzpE = zzbE();
        s = ((String) (zzoe));
        s;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzpE == null)
        {
            return new byte[0];
        }
        zzpE.reset();
        zzpE.update(abyte0);
        obj = zzpE.digest();
        int i = 4;
        if (obj.length <= 4)
        {
            break MISSING_BLOCK_LABEL_94;
        }
_L1:
        byte abyte1[];
        abyte1 = new byte[i];
        System.arraycopy(obj, 0, abyte1, 0, abyte1.length);
        s;
        JVM INSTR monitorexit ;
        return abyte1;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        i = obj.length;
          goto _L1
    }
}
