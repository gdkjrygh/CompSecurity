// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Pattern;

public final class cnx
{

    public static boolean a(String s)
    {
        return s == null || brw.a.a(s);
    }

    static 
    {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
}
