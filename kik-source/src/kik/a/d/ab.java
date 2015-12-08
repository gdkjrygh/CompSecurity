// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import com.b.a.n;
import com.kik.m.e;
import java.util.Arrays;
import kik.a.h.g;

public final class ab
{

    private String a;
    private String b;
    private byte c[];
    private boolean d;

    public ab(String s)
    {
        this(s, null, null);
    }

    public ab(String s, String s1)
    {
        a = s;
        b = s1;
        d = true;
    }

    public ab(String s, String s1, byte abyte0[])
    {
        a = s;
        b = s1;
        c = abyte0;
    }

    public static ab a(String s, String s1, n n)
    {
        return new ab(s, s1, g.a(n));
    }

    public final n a(Class class1)
    {
        return g.a(c, class1);
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final byte[] c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public final String e()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(a);
        if (b != null)
        {
            stringbuffer.append('.').append(b);
        }
        return stringbuffer.toString();
    }

    public final boolean equals(Object obj)
    {
        if ((obj instanceof ab) && obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!((ab) (obj = (ab)obj)).a.equals(a) || ((ab) (obj)).b == null && b != null || ((ab) (obj)).b != null && b == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ab) (obj)).b == null && b == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((ab) (obj)).b.equals(b))
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        return true;
        if (((ab) (obj)).c == null && c != null || ((ab) (obj)).c != null && c == null) goto _L1; else goto _L3
_L3:
        if ((((ab) (obj)).c != null || c != null) && !Arrays.equals(((ab) (obj)).c, c))
        {
            return false;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (c != null)
        {
            k = c.hashCode();
        }
        return j << 7 ^ (0x902fae0a ^ i) ^ k << 15;
    }

    public final String toString()
    {
        Object obj = a;
        byte abyte0[] = c;
        String s = ((String) (obj));
        if (b != null)
        {
            s = (new StringBuilder()).append(((String) (obj))).append(".").append(b).toString();
        }
        obj = (new StringBuilder("\"")).append(s).append("\"=");
        if (abyte0 == null)
        {
            s = "(null)";
        } else
        {
            s = com.kik.m.e.a(abyte0);
        }
        return ((StringBuilder) (obj)).append(s).toString();
    }
}
