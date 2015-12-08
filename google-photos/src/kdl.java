// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Pattern;

public final class kdl
{

    public static boolean a(String s)
    {
        return s == null || kbf.a.a(s);
    }

    static 
    {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
}
