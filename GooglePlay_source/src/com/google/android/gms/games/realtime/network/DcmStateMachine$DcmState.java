// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.IStateMachine;
import com.google.android.gms.games.service.statemachine.MultiFileStateMachine;
import com.google.android.gms.games.service.statemachine.TypeSafeTransitionState;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmStateMachine

static abstract class .mStates extends TypeSafeTransitionState
{

    protected final  mData;
    protected final DcmStateMachine mRsm;
    protected final IStateMachine mSm;
    protected final  mStates;

    protected (DcmStateMachine dcmstatemachine)
    {
        super(((MultiFileStateMachine) (dcmstatemachine)).mStateMachine);
        mRsm = dcmstatemachine;
        mData = ()((MultiFileStateMachine) (dcmstatemachine)).mData;
        mSm = ((MultiFileStateMachine) (dcmstatemachine)).mStateMachine;
        mStates = (mStates)((MultiFileStateMachine) (dcmstatemachine)).mStates;
    }
}
