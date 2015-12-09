// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j;

import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Vector;
import org.apache.log4j.helpers.AppenderAttachableImpl;
import org.apache.log4j.helpers.NullEnumeration;
import org.apache.log4j.spi.HierarchyEventListener;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.LoggingEvent;

// Referenced classes of package org.apache.log4j:
//            Hierarchy, Level, Priority, Appender

public class Category
{

    private static final String FQCN;
    static Class class$org$apache$log4j$Category;
    AppenderAttachableImpl aai;
    protected boolean additive;
    protected volatile Level level;
    protected String name;
    protected volatile Category parent;
    protected LoggerRepository repository;
    protected ResourceBundle resourceBundle;

    protected Category(String s)
    {
        additive = true;
        name = s;
    }

    private static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoClassDefFoundError(s.getMessage());
        }
        return s;
    }

    private void fireRemoveAppenderEvent(Appender appender)
    {
        if (appender != null)
        {
            if (repository instanceof Hierarchy)
            {
                ((Hierarchy)repository).fireRemoveAppenderEvent(this, appender);
            } else
            if (repository instanceof HierarchyEventListener)
            {
                appender = repository;
                return;
            }
        }
    }

    private void forcedLog(String s, Priority priority, Object obj, Throwable throwable)
    {
        callAppenders(new LoggingEvent(s, this, priority, obj, throwable));
    }

    public void addAppender(Appender appender)
    {
        this;
        JVM INSTR monitorenter ;
        if (aai == null)
        {
            aai = new AppenderAttachableImpl();
        }
        aai.addAppender(appender);
        repository.fireAddAppenderEvent(this, appender);
        this;
        JVM INSTR monitorexit ;
        return;
        appender;
        throw appender;
    }

    public void callAppenders(LoggingEvent loggingevent)
    {
        Category category;
        int i;
        i = 0;
        category = this;
_L4:
        int j = i;
        if (category == null) goto _L2; else goto _L1
_L1:
        category;
        JVM INSTR monitorenter ;
        j = i;
        if (category.aai != null)
        {
            j = i + category.aai.appendLoopOnAppenders(loggingevent);
        }
        if (category.additive)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        category;
        JVM INSTR monitorexit ;
_L2:
        if (j == 0)
        {
            repository.emitNoAppenderWarning(this);
        }
        return;
        category;
        JVM INSTR monitorexit ;
        category = category.parent;
        i = j;
        if (true) goto _L4; else goto _L3
_L3:
        loggingevent;
        category;
        JVM INSTR monitorexit ;
        throw loggingevent;
    }

    void closeNestedAppenders()
    {
        this;
        JVM INSTR monitorenter ;
        Enumeration enumeration = getAllAppenders();
        if (enumeration == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        for (; enumeration.hasMoreElements(); enumeration.nextElement()) { }
        break MISSING_BLOCK_LABEL_35;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void debug(Object obj)
    {
        while (repository.isDisabled(10000) || !Level.DEBUG.isGreaterOrEqual(getEffectiveLevel())) 
        {
            return;
        }
        forcedLog(FQCN, Level.DEBUG, obj, null);
    }

    public Enumeration getAllAppenders()
    {
        this;
        JVM INSTR monitorenter ;
        if (aai != null) goto _L2; else goto _L1
_L1:
        Object obj = NullEnumeration.getInstance();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Enumeration) (obj));
_L2:
        obj = aai.getAllAppenders();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Level getEffectiveLevel()
    {
        for (Category category = this; category != null; category = category.parent)
        {
            if (category.level != null)
            {
                return category.level;
            }
        }

        return null;
    }

    public final Level getLevel()
    {
        return level;
    }

    public final String getName()
    {
        return name;
    }

    public void removeAllAppenders()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (aai == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj = new Vector();
        for (Enumeration enumeration = aai.getAllAppenders(); enumeration.hasMoreElements(); ((Vector) (obj)).add(enumeration.nextElement())) { }
        break MISSING_BLOCK_LABEL_53;
        obj;
        throw obj;
        aai.removeAllAppenders();
        for (obj = ((Vector) (obj)).elements(); ((Enumeration) (obj)).hasMoreElements(); fireRemoveAppenderEvent((Appender)((Enumeration) (obj)).nextElement())) { }
        aai = null;
        this;
        JVM INSTR monitorexit ;
    }

    public final void setAdditivity(boolean flag)
    {
        additive = flag;
    }

    final void setHierarchy(LoggerRepository loggerrepository)
    {
        repository = loggerrepository;
    }

    public void setLevel(Level level1)
    {
        level = level1;
    }

    public void setResourceBundle(ResourceBundle resourcebundle)
    {
        resourceBundle = resourcebundle;
    }

    static 
    {
        Class class1;
        if (class$org$apache$log4j$Category == null)
        {
            class1 = _mthclass$("org.apache.log4j.Category");
            class$org$apache$log4j$Category = class1;
        } else
        {
            class1 = class$org$apache$log4j$Category;
        }
        FQCN = class1.getName();
    }
}
