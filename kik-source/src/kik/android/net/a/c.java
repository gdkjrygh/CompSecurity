// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import com.kik.g.p;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.a.a;
import kik.a.d.f;
import kik.a.d.j;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.f.g;
import kik.a.f.k;
import kik.a.h.i;
import kik.a.z;
import kik.android.util.DeviceUtils;
import kik.android.util.ak;
import kik.android.util.bx;
import org.apache.http.client.HttpResponseException;
import org.c.b;

// Referenced classes of package kik.android.net.a:
//            b, h, d, a, 
//            n, l

public final class c extends kik.android.net.a.b
{
    private static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private static final b B = org.c.c.a("ContentUploadItem");
    private int A;
    private String C;
    private com.kik.android.a D;
    private k E;
    private n F;
    private v G;
    private kik.a.e.i H;
    private t I;
    private p J;
    private int K;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final byte i[];
    private final boolean j;
    private kik.a.d.a.a k;
    private ArrayList l;
    private long m;
    private File n;
    private String o;
    private long p;
    private int q;
    private kik.android.e.e.a r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final long x;
    private int y;
    private long z;

    public c(kik.a.d.a.a a1, String s1, String s2, byte abyte0[], com.kik.android.a a2, k k1, n n1, 
            v v1, kik.a.e.i i1, t t1)
    {
        this(a1, s1, s2, abyte0, a2, false, k1, n1, v1, i1, t1);
    }

    public c(kik.a.d.a.a a1, String s1, String s2, byte abyte0[], com.kik.android.a a2, boolean flag, k k1, 
            n n1, v v1, kik.a.e.i i1, t t1)
    {
        boolean flag1 = false;
        super();
        q = 0;
        s = -400;
        t = -500;
        u = -600;
        v = -700;
        w = -800;
        x = 0x96000L;
        y = 0;
        z = 0L;
        A = 0;
        J = new p();
        K = kik.android.net.a.a.a;
        D = a2;
        k = a1;
        j = flag;
        F = n1;
        E = k1;
        G = v1;
        I = t1;
        H = i1;
        a2 = a1.g("int-chunk-progress");
        int j1 = ((flag1) ? 1 : 0);
        if (a2 != null)
        {
            j1 = ((flag1) ? 1 : 0);
            if (a2.length() > 0)
            {
                j1 = Integer.parseInt(a2);
            }
        }
        z = j1;
        n = a1.k();
        c = a1.o();
        d = a1.u();
        o = a1.g("file-name");
        e = a1.g("file-content-type");
        i = abyte0;
        f = s1;
        g = s2;
        s1 = a1.g("app-pkg");
        a1 = s1;
        if (s1 == null)
        {
            a1 = "";
        }
        h = a1;
        l = new ArrayList();
        n();
    }

    static int a(c c1, int i1)
    {
        c1.K = i1;
        return i1;
    }

    static File a(c c1, File file)
    {
        c1.n = file;
        return file;
    }

    static String a(c c1, String s1)
    {
        c1.o = s1;
        return s1;
    }

    private static String a(h h1, long l1, long l2)
    {
        MessageDigest messagedigest;
        byte abyte0[];
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (h h1)
        {
            throw new RuntimeException("no md5?");
        }
        abyte0 = new byte[4096];
        h1.a(l1);
        do
        {
            if (l1 >= l2)
            {
                break;
            }
            int i1;
            if (l2 - l1 < 4096L)
            {
                i1 = (int)(l2 - l1);
            } else
            {
                i1 = 4096;
            }
            i1 = h1.a(abyte0, i1);
            if (i1 < 0)
            {
                break;
            }
            messagedigest.update(abyte0, 0, i1);
            l1 += i1;
        } while (true);
        return kik.a.h.i.a(messagedigest.digest());
    }

    static boolean a(c c1)
    {
        s s1 = c1.o();
        if (s1 != null)
        {
            c1.G.c(s1);
            return true;
        } else
        {
            return false;
        }
    }

    static File b(c c1)
    {
        return c1.n;
    }

    static kik.a.d.a.a c(c c1)
    {
        return c1.k;
    }

