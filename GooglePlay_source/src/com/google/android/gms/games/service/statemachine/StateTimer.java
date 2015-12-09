// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;


// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            MessageTokenHelper, IStateMachine, MessageBase

public final class StateTimer
{
    private final class TimerMessage extends MessageBase
    {

        final StateTimer this$0;
        public final MessageTokenHelper.MessageToken timerToken;

        public TimerMessage(int i, MessageTokenHelper.MessageToken messagetoken)
        {
            this$0 = StateTimer.this;
            super(i);
            timerToken = messagetoken;
        }
    }


    final IStateMachine mOwnerStateMachine;
    final int mTimerMessageId;
    final MessageTokenHelper mToken = new MessageTokenHelper();

    public StateTimer(int i, IStateMachine istatemachine)
    {
        mTimerMessageId = i;
        mOwnerStateMachine = istatemachine;
    }
}
