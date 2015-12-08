// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.util.TimeZone;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class TimeZoneTransform
    implements Transform
{

    TimeZoneTransform()
    {
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public TimeZone read(String s)
    {
        return TimeZone.getTimeZone(s);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((TimeZone)obj);
    }

    public String write(TimeZone timezone)
    {
        return timezone.getID();
    }
}
