// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.JSONUtils;
import com.urbanairship.util.UAStringUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.actions:
//            ActionRunner, Situation, ActionCompletionCallback, ActionResult

public class ActionService extends Service
{

    public static final String ACTION_RUN_ACTIONS = "com.urbanairship.actionservice.ACTION_RUN_ACTIONS";
    public static final String EXTRA_ACTIONS_PAYLOAD = "com.urbanairship.actionservice.EXTRA_ACTIONS_PAYLOAD";
    public static final String EXTRA_PUSH_BUNDLE = "com.urbanairship.actionservice.EXTRA_PUSH_BUNDLE";
    public static final String EXTRA_SITUATION = "com.urbanairship.actionservice.EXTRA_SITUATION";
    private int lastStartId;
    private ActionRunner runner;
    private int runningActions;

    public ActionService()
    {
        this(ActionRunner.shared());
    }

    ActionService(ActionRunner actionrunner)
    {
        lastStartId = 0;
        runningActions = 0;
        runner = actionrunner;
    }

    private void runActions(String s, Situation situation, PushMessage pushmessage)
    {
        if (situation != null) goto _L2; else goto _L1
_L1:
        Logger.error("Unable to run actions with a null situation");
_L4:
        return;
_L2:
        if (UAStringUtil.isEmpty(s))
        {
            Logger.info("No actions to run.");
            return;
        }
        Object obj;
        try
        {
            obj = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (Situation situation)
        {
            Logger.info((new StringBuilder()).append("Invalid actions payload: ").append(s).toString());
            return;
        }
        s = JSONUtils.convertToMap(((JSONObject) (obj)));
        obj = s.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s1 = (String)((Iterator) (obj)).next();
            ActionArguments actionarguments = (new ActionArguments.Builder()).setSituation(situation).setValue(s.get(s1)).addMetadata("com.urbanairship.PUSH_MESSAGE", pushmessage).create();
            runningActions = runningActions + 1;
            runner.runAction(s1, actionarguments, new ActionCompletionCallback() );
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void runActionsPayload(Context context, String s, Situation situation)
    {
        runActionsPayload(context, s, situation, null);
    }

    public static void runActionsPayload(Context context, String s, Situation situation, PushMessage pushmessage)
    {
        if (UAStringUtil.isEmpty(s))
        {
            Logger.info("No actions to run in payload.");
            return;
        }
        s = (new Intent("com.urbanairship.actionservice.ACTION_RUN_ACTIONS")).setClass(context, com/urbanairship/actions/ActionService).putExtra("com.urbanairship.actionservice.EXTRA_ACTIONS_PAYLOAD", s).putExtra("com.urbanairship.actionservice.EXTRA_SITUATION", situation);
        if (pushmessage != null)
        {
            s.putExtra("com.urbanairship.actionservice.EXTRA_PUSH_BUNDLE", pushmessage.getPushBundle());
        }
        context.startService(s);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Autopilot.automaticTakeOff((Application)getApplicationContext());
        lastStartId = j;
        if (intent != null && "com.urbanairship.actionservice.ACTION_RUN_ACTIONS".equals(intent.getAction()))
        {
            String s = intent.getStringExtra("com.urbanairship.actionservice.EXTRA_ACTIONS_PAYLOAD");
            Situation situation = (Situation)intent.getSerializableExtra("com.urbanairship.actionservice.EXTRA_SITUATION");
            intent = intent.getBundleExtra("com.urbanairship.actionservice.EXTRA_PUSH_BUNDLE");
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = new PushMessage(intent);
            }
            runActions(s, situation, intent);
        }
        if (runningActions == 0)
        {
            stopSelf(j);
        }
        return 2;
    }



/*
    static int access$010(ActionService actionservice)
    {
        int i = actionservice.runningActions;
        actionservice.runningActions = i - 1;
        return i;
    }

*/

}
