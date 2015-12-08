// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class akU
{

    private static String a(String s)
    {
        if (s.startsWith("cr_"))
        {
            return s;
        }
        byte byte0 = 0;
        if (s.startsWith("cr."))
        {
            byte0 = 3;
        }
        return (new StringBuilder("cr_")).append(s.substring(byte0, s.length())).toString();
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        if (aobj.length != 0)
        {
            String.format(Locale.US, s1, aobj);
        }
        if (aobj.length == 0)
        {
            s1 = null;
        } else
        {
            s1 = ((String) (aobj[aobj.length - 1]));
            if (!(s1 instanceof Throwable))
            {
                s1 = null;
            } else
            {
                s1 = (Throwable)s1;
            }
        }
        if (s1 != null)
        {
            a(s);
            return;
        } else
        {
            a(s);
            return;
        }
    }
}
