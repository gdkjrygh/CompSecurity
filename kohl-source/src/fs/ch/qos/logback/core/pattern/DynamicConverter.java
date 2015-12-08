// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.status.Status;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.pattern:
//            FormattingConverter

public abstract class DynamicConverter extends FormattingConverter
    implements ContextAware, LifeCycle
{

    ContextAwareBase cab;
    private List optionList;
    protected boolean started;

    public DynamicConverter()
    {
        cab = new ContextAwareBase(this);
        started = false;
    }

    public void addError(String s)
    {
        cab.addError(s);
    }

    public void addError(String s, Throwable throwable)
    {
        cab.addError(s, throwable);
    }

    public void addStatus(Status status)
    {
        cab.addStatus(status);
    }

    public void addWarn(String s, Throwable throwable)
    {
        cab.addWarn(s, throwable);
    }

    public Context getContext()
    {
        return cab.getContext();
    }

    public String getFirstOption()
    {
        if (optionList == null || optionList.size() == 0)
        {
            return null;
        } else
        {
            return (String)optionList.get(0);
        }
    }

    protected List getOptionList()
    {
        return optionList;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void setContext(Context context)
    {
        cab.setContext(context);
    }

    public void setOptionList(List list)
    {
        optionList = list;
    }

    public void start()
    {
        started = true;
    }

    public void stop()
    {
        started = false;
    }
}
