// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class orw
{

    private static String a = "L";
    private static final int b = 19;
    private static final String c = orw.getName();
    private static Pattern d = Pattern.compile("");

    private orw()
    {
    }

    private static void a(int i, String s, Throwable throwable)
    {
        StackTraceElement astacktraceelement[];
        int j;
        int k;
        astacktraceelement = Thread.currentThread().getStackTrace();
        k = astacktraceelement.length;
        j = 0;
_L12:
        if (j >= k) goto _L2; else goto _L1
_L1:
        Object obj;
        String s2;
        obj = astacktraceelement[j];
        s2 = ((StackTraceElement) (obj)).getClassName();
        if (s2.equals(c) || !s2.startsWith("com.google.android.")) goto _L4; else goto _L3
_L3:
        String s1 = String.valueOf(s2.substring(b));
        s2 = String.valueOf(((StackTraceElement) (obj)).getMethodName());
        j = ((StackTraceElement) (obj)).getLineNumber();
        obj = (new StringBuilder(String.valueOf(s1).length() + 13 + String.valueOf(s2).length())).append(s1).append(".").append(s2).append(":").append(j).toString();
_L9:
        s = (new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(s).length())).append(((String) (obj))).append(" ").append(s).toString();
        orx.a[i - 1];
        JVM INSTR tableswitch 1 5: default 224
    //                   1 240
    //                   2 250
    //                   3 224
    //                   4 224
    //                   5 260;
           goto _L5 _L6 _L7 _L5 _L5 _L8
_L5:
        return;
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = "(unknown)";
          goto _L9
_L6:
        Log.e(a, s, throwable);
        return;
_L7:
        Log.w(a, s, throwable);
        return;
_L8:
        if (obj == null || !d.matcher(((CharSequence) (obj))).matches()) goto _L5; else goto _L10
_L10:
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static void a(String s)
    {
        a(ory.a, s, null);
    }

    public static void a(String s, Throwable throwable)
    {
        a(ory.a, s, throwable);
    }

    public static void b(String s)
    {
        a(ory.b, s, null);
    }

    public static void b(String s, Throwable throwable)
    {
        a(ory.b, s, throwable);
    }

    public static void c(String s)
    {
        a(ory.c, s, null);
    }

    public static void d(String s)
    {
        a(ory.d, s, null);
    }

}
