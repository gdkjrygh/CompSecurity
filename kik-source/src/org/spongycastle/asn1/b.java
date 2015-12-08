// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.spongycastle.asn1:
//            BEROctetString

final class b
    implements Enumeration
{

    int a;
    final BEROctetString b;

    b(BEROctetString beroctetstring)
    {
        b = beroctetstring;
        super();
        a = 0;
    }

    public final boolean hasMoreElements()
    {
        return a < BEROctetString.a(b).length;
    }

    public final Object nextElement()
    {
        ASN1OctetString aasn1octetstring[] = BEROctetString.a(b);
        int i = a;
        a = i + 1;
        return aasn1octetstring[i];
    }
}
