// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common:
//            k

abstract class fl extends k
{

    private static final WeakReference b = new WeakReference(null);
    private WeakReference a;

    fl(byte abyte0[])
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
