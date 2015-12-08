// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            DERSequence, f, DEREncodable, DEROutputStream

public class LazyDERSequence extends DERSequence
{

    private byte a[];
    private boolean b;
    private int c;

    LazyDERSequence(byte abyte0[])
    {
        b = false;
        c = -1;
        a = abyte0;
    }

    public final DEREncodable a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        for (f f1 = new f(a); f1.hasMoreElements(); a((DEREncodable)f1.nextElement())) { }
        break MISSING_BLOCK_LABEL_51;
        Exception exception;
        exception;
        throw exception;
        b = true;
        DEREncodable derencodable = super.a(i);
        this;
        JVM INSTR monitorexit ;
        return derencodable;
    }

    final void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(48, a);
    }

    public final Enumeration e()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        Object obj = super.e();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Enumeration) (obj));
_L2:
        obj = new f(a);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final int f()
    {
        if (c < 0)
        {
            f f1 = new f(a);
            for (c = 0; f1.hasMoreElements(); c = c + 1)
            {
                f1.nextElement();
            }

        }
        return c;
    }
}
