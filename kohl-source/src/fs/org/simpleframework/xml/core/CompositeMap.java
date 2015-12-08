// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Converter, MapFactory, Entry, Context, 
//            Instance

class CompositeMap
    implements Converter
{

    private final Entry entry;
    private final MapFactory factory;
    private final Converter key;
    private final Style style;
    private final Converter value;

    public CompositeMap(Context context, Entry entry1, Type type)
        throws Exception
    {
        factory = new MapFactory(context, type);
        value = entry1.getValue(context);
        key = entry1.getKey(context);
        style = context.getStyle();
        entry = entry1;
    }

    private Object populate(InputNode inputnode, Object obj)
        throws Exception
    {
        obj = (Map)obj;
        do
        {
            InputNode inputnode1 = inputnode.getNext();
            if (inputnode1 == null)
            {
                return obj;
            }
            ((Map) (obj)).put(key.read(inputnode1), value.read(inputnode1));
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
        obj = (Map)obj;
        Object obj2;
        Object obj3;
        for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); value.write(((OutputNode) (obj2)), obj3))
        {
            Object obj1 = iterator.next();
            obj2 = entry.getEntry();
            obj2 = outputnode.getChild(style.getElement(((String) (obj2))));
            obj3 = ((Map) (obj)).get(obj1);
            key.write(((OutputNode) (obj2)), obj1);
        }

    }
}
