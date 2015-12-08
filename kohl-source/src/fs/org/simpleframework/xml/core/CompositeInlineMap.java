// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.Mode;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Repeater, MapFactory, Entry, Context, 
//            Converter

class CompositeInlineMap
    implements Repeater
{

    private final Entry entry;
    private final MapFactory factory;
    private final Converter key;
    private final Style style;
    private final Converter value;

    public CompositeInlineMap(Context context, Entry entry1, Type type)
        throws Exception
    {
        factory = new MapFactory(context, type);
        value = entry1.getValue(context);
        key = entry1.getKey(context);
        style = context.getStyle();
        entry = entry1;
    }

    private Object read(InputNode inputnode, Map map)
        throws Exception
    {
        InputNode inputnode1 = inputnode.getParent();
        String s = inputnode.getName();
        for (; inputnode != null; inputnode = inputnode1.getNext(s))
        {
            Object obj = key.read(inputnode);
            inputnode = ((InputNode) (value.read(inputnode)));
            if (map != null)
            {
                map.put(obj, inputnode);
            }
        }

        return map;
    }

    private void write(OutputNode outputnode, Map map, Mode mode)
        throws Exception
    {
        String s = entry.getEntry();
        s = style.getElement(s);
        OutputNode outputnode1;
        Object obj1;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); value.write(outputnode1, obj1))
        {
            Object obj = iterator.next();
            outputnode1 = outputnode.getChild(s);
            obj1 = map.get(obj);
            outputnode1.setMode(mode);
            key.write(outputnode1, obj);
        }

    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        Map map = (Map)factory.getInstance();
        if (map != null)
        {
            return read(inputnode, map);
        } else
        {
            return null;
        }
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        obj = (Map)obj;
        if (obj != null)
        {
            return read(inputnode, ((Map) (obj)));
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
        obj = (Map)obj;
        if (!outputnode.isCommitted())
        {
            outputnode.remove();
        }
        write(outputnode1, ((Map) (obj)), mode);
    }
}
