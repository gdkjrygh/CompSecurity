// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oo, pf

public final class no
{

    public static final no a = new no();
    private final oo b = null;
    private final int c = -1;
    private final int d = -1;

    private no()
    {
    }

    public final int a()
    {
        return d;
    }

    public final boolean a(no no1)
    {
        return d == no1.d;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof no)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (no)obj;
            if (c == ((no) (obj)).c)
            {
                boolean flag;
                if (d == ((no) (obj)).d && (b == ((no) (obj)).b || b != null && b.equals(((no) (obj)).b)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return b.hashCode() + c + d;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(50);
        if (b != null)
        {
            stringbuffer.append(b.h_());
            stringbuffer.append(":");
        }
        if (d >= 0)
        {
            stringbuffer.append(d);
        }
        stringbuffer.append('@');
        if (c < 0)
        {
            stringbuffer.append("????");
        } else
        {
            stringbuffer.append(pf.b(c));
        }
        return stringbuffer.toString();
    }

}
