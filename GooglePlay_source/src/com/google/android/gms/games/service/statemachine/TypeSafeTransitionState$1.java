// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine;

import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.common.util.state.State;

// Referenced classes of package com.google.android.gms.games.service.statemachine:
//            TypeSafeTransitionState, StateTimer, MessageTokenHelper, IStateMachine

final class this._cls0 extends State
{

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
                it it = (imerMap)message.obj;
                boolean flag;
                if (it._fld0.equals(statetimer) && it.merToken.isValid())
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

    Token()
    {
        this$0 = TypeSafeTransitionState.this;
        super();
    }
}
