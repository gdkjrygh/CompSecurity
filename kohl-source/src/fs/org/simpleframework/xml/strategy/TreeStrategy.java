// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.strategy;

import fs.org.simpleframework.xml.stream.Node;
import fs.org.simpleframework.xml.stream.NodeMap;
import java.lang.reflect.Array;
import java.util.Map;

// Referenced classes of package fs.org.simpleframework.xml.strategy:
//            Strategy, Loader, ArrayValue, Type, 
//            ObjectValue, Value

public class TreeStrategy
    implements Strategy
{

    private final String label;
    private final String length;
    private final Loader loader;

    public TreeStrategy()
    {
        this("class", "length");
    }

    public TreeStrategy(String s, String s1)
    {
        loader = new Loader();
        length = s1;
        label = s;
    }

    private Value readArray(Class class1, NodeMap nodemap)
        throws Exception
    {
        nodemap = nodemap.remove(length);
        int i = 0;
        if (nodemap != null)
        {
            i = Integer.parseInt(nodemap.getValue());
        }
        return new ArrayValue(class1, i);
    }

    private Class readValue(Type type, NodeMap nodemap)
        throws Exception
    {
        Node node = nodemap.remove(label);
        nodemap = type.getType();
        type = nodemap;
        if (nodemap.isArray())
        {
            type = nodemap.getComponentType();
        }
        if (node != null)
        {
            type = node.getValue();
            type = loader.load(type);
        }
        return type;
    }

    private Class writeArray(Class class1, Object obj, NodeMap nodemap)
    {
        int i = Array.getLength(obj);
        if (length != null)
        {
            nodemap.put(length, String.valueOf(i));
        }
        return class1.getComponentType();
    }

    public Value read(Type type, NodeMap nodemap, Map map)
        throws Exception
    {
        map = readValue(type, nodemap);
        type = type.getType();
        if (type.isArray())
        {
            return readArray(map, nodemap);
        }
        if (type != map)
        {
            return new ObjectValue(map);
        } else
        {
            return null;
        }
    }

    public boolean write(Type type, Object obj, NodeMap nodemap, Map map)
    {
        map = obj.getClass();
        Class class1 = type.getType();
        type = map;
        if (map.isArray())
        {
            type = writeArray(class1, obj, nodemap);
        }
        if (map != class1)
        {
            nodemap.put(label, type.getName());
        }
        return false;
    }
}
