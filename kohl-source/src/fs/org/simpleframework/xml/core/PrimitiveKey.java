// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Converter, PrimitiveFactory, Primitive, Context, 
//            Entry, PersistenceException

class PrimitiveKey
    implements Converter
{

    private final Context context;
    private final Entry entry;
    private final PrimitiveFactory factory;
    private final Primitive root;
    private final Style style;
    private final Type type;

    public PrimitiveKey(Context context1, Entry entry1, Type type1)
    {
        factory = new PrimitiveFactory(context1, type1);
        root = new Primitive(context1, type1);
        style = context1.getStyle();
        context = context1;
        entry = entry1;
        type = type1;
    }

    private boolean isOverridden(OutputNode outputnode, Object obj)
        throws Exception
    {
        return factory.setOverride(type, obj, outputnode);
    }

    private Object readAttribute(InputNode inputnode, String s)
        throws Exception
    {
        inputnode = inputnode.getAttribute(style.getAttribute(s));
        if (inputnode == null)
        {
            return null;
        } else
        {
            return root.read(inputnode);
        }
    }

    private Object readElement(InputNode inputnode, String s)
        throws Exception
    {
        inputnode = inputnode.getNext(style.getElement(s));
        if (inputnode == null)
        {
            return null;
        } else
        {
            return root.read(inputnode);
        }
    }

    private void writeAttribute(OutputNode outputnode, Object obj)
        throws Exception
    {
        Class class1 = type.getType();
        String s1 = factory.getText(obj);
        String s = entry.getKey();
        obj = s;
        if (s == null)
        {
            obj = context.getName(class1);
        }
        obj = style.getAttribute(((String) (obj)));
        if (s1 != null)
        {
            outputnode.setAttribute(((String) (obj)), s1);
        }
    }

    private void writeElement(OutputNode outputnode, Object obj)
        throws Exception
    {
        Class class1 = type.getType();
        String s1 = entry.getKey();
        String s = s1;
        if (s1 == null)
        {
            s = context.getName(class1);
        }
        outputnode = outputnode.getChild(style.getElement(s));
        if (obj != null && !isOverridden(outputnode, obj))
        {
            root.write(outputnode, obj);
        }
    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        Class class1 = type.getType();
        String s1 = entry.getKey();
        String s = s1;
        if (s1 == null)
        {
            s = context.getName(class1);
        }
        if (!entry.isAttribute())
        {
            return readElement(inputnode, s);
        } else
        {
            return readAttribute(inputnode, s);
        }
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        Class class1 = type.getType();
        if (obj != null)
        {
            throw new PersistenceException("Can not read key of %s for %s", new Object[] {
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
        if (!entry.isAttribute())
        {
            writeElement(outputnode, obj);
        } else
        if (obj != null)
        {
            writeAttribute(outputnode, obj);
            return;
        }
    }
}
