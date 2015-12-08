// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509.extension;

import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;

public class X509ExtensionUtil
{

    public X509ExtensionUtil()
    {
    }

    public static ASN1Primitive a(byte abyte0[])
    {
        return ASN1Primitive.a(((ASN1OctetString)ASN1Primitive.a(abyte0)).d());
    }
}
