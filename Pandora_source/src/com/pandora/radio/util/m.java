// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import java.util.StringTokenizer;

public class m
    implements Comparable
{

    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private String e;

    public m(String s)
    {
        a(s);
    }

    private int a(Integer integer, Integer integer1)
    {
        if (integer != null ? integer.equals(integer1) : integer1 == null)
        {
            return 0;
        }
        if (integer == null)
        {
            return -integer1.intValue();
        }
        if (integer1 == null)
        {
            return integer.intValue();
        } else
        {
            return integer.intValue() - integer1.intValue();
        }
    }

    private static Integer a(StringTokenizer stringtokenizer)
    {
        stringtokenizer = stringtokenizer.nextToken();
        if (stringtokenizer.length() > 1 && stringtokenizer.startsWith("0"))
        {
            throw new NumberFormatException((new StringBuilder()).append("Number part has a leading 0: '").append(stringtokenizer).append("'").toString());
        } else
        {
            return Integer.valueOf(stringtokenizer);
        }
    }

    private void a(String s)
    {
        String s1;
        String s2;
        boolean flag;
        flag = true;
        int i = s.indexOf("-");
        if (i < 0)
        {
            s1 = null;
            s2 = s;
        } else
        {
            s2 = s.substring(0, i);
            s1 = s.substring(i + 1);
        }
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s1.length() != 1 && s1.startsWith("0")) goto _L4; else goto _L3
_L3:
        d = Integer.valueOf(s1);
_L2:
        if (s2.indexOf(".") >= 0 || s2.startsWith("0"))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a = Integer.valueOf(s2);
_L5:
        return;
_L4:
        try
        {
            e = s1;
        }
        catch (NumberFormatException numberformatexception2)
        {
            e = s1;
        }
          goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        e = s;
        d = null;
        return;
label0:
        {
            StringTokenizer stringtokenizer = new StringTokenizer(s2, ".");
            boolean flag1;
            try
            {
                a = a(stringtokenizer);
                if (stringtokenizer.hasMoreTokens())
                {
                    b = a(stringtokenizer);
                }
                if (stringtokenizer.hasMoreTokens())
                {
                    c = a(stringtokenizer);
                }
                flag1 = stringtokenizer.hasMoreTokens();
            }
            catch (NumberFormatException numberformatexception1)
            {
                break label0;
            }
            if (!flag1)
            {
                flag = false;
            }
        }
        if (flag)
        {
            e = s;
            a = null;
            b = null;
            c = null;
            d = null;
            return;
        }
          goto _L5
    }

    public int a(m m1)
    {
        int k;
        byte byte0;
        byte0 = -1;
        k = a(a, m1.a);
        int i = k;
        if (k == 0)
        {
            i = a(b, m1.b);
        }
        k = i;
        if (i == 0)
        {
            k = a(c, m1.c);
        }
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (d == null && m1.d == null) goto _L2; else goto _L1
_L1:
        int j = a(d, m1.d);
_L4:
        return j;
_L2:
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        j = byte0;
        if (m1.e == null) goto _L4; else goto _L3
_L3:
        if (e.length() <= m1.e.length())
        {
            break; /* Loop/switch isn't completed */
        }
        j = byte0;
        if (e.startsWith(m1.e)) goto _L4; else goto _L5
_L5:
        if (e.length() < m1.e.length() && m1.e.startsWith(e))
        {
            return 1;
        } else
        {
            return e.compareTo(m1.e);
        }
        if (m1.e != null)
        {
            return 1;
        }
        return k;
    }

    public int compareTo(Object obj)
    {
        return a((m)obj);
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        if (a != null)
        {
            stringbuffer.append(a);
        }
        if (b != null)
        {
            stringbuffer.append(".");
            stringbuffer.append(b);
        }
        if (c != null)
        {
            stringbuffer.append(".");
            stringbuffer.append(c);
        }
        if (d == null) goto _L2; else goto _L1
_L1:
        stringbuffer.append("-");
        stringbuffer.append(d);
_L4:
        return stringbuffer.toString();
_L2:
        if (e != null)
        {
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append("-");
            }
            stringbuffer.append(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
