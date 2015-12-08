// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.Holder;
import org.bouncycastle.asn1.x509.IssuerSerial;
import org.bouncycastle.asn1.x509.ObjectDigestInfo;
import org.bouncycastle.jce.PrincipalUtil;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

// Referenced classes of package org.bouncycastle.x509:
//            X509Util

public class AttributeCertificateHolder
    implements CertSelector, Selector
{

    final Holder holder;

    public AttributeCertificateHolder(int i, String s, String s1, byte abyte0[])
    {
        holder = new Holder(new ObjectDigestInfo(i, new ASN1ObjectIdentifier(s1), new AlgorithmIdentifier(s), Arrays.clone(abyte0)));
    }

    public AttributeCertificateHolder(X509Certificate x509certificate)
        throws CertificateParsingException
    {
        X509Principal x509principal;
        try
        {
            x509principal = PrincipalUtil.getIssuerX509Principal(x509certificate);
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            throw new CertificateParsingException(x509certificate.getMessage());
        }
        holder = new Holder(new IssuerSerial(generateGeneralNames(x509principal), new ASN1Integer(x509certificate.getSerialNumber())));
    }

    public AttributeCertificateHolder(X500Principal x500principal)
    {
        this(X509Util.convertPrincipal(x500principal));
    }

    public AttributeCertificateHolder(X500Principal x500principal, BigInteger biginteger)
    {
        this(X509Util.convertPrincipal(x500principal), biginteger);
    }

    AttributeCertificateHolder(ASN1Sequence asn1sequence)
    {
        holder = Holder.getInstance(asn1sequence);
    }

    public AttributeCertificateHolder(X509Principal x509principal)
    {
        holder = new Holder(generateGeneralNames(x509principal));
    }

    public AttributeCertificateHolder(X509Principal x509principal, BigInteger biginteger)
    {
        holder = new Holder(new IssuerSerial(GeneralNames.getInstance(new DERSequence(new GeneralName(x509principal))), new ASN1Integer(biginteger)));
    }

    private GeneralNames generateGeneralNames(X509Principal x509principal)
    {
        return GeneralNames.getInstance(new DERSequence(new GeneralName(x509principal)));
    }

    private Object[] getNames(GeneralName ageneralname[])
    {
        ArrayList arraylist = new ArrayList(ageneralname.length);
        int i = 0;
        while (i != ageneralname.length) 
        {
            if (ageneralname[i].getTagNo() == 4)
            {
                try
                {
                    arraylist.add(new X500Principal(ageneralname[i].getName().toASN1Primitive().getEncoded()));
                }
                // Misplaced declaration of an exception variable
                catch (GeneralName ageneralname[])
                {
                    throw new RuntimeException("badly formed Name object");
                }
            }
            i++;
        }
        return arraylist.toArray(new Object[arraylist.size()]);
    }

    private Principal[] getPrincipals(GeneralNames generalnames)
    {
        generalnames = ((GeneralNames) (getNames(generalnames.getNames())));
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i != generalnames.length; i++)
        {
            if (generalnames[i] instanceof Principal)
            {
                arraylist.add(generalnames[i]);
            }
        }

        return (Principal[])(Principal[])arraylist.toArray(new Principal[arraylist.size()]);
    }

    private boolean matchesDN(X509Principal x509principal, GeneralNames generalnames)
    {
        int i;
        boolean flag1;
        flag1 = false;
        generalnames = generalnames.getNames();
        i = 0;
_L2:
        GeneralName generalname;
        boolean flag;
        flag = flag1;
        if (i == generalnames.length)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        generalname = generalnames[i];
        if (generalname.getTagNo() != 4)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        flag = (new X509Principal(generalname.getName().toASN1Primitive().getEncoded())).equals(x509principal);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        flag = true;
        return flag;
        IOException ioexception;
        ioexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object clone()
    {
        return new AttributeCertificateHolder((ASN1Sequence)holder.toASN1Object());
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof AttributeCertificateHolder))
        {
            return false;
        } else
        {
            obj = (AttributeCertificateHolder)obj;
            return holder.equals(((AttributeCertificateHolder) (obj)).holder);
        }
    }

    public String getDigestAlgorithm()
    {
        if (holder.getObjectDigestInfo() != null)
        {
            return holder.getObjectDigestInfo().getDigestAlgorithm().getObjectId().getId();
        } else
        {
            return null;
        }
    }

    public int getDigestedObjectType()
    {
        if (holder.getObjectDigestInfo() != null)
        {
            return holder.getObjectDigestInfo().getDigestedObjectType().getValue().intValue();
        } else
        {
            return -1;
        }
    }

    public Principal[] getEntityNames()
    {
        if (holder.getEntityName() != null)
        {
            return getPrincipals(holder.getEntityName());
        } else
        {
            return null;
        }
    }

    public Principal[] getIssuer()
    {
        if (holder.getBaseCertificateID() != null)
        {
            return getPrincipals(holder.getBaseCertificateID().getIssuer());
        } else
        {
            return null;
        }
    }

    public byte[] getObjectDigest()
    {
        if (holder.getObjectDigestInfo() != null)
        {
            return holder.getObjectDigestInfo().getObjectDigest().getBytes();
        } else
        {
            return null;
        }
    }

    public String getOtherObjectTypeID()
    {
        if (holder.getObjectDigestInfo() != null)
        {
            holder.getObjectDigestInfo().getOtherObjectTypeID().getId();
        }
        return null;
    }

    public BigInteger getSerialNumber()
    {
        if (holder.getBaseCertificateID() != null)
        {
            return holder.getBaseCertificateID().getSerial().getValue();
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        return holder.hashCode();
    }

    public boolean match(Object obj)
    {
        if (!(obj instanceof X509Certificate))
        {
            return false;
        } else
        {
            return match((Certificate)obj);
        }
    }

    public boolean match(Certificate certificate)
    {
        if (certificate instanceof X509Certificate) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj = (X509Certificate)certificate;
        if (holder.getBaseCertificateID() != null)
        {
            boolean flag;
            if (holder.getBaseCertificateID().getSerial().getValue().equals(((X509Certificate) (obj)).getSerialNumber()) && matchesDN(PrincipalUtil.getIssuerX509Principal(((X509Certificate) (obj))), holder.getBaseCertificateID().getIssuer()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            break; /* Loop/switch isn't completed */
        }
        if (holder.getEntityName() != null && matchesDN(PrincipalUtil.getSubjectX509Principal(((X509Certificate) (obj))), holder.getEntityName()))
        {
            return true;
        }
        try
        {
            obj = holder.getObjectDigestInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            return false;
        }
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj = MessageDigest.getInstance(getDigestAlgorithm(), "BC");
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            return false;
        }
        getDigestedObjectType();
        JVM INSTR tableswitch 0 1: default 205
    //                   0 168
    //                   1 184;
           goto _L3 _L4 _L5
_L3:
        if (!Arrays.areEqual(((MessageDigest) (obj)).digest(), getObjectDigest()))
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L4:
        ((MessageDigest) (obj)).update(certificate.getPublicKey().getEncoded());
        continue; /* Loop/switch isn't completed */
_L5:
        ((MessageDigest) (obj)).update(certificate.getEncoded());
        if (true) goto _L3; else goto _L6
_L6:
        if (true) goto _L1; else goto _L7
_L7:
        return flag;
    }
}
