// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pq, nl, pe, nh, 
//            nj, no, na, ov

public abstract class my
    implements pq
{

    public final nl b;
    public final no c;
    public final nh d;
    public final nj e;

    public my(nl nl1, no no, nh nh1, nj nj1)
    {
        if (nl1 == null)
        {
            throw new NullPointerException("opcode == null");
        }
        if (no == null)
        {
            throw new NullPointerException("position == null");
        }
        if (nj1 == null)
        {
            throw new NullPointerException("sources == null");
        } else
        {
            b = nl1;
            c = no;
            d = nh1;
            e = nj1;
            return;
        }
    }

    public abstract void a(na na);

    public String b()
    {
        return null;
    }

    public abstract ov c();

    public final boolean equals(Object obj)
    {
        return this == obj;
    }

    public final String h_()
    {
        String s = b();
        StringBuffer stringbuffer = new StringBuffer(80);
        stringbuffer.append(c);
        stringbuffer.append(": ");
        Object obj = b;
        int j;
        if (((nl) (obj)).e != null)
        {
            obj = ((nl) (obj)).e;
        } else
        {
            obj = ((nl) (obj)).toString();
        }
        stringbuffer.append(((String) (obj)));
        if (s != null)
        {
            stringbuffer.append("(");
            stringbuffer.append(s);
            stringbuffer.append(")");
        }
        if (d == null)
        {
            stringbuffer.append(" .");
        } else
        {
            stringbuffer.append(" ");
            stringbuffer.append(d.h_());
        }
        stringbuffer.append(" <-");
        j = ((pe) (e)).K.length;
        if (j == 0)
        {
            stringbuffer.append(" .");
        } else
        {
            int i = 0;
            while (i < j) 
            {
                stringbuffer.append(" ");
                stringbuffer.append(e.b(i).h_());
                i++;
            }
        }
        return stringbuffer.toString();
    }

    public final int hashCode()
    {
        return System.identityHashCode(this);
    }

    public final String toString()
    {
        String s = b();
        StringBuffer stringbuffer = new StringBuffer(80);
        stringbuffer.append("Insn{");
        stringbuffer.append(c);
        stringbuffer.append(' ');
        stringbuffer.append(b);
        if (s != null)
        {
            stringbuffer.append(' ');
            stringbuffer.append(s);
        }
        stringbuffer.append(" :: ");
        if (d != null)
        {
            stringbuffer.append(d);
            stringbuffer.append(" <- ");
        }
        stringbuffer.append(e);
        stringbuffer.append('}');
        return stringbuffer.toString();
    }
}
