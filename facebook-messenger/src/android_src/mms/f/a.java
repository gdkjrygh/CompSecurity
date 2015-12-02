// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.f;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android_src.c.d;
import android_src.mms.c;
import java.util.HashMap;

public class a
{

    private static final char a[] = {
        '-', '.', ',', '(', ')', ' ', '/', '\\', '*', '#', 
        '+'
    };
    private static HashMap b;

    public a()
    {
    }

    public static String a(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getLine1Number();
    }

    public static boolean a(Context context, String s)
    {
        while (s == null || s.indexOf('@') >= 0) 
        {
            return false;
        }
        return PhoneNumberUtils.compare(s, a(context));
    }

    public static boolean a(String s)
    {
        if (android_src.mms.c.m()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.length();
        }
        if (i >= android_src.mms.c.n() && i <= android_src.mms.c.o() && Character.isLetter(s.charAt(0)))
        {
            int j = 1;
label0:
            do
            {
label1:
                {
                    if (j >= i)
                    {
                        break label1;
                    }
                    char c1 = s.charAt(j);
                    if (!Character.isLetterOrDigit(c1) && c1 != '.')
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static String b(String s)
    {
        if (!d.b(s))
        {
            String s1 = c(s);
            if (s1 != null)
            {
                return s1;
            }
            if (!a(s))
            {
                return null;
            }
        }
        return s;
    }

    private static String c(String s)
    {
        StringBuilder stringbuilder;
        int i;
        int j;
        stringbuilder = new StringBuilder();
        j = s.length();
        i = 0;
_L1:
        char c1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        c1 = s.charAt(i);
        if (c1 == '+' && stringbuilder.length() == 0)
        {
            stringbuilder.append(c1);
        } else
        {
            if (!Character.isDigit(c1))
            {
                continue; /* Loop/switch isn't completed */
            }
            stringbuilder.append(c1);
        }
_L3:
        i++;
          goto _L1
        if (b.get(Character.valueOf(c1)) != null) goto _L3; else goto _L2
_L2:
        return null;
        return stringbuilder.toString();
    }

    static 
    {
        b = new HashMap(a.length);
        for (int i = 0; i < a.length; i++)
        {
            b.put(Character.valueOf(a[i]), Character.valueOf(a[i]));
        }

    }
}
