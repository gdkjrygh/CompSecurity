// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.event.InPlayListener;
import fs.ch.qos.logback.core.joran.event.SaxEvent;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.PropertyContainer;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;

// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            DefaultNestedComponentRegistry, Interpreter

public class InterpretationContext extends ContextAwareBase
    implements PropertyContainer
{

    DefaultNestedComponentRegistry defaultNestedComponentRegistry;
    Interpreter joranInterpreter;
    final List listenerList = new ArrayList();
    Map objectMap;
    Stack objectStack;
    Map propertiesMap;

    public InterpretationContext(Context context, Interpreter interpreter)
    {
        defaultNestedComponentRegistry = new DefaultNestedComponentRegistry();
        this.context = context;
        joranInterpreter = interpreter;
        objectStack = new Stack();
        objectMap = new HashMap(5);
        propertiesMap = new HashMap(5);
    }

    public void addInPlayListener(InPlayListener inplaylistener)
    {
        if (listenerList.contains(inplaylistener))
        {
            addWarn((new StringBuilder()).append("InPlayListener ").append(inplaylistener).append(" has been already registered").toString());
            return;
        } else
        {
            listenerList.add(inplaylistener);
            return;
        }
    }

    public void addSubstitutionProperties(Properties properties)
    {
        if (properties != null)
        {
            Iterator iterator = properties.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                addSubstitutionProperty(s, properties.getProperty(s));
            }
        }
    }

    public void addSubstitutionProperty(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            return;
        } else
        {
            s1 = s1.trim();
            propertiesMap.put(s, s1);
            return;
        }
    }

    void fireInPlay(SaxEvent saxevent)
    {
        for (Iterator iterator = listenerList.iterator(); iterator.hasNext(); ((InPlayListener)iterator.next()).inPlay(saxevent)) { }
    }

    public DefaultNestedComponentRegistry getDefaultNestedComponentRegistry()
    {
        return defaultNestedComponentRegistry;
    }

    public Interpreter getJoranInterpreter()
    {
        return joranInterpreter;
    }

    public Map getObjectMap()
    {
        return objectMap;
    }

    public String getProperty(String s)
    {
        String s1 = (String)propertiesMap.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return context.getProperty(s);
        }
    }

    public boolean isEmpty()
    {
        return objectStack.isEmpty();
    }

    public Object peekObject()
    {
        return objectStack.peek();
    }

    public Object popObject()
    {
        return objectStack.pop();
    }

    public void pushObject(Object obj)
    {
        objectStack.push(obj);
    }

    public boolean removeInPlayListener(InPlayListener inplaylistener)
    {
        return listenerList.remove(inplaylistener);
    }

    void setPropertiesMap(Map map)
    {
        propertiesMap = map;
    }

    public String subst(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return OptionHelper.substVars(s, this, context);
        }
    }
}
