// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.internal.a;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.internal.h;
import com.amazonaws.services.s3.internal.j;
import com.amazonaws.services.s3.internal.p;
import com.amazonaws.services.s3.internal.q;
import com.amazonaws.services.s3.model.ag;
import com.amazonaws.services.s3.model.ah;
import com.amazonaws.services.s3.model.ai;
import com.amazonaws.services.s3.model.aq;
import com.amazonaws.services.s3.model.av;
import com.amazonaws.services.s3.model.bi;
import com.amazonaws.services.s3.model.bo;
import com.amazonaws.services.s3.model.bv;
import com.amazonaws.services.s3.model.bw;
import com.amazonaws.services.s3.model.ck;
import com.amazonaws.services.s3.model.cm;
import com.amazonaws.services.s3.model.z;
import com.amazonaws.util.Base64;
import com.amazonaws.util.json.JsonUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.Key;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.amazonaws.services.s3.internal.a:
//            q, e, f, n, 
//            a

public class o
{

    static final String a = ".instruction";

    public o()
    {
    }

    private static long a(long l)
    {
        long l1 = q.d;
        l = l - l % l1 - l1;
        if (l < 0L)
        {
            return 0L;
        } else
        {
            return l;
        }
    }

    private static long a(bo bo1, bi bi1)
    {
        if (bo1.j() != null)
        {
            return bo1.j().length();
        }
        if (bo1.n() != null && bi1.e("Content-Length") != null)
        {
            return bi1.i();
        } else
        {
            return -1L;
        }
    }

    private static long a(Cipher cipher, bo bo1, bi bi1)
    {
        long l = a(bo1, bi1);
        if (l < 0L)
        {
            return -1L;
        } else
        {
            long l1 = cipher.getBlockSize();
            return l + (l1 - l % l1);
        }
    }

    public static long a(Cipher cipher, cm cm1)
    {
        long l;
        long l1;
        if (cm1.o() != null)
        {
            if (cm1.m() > 0L)
            {
                l = cm1.m();
            } else
            {
                l = cm1.o().length();
            }
        } else
        if (cm1.h() != null)
        {
            l = cm1.m();
        } else
        {
            return -1L;
        }
        l1 = cipher.getBlockSize();
        return l + (l1 - l % l1);
    }

