// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.joran.util.PropertySetter;
import fs.ch.qos.logback.core.util.AggregationType;
import java.util.Stack;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            ImplicitAction, IADataForBasicProperty

public class NestedBasicPropertyIA extends ImplicitAction
{

    Stack actionDataStack;

    public NestedBasicPropertyIA()
    {
        actionDataStack = new Stack();
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
    }

    public void body(InterpretationContext interpretationcontext, String s)
    {
        interpretationcontext = interpretationcontext.subst(s);
        s = (IADataForBasicProperty)actionDataStack.peek();
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$util$AggregationType[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$util$AggregationType = new int[AggregationType.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.NOT_FOUND.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[((IADataForBasicProperty) (s)).aggregationType.ordinal()])
        {
        default:
            return;

        case 4: // '\004'
            ((IADataForBasicProperty) (s)).parentBean.setProperty(((IADataForBasicProperty) (s)).propertyName, interpretationcontext);
            return;

        case 5: // '\005'
            ((IADataForBasicProperty) (s)).parentBean.addBasicProperty(((IADataForBasicProperty) (s)).propertyName, interpretationcontext);
            break;
        }
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
        actionDataStack.pop();
    }

    public boolean isApplicable(Pattern pattern, Attributes attributes, InterpretationContext interpretationcontext)
    {
        pattern = pattern.peekLast();
        if (!interpretationcontext.isEmpty()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        attributes = new PropertySetter(interpretationcontext.peekObject());
        attributes.setContext(context);
        interpretationcontext = attributes.computeAggregationType(pattern);
        switch (_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[interpretationcontext.ordinal()])
        {
        default:
            addError((new StringBuilder()).append("PropertySetter.canContainComponent returned ").append(interpretationcontext).toString());
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            break;

        case 4: // '\004'
        case 5: // '\005'
            pattern = new IADataForBasicProperty(attributes, interpretationcontext, pattern);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        actionDataStack.push(pattern);
        return true;
    }
}
