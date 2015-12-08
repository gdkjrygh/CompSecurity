// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;

public final class caq extends cam
{

    private MessageDigest b;

    public caq()
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
            int k = cap.a(s[i]);
            abyte0[i] = (byte)(k >> 24 ^ (k & 0xff ^ k >> 8 & 0xff ^ k >> 16 & 0xff));
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
            break MISSING_BLOCK_LABEL_160;
        }
        int j = 4;
_L1:
        byte abyte1[];
        abyte1 = new byte[j];
        System.arraycopy(obj, 0, abyte1, 0, abyte1.length);
        s;
        JVM INSTR monitorexit ;
        return abyte1;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        j = obj.length;
          goto _L1
    }
}
