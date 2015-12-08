// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kik.a.e.t;
import kik.a.h.i;
import org.spongycastle.crypto.digests.SHA1Digest;

// Referenced classes of package com.kik.m:
//            g

public final class b
    implements t
{

    private final Object a = new Object();
    private MessageDigest b;

    public b()
    {
    }

    private byte[] a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            a();
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        b.reset();
        abyte0 = b.digest(abyte0);
_L4:
        return abyte0;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
_L2:
        byte abyte1[];
        SHA1Digest sha1digest = new SHA1Digest();
        abyte1 = new byte[20];
        sha1digest.a(abyte0, 0, abyte0.length);
        sha1digest.a(abyte1, 0);
        abyte0 = abyte1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a(String s)
    {
        return i.a(a(s.getBytes()));
    }

    public final void a()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        b = MessageDigest.getInstance("SHA-1");
_L1:
        return;
        Object obj1;
        obj1;
        g.a(((NoSuchAlgorithmException) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }
}
