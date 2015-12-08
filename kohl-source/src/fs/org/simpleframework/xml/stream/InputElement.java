// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            InputNode, InputNodeMap, EventNode, NodeReader, 
//            InputPosition, NodeMap, Position

class InputElement
    implements InputNode
{

    private final InputNodeMap map;
    private final EventNode node;
    private final InputNode parent;
    private final NodeReader reader;

    public InputElement(InputNode inputnode, NodeReader nodereader, EventNode eventnode)
    {
        map = new InputNodeMap(this, eventnode);
        reader = nodereader;
        parent = inputnode;
        node = eventnode;
    }

    public InputNode getAttribute(String s)
    {
        return map.get(s);
    }

    public NodeMap getAttributes()
    {
        return map;
    }

    public String getName()
    {
        return node.getName();
    }

    public InputNode getNext()
        throws Exception
    {
        return reader.readElement(this);
    }

    public InputNode getNext(String s)
        throws Exception
    {
        return reader.readElement(this, s);
    }

    public InputNode getParent()
    {
        return parent;
    }

    public Position getPosition()
    {
        return new InputPosition(node);
    }

    public String getValue()
        throws Exception
    {
        return reader.readValue(this);
    }

    public boolean isElement()
    {
        return true;
    }

    public boolean isEmpty()
        throws Exception
    {
        if (!map.isEmpty())
        {
            return false;
        } else
        {
            return reader.isEmpty(this);
        }
    }

    public void skip()
        throws Exception
    {
        reader.skipElement(this);
    }

    public String toString()
    {
        return String.format("element %s", new Object[] {
            getName()
        });
    }
}
