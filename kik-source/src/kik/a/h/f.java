// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{

    public static String a(String s)
    {
        if (s != null)
        {
            if ((s = Pattern.compile("^data:.*base64,(.*)").matcher(s)).matches())
            {
                return s.group(1);
            }
        }
        return null;
    }
}
