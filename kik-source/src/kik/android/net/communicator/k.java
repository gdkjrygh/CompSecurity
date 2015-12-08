// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import android.net.SSLCertificateSocketFactory;
import com.kik.m.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kik.a.d.s;
import kik.a.f.a;
import kik.a.f.b;
import kik.a.f.d;
import kik.a.f.f;
import kik.a.f.f.ac;
import kik.a.f.f.v;
import kik.a.f.m;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.f.t;
import kik.a.h.j;
import kik.android.net.e;
import kik.android.util.bx;
import kik.android.util.cq;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.engines.RSAEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.c.c;

// Referenced classes of package kik.android.net.communicator:
//            j

public final class k
    implements j.a
{
    private final class a extends ByteArrayOutputStream
    {

        final k a;

        public final byte[] a()
        {
            return buf;
        }

        public final int b()
        {
            return count;
        }

        public a()
        {
            a = k.this;
            super(61440);
        }
    }


    private static final org.c.b n = org.c.c.a("KikNetSock");
    private static SSLCertificateSocketFactory o = (SSLCertificateSocketFactory)SSLCertificateSocketFactory.getDefault(10000);
    private static HostnameVerifier p = HttpsURLConnection.getDefaultHostnameVerifier();
    protected o a;
    protected n b;
    protected InputStream c;
    protected kik.android.net.b d;
    private volatile long e;
    private Socket f;
    private kik.android.net.a g;
    private kik.android.net.communicator.j h;
    private com.kik.android.b.a i;
    private final String j;
    private final String k;
    private String l;
    private com.kik.android.a m;
    private a q;

    public k(kik.android.net.communicator.j j1, com.kik.android.b.a a1, String s1, String s2, com.kik.android.a a2)
    {
        e = 0L;
        h = j1;
        i = a1;
        k = s2;
        m = a2;
        j1 = s1;
        if (s1.length() > 16)
        {
            j1 = s1.substring(0, 16);
        }
        q = new a();
        j = j1;
    }

    private void a(String s1, int i1, boolean flag)
    {
        (new StringBuilder("Connecting using TLS to: ")).append(s1).append(":").append(i1);
        long l1 = System.currentTimeMillis();
        SSLSocket sslsocket = (SSLSocket)o.createSocket();
        sslsocket.connect(new InetSocketAddress(s1, i1), 10000);
        f = sslsocket;
        f.setKeepAlive(true);
        f.setSoTimeout(10000);
        try
        {
            sslsocket.startHandshake();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (s1.getCause() instanceof NoSuchAlgorithmException)
            {
                com.kik.m.g.a((NoSuchAlgorithmException)s1.getCause());
            }
            throw new IOException((new StringBuilder("Digest error during TLS handshake: ")).append(s1.getMessage()).toString());
        }
        if (flag && !p.verify(s1, sslsocket.getSession()))
        {
            throw new SSLPeerUnverifiedException((new StringBuilder("Cannot verify hostname: ")).append(s1).toString());
        } else
        {
            long l2 = System.currentTimeMillis();
            (new StringBuilder("Connecting using TLS took ")).append(l2 - l1).append("ms");
            return;
        }
    }

    private void a(kik.a.f.g.c c1)
    {
        for (; !b.a("k"); b.next()) { }
        if (b.getAttributeValue(null, "ok").equals("1"))
        {
            break MISSING_BLOCK_LABEL_357;
        }
        a();
        b.next();
        if (b.a("noauth"))
        {
            throw new kik.a.f.a("Authorization failed. Check credentials.");
        }
        if (!b.a("redir")) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        int i1;
        int k1;
        s1 = b.getAttributeValue(null, "host");
        i1 = Integer.parseInt(b.getAttributeValue(null, "port"));
        k1 = Integer.parseInt(b.getAttributeValue(null, "ttl"));
        s2 = b.getAttributeValue(null, "tls");
        if (!"0".equals(s2)) goto _L4; else goto _L3
_L3:
        c1 = kik.a.f.g.c.a;
_L5:
        throw new f(s1, i1, k1, c1);
_L4:
        if ("1".equals(s2))
        {
            c1 = kik.a.f.g.c.b;
        } else
        if ("2".equals(s2))
        {
            c1 = kik.a.f.g.c.c;
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (b.a("wait"))
        {
            int j1 = Integer.parseInt(b.getAttributeValue(null, "t"));
            throw new b((new StringBuilder("Server reqested a backoff of ")).append(j1).append(" s").toString(), j1);
        }
        if (b.a("badhost"))
        {
            throw new IOException("Bad Host Request");
        }
        if (b.a("badver"))
        {
            throw new d("Server rejects current application version");
        }
        if (b.a("badts"))
        {
            long l1 = Long.parseLong(b.getAttributeValue(null, "ts"));
            kik.a.h.j.a(l1);
            throw new kik.a.f.c("Bad timestamp", l1);
        }
        break MISSING_BLOCK_LABEL_380;
        c1 = b.getAttributeValue(null, "ts");
        if (c1 != null)
        {
            kik.a.h.j.a(Long.parseLong(c1));
        }
        a();
        return;
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            e = System.currentTimeMillis();
        }
        if (d != null)
        {
            if (a != null)
            {
                a.c();
            }
            d.flush();
            d.a();
        }
    }

    private String b(String s1)
    {
        SecretKeySpec secretkeyspec = new SecretKeySpec(k.getBytes(), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretkeyspec);
        s1 = cq.a(mac.doFinal(s1.getBytes()));
        return s1;
        s1;
_L2:
        return "deadbeef101";
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        if (g != null)
        {
            g.a();
        }
    }

    public final void a(String s1)
    {
        d.write(s1.getBytes("UTF-8"));
        a(false);
    }

    public final void a(String s1, int i1, String s2, String s3, String s4, String s5, String s6, 
            String s7, kik.a.f.g.c c1, int j1)
    {
        Object obj;
        String s8;
        String s9;
        String s10;
        boolean flag;
        if (s2 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (c1 != kik.a.f.g.c.b) goto _L2; else goto _L1
_L1:
        a(s1, i1, true);
_L7:
        s9 = (new StringBuilder()).append(s5).append(s6).toString();
        s8 = Long.toString(kik.a.h.j.c(kik.a.h.j.b()));
        s10 = (new StringBuilder()).append(s8).append(":").toString();
        l = UUID.randomUUID().toString();
        obj = Locale.getDefault();
        s1 = "unknown";
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        obj = ((Locale) (obj)).toString();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_937;
        }
        s1 = ((String) (obj));
        if (((String) (obj)).length() < 2)
        {
            break MISSING_BLOCK_LABEL_937;
        }
_L10:
        if (!flag) goto _L4; else goto _L3
_L3:
        s5 = (new StringBuilder()).append(s10).append(s2).append("@").append(s4).toString();
        s1 = t.a(l, s2, s4, s9, s3, b(s5), s8, s7, j1, j, s1);
_L8:
        s1 = s1.getBytes();
        s2 = f.getInputStream();
        s3 = f.getOutputStream();
        if (c1 == kik.a.f.g.c.c) goto _L6; else goto _L5
_L5:
        d = new kik.android.net.b(new m(s3, 30000L, new e(f)), "KIK_XML_SND");
        c = s2;
        d.write(s1);
_L9:
        g = new kik.android.net.a(new InputStreamReader(c, "UTF-8"), "KIK_XML_RCV", i);
        b = new n();
        b.setInput(g);
        a = new o();
        a.a(d, "UTF-8");
        a(false);
        a(c1);
        f.setSoTimeout(0);
        h.a(b, this);
        (new Thread(h, "XmppInputThread")).start();
        return;
_L2:
        if (c1 != kik.a.f.g.c.d)
        {
            break MISSING_BLOCK_LABEL_439;
        }
        a(s1, i1, false);
          goto _L7
        s1;
        a(false);
        a();
        b();
        throw s1;
        (new StringBuilder("Connecting plain to: ")).append(s1).append(":").append(i1);
        long l1 = System.currentTimeMillis();
        f = new Socket();
        f.connect(new InetSocketAddress(s1, i1), 10000);
        f.setKeepAlive(true);
        f.setSoTimeout(10000);
        long l2 = System.currentTimeMillis();
        (new StringBuilder("Connecting took ")).append(l2 - l1).append("ms");
          goto _L7
_L4:
        s2 = (new StringBuilder()).append(s10).append(s9).toString();
        s1 = t.a(l, s5, s6, b(s2), s8, s7, j1, j, s1);
          goto _L8
_L6:
        s6 = new byte[32];
        (new SecureRandom()).nextBytes(s6);
        s7 = new byte[16];
        s5 = new byte[16];
        System.arraycopy(s6, 0, s7, 0, 16);
        System.arraycopy(s6, 16, s5, 0, 16);
        s4 = new RC4Engine();
        s4.init(true, new KeyParameter(s5));
        s5 = new RC4Engine();
        s5.init(true, new KeyParameter(s7));
        s7 = new RSAKeyParameters(false, new BigInteger("90174020997965854385364363362105278416879782413898203701760313296520319228892196826551938811559509433087843974940422570732771275448938469288703504602713408350493732529791404358536477358798134202720065748820825607255064945625287044798157488670202656474077596117373942197956421964804224281020753664425450091601", 10), new BigInteger("65537", 10));
        obj = new PKCS1Encoding(new RSAEngine());
        ((PKCS1Encoding) (obj)).init(true, s7);
        s6 = ((PKCS1Encoding) (obj)).processBlock(s6, 0, 32);
        s7 = new byte[s6.length + 3 + s1.length];
        s7[0] = 17;
        s7[1] = 42;
        s7[2] = 1;
        System.arraycopy(s6, 0, s7, 3, s6.length);
        s5.processBytes(s1, 0, s1.length, s7, s6.length + 3);
        s3.write(s7);
        s3.flush();
        (new StringBuilder("KIK_XML_SND: ")).append(new String(s1));
        d = new kik.android.net.b(new m(new kik.a.f.g.b(s3, s5), 30000L, new e(f)), "KIK_XML_SND");
        c = new kik.a.f.g.a(s4, s2);
          goto _L9
        s1;
        throw new IOException("wtf");
        s1 = "unknown";
          goto _L10
    }

    public final void a(ac ac1)
    {
        if (a == null || d == null) goto _L2; else goto _L1
_L1:
        (new StringBuilder("Net Debug--> Sending stanza: ")).append(ac1.getClass().getName());
        if (!(ac1 instanceof v)) goto _L4; else goto _L3
_L3:
        boolean flag;
        v v1 = (v)ac1;
        ac1 = new o();
        ac1.a(q, "UTF-8");
        q.reset();
        s s1;
        com.kik.android.a.f f1;
        try
        {
            v1.a(ac1);
        }
        // Misplaced declaration of an exception variable
        catch (ac ac1)
        {
            bx.a(ac1);
            ac1 = new o();
            ac1.a(q, "UTF-8");
            q.reset();
            v1.d();
            v1.a(ac1);
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
_L7:
        s1 = v1.e();
        if (s1 != null && kik.a.d.a.g.b(s1))
        {
            f1 = m.b("Message Stanza Sent").a("Is Encryption Failure", flag);
            if (s1.o() != null && !flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = f1.a("Is Encrypted", flag);
            if (v1.e().o() != null)
            {
                f1.a("Encryption Time", (double)s1.p() / 1000D);
            }
            f1.b();
        }
        ac1.c();
        d.write(q.a(), 0, q.b());
        q.reset();
        d.flush();
_L5:
        a(true);
        return;
_L4:
        ac1.a(a);
        a.c();
        if (true) goto _L5; else goto _L2
_L2:
        throw new IOException("No output stream available to send message to.");
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        h.b();
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        obj = d;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        a("</k>");
        a(false);
_L1:
        obj = d;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        d.close();
        d = null;
_L2:
        obj = c;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        c.close();
        c = null;
_L3:
        obj = f;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        f.close();
        f = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        (new StringBuilder("error while trying to send closing stream tag: ")).append(((Throwable) (obj1)).getMessage());
          goto _L1
        obj1;
        throw obj1;
        obj1;
        (new StringBuilder("Net Error: Failed to clean up output stream: ")).append(((IOException) (obj1)).getMessage());
        d = null;
          goto _L2
        obj1;
        d = null;
        throw obj1;
        obj1;
        (new StringBuilder("Net Error: Failed to clean up input stream: ")).append(((IOException) (obj1)).getMessage());
        c = null;
          goto _L3
        obj1;
        c = null;
        throw obj1;
        obj1;
        (new StringBuilder("Net Error: Failed to clean up connection: ")).append(((IOException) (obj1)).getMessage());
        f = null;
          goto _L4
        obj1;
        f = null;
        throw obj1;
          goto _L1
    }

    public final String c()
    {
        return l;
    }

    public final long d()
    {
        kik.android.net.a a1 = g;
        if (a1 != null)
        {
            return a1.b();
        } else
        {
            return 0L;
        }
    }

    public final long e()
    {
        return e;
    }

}
