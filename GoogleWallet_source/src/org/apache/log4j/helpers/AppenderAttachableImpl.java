// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.helpers;

import java.util.Enumeration;
import java.util.Vector;
import org.apache.log4j.Appender;
import org.apache.log4j.spi.LoggingEvent;

public final class AppenderAttachableImpl
{

    protected Vector appenderList;

    public AppenderAttachableImpl()
    {
    }

    public final void addAppender(Appender appender)
    {
        if (appender != null)
        {
            if (appenderList == null)
            {
                appenderList = new Vector(1);
            }
            if (!appenderList.contains(appender))
            {
                appenderList.addElement(appender);
                return;
            }
        }
    }

    public final int appendLoopOnAppenders(LoggingEvent loggingevent)
    {
        int j = 0;
        if (appenderList != null)
        {
            int k = appenderList.size();
            int i = 0;
            do
            {
                j = k;
                if (i >= k)
                {
                    break;
                }
                appenderList.elementAt(i);
                i++;
            } while (true);
        }
        return j;
    }

    public final Enumeration getAllAppenders()
    {
        if (appenderList == null)
        {
            return null;
        } else
        {
            return appenderList.elements();
        }
    }

    public final void removeAllAppenders()
    {
        if (appenderList != null)
        {
            int j = appenderList.size();
            for (int i = 0; i < j; i++)
            {
                appenderList.elementAt(i);
            }

            appenderList.removeAllElements();
            appenderList = null;
        }
    }
}
