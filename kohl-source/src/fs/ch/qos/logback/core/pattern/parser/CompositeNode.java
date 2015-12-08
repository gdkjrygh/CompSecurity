// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;


// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            SimpleKeywordNode, Node

public class CompositeNode extends SimpleKeywordNode
{

    Node childNode;

    CompositeNode(String s)
    {
        super(2, s);
    }

    public boolean equals(Object obj)
    {
        if (super.equals(obj) && (obj instanceof CompositeNode))
        {
            obj = (CompositeNode)obj;
            if (childNode != null)
            {
                return childNode.equals(((CompositeNode) (obj)).childNode);
            }
            if (((CompositeNode) (obj)).childNode == null)
            {
                return true;
            }
        }
        return false;
    }

    public Node getChildNode()
    {
        return childNode;
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public void setChildNode(Node node)
    {
        childNode = node;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (childNode != null)
        {
            stringbuffer.append((new StringBuilder()).append("CompositeNode(").append(childNode).append(")").toString());
        } else
        {
            stringbuffer.append("CompositeNode(no child)");
        }
        stringbuffer.append(printNext());
        return stringbuffer.toString();
    }
}
