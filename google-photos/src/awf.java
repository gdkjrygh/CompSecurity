// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class awf
    implements anh
{

    private final ByteBuffer a = ByteBuffer.allocate(4);

    awf()
    {
    }

    public final void a(byte abyte0[], Object obj, MessageDigest messagedigest)
    {
        obj = (Integer)obj;
        if (obj != null)
        {
            messagedigest.update(abyte0);
            synchronized (a)
            {
                a.position(0);
                messagedigest.update(a.putInt(((Integer) (obj)).intValue()).array());
            }
            return;
        } else
        {
            return;
        }
        obj;
        abyte0;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
