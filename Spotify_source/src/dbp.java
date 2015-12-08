// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dbp
{

    private static final Pattern b = Pattern.compile("[A-Za-z0-9\\-_~]+");
    private static final dbp c = new dbp();
    public String a;

    private dbp()
    {
        a = "np";
    }

    public static dbp a()
    {
        return c;
    }

    public static boolean a(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return b.matcher(s).matches();
        }
    }

    public static boolean b()
    {
        return true;
    }

}
