// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal:
//            j, o

public final class p extends j
{

    private MessageDigest b;

    public p()
    {
    }

    public final byte[] a(String s)
    {
        byte abyte0[];
        int i = 0;
        s = s.split(" ");
        abyte0 = new byte[s.length];
        for (; i < s.length; i++)
        {
            int l = o.a(s[i]);
            abyte0[i] = (byte)((l & 0xff000000) >> 24 ^ (l & 0xff ^ (0xff00 & l) >> 8 ^ (0xff0000 & l) >> 16));
        }

        b = a();
        s = ((String) (a));
        s;
        JVM INSTR monitorenter ;
        Object obj;
        if (b == null)
        {
            return new byte[0];
        }
        b.reset();
        b.update(abyte0);
        obj = b.digest();
        if (obj.length <= 4)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        int k = 4;
_L1:
        byte abyte1[];
        abyte1 = new byte[k];
        System.arraycopy(obj, 0, abyte1, 0, abyte1.length);
        s;
        JVM INSTR monitorexit ;
        return abyte1;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        k = obj.length;
          goto _L1
    }
}
