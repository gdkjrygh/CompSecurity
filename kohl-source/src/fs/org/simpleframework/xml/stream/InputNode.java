// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Node, NodeMap, Position

public interface InputNode
    extends Node
{

    public abstract InputNode getAttribute(String s);

    public abstract NodeMap getAttributes();

    public abstract InputNode getNext()
        throws Exception;

    public abstract InputNode getNext(String s)
        throws Exception;

    public abstract InputNode getParent();

    public abstract Position getPosition();

    public abstract boolean isElement();

    public abstract boolean isEmpty()
        throws Exception;

    public abstract void skip()
        throws Exception;
}
