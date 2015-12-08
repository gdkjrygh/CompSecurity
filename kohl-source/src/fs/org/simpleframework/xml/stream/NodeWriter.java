// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Formatter, OutputStack, OutputNode, NodeMap, 
//            Mode, NamespaceMap, OutputElement, NodeException, 
//            OutputDocument, Format

class NodeWriter
{

    private final Set active;
    private final OutputStack stack;
    private final boolean verbose;
    private final Formatter writer;

    public NodeWriter(Writer writer1, Format format)
    {
        this(writer1, format, false);
    }

    private NodeWriter(Writer writer1, Format format, boolean flag)
    {
        writer = new Formatter(writer1, format);
        active = new HashSet();
        stack = new OutputStack(active);
        verbose = flag;
    }

    private void writeAttributes(OutputNode outputnode)
        throws Exception
    {
        NodeMap nodemap = outputnode.getAttributes();
        String s;
        String s1;
        Object obj;
        for (Iterator iterator = nodemap.iterator(); iterator.hasNext(); writer.writeAttribute(s, s1, ((String) (obj))))
        {
            s = (String)iterator.next();
            obj = (OutputNode)nodemap.get(s);
            s1 = ((OutputNode) (obj)).getValue();
            obj = ((OutputNode) (obj)).getPrefix(verbose);
        }

        active.remove(outputnode);
    }

    private void writeComment(OutputNode outputnode)
        throws Exception
    {
        outputnode = outputnode.getComment();
        if (outputnode != null)
        {
            writer.writeComment(outputnode);
        }
    }

    private void writeEnd(OutputNode outputnode)
        throws Exception
    {
        Mode mode = outputnode.getMode();
        Iterator iterator = stack.iterator();
        do
        {
            OutputNode outputnode1;
label0:
            {
                if (iterator.hasNext())
                {
                    outputnode1 = (OutputNode)iterator.next();
                    if (mode == Mode.INHERIT)
                    {
                        break label0;
                    }
                }
                writeEnd(outputnode, mode);
                return;
            }
            mode = outputnode1.getMode();
        } while (true);
    }

    private void writeEnd(OutputNode outputnode, Mode mode)
        throws Exception
    {
        String s = outputnode.getValue();
        if (s != null)
        {
            writer.writeText(s, mode);
        }
        mode = outputnode.getName();
        outputnode = outputnode.getPrefix(verbose);
        if (mode != null)
        {
            writer.writeEnd(mode, outputnode);
            writer.flush();
        }
    }

    private void writeName(OutputNode outputnode)
        throws Exception
    {
        String s = outputnode.getPrefix(verbose);
        outputnode = outputnode.getName();
        if (outputnode != null)
        {
            writer.writeStart(outputnode, s);
        }
    }

    private void writeNamespaces(OutputNode outputnode)
        throws Exception
    {
        outputnode = outputnode.getNamespaces();
        String s;
        String s1;
        for (Iterator iterator = outputnode.iterator(); iterator.hasNext(); writer.writeNamespace(s, s1))
        {
            s = (String)iterator.next();
            s1 = outputnode.getPrefix(s);
        }

    }

    private OutputNode writeStart(OutputNode outputnode, String s)
        throws Exception
    {
        outputnode = new OutputElement(outputnode, this, s);
        if (s == null)
        {
            throw new NodeException("Can not have a null name");
        } else
        {
            return stack.push(outputnode);
        }
    }

    private void writeStart(OutputNode outputnode)
        throws Exception
    {
        writeComment(outputnode);
        writeName(outputnode);
        writeAttributes(outputnode);
        writeNamespaces(outputnode);
    }

    public void commit(OutputNode outputnode)
        throws Exception
    {
        if (stack.contains(outputnode))
        {
            OutputNode outputnode1 = stack.top();
            if (!isCommitted(outputnode1))
            {
                writeStart(outputnode1);
            }
            for (; stack.top() != outputnode; writeEnd(stack.pop())) { }
            writeEnd(outputnode);
            stack.pop();
        }
    }

    public boolean isCommitted(OutputNode outputnode)
    {
        return !active.contains(outputnode);
    }

    public void remove(OutputNode outputnode)
        throws Exception
    {
        if (stack.top() != outputnode)
        {
            throw new NodeException("Cannot remove node");
        } else
        {
            stack.pop();
            return;
        }
    }

    public OutputNode writeElement(OutputNode outputnode, String s)
        throws Exception
    {
        if (stack.isEmpty())
        {
            return writeStart(outputnode, s);
        }
        if (stack.contains(outputnode))
        {
            OutputNode outputnode1 = stack.top();
            if (!isCommitted(outputnode1))
            {
                writeStart(outputnode1);
            }
            for (; stack.top() != outputnode; writeEnd(stack.pop())) { }
            return writeStart(outputnode, s);
        } else
        {
            return null;
        }
    }

    public OutputNode writeRoot()
        throws Exception
    {
        OutputDocument outputdocument = new OutputDocument(this, stack);
        if (stack.isEmpty())
        {
            writer.writeProlog();
        }
        return outputdocument;
    }
}
