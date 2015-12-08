// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan;

import com.b.a.b;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.p;
import com.kik.n.a.i.a;
import com.kik.scan.RemoteKikCode;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.d.s;
import kik.a.e.r;
import kik.a.f.f.al;
import kik.a.f.g;
import kik.a.h.h;
import kik.a.j.n;
import kik.android.scan.a.c;
import kik.android.util.bx;
import org.apache.http.HttpEntity;
import org.apache.http.entity.BasicHttpEntity;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package kik.android.scan:
//            e, f, g, j, 
//            i, h

public final class d
{

    private final n a;
    private final kik.a.f.k b;
    private final kik.a.e.f c;
    private final r d;
    private final f e = new f();
    private p f;
    private SecureRandom g;
    private k h;
    private ExecutorService i;

    public d(n n1, kik.a.f.k k1, p p1, kik.a.e.f f1, e e1, r r1)
    {
        g = new SecureRandom();
        h = new k(this);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadpoolexecutor.allowCoreThreadTimeOut(true);
        i = threadpoolexecutor;
        a = n1;
        b = k1;
        c = f1;
        d = r1;
        p1.a(new kik.android.scan.e(this));
        if (e1 != null)
        {
            e.a(e1, new kik.android.scan.f(this));
        }
    }

    static int a(d d1, byte abyte0[])
    {
        return d1.a(abyte0);
    }

    private int a(byte abyte0[])
    {
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        if (abyte0 == null || abyte0.length < 256)
        {
            bx.a(new IllegalArgumentException("incorrect seed format"));
            return 0;
        }
        abyte1 = new byte[1];
        abyte2 = new byte[128];
        abyte3 = new byte[129];
        g.nextBytes(abyte1);
        System.arraycopy(abyte0, 0, abyte2, 0, 128);
        System.arraycopy(abyte0, 128, abyte3, 0, 128);
        abyte3[128] = abyte1[0];
        abyte0 = kik.a.h.h.c(abyte2, abyte3);
        byte byte0 = abyte0[0];
        return abyte1[0] & 0xff | (byte0 & 0xff) << 8;
        abyte0;
_L2:
        throw new g(abyte0);
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static kik.android.scan.a.b a(RemoteKikCode remotekikcode, JSONObject jsonobject)
    {
        return b(remotekikcode, jsonobject);
    }

    static HttpEntity a(HttpURLConnection httpurlconnection)
    {
        return b(httpurlconnection);
    }

    static void a(d d1)
    {
        d1.a.d("scanning_nonce_secret", com/kik/n/a/i/a).a(new kik.android.scan.g(d1));
    }

    static void a(d d1, s s1)
    {
        if (s1 != null)
        {
            kik.a.d.a.k k1 = (kik.a.d.a.k)kik.a.d.a.g.a(s1, kik/a/d/a/k);
            if (k1 != null && d1.f != null && d1.f.g())
            {
                int l = ((Integer)d1.f.f()).intValue();
                if (k1.a() == l)
                {
                    s1 = j.a(s1.h());
                    if (s1 != null)
                    {
                        d1.h.a(s1.b());
                        d1.d.a(s1);
                    }
                }
            }
        }
    }

    private static kik.android.scan.a.b b(RemoteKikCode remotekikcode, JSONObject jsonobject)
    {
        String s1;
        s1 = jsonobject.getString("type");
        jsonobject = jsonobject.getJSONObject("payload");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        String s2 = jsonobject.getString("username");
        String s3 = jsonobject.optString("data");
        int l = jsonobject.getInt("nonce");
        if (!"username".equalsIgnoreCase(s1))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        remotekikcode = new kik.android.scan.a.a(remotekikcode, s3, l, s2);
        return remotekikcode;
        remotekikcode;
        bx.a(remotekikcode);
        return null;
    }

    private static HttpEntity b(HttpURLConnection httpurlconnection)
    {
        BasicHttpEntity basichttpentity = new BasicHttpEntity();
        java.io.InputStream inputstream;
        try
        {
            inputstream = httpurlconnection.getInputStream();
        }
        catch (IOException ioexception)
        {
            ioexception = httpurlconnection.getErrorStream();
        }
        basichttpentity.setContent(inputstream);
        basichttpentity.setContentLength(httpurlconnection.getContentLength());
        basichttpentity.setContentEncoding(httpurlconnection.getContentEncoding());
        basichttpentity.setContentType(httpurlconnection.getContentType());
        return basichttpentity;
    }

    static JSONObject b(aa aa1, int l)
    {
        return c(aa1, l);
    }

    static void b(d d1)
    {
        byte abyte0[] = new byte[256];
        d1.g.nextBytes(abyte0);
        a a1 = new a();
        a1.a(com.b.a.b.b(abyte0));
        d1.a.b("scanning_nonce_secret", null, a1);
    }

    private static JSONObject c(aa aa1, int l)
    {
        JSONObject jsonobject = new JSONObject();
        if (aa1 == null || aa1.c == null)
        {
            return jsonobject;
        }
        try
        {
            jsonobject.put("type", "username");
            jsonobject.put("payload", (new JSONObject()).put("username", aa1.c).put("nonce", l));
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            bx.f(aa1);
            return jsonobject;
        }
        return jsonobject;
    }

    public final p a(RemoteKikCode remotekikcode)
    {
        p p1 = new p();
        i.submit(new kik.android.scan.j(this, remotekikcode, p1));
        return p1;
    }

    public final p a(aa aa1, int l)
    {
        p p1 = new p();
        i.submit(new i(this, aa1, l, p1));
        return p1;
    }

    public final void a()
    {
        f = null;
    }

    public final void a(c c1, kik.a.d.k k1)
    {
        if (c1 == null || k1 == null)
        {
            return;
        }
        kik.a.e.f f1 = c;
        if (k1 == null || c1 == null)
        {
            c1 = null;
        } else
        {
            c1 = new al(c1.a(), c1.c(), c1.b(), k1.a());
        }
        f1.a(c1);
    }

    public final p b()
    {
        p p1 = com.kik.g.s.b(a.d("scanning_nonce_secret", com/kik/n/a/i/a), new kik.android.scan.h(this));
        f = p1;
        return p1;
    }

    public final e c()
    {
        return h.a();
    }
}
