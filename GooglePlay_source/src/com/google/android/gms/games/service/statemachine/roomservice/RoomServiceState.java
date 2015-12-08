// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import com.google.android.gms.games.service.statemachine.IStateMachine;
import com.google.android.gms.games.service.statemachine.MultiFileStateMachine;
import com.google.android.gms.games.service.statemachine.TypeSafeTransitionState;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceStateMachine

abstract class RoomServiceState extends TypeSafeTransitionState
{

    protected final RoomServiceStateMachine.StateData mData;
    protected final RoomServiceStateMachine mRsm;
    protected final IStateMachine mSm;
    protected final RoomServiceStateMachine.States mStates;

    protected RoomServiceState(RoomServiceStateMachine roomservicestatemachine)
    {
        super(((MultiFileStateMachine) (roomservicestatemachine)).mStateMachine);
        mRsm = roomservicestatemachine;
        mData = (RoomServiceStateMachine.StateData)((MultiFileStateMachine) (roomservicestatemachine)).mData;
        mSm = ((MultiFileStateMachine) (roomservicestatemachine)).mStateMachine;
        mStates = (RoomServiceStateMachine.States)((MultiFileStateMachine) (roomservicestatemachine)).mStates;
    }
}
