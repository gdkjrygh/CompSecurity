// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.android.volley.r;
import java.util.HashMap;
import java.util.Map;
import kik.a.d.a.a;
import kik.a.d.j;
import kik.a.f.k;
import kik.a.h.h;
import kik.a.z;
import kik.android.util.bx;
import org.bouncycastle.crypto.RuntimeCryptoException;

// Referenced classes of package com.kik.cache:
//            y, a, z

public final class o extends y
{

    private final byte f[];
    private boolean g;
    private z h;
    private com.kik.android.a i;
    private String j;

    private o(a a1, String s, com.android.volley.r.b b, android.graphics.Bitmap.Config config, com.android.volley.r.a a2, boolean flag, z z1, 
            byte abyte0[], com.kik.android.a a3)
    {
        super(a1, s, b, 0, 0, config, a2);
        g = false;
        g = flag;
        h = z1;
        f = abyte0;
        i = a3;
        if (a1 != null)
        {
            j = a1.u();
        }
    }

    public static o a(a a1, String s, com.android.volley.r.b b, com.android.volley.r.a a2, boolean flag, z z1, byte abyte0[], com.kik.android.a a3)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return new o(a1, s, b, a, a2, flag, z1, abyte0, a3);
        }
    }

    public static com.kik.cache.z a(a a1, byte abyte0[], com.kik.android.a a2, k k1, z z1)
    {
        String s = a1.g();
        if (s == null || a1.d("video"))
        {
            return null;
        }
        if (s.startsWith(k1.h()))
        {
            return a(a1, s, e, d, true, z1, abyte0, a2);
        }
        if (kik.a.f.e.a.a(s))
        {
            return com.kik.cache.a.a(s, e, d);
        } else
        {
            return a(a1, s, e, d, false, null, abyte0, a2);
        }
    }

    private static String a(a a1)
    {
        if (a1 == null || a1.o() == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(a1.o()).append(".jpg").toString();
        }
    }

    public static String c(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(s).append(".jpg").toString();
        }
    }

    protected final r a(com.android.volley.k k1)
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        com.android.volley.k k2;
        com.android.volley.k k3;
        long l1;
        l1 = System.currentTimeMillis();
        k2 = k1;
        k3 = k1;
        byte abyte0[] = kik.a.h.h.b(k1.b, f, new byte[16]);
        k2 = k1;
        k3 = k1;
        long l2 = System.currentTimeMillis();
        k2 = k1;
        k3 = k1;
        com.android.volley.k k4 = new com.android.volley.k(k1.a, abyte0, k1.c, k1.d);
        if (abyte0 != null)
        {
            k1 = k4;
        }
        k2 = k1;
        k3 = k1;
        try
        {
            i.b("Content Downloaded").a("Is Encrypted", true).a("Decryption Time", (double)(l2 - l1) / 1000D).a("Content Size", k1.b.length).a("App ID", j).b();
        }
        // Misplaced declaration of an exception variable
        catch (com.android.volley.k k1)
        {
            long l3 = System.currentTimeMillis();
            i.b("Content Decryption Failure").a("Decryption Time", (double)(l3 - l1) / 1000D).b();
            k1 = k2;
        }
        // Misplaced declaration of an exception variable
        catch (com.android.volley.k k1)
        {
            bx.a(k1);
            k1 = k3;
        }
_L4:
        return super.a(k1);
_L2:
        int l;
        if (k1.b == null)
        {
            l = 0;
        } else
        {
            l = k1.b.length;
        }
        i.b("Content Downloaded").a("Is Encrypted", false).a("Content Size", l).a("App ID", j).b();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a(int l, int i1)
    {
        String s = a((a)x());
        return (new StringBuilder("#W")).append(l).append("#H").append(i1).append(s).append("#!#ContentImageRequest").toString();
    }

    public final String e()
    {
        return a((a)x());
    }

    public final Map i()
    {
        HashMap hashmap = new HashMap();
        if (g && h != null)
        {
            hashmap.put("x-kik-jid", h.a().a());
            hashmap.put("x-kik-password", h.b());
        }
        return hashmap;
    }

    public final a u()
    {
        return (a)x();
    }
}
