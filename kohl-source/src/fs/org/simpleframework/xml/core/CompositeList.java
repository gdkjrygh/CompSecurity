// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Converter, CollectionFactory, Traverser, Instance, 
//            PersistenceException, Context

class CompositeList
    implements Converter
{

    private final Type entry;
    private final CollectionFactory factory;
    private final String name;
    private final Traverser root;
    private final Type type;

    public CompositeList(Context context, Type type1, Type type2, String s)
    {
        factory = new CollectionFactory(context, type1);
        root = new Traverser(context);
        entry = type2;
        type = type1;
        name = s;
    }

    private Object populate(InputNode inputnode, Object obj)
        throws Exception
    {
        obj = (Collection)obj;
        do
        {
            InputNode inputnode1 = inputnode.getNext();
            Class class1 = entry.getType();
            if (inputnode1 == null)
            {
                return obj;
            }
            ((Collection) (obj)).add(root.read(inputnode1, class1));
        } while (true);
    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        Instance instance = factory.getInstance(inputnode);
        Object obj1 = instance.getInstance();
        Object obj = obj1;
        if (!instance.isReference())
        {
            obj = populate(inputnode, obj1);
        }
        return obj;
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        Object obj1 = factory.getInstance(inputnode);
        if (((Instance) (obj1)).isReference())
        {
            obj1 = ((Instance) (obj1)).getInstance();
        } else
        {
            ((Instance) (obj1)).setInstance(obj);
            obj1 = obj;
            if (obj != null)
            {
                return populate(inputnode, obj);
            }
        }
        return obj1;
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        obj = ((Collection)obj).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = ((Iterator) (obj)).next();
            if (obj1 != null)
            {
                Class class1 = entry.getType();
                Class class2 = obj1.getClass();
                if (!class1.isAssignableFrom(class2))
                {
                    throw new PersistenceException("Entry %s does not match %s for %s", new Object[] {
                        class2, entry, type
                    });
                }
                root.write(outputnode, obj1, class1, name);
            }
        } while (true);
    }
}
