// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            OutputNode, OutputNodeMap, Mode, NamespaceMap, 
//            NodeMap

class OutputAttribute
    implements OutputNode
{

    private String name;
    private String reference;
    private NamespaceMap scope;
    private OutputNode source;
    private String value;

    public OutputAttribute(OutputNode outputnode, String s, String s1)
    {
        scope = outputnode.getNamespaces();
        source = outputnode;
        value = s1;
        name = s;
    }

    public void commit()
    {
    }

    public NodeMap getAttributes()
    {
        return new OutputNodeMap(this);
    }

    public OutputNode getChild(String s)
    {
        return null;
    }

    public String getComment()
    {
        return null;
    }

    public Mode getMode()
    {
        return Mode.INHERIT;
    }

    public String getName()
    {
        return name;
    }

    public NamespaceMap getNamespaces()
    {
        return scope;
    }

    public OutputNode getParent()
    {
        return source;
    }

    public String getPrefix()
    {
        return scope.getPrefix(reference);
    }

    public String getPrefix(boolean flag)
    {
        return scope.getPrefix(reference);
    }

    public String getValue()
    {
        return value;
    }

    public boolean isCommitted()
    {
        return true;
    }

    public void remove()
    {
    }

    public OutputNode setAttribute(String s, String s1)
    {
        return null;
    }

    public void setData(boolean flag)
    {
    }

    public void setMode(Mode mode)
    {
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setReference(String s)
    {
        reference = s;
    }

    public void setValue(String s)
    {
        value = s;
    }

    public String toString()
    {
        return String.format("attribute %s='%s'", new Object[] {
            name, value
        });
    }
}
