// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;


public class EnvUtil
{

    public static boolean isJDK5()
    {
        for (String s = System.getProperty("java.version"); s == null || !s.startsWith("1.5");)
        {
            return false;
        }

        return true;
    }
}
