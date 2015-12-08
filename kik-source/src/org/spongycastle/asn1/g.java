// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1InputStream, ASN1ParsingException

final class g
    implements Enumeration
{

    private ASN1InputStream a;
    private Object b;

    public g(byte abyte0[])
    {
        a = new ASN1InputStream(abyte0, (byte)0);
        b = a();
    }

    private Object a()
    {
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = a.b();
        }
        catch (IOException ioexception)
        {
            throw new ASN1ParsingException((new StringBuilder("malformed DER construction: ")).append(ioexception).toString(), ioexception);
        }
        return asn1primitive;
    }

    public final boolean hasMoreElements()
    {
        return b != null;
    }

    public final Object nextElement()
    {
        Object obj = b;
        b = a();
        return obj;
    }
}