    static ArrayList d(c c1)
    {
        return c1.l;
    }

    private boolean d(int i1)
    {
        if (f != null && g != null)
        {
            f f1 = H.a(f);
            if (f1 != null)
            {
                if (!f1.a(g, "int-file-state", String.valueOf(i1), G))
                {
                    k.a("int-file-state", String.valueOf(i1));
                }
                for (Iterator iterator = l.iterator(); iterator.hasNext(); ((kik.a.d.a.a)iterator.next()).a("int-file-state", String.valueOf(i1))) { }
                return true;
            }
        }
        return false;
    }

    static int e(c c1)
    {
        return c1.A;
    }

    private void n()
    {
label0:
        {
            if (k.l())
            {
                s s1 = o();
                if (s1 == null || s1.c() != -100)
                {
                    break label0;
                }
            }
            return;
        }
        K = kik.android.net.a.a.b;
        kik.android.i.i.a().a(n.getPath(), ak.b(n.getPath()), k.o()).a(new d(this));
        A = 2;
    }

    private s o()
    {
        if (f != null && H != null && g != null)
        {
            f f1 = H.a(f);
            if (f1 != null)
            {
                return f1.a(g);
            }
        }
        return null;
    }

    public final int a()
    {
        int i1 = 0;
        if (A == 0)
        {
            return 0;
        }
        if (p != 0L)
        {
            i1 = Math.min((int)Math.floor(((double)((long)y * 0x96000L + z) * 100D) / (double)p), 100);
        }
        q = Math.max(q, i1);
        return q;
    }

    public final void a(kik.a.d.a.a a1)
    {
        l.add(a1);
    }

    public final void a(kik.android.e.e.a a1)
    {
        r = a1;
    }

    protected final boolean a(int i1)
    {
        switch (i1)
        {
        default:
            return true;

        case -700: 
        case 401: 
        case 412: 
        case 413: 
            return false;
        }
    }

    public final int b()
    {
        if (K == kik.android.net.a.a.b)
        {
            return 2;
        } else
        {
            return A;
        }
    }

    final int c()
    {
        if (n == null || !n.exists() || !n.canRead())
        {
            i();
            return -400;
        }
        if (K == kik.android.net.a.a.b)
        {
            A = 2;
            return -800;
        }
        if (k.l())
        {
            n();
            return -800;
        }
        if (K == kik.android.net.a.a.a && k.l())
        {
            n();
            return -800;
        }
        Object obj5;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        long l2 = System.currentTimeMillis();
        obj5 = new kik.android.net.a.a(n, "r", i, new byte[16], true);
        m = m + (System.currentTimeMillis() - l2);
_L1:
        p = ((h) (obj5)).a();
        long l8;
        long l5 = p / 0x96000L;
        IOException ioexception;
        long l3;
        if (p % 0x96000L == 0L)
        {
            l3 = 0L;
        } else
        {
            l3 = 1L;
        }
        l8 = l5 + l3;
        if (A == -1)
        {
            return -500;
        }
        break MISSING_BLOCK_LABEL_254;
        try
        {
            obj5 = new kik.android.net.a.n(n, "r");
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            B.b("Unable to create random access file: ", ioexception);
            i();
            return -400;
        }
          goto _L1
        String s1;
        String s2;
        long l4;
        long l9;
        A = 3;
        s2 = (new StringBuilder()).append(E.g()).append(c).toString();
        Object obj = null;
        s1 = obj;
        if (o != null)
        {
            s1 = obj;
            if (o.contains("."))
            {
                s1 = o.substring(o.lastIndexOf("."));
            }
        }
        if (r != null)
        {
            r.a();
        }
        l9 = System.currentTimeMillis();
        l4 = 0L;
        z z1 = kik.a.z.b(G);
        if (z1 == null)
        {
            try
            {
                ((h) (obj5)).close();
            }
            catch (IOException ioexception1)
            {
                A = 1;
                return -1;
            }
            return -600;
        }
        byte abyte0[];
        int l1;
        if (C == null)
        {
            C = a(((h) (obj5)), 0L, p);
        }
        abyte0 = new byte[4096];
        l1 = (int)p;
        Object obj2 = null;
        int j1 = y;
_L16:
        if ((long)j1 >= l8) goto _L3; else goto _L2
_L2:
        z = 0L;
        long l7 = 0x96000L * (long)j1;
        long l11 = Math.min(p, 0x96000L * (long)(j1 + 1));
        int k1 = -1;
        Object obj1 = new l();
        Object obj3;
        Object obj4;
        int i1;
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        String s3 = I.a((new StringBuilder("YA=57aSA!ztajE5")).append(c).append(d).toString());
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((h) (obj5)).a(l7);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        String s4 = a(((h) (obj5)), l7, l11);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((h) (obj5)).a(l7);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("Content-Length", Long.toString(l11 - l7));
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("User-Agent", DeviceUtils.a("Content"));
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-jid", z1.a().a());
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-password", z1.b());
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-verification", s3);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-app-id", d);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-content-chunks", Long.toString(l8));
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-content-size", Long.toString(l1));
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-content-md5", C);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-chunk-number", Long.toString(j1));
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-chunk-md5", s4);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_875;
        }
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-encrypted", "1");
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        if ("com.kik.ext.video-camera".equals(d)) goto _L5; else goto _L4
_L4:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        if (!"com.kik.ext.video-gallery".equals(d)) goto _L6; else goto _L5
_L5:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("Content-Type", "video/mp4");
_L14:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_965;
        }
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("x-kik-content-extension", s1);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a(s2, "PUT", ((l) (obj2)));
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        long l10 = System.currentTimeMillis();
        long l6 = l7;
