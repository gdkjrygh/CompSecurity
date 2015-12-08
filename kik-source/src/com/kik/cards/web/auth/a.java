// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.g.f;
import com.kik.g.i;
import com.kik.m.e;
import com.kik.sdkutils.ab;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kik.a.d.aa;
import kik.a.e.d;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.j;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.util.bx;
import org.c.b;
import org.c.c;
import org.spongycastle.asn1.sec.SECNamedCurves;
import org.spongycastle.asn1.sec.SECObjectIdentifiers;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.signers.ECDSASigner;
import org.spongycastle.crypto.util.PrivateKeyFactory;

// Referenced classes of package com.kik.cards.web.auth:
//            b, c, d

public final class a
    implements d, j
{

    private static final b a = org.c.c.a("KikAuthManager");
    private final kik.a.e.f b;
    private final v c;
    private final t d;
    private final w e;
    private String f;
    private long g;
    private String h;
    private String i;
    private boolean j;
    private f k;
    private final i l = new com.kik.cards.web.auth.b(this);
    private final i m = new com.kik.cards.web.auth.c(this);

    public a(kik.a.e.f f1, v v1, t t1, w w1)
    {
        j = false;
        k = new f();
        b = f1;
        c = v1;
        d = t1;
        e = w1;
        f = c.n("kik.auth.manager.store.url");
        g = c.o("kik.auth.manager.store.revalidate").longValue();
        h = c.n("kik.auth.manager.store.signature");
        i = c.n("kik.auth.manager.store.username.in.hash");
        a(w1.d().c);
        k.a(b.b(), l);
        k.a(e.a(), m);
    }

    private static String a(String s, byte abyte0[])
    {
        byte abyte2[];
        int i1;
        try
        {
            abyte0 = (ECPrivateKeyParameters)PrivateKeyFactory.a(abyte0);
            byte abyte1[] = s.getBytes("UTF-8");
            Object obj = SECNamedCurves.a(SECObjectIdentifiers.H);
            s = new SHA256Digest();
            obj = new ECDomainParameters(((X9ECParameters) (obj)).c(), ((X9ECParameters) (obj)).d(), ((X9ECParameters) (obj)).e(), ((X9ECParameters) (obj)).f(), ((X9ECParameters) (obj)).g());
            abyte0 = new ECPrivateKeyParameters(abyte0.c(), ((ECDomainParameters) (obj)));
            s.a(abyte1, 0, abyte1.length);
            abyte1 = new byte[s.b()];
            s.a(abyte1, 0);
            s = new ECDSASigner();
            s.a(true, abyte0);
            abyte0 = s.a(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s = abyte0[0];
        abyte0 = abyte0[1];
        s = s.toByteArray();
        abyte0 = abyte0.toByteArray();
        abyte2 = new byte[64];
        i1 = 0;
        while (i1 < 64) 
        {
            abyte2[i1] = 0;
            i1++;
        }
          goto _L1
_L4:
        if (s.length >= 32)
        {
            System.arraycopy(s, s.length - 32, abyte2, 0, 32);
        } else
        {
            System.arraycopy(s, 0, abyte2, 32 - s.length, s.length);
        }
        if (abyte0.length < 32)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        System.arraycopy(abyte0, abyte0.length - 32, abyte2, 32, 32);
_L2:
        return com.kik.m.e.b(abyte2);
        System.arraycopy(abyte0, 0, abyte2, 64 - abyte0.length, abyte0.length);
          goto _L2
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(a a1)
    {
        boolean flag1 = true;
        boolean flag;
        if (a1.i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || a1.j)
        {
            return;
        }
        if (a1.j() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a1.d();
            a1.f();
            return;
        } else
        {
            a1.e();
            return;
        }
    }

    static void a(a a1, String s)
    {
        a1.a(s);
    }

    static void a(a a1, KeyPair keypair)
    {
        Object obj = new DESKeySpec(a1.h().getBytes("UTF8"));
        Object obj1 = SecretKeyFactory.getInstance("DES").generateSecret(((java.security.spec.KeySpec) (obj)));
        obj = Cipher.getInstance("DES");
        ((Cipher) (obj)).init(1, ((java.security.Key) (obj1)));
        obj1 = com.kik.m.e.a(((Cipher) (obj)).doFinal(keypair.getPublic().getEncoded()));
        keypair = com.kik.m.e.a(((Cipher) (obj)).doFinal(keypair.getPrivate().getEncoded()));
        a1.c.c("kik.auth.gen.pub.key", ((String) (obj1)));
        a1.c.c("kik.auth.gen.priv.key", keypair);
    }

    private void a(String s)
    {
        if (s != null && !s.equals(i))
        {
            c.c("kik.auth.gen.pub.key", null);
            c.c("kik.auth.gen.priv.key", null);
            d();
            i = s;
            c.c("kik.auth.manager.store.username.in.hash", i);
        }
    }

    private String b(String s)
    {
        if (z.a(c)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte abyte0[];
        try
        {
            abyte0 = i();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (abyte0 == null) goto _L1; else goto _L3
_L3:
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(s.getBytes(), mac.getAlgorithm()));
        s = com.kik.m.e.a(mac.doFinal(abyte0));
        return s;
    }

    static w b(a a1)
    {
        return a1.e;
    }

    private static String c(String s)
    {
        try
        {
            s = com.kik.m.e.b(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    static boolean c(a a1)
    {
        a1.j = false;
        return false;
    }

    private void d()
    {
        g = 0L;
        f = null;
        g();
    }

    static void d(a a1)
    {
        a1.e();
    }

    private void e()
    {
        if (g >= ab.a()) goto _L2; else goto _L1
_L1:
        Object obj = null;
        Object obj1 = com.kik.m.e.a(i());
        obj = obj1;
_L4:
        obj1 = z.b(c);
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        bx.a(new RuntimeException("Generating certificate without credentials"));
_L2:
        return;
        obj1;
        a.a("Key generation failed", ((Throwable) (obj1)));
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = ((z) (obj1)).b();
        if (obj1 == null)
        {
            bx.a(new RuntimeException("Generating certificate without passkey"));
            return;
        }
        h = b(((String) (obj1)));
        if (obj != null && h != null)
        {
            obj = new kik.a.f.f.b(this, ((String) (obj)), h, f);
            b.a(((kik.a.f.f.z) (obj)));
            return;
        } else
        {
            a.a("No key, not uploading.");
            return;
        }
    }

    private void f()
    {
        j = true;
        (new com.kik.cards.web.auth.d(this)).execute(new Void[0]);
    }

    private void g()
    {
        c.c("kik.auth.manager.store.url", f);
        c.a("kik.auth.manager.store.revalidate", Long.valueOf(g));
        c.c("kik.auth.manager.store.signature", h);
    }

    private String h()
    {
        String s = i;
        if (s == null)
        {
            return null;
        } else
        {
            s = (new StringBuilder()).append(KikApplication.b()).append("-").append(s).toString();
            return d.a(s);
        }
    }

    private byte[] i()
    {
        String s = c.n("kik.auth.gen.pub.key");
        if (s == null)
        {
            return null;
        } else
        {
            Object obj = new DESKeySpec(h().getBytes("UTF8"));
            obj = SecretKeyFactory.getInstance("DES").generateSecret(((java.security.spec.KeySpec) (obj)));
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, ((java.security.Key) (obj)));
            return cipher.doFinal(com.kik.m.e.a(s));
        }
    }

    private RSAPublicKey j()
    {
        byte abyte0[] = i();
        if (abyte0 == null)
        {
            return null;
        }
        RSAPublicKey rsapublickey = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(abyte0));
        return rsapublickey;
        Object obj;
        obj;
        ((IOException) (obj)).printStackTrace();
_L2:
        return null;
        obj;
        ((GeneralSecurityException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String a(Map map, String s)
    {
        Object obj = new HashMap();
        long l1 = kik.a.h.j.b() / 1000L;
        ((Map) (obj)).put("cty", "text/plain");
        ((Map) (obj)).put("alg", "RS256");
        ((Map) (obj)).put("x5u", b().toString());
        ((Map) (obj)).put("typ", "JWT");
        ((Map) (obj)).put("nbf", Long.valueOf(l1));
        ((Map) (obj)).put("exp", Long.valueOf(l1 + 10800L));
        ((Map) (obj)).putAll(map);
        obj = c((new c.a.a.d(((Map) (obj)))).toString());
        s = c(s);
        map = new StringBuilder();
        map.append(((String) (obj)));
        map.append(".");
        map.append(s);
        try
        {
            s = map.toString();
            RSAPrivateKey rsaprivatekey = c();
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(rsaprivatekey);
            signature.update(s.getBytes("UTF-8"));
            s = com.kik.m.e.b(signature.sign());
            map.append(".");
            map.append(s);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new Exception(map.getMessage(), map.getCause());
        }
        return map.toString();
    }

    public final String a(Map map, String s, byte abyte0[])
    {
        Object obj = new HashMap();
        long l1 = kik.a.h.j.b() / 1000L;
        ((Map) (obj)).put("cty", "text/plain");
        ((Map) (obj)).put("alg", "ES256");
        ((Map) (obj)).put("typ", "JWT");
        ((Map) (obj)).put("nbf", Long.valueOf(l1));
        ((Map) (obj)).put("exp", Long.valueOf(l1 + 10800L));
        ((Map) (obj)).putAll(map);
        map = c((new c.a.a.d(((Map) (obj)))).toString());
        obj = c(s);
        s = new StringBuilder();
        s.append(map);
        s.append(".");
        s.append(((String) (obj)));
        try
        {
            map = a(s.toString(), abyte0);
            s.append(".");
            s.append(map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new Exception(map.getMessage(), map.getCause());
        }
        return s.toString();
    }

    public final void a()
    {
        k.a();
    }

    public final void a(kik.a.f.f.z z1, int i1)
    {
        if (!(z1 instanceof kik.a.f.f.b)) goto _L2; else goto _L1
_L1:
        z1 = (kik.a.f.f.b)z1;
        i1;
        JVM INSTR tableswitch 2 3: default 36
    //                   2 37
    //                   3 62;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        f = z1.a();
        g = ab.a() + z1.b();
        g();
        return;
_L4:
        if (z1.d())
        {
            f();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final URL b()
    {
        if (f == null)
        {
            return null;
        }
        URL url;
        try
        {
            url = new URL(f);
        }
        catch (MalformedURLException malformedurlexception)
        {
            malformedurlexception.printStackTrace();
            malformedurlexception = null;
        }
        return url;
    }

    public final RSAPrivateKey c()
    {
        Object obj;
        Object obj1;
        obj = c.n("kik.auth.gen.priv.key");
        obj1 = h();
        if (obj != null && obj1 != null) goto _L2; else goto _L1
_L2:
        obj1 = new DESKeySpec(((String) (obj1)).getBytes("UTF8"));
        obj1 = SecretKeyFactory.getInstance("DES").generateSecret(((java.security.spec.KeySpec) (obj1)));
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(2, ((java.security.Key) (obj1)));
        obj = cipher.doFinal(com.kik.m.e.a(((String) (obj))));
          goto _L3
_L6:
        obj = (RSAPrivateKey)KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(((byte []) (obj))));
        return ((RSAPrivateKey) (obj));
        obj;
        ((IOException) (obj)).printStackTrace();
_L4:
        return null;
        obj;
        ((GeneralSecurityException) (obj)).printStackTrace();
        if (true) goto _L4; else goto _L1
_L1:
        obj = null;
_L3:
        if (obj != null) goto _L6; else goto _L5
_L5:
        return null;
    }

}
