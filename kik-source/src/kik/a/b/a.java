// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.b;

import com.b.a.b;
import com.kik.g.e;
import com.kik.g.k;
import com.kik.g.p;
import com.kik.g.s;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kik.a.e.o;
import kik.a.f.g;
import kik.a.h.h;
import kik.a.h.i;
import kik.a.j.m;
import org.bouncycastle.openssl.EncryptionException;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package kik.a.b:
//            f, d, e, b

public final class a
    implements o
{

    private final Object a = new Object();
    private final SecureRandom b = new SecureRandom();
    private m c;
    private p d;
    private Map e;
    private k f;
    private k g;
    private k h;
    private k i;
    private k j;
    private ECPrivateKey k;
    private ECPublicKey l;

    public a()
    {
        e = new HashMap();
        f = new k(this);
        g = new k(this);
        h = new k(this);
        i = new k(this);
        j = new k(this);
        if (Security.getProvider(BouncyCastleProvider.a) == null)
        {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    static m a(a a1)
    {
        return a1.c;
    }

    static boolean a(a a1, ECPublicKey ecpublickey, ECPrivateKey ecprivatekey)
    {
        return a1.a(ecpublickey, ecprivatekey);
    }

    private boolean a(ECPublicKey ecpublickey, ECPrivateKey ecprivatekey)
    {
        KeyFactory keyfactory;
        KeyPair keypair;
        try
        {
            keyfactory = KeyFactory.getInstance("EC", "SC");
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        try
        {
            keypair = kik.a.h.h.a("secp256k1", b);
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        k = (ECPrivateKey)keypair.getPrivate();
        l = (ECPublicKey)keypair.getPublic();
        try
        {
            if (k == null)
            {
                k = (ECPrivateKey)keyfactory.generatePrivate(new PKCS8EncodedKeySpec(kik.a.h.i.a("3082024b0201003081ec06072a8648ce3d02013081e0020101302c06072a8648ce3d0101022100fffffffffffffffffffffffffffffffffffffffffffffffffffffffefffffc2f3044042000000000000000000000000000000000000000000000000000000000000000000420000000000000000000000000000000000000000000000000000000000000000704410479be667ef9dcbbac55a06295ce870b07029bfcdb2dce28d959f2815b16f81798483ada7726a3c4655da4fbfc0e1108a8fd17b448a68554199c47d08ffb10d4b8022100fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141020101048201553082015102010104205edd965a5558175ca3462c38f003519fc870ee05db29b014d6b82330f3255a62a081e33081e0020101302c06072a8648ce3d0101022100fffffffffffffffffffffffffffffffffffffffffffffffffffffffefffffc2f3044042000000000000000000000000000000000000000000000000000000000000000000420000000000000000000000000000000000000000000000000000000000000000704410479be667ef9dcbbac55a06295ce870b07029bfcdb2dce28d959f2815b16f81798483ada7726a3c4655da4fbfc0e1108a8fd17b448a68554199c47d08ffb10d4b8022100fffffffffffffffffffffffffffffffebaaedce6af48a03bbfd25e8cd0364141020101a144034200041477c9366b434065bc03a3a5ef1cc9e1980ab6cb72353583a009b13c1c4ca0e4920bf07fc793fb870f5d8578059e763a80a900eee0f72879f500700298e26199")));
            }
            if (l == null)
            {
                l = (ECPublicKey)keyfactory.generatePublic(new X509EncodedKeySpec(kik.a.h.i.a("3056301006072a8648ce3d020106052b8104000a034200041477c9366b434065bc03a3a5ef1cc9e1980ab6cb72353583a009b13c1c4ca0e4920bf07fc793fb870f5d8578059e763a80a900eee0f72879f500700298e26199")));
            }
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        try
        {
            ecpublickey = kik.a.h.h.a(ecpublickey, k);
            ecprivatekey = kik.a.h.h.a(l, ecprivatekey);
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ECPublicKey ecpublickey)
        {
            return false;
        }
        return Arrays.equals(ecprivatekey, ecpublickey);
    }

    static k b(a a1)
    {
        return a1.h;
    }

    private byte[] b(ECPublicKey ecpublickey, ECPrivateKey ecprivatekey)
    {
        int i1 = (new org.a.a.b.a.a()).a(ecpublickey.getEncoded()).hashCode();
        byte abyte0[] = null;
        synchronized (e)
        {
            if (e.containsKey(Integer.valueOf(i1)))
            {
                abyte0 = (byte[])e.get(Integer.valueOf(i1));
            }
        }
        abyte1 = abyte0;
        if (abyte0 == null)
        {
            try
            {
                ecpublickey = kik.a.h.h.a(ecpublickey, ecprivatekey);
            }
            // Misplaced declaration of an exception variable
            catch (ECPublicKey ecpublickey)
            {
                throw new g(ecpublickey);
            }
            // Misplaced declaration of an exception variable
            catch (ECPublicKey ecpublickey)
            {
                throw new g(ecpublickey);
            }
            // Misplaced declaration of an exception variable
            catch (ECPublicKey ecpublickey)
            {
                throw new g(ecpublickey);
            }
            abyte1 = kik.a.h.h.c(ecpublickey);
            synchronized (e)
            {
                e.put(Integer.valueOf(i1), abyte1);
            }
        }
        return abyte1;
        ecpublickey;
        abyte1;
        JVM INSTR monitorexit ;
        throw ecpublickey;
        ecprivatekey;
        ecpublickey;
        JVM INSTR monitorexit ;
        throw ecprivatekey;
    }

    static k c(a a1)
    {
        return a1.i;
    }

    private void c()
    {
        synchronized (e)
        {
            e.clear();
        }
        d();
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private p d()
    {
        p p1;
        synchronized (a)
        {
            p1 = d;
            d = null;
        }
        if (p1 != null)
        {
            p1.a(new RuntimeException("Regenerating key"));
        }
        return a(false);
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static p d(a a1)
    {
        KeyPair keypair = kik.a.h.h.a("secp256k1", a1.b);
        ECPublicKey ecpublickey = (ECPublicKey)keypair.getPublic();
        ECPrivateKey ecprivatekey = (ECPrivateKey)keypair.getPrivate();
        byte abyte1[] = ecpublickey.getEncoded();
        byte abyte0[] = ecprivatekey.getEncoded();
        if (a1.c != null)
        {
            return s.b(s.a(a1.c.a("enc_messaging_priv_key", null, (new com.kik.n.a.g.a()).a(com.b.a.b.b(abyte0))), a1.c.b("messaging_pub_key", null, (new com.kik.n.a.g.a()).a(com.b.a.b.b(abyte1)))), new f(a1, keypair));
        } else
        {
            return s.a(keypair);
        }
    }

    static k e(a a1)
    {
        return a1.f;
    }

    static Map f(a a1)
    {
        return a1.e;
    }

    static Object g(a a1)
    {
        return a1.a;
    }

    static p h(a a1)
    {
        a1.d = null;
        return null;
    }

    public final e a()
    {
        return f.a();
    }

    public final p a(boolean flag)
    {
        p p1;
label0:
        {
            p1 = new p();
            synchronized (a)
            {
                if (d == null)
                {
                    break label0;
                }
                p1 = d;
            }
            return p1;
        }
        d = p1;
        obj;
        JVM INSTR monitorexit ;
        if (c == null || flag)
        {
            obj = s.a(null);
        } else
        {
            obj = s.a(s.a(c.b("enc_messaging_priv_key", com/kik/n/a/g/a), c.d("messaging_pub_key", com/kik/n/a/g/a), false), new kik.a.b.b(this));
        }
        s.b(s.a(((p) (obj)), new d(this)), p1);
        p1.a(new kik.a.b.e(this));
        return p1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(m m1)
    {
        c = m1;
    }

    public final void a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (new com.kik.n.a.g.a()).a(com.b.a.b.b(abyte0));
            c.a("enc_messaging_priv_key", null, abyte0);
        } else
        {
            c.b("enc_messaging_priv_key", null, null);
        }
        c();
    }

    public final byte[] a(byte abyte0[], ECPublicKey ecpublickey, ECPrivateKey ecprivatekey)
    {
        ecpublickey = b(ecpublickey, ecprivatekey);
        return kik.a.h.h.a(abyte0, ecpublickey, 16, ecpublickey, 16, 16);
    }

    public final p b()
    {
        return a(false);
    }

    public final void b(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (new com.kik.n.a.g.a()).a(com.b.a.b.b(abyte0));
            c.b("messaging_pub_key", null, abyte0);
        } else
        {
            c.b("messaging_pub_key", null, null);
        }
        c();
    }

    public final byte[] b(byte abyte0[], ECPublicKey ecpublickey, ECPrivateKey ecprivatekey)
    {
        ecpublickey = b(ecpublickey, ecprivatekey);
        return kik.a.h.h.b(abyte0, ecpublickey, 16, ecpublickey, 16, 16);
    }
}
