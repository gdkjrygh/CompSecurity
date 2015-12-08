// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
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
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1OutputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.misc.MiscObjectIdentifiers;
import org.spongycastle.asn1.misc.NetscapeCertType;
import org.spongycastle.asn1.misc.NetscapeRevocationURL;
import org.spongycastle.asn1.misc.VerisignCzagExtension;
import org.spongycastle.asn1.util.ASN1Dump;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.KeyUsage;
import org.spongycastle.asn1.x509.TBSCertificateStructure;
import org.spongycastle.asn1.x509.Time;
import org.spongycastle.asn1.x509.X509CertificateStructure;
import org.spongycastle.asn1.x509.X509Extension;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.jce.provider:
//            g, BouncyCastleProvider, RFC3280CertPathUtilities

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
        int i;
        int j;
        i = 9;
        super();
        f = new PKCS12BagAttributeCarrierImpl();
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
        b = BasicConstraints.a(ASN1Primitive.a(x509certificatestructure));
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
        derbitstring = DERBitString.a(ASN1Primitive.a(x509certificatestructure));
        x509certificatestructure = derbitstring.c();
        j = x509certificatestructure.length * 8 - derbitstring.d();
        if (j >= 9)
        {
            i = j;
        }
        c = new boolean[i];
        i = 0;