    public static e a(cm cm1, f f1)
    {
        Object obj1;
        p p1;
        long l;
        try
        {
            Object obj = cm1.h();
            if (cm1.o() != null)
            {
                obj = new h(new q(cm1.o()), cm1.p(), cm1.m(), cm1.r());
            }
            p1 = new p(((InputStream) (obj)), f1);
        }
        // Misplaced declaration of an exception variable
        catch (cm cm1)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to create cipher input stream: ").append(cm1.getMessage()).toString(), cm1);
        }
        obj1 = p1;
        if (!cm1.r())
        {
            obj1 = new h(p1, 0L, cm1.m(), false);
        }
        l = cm1.m();
        cm1 = new e(((InputStream) (obj1)), l - (long)f1.a().getBlockSize(), l);
        return cm1;
    }

    public static n a(ag ag1, Provider provider)
    {
        return a(((ai) (new ck(ag1))), provider);
    }

    public static n a(ai ai1, Provider provider)
    {
        return b(ai1.a(), provider);
    }

    public static n a(ai ai1, Map map, Provider provider)
    {
        return b(ai1.a(map), provider);
    }

    public static n a(bv bv1, ai ai1, Provider provider)
    {
        Map map = c(bv1);
        String s = (String)map.get("x-amz-key");
        String s1 = (String)map.get("x-amz-iv");
        map = a((String)map.get("x-amz-matdesc"));
        byte abyte0[] = Base64.a(s);
        byte abyte1[] = Base64.a(s1);
        if (abyte0 == null || abyte1 == null)
        {
            throw new AmazonClientException(String.format("Necessary encryption info not found in the instruction file '%s' in bucket '%s'", new Object[] {
                bv1.d(), bv1.c()
            }));
        }
        ai1 = a(map, ((ah) (ai1)));
        if (ai1 == null)
        {
            throw new AmazonClientException(String.format("Unable to retrieve the encryption materials that originally encrypted object corresponding to instruction file '%s' in bucket '%s'.", new Object[] {
                bv1.d(), bv1.c()
            }));
        } else
        {
            bv1 = a(abyte0, ((ag) (ai1)), provider);
            return new n(map, abyte0, bv1, new f(bv1, 2, abyte1, provider));
        }
    }

    private static ag a(Map map, ah ah1)
    {
        if (ah1 == null)
        {
            return null;
        } else
        {
            return ah1.a(map);
        }
    }

    public static aq a(aq aq1)
    {
        return new aq(aq1.f(), (new StringBuilder()).append(aq1.g()).append(".instruction").toString(), aq1.h());
    }

    public static bi a(av av1, byte abyte0[], Cipher cipher, Map map)
    {
        bi bi1 = av1.l();
        av1 = bi1;
        if (bi1 == null)
        {
            av1 = new bi();
        }
        a(((bi) (av1)), abyte0, cipher, map);
        return av1;
    }

    public static bo a(bo bo1, n n1)
    {
        bi bi2 = bo1.k();
        bi bi1 = bi2;
        if (bi2 == null)
        {
            bi1 = new bi();
        }
        if (bi1.n() != null)
        {
            bi1.a("x-amz-unencrypted-content-md5", bi1.n());
        }
        bi1.i(null);
        long l = a(bo1, bi1);
        if (l >= 0L)
        {
            bi1.a("x-amz-unencrypted-content-length", Long.toString(l));
        }
        long l1 = a(n1.d(), bo1, bi1);
        if (l1 >= 0L)
        {
            bi1.a(l1);
        }
        bo1.a(bi1);
        bo1.a(a(bo1, n1.a(), l));
        bo1.a(null);
        return bo1;
    }

    public static bo a(bo bo1, ag ag1, Provider provider)
    {
        ag1 = a(ag1, provider);
        provider = a(bo1, ((n) (ag1)));
        c(bo1, ag1);
        return provider;
    }

    public static bo a(String s, String s1, n n1)
    {
        n1 = JsonUtils.a(a(n1)).getBytes();
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(n1);
        bi bi1 = new bi();
        bi1.a(n1.length);
        bi1.a("x-amz-crypto-instr-file", "");
        return new bo(s, (new StringBuilder()).append(s1).append(".instruction").toString(), bytearrayinputstream, bi1);
    }

    public static bv a(bv bv1, n n1)
    {
        bw bw1 = bv1.b();
        bv1.a(new bw(new p(bw1, n1.a()), bw1.a()));
        return bv1;
    }

    public static bv a(bv bv1, ag ag1, Provider provider)
    {
        return a(bv1, c(bv1, ag1, provider));
    }

    public static bv a(bv bv1, long al[])
    {
        if (al == null || al[0] > al[1])
        {
            return bv1;
        }
        try
        {
            bw bw1 = bv1.b();
            bv1.a(new bw(new a(bw1, al[0], al[1]), bw1.a()));
        }
        // Misplaced declaration of an exception variable
        catch (bv bv1)
        {
            throw new AmazonClientException((new StringBuilder()).append("Error adjusting output to desired byte range: ").append(bv1.getMessage()).toString());
        }
        return bv1;
    }

    public static z a(z z1)
    {
        return new z(z1.f(), (new StringBuilder()).append(z1.g()).append(".instruction").toString());
    }

    private static InputStream a(bo bo1, f f1, long l)
    {
        Object obj;
        try
        {
            obj = bo1.n();
            if (bo1.j() != null)
            {
                obj = new q(bo1.j());
            }
        }
        // Misplaced declaration of an exception variable
        catch (bo bo1)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to create cipher input stream: ").append(bo1.getMessage()).toString(), bo1);
        }
        if (l <= -1L)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        bo1 = new com.amazonaws.util.p(((InputStream) (obj)), l, false);
