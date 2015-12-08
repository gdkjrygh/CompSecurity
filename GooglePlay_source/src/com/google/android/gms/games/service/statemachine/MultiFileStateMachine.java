// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.state.IState;
import com.google.android.gms.common.util.state.State;
import com.google.android.gms.common.util.state.StateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            StateMachineMessage, IStateMachine

public abstract class MultiFileStateMachine extends StateMachine
{

    public Object mData;
    public final IStateMachine mStateMachine = new IStateMachine() {

        final MultiFileStateMachine this$0;

        public final void addState(State state)
        {
            com.google.android.gms.common.util.state.StateMachine.SmHandler.access$1300(mSmHandler, state, null);
        }

        public final void addState(State state, State state1)
        {
            com.google.android.gms.common.util.state.StateMachine.SmHandler.access$1300(mSmHandler, state, state1);
        }

        public final void deferMessage(Message message)
        {
            com.google.android.gms.common.util.state.StateMachine.SmHandler.access$1900(mSmHandler, message);
        }

        public final IState getCurrentState()
        {
            return MultiFileStateMachine.this.getCurrentState();
        }

        public final String getWhatToString(int i)
        {
            return MultiFileStateMachine.this.getWhatToString(i);
        }

        public final void logException(String s1, Throwable throwable)
        {
            logAndAddLogRec((new StringBuilder()).append(s1).append(" : ").append(throwable.toString()).toString());
        }

        public final void logNote(String s1)
        {
            logAndAddLogRec(s1);
        }

        public final void quit()
        {
            com.google.android.gms.common.util.state.StateMachine.SmHandler smhandler = mSmHandler;
            if (smhandler != null)
            {
                com.google.android.gms.common.util.state.StateMachine.SmHandler.access$2700(smhandler);
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
            com.google.android.gms.common.util.state.StateMachine.SmHandler smhandler = ((StateMachine) (multifilestatemachine)).mSmHandler;
            if (smhandler != null)
            {
                smhandler.sendMessageDelayed(multifilestatemachine.wrapIfNeeded(statemachinemessage), l);
            }
        }

        public final void setInitialState(State state)
        {
            com.google.android.gms.common.util.state.StateMachine.SmHandler.access$1400(mSmHandler, state);
        }

        public final void transitionTo(IState istate)
        {
            com.google.android.gms.common.util.state.StateMachine.SmHandler.access$1700(mSmHandler, istate);
        }

            
            {
                this$0 = MultiFileStateMachine.this;
                super();
            }
    };
    public Object mStates;

    public MultiFileStateMachine(String s)
    {
        super(s);
    }

    public final void sendMessage(StateMachineMessage statemachinemessage)
    {
        sendMessage(statemachinemessage.getMessageId(), statemachinemessage);
    }

    public final Object setupStates(Object obj)
    {
        Preconditions.checkNotNull(mData);
        mStates = obj;
        return mStates;
    }
}
