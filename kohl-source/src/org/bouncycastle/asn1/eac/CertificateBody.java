// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.io.IOException;
import java.io.PrintStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;

// Referenced classes of package org.bouncycastle.asn1.eac:
//            CertificationAuthorityReference, CertificateHolderReference, PackedDate, EACTags, 
//            PublicKeyDataObject, CertificateHolderAuthorization

public class CertificateBody extends ASN1Object
{

    private static final int CAR = 2;
    private static final int CEfD = 32;
    private static final int CExD = 64;
    private static final int CHA = 16;
    private static final int CHR = 8;
    private static final int CPI = 1;
    private static final int PK = 4;
    public static final int profileType = 127;
    public static final int requestType = 13;
    private DERApplicationSpecific certificateEffectiveDate;
    private DERApplicationSpecific certificateExpirationDate;
    private CertificateHolderAuthorization certificateHolderAuthorization;
    private DERApplicationSpecific certificateHolderReference;
    private DERApplicationSpecific certificateProfileIdentifier;
    private int certificateType;
    private DERApplicationSpecific certificationAuthorityReference;
    private PublicKeyDataObject publicKey;
    ASN1InputStream seq;

    private CertificateBody(DERApplicationSpecific derapplicationspecific)
        throws IOException
    {
        certificateType = 0;
        setIso7816CertificateBody(derapplicationspecific);
    }

