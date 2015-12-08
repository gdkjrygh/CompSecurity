// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.Mode;
import fs.org.simpleframework.xml.stream.OutputNode;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Repeater, CollectionFactory, Primitive, Context

class PrimitiveInlineList
    implements Repeater
{

    private final Type entry;
    private final CollectionFactory factory;
    private final String parent;
    private final Primitive root;

    public PrimitiveInlineList(Context context, Type type, Type type1, String s)
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

    private Object read(InputNode inputnode, Collection collection)
        throws Exception
    {
        InputNode inputnode1 = inputnode.getParent();
        String s = inputnode.getName();
        for (; inputnode != null; inputnode = inputnode1.getNext(s))
        {
            inputnode = ((InputNode) (root.read(inputnode)));
            if (inputnode != null)
            {
                collection.add(inputnode);
            }
        }

        return collection;
    }

    private void write(OutputNode outputnode, Object obj, Mode mode)
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
                    outputnode1.setMode(mode);
                    root.write(outputnode1, obj1);
                }
            }
        } while (true);
    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        Collection collection = (Collection)factory.getInstance();
        if (collection != null)
        {
            return read(inputnode, collection);
        } else
        {
            return null;
        }
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        obj = (Collection)obj;
        if (obj != null)
        {
            return read(inputnode, ((Collection) (obj)));
        } else
        {
            return read(inputnode);
        }
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        OutputNode outputnode1 = outputnode.getParent();
        Mode mode = outputnode.getMode();
        if (!outputnode.isCommitted())
        {
            outputnode.remove();
        }
        write(outputnode1, obj, mode);
    }
}
