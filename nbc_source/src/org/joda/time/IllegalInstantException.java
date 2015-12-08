// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package org.joda.time:
//            Instant

public class IllegalInstantException extends IllegalArgumentException
{

    private static final long serialVersionUID = 0x299988b9c68L;

    public IllegalInstantException(long l, String s)
    {
        super(createMessage(l, s));
    }

    public IllegalInstantException(String s)
    {
        super(s);
    }

    private static String createMessage(long l, String s)
    {
        String s1 = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(l));
        if (s != null)
        {
            s = (new StringBuilder()).append(" (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        return (new StringBuilder()).append("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ").append(s1).append(s).toString();
    }

    public static boolean isIllegalInstant(Throwable throwable)
    {
        if (throwable instanceof IllegalInstantException)
        {
            return true;
        }
        if (throwable.getCause() != null && throwable.getCause() != throwable)
        {
            return isIllegalInstant(throwable.getCause());
        } else
        {
            return false;
        }
    }
}
