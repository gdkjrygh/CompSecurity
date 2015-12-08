// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.isismtt.x509:
//            NamingAuthority

public class ProfessionInfo extends ASN1Encodable
{

    public static final DERObjectIdentifier a;
    public static final DERObjectIdentifier b;
    public static final DERObjectIdentifier c;
    public static final DERObjectIdentifier d;
    public static final DERObjectIdentifier e;
    public static final DERObjectIdentifier f;
    public static final DERObjectIdentifier g;
    public static final DERObjectIdentifier h;
    public static final DERObjectIdentifier i;
    public static final DERObjectIdentifier j;
    public static final DERObjectIdentifier k;
    public static final DERObjectIdentifier l;
    public static final DERObjectIdentifier m;
    public static final DERObjectIdentifier n;
    public static final DERObjectIdentifier o;
    public static final DERObjectIdentifier p;
    public static final DERObjectIdentifier q;
    public static final DERObjectIdentifier r;
    public static final DERObjectIdentifier s;
    private NamingAuthority t;
    private ASN1Sequence u;
    private ASN1Sequence v;
    private String w;
    private ASN1OctetString x;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (t != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, t));
        }
        asn1encodablevector.a(u);
        if (v != null)
        {
            asn1encodablevector.a(v);
        }
        if (w != null)
        {
            asn1encodablevector.a(new DERPrintableString(w, true));
        }
        if (x != null)
        {
            asn1encodablevector.a(x);
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        a = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".1").toString());
        b = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".2").toString());
        c = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".3").toString());
        d = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".4").toString());
        e = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".5").toString());
        f = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".6").toString());
        g = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".7").toString());
        h = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".8").toString());
        i = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".9").toString());
        j = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".10").toString());
        k = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".11").toString());
        l = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".12").toString());
        m = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".13").toString());
        n = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".14").toString());
        o = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".15").toString());
        p = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".16").toString());
        q = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".17").toString());
        r = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".18").toString());
        s = new DERObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".19").toString());
    }
}
