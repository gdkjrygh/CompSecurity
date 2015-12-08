// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;


public class Node
{

    Node next;
    final int type;
    final Object value;

    Node(int i, Object obj)
    {
        type = i;
        value = obj;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (!(obj instanceof Node))
            {
                return false;
            }
            obj = (Node)obj;
            if (type == ((Node) (obj)).type && (value == null ? ((Node) (obj)).value == null : value.equals(((Node) (obj)).value)))
            {
                break label0;
            } else
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (next == null) goto _L4; else goto _L3
_L3:
        if (next.equals(((Node) (obj)).next)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((Node) (obj)).next == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = type;
        int i;
        if (value != null)
        {
            i = value.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }

    String printNext()
    {
        if (next != null)
        {
            return (new StringBuilder()).append(" -> ").append(next).toString();
        } else
        {
            return "";
        }
    }

    public void setNext(Node node)
    {
        next = node;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        type;
        JVM INSTR tableswitch 0 0: default 32
    //                   0 55;
           goto _L1 _L2
_L1:
        stringbuffer.append(super.toString());
_L4:
        stringbuffer.append(printNext());
        return stringbuffer.toString();
_L2:
        stringbuffer.append((new StringBuilder()).append("LITERAL(").append(value).append(")").toString());
        if (true) goto _L4; else goto _L3
_L3:
    }
}
