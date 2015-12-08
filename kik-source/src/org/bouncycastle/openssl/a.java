// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.openssl;

import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;

// Referenced classes of package org.bouncycastle.openssl:
//            EncryptionException

final class a
{

    private static final Map a;
    private static final Set b;
    private static final Set c;

    static SecretKey a(String s, char ac[], byte abyte0[], int i)
    {
        PKCS5S2ParametersGenerator pkcs5s2parametersgenerator = new PKCS5S2ParametersGenerator();
        pkcs5s2parametersgenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(ac), abyte0, i);
        if (!a.containsKey(s))
        {
            throw new IllegalStateException((new StringBuilder("no key size for algorithm: ")).append(s).toString());
        } else
        {
            return new SecretKeySpec(((KeyParameter)pkcs5s2parametersgenerator.generateDerivedParameters(((Integer)a.get(s)).intValue())).getKey(), s);
        }
    }

    private static SecretKey a(char ac[], String s, int i, byte abyte0[])
    {
        return a(ac, s, i, abyte0, false);
    }

    private static SecretKey a(char ac[], String s, int i, byte abyte0[], boolean flag)
    {
        OpenSSLPBEParametersGenerator opensslpbeparametersgenerator = new OpenSSLPBEParametersGenerator();
        opensslpbeparametersgenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(ac), abyte0);
        ac = ((KeyParameter)opensslpbeparametersgenerator.generateDerivedParameters(i * 8)).getKey();
        if (flag && ac.length >= 24)
        {
            System.arraycopy(ac, 0, ac, 16, 8);
        }
        return new SecretKeySpec(ac, s);
    }

    static boolean a(DERObjectIdentifier derobjectidentifier)
    {
        return c.contains(derobjectidentifier);
    }

    static byte[] a(Provider provider, byte abyte0[], char ac[], String s, byte abyte1[])
    {
        char c1 = '\200';
        boolean flag = true;
        Object obj = new IvParameterSpec(abyte1);
        String s2 = "CBC";
        String s1 = "PKCS5Padding";
        if (s.endsWith("-CFB"))
        {
            s2 = "CFB";
            s1 = "NoPadding";
        }
        if (s.endsWith("-ECB") || "DES-EDE".equals(s) || "DES-EDE3".equals(s))
        {
            s2 = "ECB";
            obj = null;
        }
        if (s.endsWith("-OFB"))
        {
            s2 = "OFB";
            s1 = "NoPadding";
        }
        if (s.startsWith("DES-EDE"))
        {
            if (s.startsWith("DES-EDE3"))
            {
                flag = false;
            }
            abyte1 = a(ac, "DESede", 24, abyte1, flag);
            s = ((String) (obj));
            ac = "DESede";
        } else
        if (s.startsWith("DES-"))
        {
            abyte1 = a(ac, "DES", 8, abyte1);
            s = ((String) (obj));
            ac = "DES";
        } else
        if (s.startsWith("BF-"))
        {
            abyte1 = a(ac, "Blowfish", 16, abyte1);
            s = ((String) (obj));
            ac = "Blowfish";
        } else
        if (s.startsWith("RC2-"))
        {
            byte abyte2[];
            if (s.startsWith("RC2-40-"))
            {
                c1 = '(';
            } else
            if (s.startsWith("RC2-64-"))
            {
                c1 = '@';
            } else
            {
                c1 = '\200';
            }
            ac = a(ac, "RC2", c1 / 8, abyte1);
            if (obj == null)
            {
                s = new RC2ParameterSpec(c1);
                obj = "RC2";
                abyte1 = ac;
                ac = ((char []) (obj));
            } else
            {
                s = new RC2ParameterSpec(c1, abyte1);
                obj = "RC2";
                abyte1 = ac;
                ac = ((char []) (obj));
            }
        } else
        if (s.startsWith("AES-"))
        {
            abyte2 = abyte1;
            if (abyte1.length > 8)
            {
                abyte2 = new byte[8];
                System.arraycopy(abyte1, 0, abyte2, 0, 8);
            }
            if (!s.startsWith("AES-128-"))
            {
                if (s.startsWith("AES-192-"))
                {
                    c1 = '\300';
                } else
                if (s.startsWith("AES-256-"))
                {
                    c1 = '\u0100';
                } else
                {
                    throw new EncryptionException("unknown AES encryption with private key");
                }
            }
            abyte1 = a(ac, "AES", c1 / 8, abyte2);
            s = ((String) (obj));
            ac = "AES";
        } else
        {
            throw new EncryptionException("unknown encryption with private key");
        }
        ac = (new StringBuilder()).append(ac).append("/").append(s2).append("/").append(s1).toString();
        try
        {
            provider = Cipher.getInstance(ac, provider);
        }
        // Misplaced declaration of an exception variable
        catch (Provider provider)
        {
            throw new EncryptionException("exception using cipher - please check password and data.", provider);
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        provider.init(1, abyte1);
_L1:
        provider = provider.doFinal(abyte0);
        return provider;
        provider.init(1, abyte1, s);
          goto _L1
    }

    static boolean b(DERObjectIdentifier derobjectidentifier)
    {
        return derobjectidentifier.e().startsWith(PKCSObjectIdentifiers.bp.e());
    }

    static 
    {
        a = new HashMap();
        b = new HashSet();
        c = new HashSet();
        b.add(PKCSObjectIdentifiers.s_);
        b.add(PKCSObjectIdentifiers.t);
        b.add(PKCSObjectIdentifiers.u);
        b.add(PKCSObjectIdentifiers.v);
        b.add(PKCSObjectIdentifiers.w);
        b.add(PKCSObjectIdentifiers.x);
        c.add(PKCSObjectIdentifiers.y);
        c.add(PKCSObjectIdentifiers.B);
        c.add(NISTObjectIdentifiers.h);
        c.add(NISTObjectIdentifiers.o);
        c.add(NISTObjectIdentifiers.v);
        a.put(PKCSObjectIdentifiers.B.e(), new Integer(192));
        a.put(NISTObjectIdentifiers.h.e(), new Integer(128));
        a.put(NISTObjectIdentifiers.o.e(), new Integer(192));
        a.put(NISTObjectIdentifiers.v.e(), new Integer(256));
    }
}
