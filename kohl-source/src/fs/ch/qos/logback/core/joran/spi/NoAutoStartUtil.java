// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;


// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            NoAutoStart

public class NoAutoStartUtil
{

    public static boolean notMarkedWithNoAutoStart(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        boolean flag;
        if ((NoAutoStart)obj.getClass().getAnnotation(fs/ch/qos/logback/core/joran/spi/NoAutoStart) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }
}
