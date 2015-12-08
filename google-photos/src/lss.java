// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class lss extends lqq
{

    private static final String b;
    private static final String c;

    public lss()
    {
        super(b);
    }

    protected final boolean a(String s, String s1, Map map)
    {
        byte byte0;
        boolean flag;
        if (ltw.d((ksp)map.get(c)).booleanValue())
        {
            byte0 = 66;
        } else
        {
            byte0 = 64;
        }
        try
        {
            flag = Pattern.compile(s1, byte0).matcher(s).find();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    static 
    {
        b = kse.F.toString();
        c = ksf.s.toString();
    }
}
