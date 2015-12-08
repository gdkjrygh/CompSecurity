// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.a;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.b.e;
import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.util.a;
import com.fasterxml.jackson.core.util.f;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.a:
//            c

public abstract class b extends com.fasterxml.jackson.core.a.c
{

    static final BigInteger A;
    static final BigInteger B;
    static final BigDecimal C;
    static final BigDecimal D;
    static final BigDecimal E;
    static final BigDecimal F;
    static final long G = 0xffffffff80000000L;
    static final long H = 0x7fffffffL;
    static final double I = -9.2233720368547758E+18D;
    static final double J = 9.2233720368547758E+18D;
    static final double K = -2147483648D;
    static final double L = 2147483647D;
    protected static final int M = 48;
    protected static final int N = 49;
    protected static final int O = 50;
    protected static final int P = 51;
    protected static final int Q = 52;
    protected static final int R = 53;
    protected static final int S = 54;
    protected static final int T = 55;
    protected static final int U = 56;
    protected static final int V = 57;
    protected static final int W = 45;
    protected static final int X = 43;
    protected static final int Y = 46;
    protected static final int Z = 101;
    protected static final int aa = 69;
    protected static final char ab = 0;
    protected static final int s = 0;
    protected static final int t = 1;
    protected static final int u = 2;
    protected static final int v = 4;
    protected static final int w = 8;
    protected static final int x = 16;
    static final BigInteger y;
    static final BigInteger z;
    protected int ac;
    protected int ad;
    protected long ae;
    protected double af;
    protected BigInteger ag;
    protected BigDecimal ah;
    protected boolean ai;
    protected int aj;
    protected int ak;
    protected int al;
    protected final c b;
    protected boolean c;
    protected int d;
    protected int e;
    protected long f;
    protected int g;
    protected int h;
    protected long i;
    protected int j;
    protected int k;
    protected com.fasterxml.jackson.core.b.c l;
    protected JsonToken m;
    protected final f n;
    protected char o[];
    protected boolean p;
    protected a q;
    protected byte r[];

    protected b(c c1, int i1)
    {
        d = 0;
        e = 0;
        f = 0L;
        g = 1;
        h = 0;
        i = 0L;
        j = 1;
        k = 0;
        o = null;
        p = false;
        q = null;
        ac = 0;
        a = i1;
        b = c1;
        n = c1.d();
        l = com.fasterxml.jackson.core.b.c.i();
    }

