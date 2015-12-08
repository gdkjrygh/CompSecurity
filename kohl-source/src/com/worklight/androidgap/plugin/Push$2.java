// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.common.WLConfig;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;

// Referenced classes of package com.worklight.androidgap.plugin:
//            Push

class val.ctx
    implements Runnable
{

    final Push this$0;
    final String val$action;
    final JSONArray val$args;
    final CallbackContext val$ctx;

    public void run()
    {
        TION tion = TION.fromString(val$action);
        if (tion != null)
        {
            switch (.SwitchMap.com.worklight.androidgap.plugin.Push.ACTION[tion.ordinal()])
            {
            default:
                val$ctx.error((new StringBuilder()).append("Invalid action: ").append(val$action).toString());
                return;

            case 1: // '\001'
                Push.access$400(Push.this, val$args, val$ctx);
                return;

            case 2: // '\002'
                val$ctx.success();
                Push.access$500(Push.this, val$args);
                return;

            case 3: // '\003'
                val$ctx.success(Push.access$600(Push.this));
                return;

            case 4: // '\004'
                WLConfig.getInstance().setInitComplete(true);
                return;

            case 5: // '\005'
                Push.access$700(Push.this, val$args);
                break;
            }
            return;
        } else
        {
            val$ctx.error("Null action");
            return;
        }
    }

    TION()
    {
        this$0 = final_push;
        val$action = s;
        val$args = jsonarray;
        val$ctx = CallbackContext.this;
        super();
    }
}
