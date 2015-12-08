// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

// Referenced classes of package org.apache.commons.lang3:
//            StringUtils

private static class 
{

    private static final Throwable java6Exception;
    private static final Method java6NormalizeMethod;
    private static final Object java6NormalizerFormNFD;
    private static final Pattern java6Pattern;
    private static final Method sunDecomposeMethod;
    private static final Throwable sunException;
    private static final Pattern sunPattern;

    static 
    {
        Object obj;
        Object obj1;
        Method method;
        Method method1;
        Object obj2;
        Method method2;
        sunPattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        java6Pattern = sunPattern;
        obj1 = null;
        method = null;
        method1 = null;
        method2 = null;
        obj2 = null;
        obj = obj1;
        Object obj3 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
        obj = obj1;
        obj1 = ((Class) (obj3)).getField("NFD").get(null);
        obj = obj1;
        obj3 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer").getMethod("normalize", new Class[] {
            java/lang/CharSequence, obj3
        });
        method = ((Method) (obj3));
        obj = obj1;
        obj1 = method2;
_L2:
        java6Exception = ((Throwable) (obj1));
        java6NormalizerFormNFD = obj;
        java6NormalizeMethod = method;
        sunException = ((Throwable) (obj2));
        sunDecomposeMethod = method1;
        return;
        obj1;
        method2 = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer").getMethod("decompose", new Class[] {
            java/lang/String, Boolean.TYPE, Integer.TYPE
        });
        method1 = method2;
        continue; /* Loop/switch isn't completed */
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
    }








    private ()
    {
    }
}
