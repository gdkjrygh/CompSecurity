// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal:
//            zzao, zzaq

public class zzar extends zzao
{

    private MessageDigest zzoH;

    public zzar()
    {
    }

    byte[] zza(String as[])
    {
        byte abyte0[] = new byte[as.length];
        for (int i = 0; i < as.length; i++)
        {
            abyte0[i] = zze(zzaq.zzo(as[i]));
        }

        return abyte0;
    }

    byte zze(int i)
    {
        return (byte)(i & 0xff ^ i >> 8 & 0xff ^ i >> 16 & 0xff ^ i >> 24);
    }

    public byte[] zzl(String s)
    {
        byte abyte0[];
        int i;
        i = 4;
        abyte0 = zza(s.split(" "));
        zzoH = zzby();
        s = ((String) (zznh));
        s;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzoH == null)
        {
            return new byte[0];
        }
        zzoH.reset();
        zzoH.update(abyte0);
        obj = zzoH.digest();
        if (obj.length <= 4)
        {
            break MISSING_BLOCK_LABEL_94;
        }
_L1:
        byte abyte1[];
        abyte1 = new byte[i];
        System.arraycopy(obj, 0, abyte1, 0, abyte1.length);
        return abyte1;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        i = obj.length;
          goto _L1
    }
}
