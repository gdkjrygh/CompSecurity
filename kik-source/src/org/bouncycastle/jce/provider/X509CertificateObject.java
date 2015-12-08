// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.NetscapeCertType;
import org.bouncycastle.asn1.misc.NetscapeRevocationURL;
import org.bouncycastle.asn1.misc.VerisignCzagExtension;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.jce.provider:
//            e, i, JDKKeyFactory, BouncyCastleProvider, 
//            RFC3280CertPathUtilities

public class X509CertificateObject extends X509Certificate
    implements PKCS12BagAttributeCarrier
{

    private X509CertificateStructure a;
    private BasicConstraints b;
    private boolean c[];
    private boolean d;
    private int e;
    private PKCS12BagAttributeCarrier f;

    public X509CertificateObject(X509CertificateStructure x509certificatestructure)
    {
        int j;
        int k;
        j = 9;
        super();
        f = new e();
        a = x509certificatestructure;
        DERBitString derbitstring;
        boolean aflag[];
        try
        {
            x509certificatestructure = a("2.5.29.19");
        }
        // Misplaced declaration of an exception variable
        catch (X509CertificateStructure x509certificatestructure)
        {
            throw new CertificateParsingException((new StringBuilder("cannot construct BasicConstraints: ")).append(x509certificatestructure).toString());
        }
        if (x509certificatestructure == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        b = BasicConstraints.a(ASN1Object.a(x509certificatestructure));
        try
        {
            x509certificatestructure = a("2.5.29.15");
        }
        // Misplaced declaration of an exception variable
        catch (X509CertificateStructure x509certificatestructure)
        {
            throw new CertificateParsingException((new StringBuilder("cannot construct KeyUsage: ")).append(x509certificatestructure).toString());
        }
        if (x509certificatestructure == null) goto _L2; else goto _L1
_L1:
        derbitstring = DERBitString.a(ASN1Object.a(x509certificatestructure));
        x509certificatestructure = derbitstring.e();
        k = x509certificatestructure.length * 8 - derbitstring.f();
        if (k >= 9)
        {
            j = k;
        }
        c = new boolean[j];
        j = 0;
_L4:
        if (j == k)
        {
            break; /* Loop/switch isn't completed */
        }
        aflag = c;
        boolean flag;
        if ((x509certificatestructure[j / 8] & 128 >>> j % 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aflag[j] = flag;
        j++;
        if (true) goto _L4; else goto _L3
_L2:
        c = null;
_L3:
    }

    private int a()
    {
        byte abyte0[] = getEncoded();
        int j;
        int k;
        k = 1;
        j = 0;
_L2:
        int l;
        l = k;
        k = j;
        if (l >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        byte byte0 = abyte0[l];
        k = l + 1;
        j = byte0 * l + j;
        if (true) goto _L2; else goto _L1
        CertificateEncodingException certificateencodingexception;
        certificateencodingexception;
        k = 0;
_L1:
        return k;
    }

    private void a(PublicKey publickey, Signature signature)
    {
        AlgorithmIdentifier algorithmidentifier;
        AlgorithmIdentifier algorithmidentifier1;
        boolean flag;
        flag = false;
        algorithmidentifier = a.m();
        algorithmidentifier1 = a.e().e();
        if (algorithmidentifier.e().equals(algorithmidentifier1.e())) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (algorithmidentifier.g() == null)
        {
            if (algorithmidentifier1.g() == null || algorithmidentifier1.g().equals(DERNull.b))
            {
                flag = true;
            }
        } else
        if (algorithmidentifier1.g() == null)
        {
            if (algorithmidentifier.g() == null || algorithmidentifier.g().equals(DERNull.b))
            {
                flag = true;
            }
        } else
        {
            flag = algorithmidentifier.g().equals(algorithmidentifier1.g());
        }
        if (true) goto _L1; else goto _L3
_L3:
        i.a(signature, a.m().g());
        signature.initVerify(publickey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature()))
        {
            throw new InvalidKeyException("Public key presented not for certificate signature");
        } else
        {
            return;
        }
    }

    private byte[] a(String s)
    {
        X509Extensions x509extensions = a.e().j();
        if (x509extensions != null)
        {
            s = x509extensions.a(new DERObjectIdentifier(s));
            if (s != null)
            {
                return s.b().f();
            }
        }
        return null;
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return f.a(derobjectidentifier);
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        f.a(derobjectidentifier, derencodable);
    }

    public final Enumeration c()
    {
        return f.c();
    }

    public void checkValidity()
    {
        checkValidity(new Date());
    }

    public void checkValidity(Date date)
    {
        if (date.getTime() > getNotAfter().getTime())
        {
            throw new CertificateExpiredException((new StringBuilder("certificate expired on ")).append(a.j().e()).toString());
        }
        if (date.getTime() < getNotBefore().getTime())
        {
            throw new CertificateNotYetValidException((new StringBuilder("certificate not valid till ")).append(a.i().e()).toString());
        } else
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        if (obj == this)
        {
            flag = true;
        } else
        if (obj instanceof Certificate)
        {
            obj = (Certificate)obj;
            boolean flag1;
            try
            {
                flag1 = Arrays.a(getEncoded(), ((Certificate) (obj)).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag1;
        }
        return flag;
    }

    public int getBasicConstraints()
    {
label0:
        {
            byte byte0 = -1;
            int j = byte0;
            if (b != null)
            {
                j = byte0;
                if (b.e())
                {
                    if (b.f() != null)
                    {
                        break label0;
                    }
                    j = 0x7fffffff;
                }
            }
            return j;
        }
        return b.f().intValue();
    }

    public Set getCriticalExtensionOIDs()
    {
        if (getVersion() == 3)
        {
            HashSet hashset = new HashSet();
            X509Extensions x509extensions = a.e().j();
            if (x509extensions != null)
            {
                Enumeration enumeration = x509extensions.e();
                do
                {
                    if (!enumeration.hasMoreElements())
                    {
                        break;
                    }
                    DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                    if (x509extensions.a(derobjectidentifier).a())
                    {
                        hashset.add(derobjectidentifier.e());
                    }
                } while (true);
                return hashset;
            }
        }
        return null;
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = a.a("DER");
        }
        catch (IOException ioexception)
        {
            throw new CertificateEncodingException(ioexception.toString());
        }
        return abyte0;
    }

    public List getExtendedKeyUsage()
    {
        byte abyte0[] = a("2.5.29.37");
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        Object obj;
        ArrayList arraylist;
        int j;
        try
        {
            obj = (ASN1Sequence)(new ASN1InputStream(abyte0)).a();
            arraylist = new ArrayList();
        }
        catch (Exception exception)
        {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
        j = 0;
        if (j == ((ASN1Sequence) (obj)).f())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((DERObjectIdentifier)((ASN1Sequence) (obj)).a(j)).e());
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        obj = Collections.unmodifiableList(arraylist);
        return ((List) (obj));
        return null;
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = a.e().j();
        if (x509extensions != null)
        {
            s = x509extensions.a(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.b().a();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new IllegalStateException((new StringBuilder("error parsing ")).append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Principal getIssuerDN()
    {
        return new X509Principal(a.h());
    }

    public boolean[] getIssuerUniqueID()
    {
        DERBitString derbitstring = a.e().h();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.e();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.f()];
            int j = 0;
            while (j != aflag.length) 
            {
                boolean flag;
                if ((abyte0[j / 8] & 128 >>> j % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[j] = flag;
                j++;
            }
            return aflag;
        } else
        {
            return null;
        }
    }

    public X500Principal getIssuerX500Principal()
    {
        Object obj;
        try
        {
            obj = new ByteArrayOutputStream();
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).a(a.h());
            obj = new X500Principal(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return ((X500Principal) (obj));
    }

    public boolean[] getKeyUsage()
    {
        return c;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        if (getVersion() == 3)
        {
            HashSet hashset = new HashSet();
            X509Extensions x509extensions = a.e().j();
            if (x509extensions != null)
            {
                Enumeration enumeration = x509extensions.e();
                do
                {
                    if (!enumeration.hasMoreElements())
                    {
                        break;
                    }
                    DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                    if (!x509extensions.a(derobjectidentifier).a())
                    {
                        hashset.add(derobjectidentifier.e());
                    }
                } while (true);
                return hashset;
            }
        }
        return null;
    }

    public Date getNotAfter()
    {
        return a.j().f();
    }

    public Date getNotBefore()
    {
        return a.i().f();
    }

    public PublicKey getPublicKey()
    {
        return JDKKeyFactory.a(a.l());
    }

    public BigInteger getSerialNumber()
    {
        return a.g().e();
    }

    public String getSigAlgName()
    {
        Object obj = Security.getProvider(BouncyCastleProvider.a);
        if (obj != null)
        {
            obj = ((Provider) (obj)).getProperty((new StringBuilder("Alg.Alias.Signature.")).append(getSigAlgOID()).toString());
            if (obj != null)
            {
                return ((String) (obj));
            }
        }
        Provider aprovider[] = Security.getProviders();
        for (int j = 0; j != aprovider.length; j++)
        {
            String s = aprovider[j].getProperty((new StringBuilder("Alg.Alias.Signature.")).append(getSigAlgOID()).toString());
            if (s != null)
            {
                return s;
            }
        }

        return getSigAlgOID();
    }

    public String getSigAlgOID()
    {
        return a.m().e().e();
    }

    public byte[] getSigAlgParams()
    {
        if (a.m().g() != null)
        {
            return a.m().g().c().b();
        } else
        {
            return null;
        }
    }

    public byte[] getSignature()
    {
        return a.n().e();
    }

    public Principal getSubjectDN()
    {
        return new X509Principal(a.k());
    }

    public boolean[] getSubjectUniqueID()
    {
        DERBitString derbitstring = a.e().i();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.e();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.f()];
            int j = 0;
            while (j != aflag.length) 
            {
                boolean flag;
                if ((abyte0[j / 8] & 128 >>> j % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[j] = flag;
                j++;
            }
            return aflag;
        } else
        {
            return null;
        }
    }

    public X500Principal getSubjectX500Principal()
    {
        Object obj;
        try
        {
            obj = new ByteArrayOutputStream();
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).a(a.k());
            obj = new X500Principal(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("can't encode issuer DN");
        }
        return ((X500Principal) (obj));
    }

    public byte[] getTBSCertificate()
    {
        byte abyte0[];
        try
        {
            abyte0 = a.e().a("DER");
        }
        catch (IOException ioexception)
        {
            throw new CertificateEncodingException(ioexception.toString());
        }
        return abyte0;
    }

    public int getVersion()
    {
        return a.f();
    }

    public boolean hasUnsupportedCriticalExtension()
    {
label0:
        {
            if (getVersion() != 3)
            {
                break label0;
            }
            X509Extensions x509extensions = a.e().j();
            if (x509extensions == null)
            {
                break label0;
            }
            Enumeration enumeration = x509extensions.e();
            DERObjectIdentifier derobjectidentifier;
            String s;
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break label0;
                }
                derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                s = derobjectidentifier.e();
            } while (s.equals(RFC3280CertPathUtilities.m) || s.equals(RFC3280CertPathUtilities.a) || s.equals(RFC3280CertPathUtilities.b) || s.equals(RFC3280CertPathUtilities.c) || s.equals(RFC3280CertPathUtilities.i) || s.equals(RFC3280CertPathUtilities.d) || s.equals(RFC3280CertPathUtilities.f) || s.equals(RFC3280CertPathUtilities.g) || s.equals(RFC3280CertPathUtilities.h) || s.equals(RFC3280CertPathUtilities.j) || s.equals(RFC3280CertPathUtilities.k) || !x509extensions.a(derobjectidentifier).a());
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!d)
        {
            e = a();
            d = true;
        }
        j = e;
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        String s;
        X509Extensions x509extensions;
        stringbuffer = new StringBuffer();
        s = System.getProperty("line.separator");
        stringbuffer.append("  [0]         Version: ").append(getVersion()).append(s);
        stringbuffer.append("         SerialNumber: ").append(getSerialNumber()).append(s);
        stringbuffer.append("             IssuerDN: ").append(getIssuerDN()).append(s);
        stringbuffer.append("           Start Date: ").append(getNotBefore()).append(s);
        stringbuffer.append("           Final Date: ").append(getNotAfter()).append(s);
        stringbuffer.append("            SubjectDN: ").append(getSubjectDN()).append(s);
        stringbuffer.append("           Public Key: ").append(getPublicKey()).append(s);
        stringbuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(s);
        byte abyte0[] = getSignature();
        stringbuffer.append("            Signature: ").append(new String(Hex.a(abyte0, 0, 20))).append(s);
        int j = 20;
        while (j < abyte0.length) 
        {
            if (j < abyte0.length - 20)
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, j, 20))).append(s);
            } else
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, j, abyte0.length - j))).append(s);
            }
            j += 20;
        }
        x509extensions = a.e().j();
        if (x509extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration;
        enumeration = x509extensions.e();
        if (enumeration.hasMoreElements())
        {
            stringbuffer.append("       Extensions: \n");
        }
_L3:
        DERObjectIdentifier derobjectidentifier;
        ASN1InputStream asn1inputstream;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
        X509Extension x509extension = x509extensions.a(derobjectidentifier);
        if (x509extension.b() == null)
        {
            break MISSING_BLOCK_LABEL_667;
        }
        asn1inputstream = new ASN1InputStream(x509extension.b().f());
        stringbuffer.append("                       critical(").append(x509extension.a()).append(") ");
        Exception exception;
        if (derobjectidentifier.equals(X509Extensions.g))
        {
            stringbuffer.append(new BasicConstraints((ASN1Sequence)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extensions.c))
        {
            stringbuffer.append(new KeyUsage((DERBitString)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.b))
        {
            stringbuffer.append(new NetscapeCertType((DERBitString)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.d))
        {
            stringbuffer.append(new NetscapeRevocationURL((DERIA5String)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.k))
        {
            stringbuffer.append(new VerisignCzagExtension((DERIA5String)asn1inputstream.a())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuffer.append(derobjectidentifier.e());
            stringbuffer.append(" value = ").append(ASN1Dump.a(asn1inputstream.a())).append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            stringbuffer.append(derobjectidentifier.e());
            stringbuffer.append(" value = *****").append(s);
        }
        continue; /* Loop/switch isn't completed */
        stringbuffer.append(s);
        if (true) goto _L3; else goto _L2
_L2:
        return stringbuffer.toString();
    }

    public final void verify(PublicKey publickey)
    {
        String s = i.a(a.m());
        Signature signature;
        try
        {
            signature = Signature.getInstance(s, BouncyCastleProvider.a);
        }
        catch (Exception exception)
        {
            exception = Signature.getInstance(s);
        }
        a(publickey, signature);
    }

    public final void verify(PublicKey publickey, String s)
    {
        a(publickey, Signature.getInstance(i.a(a.m()), s));
    }
}
