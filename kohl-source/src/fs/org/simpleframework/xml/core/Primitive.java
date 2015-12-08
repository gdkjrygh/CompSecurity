// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Converter, PrimitiveFactory, Instance, Context, 
//            PersistenceException

class Primitive
    implements Converter
{

    private final Context context;
    private final String empty;
    private final Class expect;
    private final PrimitiveFactory factory;
    private final Type type;

    public Primitive(Context context1, Type type1)
    {
        this(context1, type1, null);
    }

    public Primitive(Context context1, Type type1, String s)
    {
        factory = new PrimitiveFactory(context1, type1);
        expect = type1.getType();
        context = context1;
        empty = s;
        type = type1;
    }

    private Object readElement(InputNode inputnode)
        throws Exception
    {
        Instance instance = factory.getInstance(inputnode);
        if (!instance.isReference())
        {
            return readElement(inputnode, instance);
        } else
        {
            return instance.getInstance();
        }
    }

    private Object readElement(InputNode inputnode, Instance instance)
        throws Exception
    {
        inputnode = ((InputNode) (read(inputnode, expect)));
        if (instance != null)
        {
            instance.setInstance(inputnode);
        }
        return inputnode;
    }

    private Object readTemplate(String s, Class class1)
        throws Exception
    {
        s = context.getProperty(s);
        if (s != null)
        {
            return factory.getInstance(s, class1);
        } else
        {
            return null;
        }
    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        if (inputnode.isElement())
        {
            return readElement(inputnode);
        } else
        {
            return read(inputnode, expect);
        }
    }

    public Object read(InputNode inputnode, Class class1)
        throws Exception
    {
        inputnode = inputnode.getValue();
        if (inputnode == null)
        {
            return null;
        }
        if (empty != null && inputnode.equals(empty))
        {
            return empty;
        } else
        {
            return readTemplate(inputnode, class1);
        }
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        if (obj != null)
        {
            throw new PersistenceException("Can not read existing %s for %s", new Object[] {
                expect, type
            });
        } else
        {
            return read(inputnode);
        }
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        obj = factory.getText(obj);
        if (obj != null)
        {
            outputnode.setValue(((String) (obj)));
        }
    }
}
