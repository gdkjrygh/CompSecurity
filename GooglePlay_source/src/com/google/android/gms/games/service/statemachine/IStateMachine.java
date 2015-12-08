// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import android.os.Message;
import com.google.android.gms.common.util.state.IState;
import com.google.android.gms.common.util.state.State;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            StateMachineMessage

public interface IStateMachine
{

    public abstract void addState(State state);

    public abstract void addState(State state, State state1);

    public abstract void deferMessage(Message message);

    public abstract IState getCurrentState();

    public abstract String getWhatToString(int i);

    public abstract void logException(String s, Throwable throwable);

    public abstract void logNote(String s);

    public abstract void quit();

    public abstract void sendMessage(StateMachineMessage statemachinemessage);

    public abstract void sendMessageAtFrontOfQueue(StateMachineMessage statemachinemessage);

    public abstract void sendMessageDelayed(StateMachineMessage statemachinemessage, int i);

    public abstract void setInitialState(State state);

    public abstract void transitionTo(IState istate);
}
