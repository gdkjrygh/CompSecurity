// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Version;
import fs.org.simpleframework.xml.filter.Filter;
import fs.org.simpleframework.xml.strategy.Strategy;
import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.strategy.Value;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Context, TemplateFilter, TemplateEngine, Support, 
//            Session, Scanner, PersistenceException, ClassSchema, 
//            DefaultStyle, Caller, Decorator, Instance, 
//            Schema

class Source
    implements Context
{

    private TemplateEngine engine;
    private Filter filter;
    private Session session;
    private Strategy strategy;
    private Style style;
    private Support support;

    public Source(Strategy strategy1, Support support1, Style style1, Session session1)
    {
        filter = new TemplateFilter(this, support1);
        engine = new TemplateEngine(filter);
        strategy = strategy1;
        support = support1;
        session = session1;
        style = style1;
    }

    private Scanner getScanner(Class class1)
        throws Exception
    {
        return support.getScanner(class1);
    }

    public Object getAttribute(Object obj)
    {
        return session.get(obj);
    }

    public Caller getCaller(Class class1)
        throws Exception
    {
        return getScanner(class1).getCaller(this);
    }

    public Decorator getDecorator(Class class1)
        throws Exception
    {
        return getScanner(class1).getDecorator();
    }

    public Instance getInstance(Class class1)
    {
        return support.getInstance(class1);
    }

    public String getName(Class class1)
        throws Exception
    {
        return support.getName(class1);
    }

    public Value getOverride(Type type, InputNode inputnode)
        throws Exception
    {
        fs.org.simpleframework.xml.stream.NodeMap nodemap = inputnode.getAttributes();
        if (nodemap == null)
        {
            throw new PersistenceException("No attributes for %s", new Object[] {
                inputnode
            });
        } else
        {
            return strategy.read(type, nodemap, session);
        }
    }

    public String getProperty(String s)
    {
        return engine.process(s);
    }

    public Schema getSchema(Class class1)
        throws Exception
    {
        Scanner scanner = getScanner(class1);
        if (scanner == null)
        {
            throw new PersistenceException("Invalid schema class %s", new Object[] {
                class1
            });
        } else
        {
            return new ClassSchema(scanner, this);
        }
    }

    public Session getSession()
    {
        return session;
    }

    public Style getStyle()
    {
        if (style == null)
        {
            style = new DefaultStyle();
        }
        return style;
    }

    public Support getSupport()
    {
        return support;
    }

    public Class getType(Type type, Object obj)
    {
        if (obj != null)
        {
            return obj.getClass();
        } else
        {
            return type.getType();
        }
    }

    public Version getVersion(Class class1)
        throws Exception
    {
        return getScanner(class1).getRevision();
    }

    public boolean isFloat(Type type)
        throws Exception
    {
        return isFloat(type.getType());
    }

    public boolean isFloat(Class class1)
        throws Exception
    {
        return support.isFloat(class1);
    }

    public boolean isPrimitive(Type type)
        throws Exception
    {
        return isPrimitive(type.getType());
    }

    public boolean isPrimitive(Class class1)
        throws Exception
    {
        return support.isPrimitive(class1);
    }

    public boolean isStrict()
    {
        return session.isStrict();
    }

    public boolean setOverride(Type type, Object obj, OutputNode outputnode)
        throws Exception
    {
        fs.org.simpleframework.xml.stream.NodeMap nodemap = outputnode.getAttributes();
        if (nodemap == null)
        {
            throw new PersistenceException("No attributes for %s", new Object[] {
                outputnode
            });
        } else
        {
            return strategy.write(type, obj, nodemap, session);
        }
    }
}
