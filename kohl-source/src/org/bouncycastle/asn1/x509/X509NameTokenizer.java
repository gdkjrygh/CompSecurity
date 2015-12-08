// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;


public class X509NameTokenizer
{

    private StringBuffer buf;
    private int index;
    private char seperator;
    private String value;

    public X509NameTokenizer(String s)
    {
        this(s, ',');
    }

    public X509NameTokenizer(String s, char c)
    {
        buf = new StringBuffer();
        value = s;
        index = -1;
        seperator = c;
    }

    public boolean hasMoreTokens()
    {
        return index != value.length();
    }

    public String nextToken()
    {
        boolean flag;
        boolean flag1;
        int j;
        if (index == value.length())
        {
            return null;
        }
        int i = index;
        buf.setLength(0);
        flag1 = false;
        j = i + 1;
        flag = false;
_L2:
        char c;
        if (j == value.length())
        {
            break; /* Loop/switch isn't completed */
        }
        c = value.charAt(j);
        if (c == '"')
        {
            boolean flag2;
            if (!flag)
            {
                if (!flag1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                buf.append(c);
                flag = flag1;
            }
            flag2 = false;
            flag1 = flag;
            flag = flag2;
        } else
        if (flag || flag1)
        {
            if (c == '#' && buf.charAt(buf.length() - 1) == '=')
            {
                buf.append('\\');
            } else
            if (c == '+' && seperator != '+')
            {
                buf.append('\\');
            }
            buf.append(c);
            flag = false;
        } else
        {
label0:
            {
                if (c != '\\')
                {
                    break label0;
                }
                flag = true;
            }
        }
_L3:
        j++;
        if (true) goto _L2; else goto _L1
        if (c != seperator)
        {
            break MISSING_BLOCK_LABEL_235;
        }
_L1:
        index = j;
        return buf.toString().trim();
        buf.append(c);
          goto _L3
    }
}
