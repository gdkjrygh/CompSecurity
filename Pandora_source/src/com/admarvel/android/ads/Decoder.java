// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.io.UnsupportedEncodingException;

class Decoder
{

    Decoder()
    {
    }

    public String htmlEntityDecode(String s)
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer();
        i = 0;
_L3:
label0:
        {
            int j = s.indexOf("&#", i);
            int l;
            if (j != -1)
            {
                l = s.indexOf(';', j);
                if (l != -1)
                {
                    break label0;
                }
            }
            int k;
            char c;
            if (stringbuffer.length() == 0)
            {
                return s;
            } else
            {
                stringbuffer.append(s.substring(i, s.length()));
                return stringbuffer.toString();
            }
        }
        j += 2;
        k = -1;
_L5:
        if (j < l) goto _L2; else goto _L1
_L1:
        if (j != l)
        {
            k = -1;
        }
        if (k != -1)
        {
            stringbuffer.append((char)k);
            i = l + 1;
        } else
        {
            for (; i < j; i++)
            {
                stringbuffer.append(s.charAt(i));
            }

            i = j;
        }
          goto _L3
_L2:
        if ('0' > (c = s.charAt(j)) || c > '9') goto _L1; else goto _L4
_L4:
        if (k == -1)
        {
            k = 0;
        } else
        {
            k *= 10;
        }
        k = (k + c) - 48;
        j++;
          goto _L5
    }

    public String urlDecode(String s, String s1)
        throws UnsupportedEncodingException
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer();
        i = 0;
_L5:
        char c;
        if (i >= s.length())
        {
            s = stringbuffer.toString();
            if (s1 != null)
            {
                s = new String(s.getBytes("ISO-8859-1"), s1);
            }
            return htmlEntityDecode(s);
        }
        c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 2: default 88
    //                   37: 115
    //                   43: 104;
           goto _L1 _L2 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuffer.append(c);
_L6:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        stringbuffer.append(' ');
          goto _L6
_L2:
        stringbuffer.append((char)Integer.parseInt(s.substring(i + 1, i + 3), 16));
        i += 2;
          goto _L6
        Throwable throwable;
        throwable;
        stringbuffer.append(c);
          goto _L6
    }
}
