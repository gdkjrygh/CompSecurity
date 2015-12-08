// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.isismtt.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.isismtt.x509:
//            NamingAuthority

public class ProfessionInfo extends ASN1Object
{

    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;
    public static final ASN1ObjectIdentifier j;
    public static final ASN1ObjectIdentifier k;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier m;
    public static final ASN1ObjectIdentifier n;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier p;
    public static final ASN1ObjectIdentifier q;
    public static final ASN1ObjectIdentifier r;
    public static final ASN1ObjectIdentifier s;
    private NamingAuthority t;
    private ASN1Sequence u;
    private ASN1Sequence v;
    private String w;
    private ASN1OctetString x;

    public final ASN1Primitive a()
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
        a = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".1").toString());
        b = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".2").toString());
        c = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".3").toString());
        d = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".4").toString());
        e = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".5").toString());
        f = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".6").toString());
        g = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".7").toString());
        h = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".8").toString());
        i = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".9").toString());
        j = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".10").toString());
        k = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".11").toString());
        l = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".12").toString());
        m = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".13").toString());
        n = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".14").toString());
        o = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".15").toString());
        p = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".16").toString());
        q = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".17").toString());
        r = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".18").toString());
        s = new ASN1ObjectIdentifier((new StringBuilder()).append(NamingAuthority.a).append(".19").toString());
    }
}
