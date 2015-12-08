// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x500.DirectoryString;

public class NamingAuthority extends ASN1Object
{

    public static final ASN1ObjectIdentifier id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern;
    private ASN1ObjectIdentifier namingAuthorityId;
    private DirectoryString namingAuthorityText;
    private String namingAuthorityUrl;

    public NamingAuthority(ASN1ObjectIdentifier asn1objectidentifier, String s, DirectoryString directorystring)
    {
        namingAuthorityId = asn1objectidentifier;
        namingAuthorityUrl = s;
        namingAuthorityText = directorystring;
    }

    private NamingAuthority(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        asn1sequence = asn1sequence.getObjects();
        ASN1Encodable asn1encodable;
        if (asn1sequence.hasMoreElements())
        {
            asn1encodable = (ASN1Encodable)asn1sequence.nextElement();
            if (asn1encodable instanceof ASN1ObjectIdentifier)
            {
                namingAuthorityId = (ASN1ObjectIdentifier)asn1encodable;
            } else
            if (asn1encodable instanceof DERIA5String)
            {
                namingAuthorityUrl = DERIA5String.getInstance(asn1encodable).getString();
            } else
            if (asn1encodable instanceof ASN1String)
            {
                namingAuthorityText = DirectoryString.getInstance(asn1encodable);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad object encountered: ").append(asn1encodable.getClass()).toString());
            }
        }
        do
        {
label0:
            {
                if (asn1sequence.hasMoreElements())
                {
                    asn1encodable = (ASN1Encodable)asn1sequence.nextElement();
                    if (asn1encodable instanceof DERIA5String)
                    {
                        namingAuthorityUrl = DERIA5String.getInstance(asn1encodable).getString();
                    } else
                    if (asn1encodable instanceof ASN1String)
                    {
                        namingAuthorityText = DirectoryString.getInstance(asn1encodable);
                    } else
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Bad object encountered: ").append(asn1encodable.getClass()).toString());
                    }
                }
                if (asn1sequence.hasMoreElements())
                {
                    asn1sequence = (ASN1Encodable)asn1sequence.nextElement();
                    if (!(asn1sequence instanceof ASN1String))
                    {
                        break label0;
                    }
                    namingAuthorityText = DirectoryString.getInstance(asn1sequence);
                }
                return;
            }
            throw new IllegalArgumentException((new StringBuilder()).append("Bad object encountered: ").append(asn1sequence.getClass()).toString());
        } while (true);
    }

    public NamingAuthority(DERObjectIdentifier derobjectidentifier, String s, DirectoryString directorystring)
    {
        namingAuthorityId = new ASN1ObjectIdentifier(derobjectidentifier.getId());
        namingAuthorityUrl = s;
        namingAuthorityText = directorystring;
    }

    public static NamingAuthority getInstance(Object obj)
    {
        if (obj == null || (obj instanceof NamingAuthority))
        {
            return (NamingAuthority)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new NamingAuthority((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static NamingAuthority getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1ObjectIdentifier getNamingAuthorityId()
    {
        return namingAuthorityId;
    }

    public DirectoryString getNamingAuthorityText()
    {
        return namingAuthorityText;
    }

    public String getNamingAuthorityUrl()
    {
        return namingAuthorityUrl;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (namingAuthorityId != null)
        {
            asn1encodablevector.add(namingAuthorityId);
        }
        if (namingAuthorityUrl != null)
        {
            asn1encodablevector.add(new DERIA5String(namingAuthorityUrl, true));
        }
        if (namingAuthorityText != null)
        {
            asn1encodablevector.add(namingAuthorityText);
        }
        return new DERSequence(asn1encodablevector);
    }

    static 
    {
        id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern = new ASN1ObjectIdentifier((new StringBuilder()).append(ISISMTTObjectIdentifiers.id_isismtt_at_namingAuthorities).append(".1").toString());
    }
}
