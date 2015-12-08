// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;

import fs.ch.qos.logback.core.spi.PropertyContainer;
import fs.ch.qos.logback.core.spi.ScanException;
import fs.ch.qos.logback.core.util.OptionHelper;

// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Node, Parser, Tokenizer

public class NodeToStringTransformer
{

    final Node node;
    final PropertyContainer propertyContainer0;
    final PropertyContainer propertyContainer1;

    public NodeToStringTransformer(Node node1, PropertyContainer propertycontainer, PropertyContainer propertycontainer1)
    {
        node = node1;
        propertyContainer0 = propertycontainer;
        propertyContainer1 = propertycontainer1;
    }

    private void compileNode(Node node1, StringBuilder stringbuilder)
    {
_L2:
        if (node1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$subst$Node$Type[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type = new int[Node.Type.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.LITERAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.VARIABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ch.qos.logback.core.subst.Node.Type[node1.type.ordinal()])
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_53;
_L3:
        node1 = node1.next;
        if (true) goto _L2; else goto _L1
_L1:
        handleLiteral(node1, stringbuilder);
          goto _L3
        handleVariable(node1, stringbuilder);
          goto _L3
    }

    private void handleLiteral(Node node1, StringBuilder stringbuilder)
    {
        stringbuilder.append((String)node1.payload);
    }

    private void handleVariable(Node node1, StringBuilder stringbuilder)
    {
        Object obj = new StringBuilder();
        compileNode((Node)node1.payload, ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        String s = lookupKey(((String) (obj)));
        if (s != null)
        {
            stringbuilder.append(s);
            return;
        }
        if (node1.defaultPart == null)
        {
            stringbuilder.append((new StringBuilder()).append(((String) (obj))).append("_IS_UNDEFINED").toString());
            return;
        } else
        {
            node1 = (Node)node1.defaultPart;
            StringBuilder stringbuilder1 = new StringBuilder();
            compileNode(node1, stringbuilder1);
            stringbuilder.append(stringbuilder1.toString());
            return;
        }
    }

    private String lookupKey(String s)
    {
        String s1 = propertyContainer0.getProperty(s);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        return s1;
_L2:
        String s2;
        if (propertyContainer1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = propertyContainer1.getProperty(s);
        s1 = s2;
        if (s2 != null) goto _L1; else goto _L3
_L3:
        String s3 = OptionHelper.getSystemProperty(s, null);
        s1 = s3;
        if (s3 == null)
        {
            s = OptionHelper.getEnv(s);
            s1 = s;
            if (s == null)
            {
                return null;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static String substituteVariable(String s, PropertyContainer propertycontainer, PropertyContainer propertycontainer1)
        throws ScanException
    {
        return (new NodeToStringTransformer((new Parser((new Tokenizer(s)).tokenize())).parse(), propertycontainer, propertycontainer1)).transform();
    }

    public String transform()
    {
        StringBuilder stringbuilder = new StringBuilder();
        compileNode(node, stringbuilder);
        return stringbuilder.toString();
    }
}
