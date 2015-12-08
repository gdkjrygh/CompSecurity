// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Converter, Traverser, Context, PersistenceException, 
//            Entry

class CompositeValue
    implements Converter
{

    private final Context context;
    private final Entry entry;
    private final Traverser root;
    private final Style style;
    private final Type type;

    public CompositeValue(Context context1, Entry entry1, Type type1)
        throws Exception
    {
        root = new Traverser(context1);
        style = context1.getStyle();
        context = context1;
        entry = entry1;
        type = type1;
    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        inputnode = inputnode.getNext();
        Class class1;
        for (class1 = type.getType(); inputnode == null || inputnode.isEmpty();)
        {
            return null;
        }

        return root.read(inputnode, class1);
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        Class class1 = type.getType();
        if (obj != null)
        {
            throw new PersistenceException("Can not read value of %s for %s", new Object[] {
                class1, entry
            });
        } else
        {
            return read(inputnode);
        }
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        Class class1 = type.getType();
        String s1 = entry.getValue();
        String s = s1;
        if (s1 == null)
        {
            s = context.getName(class1);
        }
        s = style.getElement(s);
        root.write(outputnode, obj, class1, s);
    }
}
