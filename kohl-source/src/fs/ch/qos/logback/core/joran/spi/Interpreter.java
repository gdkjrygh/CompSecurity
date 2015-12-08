// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.joran.action.ImplicitAction;
import fs.ch.qos.logback.core.joran.event.BodyEvent;
import fs.ch.qos.logback.core.joran.event.EndEvent;
import fs.ch.qos.logback.core.joran.event.StartEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            CAI_WithLocatorSupport, InterpretationContext, EventPlayer, ActionException, 
//            Pattern, RuleStore

public class Interpreter
{

    private static List EMPTY_LIST = new Vector(0);
    Stack actionListStack;
    private final CAI_WithLocatorSupport cai = new CAI_WithLocatorSupport(this);
    EventPlayer eventPlayer;
    private final ArrayList implicitActions = new ArrayList(3);
    private final InterpretationContext interpretationContext;
    Locator locator;
    private Pattern pattern;
    private final RuleStore ruleStore;
    Pattern skip;

    public Interpreter(Context context, RuleStore rulestore, Pattern pattern1)
    {
        skip = null;
        cai.setContext(context);
        ruleStore = rulestore;
        interpretationContext = new InterpretationContext(context, this);
        pattern = pattern1;
        actionListStack = new Stack();
        eventPlayer = new EventPlayer(this);
    }

    private void callBodyAction(List list, String s)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Action action = (Action)list.next();
                try
                {
                    action.body(interpretationContext, s);
                }
                catch (ActionException actionexception)
                {
                    cai.addError((new StringBuilder()).append("Exception in end() methd for action [").append(action).append("]").toString(), actionexception);
                }
            }
        }
    }

    private void callEndAction(List list, String s)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Action action = (Action)list.next();
                try
                {
                    action.end(interpretationContext, s);
                }
                catch (ActionException actionexception)
                {
                    cai.addError((new StringBuilder()).append("ActionException in Action for tag [").append(s).append("]").toString(), actionexception);
                }
                catch (RuntimeException runtimeexception)
                {
                    cai.addError((new StringBuilder()).append("RuntimeException in Action for tag [").append(s).append("]").toString(), runtimeexception);
                }
            }
        }
    }

    private void endElement(String s, String s1, String s2)
    {
        s = (List)actionListStack.pop();
        if (skip == null) goto _L2; else goto _L1
_L1:
        if (skip.equals(pattern))
        {
            skip = null;
        }
_L4:
        pattern.pop();
        return;
_L2:
        if (s != EMPTY_LIST)
        {
            callEndAction(s, getTagName(s1, s2));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void pushEmptyActionList()
    {
        actionListStack.add(EMPTY_LIST);
    }

    private void startElement(String s, String s1, String s2, Attributes attributes)
    {
        s = getTagName(s1, s2);
        pattern.push(s);
        if (skip != null)
        {
            pushEmptyActionList();
            return;
        }
        s1 = getApplicableActionList(pattern, attributes);
        if (s1 != null)
        {
            actionListStack.add(s1);
            callBeginAction(s1, s, attributes);
            return;
        } else
        {
            pushEmptyActionList();
            s = (new StringBuilder()).append("no applicable action for [").append(s).append("], current pattern is [").append(pattern).append("]").toString();
            cai.addError(s);
            return;
        }
    }

    public void addImplicitAction(ImplicitAction implicitaction)
    {
        implicitActions.add(implicitaction);
    }

    void callBeginAction(List list, String s, Attributes attributes)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Action action = (Action)list.next();
                try
                {
                    action.begin(interpretationContext, s, attributes);
                }
                catch (ActionException actionexception)
                {
                    skip = (Pattern)pattern.clone();
                    cai.addError((new StringBuilder()).append("ActionException in Action for tag [").append(s).append("]").toString(), actionexception);
                }
                catch (RuntimeException runtimeexception)
                {
                    skip = (Pattern)pattern.clone();
                    cai.addError((new StringBuilder()).append("RuntimeException in Action for tag [").append(s).append("]").toString(), runtimeexception);
                }
            }
        }
    }

    public void characters(BodyEvent bodyevent)
    {
        setDocumentLocator(bodyevent.locator);
        String s = bodyevent.getText();
        bodyevent = (List)actionListStack.peek();
        if (s != null)
        {
            s = s.trim();
            if (s.length() > 0)
            {
                callBodyAction(bodyevent, s);
            }
        }
    }

    public void endElement(EndEvent endevent)
    {
        setDocumentLocator(endevent.locator);
        endElement(endevent.namespaceURI, endevent.localName, endevent.qName);
    }

    List getApplicableActionList(Pattern pattern1, Attributes attributes)
    {
        List list1 = ruleStore.matchActions(pattern1);
        List list = list1;
        if (list1 == null)
        {
            list = lookupImplicitAction(pattern1, attributes, interpretationContext);
        }
        return list;
    }

    public EventPlayer getEventPlayer()
    {
        return eventPlayer;
    }

    public InterpretationContext getInterpretationContext()
    {
        return interpretationContext;
    }

    public Locator getLocator()
    {
        return locator;
    }

    public RuleStore getRuleStore()
    {
        return ruleStore;
    }

    String getTagName(String s, String s1)
    {
        String s2;
label0:
        {
            if (s != null)
            {
                s2 = s;
                if (s.length() >= 1)
                {
                    break label0;
                }
            }
            s2 = s1;
        }
        return s2;
    }

    List lookupImplicitAction(Pattern pattern1, Attributes attributes, InterpretationContext interpretationcontext)
    {
        int j = implicitActions.size();
        for (int i = 0; i < j; i++)
        {
            ImplicitAction implicitaction = (ImplicitAction)implicitActions.get(i);
            if (implicitaction.isApplicable(pattern1, attributes, interpretationcontext))
            {
                pattern1 = new ArrayList(1);
                pattern1.add(implicitaction);
                return pattern1;
            }
        }

        return null;
    }

    public void setDocumentLocator(Locator locator1)
    {
        locator = locator1;
    }

    public void setInterpretationContextPropertiesMap(Map map)
    {
        interpretationContext.setPropertiesMap(map);
    }

    public void startElement(StartEvent startevent)
    {
        setDocumentLocator(startevent.getLocator());
        startElement(startevent.namespaceURI, startevent.localName, startevent.qName, startevent.attributes);
    }

}
