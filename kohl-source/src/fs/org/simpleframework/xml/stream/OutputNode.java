// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Node, NodeMap, Mode, NamespaceMap

public interface OutputNode
    extends Node
{

    public abstract void commit()
        throws Exception;

    public abstract NodeMap getAttributes();

    public abstract OutputNode getChild(String s)
        throws Exception;

    public abstract String getComment();

    public abstract Mode getMode();

    public abstract NamespaceMap getNamespaces();

    public abstract OutputNode getParent();

    public abstract String getPrefix();

    public abstract String getPrefix(boolean flag);

    public abstract boolean isCommitted();

    public abstract void remove()
        throws Exception;

    public abstract OutputNode setAttribute(String s, String s1);

    public abstract void setData(boolean flag);

    public abstract void setMode(Mode mode);

    public abstract void setName(String s);

    public abstract void setReference(String s);

    public abstract void setValue(String s);
}
