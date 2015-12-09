// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oq, oy, ot, nr

public final class oo extends oq
{

    public static final oo a = new oo("");
    private final String b;
    private final oy c;

    public oo(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("string == null");
        } else
        {
            b = s.intern();
            c = new oy(a(s));
            return;
        }
    }

    private static byte[] a(String s)
    {
        int j1 = s.length();
        byte abyte0[] = new byte[j1 * 3];
        int i1 = 0;
        int l = 0;
        while (i1 < j1) 
        {
            char c1 = s.charAt(i1);
            if (c1 != 0 && c1 < '\200')
            {
                abyte0[l] = (byte)c1;
                l++;
            } else
            if (c1 < '\u0800')
            {
                abyte0[l] = (byte)(c1 >> 6 & 0x1f | 0xc0);
                abyte0[l + 1] = (byte)(c1 & 0x3f | 0x80);
                l += 2;
            } else
            {
                abyte0[l] = (byte)(c1 >> 12 & 0xf | 0xe0);
                abyte0[l + 1] = (byte)(c1 >> 6 & 0x3f | 0x80);
                abyte0[l + 2] = (byte)(c1 & 0x3f | 0x80);
                l += 3;
            }
            i1++;
        }
        s = new byte[l];
        System.arraycopy(abyte0, 0, s, 0, l);
        return s;
    }

    protected final int b(nr nr)
    {
        return b.compareTo(((oo)nr).b);
    }

    public final ot b()
    {
        return ot.q;
    }

    public final String e()
    {
        return "utf8";
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof oo))
        {
            return false;
        } else
        {
            return b.equals(((oo)obj).b);
        }
    }

    public final String f()
    {
        return (new StringBuilder("\"")).append(h_()).append('"').toString();
    }

    public final String g()
    {
        String s1 = h_();
        String s;
        if (s1.length() <= 98)
        {
            s = "";
        } else
        {
            s1 = s1.substring(0, 95);
            s = "...";
        }
        return (new StringBuilder("\"")).append(s1).append(s).append('"').toString();
    }

    public final String h()
    {
        return b;
    }

    public final String h_()
    {
        StringBuilder stringbuilder;
        int l;
        int j1;
        j1 = b.length();
        stringbuilder = new StringBuilder((j1 * 3) / 2);
        l = 0;
_L5:
        if (l >= j1) goto _L2; else goto _L1
_L1:
        char c1 = b.charAt(l);
        if (c1 < ' ' || c1 >= '\177') goto _L4; else goto _L3
_L3:
        if (c1 == '\'' || c1 == '"' || c1 == '\\')
        {
            stringbuilder.append('\\');
        }
        stringbuilder.append(c1);
_L17:
        l++;
          goto _L5
_L4:
        if (c1 > '\177') goto _L7; else goto _L6
_L6:
        c1;
        JVM INSTR tableswitch 9 13: default 136
    //                   9 260
    //                   10 240
    //                   11 136
    //                   12 136
    //                   13 250;
           goto _L8 _L9 _L10 _L8 _L8 _L11
_L8:
        char c3;
        char c2;
        int i1;
        boolean flag;
        if (l < j1 - 1)
        {
            c3 = b.charAt(l + 1);
        } else
        {
            c3 = '\0';
        }
        if (c3 >= '0' && c3 <= '7')
        {
            c3 = '\001';
        } else
        {
            c3 = '\0';
        }
        stringbuilder.append('\\');
        i1 = 6;
_L16:
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        c2 = (char)((c1 >> i1 & 7) + 48);
        if (c2 != '0') goto _L13; else goto _L12
_L12:
        flag = c3;
        if (c3 == 0) goto _L14; else goto _L13
_L13:
        stringbuilder.append(c2);
        flag = true;
_L14:
        i1 -= 3;
        c3 = flag;
        if (true) goto _L16; else goto _L15
_L10:
        stringbuilder.append("\\n");
          goto _L17
_L11:
        stringbuilder.append("\\r");
          goto _L17
_L9:
        stringbuilder.append("\\t");
          goto _L17
_L15:
        if (c3 == 0)
        {
            stringbuilder.append('0');
        }
          goto _L17
_L7:
        stringbuilder.append("\\u");
        stringbuilder.append(Character.forDigit(c1 >> 12, 16));
        stringbuilder.append(Character.forDigit(c1 >> 8 & 0xf, 16));
        stringbuilder.append(Character.forDigit(c1 >> 4 & 0xf, 16));
        stringbuilder.append(Character.forDigit(c1 & 0xf, 16));
          goto _L17
_L2:
        return stringbuilder.toString();
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final oy i()
    {
        return c;
    }

    public final int j()
    {
        return c.c;
    }

    public final int k()
    {
        return b.length();
    }

    public final String toString()
    {
        return (new StringBuilder("string{\"")).append(h_()).append("\"}").toString();
    }

}
