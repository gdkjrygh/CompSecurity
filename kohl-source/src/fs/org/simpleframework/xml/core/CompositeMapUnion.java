// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Repeater, Group, Context, Label, 
//            Converter, UnionException, Expression, LabelMap

class CompositeMapUnion
    implements Repeater
{

    private final Context context;
    private final LabelMap elements;
    private final Group group;
    private final Expression path;
    private final Style style;
    private final Type type;

    public CompositeMapUnion(Context context1, Group group1, Expression expression, Type type1)
        throws Exception
    {
        elements = group1.getElements(context1);
        style = context1.getStyle();
        context = context1;
        group = group1;
        type = type1;
        path = expression;
    }

    private void write(OutputNode outputnode, Object obj, Object obj1, Label label)
        throws Exception
    {
        Converter converter = label.getConverter(context);
        obj = Collections.singletonMap(obj, obj1);
        if (!label.isInline())
        {
            obj1 = label.getName();
            obj1 = style.getElement(((String) (obj1)));
            if (!outputnode.isCommitted())
            {
                outputnode.setName(((String) (obj1)));
            }
        }
        converter.write(outputnode, obj);
    }

    private void write(OutputNode outputnode, Map map)
        throws Exception
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            Object obj1 = map.get(obj);
            if (obj1 != null)
            {
                Class class1 = obj1.getClass();
                Label label = group.getLabel(class1);
                if (label == null)
                {
                    throw new UnionException("Value of %s not declared in %s with annotation %s", new Object[] {
                        class1, type, group
                    });
                }
                write(outputnode, obj, obj1, label);
            }
        } while (true);
    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        String s = inputnode.getName();
        s = path.getElement(s);
        return ((Label)elements.get(s)).getConverter(context).read(inputnode);
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        String s = inputnode.getName();
        s = path.getElement(s);
        return ((Label)elements.get(s)).getConverter(context).read(inputnode, obj);
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        obj = (Map)obj;
        if (!group.isInline())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (((Map) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        write(outputnode, ((Map) (obj)));
_L4:
        return;
_L2:
        if (outputnode.isCommitted()) goto _L4; else goto _L3
_L3:
        outputnode.remove();
        return;
        write(outputnode, ((Map) (obj)));
        return;
    }
}
