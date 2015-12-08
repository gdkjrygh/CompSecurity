// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


// Referenced classes of package com.dominos.activities:
//            LandingActivity

class <init>
{

    final LandingActivity this$0;

    public void SpeechAction(final com.dominos.bus.events. actionEvent)
    {
        class _cls1
            implements Runnable
        {

            final LandingActivity.BusSubscriber this$1;
            final com.dominos.bus.events.SpeechEvents.SpeechActionEvent val$actionEvent;

            public void run()
            {
                LandingActivity._cls5.$SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[actionEvent.getActionType().ordinal()];
                JVM INSTR tableswitch 1 3: default 40
            //                           1 41
            //                           2 68
            //                           3 138;
                   goto _L1 _L2 _L3 _L4
_L1:
                return;
_L2:
                if (mProfileManager.isAuthorizedUser())
                {
                    showNoCachedAddressFragment();
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                App.editor().putString("orderMode", "Carryout").commit();
                mSpeechManager.preventNinaPause();
                StoreListActivity_.intent(this$0).start();
                if (LandingActivity.access$400(this$0))
                {
                    LandingActivity.access$502(this$0, true);
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
                App.editor().putString("orderMode", "Delivery").commit();
                mSpeechManager.preventNinaPause();
                onDeliverySelected();
                if (LandingActivity.access$400(this$0))
                {
                    LandingActivity.access$502(this$0, true);
                    return;
                }
                if (true) goto _L1; else goto _L5
_L5:
            }

            _cls1()
            {
                this$1 = LandingActivity.BusSubscriber.this;
                actionEvent = speechactionevent;
                super();
            }
        }

        runOnUiThread(new _cls1());
    }

    private ()
    {
        this$0 = LandingActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
