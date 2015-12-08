// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.r;
import p.db.c;
import p.dv.a;

public class aa
{

    private c a;
    private c b;
    private p.cw.c c;
    private long d;

    public aa(p.cw.c c1, r r1)
    {
        d = 0L;
        c = c1;
        c1 = r1.d();
        a = new c(c1, 0, c1.length);
        c1 = r1.e();
        b = new c(c1, 0, c1.length);
    }

    private String c(String s)
    {
        int j = 8 - s.getBytes().length % 8;
        String s1 = s;
        if (j > 0)
        {
            s1 = "";
            for (int i = 0; i < j; i++)
            {
                s1 = (new StringBuilder()).append(s1).append(' ').toString();
            }

            s1 = (new StringBuilder()).append(s).append(s1).toString();
        }
        return s1;
    }

    public Long a()
    {
        return Long.valueOf((System.currentTimeMillis() - d) / 1000L);
    }

    public void a(long l)
    {
        d = System.currentTimeMillis() - 1000L * l;
    }

    public byte[] a(String s)
    {
        if (b == null)
        {
            return s.getBytes();
        } else
        {
            s = c(s).getBytes();
            byte abyte0[] = new byte[s.length];
            b.b(s, 0, abyte0, 0, s.length);
            return (new String(p.dv.a.a(abyte0))).getBytes();
        }
    }

    public String b(String s)
    {
        if (a == null)
        {
            return s;
        }
        byte abyte0[];
        byte abyte1[];
        try
        {
            abyte0 = p.dv.a.a(s.toCharArray());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.df.a.b("SecurityHelper", "error decoding st hex", s);
            return null;
        }
        abyte1 = new byte[s.length()];
        a.c(abyte0, 0, abyte1, 0, s.length() >> 1);
        return (new String(abyte1, 4, abyte1.length - 4)).trim();
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
