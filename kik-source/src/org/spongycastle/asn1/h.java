// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Sequence, g, ASN1OutputStream, ASN1Primitive, 
//            j, ASN1Encodable

final class h extends ASN1Sequence
{

    private byte b[];

    h(byte abyte0[])
    {
        b = abyte0;
    }

    private void j()
    {
        for (g g1 = new g(b); g1.hasMoreElements(); a.addElement(g1.nextElement())) { }
        b = null;
    }

    public final ASN1Encodable a(int k)
    {
        this;
        JVM INSTR monitorenter ;
        ASN1Encodable asn1encodable;
        if (b != null)
        {
            j();
        }
        asn1encodable = super.a(k);
        this;
        JVM INSTR monitorexit ;
        return asn1encodable;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        if (b != null)
        {
            asn1outputstream.a(48, b);
            return;
        } else
        {
            super.g().a(asn1outputstream);
            return;
        }
    }

    public final Enumeration d()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        Object obj = super.d();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Enumeration) (obj));
_L2:
        obj = new g(b);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final int e()
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        if (b != null)
        {
            j();
        }
        k = super.e();
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        throw exception;
    }

    final ASN1Primitive f()
    {
        if (b != null)
        {
            j();
        }
        return super.f();
    }

    final ASN1Primitive g()
    {
        if (b != null)
        {
            j();
        }
        return super.g();
    }

    final int i()
    {
        if (b != null)
        {
            return org.spongycastle.asn1.j.a(b.length) + 1 + b.length;
        } else
        {
            return super.g().i();
        }
    }
}
