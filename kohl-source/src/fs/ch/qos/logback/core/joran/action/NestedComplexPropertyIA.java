// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import fs.ch.qos.logback.core.joran.spi.Pattern;
import fs.ch.qos.logback.core.joran.util.PropertySetter;
import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.util.AggregationType;
import fs.ch.qos.logback.core.util.Loader;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.Stack;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            ImplicitAction, IADataForComplexProperty

public class NestedComplexPropertyIA extends ImplicitAction
{

    Stack actionDataStack;

    public NestedComplexPropertyIA()
    {
        actionDataStack = new Stack();
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        IADataForComplexProperty iadataforcomplexproperty;
        String s1;
        iadataforcomplexproperty = (IADataForComplexProperty)actionDataStack.peek();
        s1 = interpretationcontext.subst(attributes.getValue("class"));
        if (OptionHelper.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        attributes = Loader.loadClass(s1, context);
_L1:
        if (attributes == null)
        {
            try
            {
                iadataforcomplexproperty.inError = true;
                addError((new StringBuilder()).append("Could not find an appropriate class for property [").append(s).append("]").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InterpretationContext interpretationcontext)
            {
                iadataforcomplexproperty.inError = true;
            }
            break MISSING_BLOCK_LABEL_211;
        }
        break MISSING_BLOCK_LABEL_109;
        attributes = iadataforcomplexproperty.parentBean.getClassNameViaImplicitRules(iadataforcomplexproperty.getComplexPropertyName(), iadataforcomplexproperty.getAggregationType(), interpretationcontext.getDefaultNestedComponentRegistry());
          goto _L1
        if (OptionHelper.isEmpty(s1))
        {
            addInfo((new StringBuilder()).append("Assuming default type [").append(attributes.getName()).append("] for [").append(s).append("] property").toString());
        }
        iadataforcomplexproperty.setNestedComplexProperty(attributes.newInstance());
        if (iadataforcomplexproperty.getNestedComplexProperty() instanceof ContextAware)
        {
            ((ContextAware)iadataforcomplexproperty.getNestedComplexProperty()).setContext(context);
        }
        interpretationcontext.pushObject(iadataforcomplexproperty.getNestedComplexProperty());
        return;
        addError((new StringBuilder()).append("Could not create component [").append(s).append("] of type [").append(s1).append("]").toString(), interpretationcontext);
        return;
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
        IADataForComplexProperty iadataforcomplexproperty = (IADataForComplexProperty)actionDataStack.pop();
        if (iadataforcomplexproperty.inError)
        {
            return;
        }
        Object obj = new PropertySetter(iadataforcomplexproperty.getNestedComplexProperty());
        ((PropertySetter) (obj)).setContext(context);
        if (((PropertySetter) (obj)).computeAggregationType("parent") == AggregationType.AS_COMPLEX_PROPERTY)
        {
            ((PropertySetter) (obj)).setComplexProperty("parent", iadataforcomplexproperty.parentBean.getObj());
        }
        obj = iadataforcomplexproperty.getNestedComplexProperty();
        if ((obj instanceof LifeCycle) && NoAutoStartUtil.notMarkedWithNoAutoStart(obj))
        {
            ((LifeCycle)obj).start();
        }
        if (interpretationcontext.peekObject() != iadataforcomplexproperty.getNestedComplexProperty())
        {
            addError("The object on the top the of the stack is not the component pushed earlier.");
            return;
        }
        interpretationcontext.popObject();
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
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[iadataforcomplexproperty.aggregationType.ordinal()])
        {
        default:
            return;

        case 4: // '\004'
            iadataforcomplexproperty.parentBean.addComplexProperty(s, iadataforcomplexproperty.getNestedComplexProperty());
            return;

        case 5: // '\005'
            iadataforcomplexproperty.parentBean.setComplexProperty(s, iadataforcomplexproperty.getNestedComplexProperty());
            break;
        }
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
            addError((new StringBuilder()).append("PropertySetter.computeAggregationType returned ").append(interpretationcontext).toString());
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            break;

        case 4: // '\004'
        case 5: // '\005'
            pattern = new IADataForComplexProperty(attributes, interpretationcontext, pattern);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        actionDataStack.push(pattern);
        return true;
    }
}
