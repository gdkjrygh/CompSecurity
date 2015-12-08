// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import ar.com.hjg.pngj.chunks.d;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package ar.com.hjg.pngj:
//            v, x, e

public class f
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(ar/com/hjg/pngj/f$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        public final boolean a()
        {
            return this == c || this == d;
        }

        public final boolean b()
        {
            return this == d;
        }

        static 
        {
            a = new a("WAITING_FOR_INPUT", 0);
            b = new a("ROW_READY", 1);
            c = new a("WORK_DONE", 2);
            d = new a("TERMINATED", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    protected byte a[];
    a b;
    public final String c;
    private int d;
    private int e;
    private int f;
    private Inflater g;
    private final boolean h;
    private e i;
    private boolean j;
    private long k;
    private long l;

    public f(String s)
    {
        this(s, 1024, 1024);
    }

    public f(String s, int i1, int j1)
    {
        b = a.a;
        j = true;
        k = 0L;
        l = 0L;
        c = s;
        e = i1;
        if (i1 <= 0 || j1 < i1)
        {
            throw new v((new StringBuilder("bad inital row len ")).append(i1).toString());
        }
        g = new Inflater();
        h = true;
        a = new byte[j1];
        f = -1;
        b = a.a;
        try
        {
            a(i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d();
        }
        throw s;
    }

    private boolean i()
    {
        try
        {
            if (b == a.b)
            {
                throw new v("invalid state");
            }
        }
        catch (RuntimeException runtimeexception)
        {
            d();
            throw runtimeexception;
        }
        if (b.a())
        {
            return false;
        }
        boolean flag;
        if (a == null || a.length < e)
        {
            a = new byte[e];
        }
        if (d >= e)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        flag = g.finished();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        int i1 = g.inflate(a, d, e - d);
        d = d + i1;
        l = l + (long)i1;
        if (d != e) goto _L2; else goto _L1
_L1:
        Object obj = a.b;
_L5:
        b = ((a) (obj));
        if (b != a.b)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        a();
        return true;
        obj;
        throw new x("error decompressing zlib stream ", ((Throwable) (obj)));
_L2:
        if (g.finished()) goto _L4; else goto _L3
_L3:
        obj = a.a;
          goto _L5
_L4:
label0:
        {
            if (d <= 0)
            {
                break label0;
            }
            obj = a.b;
        }
          goto _L5
        obj = a.c;
          goto _L5
        return false;
    }

    protected void a()
    {
    }

    public final void a(int i1)
    {
        d = 0;
        f = f + 1;
        if (i1 <= 0)
        {
            e = 0;
            e();
        } else
        {
            if (g.finished())
            {
                e = 0;
                e();
                return;
            }
            b = a.a;
            e = i1;
            if (!j)
            {
                i();
                return;
            }
        }
    }

    protected final void a(e e1)
    {
        if (!c.equals(e1.a().c))
        {
            throw new x((new StringBuilder("Bad chunk inside IdatSet, id:")).append(e1.a().c).append(", expected:").append(c).toString());
        } else
        {
            i = e1;
            return;
        }
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    protected final void a(byte abyte0[], int i1, int j1)
    {
        k = k + (long)j1;
        if (j1 > 0 && !b.a())
        {
            if (b == a.b)
            {
                throw new x("this should only be called if waitingForMoreInput");
            }
            if (g.needsDictionary() || !g.needsInput())
            {
                throw new RuntimeException("should not happen");
            }
            g.setInput(abyte0, i1, j1);
            if (j)
            {
                while (i()) 
                {
                    a(b());
                    b.a();
                }
            } else
            {
                i();
                return;
            }
        }
    }

    protected int b()
    {
        throw new x("not implemented");
    }

    public boolean c()
    {
        return b == a.b;
    }

    public void d()
    {
        try
        {
            if (!b.b())
            {
                b = ar.com.hjg.pngj.a.d;
            }
            if (h && g != null)
            {
                g.end();
                g = null;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public final void e()
    {
        if (!b.a())
        {
            b = a.c;
        }
    }

    public final int f()
    {
        return d;
    }

    public final int g()
    {
        return f;
    }

    public final boolean h()
    {
        return j;
    }

    public String toString()
    {
        return (new StringBuilder((new StringBuilder("idatSet : ")).append(i.a().c).append(" state=").append(b).append(" rows=").append(f).append(" bytes=").append(k).append("/").append(l).toString())).toString();
    }
}