_L12:
        if (l6 >= l11) goto _L8; else goto _L7
_L7:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        if (A == 1) goto _L8; else goto _L9
_L9:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        int i2 = Math.min(4096, (int)(l11 - l6));
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        int j2 = ((h) (obj5)).a(abyte0, i2);
        if (j2 < 0) goto _L11; else goto _L10
_L10:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).write(abyte0, 0, j2);
        l6 = (long)j2 + l6;
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        z = Math.max(0L, l6 - l7 - 4096L);
          goto _L12
_L6:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        if (kik.a.h.i.a(o)) goto _L14; else goto _L13
_L13:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        if (kik.a.h.i.a(e)) goto _L14; else goto _L15
_L15:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).a("Content-Type", e);
          goto _L14
        obj1;
        if (obj1 instanceof HttpResponseException)
        {
            j1 = ((HttpResponseException)obj1).getStatusCode();
            if (b.contains(Integer.valueOf(j1)))
            {
                A = -1;
            }
        }
        Thread.sleep(500L);
_L17:
        (new StringBuilder("Failed after ")).append(y).append(" successful chunks with code ").append(i1);
        (new StringBuilder("status text = ")).append(((l) (obj4)).d());
        (new StringBuilder("error body = ")).append(((l) (obj4)).b());
        throw obj1;
        obj1;
        obj3 = obj4;
