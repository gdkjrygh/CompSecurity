// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            BEROctetString

class counter
    implements Enumeration
{

    int counter;
    final BEROctetString this$0;

    public boolean hasMoreElements()
    {
        return counter < BEROctetString.access$000(BEROctetString.this).length;
    }

    public Object nextElement()
    {
        ASN1OctetString aasn1octetstring[] = BEROctetString.access$000(BEROctetString.this);
        int i = counter;
        counter = i + 1;
        return aasn1octetstring[i];
    }

    ()
    {
        this$0 = BEROctetString.this;
        super();
        counter = 0;
    }
}
