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
//            Converter, CollectionFactory, Primitive, Instance, 
//            Context

class PrimitiveList
    implements Converter
{

    private final Type entry;
    private final CollectionFactory factory;
    private final String parent;
    private final Primitive root;

    public PrimitiveList(Context context, Type type, Type type1, String s)
    {
        factory = new CollectionFactory(context, type);
        root = new Primitive(context, type1);
        parent = s;
        entry = type1;
    }

    private boolean isOverridden(OutputNode outputnode, Object obj)
        throws Exception
    {
        return factory.setOverride(entry, obj, outputnode);
    }

    private Object populate(InputNode inputnode, Object obj)
        throws Exception
    {
        obj = (Collection)obj;
        do
        {
            InputNode inputnode1 = inputnode.getNext();
            if (inputnode1 == null)
            {
                return obj;
            }
            ((Collection) (obj)).add(root.read(inputnode1));
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
                OutputNode outputnode1 = outputnode.getChild(parent);
                if (!isOverridden(outputnode1, obj1))
                {
                    root.write(outputnode1, obj1);
                }
            }
        } while (true);
    }
}
