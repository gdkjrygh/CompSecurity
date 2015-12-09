// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.CipherSuite;
import com.squareup.okhttp.TlsVersion;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class grb
{

    public static final grb a;
    public static final grb b;
    public static final grb c = (new grc(false)).b();
    private static final CipherSuite h[];
    final boolean d;
    final String e[];
    final String f[];
    final boolean g;

    private grb(grc grc1)
    {
        d = grc1.a;
        e = grc1.b;
        f = grc1.c;
        g = grc1.d;
    }

    grb(grc grc1, byte byte0)
    {
        this(grc1);
    }

    private List a()
    {
        TlsVersion atlsversion[] = new TlsVersion[f.length];
        for (int i = 0; i < f.length; i++)
        {
            atlsversion[i] = TlsVersion.a(f[i]);
        }

        return gsp.a(atlsversion);
    }

    private static boolean a(String as[], String as1[])
    {
        boolean flag1 = true;
        if (as != null && as1 != null && as.length != 0 && as1.length != 0) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L6:
        return flag;
_L2:
        int k;
        k = as.length;
_L7:
        String s;
        int i;
        int j;
        int l;
        for (i = 0; i >= k;)
        {
            break MISSING_BLOCK_LABEL_102;
        }

        s = as[i];
        l = as1.length;
        j = 0;
_L8:
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (!gsp.a(s, as1[j])) goto _L4; else goto _L3
_L3:
        j = 1;
_L9:
        flag = flag1;
        if (j != 0) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        j++;
          goto _L8
        j = 0;
          goto _L9
        return false;
          goto _L7
    }

    static String[] a(grb grb1)
    {
        return grb1.e;
    }

    static String[] b(grb grb1)
    {
        return grb1.f;
    }

    public final boolean a(SSLSocket sslsocket)
    {
        String as[];
        if (d)
        {
            if (a(f, as = sslsocket.getEnabledProtocols()))
            {
                if (e == null)
                {
                    if (sslsocket.getEnabledCipherSuites().length > 0)
                    {
                        return true;
                    }
                } else
                {
                    sslsocket = sslsocket.getEnabledCipherSuites();
                    return a(e, ((String []) (sslsocket)));
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof grb)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (grb)obj;
            if (d == ((grb) (obj)).d && (!d || Arrays.equals(e, ((grb) (obj)).e) && Arrays.equals(f, ((grb) (obj)).f) && g == ((grb) (obj)).g))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int i = 17;
        if (d)
        {
            int j = Arrays.hashCode(e);
            int k = Arrays.hashCode(f);
            if (g)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            i += ((j + 527) * 31 + k) * 31;
        }
        return i;
    }

    public final String toString()
    {
        if (d)
        {
            Object obj;
            if (e == null)
            {
                obj = null;
            } else
            {
                obj = new CipherSuite[e.length];
                for (int i = 0; i < e.length; i++)
                {
                    obj[i] = CipherSuite.a(e[i]);
                }

                obj = gsp.a(((Object []) (obj)));
            }
            if (obj == null)
            {
                obj = "[use default]";
            } else
            {
                obj = obj.toString();
            }
            return (new StringBuilder("ConnectionSpec(cipherSuites=")).append(((String) (obj))).append(", tlsVersions=").append(a()).append(", supportsTlsExtensions=").append(g).append(")").toString();
        } else
        {
            return "ConnectionSpec()";
        }
    }

    static 
    {
        h = (new CipherSuite[] {
            CipherSuite.m, CipherSuite.n, CipherSuite.h, CipherSuite.j, CipherSuite.i, CipherSuite.k, CipherSuite.l, CipherSuite.d, CipherSuite.c, CipherSuite.f, 
            CipherSuite.g, CipherSuite.b, CipherSuite.e, CipherSuite.a
        });
        grc grc1 = new grc(true);
        CipherSuite aciphersuite[] = h;
        if (!grc1.a)
        {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String as[] = new String[14];
        for (int i = 0; i < 14; i++)
        {
            as[i] = aciphersuite[i].javaName;
        }

        grc1.b = as;
        a = grc1.a(new TlsVersion[] {
            TlsVersion.a, TlsVersion.b, TlsVersion.c
        }).a().b();
        b = (new grc(a)).a(new TlsVersion[] {
            TlsVersion.c
        }).a().b();
    }
}
