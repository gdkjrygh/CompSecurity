// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal:
//            ao, aq

public class ar extends ao
{

    private MessageDigest nP;

    public ar()
    {
    }

    byte[] a(String as[])
    {
        byte abyte0[] = new byte[as.length];
        for (int i = 0; i < as.length; i++)
        {
            abyte0[i] = (byte)(aq.o(as[i]) & 0xff);
        }

        return abyte0;
    }

    public byte[] l(String s)
    {
        byte abyte0[];
        abyte0 = a(s.split(" "));
        nP = ba();
        s = ((String) (mw));
        s;
        JVM INSTR monitorenter ;
        Object obj;
        if (nP == null)
        {
            return new byte[0];
        }
        nP.reset();
        nP.update(abyte0);
        obj = nP.digest();
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
