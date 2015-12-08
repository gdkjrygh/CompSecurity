// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509.extension;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;

public class X509ExtensionUtil
{

    public X509ExtensionUtil()
    {
    }

    public static ASN1Object a(byte abyte0[])
    {
        return ASN1Object.a(((ASN1OctetString)ASN1Object.a(abyte0)).f());
    }
}
