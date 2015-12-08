// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import android.os.Message;
import com.google.android.gms.common.util.state.IState;
import com.google.android.gms.common.util.state.State;
import com.google.android.gms.common.util.state.StateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            IStateMachine, MultiFileStateMachine, StateMachineMessage

final class this._cls0
    implements IStateMachine
{

    final MultiFileStateMachine this$0;

    public final void addState(State state)
    {
        com.google.android.gms.common.util.state.ccess._mth1300(mSmHandler, state, null);
    }

    public final void addState(State state, State state1)
    {
        com.google.android.gms.common.util.state.ccess._mth1300(mSmHandler, state, state1);
    }

    public final void deferMessage(Message message)
    {
        com.google.android.gms.common.util.state.ccess._mth1900(mSmHandler, message);
    }

    public final IState getCurrentState()
    {
        return MultiFileStateMachine.this.getCurrentState();
    }

    public final String getWhatToString(int i)
    {
        return MultiFileStateMachine.this.getWhatToString(i);
    }

    public final void logException(String s, Throwable throwable)
    {
        logAndAddLogRec((new StringBuilder()).append(s).append(" : ").append(throwable.toString()).toString());
    }

    public final void logNote(String s)
    {
        logAndAddLogRec(s);
    }

    public final void quit()
    {
        com.google.android.gms.common.util.state.achine._cls1 _lcls1 = mSmHandler;
        if (_lcls1 != null)
        {
            com.google.android.gms.common.util.state.ccess._mth2700(_lcls1);
        }
    }

    public final void sendMessage(StateMachineMessage statemachinemessage)
    {
        MultiFileStateMachine.this.sendMessage(statemachinemessage);
    }

    public final void sendMessageAtFrontOfQueue(StateMachineMessage statemachinemessage)
    {
        MultiFileStateMachine.this.sendMessageAtFrontOfQueue(statemachinemessage.getMessageId(), statemachinemessage);
    }

    public final void sendMessageDelayed(StateMachineMessage statemachinemessage, int i)
    {
        MultiFileStateMachine multifilestatemachine = MultiFileStateMachine.this;
        int j = statemachinemessage.getMessageId();
        long l = i;
        statemachinemessage = multifilestatemachine.obtainMessage(j, statemachinemessage);
        com.google.android.gms.common.util.state.achine achine = ((StateMachine) (multifilestatemachine)).mSmHandler;
        if (achine != null)
        {
            achine.endMessageDelayed(multifilestatemachine.wrapIfNeeded(statemachinemessage), l);
        }
    }

    public final void setInitialState(State state)
    {
        com.google.android.gms.common.util.state.ccess._mth1400(mSmHandler, state);
    }

    public final void transitionTo(IState istate)
    {
        com.google.android.gms.common.util.state.ccess._mth1700(mSmHandler, istate);
    }

    ()
    {
        this$0 = MultiFileStateMachine.this;
        super();
    }
}
