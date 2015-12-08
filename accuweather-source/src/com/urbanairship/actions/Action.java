// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.actions:
//            ActionArguments, ActionResult, ActionActivity

public abstract class Action
{
    public static class ActivityResult
    {

        private Intent intent;
        private int resultCode;

        private void setResult(int i, Intent intent1)
        {
            resultCode = i;
            intent = intent1;
        }

        public Intent getIntent()
        {
            return intent;
        }

        public int getResultCode()
        {
            return resultCode;
        }


        public ActivityResult()
        {
            resultCode = 0;
        }
    }


    public Action()
    {
    }

    public boolean acceptsArguments(ActionArguments actionarguments)
    {
        return actionarguments != null && actionarguments.getSituation() != null;
    }

    public void onFinish(String s, ActionArguments actionarguments, ActionResult actionresult)
    {
    }

    public void onStart(String s, ActionArguments actionarguments)
    {
    }

    public abstract ActionResult perform(String s, ActionArguments actionarguments);

    final ActionResult run(String s, ActionArguments actionarguments)
    {
        if (actionarguments == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        if (acceptsArguments(actionarguments))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        Logger.info((new StringBuilder()).append("Action ").append(this).append(" is unable to accept arguments: ").append(actionarguments).toString());
        return ActionResult.newEmptyResultWithStatus(ActionResult.Status.REJECTED_ARGUMENTS);
        ActionResult actionresult1;
        onStart(s, actionarguments);
        actionresult1 = perform(s, actionarguments);
        ActionResult actionresult;
        actionresult = actionresult1;
        if (actionresult1 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        actionresult = ActionResult.newEmptyResult();
        onFinish(s, actionarguments, actionresult);
        return actionresult;
        s;
        Logger.error((new StringBuilder()).append("Action failed to run ").append(this).toString(), s);
        return ActionResult.newErrorResult(s);
    }

    public final ActivityResult startActivityForResult(Intent intent)
    {
        ActivityResult activityresult;
        Context context;
        ResultReceiver resultreceiver;
        activityresult = new ActivityResult();
        resultreceiver = new ResultReceiver(activityresult) {

            final Action this$0;
            final ActivityResult val$result;

            public void onReceiveResult(int i, Bundle bundle)
            {
                result.setResult(i, (Intent)bundle.getParcelable("com.urbanairship.actions.actionactivity.RESULT_INTENT_EXTRA"));
                synchronized (result)
                {
                    result.notify();
                }
                return;
                exception;
                bundle;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = Action.this;
                result = activityresult;
                super(final_handler);
            }
        };
        context = UAirship.getApplicationContext();
        intent = (new Intent(context, com/urbanairship/actions/ActionActivity)).addFlags(0x10000000).setPackage(UAirship.getPackageName()).putExtra("com.urbanairship.actions.START_ACTIVITY_INTENT_EXTRA", intent).putExtra("com.urbanairship.actions.actionactivity.RESULT_RECEIVER_EXTRA", resultreceiver);
        activityresult;
        JVM INSTR monitorenter ;
        context.startActivity(intent);
        activityresult.wait();
        activityresult;
        JVM INSTR monitorexit ;
        return activityresult;
        intent;
        Logger.error("Thread interrupted when waiting for result from activity.", intent);
        intent = new ActivityResult();
        activityresult;
        JVM INSTR monitorexit ;
        return intent;
        intent;
        activityresult;
        JVM INSTR monitorexit ;
        throw intent;
    }
}
