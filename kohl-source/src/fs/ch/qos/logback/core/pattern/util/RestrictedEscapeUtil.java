// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.util;


// Referenced classes of package fs.ch.qos.logback.core.pattern.util:
//            IEscapeUtil

public class RestrictedEscapeUtil
    implements IEscapeUtil
{

    public RestrictedEscapeUtil()
    {
    }

    public void escape(String s, StringBuffer stringbuffer, char c, int i)
    {
        if (s.indexOf(c) >= 0)
        {
            stringbuffer.append(c);
            return;
        } else
        {
            stringbuffer.append("\\");
            stringbuffer.append(c);
            return;
        }
    }
}
