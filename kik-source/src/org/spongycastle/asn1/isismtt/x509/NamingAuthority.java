// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.isismtt.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.spongycastle.asn1.x500.DirectoryString;

public class NamingAuthority extends ASN1Object
{

    public static final ASN1ObjectIdentifier a;
    private ASN1ObjectIdentifier b;
    private String c;
    private DirectoryString d;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (b != null)
        {
            asn1encodablevector.a(b);
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERIA5String(c, true));
        }
        if (d != null)
        {
            asn1encodablevector.a(d);
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        a = new ASN1ObjectIdentifier((new StringBuilder()).append(ISISMTTObjectIdentifiers.o).append(".1").toString());
    }
}
