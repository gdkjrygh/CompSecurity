// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;


// Referenced classes of package ch.qos.logback.classic.pattern:
//            Abbreviator

public class ClassNameOnlyAbbreviator
    implements Abbreviator
{

    public ClassNameOnlyAbbreviator()
    {
    }

    public String abbreviate(String s)
    {
        int i = s.lastIndexOf('.');
        String s1 = s;
        if (i != -1)
        {
            s1 = s.substring(i + 1, s.length());
        }
        return s1;
    }
}
