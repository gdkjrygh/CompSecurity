// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dbt
{

    private dbt()
    {
    }

    private static String a(StackTraceElement stacktraceelement)
    {
        if (stacktraceelement == null)
        {
            return "";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[L");
            stringbuilder.append(stacktraceelement.getLineNumber());
            stringbuilder.append("] ");
            stringbuilder.append(stacktraceelement.getMethodName());
            stringbuilder.append(": ");
            return stringbuilder.toString();
        }
    }

    public static transient String a(String s, Object aobj[])
    {
        return String.format(s, aobj);
    }

    public static void a()
    {
    }

    public static transient void a(Object obj, String s, Object aobj[])
    {
        StackTraceElement stacktraceelement = c();
        obj.getClass().getSimpleName();
        (new StringBuilder()).append(a(stacktraceelement)).append(String.format(s, aobj));
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        StackTraceElement stacktraceelement = c();
        if (s == null && stacktraceelement != null)
        {
            s = stacktraceelement.getClassName();
            if (s != null)
            {
                int i = s.lastIndexOf(".");
                if (i < 0)
                {
                    i = 0;
                } else
                {
                    i++;
                }
                s.substring(i);
            }
        }
        (new StringBuilder()).append(a(stacktraceelement)).append(String.format(s1, aobj));
    }

    public static void b()
    {
    }

    private static StackTraceElement c()
    {
        int i = 0;
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        if (astacktraceelement == null)
        {
            return null;
        }
        String s = dbt.getName();
        boolean flag = false;
        for (; i < astacktraceelement.length; i++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i];
            String s1 = stacktraceelement.getClassName();
            if (flag)
            {
                if (!s.equals(s1))
                {
                    return stacktraceelement;
                }
                continue;
            }
            if (s.equals(s1))
            {
                flag = true;
            }
        }

        return null;
    }

    static 
    {
        new dbt();
    }
}
