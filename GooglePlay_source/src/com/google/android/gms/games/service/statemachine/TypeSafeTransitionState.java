// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.state.State;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            IStateMachine, StateTimer, MessageTokenHelper

public abstract class TypeSafeTransitionState
{

    public static boolean HANDLED = true;
    public static boolean NOT_HANDLED = false;
    protected final IStateMachine mSm;
    private final State mState = new State() {

        final TypeSafeTransitionState this$0;

        public final void enter()
        {
            if (mTimerMap != null)
            {
                int i = 0;
                for (int j = mTimerMap.size(); i < j; i++)
                {
                    ((StateTimer)mTimerMap.valueAt(i)).mToken.getToken();
                }

            }
            TypeSafeTransitionState.this.enter();
        }

        public final void exit()
        {
            TypeSafeTransitionState.this.exit();
        }

        public final String getName()
        {
            return getClass().getSimpleName();
        }

        public final boolean processMessage(Message message)
        {
            if (mTimerMap != null)
            {
                StateTimer statetimer = (StateTimer)mTimerMap.get(message.what);
                if (statetimer != null)
                {
                    StateTimer.TimerMessage timermessage = (StateTimer.TimerMessage)message.obj;
                    boolean flag;
                    if (timermessage.this$0.equals(statetimer) && timermessage.timerToken.isValid())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        mSm.logNote("Old timer -- ignoring");
                        return true;
                    }
                }
            }
            return TypeSafeTransitionState.this.processMessage(message);
        }

            
            {
                this$0 = TypeSafeTransitionState.this;
                super();
            }
    };
    SparseArray mTimerMap;

    public TypeSafeTransitionState(IStateMachine istatemachine)
    {
        mSm = istatemachine;
    }

    public final void addState()
    {
        mSm.addState(mState);
    }

    public final void addState(TypeSafeTransitionState typesafetransitionstate)
    {
        Preconditions.checkNotNull(typesafetransitionstate.mState);
        mSm.addState(mState, typesafetransitionstate.mState);
    }

    public void enter()
    {
    }

    public void exit()
    {
    }

    public boolean processMessage(Message message)
    {
        return false;
    }

    public final void setInitialState()
    {
        mSm.setInitialState(mState);
    }

    public final void setTimer(int i, int j, TimeUnit timeunit)
    {
        if (mTimerMap == null)
        {
            mTimerMap = new SparseArray();
        }
        StateTimer statetimer1 = (StateTimer)mTimerMap.get(i);
        StateTimer statetimer = statetimer1;
        if (statetimer1 == null)
        {
            statetimer = new StateTimer(i, mSm);
            mTimerMap.put(i, statetimer);
        }
        long l = timeunit.toMillis(j);
        boolean flag;
        if (l >= 0L && l <= 0x7fffffffL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        statetimer.mOwnerStateMachine.sendMessageDelayed(new StateTimer.TimerMessage(statetimer, statetimer.mTimerMessageId, statetimer.mToken.getToken()), (int)l);
    }

    public String toString()
    {
        return mState.getName();
    }

    public final void transitionToState()
    {
        mSm.transitionTo(mState);
    }

}
