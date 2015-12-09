// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.nina.dialog.agent.CarryoutLoadGuard;
import com.dominos.nina.speech.SpeechContext;

// Referenced classes of package com.dominos.activities:
//            StoreListActivity

class val.actionEvent
    implements Runnable
{

    final Data this$1;
    final com.dominos.bus.events.Data val$actionEvent;

    public void run()
    {
        .dominos.bus.events.SpeechEvents.ActionType[val$actionEvent.ActionType().ActionType()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 45
    //                   2 69
    //                   3 113
    //                   4 125;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        StoreListActivity.access$700(_fld0, Integer.valueOf(val$actionEvent.Data()).intValue());
        return;
_L3:
        if (!StoreListActivity.access$800(_fld0))
        {
            SpeechContext.updateAgents(new String[] {
                CarryoutLoadGuard.NAME, "DONE"
            });
            LogUtil.d("OLO.StoreListActivity", "CarryoutLoadGuard set as DONE", new Object[0]);
            return;
        }
          goto _L1
_L4:
        showLocations(null);
        return;
_L5:
        StoreListActivity.access$000(_fld0, Integer.valueOf(val$actionEvent.Data()).intValue() - 1);
        return;
    }

    ()
    {
        this$1 = final_;
        val$actionEvent = com.dominos.bus.events.val.actionEvent.this;
        super();
    }
}
