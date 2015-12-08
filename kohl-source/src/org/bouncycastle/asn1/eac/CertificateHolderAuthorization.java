// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;

// Referenced classes of package org.bouncycastle.asn1.eac:
//            EACObjectIdentifiers, BidirectionalMap, EACTags

public class CertificateHolderAuthorization extends ASN1Object
{

    static BidirectionalMap AuthorizationRole;
    public static final int CVCA = 192;
    public static final int DV_DOMESTIC = 128;
    public static final int DV_FOREIGN = 64;
    public static final int IS = 0;
    public static final int RADG3 = 1;
    public static final int RADG4 = 2;
    static Hashtable ReverseMap = new Hashtable();
    static Hashtable RightsDecodeMap;
    public static final ASN1ObjectIdentifier id_role_EAC;
    DERApplicationSpecific accessRights;
    ASN1ObjectIdentifier oid;

    public CertificateHolderAuthorization(ASN1ObjectIdentifier asn1objectidentifier, int i)
        throws IOException
    {
        setOid(asn1objectidentifier);
        setAccessRights((byte)i);
    }

    public CertificateHolderAuthorization(DERApplicationSpecific derapplicationspecific)
        throws IOException
    {
        if (derapplicationspecific.getApplicationTag() == 76)
        {
            setPrivateData(new ASN1InputStream(derapplicationspecific.getContents()));
        }
    }

    public static int GetFlag(String s)
    {
        Integer integer = (Integer)AuthorizationRole.getReverse(s);
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown value ").append(s).toString());
        } else
        {
            return integer.intValue();
        }
    }

    public static String GetRoleDescription(int i)
    {
        return (String)AuthorizationRole.get(new Integer(i));
    }

    private void setAccessRights(byte byte0)
    {
        accessRights = new DERApplicationSpecific(EACTags.getTag(83), new byte[] {
            byte0
        });
    }

    private void setOid(ASN1ObjectIdentifier asn1objectidentifier)
    {
        oid = asn1objectidentifier;
    }

    private void setPrivateData(ASN1InputStream asn1inputstream)
        throws IOException
    {
        ASN1Primitive asn1primitive = asn1inputstream.readObject();
        if (asn1primitive instanceof ASN1ObjectIdentifier)
        {
            oid = (ASN1ObjectIdentifier)asn1primitive;
            asn1inputstream = asn1inputstream.readObject();
            if (asn1inputstream instanceof DERApplicationSpecific)
            {
                accessRights = (DERApplicationSpecific)asn1inputstream;
                return;
            } else
            {
                throw new IllegalArgumentException("No access rights in CerticateHolderAuthorization");
            }
        } else
        {
            throw new IllegalArgumentException("no Oid in CerticateHolderAuthorization");
        }
    }

    public int getAccessRights()
    {
        return accessRights.getContents()[0] & 0xff;
    }

    public ASN1ObjectIdentifier getOid()
    {
        return oid;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(oid);
        asn1encodablevector.add(accessRights);
        return new DERApplicationSpecific(76, asn1encodablevector);
    }

    static 
    {
        id_role_EAC = EACObjectIdentifiers.bsi_de.branch("3.1.2.1");
        RightsDecodeMap = new Hashtable();
        AuthorizationRole = new BidirectionalMap();
        RightsDecodeMap.put(new Integer(2), "RADG4");
        RightsDecodeMap.put(new Integer(1), "RADG3");
        AuthorizationRole.put(new Integer(192), "CVCA");
        AuthorizationRole.put(new Integer(128), "DV_DOMESTIC");
        AuthorizationRole.put(new Integer(64), "DV_FOREIGN");
        AuthorizationRole.put(new Integer(0), "IS");
    }
}
