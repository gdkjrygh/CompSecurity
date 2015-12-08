// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;

abstract class kjq extends kdq
{

    private static final WeakReference b = new WeakReference(null);
    private WeakReference a;

    kjq(byte abyte0[])
    {
        super(abyte0);
        a = b;
    }

    final byte[] a()
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte1[] = (byte[])a.get();
        byte abyte0[];
        abyte0 = abyte1;
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        abyte0 = b();
        a = new WeakReference(abyte0);
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract byte[] b();

}
