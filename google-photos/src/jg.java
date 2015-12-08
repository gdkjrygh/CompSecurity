// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

final class jg
{

    private static Method a;
    private static Method b;

    private static String a(String s)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        s = (String)a.invoke(null, new Object[] {
            s
        });
        return s;
        s;
        Log.w("ICUCompatIcs", s);
_L2:
        return null;
        s;
        Log.w("ICUCompatIcs", s);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String a(Locale locale)
    {
        locale = b(locale);
        if (locale != null)
        {
            return a(((String) (locale)));
        } else
        {
            return null;
        }
    }

    private static String b(Locale locale)
    {
        locale = locale.toString();
        String s;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s = (String)b.invoke(null, new Object[] {
            locale
        });
        return s;
        Object obj;
        obj;
        Log.w("ICUCompatIcs", ((Throwable) (obj)));
_L2:
        return locale;
        obj;
        Log.w("ICUCompatIcs", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        Class class1;
        try
        {
            class1 = Class.forName("libcore.icu.ICU");
        }
        catch (Exception exception)
        {
            a = null;
            b = null;
            Log.w("ICUCompatIcs", exception);
        }
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a = class1.getMethod("getScript", new Class[] {
            java/lang/String
        });
        b = class1.getMethod("addLikelySubtags", new Class[] {
            java/lang/String
        });
    }
}
