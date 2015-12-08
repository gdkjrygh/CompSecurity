// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.spi;

import fs.ch.qos.logback.core.Appender;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package fs.ch.qos.logback.core.spi:
//            AppenderAttachable

public class AppenderAttachableImpl
    implements AppenderAttachable
{

    static final long START = System.currentTimeMillis();
    private final CopyOnWriteArrayList appenderList = new CopyOnWriteArrayList();

    public AppenderAttachableImpl()
    {
    }

    public void addAppender(Appender appender)
    {
        if (appender == null)
        {
            throw new IllegalArgumentException("Null argument disallowed");
        } else
        {
            appenderList.addIfAbsent(appender);
            return;
        }
    }

    public int appendLoopOnAppenders(Object obj)
    {
        Iterator iterator = appenderList.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i++)
        {
            ((Appender)iterator.next()).doAppend(obj);
        }

        return i;
    }

    public void detachAndStopAllAppenders()
    {
        for (Iterator iterator = appenderList.iterator(); iterator.hasNext(); ((Appender)iterator.next()).stop()) { }
        appenderList.clear();
    }

}
