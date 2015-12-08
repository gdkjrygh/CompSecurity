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
//            Repeater, CollectionFactory, Traverser, PersistenceException, 
//            Context

class CompositeInlineList
    implements Repeater
{

    private final Type entry;
    private final CollectionFactory factory;
    private final String name;
    private final Traverser root;
    private final Type type;

    public CompositeInlineList(Context context, Type type1, Type type2, String s)
    {
        factory = new CollectionFactory(context, type1);
        root = new Traverser(context);
        entry = type2;
        type = type1;
        name = s;
    }

    private Object read(InputNode inputnode, Class class1)
        throws Exception
    {
        inputnode = ((InputNode) (root.read(inputnode, class1)));
        class1 = inputnode.getClass();
        if (!entry.getType().isAssignableFrom(class1))
        {
            throw new PersistenceException("Entry %s does not match %s for %s", new Object[] {
                class1, entry, type
            });
        } else
        {
            return inputnode;
        }
    }

    private Object read(InputNode inputnode, Collection collection)
        throws Exception
    {
        InputNode inputnode1 = inputnode.getParent();
        String s = inputnode.getName();
        for (; inputnode != null; inputnode = inputnode1.getNext(s))
        {
            inputnode = ((InputNode) (read(inputnode, entry.getType())));
            if (inputnode != null)
            {
                collection.add(inputnode);
            }
        }

        return collection;
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
        obj = (Collection)obj;
        OutputNode outputnode1 = outputnode.getParent();
        if (!outputnode.isCommitted())
        {
            outputnode.remove();
        }
        write(outputnode1, ((Collection) (obj)));
    }

    public void write(OutputNode outputnode, Collection collection)
        throws Exception
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj = collection.next();
            if (obj != null)
            {
                Class class1 = entry.getType();
                Class class2 = obj.getClass();
                if (!class1.isAssignableFrom(class2))
                {
                    throw new PersistenceException("Entry %s does not match %s for %s", new Object[] {
                        class2, class1, type
                    });
                }
                root.write(outputnode, obj, class1, name);
            }
        } while (true);
    }
}
