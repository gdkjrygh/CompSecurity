// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.util;


public class LoggerNameUtil
{

    public static int getSeparatorIndexOf(String s, int i)
    {
        int j = s.indexOf('.', i);
        if (j != -1)
        {
            return j;
        } else
        {
            return s.indexOf('$', i);
        }
    }
}
