// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.UriUtils;

// Referenced classes of package com.urbanairship.actions:
//            Action, ActionArguments, Situation, ActionResult

public class OpenExternalUrlAction extends Action
{

    public static final String DEFAULT_REGISTRY_NAME = "open_external_url_action";
    public static final String DEFAULT_REGISTRY_SHORT_NAME = "^u";

    public OpenExternalUrlAction()
    {
    }

    public boolean acceptsArguments(ActionArguments actionarguments)
    {
        if (super.acceptsArguments(actionarguments))
        {
            static class _cls1
            {

                static final int $SwitchMap$com$urbanairship$actions$Situation[];

                static 
                {
                    $SwitchMap$com$urbanairship$actions$Situation = new int[Situation.values().length];
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.PUSH_OPENED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.WEB_VIEW_INVOCATION.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.MANUAL_INVOCATION.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$urbanairship$actions$Situation[Situation.FOREGROUND_NOTIFICATION_ACTION_BUTTON.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.urbanairship.actions.Situation[actionarguments.getSituation().ordinal()])
            {
            default:
                return false;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                break;
            }
            if (UriUtils.parse(actionarguments.getValue()) != null)
            {
                return true;
            }
        }
        return false;
    }

    public ActionResult perform(String s, ActionArguments actionarguments)
    {
        s = UriUtils.parse(actionarguments.getValue());
        Logger.info((new StringBuilder()).append("Opening ").append(s).toString());
        actionarguments = new Intent("android.intent.action.VIEW", s);
        actionarguments.addFlags(0x10000000);
        UAirship.getApplicationContext().startActivity(actionarguments);
        return ActionResult.newResult(s);
    }
}
