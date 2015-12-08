// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.sift;

import fs.ch.qos.logback.core.Appender;
import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.sift:
//            SiftingJoranConfiguratorBase

public abstract class AppenderFactoryBase
{

    final List eventList;

    protected AppenderFactoryBase(List list)
    {
        eventList = new ArrayList(list);
        removeSiftElement();
    }

    Appender buildAppender(Context context, String s)
        throws JoranException
    {
        s = getSiftingJoranConfigurator(s);
        s.setContext(context);
        s.doConfigure(eventList);
        return s.getAppender();
    }

    public abstract SiftingJoranConfiguratorBase getSiftingJoranConfigurator(String s);

    void removeSiftElement()
    {
        eventList.remove(0);
        eventList.remove(eventList.size() - 1);
    }
}
