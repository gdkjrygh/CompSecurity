// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            InputStack, EventNode, InputElement, InputNode, 
//            EventReader, NodeException

class NodeReader
{

    private final EventReader reader;
    private final InputStack stack = new InputStack();

    public NodeReader(EventReader eventreader)
    {
        reader = eventreader;
    }

    private boolean isName(EventNode eventnode, String s)
    {
        eventnode = eventnode.getName();
        if (eventnode == null)
        {
            return false;
        } else
        {
            return eventnode.equals(s);
        }
    }

    private InputNode readStart(InputNode inputnode, EventNode eventnode)
        throws Exception
    {
        inputnode = new InputElement(inputnode, this, eventnode);
        if (eventnode.isStart())
        {
            return (InputNode)stack.push(inputnode);
        } else
        {
            return inputnode;
        }
    }

    public boolean isEmpty(InputNode inputnode)
        throws Exception
    {
        return stack.top() == inputnode && reader.peek().isEnd();
    }

    public InputNode readElement(InputNode inputnode)
        throws Exception
    {
        if (stack.isRelevant(inputnode)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        EventNode eventnode = reader.next();
_L5:
        if (eventnode == null) goto _L1; else goto _L3
_L3:
        if (!eventnode.isEnd())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (stack.pop() == inputnode) goto _L1; else goto _L4
_L4:
        eventnode = reader.next();
          goto _L5
        if (eventnode.isStart())
        {
            return readStart(inputnode, eventnode);
        }
          goto _L4
    }

    public InputNode readElement(InputNode inputnode, String s)
        throws Exception
    {
        if (stack.isRelevant(inputnode)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        EventNode eventnode = reader.peek();
_L4:
        if (eventnode == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!eventnode.isEnd())
        {
            break; /* Loop/switch isn't completed */
        }
        if (stack.top() == inputnode)
        {
            continue; /* Loop/switch isn't completed */
        }
        stack.pop();
_L6:
        reader.next();
        eventnode = reader.peek();
        if (true) goto _L4; else goto _L3
_L3:
        if (!eventnode.isStart()) goto _L6; else goto _L5
_L5:
        if (isName(eventnode, s))
        {
            return readElement(inputnode);
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public InputNode readRoot()
        throws Exception
    {
        InputNode inputnode = null;
        if (stack.isEmpty())
        {
            InputNode inputnode1 = readElement(null);
            inputnode = inputnode1;
            if (inputnode1 == null)
            {
                throw new NodeException("Document has no root element");
            }
        }
        return inputnode;
    }

    public String readValue(InputNode inputnode)
        throws Exception
    {
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            EventNode eventnode;
label0:
            {
label1:
                {
                    if (stack.top() == inputnode)
                    {
                        eventnode = reader.peek();
                        if (eventnode.isText())
                        {
                            break label0;
                        }
                        if (stringbuilder.length() != 0)
                        {
                            break label1;
                        }
                    }
                    return null;
                }
                return stringbuilder.toString();
            }
            stringbuilder.append(eventnode.getValue());
            reader.next();
        } while (true);
    }

    public void skipElement(InputNode inputnode)
        throws Exception
    {
        while (readElement(inputnode) != null) ;
    }
}
