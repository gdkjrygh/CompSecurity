// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.or.ObjectRenderer;
import org.apache.log4j.or.RendererMap;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.RendererSupport;

// Referenced classes of package org.apache.log4j:
//            Level, Category, DefaultCategoryFactory, Logger, 
//            CategoryKey, ProvisionNode, Priority, Appender

public final class Hierarchy
    implements LoggerRepository, RendererSupport
{

    private LoggerFactory defaultFactory;
    boolean emittedNoAppenderWarning;
    boolean emittedNoResourceBundleWarning;
    Hashtable ht;
    private Vector listeners;
    RendererMap rendererMap;
    Logger root;
    Level threshold;
    int thresholdInt;

    public Hierarchy(Logger logger)
    {
        emittedNoAppenderWarning = false;
        emittedNoResourceBundleWarning = false;
        ht = new Hashtable();
        listeners = new Vector(1);
        root = logger;
        setThreshold(Level.ALL);
        root.setHierarchy(this);
        rendererMap = new RendererMap();
        defaultFactory = new DefaultCategoryFactory();
    }

    private Enumeration getCurrentLoggers()
    {
        Vector vector = new Vector(ht.size());
        Enumeration enumeration = ht.elements();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            Object obj = enumeration.nextElement();
            if (obj instanceof Logger)
            {
                vector.addElement(obj);
            }
        } while (true);
        return vector.elements();
    }

    private void shutdown()
    {
        Object obj;
        obj = getRootLogger();
        ((Category) (obj)).closeNestedAppenders();
        Hashtable hashtable = ht;
        hashtable;
        JVM INSTR monitorenter ;
        for (Enumeration enumeration1 = getCurrentLoggers(); enumeration1.hasMoreElements(); ((Logger)enumeration1.nextElement()).closeNestedAppenders()) { }
        break MISSING_BLOCK_LABEL_50;
        obj;
        hashtable;
        JVM INSTR monitorexit ;
        throw obj;
        ((Category) (obj)).removeAllAppenders();
        for (Enumeration enumeration = getCurrentLoggers(); enumeration.hasMoreElements(); ((Logger)enumeration.nextElement()).removeAllAppenders()) { }
        hashtable;
        JVM INSTR monitorexit ;
    }

    private static void updateChildren(ProvisionNode provisionnode, Logger logger)
    {
        int j = provisionnode.size();
        for (int i = 0; i < j; i++)
        {
            Logger logger1 = (Logger)provisionnode.elementAt(i);
            if (!((Category) (logger1)).parent.name.startsWith(((Category) (logger)).name))
            {
                logger.parent = ((Category) (logger1)).parent;
                logger1.parent = logger;
            }
        }

    }

    private final void updateParents(Logger logger)
    {
        String s;
        int i;
        boolean flag1;
        s = ((Category) (logger)).name;
        i = s.length();
        flag1 = false;
        i = s.lastIndexOf('.', i - 1);
_L5:
        boolean flag = flag1;
        if (i < 0) goto _L2; else goto _L1
_L1:
        CategoryKey categorykey;
        Object obj;
        categorykey = new CategoryKey(s.substring(0, i));
        obj = ht.get(categorykey);
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = new ProvisionNode(logger);
        ht.put(categorykey, obj);
_L6:
        i = s.lastIndexOf('.', i - 1);
          goto _L5
_L4:
        if (!(obj instanceof Category))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        flag = true;
        logger.parent = (Category)obj;
_L2:
        if (!flag)
        {
            logger.parent = root;
        }
        return;
        if (obj instanceof ProvisionNode)
        {
            ((ProvisionNode)obj).addElement(logger);
        } else
        {
            (new IllegalStateException("unexpected object type " + obj.getClass() + " in ht.")).printStackTrace();
        }
          goto _L6
    }

    public final void emitNoAppenderWarning(Category category)
    {
        if (!emittedNoAppenderWarning)
        {
            LogLog.warn("No appenders could be found for logger (" + category.getName() + ").");
            LogLog.warn("Please initialize the log4j system properly.");
            emittedNoAppenderWarning = true;
        }
    }

    public final void fireAddAppenderEvent(Category category, Appender appender)
    {
        if (listeners != null)
        {
            int j = listeners.size();
            for (int i = 0; i < j; i++)
            {
                listeners.elementAt(i);
            }

        }
    }

    final void fireRemoveAppenderEvent(Category category, Appender appender)
    {
        if (listeners != null)
        {
            int j = listeners.size();
            for (int i = 0; i < j; i++)
            {
                listeners.elementAt(i);
            }

        }
    }

    public final Logger getLogger(String s)
    {
        return getLogger(s, defaultFactory);
    }

    public final Logger getLogger(String s, LoggerFactory loggerfactory)
    {
        CategoryKey categorykey = new CategoryKey(s);
        Hashtable hashtable = ht;
        hashtable;
        JVM INSTR monitorenter ;
        Object obj = ht.get(categorykey);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = loggerfactory.makeNewLoggerInstance(s);
        s.setHierarchy(this);
        ht.put(categorykey, s);
        updateParents(s);
        hashtable;
        JVM INSTR monitorexit ;
        return s;
        if (!(obj instanceof Logger))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s = (Logger)obj;
        hashtable;
        JVM INSTR monitorexit ;
        return s;
        if (!(obj instanceof ProvisionNode))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        s = loggerfactory.makeNewLoggerInstance(s);
        s.setHierarchy(this);
        ht.put(categorykey, s);
        updateChildren((ProvisionNode)obj, s);
        updateParents(s);
        return s;
        s;
        hashtable;
        JVM INSTR monitorexit ;
        throw s;
        hashtable;
        JVM INSTR monitorexit ;
        return null;
    }

    public final Logger getRootLogger()
    {
        return root;
    }

    public final Level getThreshold()
    {
        return threshold;
    }

    public final boolean isDisabled(int i)
    {
        return thresholdInt > i;
    }

    public final void resetConfiguration()
    {
        getRootLogger().setLevel(Level.DEBUG);
        root.setResourceBundle(null);
        setThreshold(Level.ALL);
        Hashtable hashtable = ht;
        hashtable;
        JVM INSTR monitorenter ;
        shutdown();
        Logger logger;
        for (Enumeration enumeration = getCurrentLoggers(); enumeration.hasMoreElements(); logger.setResourceBundle(null))
        {
            logger = (Logger)enumeration.nextElement();
            logger.setLevel(null);
            logger.setAdditivity(true);
        }

        break MISSING_BLOCK_LABEL_83;
        Exception exception;
        exception;
        hashtable;
        JVM INSTR monitorexit ;
        throw exception;
        hashtable;
        JVM INSTR monitorexit ;
        rendererMap.clear();
        return;
    }

    public final void setRenderer(Class class1, ObjectRenderer objectrenderer)
    {
        rendererMap.put(class1, objectrenderer);
    }

    public final void setThreshold(Level level)
    {
        if (level != null)
        {
            thresholdInt = ((Priority) (level)).level;
            threshold = level;
        }
    }
}
