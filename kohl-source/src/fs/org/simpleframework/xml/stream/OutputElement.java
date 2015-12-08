// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            OutputNode, PrefixResolver, OutputNodeMap, Mode, 
//            NodeWriter, NamespaceMap, NodeMap

class OutputElement
    implements OutputNode
{

    private String comment;
    private Mode mode;
    private String name;
    private OutputNode parent;
    private String reference;
    private NamespaceMap scope;
    private OutputNodeMap table;
    private String value;
    private NodeWriter writer;

    public OutputElement(OutputNode outputnode, NodeWriter nodewriter, String s)
    {
        scope = new PrefixResolver(outputnode);
        table = new OutputNodeMap(this);
        mode = Mode.INHERIT;
        writer = nodewriter;
        parent = outputnode;
        name = s;
    }

    public void commit()
        throws Exception
    {
        writer.commit(this);
    }

    public volatile NodeMap getAttributes()
    {
        return getAttributes();
    }

    public OutputNodeMap getAttributes()
    {
        return table;
    }

    public OutputNode getChild(String s)
        throws Exception
    {
        return writer.writeElement(this, s);
    }

    public String getComment()
    {
        return comment;
    }

    public Mode getMode()
    {
        return mode;
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
        return parent;
    }

    public String getPrefix()
    {
        return getPrefix(true);
    }

    public String getPrefix(boolean flag)
    {
        String s1 = scope.getPrefix(reference);
        String s = s1;
        if (flag)
        {
            s = s1;
            if (s1 == null)
            {
                s = parent.getPrefix();
            }
        }
        return s;
    }

    public String getValue()
    {
        return value;
    }

    public boolean isCommitted()
    {
        return writer.isCommitted(this);
    }

    public void remove()
        throws Exception
    {
        writer.remove(this);
    }

    public OutputNode setAttribute(String s, String s1)
    {
        return table.put(s, s1);
    }

    public void setData(boolean flag)
    {
        if (flag)
        {
            mode = Mode.DATA;
            return;
        } else
        {
            mode = Mode.ESCAPE;
            return;
        }
    }

    public void setMode(Mode mode1)
    {
        mode = mode1;
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
        return String.format("element %s", new Object[] {
            name
        });
    }
}
