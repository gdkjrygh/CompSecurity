// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            InputNode, Attribute, InputNodeMap, NodeMap, 
//            Position

class InputAttribute
    implements InputNode
{

    private String name;
    private InputNode parent;
    private String prefix;
    private String reference;
    private Object source;
    private String value;

    public InputAttribute(InputNode inputnode, Attribute attribute)
    {
        reference = attribute.getReference();
        prefix = attribute.getPrefix();
        source = attribute.getSource();
        value = attribute.getValue();
        name = attribute.getName();
        parent = inputnode;
    }

    public InputAttribute(InputNode inputnode, String s, String s1)
    {
        parent = inputnode;
        value = s1;
        name = s;
    }

    public InputNode getAttribute(String s)
    {
        return null;
    }

    public NodeMap getAttributes()
    {
        return new InputNodeMap(this);
    }

    public String getName()
    {
        return name;
    }

    public InputNode getNext()
    {
        return null;
    }

    public InputNode getNext(String s)
    {
        return null;
    }

    public InputNode getParent()
    {
        return parent;
    }

    public Position getPosition()
    {
        return parent.getPosition();
    }

    public String getValue()
    {
        return value;
    }

    public boolean isElement()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public void skip()
    {
    }

    public String toString()
    {
        return String.format("attribute %s='%s'", new Object[] {
            name, value
        });
    }
}
