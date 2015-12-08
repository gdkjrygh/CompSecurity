// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            StoreListActivity

class <init>
{

    final StoreListActivity this$0;

    public void storeSelectEvent(final com.dominos.bus.events.<init> actionEvent)
    {
        class _cls1
            implements Runnable
        {

            final StoreListActivity.BusSubscriber this$1;
            final com.dominos.bus.events.SpeechEvents.SpeechActionEvent val$actionEvent;

            public void run()
            {
                StoreListActivity._cls9.$SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[actionEvent.getActionType().ordinal()];
                JVM INSTR tableswitch 1 4: default 44
            //                           1 45
            //                           2 69
            //                           3 113
            //                           4 125;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                return;
_L2:
                StoreListActivity.access$700(this$0, Integer.valueOf(actionEvent.getData()).intValue());
                return;
_L3:
                if (!StoreListActivity.access$800(this$0))
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
                StoreListActivity.access$000(this$0, Integer.valueOf(actionEvent.getData()).intValue() - 1);
                return;
            }

            _cls1()
            {
                this$1 = StoreListActivity.BusSubscriber.this;
                actionEvent = speechactionevent;
                super();
            }
        }

        runOnUiThread(new _cls1());
    }

    private _cls1()
    {
        this$0 = StoreListActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