_L1:
        bo1 = new p(bo1, f1);
        return bo1;
        bo1 = ((bo) (obj));
          goto _L1
    }

    private static String a(InputStream inputstream)
        throws IOException
    {
        Object obj;
        if (inputstream == null)
        {
            return "";
        }
        obj = new StringBuilder();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
_L1:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((StringBuilder) (obj)).append(s);
          goto _L1
        obj;
        inputstream.close();
        throw obj;
        inputstream.close();
        return ((StringBuilder) (obj)).toString();
    }

    private static Map a(n n1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("x-amz-matdesc", JsonUtils.a(n1.b()));
        hashmap.put("x-amz-key", Base64.a(n1.c()));
        hashmap.put("x-amz-iv", Base64.a(n1.d().getIV()));
        return hashmap;
    }

    private static Map a(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = JsonUtils.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to parse encryption materials description from metadata :").append(s.getMessage()).toString());
        }
        return s;
    }

    public static Cipher a(SecretKey secretkey, int i, Provider provider, byte abyte0[])
    {
        if (provider == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        try
        {
            provider = Cipher.getInstance(q.b, provider);
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to build cipher: ").append(secretkey.getMessage()).append("\nMake sure you have the JCE unlimited strength policy files installed and ").append("configured for your JVM: http://www.ngs.ac.uk/tools/jcepolicyfiles").toString(), secretkey);
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        provider.init(i, secretkey, new IvParameterSpec(abyte0));
        return provider;
        provider = Cipher.getInstance(q.b);
        break MISSING_BLOCK_LABEL_12;
        provider.init(i, secretkey);
        return provider;
    }

    public static SecretKey a()
    {
        Object obj;
        try
        {
            obj = KeyGenerator.getInstance(q.a);
            ((KeyGenerator) (obj)).init(q.c, new SecureRandom());
            obj = ((KeyGenerator) (obj)).generateKey();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to generate envelope symmetric key:").append(nosuchalgorithmexception.getMessage()).toString(), nosuchalgorithmexception);
        }
        return ((SecretKey) (obj));
    }

    private static SecretKey a(byte abyte0[], ag ag1, Provider provider)
    {
        if (ag1.a() != null)
        {
            ag1 = ag1.a().getPrivate();
        } else
        {
            ag1 = ag1.b();
        }
        if (provider == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        provider = Cipher.getInstance(ag1.getAlgorithm(), provider);
_L1:
        provider.init(2, ag1);
        abyte0 = new SecretKeySpec(provider.doFinal(abyte0), q.a);
        return abyte0;
        try
        {
            provider = Cipher.getInstance(ag1.getAlgorithm());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to decrypt symmetric key from object metadata : ").append(abyte0.getMessage()).toString(), abyte0);
        }
          goto _L1
    }

    private static void a(bi bi1, byte abyte0[], Cipher cipher, Map map)
    {
        if (abyte0 != null)
        {
            bi1.a("x-amz-key", Base64.a(abyte0));
        }
        bi1.a("x-amz-iv", Base64.a(cipher.getIV()));
        bi1.a("x-amz-matdesc", JsonUtils.a(map));
    }

    public static boolean a(bv bv1)
    {
        bv1 = bv1.a().f();
        return bv1 != null && bv1.containsKey("x-amz-iv") && bv1.containsKey("x-amz-key");
    }

    private static byte[] a(String s, bi bi1)
        throws NullPointerException
    {
        bi1 = bi1.f();
        if (bi1 == null || !bi1.containsKey(s))
        {
            return null;
        } else
        {
            return Base64.a((String)bi1.get(s));
        }
    }

    public static byte[] a(SecretKey secretkey, ag ag1, Provider provider)
    {
        byte abyte0[];
        if (ag1.a() != null)
        {
            ag1 = ag1.a().getPublic();
        } else
        {
            ag1 = ag1.b();
        }
        try
        {
            abyte0 = secretkey.getEncoded();
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new AmazonClientException((new StringBuilder()).append("Unable to encrypt symmetric key: ").append(secretkey.getMessage()).toString(), secretkey);
        }
        if (provider == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        secretkey = Cipher.getInstance(ag1.getAlgorithm(), provider);
_L1:
        secretkey.init(1, ag1);
        secretkey = secretkey.doFinal(abyte0);
        return secretkey;
        secretkey = Cipher.getInstance(ag1.getAlgorithm());
          goto _L1
    }

    public static long[] a(long al[])
    {
        if (al == null || al[0] > al[1])
        {
            return null;
        } else
        {
            return (new long[] {
                a(al[0]), b(al[1])
            });
        }
    }

    private static long b(long l)
    {
        long l1 = q.d;
        return l1 + ((l1 - l % l1) + l);
    }

    private static n b(ag ag1, Provider provider)
    {
        SecretKey secretkey = a();
        f f1 = new f(secretkey, 1, null, provider);
        provider = a(secretkey, ag1, provider);
        return new n(ag1.c(), provider, secretkey, f1);
    }

    public static n b(bv bv1, ag ag1, Provider provider)
    {
        return a(bv1, new ck(ag1), provider);
    }

    public static n b(bv bv1, ai ai1, Provider provider)
    {
        Object obj = bv1.a();
        byte abyte0[] = a("x-amz-key", ((bi) (obj)));
        byte abyte1[] = a("x-amz-iv", ((bi) (obj)));
        obj = a(b("x-amz-matdesc", ((bi) (obj))));
        if (abyte0 == null || abyte1 == null)
        {
            throw new AmazonClientException(String.format("Necessary encryption info not found in the headers of file '%s' in bucket '%s'", new Object[] {
                bv1.d(), bv1.c()
            }));
        }
        ai1 = a(((Map) (obj)), ai1);
        if (ai1 == null)
        {
            throw new AmazonClientException(String.format("Unable to retrieve the encryption materials that originally encrypted file '%s' in bucket '%s'.", new Object[] {
                bv1.d(), bv1.c()
            }));
        } else
        {
            bv1 = a(abyte0, ai1, provider);
            return new n(((Map) (obj)), abyte0, bv1, new f(bv1, 2, abyte1, provider));
        }
    }

    public static bo b(bo bo1, n n1)
    {
        n1 = JsonUtils.a(a(n1)).getBytes();
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(n1);
        bi bi1 = bo1.k();
        bi1.a(n1.length);
        bi1.a("x-amz-crypto-instr-file", "");
        bo1.d((new StringBuilder()).append(bo1.h()).append(".instruction").toString());
        bo1.a(bi1);
        bo1.a(bytearrayinputstream);
        return bo1;
    }

    private static String b(String s, bi bi1)
        throws NullPointerException
    {
        bi1 = bi1.f();
        if (bi1 == null || !bi1.containsKey(s))
        {
            return null;
        } else
        {
            return (String)bi1.get(s);
        }
    }

    public static boolean b(bv bv1)
    {
        if (bv1 != null)
        {
            if ((bv1 = bv1.a().f()) != null)
            {
                return bv1.containsKey("x-amz-crypto-instr-file");
            }
        }
        return false;
    }

    public static n c(bv bv1, ag ag1, Provider provider)
    {
        return b(bv1, new ck(ag1), provider);
    }

    private static Map c(bv bv1)
    {
        try
        {
            bv1 = JsonUtils.a(a(bv1.b()));
        }
        // Misplaced declaration of an exception variable
        catch (bv bv1)
        {
            throw new AmazonClientException((new StringBuilder()).append("Error parsing JSON instruction file: ").append(bv1.getMessage()).toString());
        }
        return bv1;
    }

    public static void c(bo bo1, n n1)
    {
        byte abyte0[] = n1.c();
        Cipher cipher = n1.d();
        Map map = n1.b();
        bi bi1 = bo1.k();
        n1 = bi1;
        if (bi1 == null)
        {
            n1 = new bi();
        }
        if (bo1.j() != null)
        {
            n1.f(j.a().a(bo1.j()));
        }
        a(n1, abyte0, cipher, map);
        bo1.a(n1);
    }
}
