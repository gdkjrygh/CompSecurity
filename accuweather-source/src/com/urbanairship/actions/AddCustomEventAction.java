// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import com.urbanairship.Logger;
import com.urbanairship.push.PushMessage;
import com.urbanairship.richpush.RichPushMessage;
import java.util.Map;

// Referenced classes of package com.urbanairship.actions:
//            Action, ActionArguments, ActionResult

public class AddCustomEventAction extends Action
{

    public static final String DEFAULT_REGISTRY_NAME = "add_custom_event_action";

    public AddCustomEventAction()
    {
    }

    private String parseStringFromMap(Map map, String s)
    {
        map = ((Map) (map.get(s)));
        if (map != null)
        {
            return String.valueOf(map);
        } else
        {
            return null;
        }
    }

    public boolean acceptsArguments(ActionArguments actionarguments)
    {
        if (!super.acceptsArguments(actionarguments))
        {
            return false;
        }
        if (actionarguments.getValue() instanceof Map)
        {
            if (((Map)actionarguments.getValue()).get("event_name") == null)
            {
                Logger.debug("CustomEventAction requires an event name in the event data.");
                return false;
            } else
            {
                return true;
            }
        } else
        {
            Logger.debug("CustomEventAction requires a map of event data.");
            return false;
        }
    }

    public ActionResult perform(String s, ActionArguments actionarguments)
    {
        Object obj1 = (Map)actionarguments.getValue();
        Object obj = parseStringFromMap(((Map) (obj1)), "event_name");
        String s1 = parseStringFromMap(((Map) (obj1)), "event_value");
        String s2 = parseStringFromMap(((Map) (obj1)), "transaction_id");
        s = parseStringFromMap(((Map) (obj1)), "interaction_type");
        obj1 = parseStringFromMap(((Map) (obj1)), "interaction_id");
        obj = (new com.urbanairship.analytics.CustomEvent.Builder(((String) (obj)))).setEventValue(s1).setTransactionId(s2).setInteraction(s, ((String) (obj1))).setAttribution((PushMessage)actionarguments.getMetadata("com.urbanairship.PUSH_MESSAGE"));
        if (obj1 == null && s == null)
        {
            s = (RichPushMessage)actionarguments.getMetadata("com.urbanairship.RICH_PUSH_METADATA");
            if (s != null)
            {
                ((com.urbanairship.analytics.CustomEvent.Builder) (obj)).setInteraction(s);
            }
        }
        ((com.urbanairship.analytics.CustomEvent.Builder) (obj)).addEvent();
        return ActionResult.newEmptyResult();
    }
}
