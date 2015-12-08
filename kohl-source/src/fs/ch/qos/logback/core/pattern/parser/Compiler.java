// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;

import fs.ch.qos.logback.core.pattern.CompositeConverter;
import fs.ch.qos.logback.core.pattern.Converter;
import fs.ch.qos.logback.core.pattern.DynamicConverter;
import fs.ch.qos.logback.core.pattern.LiteralConverter;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.status.ErrorStatus;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            Node, CompositeNode, SimpleKeywordNode

class Compiler extends ContextAwareBase
{

    final Map converterMap;
    Converter head;
    Converter tail;
    final Node top;

    Compiler(Node node, Map map)
    {
        top = node;
        converterMap = map;
    }

    private void addToList(Converter converter)
    {
        if (head == null)
        {
            tail = converter;
            head = converter;
            return;
        } else
        {
            tail.setNext(converter);
            tail = converter;
            return;
        }
    }

    Converter compile()
    {
        Node node;
        tail = null;
        head = null;
        node = top;
_L6:
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        node.type;
        JVM INSTR tableswitch 0 2: default 48
    //                   0 56
    //                   1 220
    //                   2 77;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_220;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        node = node.next;
        if (true) goto _L6; else goto _L5
_L5:
        addToList(new LiteralConverter((String)node.getValue()));
          goto _L7
_L4:
        Object obj = (CompositeNode)node;
        CompositeConverter compositeconverter = createCompositeConverter(((CompositeNode) (obj)));
        if (compositeconverter == null)
        {
            addError((new StringBuilder()).append("Failed to create converter for [%").append(((CompositeNode) (obj)).getValue()).append("] keyword").toString());
            addToList(new LiteralConverter((new StringBuilder()).append("%PARSER_ERROR[").append(((CompositeNode) (obj)).getValue()).append("]").toString()));
        } else
        {
            compositeconverter.setFormattingInfo(((CompositeNode) (obj)).getFormatInfo());
            compositeconverter.setOptionList(((CompositeNode) (obj)).getOptions());
            obj = new Compiler(((CompositeNode) (obj)).getChildNode(), converterMap);
            ((Compiler) (obj)).setContext(context);
            compositeconverter.setChildConverter(((Compiler) (obj)).compile());
            addToList(compositeconverter);
        }
          goto _L7
        SimpleKeywordNode simplekeywordnode = (SimpleKeywordNode)node;
        DynamicConverter dynamicconverter = createConverter(simplekeywordnode);
        if (dynamicconverter != null)
        {
            dynamicconverter.setFormattingInfo(simplekeywordnode.getFormatInfo());
            dynamicconverter.setOptionList(simplekeywordnode.getOptions());
            addToList(dynamicconverter);
        } else
        {
            LiteralConverter literalconverter = new LiteralConverter((new StringBuilder()).append("%PARSER_ERROR[").append(simplekeywordnode.getValue()).append("]").toString());
            addStatus(new ErrorStatus((new StringBuilder()).append("[").append(simplekeywordnode.getValue()).append("] is not a valid conversion word").toString(), this));
            addToList(literalconverter);
        }
          goto _L7
        return head;
    }

    CompositeConverter createCompositeConverter(CompositeNode compositenode)
    {
        compositenode = (String)compositenode.getValue();
        String s = (String)converterMap.get(compositenode);
        if (s != null)
        {
            CompositeConverter compositeconverter;
            try
            {
                compositeconverter = (CompositeConverter)OptionHelper.instantiateByClassName(s, fs/ch/qos/logback/core/pattern/CompositeConverter, context);
            }
            catch (Exception exception)
            {
                addError((new StringBuilder()).append("Failed to instantiate converter class [").append(s).append("] as a composite converter for keyword [").append(compositenode).append("]").toString(), exception);
                return null;
            }
            return compositeconverter;
        } else
        {
            addError((new StringBuilder()).append("There is no conversion class registered for composite conversion word [").append(compositenode).append("]").toString());
            return null;
        }
    }

    DynamicConverter createConverter(SimpleKeywordNode simplekeywordnode)
    {
        simplekeywordnode = (String)simplekeywordnode.getValue();
        String s = (String)converterMap.get(simplekeywordnode);
        if (s != null)
        {
            DynamicConverter dynamicconverter;
            try
            {
                dynamicconverter = (DynamicConverter)OptionHelper.instantiateByClassName(s, fs/ch/qos/logback/core/pattern/DynamicConverter, context);
            }
            catch (Exception exception)
            {
                addError((new StringBuilder()).append("Failed to instantiate converter class [").append(s).append("] for keyword [").append(simplekeywordnode).append("]").toString(), exception);
                return null;
            }
            return dynamicconverter;
        } else
        {
            addError((new StringBuilder()).append("There is no conversion class registered for conversion word [").append(simplekeywordnode).append("]").toString());
            return null;
        }
    }
}
