// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import p.dm.g;
import p.dm.m;
import p.dm.o;
import p.dn.a;

// Referenced classes of package p.ds:
//            c, d

public class f
{

    String a;
    int b;
    int c;
    String d;

    public f(int i, int j, String s)
    {
        a = null;
        b = i;
        c = j;
        d = s;
    }

    public f(String s, int i, String s1)
    {
        a = s;
        b = o.a(s);
        c = i;
        d = s1;
    }

    public static f[] a(byte abyte0[], int i, int j)
    {
        byte abyte1[];
        Object obj;
        int k;
        int j1;
        k = 0;
        abyte1 = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, abyte1.length);
        obj = new Vector();
        j1 = abyte0.length;
_L6:
        if (k >= abyte1.length) goto _L2; else goto _L1
_L1:
        int k1;
        byte abyte2[] = new byte[4];
        System.arraycopy(abyte1, k, abyte2, 0, abyte2.length);
        k1 = (new c(abyte2)).c();
        int l;
        int i1;
        char c1;
        k += 4;
        Object aobj[];
        String s;
        int l1;
        try
        {
            byte abyte3[] = new byte[1];
            System.arraycopy(abyte1, k, abyte3, 0, abyte3.length);
            l1 = (new d(abyte3)).c();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (m.bk && m.bl == -1)
            {
                m.bl = 3;
                m.bn = 3;
                return a(abyte0, i, j);
            } else
            {
                m.c((new StringBuilder()).append("[StationInfo] Parsing error, parsing StationInfo apiVersion=").append(m.bn).toString(), ((Throwable) (obj)));
                m.l((new StringBuilder()).append("[StationInfo] stationData=").append(m.d(abyte1)).toString());
                throw obj;
            }
        }
        i1 = k + 1;
        c1 = '\370';
        if (!m.g(3)) goto _L4; else goto _L3
_L3:
        l = i1;
          goto _L5
_L8:
        aobj = new byte[k];
        System.arraycopy(abyte1, i1, ((Object) (aobj)), 0, aobj.length);
        s = (new String(((byte []) (aobj)))).trim();
        k += i1;
        ((Vector) (obj)).addElement(new f(k1, l1, s));
          goto _L6
_L11:
        l++;
          goto _L5
_L4:
        k = c1;
        if (!m.g(2)) goto _L8; else goto _L7
_L7:
        k = 64;
          goto _L8
_L2:
        s = new f[((Vector) (obj)).size()];
        ((Vector) (obj)).copyInto(s);
        return s;
_L5:
        k = c1;
        if (l >= j1) goto _L8; else goto _L9
_L9:
        if (abyte1[l] != 0) goto _L11; else goto _L10
_L10:
        k = (l - i1) + 1;
          goto _L8
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer();
            g1.append(" {");
            g1.append("stationId=");
            g1.append(b());
            g1.append(",");
            g1.append("allowDelete=");
            g1.append(f());
            g1.append(",");
            g1.append("isShared=");
            g1.append(g());
            g1.append(",");
            if (m.g(3))
            {
                g1.append("isShuffle=");
            } else
            {
                g1.append("isQuickMix=");
            }
            g1.append(h());
            g1.append(",");
            g1.append("name=");
            g1.append(d());
            g1.append("}");
            return g1.toString();
        }
        if (g1 == g.d)
        {
            g1 = a();
            byte abyte0[] = new byte[Math.min(10, g1.length) + 5];
            System.arraycopy(g1, 0, abyte0, 0, abyte0.length);
            return m.d(abyte0);
        } else
        {
            return m.d(a());
        }
    }

    public byte[] a()
    {
        boolean flag = m.g(3);
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        char c1;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write((new c(b)).b());
            bytearrayoutputstream.write((new d(c)).b());
        }
        catch (IOException ioexception)
        {
            return new byte[0];
        }
        c1 = '\370';
        if (m.g(2))
        {
            c1 = '@';
        }
        bytearrayoutputstream.write(p.dn.a.a(d(), c1, true, flag));
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
    }

    public int b()
    {
        return b;
    }

    public String c()
    {
        return a;
    }

    public String d()
    {
        if (h())
        {
            return e();
        } else
        {
            return d;
        }
    }

    public String e()
    {
        String s = "QuickMix";
        if (m.n("useShuffleInsteadOfQuickMix") || m.g(3))
        {
            s = "Shuffle";
        }
        return s;
    }

    public boolean f()
    {
        return (c & 1) != 0;
    }

    public boolean g()
    {
        return (c & 2) != 0;
    }

    public boolean h()
    {
        return (c & 4) != 0;
    }

    public String toString()
    {
        return a(g.c);
    }
}
