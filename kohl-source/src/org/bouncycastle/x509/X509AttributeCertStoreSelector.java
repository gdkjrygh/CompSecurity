// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.Target;
import org.bouncycastle.asn1.x509.TargetInformation;
import org.bouncycastle.asn1.x509.Targets;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.util.Selector;

// Referenced classes of package org.bouncycastle.x509:
//            X509AttributeCertificate, AttributeCertificateHolder, AttributeCertificateIssuer

public class X509AttributeCertStoreSelector
    implements Selector
{

    private X509AttributeCertificate attributeCert;
    private Date attributeCertificateValid;
    private AttributeCertificateHolder holder;
    private AttributeCertificateIssuer issuer;
    private BigInteger serialNumber;
    private Collection targetGroups;
    private Collection targetNames;

    public X509AttributeCertStoreSelector()
    {
        targetNames = new HashSet();
        targetGroups = new HashSet();
    }

    private Set extractGeneralNames(Collection collection)
        throws IOException
    {
        if (collection == null || collection.isEmpty())
        {
            return new HashSet();
        }
        HashSet hashset = new HashSet();
        for (collection = collection.iterator(); collection.hasNext();)
        {
            Object obj = collection.next();
            if (obj instanceof GeneralName)
            {
                hashset.add(obj);
            } else
            {
                hashset.add(GeneralName.getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])obj)));
            }
        }

        return hashset;
    }

    public void addTargetGroup(GeneralName generalname)
    {
        targetGroups.add(generalname);
    }

    public void addTargetGroup(byte abyte0[])
        throws IOException
    {
        addTargetGroup(GeneralName.getInstance(ASN1Primitive.fromByteArray(abyte0)));
    }

    public void addTargetName(GeneralName generalname)
    {
        targetNames.add(generalname);
    }

    public void addTargetName(byte abyte0[])
        throws IOException
    {
        addTargetName(GeneralName.getInstance(ASN1Primitive.fromByteArray(abyte0)));
    }

    public Object clone()
    {
        X509AttributeCertStoreSelector x509attributecertstoreselector = new X509AttributeCertStoreSelector();
        x509attributecertstoreselector.attributeCert = attributeCert;
        x509attributecertstoreselector.attributeCertificateValid = getAttributeCertificateValid();
        x509attributecertstoreselector.holder = holder;
        x509attributecertstoreselector.issuer = issuer;
        x509attributecertstoreselector.serialNumber = serialNumber;
        x509attributecertstoreselector.targetGroups = getTargetGroups();
        x509attributecertstoreselector.targetNames = getTargetNames();
        return x509attributecertstoreselector;
    }

    public X509AttributeCertificate getAttributeCert()
    {
        return attributeCert;
    }

    public Date getAttributeCertificateValid()
    {
        if (attributeCertificateValid != null)
        {
            return new Date(attributeCertificateValid.getTime());
        } else
        {
            return null;
        }
    }

    public AttributeCertificateHolder getHolder()
    {
        return holder;
    }

    public AttributeCertificateIssuer getIssuer()
    {
        return issuer;
    }

    public BigInteger getSerialNumber()
    {
        return serialNumber;
    }

    public Collection getTargetGroups()
    {
        return Collections.unmodifiableCollection(targetGroups);
    }

    public Collection getTargetNames()
    {
        return Collections.unmodifiableCollection(targetNames);
    }

    public boolean match(Object obj)
    {
        if (obj instanceof X509AttributeCertificate) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (X509AttributeCertificate)obj;
        if (attributeCert != null && !attributeCert.equals(obj) || serialNumber != null && !((X509AttributeCertificate) (obj)).getSerialNumber().equals(serialNumber) || holder != null && !((X509AttributeCertificate) (obj)).getHolder().equals(holder) || issuer != null && !((X509AttributeCertificate) (obj)).getIssuer().equals(issuer)) goto _L1; else goto _L3
_L3:
        Target atarget[];
        int i;
        boolean flag;
        boolean flag1;
        int j;
        if (attributeCertificateValid != null)
        {
            try
            {
                ((X509AttributeCertificate) (obj)).checkValidity(attributeCertificateValid);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
        }
        if (targetNames.isEmpty() && targetGroups.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((X509AttributeCertificate) (obj)).getExtensionValue(X509Extensions.TargetInformation.getId());
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            obj = TargetInformation.getInstance((new ASN1InputStream(((DEROctetString)DEROctetString.fromByteArray(((byte []) (obj)))).getOctets())).readObject());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        obj = ((TargetInformation) (obj)).getTargetsObjects();
        if (targetNames.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        flag = false;
        if (i >= obj.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        atarget = obj[i].getTargets();
        j = 0;
        do
        {
label0:
            {
                flag1 = flag;
                if (j < atarget.length)
                {
                    if (!targetNames.contains(GeneralName.getInstance(atarget[j].getTargetName())))
                    {
                        break label0;
                    }
                    flag1 = true;
                }
                i++;
                flag = flag1;
            }
            if (true)
            {
                break MISSING_BLOCK_LABEL_205;
            }
            j++;
        } while (true);
        if (true)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (!flag) goto _L1; else goto _L4
_L4:
        if (targetGroups.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
        flag = false;
        do
        {
            if (i >= obj.length)
            {
                continue; /* Loop/switch isn't completed */
            }
            atarget = obj[i].getTargets();
            j = 0;
            do
            {
label1:
                {
                    flag1 = flag;
                    if (j < atarget.length)
                    {
                        if (!targetGroups.contains(GeneralName.getInstance(atarget[j].getTargetGroup())))
                        {
                            break label1;
                        }
                        flag1 = true;
                    }
                    i++;
                    flag = flag1;
                }
                if (true)
                {
                    break;
                }
                j++;
            } while (true);
        } while (true);
        if (!flag) goto _L1; else goto _L5
_L5:
        return true;
    }

    public void setAttributeCert(X509AttributeCertificate x509attributecertificate)
    {
        attributeCert = x509attributecertificate;
    }

    public void setAttributeCertificateValid(Date date)
    {
        if (date != null)
        {
            attributeCertificateValid = new Date(date.getTime());
            return;
        } else
        {
            attributeCertificateValid = null;
            return;
        }
    }

    public void setHolder(AttributeCertificateHolder attributecertificateholder)
    {
        holder = attributecertificateholder;
    }

    public void setIssuer(AttributeCertificateIssuer attributecertificateissuer)
    {
        issuer = attributecertificateissuer;
    }

    public void setSerialNumber(BigInteger biginteger)
    {
        serialNumber = biginteger;
    }

    public void setTargetGroups(Collection collection)
        throws IOException
    {
        targetGroups = extractGeneralNames(collection);
    }

    public void setTargetNames(Collection collection)
        throws IOException
    {
        targetNames = extractGeneralNames(collection);
    }
}
