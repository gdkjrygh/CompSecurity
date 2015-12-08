// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import p.dm.m;
import p.dn.a;

// Referenced classes of package p.ds:
//            c, d

public class e
{

    int a;
    int b;
    String c;
    public String d;

    public e(int i, int j, String s)
    {
        a = i;
        b = j;
        c = s;
    }

    public e(int i, int j, String s, String s1)
    {
        this(i, j, s);
        d = s1;
    }

    public static e[] a(byte abyte0[], int i, int j)
    {
        byte abyte1[];
        Vector vector;
        int k;
        int j1;
        k = 0;
        abyte1 = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, abyte1.length);
        vector = new Vector();
        j1 = abyte0.length;
_L3:
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
        int l1;
        try
        {
            byte abyte3[] = new byte[1];
            System.arraycopy(abyte1, k, abyte3, 0, abyte3.length);
            l1 = (new d(abyte3)).c();
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            if (m.bk && m.bl == -1)
            {
                m.l("[SearchResult] setting api version 3 and retrying...");
                m.bl = 3;
                m.bn = 3;
                return a(abyte0, i, j);
            } else
            {
                m.c((new StringBuilder()).append("[SearchResult] Parsing error, parsing SearchResult apiVersion=").append(m.bn).toString(), arrayindexoutofboundsexception);
                m.l((new StringBuilder()).append("[SearchResult] resultData=").append(m.d(abyte1)).toString());
                throw arrayindexoutofboundsexception;
            }
        }
        i1 = k + 1;
        c1 = '\370';
        k = c1;
        if (m.g(3))
        {
            l = i1;
            break MISSING_BLOCK_LABEL_298;
        }
_L4:
        aobj = new byte[k];
        System.arraycopy(abyte1, i1, ((Object) (aobj)), 0, aobj.length);
        vector.addElement(new e(k1, l1, (new String(((byte []) (aobj)))).trim()));
        k += i1;
          goto _L3
_L2:
        aobj = new e[vector.size()];
        vector.copyInto(aobj);
        return ((e []) (aobj));
_L5:
        k = c1;
        if (l < j1)
        {
label0:
            {
                if (abyte1[l] != 0)
                {
                    break label0;
                }
                k = (l - i1) + 1;
            }
        }
          goto _L4
        l++;
          goto _L5
    }

    public String a(boolean flag)
    {
        if (flag)
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append(" {");
            stringbuffer.append("musicToken=");
            stringbuffer.append(b());
            stringbuffer.append(",");
            stringbuffer.append("seedType=");
            stringbuffer.append(d());
            stringbuffer.append(",");
            stringbuffer.append("seedDescription=");
            stringbuffer.append(c());
            stringbuffer.append("}");
            return stringbuffer.toString();
        } else
        {
            return p.dn.a.b(a());
        }
    }

    public byte[] a()
    {
        boolean flag = m.g(3);
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write((new c(a)).b());
            bytearrayoutputstream.write((new d(b)).b());
            bytearrayoutputstream.write(p.dn.a.a(c, 248, true, flag));
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            return new byte[0];
        }
        return abyte0;
    }

    public int b()
    {
        return a;
    }

    public String c()
    {
        return c;
    }

    public int d()
    {
        return b;
    }

    public String toString()
    {
        return a(false);
    }
}
