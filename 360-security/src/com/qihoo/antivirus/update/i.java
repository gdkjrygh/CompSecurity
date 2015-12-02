// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.os.Build;
import java.util.Locale;

public class i
{

    private static final Object a = new Object();
    private static final Locale b = Locale.getDefault();
    private static String c = null;

    public static String a()
    {
        com/qihoo/antivirus/update/i;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        Object obj = c;
_L9:
        com/qihoo/antivirus/update/i;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        synchronized (a)
        {
            obj = b;
        }
        String s;
        obj1 = new StringBuilder();
        s = Build.MODEL;
        if (s.length() > 0)
        {
            ((StringBuilder) (obj1)).append(s);
        }
        ((StringBuilder) (obj1)).append("; ");
        s = android.os.Build.VERSION.RELEASE;
        if (s.length() <= 0) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append(s);
_L10:
        ((StringBuilder) (obj1)).append("; ");
        s = Build.DISPLAY;
        if (s.length() <= 0) goto _L6; else goto _L5
_L5:
        if (s.length() <= 48) goto _L8; else goto _L7
_L7:
        ((StringBuilder) (obj1)).append(s.substring(0, 48));
        ((StringBuilder) (obj1)).append("...");
_L6:
        ((StringBuilder) (obj1)).append("; ");
        s = ((Locale) (obj)).getLanguage();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        ((StringBuilder) (obj1)).append(s.toLowerCase());
        obj = ((Locale) (obj)).getCountry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        ((StringBuilder) (obj1)).append("-");
        ((StringBuilder) (obj1)).append(((String) (obj)).toLowerCase());
_L11:
        c = a(((StringBuilder) (obj1)).toString());
        obj = c;
          goto _L9
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        com/qihoo/antivirus/update/i;
        JVM INSTR monitorexit ;
        throw exception1;
_L4:
        ((StringBuilder) (obj1)).append("1.0");
          goto _L10
_L8:
        ((StringBuilder) (obj1)).append(s);
          goto _L6
        ((StringBuilder) (obj1)).append("en");
          goto _L11
    }

    private static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = 0;
        do
        {
            if (j >= s.length())
            {
                return stringbuilder.toString();
            }
            char c1 = s.charAt(j);
            if (c1 >= ' ' && c1 <= '~')
            {
                stringbuilder.append(c1);
            }
            j++;
        } while (true);
    }

}
