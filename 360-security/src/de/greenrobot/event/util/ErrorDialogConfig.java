// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.content.res.Resources;
import android.util.Log;
import de.greenrobot.event.EventBus;

// Referenced classes of package de.greenrobot.event.util:
//            ExceptionToResourceMapping

public class ErrorDialogConfig
{

    int defaultDialogIconId;
    final int defaultErrorMsgId;
    Class defaultEventTypeOnDialogClosed;
    final int defaultTitleId;
    EventBus eventBus;
    boolean logExceptions;
    final ExceptionToResourceMapping mapping = new ExceptionToResourceMapping();
    final Resources resources;
    String tagForLoggingExceptions;

    public ErrorDialogConfig(Resources resources1, int i, int j)
    {
        logExceptions = true;
        resources = resources1;
        defaultTitleId = i;
        defaultErrorMsgId = j;
    }

    public ErrorDialogConfig addMapping(Class class1, int i)
    {
        mapping.addMapping(class1, i);
        return this;
    }

    public void disableExceptionLogging()
    {
        logExceptions = false;
    }

    EventBus getEventBus()
    {
        if (eventBus != null)
        {
            return eventBus;
        } else
        {
            return EventBus.getDefault();
        }
    }

    public int getMessageIdForThrowable(Throwable throwable)
    {
        Integer integer = mapping.mapThrowable(throwable);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            Log.d(EventBus.TAG, (new StringBuilder("No specific message ressource ID found for ")).append(throwable).toString());
            return defaultErrorMsgId;
        }
    }

    public void setDefaultDialogIconId(int i)
    {
        defaultDialogIconId = i;
    }

    public void setDefaultEventTypeOnDialogClosed(Class class1)
    {
        defaultEventTypeOnDialogClosed = class1;
    }

    public void setEventBus(EventBus eventbus)
    {
        eventBus = eventbus;
    }

    public void setTagForLoggingExceptions(String s)
    {
        tagForLoggingExceptions = s;
    }
}
