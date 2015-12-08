// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Context, RootException, Composite, ClassType, 
//            Decorator

class Traverser
{

    private final Context context;
    private final Style style;

    public Traverser(Context context1)
    {
        style = context1.getStyle();
        context = context1;
    }

    private Composite getComposite(Class class1)
        throws Exception
    {
        Type type = getType(class1);
        if (class1 == null)
        {
            throw new RootException("Can not instantiate null class", new Object[0]);
        } else
        {
            return new Composite(context, type);
        }
    }

    private Decorator getDecorator(Class class1)
        throws Exception
    {
        return context.getDecorator(class1);
    }

    private Type getType(Class class1)
    {
        return new ClassType(class1);
    }

    private Object read(InputNode inputnode, Class class1, Object obj)
        throws Exception
    {
        if (getName(class1) == null)
        {
            throw new RootException("Root annotation required for %s", new Object[] {
                class1
            });
        } else
        {
            return obj;
        }
    }

    protected String getName(Class class1)
        throws Exception
    {
        class1 = context.getName(class1);
        return style.getElement(class1);
    }

    public Object read(InputNode inputnode, Class class1)
        throws Exception
    {
        class1 = ((Class) (getComposite(class1).read(inputnode)));
        if (class1 != null)
        {
            return read(inputnode, class1.getClass(), class1);
        } else
        {
            return null;
        }
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        write(outputnode, obj, obj.getClass());
    }

    public void write(OutputNode outputnode, Object obj, Class class1)
        throws Exception
    {
        Class class2 = obj.getClass();
        String s = getName(class2);
        if (s == null)
        {
            throw new RootException("Root annotation required for %s", new Object[] {
                class2
            });
        } else
        {
            write(outputnode, obj, class1, s);
            return;
        }
    }

    public void write(OutputNode outputnode, Object obj, Class class1, String s)
        throws Exception
    {
        outputnode = outputnode.getChild(s);
        class1 = getType(class1);
        if (obj != null)
        {
            s = obj.getClass();
            Decorator decorator = getDecorator(s);
            if (decorator != null)
            {
                decorator.decorate(outputnode);
            }
            if (!context.setOverride(class1, obj, outputnode))
            {
                getComposite(s).write(outputnode, obj);
            }
        }
        outputnode.commit();
    }
}
