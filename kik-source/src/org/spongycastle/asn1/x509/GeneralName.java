// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.X500Name;

// Referenced classes of package org.spongycastle.asn1.x509:
//            X509Name

public class GeneralName extends ASN1Object
    implements ASN1Choice
{

    private ASN1Encodable a;
    private int b;

    public GeneralName(int i, ASN1Encodable asn1encodable)
    {
        a = asn1encodable;
        b = i;
    }

    public GeneralName(String s)
    {
        b = 1;
        a = new DERIA5String(s);
    }

    public GeneralName(X500Name x500name)
    {
        a = x500name;
        b = 4;
    }

    public GeneralName(X509Name x509name)
    {
        a = X500Name.a(x509name);
        b = 4;
    }

    public static GeneralName a(Object obj)
    {
        if (obj == null || (obj instanceof GeneralName))
        {
            return (GeneralName)obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) goto _L2; else goto _L1
_L1:
        ASN1TaggedObject asn1taggedobject;
        int i;
        asn1taggedobject = (ASN1TaggedObject)obj;
        i = asn1taggedobject.c();
        i;
        JVM INSTR tableswitch 0 8: default 84
    //                   0 114
    //                   1 128
    //                   2 141
    //                   3 154
    //                   4 178
    //                   5 191
    //                   6 205
    //                   7 218
    //                   8 231;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L2:
        throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(obj.getClass().getName()).toString());
_L3:
        return new GeneralName(i, ASN1Sequence.a(asn1taggedobject, false));
_L4:
        return new GeneralName(i, DERIA5String.a(asn1taggedobject));
_L5:
        return new GeneralName(i, DERIA5String.a(asn1taggedobject));
_L6:
        throw new IllegalArgumentException((new StringBuilder("unknown tag: ")).append(i).toString());
_L7:
        return new GeneralName(i, X500Name.a(asn1taggedobject));
_L8:
        return new GeneralName(i, ASN1Sequence.a(asn1taggedobject, false));
_L9:
        return new GeneralName(i, DERIA5String.a(asn1taggedobject));
_L10:
        return new GeneralName(i, ASN1OctetString.a(asn1taggedobject));
_L11:
        return new GeneralName(i, ASN1ObjectIdentifier.a(asn1taggedobject));
    }

    public static GeneralName a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1TaggedObject.a(asn1taggedobject));
    }

    public final ASN1Primitive a()
    {
        if (b == 4)
        {
            return new DERTaggedObject(true, b, a);
        } else
        {
            return new DERTaggedObject(false, b, a);
        }
    }

    public final int c()
    {
        return b;
    }

    public final ASN1Encodable d()
    {
        return a;
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        stringbuffer.append(b);
        stringbuffer.append(": ");
        b;
        JVM INSTR tableswitch 1 6: default 68
    //                   1 85
    //                   2 85
    //                   3 68
    //                   4 103
    //                   5 68
    //                   6 85;
           goto _L1 _L2 _L2 _L1 _L3 _L1 _L2
_L1:
        stringbuffer.append(a.toString());
_L5:
        return stringbuffer.toString();
_L2:
        stringbuffer.append(DERIA5String.a(a).o_());
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append(X500Name.a(a).toString());
        if (true) goto _L5; else goto _L4
_L4:
    }
}
