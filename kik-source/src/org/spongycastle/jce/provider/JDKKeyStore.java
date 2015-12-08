// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.generators.PKCS12ParametersGenerator;
import org.spongycastle.crypto.io.DigestInputStream;
import org.spongycastle.crypto.io.DigestOutputStream;
import org.spongycastle.crypto.io.MacInputStream;
import org.spongycastle.crypto.io.MacOutputStream;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jce.interfaces.BCKeyStore;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.Streams;
import org.spongycastle.util.io.TeeOutputStream;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider

public class JDKKeyStore extends KeyStoreSpi
    implements BCKeyStore
{
    public static class BouncyCastleStore extends JDKKeyStore
    {

        public void engineLoad(InputStream inputstream, char ac[])
        {
            a.clear();
            if (inputstream != null)
            {
                Object obj = new DataInputStream(inputstream);
                int i = ((DataInputStream) (obj)).readInt();
                if (i != 2 && i != 0 && i != 1)
                {
                    throw new IOException("Wrong version of key store.");
                }
                byte abyte1[] = new byte[((DataInputStream) (obj)).readInt()];
                if (abyte1.length != 20)
                {
                    throw new IOException("Key store corrupted.");
                }
                ((DataInputStream) (obj)).readFully(abyte1);
                int j = ((DataInputStream) (obj)).readInt();
                if (j < 0 || j > 4096)
                {
                    throw new IOException("Key store corrupted.");
                }
                byte abyte0[];
                if (i == 0)
                {
                    inputstream = "OldPBEWithSHAAndTwofish-CBC";
                } else
                {
                    inputstream = "PBEWithSHAAndTwofish-CBC";
                }
                inputstream = new CipherInputStream(((InputStream) (obj)), a(inputstream, 2, ac, abyte1, j));
                obj = new SHA1Digest();
                a(new DigestInputStream(inputstream, ((Digest) (obj))));
                ac = new byte[((Digest) (obj)).b()];
                ((Digest) (obj)).a(ac, 0);
                abyte0 = new byte[((Digest) (obj)).b()];
                Streams.a(inputstream, abyte0);
                if (!Arrays.b(ac, abyte0))
                {
                    a.clear();
                    throw new IOException("KeyStore integrity check failed.");
                }
            }
        }

        public void engineStore(OutputStream outputstream, char ac[])
        {
            outputstream = new DataOutputStream(outputstream);
            byte abyte0[] = new byte[20];
            int i = (b.nextInt() & 0x3ff) + 1024;
            b.nextBytes(abyte0);
            outputstream.writeInt(2);
            outputstream.writeInt(20);
            outputstream.write(abyte0);
            outputstream.writeInt(i);
            outputstream = new CipherOutputStream(outputstream, a("PBEWithSHAAndTwofish-CBC", 1, ac, abyte0, i));
            ac = new DigestOutputStream(new SHA1Digest());
            a(new TeeOutputStream(outputstream, ac));
            outputstream.write(ac.a());
            outputstream.close();
        }

        public BouncyCastleStore()
        {
        }
    }

    private final class a
    {

        int a;
        String b;
        Object c;
        Certificate d[];
        Date e;
        final JDKKeyStore f;

        final Object a(char ac[])
        {
            Object obj;
            byte abyte1[];
            int i;
            if ((ac == null || ac.length == 0) && (c instanceof Key))
            {
                return c;
            }
            if (a != 4)
            {
                break MISSING_BLOCK_LABEL_358;
            }
            obj = new DataInputStream(new ByteArrayInputStream((byte[])c));
            Exception exception;
            ByteArrayOutputStream bytearrayoutputstream;
            DataOutputStream dataoutputstream;
            try
            {
                byte abyte0[] = new byte[((DataInputStream) (obj)).readInt()];
                ((DataInputStream) (obj)).readFully(abyte0);
                obj = new CipherInputStream(((InputStream) (obj)), JDKKeyStore.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte0, ((DataInputStream) (obj)).readInt()));
            }
            // Misplaced declaration of an exception variable
            catch (char ac[])
            {
                throw new UnrecoverableKeyException("no match");
            }
            obj = JDKKeyStore.a(new DataInputStream(((InputStream) (obj))));
            return obj;
            exception;
            exception = new DataInputStream(new ByteArrayInputStream((byte[])c));
            abyte1 = new byte[exception.readInt()];
            exception.readFully(abyte1);
            i = exception.readInt();
            exception = new CipherInputStream(exception, JDKKeyStore.a("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, i));
            exception = JDKKeyStore.a(new DataInputStream(exception));
_L1:
            if (exception == null)
            {
                break MISSING_BLOCK_LABEL_348;
            }
            bytearrayoutputstream = new ByteArrayOutputStream();
            dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeInt(abyte1.length);
            dataoutputstream.write(abyte1);
            dataoutputstream.writeInt(i);
            ac = new DataOutputStream(new CipherOutputStream(dataoutputstream, JDKKeyStore.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, abyte1, i)));
            JDKKeyStore.a(exception, ac);
            ac.close();
            c = bytearrayoutputstream.toByteArray();
            return exception;
            Exception exception1;
            exception1;
            exception1 = new DataInputStream(new ByteArrayInputStream((byte[])c));
            abyte1 = new byte[exception1.readInt()];
            exception1.readFully(abyte1);
            i = exception1.readInt();
            exception1 = JDKKeyStore.a(new DataInputStream(new CipherInputStream(exception1, JDKKeyStore.a("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, ac, abyte1, i))));
              goto _L1
            throw new UnrecoverableKeyException("no match");
            throw new RuntimeException("forget something!");
        }

        a(String s, Key key, char ac[], Certificate acertificate[])
        {
            f = JDKKeyStore.this;
            super();
            e = new Date();
            a = 4;
            b = s;
            d = acertificate;
            s = new byte[20];
            JDKKeyStore.this.b.setSeed(System.currentTimeMillis());
            JDKKeyStore.this.b.nextBytes(s);
            int i = (JDKKeyStore.this.b.nextInt() & 0x3ff) + 1024;
            jdkkeystore = new ByteArrayOutputStream();
            acertificate = new DataOutputStream(JDKKeyStore.this);
            acertificate.writeInt(20);
            acertificate.write(s);
            acertificate.writeInt(i);
            s = new DataOutputStream(new CipherOutputStream(acertificate, JDKKeyStore.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, ac, s, i)));
            JDKKeyStore.a(key, s);
            s.close();
            c = toByteArray();
        }

        a(String s, Certificate certificate)
        {
            f = JDKKeyStore.this;
            super();
            e = new Date();
            a = 1;
            b = s;
            c = certificate;
            d = null;
        }

        a(String s, Date date, int i, Object obj, Certificate acertificate[])
        {
            f = JDKKeyStore.this;
            super();
            e = new Date();
            b = s;
            e = date;
            a = i;
            c = obj;
            d = acertificate;
        }

        a(String s, Date date, Object obj)
        {
            f = JDKKeyStore.this;
            super();
            e = new Date();
            b = s;
            e = date;
            a = 1;
            c = obj;
        }

        a(String s, byte abyte0[], Certificate acertificate[])
        {
            f = JDKKeyStore.this;
            super();
            e = new Date();
            a = 3;
            b = s;
            c = abyte0;
            d = acertificate;
        }
    }


    protected Hashtable a;
    protected SecureRandom b;

    public JDKKeyStore()
    {
        a = new Hashtable();
        b = new SecureRandom();
    }

    static Key a(DataInputStream datainputstream)
    {
        return c(datainputstream);
    }

    protected static Cipher a(String s, int i, char ac[], byte abyte0[], int j)
    {
        try
        {
            ac = new PBEKeySpec(ac);
            SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance(s, BouncyCastleProvider.a);
            abyte0 = new PBEParameterSpec(abyte0, j);
            s = Cipher.getInstance(s, BouncyCastleProvider.a);
            s.init(i, secretkeyfactory.generateSecret(ac), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException((new StringBuilder("Error initialising store of key store: ")).append(s).toString());
        }
        return s;
    }

    static void a(Key key, DataOutputStream dataoutputstream)
    {
        b(key, dataoutputstream);
    }

    private static void a(Certificate certificate, DataOutputStream dataoutputstream)
    {
        try
        {
            byte abyte0[] = certificate.getEncoded();
            dataoutputstream.writeUTF(certificate.getType());
            dataoutputstream.writeInt(abyte0.length);
            dataoutputstream.write(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Certificate certificate)
        {
            throw new IOException(certificate.toString());
        }
    }

    private static Certificate b(DataInputStream datainputstream)
    {
        String s = datainputstream.readUTF();
        byte abyte0[] = new byte[datainputstream.readInt()];
        datainputstream.readFully(abyte0);
        try
        {
            datainputstream = CertificateFactory.getInstance(s, BouncyCastleProvider.a).generateCertificate(new ByteArrayInputStream(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (DataInputStream datainputstream)
        {
            throw new IOException(datainputstream.toString());
        }
        // Misplaced declaration of an exception variable
        catch (DataInputStream datainputstream)
        {
            throw new IOException(datainputstream.toString());
        }
        return datainputstream;
    }

    private static void b(Key key, DataOutputStream dataoutputstream)
    {
        byte abyte0[] = key.getEncoded();
        if (key instanceof PrivateKey)
        {
            dataoutputstream.write(0);
        } else
        if (key instanceof PublicKey)
        {
            dataoutputstream.write(1);
        } else
        {
            dataoutputstream.write(2);
        }
        dataoutputstream.writeUTF(key.getFormat());
        dataoutputstream.writeUTF(key.getAlgorithm());
        dataoutputstream.writeInt(abyte0.length);
        dataoutputstream.write(abyte0);
    }

    private static Key c(DataInputStream datainputstream)
    {
        String s;
        String s1;
        byte abyte0[];
        int i;
        i = datainputstream.read();
        s1 = datainputstream.readUTF();
        s = datainputstream.readUTF();
        abyte0 = new byte[datainputstream.readInt()];
        datainputstream.readFully(abyte0);
        if (!s1.equals("PKCS#8") && !s1.equals("PKCS8")) goto _L2; else goto _L1
_L1:
        datainputstream = new PKCS8EncodedKeySpec(abyte0);
_L8:
        i;
        JVM INSTR tableswitch 0 2: default 84
    //                   0 220
    //                   1 232
    //                   2 244;
           goto _L3 _L4 _L5 _L6
_L3:
        try
        {
            throw new IOException((new StringBuilder("Key type ")).append(i).append(" not recognised!").toString());
        }
        // Misplaced declaration of an exception variable
        catch (DataInputStream datainputstream)
        {
            throw new IOException((new StringBuilder("Exception creating key: ")).append(datainputstream.toString()).toString());
        }
_L2:
        if (!s1.equals("X.509") && !s1.equals("X509"))
        {
            break; /* Loop/switch isn't completed */
        }
        datainputstream = new X509EncodedKeySpec(abyte0);
        if (true) goto _L8; else goto _L7
_L7:
        if (s1.equals("RAW"))
        {
            return new SecretKeySpec(abyte0, s);
        } else
        {
            throw new IOException((new StringBuilder("Key format ")).append(s1).append(" not recognised!").toString());
        }
_L4:
        return KeyFactory.getInstance(s, BouncyCastleProvider.a).generatePrivate(datainputstream);
_L5:
        return KeyFactory.getInstance(s, BouncyCastleProvider.a).generatePublic(datainputstream);
_L6:
        datainputstream = SecretKeyFactory.getInstance(s, BouncyCastleProvider.a).generateSecret(datainputstream);
        return datainputstream;
    }

    protected final void a(InputStream inputstream)
    {
        DataInputStream datainputstream;
        int i;
        datainputstream = new DataInputStream(inputstream);
        i = datainputstream.read();
_L2:
        String s;
        Date date;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        s = datainputstream.readUTF();
        date = new Date(datainputstream.readLong());
        int k = datainputstream.readInt();
        inputstream = null;
        if (k != 0)
        {
            Certificate acertificate[] = new Certificate[k];
            int j = 0;
            do
            {
                inputstream = acertificate;
                if (j == k)
                {
                    break;
                }
                acertificate[j] = b(datainputstream);
                j++;
            } while (true);
        }
        switch (i)
        {
        default:
            throw new RuntimeException("Unknown object type in store.");

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
        case 4: // '\004'
            break MISSING_BLOCK_LABEL_200;

        case 1: // '\001'
            inputstream = b(datainputstream);
            a.put(s, new a(s, date, inputstream));
            break;
        }
_L3:
        i = datainputstream.read();
        if (true) goto _L2; else goto _L1
_L1:
        Key key = c(datainputstream);
        a.put(s, new a(s, date, 2, key, inputstream));
          goto _L3
        byte abyte0[] = new byte[datainputstream.readInt()];
        datainputstream.readFully(abyte0);
        a.put(s, new a(s, date, i, abyte0, inputstream));
          goto _L3
    }

    protected final void a(OutputStream outputstream)
    {
        Enumeration enumeration = a.elements();
        outputstream = new DataOutputStream(outputstream);
        do
        {
            if (enumeration.hasMoreElements())
            {
                a a1 = (a)enumeration.nextElement();
                outputstream.write(a1.a);
                outputstream.writeUTF(a1.b);
                outputstream.writeLong(a1.e.getTime());
                Certificate acertificate[] = a1.d;
                if (acertificate == null)
                {
                    outputstream.writeInt(0);
                } else
                {
                    outputstream.writeInt(acertificate.length);
                    int i = 0;
                    while (i != acertificate.length) 
                    {
                        a(acertificate[i], ((DataOutputStream) (outputstream)));
                        i++;
                    }
                }
                switch (a1.a)
                {
                default:
                    throw new RuntimeException("Unknown object type in store.");

                case 1: // '\001'
                    a((Certificate)a1.c, ((DataOutputStream) (outputstream)));
                    break;

                case 2: // '\002'
                    b((Key)a1.c, outputstream);
                    break;

                case 3: // '\003'
                case 4: // '\004'
                    byte abyte0[] = (byte[])a1.c;
                    outputstream.writeInt(abyte0.length);
                    outputstream.write(abyte0);
                    break;
                }
            } else
            {
                outputstream.write(0);
                return;
            }
        } while (true);
    }

    public Enumeration engineAliases()
    {
        return a.keys();
    }

    public boolean engineContainsAlias(String s)
    {
        return a.get(s) != null;
    }

    public void engineDeleteEntry(String s)
    {
        if (a.get(s) == null)
        {
            throw new KeyStoreException((new StringBuilder("no such entry as ")).append(s).toString());
        } else
        {
            a.remove(s);
            return;
        }
    }

    public Certificate engineGetCertificate(String s)
    {
        s = (a)a.get(s);
        if (s != null)
        {
            if (((a) (s)).a == 1)
            {
                return (Certificate)((a) (s)).c;
            }
            s = ((a) (s)).d;
            if (s != null)
            {
                return s[0];
            }
        }
        return null;
    }

    public String engineGetCertificateAlias(Certificate certificate)
    {
        for (Enumeration enumeration = a.elements(); enumeration.hasMoreElements();)
        {
            a a1 = (a)enumeration.nextElement();
            if (a1.c instanceof Certificate)
            {
                if (((Certificate)a1.c).equals(certificate))
                {
                    return a1.b;
                }
            } else
            {
                Certificate acertificate[] = a1.d;
                if (acertificate != null && acertificate[0].equals(certificate))
                {
                    return a1.b;
                }
            }
        }

        return null;
    }

    public Certificate[] engineGetCertificateChain(String s)
    {
        s = (a)a.get(s);
        if (s != null)
        {
            return ((a) (s)).d;
        } else
        {
            return null;
        }
    }

    public Date engineGetCreationDate(String s)
    {
        s = (a)a.get(s);
        if (s != null)
        {
            return ((a) (s)).e;
        } else
        {
            return null;
        }
    }

    public Key engineGetKey(String s, char ac[])
    {
        s = (a)a.get(s);
        if (s == null || ((a) (s)).a == 1)
        {
            return null;
        } else
        {
            return (Key)s.a(ac);
        }
    }

    public boolean engineIsCertificateEntry(String s)
    {
        s = (a)a.get(s);
        return s != null && ((a) (s)).a == 1;
    }

    public boolean engineIsKeyEntry(String s)
    {
        s = (a)a.get(s);
        return s != null && ((a) (s)).a != 1;
    }

    public void engineLoad(InputStream inputstream, char ac[])
    {
        a.clear();
        if (inputstream != null)
        {
            DataInputStream datainputstream = new DataInputStream(inputstream);
            int i = datainputstream.readInt();
            if (i != 2 && i != 0 && i != 1)
            {
                throw new IOException("Wrong version of key store.");
            }
            int j = datainputstream.readInt();
            if (j <= 0)
            {
                throw new IOException("Invalid salt detected");
            }
            inputstream = new byte[j];
            datainputstream.readFully(inputstream);
            j = datainputstream.readInt();
            HMac hmac = new HMac(new SHA1Digest());
            if (ac != null && ac.length != 0)
            {
                ac = PBEParametersGenerator.b(ac);
                PKCS12ParametersGenerator pkcs12parametersgenerator = new PKCS12ParametersGenerator(new SHA1Digest());
                pkcs12parametersgenerator.a(ac, inputstream, j);
                if (i != 2)
                {
                    inputstream = pkcs12parametersgenerator.b(hmac.a());
                } else
                {
                    inputstream = pkcs12parametersgenerator.b(hmac.a() * 8);
                }
                Arrays.a(ac, (byte)0);
                hmac.a(inputstream);
                a(new MacInputStream(datainputstream, hmac));
                inputstream = new byte[hmac.a()];
                hmac.a(inputstream, 0);
                ac = new byte[hmac.a()];
                datainputstream.readFully(ac);
                if (!Arrays.b(inputstream, ac))
                {
                    a.clear();
                    throw new IOException("KeyStore integrity check failed.");
                }
            } else
            {
                a(datainputstream);
                datainputstream.readFully(new byte[hmac.a()]);
                return;
            }
        }
    }

    public void engineSetCertificateEntry(String s, Certificate certificate)
    {
        a a1 = (a)a.get(s);
        if (a1 != null && a1.a != 1)
        {
            throw new KeyStoreException((new StringBuilder("key store already has a key entry with alias ")).append(s).toString());
        } else
        {
            a.put(s, new a(s, certificate));
            return;
        }
    }

    public void engineSetKeyEntry(String s, Key key, char ac[], Certificate acertificate[])
    {
        if ((key instanceof PrivateKey) && acertificate == null)
        {
            throw new KeyStoreException("no certificate chain for private key");
        }
        try
        {
            a.put(s, new a(s, key, ac, acertificate));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new KeyStoreException(s.toString());
        }
    }

    public void engineSetKeyEntry(String s, byte abyte0[], Certificate acertificate[])
    {
        a.put(s, new a(s, abyte0, acertificate));
    }

    public int engineSize()
    {
        return a.size();
    }

    public void engineStore(OutputStream outputstream, char ac[])
    {
        outputstream = new DataOutputStream(outputstream);
        byte abyte0[] = new byte[20];
        int i = (b.nextInt() & 0x3ff) + 1024;
        b.nextBytes(abyte0);
        outputstream.writeInt(2);
        outputstream.writeInt(20);
        outputstream.write(abyte0);
        outputstream.writeInt(i);
        HMac hmac = new HMac(new SHA1Digest());
        MacOutputStream macoutputstream = new MacOutputStream(hmac);
        PKCS12ParametersGenerator pkcs12parametersgenerator = new PKCS12ParametersGenerator(new SHA1Digest());
        ac = PBEParametersGenerator.b(ac);
        pkcs12parametersgenerator.a(ac, abyte0, i);
        hmac.a(pkcs12parametersgenerator.b(hmac.a() * 8));
        for (int j = 0; j != ac.length; j++)
        {
            ac[j] = '\0';
        }

        a(new TeeOutputStream(outputstream, macoutputstream));
        ac = new byte[hmac.a()];
        hmac.a(ac, 0);
        outputstream.write(ac);
        outputstream.close();
    }
}