_L4:
        if (i == j)
        {
            break; /* Loop/switch isn't completed */
        }
        aflag = c;
        boolean flag;
        if ((x509certificatestructure[i / 8] & 128 >>> i % 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aflag[i] = flag;
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        c = null;
_L3:
    }

    private void a(PublicKey publickey, Signature signature)
    {
        AlgorithmIdentifier algorithmidentifier;
        AlgorithmIdentifier algorithmidentifier1;
        boolean flag;
        flag = false;
        algorithmidentifier = a.k();
        algorithmidentifier1 = a.c().c();
        if (algorithmidentifier.c().equals(algorithmidentifier1.c())) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (algorithmidentifier.e() == null)
        {
            if (algorithmidentifier1.e() == null || algorithmidentifier1.e().equals(DERNull.a))
            {
                flag = true;
            }
        } else
        if (algorithmidentifier1.e() == null)
        {
            if (algorithmidentifier.e() == null || algorithmidentifier.e().equals(DERNull.a))
            {
                flag = true;
            }
        } else
        {
            flag = algorithmidentifier.e().equals(algorithmidentifier1.e());
        }
        if (true) goto _L1; else goto _L3
_L3:
        g.a(signature, a.k().e());
        signature.initVerify(publickey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature()))
        {
            throw new SignatureException("certificate does not verify with supplied key");
        } else
        {
            return;
        }
    }

    private byte[] a(String s)
    {
        X509Extensions x509extensions = a.c().h();
        if (x509extensions != null)
        {
            s = x509extensions.a(new DERObjectIdentifier(s));
            if (s != null)
            {
                return s.b().d();
            }
        }
        return null;
    }

    private int b()
    {
        byte abyte0[] = getEncoded();
        int i;
        int j;
        j = 1;
        i = 0;
_L2:
        int k;
        k = j;
        j = i;
        if (k >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        byte byte0 = abyte0[k];
        j = k + 1;
        i = byte0 * k + i;
        if (true) goto _L2; else goto _L1
        CertificateEncodingException certificateencodingexception;
        certificateencodingexception;
        j = 0;
_L1:
        return j;
    }

    public final Enumeration a()
    {
        return f.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return f.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        f.a(asn1objectidentifier, asn1encodable);
    }

    public void checkValidity()
    {
        checkValidity(new Date());
    }

    public void checkValidity(Date date)
    {
        if (date.getTime() > getNotAfter().getTime())
        {
            throw new CertificateExpiredException((new StringBuilder("certificate expired on ")).append(a.h().c()).toString());
        }
        if (date.getTime() < getNotBefore().getTime())
        {
            throw new CertificateNotYetValidException((new StringBuilder("certificate not valid till ")).append(a.g().c()).toString());
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
            int i = byte0;
            if (b != null)
            {
                i = byte0;
                if (b.c())
                {
                    if (b.d() != null)
                    {
                        break label0;
                    }
                    i = 0x7fffffff;
                }
            }
            return i;
        }
        return b.d().intValue();
    }

    public Set getCriticalExtensionOIDs()
    {
        if (getVersion() == 3)
        {
            HashSet hashset = new HashSet();
            X509Extensions x509extensions = a.c().h();
            if (x509extensions != null)
            {
                Enumeration enumeration = x509extensions.c();
                do
                {
                    if (!enumeration.hasMoreElements())
                    {
                        break;
                    }
                    DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                    if (x509extensions.a(derobjectidentifier).a())
                    {
                        hashset.add(derobjectidentifier.c());
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
        int i;
        try
        {
            obj = (ASN1Sequence)(new ASN1InputStream(abyte0)).b();
            arraylist = new ArrayList();
        }
        catch (Exception exception)
        {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
        i = 0;
        if (i == ((ASN1Sequence) (obj)).e())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((DERObjectIdentifier)((ASN1Sequence) (obj)).a(i)).c());
        i++;
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
        X509Extensions x509extensions = a.c().h();
        if (x509extensions != null)
        {
            s = x509extensions.a(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.b().b();
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
        X509Principal x509principal;
        try
        {
            x509principal = new X509Principal(X500Name.a(a.f().b()));
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return x509principal;
    }

    public boolean[] getIssuerUniqueID()
    {
        DERBitString derbitstring = a.c().f();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.c();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.d()];
            int i = 0;
            while (i != aflag.length) 
            {
                boolean flag;
                if ((abyte0[i / 8] & 128 >>> i % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[i] = flag;
                i++;
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
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).a(a.f());
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
            X509Extensions x509extensions = a.c().h();
            if (x509extensions != null)
            {
                Enumeration enumeration = x509extensions.c();
                do
                {
                    if (!enumeration.hasMoreElements())
                    {
                        break;
                    }
                    DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                    if (!x509extensions.a(derobjectidentifier).a())
                    {
                        hashset.add(derobjectidentifier.c());
                    }
                } while (true);
                return hashset;
            }
        }
        return null;
    }

    public Date getNotAfter()
    {
        return a.h().d();
    }

    public Date getNotBefore()
    {
        return a.g().d();
    }

    public PublicKey getPublicKey()
    {
        PublicKey publickey;
        try
        {
            publickey = BouncyCastleProvider.a(a.j());
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return publickey;
    }

    public BigInteger getSerialNumber()
    {
        return a.e().c();
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
        for (int i = 0; i != aprovider.length; i++)
        {
            String s = aprovider[i].getProperty((new StringBuilder("Alg.Alias.Signature.")).append(getSigAlgOID()).toString());
            if (s != null)
            {
                return s;
            }
        }

        return getSigAlgOID();
    }

    public String getSigAlgOID()
    {
        return a.k().c().c();
    }

    public byte[] getSigAlgParams()
    {
        byte abyte0[] = null;
        if (a.k().e() != null)
        {
            try
            {
                abyte0 = a.k().e().a().a("DER");
            }
            catch (IOException ioexception)
            {
                return null;
            }
        }
        return abyte0;
    }

    public byte[] getSignature()
    {
        return a.l().c();
    }

    public Principal getSubjectDN()
    {
        return new X509Principal(X500Name.a(a.i().a()));
    }

    public boolean[] getSubjectUniqueID()
    {
        DERBitString derbitstring = a.c().g();
        if (derbitstring != null)
        {
            byte abyte0[] = derbitstring.c();
            boolean aflag[] = new boolean[abyte0.length * 8 - derbitstring.d()];
            int i = 0;
            while (i != aflag.length) 
            {
                boolean flag;
                if ((abyte0[i / 8] & 128 >>> i % 8) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aflag[i] = flag;
                i++;
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
            (new ASN1OutputStream(((java.io.OutputStream) (obj)))).a(a.i());
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
            abyte0 = a.c().a("DER");
        }
        catch (IOException ioexception)
        {
            throw new CertificateEncodingException(ioexception.toString());
        }
        return abyte0;
    }

    public int getVersion()
    {
        return a.d();
    }

    public boolean hasUnsupportedCriticalExtension()
    {
label0:
        {
            if (getVersion() != 3)
            {
                break label0;
            }
            X509Extensions x509extensions = a.c().h();
            if (x509extensions == null)
            {
                break label0;
            }
            Enumeration enumeration = x509extensions.c();
            DERObjectIdentifier derobjectidentifier;
            String s;
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break label0;
                }
                derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                s = derobjectidentifier.c();
            } while (s.equals(RFC3280CertPathUtilities.m) || s.equals(RFC3280CertPathUtilities.a) || s.equals(RFC3280CertPathUtilities.b) || s.equals(RFC3280CertPathUtilities.c) || s.equals(RFC3280CertPathUtilities.i) || s.equals(RFC3280CertPathUtilities.d) || s.equals(RFC3280CertPathUtilities.f) || s.equals(RFC3280CertPathUtilities.g) || s.equals(RFC3280CertPathUtilities.h) || s.equals(RFC3280CertPathUtilities.j) || s.equals(RFC3280CertPathUtilities.k) || !x509extensions.a(derobjectidentifier).a());
            return true;
        }
        return false;
    }

    public int hashCode()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (!d)
        {
            e = b();
            d = true;
        }
        i = e;
        this;
        JVM INSTR monitorexit ;
        return i;
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
        int i = 20;
        while (i < abyte0.length) 
        {
            if (i < abyte0.length - 20)
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, i, 20))).append(s);
            } else
            {
                stringbuffer.append("                       ").append(new String(Hex.a(abyte0, i, abyte0.length - i))).append(s);
            }
            i += 20;
        }
        x509extensions = a.c().h();
        if (x509extensions == null) goto _L2; else goto _L1
_L1:
        Enumeration enumeration;
        enumeration = x509extensions.c();
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
            break MISSING_BLOCK_LABEL_660;
        }
        asn1inputstream = new ASN1InputStream(x509extension.b().d());
        stringbuffer.append("                       critical(").append(x509extension.a()).append(") ");
        Exception exception;
        if (derobjectidentifier.equals(X509Extension.g))
        {
            stringbuffer.append(BasicConstraints.a(asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(X509Extension.c))
        {
            stringbuffer.append(new KeyUsage((DERBitString)asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.b))
        {
            stringbuffer.append(new NetscapeCertType((DERBitString)asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.d))
        {
            stringbuffer.append(new NetscapeRevocationURL((DERIA5String)asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        if (derobjectidentifier.equals(MiscObjectIdentifiers.k))
        {
            stringbuffer.append(new VerisignCzagExtension((DERIA5String)asn1inputstream.b())).append(s);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuffer.append(derobjectidentifier.c());
            stringbuffer.append(" value = ").append(ASN1Dump.a(asn1inputstream.b())).append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            stringbuffer.append(derobjectidentifier.c());
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
        String s = g.a(a.k());
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
        a(publickey, Signature.getInstance(g.a(a.k()), s));
    }
}
