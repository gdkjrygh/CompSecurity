// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.spi.PropertyDefiner;
import fs.ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action, ActionUtil

public class DefinePropertyAction extends Action
{

    PropertyDefiner definer;
    boolean inError;
    String propertyName;
    ActionUtil.Scope scope;
    String scopeStr;

    public DefinePropertyAction()
    {
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        scopeStr = null;
        scope = null;
        propertyName = null;
        definer = null;
        inError = false;
        propertyName = attributes.getValue("name");
        scopeStr = attributes.getValue("scope");
        scope = ActionUtil.stringToScope(scopeStr);
        if (OptionHelper.isEmpty(propertyName))
        {
            addError((new StringBuilder()).append("Missing property name for property definer. Near [").append(s).append("] line ").append(getLineNumber(interpretationcontext)).toString());
            inError = true;
            return;
        }
        attributes = attributes.getValue("class");
        if (OptionHelper.isEmpty(attributes))
        {
            addError((new StringBuilder()).append("Missing class name for property definer. Near [").append(s).append("] line ").append(getLineNumber(interpretationcontext)).toString());
            inError = true;
            return;
        }
        try
        {
            addInfo((new StringBuilder()).append("About to instantiate property definer of type [").append(attributes).append("]").toString());
            definer = (PropertyDefiner)OptionHelper.instantiateByClassName(attributes, fs/ch/qos/logback/core/spi/PropertyDefiner, context);
            definer.setContext(context);
            if (definer instanceof LifeCycle)
            {
                ((LifeCycle)definer).start();
            }
            interpretationcontext.pushObject(definer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InterpretationContext interpretationcontext)
        {
            inError = true;
        }
        addError((new StringBuilder()).append("Could not create an PropertyDefiner of type [").append(attributes).append("].").toString(), interpretationcontext);
        throw new ActionException(interpretationcontext);
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
        if (!inError)
        {
            if (interpretationcontext.peekObject() != definer)
            {
                addWarn((new StringBuilder()).append("The object at the of the stack is not the property definer for property named [").append(propertyName).append("] pushed earlier.").toString());
                return;
            }
            addInfo((new StringBuilder()).append("Popping property definer for property named [").append(propertyName).append("] from the object stack").toString());
            interpretationcontext.popObject();
            s = definer.getPropertyValue();
            if (s != null)
            {
                ActionUtil.setProperty(interpretationcontext, propertyName, s, scope);
                return;
            }
        }
    }
}