_L20:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1333;
        }
        ((l) (obj3)).c();
        throw obj1;
        obj1;
        double d1;
        long l12;
        boolean flag;
        try
        {
            ((h) (obj5)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            A = 1;
            return -1;
        }
        throw obj1;
_L11:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        bx.a(new Exception((new StringBuilder("bytesRead was negative: ")).append(j2).append(". bytesToRead: ").append(i2).toString()));
_L8:
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        i2 = A;
        if (i2 != 1)
        {
            break MISSING_BLOCK_LABEL_1439;
        }
        ((l) (obj1)).c();
        try
        {
            ((h) (obj5)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            A = 1;
            return -1;
        }
        return -700;
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        ((l) (obj1)).flush();
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        l12 = System.currentTimeMillis();
        l4 = (l12 - l10) + l4;
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        k1 = ((l) (obj1)).a();
        if (k1 == 200)
        {
            break MISSING_BLOCK_LABEL_1680;
        }
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        (new StringBuilder("Failed after ")).append(y).append(" successful chunks with code ").append(k1);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        B.b((new StringBuilder("status text = ")).append(((l) (obj1)).d()).toString());
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        B.b((new StringBuilder("error body = ")).append(((l) (obj1)).b()).toString());
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        if (!b.contains(Integer.valueOf(k1)))
        {
            break MISSING_BLOCK_LABEL_1658;
        }
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        j();
        ((l) (obj1)).c();
        try
        {
            ((h) (obj5)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            A = 1;
            return -1;
        }
        return k1;
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        y = y + 1;
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        z = l6 - l7;
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        F.a(c, y);
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        i2 = y;
        g g1;
        if ((long)i2 != l8)
        {
            obj2 = obj1;
            obj1 = null;
        } else
        {
            obj2 = null;
        }
        i1 = k1;
        obj4 = obj1;
        obj3 = obj1;
        (new StringBuilder("Done ")).append(y);
        obj3 = obj2;
        l6 = l4;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1828;
        }
        ((l) (obj1)).c();
        l6 = l4;
        obj3 = obj2;
_L19:
        j1++;
        l4 = l6;
        obj2 = obj3;
          goto _L16
        obj2;
        ((InterruptedException) (obj2)).printStackTrace();
          goto _L17
        g1;
        obj2 = null;
_L21:
        obj3 = obj1;
        D.b("Content Encryption Failure").a("Encryption Time", (double)m / 1000D).b();
        obj3 = obj1;
        (new StringBuilder("Failed on chunk ")).append(y).append(" with error ").append(g1);
        obj3 = obj2;
        l6 = l4;
        if (obj1 == null) goto _L19; else goto _L18
_L18:
        ((l) (obj1)).c();
        obj3 = obj2;
        l6 = l4;
          goto _L19
_L3:
        if ((long)y != l8)
        {
            break MISSING_BLOCK_LABEL_2195;
        }
        obj1 = D.b("Content Uploaded");
        if (i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((com.kik.android.a.f) (obj1)).a("Is Encrypted", flag).a("Content Size", p).a("App ID", d).a("Is Content Encryption Reupload", j);
        if (i != null)
        {
            ((com.kik.android.a.f) (obj1)).a("Encryption Time", (double)m / 1000D);
        }
        ((com.kik.android.a.f) (obj1)).b();
        l6 = System.currentTimeMillis() - l9;
        d1 = ((double)l4 * 1.0D) / (double)l6;
        (new StringBuilder("Chunk time = ")).append(l4).append(" total time = ").append(l6).append(" efficiency = ").append(d1);
        if (d(1))
        {
            F.a(c);
        }
        i1 = A;
        if (i1 == 1)
        {
            try
            {
                ((h) (obj5)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                A = 1;
                return -1;
            }
            return -700;
        }
        J.a(null);
        A = 4;
        try
        {
            ((h) (obj5)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            A = 1;
            return -1;
        }
        return 200;
        A = 1;
        try
        {
            ((h) (obj5)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            A = 1;
            return -1;
        }
        return -1;
        obj1;
          goto _L20
        g1;
        obj2 = null;
          goto _L21
        g1;
          goto _L21
        g1;
          goto _L21
    }

    public final String d()
    {
        return c;
    }

    public final void e()
    {
        y = 0;
        z = 0L;
        A = 0;
    }

    final boolean g()
    {
        boolean flag;
        if (a >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a = 0;
            return false;
        } else
        {
            return super.g();
        }
    }

    final void h()
    {
        super.h();
        if (K == kik.android.net.a.a.b)
        {
            kik.android.i.i.a().b(n.getPath());
        }
    }

    public final void i()
    {
        if (A != -1)
        {
            A = 1;
        }
    }

    public final void j()
    {
        A = -1;
        d(-1);
    }

    public final void k()
    {
        if (A != -1)
        {
            A = 3;
        }
    }

    public final p l()
    {
        return J;
    }

    public final long m()
    {
        if (n == null)
        {
            return 0L;
        }
        if (k != null && k.l())
        {
            File file = k.k();
            if (file != null)
            {
                return ak.a(file.getPath());
            }
        }
        return n.length();
    }

}