    private void a(int i1, char ac1[], int j1, int k1)
        throws IOException, JsonParseException
    {
        String s1 = n.g();
        if (com.fasterxml.jackson.core.io.f.a(ac1, j1, k1, ai))
        {
            ae = Long.parseLong(s1);
            ac = 2;
            return;
        }
        try
        {
            ag = new BigInteger(s1);
            ac = 4;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (char ac1[])
        {
            a((new StringBuilder()).append("Malformed numeric value '").append(s1).append("'").toString(), ((Throwable) (ac1)));
        }
        return;
    }

    private void f(int i1)
        throws IOException, JsonParseException
    {
        if (i1 == 16)
        {
            try
            {
                ah = n.i();
                ac = 16;
                return;
            }
            catch (NumberFormatException numberformatexception)
            {
                a((new StringBuilder()).append("Malformed numeric value '").append(n.g()).append("'").toString(), numberformatexception);
            }
            break MISSING_BLOCK_LABEL_78;
        }
        af = n.j();
        ac = 8;
        return;
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType A()
        throws IOException, JsonParseException
    {
        if (ac == 0)
        {
            c(0);
        }
        if (aH == JsonToken.i)
        {
            if ((ac & 1) != 0)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.a;
            }
            if ((ac & 2) != 0)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.b;
            } else
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.c;
            }
        }
        if ((ac & 0x10) != 0)
        {
            return com.fasterxml.jackson.core.JsonParser.NumberType.f;
        } else
        {
            return com.fasterxml.jackson.core.JsonParser.NumberType.e;
        }
    }

    public int D()
        throws IOException, JsonParseException
    {
        if ((ac & 1) == 0)
        {
            if (ac == 0)
            {
                c(1);
            }
            if ((ac & 1) == 0)
            {
                ae();
            }
        }
        return ad;
    }

    public long E()
        throws IOException, JsonParseException
    {
        if ((ac & 2) == 0)
        {
            if (ac == 0)
            {
                c(2);
            }
            if ((ac & 2) == 0)
            {
                af();
            }
        }
        return ae;
    }

    public BigInteger F()
        throws IOException, JsonParseException
    {
        if ((ac & 4) == 0)
        {
            if (ac == 0)
            {
                c(4);
            }
            if ((ac & 4) == 0)
            {
                ag();
            }
        }
        return ag;
    }

    public float G()
        throws IOException, JsonParseException
    {
        return (float)H();
    }

    public double H()
        throws IOException, JsonParseException
    {
        if ((ac & 8) == 0)
        {
            if (ac == 0)
            {
                c(8);
            }
            if ((ac & 8) == 0)
            {
                ah();
            }
        }
        return af;
    }

    public BigDecimal I()
        throws IOException, JsonParseException
    {
        if ((ac & 0x10) == 0)
        {
            if (ac == 0)
            {
                c(16);
            }
            if ((ac & 0x10) == 0)
            {
                ai();
            }
        }
        return ah;
    }

    public Object K()
        throws IOException, JsonParseException
    {
        return null;
    }

    public com.fasterxml.jackson.core.b.c T()
    {
        return l;
    }

    public long U()
    {
        return i;
    }

    public int V()
    {
        return j;
    }

    public int W()
    {
        int i1 = k;
        if (i1 < 0)
        {
            return i1;
        } else
        {
            return i1 + 1;
        }
    }

    protected final void X()
        throws IOException
    {
        if (!Y())
        {
            an();
        }
    }

    protected abstract boolean Y()
        throws IOException;

    protected abstract void Z()
        throws IOException, JsonParseException;

    protected final int a(Base64Variant base64variant, char c1, int i1)
        throws IOException, JsonParseException
    {
        if (c1 != '\\')
        {
            throw b(base64variant, c1, i1);
        }
        char c2 = al();
        if (c2 <= ' ' && i1 == 0)
        {
            c1 = '\uFFFF';
        } else
        {
            int j1 = base64variant.b(c2);
            c1 = j1;
            if (j1 < 0)
            {
                throw b(base64variant, c2, i1);
            }
        }
        return c1;
    }

    protected final int a(Base64Variant base64variant, int i1, int j1)
        throws IOException, JsonParseException
    {
        if (i1 != 92)
        {
            throw b(base64variant, i1, j1);
        }
        char c1 = al();
        if (c1 <= ' ' && j1 == 0)
        {
            i1 = -1;
        } else
        {
            int k1 = base64variant.b(c1);
            i1 = k1;
            if (k1 < 0)
            {
                throw b(base64variant, c1, j1);
            }
        }
        return i1;
    }

    protected final JsonToken a(String s1, double d1)
    {
        n.a(s1);
        af = d1;
        ac = 8;
        return JsonToken.j;
    }

    protected final JsonToken a(boolean flag, int i1)
    {
        ai = flag;
        aj = i1;
        ak = 0;
        al = 0;
        ac = 0;
        return JsonToken.i;
    }

    protected final JsonToken a(boolean flag, int i1, int j1, int k1)
    {
        if (j1 < 1 && k1 < 1)
        {
            return a(flag, i1);
        } else
        {
            return b(flag, i1, j1, k1);
        }
    }

    protected IllegalArgumentException a(Base64Variant base64variant, int i1, int j1, String s1)
        throws IllegalArgumentException
    {
        Object obj;
        if (i1 <= 32)
        {
            base64variant = (new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(i1)).append(") as character #").append(j1 + 1).append(" of 4-char base64 unit: can only used between units").toString();
        } else
        if (base64variant.a(i1))
        {
            base64variant = (new StringBuilder()).append("Unexpected padding character ('").append(base64variant.c()).append("') as character #").append(j1 + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
        } else
        if (!Character.isDefined(i1) || Character.isISOControl(i1))
        {
            base64variant = (new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(i1)).append(") in base64 content").toString();
        } else
        {
            base64variant = (new StringBuilder()).append("Illegal character '").append((char)i1).append("' (code 0x").append(Integer.toHexString(i1)).append(") in base64 content").toString();
        }
        obj = base64variant;
        if (s1 != null)
        {
            obj = (new StringBuilder()).append(base64variant).append(": ").append(s1).toString();
        }
        return new IllegalArgumentException(((String) (obj)));
    }

    protected void a(int i1, char c1)
        throws JsonParseException
    {
        String s1 = (new StringBuilder()).append("").append(l.a(b.a())).toString();
        f((new StringBuilder()).append("Unexpected close marker '").append((char)i1).append("': expected '").append(c1).append("' (for ").append(l.e()).append(" starting at ").append(s1).append(")").toString());
    }

    protected void a(int i1, String s1)
        throws JsonParseException
    {
        String s3 = (new StringBuilder()).append("Unexpected character (").append(e(i1)).append(") in numeric value").toString();
        String s2 = s3;
        if (s1 != null)
        {
            s2 = (new StringBuilder()).append(s3).append(": ").append(s1).toString();
        }
        f(s2);
    }

    public void a(String s1)
    {
        com.fasterxml.jackson.core.b.c c1;
label0:
        {
            com.fasterxml.jackson.core.b.c c2 = l;
            if (aH != JsonToken.b)
            {
                c1 = c2;
                if (aH != JsonToken.d)
                {
                    break label0;
                }
            }
            c1 = c2.j();
        }
        c1.a(s1);
    }

    protected abstract void aa()
        throws IOException;

    protected void ab()
        throws IOException
    {
        n.a();
        char ac1[] = o;
        if (ac1 != null)
        {
            o = null;
            b.c(ac1);
        }
    }

    protected void ac()
        throws JsonParseException
    {
        if (!l.c())
        {
            e((new StringBuilder()).append(": expected close marker for ").append(l.e()).append(" (from ").append(l.a(b.a())).append(")").toString());
        }
    }

    public a ad()
    {
        if (q == null)
        {
            q = new a();
        } else
        {
            q.a();
        }
        return q;
    }

    protected void ae()
        throws IOException, JsonParseException
    {
        if ((ac & 2) != 0)
        {
            int i1 = (int)ae;
            if ((long)i1 != ae)
            {
                f((new StringBuilder()).append("Numeric value (").append(u()).append(") out of range of int").toString());
            }
            ad = i1;
        } else
        if ((ac & 4) != 0)
        {
            if (y.compareTo(ag) > 0 || z.compareTo(ag) < 0)
            {
                aj();
            }
            ad = ag.intValue();
        } else
        if ((ac & 8) != 0)
        {
            if (af < -2147483648D || af > 2147483647D)
            {
                aj();
            }
            ad = (int)af;
        } else
        if ((ac & 0x10) != 0)
        {
            if (E.compareTo(ah) > 0 || F.compareTo(ah) < 0)
            {
                aj();
            }
            ad = ah.intValue();
        } else
        {
            ap();
        }
        ac = ac | 1;
    }

    protected void af()
        throws IOException, JsonParseException
    {
        if ((ac & 1) != 0)
        {
            ae = ad;
        } else
        if ((ac & 4) != 0)
        {
            if (A.compareTo(ag) > 0 || B.compareTo(ag) < 0)
            {
                ak();
            }
            ae = ag.longValue();
        } else
        if ((ac & 8) != 0)
        {
            if (af < -9.2233720368547758E+18D || af > 9.2233720368547758E+18D)
            {
                ak();
            }
            ae = (long)af;
        } else
        if ((ac & 0x10) != 0)
        {
            if (C.compareTo(ah) > 0 || D.compareTo(ah) < 0)
            {
                ak();
            }
            ae = ah.longValue();
        } else
        {
            ap();
        }
        ac = ac | 2;
    }

    protected void ag()
        throws IOException, JsonParseException
    {
        if ((ac & 0x10) != 0)
        {
            ag = ah.toBigInteger();
        } else
        if ((ac & 2) != 0)
        {
            ag = BigInteger.valueOf(ae);
        } else
        if ((ac & 1) != 0)
        {
            ag = BigInteger.valueOf(ad);
        } else
        if ((ac & 8) != 0)
        {
            ag = BigDecimal.valueOf(af).toBigInteger();
        } else
        {
            ap();
        }
        ac = ac | 4;
    }

    protected void ah()
        throws IOException, JsonParseException
    {
        if ((ac & 0x10) != 0)
        {
            af = ah.doubleValue();
        } else
        if ((ac & 4) != 0)
        {
            af = ag.doubleValue();
        } else
        if ((ac & 2) != 0)
        {
            af = ae;
        } else
        if ((ac & 1) != 0)
        {
            af = ad;
        } else
        {
            ap();
        }
        ac = ac | 8;
    }

    protected void ai()
        throws IOException, JsonParseException
    {
        if ((ac & 8) != 0)
        {
            ah = new BigDecimal(u());
        } else
        if ((ac & 4) != 0)
        {
            ah = new BigDecimal(ag);
        } else
        if ((ac & 2) != 0)
        {
            ah = BigDecimal.valueOf(ae);
        } else
        if ((ac & 1) != 0)
        {
            ah = BigDecimal.valueOf(ad);
        } else
        {
            ap();
        }
        ac = ac | 0x10;
    }

    protected void aj()
        throws IOException, JsonParseException
    {
        f((new StringBuilder()).append("Numeric value (").append(u()).append(") out of range of int (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
    }

    protected void ak()
        throws IOException, JsonParseException
    {
        f((new StringBuilder()).append("Numeric value (").append(u()).append(") out of range of long (").append(0x8000000000000000L).append(" - ").append(0x7fffffffffffffffL).append(")").toString());
    }

    protected char al()
        throws IOException, JsonParseException
    {
        throw new UnsupportedOperationException();
    }

    protected final JsonToken b(boolean flag, int i1, int j1, int k1)
    {
        ai = flag;
        aj = i1;
        ak = j1;
        al = k1;
        ac = 0;
        return JsonToken.j;
    }

    protected IllegalArgumentException b(Base64Variant base64variant, int i1, int j1)
        throws IllegalArgumentException
    {
        return a(base64variant, i1, j1, ((String) (null)));
    }

    protected void c(int i1)
        throws IOException, JsonParseException
    {
        if (aH == JsonToken.i)
        {
            char ac1[] = n.f();
            int k1 = n.d();
            int l1 = aj;
            int j1 = k1;
            if (ai)
            {
                j1 = k1 + 1;
            }
            if (l1 <= 9)
            {
                j1 = com.fasterxml.jackson.core.io.f.a(ac1, j1, l1);
                i1 = j1;
                if (ai)
                {
                    i1 = -j1;
                }
                ad = i1;
                ac = 1;
                return;
            }
            if (l1 <= 18)
            {
                long l3 = com.fasterxml.jackson.core.io.f.b(ac1, j1, l1);
                long l2 = l3;
                if (ai)
                {
                    l2 = -l3;
                }
                if (l1 == 10)
                {
                    if (ai)
                    {
                        if (l2 >= 0xffffffff80000000L)
                        {
                            ad = (int)l2;
                            ac = 1;
                            return;
                        }
                    } else
                    if (l2 <= 0x7fffffffL)
                    {
                        ad = (int)l2;
                        ac = 1;
                        return;
                    }
                }
                ae = l2;
                ac = 2;
                return;
            } else
            {
                a(i1, ac1, j1, l1);
                return;
            }
        }
        if (aH == JsonToken.j)
        {
            f(i1);
            return;
        } else
        {
            f((new StringBuilder()).append("Current token (").append(aH).append(") not numeric, can not use numeric value accessors").toString());
            return;
        }
    }

    public void close()
        throws IOException
    {
        if (c)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        c = true;
        aa();
        ab();
        return;
        Exception exception;
        exception;
        ab();
        throw exception;
    }

    public Version d()
    {
        return e.a;
    }

    protected void d(String s1)
        throws JsonParseException
    {
        f((new StringBuilder()).append("Invalid numeric value: ").append(s1).toString());
    }

    public boolean k()
    {
        return c;
    }

    public String n()
        throws IOException, JsonParseException
    {
        if (aH == JsonToken.b || aH == JsonToken.d)
        {
            return l.j().h();
        } else
        {
            return l.h();
        }
    }

    public com.fasterxml.jackson.core.c o()
    {
        return T();
    }

    public JsonLocation p()
    {
        return new JsonLocation(b.a(), U(), V(), W());
    }

    public JsonLocation q()
    {
        int i1 = d;
        int j1 = h;
        return new JsonLocation(b.a(), (f + (long)d) - 1L, g, (i1 - j1) + 1);
    }

    public boolean y()
    {
        if (aH == JsonToken.h)
        {
            return true;
        }
        if (aH == JsonToken.f)
        {
            return p;
        } else
        {
            return false;
        }
    }

    public Number z()
        throws IOException, JsonParseException
    {
        if (ac == 0)
        {
            c(0);
        }
        if (aH == JsonToken.i)
        {
            if ((ac & 1) != 0)
            {
                return Integer.valueOf(ad);
            }
            if ((ac & 2) != 0)
            {
                return Long.valueOf(ae);
            }
            if ((ac & 4) != 0)
            {
                return ag;
            } else
            {
                return ah;
            }
        }
        if ((ac & 0x10) != 0)
        {
            return ah;
        }
        if ((ac & 8) == 0)
        {
            ap();
        }
        return Double.valueOf(af);
    }

    static 
    {
        y = BigInteger.valueOf(0xffffffff80000000L);
        z = BigInteger.valueOf(0x7fffffffL);
        A = BigInteger.valueOf(0x8000000000000000L);
        B = BigInteger.valueOf(0x7fffffffffffffffL);
        C = new BigDecimal(A);
        D = new BigDecimal(B);
        E = new BigDecimal(y);
        F = new BigDecimal(z);
    }
}
