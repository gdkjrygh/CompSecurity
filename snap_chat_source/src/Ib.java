// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Ib
{
    static final class a
    {

        private static final Pattern LAZY_INSTANCE = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        static Pattern a()
        {
            return LAZY_INSTANCE;
        }

    }


    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a.a().matcher(Normalizer.normalize(s, java.text.Normalizer.Form.NFD)).replaceAll("");
        }
    }
}
