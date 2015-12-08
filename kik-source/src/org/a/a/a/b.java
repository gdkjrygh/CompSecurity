// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.io.File;

public final class b
{

    private static final char a;
    private static final char b;

    public static String a(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        int i;
        if (s != null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = -1;
_L5:
        s1 = s;
        if (i != -1)
        {
            return s.substring(0, i);
        }
        if (true) goto _L4; else goto _L3
_L3:
        int k = s.lastIndexOf('.');
        int j;
        if (s == null)
        {
            j = -1;
        } else
        {
            j = Math.max(s.lastIndexOf('/'), s.lastIndexOf('\\'));
        }
        i = k;
        if (j > k)
        {
            i = -1;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    static 
    {
        char c = File.separatorChar;
        a = c;
        boolean flag;
        if (c == '\\')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b = '/';
        } else
        {
            b = '\\';
        }
    }
}
