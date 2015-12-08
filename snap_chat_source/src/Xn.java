// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class Xn
{
    public static final class a
    {

        boolean a;
        String b[];
        String c[];
        boolean d;

        public final a a()
        {
            if (!a)
            {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            } else
            {
                d = true;
                return this;
            }
        }

        public final transient a a(XD axd[])
        {
            if (!a)
            {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (axd.length == 0)
            {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String as[] = new String[axd.length];
            for (int i = 0; i < axd.length; i++)
            {
                as[i] = axd[i].d;
            }

            c = as;
            return this;
        }

        public final transient a a(String as[])
        {
            if (!a)
            {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (as == null)
            {
                b = null;
                return this;
            } else
            {
                b = (String[])as.clone();
                return this;
            }
        }

        public final transient a b(String as[])
        {
            if (!a)
            {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (as == null)
            {
                c = null;
                return this;
            } else
            {
                c = (String[])as.clone();
                return this;
            }
        }

        public final Xn b()
        {
            return new Xn(this, (byte)0);
        }

        public a(Xn xn)
        {
            a = xn.d;
            b = Xn.a(xn);
            c = Xn.b(xn);
            d = xn.g;
        }

        a(boolean flag)
        {
            a = flag;
        }
    }


    public static final Xn a;
    public static final Xn b;
    public static final Xn c = (new a(false)).b();
    private static final Xk h[];
    final boolean d;
    final String e[];
    final String f[];
    public final boolean g;

    private Xn(a a1)
    {
        d = a1.a;
        e = a1.b;
        f = a1.c;
        g = a1.d;
    }

    Xn(a a1, byte byte0)
    {
        this(a1);
    }

    private List a()
    {
        XD axd[] = new XD[f.length];
        for (int i = 0; i < f.length; i++)
        {
            axd[i] = XD.a(f[i]);
        }

        return XO.a(axd);
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
        if (!XO.a(s, as1[j])) goto _L4; else goto _L3
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

    static String[] a(Xn xn)
    {
        return xn.e;
    }

    static String[] b(Xn xn)
    {
        return xn.f;
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
        if (obj instanceof Xn)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (Xn)obj;
            if (d == ((Xn) (obj)).d && (!d || Arrays.equals(e, ((Xn) (obj)).e) && Arrays.equals(f, ((Xn) (obj)).f) && g == ((Xn) (obj)).g))
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
                obj = new Xk[e.length];
                for (int i = 0; i < e.length; i++)
                {
                    obj[i] = Xk.a(e[i]);
                }

                obj = XO.a(((Object []) (obj)));
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
        h = (new Xk[] {
            Xk.m, Xk.n, Xk.h, Xk.j, Xk.i, Xk.k, Xk.l, Xk.d, Xk.c, Xk.f, 
            Xk.g, Xk.b, Xk.e, Xk.a
        });
        a a1 = new a(true);
        Xk axk[] = h;
        if (!a1.a)
        {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String as[] = new String[14];
        for (int i = 0; i < 14; i++)
        {
            as[i] = axk[i].o;
        }

        a1.b = as;
        a = a1.a(new XD[] {
            XD.a, XD.b, XD.c
        }).a().b();
        b = (new a(a)).a(new XD[] {
            XD.c
        }).a().b();
    }
}
