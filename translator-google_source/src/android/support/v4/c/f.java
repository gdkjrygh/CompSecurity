// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class f
{

    private static Method a;

    public static String a(Locale locale)
    {
        String s = ((Locale)a.invoke(null, new Object[] {
            locale
        })).getScript();
        return s;
        Object obj;
        obj;
_L2:
        return locale.getScript();
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        try
        {
            a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] {
                java/util/Locale
            });
        }
        catch (Exception exception)
        {
            throw new IllegalStateException(exception);
        }
    }
}
