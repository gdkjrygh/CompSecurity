// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aey extends aeA
{

    final String a;
    final aeI b;

    public aey(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("string == null");
        } else
        {
            a = s.intern();
            b = new aeI(a(s));
            return;
        }
    }

    private static byte[] a(String s)
    {
        int k = s.length();
        byte abyte0[] = new byte[k * 3];
        int j = 0;
        int i = 0;
        while (j < k) 
        {
            char c = s.charAt(j);
            if (c != 0 && c < '\200')
            {
                abyte0[i] = (byte)c;
                i++;
            } else
            if (c < '\u0800')
            {
                abyte0[i] = (byte)(c >> 6 & 0x1f | 0xc0);
                abyte0[i + 1] = (byte)(c & 0x3f | 0x80);
                i += 2;
            } else
            {
                abyte0[i] = (byte)(c >> 12 & 0xf | 0xe0);
                abyte0[i + 1] = (byte)(c >> 6 & 0x3f | 0x80);
                abyte0[i + 2] = (byte)(c & 0x3f | 0x80);
                i += 3;
            }
            j++;
        }
        s = new byte[i];
        System.arraycopy(abyte0, 0, s, 0, i);
        return s;
    }

    public final String ag_()
    {
        StringBuilder stringbuilder;
        int i;
        int k;
        k = a.length();
        stringbuilder = new StringBuilder((k * 3) / 2);
        i = 0;
_L5:
        if (i >= k) goto _L2; else goto _L1
_L1:
        char c = a.charAt(i);
        if (c < ' ' || c >= '\177') goto _L4; else goto _L3
_L3:
        if (c == '\'' || c == '"' || c == '\\')
        {
            stringbuilder.append('\\');
        }
        stringbuilder.append(c);
_L17:
        i++;
          goto _L5
_L4:
        if (c > '\177') goto _L7; else goto _L6
_L6:
        c;
        JVM INSTR tableswitch 9 13: default 136
    //                   9 260
    //                   10 240
    //                   11 136
    //                   12 136
    //                   13 250;
           goto _L8 _L9 _L10 _L8 _L8 _L11
_L8:
        char c2;
        char c1;
        int j;
        boolean flag;
        if (i < k - 1)
        {
            c2 = a.charAt(i + 1);
        } else
        {
            c2 = '\0';
        }
        if (c2 >= '0' && c2 <= '7')
        {
            c2 = '\001';
        } else
        {
            c2 = '\0';
        }
        stringbuilder.append('\\');
        j = 6;
_L16:
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = (char)((c >> j & 7) + 48);
        if (c1 != '0') goto _L13; else goto _L12
_L12:
        flag = c2;
        if (c2 == 0) goto _L14; else goto _L13
_L13:
        stringbuilder.append(c1);
        flag = true;
_L14:
        j -= 3;
        c2 = flag;
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
        if (c2 == 0)
        {
            stringbuilder.append('0');
        }
          goto _L17
_L7:
        stringbuilder.append("\\u");
        stringbuilder.append(Character.forDigit(c >> 12, 16));
        stringbuilder.append(Character.forDigit(c >> 8 & 0xf, 16));
        stringbuilder.append(Character.forDigit(c >> 4 & 0xf, 16));
        stringbuilder.append(Character.forDigit(c & 0xf, 16));
          goto _L17
_L2:
        return stringbuilder.toString();
    }

    protected final int b(aec aec)
    {
        return a.compareTo(((aey)aec).a);
    }

    public final aeD b()
    {
        return aeD.n;
    }

    public final String e()
    {
        return "utf8";
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof aey))
        {
            return false;
        } else
        {
            return a.equals(((aey)obj).a);
        }
    }

    public final String f()
    {
        return (new StringBuilder("\"")).append(ag_()).append('"').toString();
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("string{\"")).append(ag_()).append("\"}").toString();
    }

    static 
    {
        new aey("");
    }
}
