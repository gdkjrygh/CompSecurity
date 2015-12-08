// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            NodeMap, OutputNode, OutputAttribute, Node

class OutputNodeMap extends LinkedHashMap
    implements NodeMap
{

    private final OutputNode source;

    public OutputNodeMap(OutputNode outputnode)
    {
        source = outputnode;
    }

    public volatile Node get(String s)
    {
        return get(s);
    }

    public OutputNode get(String s)
    {
        return (OutputNode)super.get(s);
    }

    public Iterator iterator()
    {
        return keySet().iterator();
    }

    public volatile Node put(String s, String s1)
    {
        return put(s, s1);
    }

    public OutputNode put(String s, String s1)
    {
        s1 = new OutputAttribute(source, s, s1);
        if (source != null)
        {
            put(s, s1);
        }
        return s1;
    }

    public volatile Node remove(String s)
    {
        return remove(s);
    }

    public OutputNode remove(String s)
    {
        return (OutputNode)super.remove(s);
    }
}