    public CertificateBody(DERApplicationSpecific derapplicationspecific, CertificationAuthorityReference certificationauthorityreference, PublicKeyDataObject publickeydataobject, CertificateHolderReference certificateholderreference, CertificateHolderAuthorization certificateholderauthorization, PackedDate packeddate, PackedDate packeddate1)
    {
        certificateType = 0;
        setCertificateProfileIdentifier(derapplicationspecific);
        setCertificationAuthorityReference(new DERApplicationSpecific(2, certificationauthorityreference.getEncoded()));
        setPublicKey(publickeydataobject);
        setCertificateHolderReference(new DERApplicationSpecific(32, certificateholderreference.getEncoded()));
        setCertificateHolderAuthorization(certificateholderauthorization);
        try
        {
            setCertificateEffectiveDate(new DERApplicationSpecific(false, 37, new DEROctetString(packeddate.getEncoding())));
            setCertificateExpirationDate(new DERApplicationSpecific(false, 36, new DEROctetString(packeddate1.getEncoding())));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DERApplicationSpecific derapplicationspecific)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unable to encode dates: ").append(derapplicationspecific.getMessage()).toString());
        }
    }

    public static CertificateBody getInstance(Object obj)
        throws IOException
    {
        if (obj instanceof CertificateBody)
        {
            return (CertificateBody)obj;
        }
        if (obj != null)
        {
            return new CertificateBody(DERApplicationSpecific.getInstance(obj));
        } else
        {
            return null;
        }
    }

    private ASN1Primitive profileToASN1Object()
        throws IOException
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certificateProfileIdentifier);
        asn1encodablevector.add(certificationAuthorityReference);
        asn1encodablevector.add(new DERApplicationSpecific(false, 73, publicKey));
        asn1encodablevector.add(certificateHolderReference);
        asn1encodablevector.add(certificateHolderAuthorization);
        asn1encodablevector.add(certificateEffectiveDate);
        asn1encodablevector.add(certificateExpirationDate);
        return new DERApplicationSpecific(78, asn1encodablevector);
    }

    private ASN1Primitive requestToASN1Object()
        throws IOException
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certificateProfileIdentifier);
        asn1encodablevector.add(new DERApplicationSpecific(false, 73, publicKey));
        asn1encodablevector.add(certificateHolderReference);
        return new DERApplicationSpecific(78, asn1encodablevector);
    }

    private void setCertificateEffectiveDate(DERApplicationSpecific derapplicationspecific)
        throws IllegalArgumentException
    {
        if (derapplicationspecific.getApplicationTag() == 37)
        {
            certificateEffectiveDate = derapplicationspecific;
            certificateType = certificateType | 0x20;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not an Iso7816Tags.APPLICATION_EFFECTIVE_DATE tag :").append(EACTags.encodeTag(derapplicationspecific)).toString());
        }
    }

    private void setCertificateExpirationDate(DERApplicationSpecific derapplicationspecific)
        throws IllegalArgumentException
    {
        if (derapplicationspecific.getApplicationTag() == 36)
        {
            certificateExpirationDate = derapplicationspecific;
            certificateType = certificateType | 0x40;
            return;
        } else
        {
            throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EXPIRATION_DATE tag");
        }
    }

    private void setCertificateHolderAuthorization(CertificateHolderAuthorization certificateholderauthorization)
    {
        certificateHolderAuthorization = certificateholderauthorization;
        certificateType = certificateType | 0x10;
    }

    private void setCertificateHolderReference(DERApplicationSpecific derapplicationspecific)
        throws IllegalArgumentException
    {
        if (derapplicationspecific.getApplicationTag() == 32)
        {
            certificateHolderReference = derapplicationspecific;
            certificateType = certificateType | 8;
            return;
        } else
        {
            throw new IllegalArgumentException("Not an Iso7816Tags.CARDHOLDER_NAME tag");
        }
    }

    private void setCertificateProfileIdentifier(DERApplicationSpecific derapplicationspecific)
        throws IllegalArgumentException
    {
        if (derapplicationspecific.getApplicationTag() == 41)
        {
            certificateProfileIdentifier = derapplicationspecific;
            certificateType = certificateType | 1;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not an Iso7816Tags.INTERCHANGE_PROFILE tag :").append(EACTags.encodeTag(derapplicationspecific)).toString());
        }
    }

    private void setCertificationAuthorityReference(DERApplicationSpecific derapplicationspecific)
        throws IllegalArgumentException
    {
        if (derapplicationspecific.getApplicationTag() == 2)
        {
            certificationAuthorityReference = derapplicationspecific;
            certificateType = certificateType | 2;
            return;
        } else
        {
            throw new IllegalArgumentException("Not an Iso7816Tags.ISSUER_IDENTIFICATION_NUMBER tag");
        }
    }

    private void setIso7816CertificateBody(DERApplicationSpecific derapplicationspecific)
        throws IOException
    {
        if (derapplicationspecific.getApplicationTag() == 78)
        {
            ASN1InputStream asn1inputstream = new ASN1InputStream(derapplicationspecific.getContents());
            do
            {
                Object obj = asn1inputstream.readObject();
                if (obj != null)
                {
                    if (obj instanceof DERApplicationSpecific)
                    {
                        obj = (DERApplicationSpecific)obj;
                        switch (((DERApplicationSpecific) (obj)).getApplicationTag())
                        {
                        default:
                            certificateType = 0;
                            throw new IOException((new StringBuilder()).append("Not a valid iso7816 DERApplicationSpecific tag ").append(((DERApplicationSpecific) (obj)).getApplicationTag()).toString());

                        case 41: // ')'
                            setCertificateProfileIdentifier(((DERApplicationSpecific) (obj)));
                            break;

                        case 2: // '\002'
                            setCertificationAuthorityReference(((DERApplicationSpecific) (obj)));
                            break;

                        case 73: // 'I'
                            setPublicKey(PublicKeyDataObject.getInstance(((DERApplicationSpecific) (obj)).getObject(16)));
                            break;

                        case 32: // ' '
                            setCertificateHolderReference(((DERApplicationSpecific) (obj)));
                            break;

                        case 76: // 'L'
                            setCertificateHolderAuthorization(new CertificateHolderAuthorization(((DERApplicationSpecific) (obj))));
                            break;

                        case 37: // '%'
                            setCertificateEffectiveDate(((DERApplicationSpecific) (obj)));
                            break;

                        case 36: // '$'
                            setCertificateExpirationDate(((DERApplicationSpecific) (obj)));
                            break;
                        }
                    } else
                    {
                        throw new IOException((new StringBuilder()).append("Not a valid iso7816 content : not a DERApplicationSpecific Object :").append(EACTags.encodeTag(derapplicationspecific)).append(obj.getClass()).toString());
                    }
                } else
                {
                    return;
                }
            } while (true);
        } else
        {
            throw new IOException("Bad tag : not an iso7816 CERTIFICATE_CONTENT_TEMPLATE");
        }
    }

    private void setPublicKey(PublicKeyDataObject publickeydataobject)
    {
        publicKey = PublicKeyDataObject.getInstance(publickeydataobject);
        certificateType = certificateType | 4;
    }

    public PackedDate getCertificateEffectiveDate()
    {
        if ((certificateType & 0x20) == 32)
        {
            return new PackedDate(certificateEffectiveDate.getContents());
        } else
        {
            return null;
        }
    }

    public PackedDate getCertificateExpirationDate()
        throws IOException
    {
        if ((certificateType & 0x40) == 64)
        {
            return new PackedDate(certificateExpirationDate.getContents());
        } else
        {
            throw new IOException("certificate Expiration Date not set");
        }
    }

    public CertificateHolderAuthorization getCertificateHolderAuthorization()
        throws IOException
    {
        if ((certificateType & 0x10) == 16)
        {
            return certificateHolderAuthorization;
        } else
        {
            throw new IOException("Certificate Holder Authorisation not set");
        }
    }

    public CertificateHolderReference getCertificateHolderReference()
    {
        return new CertificateHolderReference(certificateHolderReference.getContents());
    }

    public DERApplicationSpecific getCertificateProfileIdentifier()
    {
        return certificateProfileIdentifier;
    }

    public int getCertificateType()
    {
        return certificateType;
    }

    public CertificationAuthorityReference getCertificationAuthorityReference()
        throws IOException
    {
        if ((certificateType & 2) == 2)
        {
            return new CertificationAuthorityReference(certificationAuthorityReference.getContents());
        } else
        {
            throw new IOException("Certification authority reference not set");
        }
    }

    public PublicKeyDataObject getPublicKey()
    {
        return publicKey;
    }

    public ASN1Primitive toASN1Primitive()
    {
label0:
        {
            ASN1Primitive asn1primitive;
            try
            {
                if (certificateType == 127)
                {
                    return profileToASN1Object();
                }
                if (certificateType != 13)
                {
                    break label0;
                }
                asn1primitive = requestToASN1Object();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                return null;
            }
            return asn1primitive;
        }
        System.err.println("returning null");
        return null;
    }
}
