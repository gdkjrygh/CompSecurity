// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TargetStateManager
{
    public static final class StateId extends Enum
    {

        private static final StateId $VALUES[];
        public static final StateId StateBadPair;
        public static final StateId StateHasError;
        public static final StateId StateHasPair;
        public static final StateId StateLaunched;
        public static final StateId StateNeedHandShake;
        public static final StateId StateNeedLaunched;
        public static final StateId StateNeedRegPair;
        public static final StateId StateNoPair;
        public static final StateId StateNoPairNeedRegPair;
        public static final StateId StateNotLaunched;
        public static final StateId StateRetryExhausted;
        public static final StateId StateSendingMessage;
        public static final StateId StateSessionEnd;
        public static final StateId StateSessionReady;
        public static final StateId StateTimeout;

        public static StateId valueOf(String s)
        {
            return (StateId)Enum.valueOf(com/netflix/mediaclient/service/mdx/TargetStateManager$StateId, s);
        }

        public static StateId[] values()
        {
            return (StateId[])$VALUES.clone();
        }

        static 
        {
            StateNotLaunched = new StateId("StateNotLaunched", 0);
            StateNeedLaunched = new StateId("StateNeedLaunched", 1);
            StateLaunched = new StateId("StateLaunched", 2);
            StateHasPair = new StateId("StateHasPair", 3);
            StateBadPair = new StateId("StateBadPair", 4);
            StateNoPair = new StateId("StateNoPair", 5);
            StateNoPairNeedRegPair = new StateId("StateNoPairNeedRegPair", 6);
            StateNeedRegPair = new StateId("StateNeedRegPair", 7);
            StateNeedHandShake = new StateId("StateNeedHandShake", 8);
            StateSessionReady = new StateId("StateSessionReady", 9);
            StateSendingMessage = new StateId("StateSendingMessage", 10);
            StateSessionEnd = new StateId("StateSessionEnd", 11);
            StateRetryExhausted = new StateId("StateRetryExhausted", 12);
            StateTimeout = new StateId("StateTimeout", 13);
            StateHasError = new StateId("StateHasError", 14);
            $VALUES = (new StateId[] {
                StateNotLaunched, StateNeedLaunched, StateLaunched, StateHasPair, StateBadPair, StateNoPair, StateNoPairNeedRegPair, StateNeedRegPair, StateNeedHandShake, StateSessionReady, 
                StateSendingMessage, StateSessionEnd, StateRetryExhausted, StateTimeout, StateHasError
            });
        }

        private StateId(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class TargetContextEvent extends Enum
    {

        private static final TargetContextEvent $VALUES[];
        public static final TargetContextEvent DeletePairSucceed;
        public static final TargetContextEvent HandShakeFailed;
        public static final TargetContextEvent HandShakeSucceed;
        public static final TargetContextEvent LaunchFailed;
        public static final TargetContextEvent LaunchRetry;
        public static final TargetContextEvent LaunchSucceed;
        public static final TargetContextEvent PairFailed;
        public static final TargetContextEvent PairFailedExistedPair;
        public static final TargetContextEvent PairFailedNeedRegPair;
        public static final TargetContextEvent PairNotAllowed;
        public static final TargetContextEvent PairSucceed;
        public static final TargetContextEvent PairingRetry;
        public static final TargetContextEvent RegistrationInProgress;
        public static final TargetContextEvent SendMessageFailed;
        public static final TargetContextEvent SendMessageFailedNeedNewSession;
        public static final TargetContextEvent SendMessageFailedNeedRepair;
        public static final TargetContextEvent SendMessageSucceed;
        public static final TargetContextEvent SessionCommandReceived;
        public static final TargetContextEvent SessionEnd;
        public static final TargetContextEvent SessionRetry;
        public static final TargetContextEvent StartSessionSucceed;
        public static final TargetContextEvent StartTarget;
        public static final TargetContextEvent TargetUpdate;
        public static final TargetContextEvent Timeout;

        public static TargetContextEvent valueOf(String s)
        {
            return (TargetContextEvent)Enum.valueOf(com/netflix/mediaclient/service/mdx/TargetStateManager$TargetContextEvent, s);
        }

        public static TargetContextEvent[] values()
        {
            return (TargetContextEvent[])$VALUES.clone();
        }

        static 
        {
            StartTarget = new TargetContextEvent("StartTarget", 0);
            LaunchSucceed = new TargetContextEvent("LaunchSucceed", 1);
            LaunchFailed = new TargetContextEvent("LaunchFailed", 2);
            PairSucceed = new TargetContextEvent("PairSucceed", 3);
            PairFailed = new TargetContextEvent("PairFailed", 4);
            PairFailedExistedPair = new TargetContextEvent("PairFailedExistedPair", 5);
            PairFailedNeedRegPair = new TargetContextEvent("PairFailedNeedRegPair", 6);
            PairNotAllowed = new TargetContextEvent("PairNotAllowed", 7);
            RegistrationInProgress = new TargetContextEvent("RegistrationInProgress", 8);
            DeletePairSucceed = new TargetContextEvent("DeletePairSucceed", 9);
            StartSessionSucceed = new TargetContextEvent("StartSessionSucceed", 10);
            HandShakeSucceed = new TargetContextEvent("HandShakeSucceed", 11);
            HandShakeFailed = new TargetContextEvent("HandShakeFailed", 12);
            SendMessageSucceed = new TargetContextEvent("SendMessageSucceed", 13);
            SendMessageFailed = new TargetContextEvent("SendMessageFailed", 14);
            SendMessageFailedNeedRepair = new TargetContextEvent("SendMessageFailedNeedRepair", 15);
            SendMessageFailedNeedNewSession = new TargetContextEvent("SendMessageFailedNeedNewSession", 16);
            SessionEnd = new TargetContextEvent("SessionEnd", 17);
            SessionCommandReceived = new TargetContextEvent("SessionCommandReceived", 18);
            TargetUpdate = new TargetContextEvent("TargetUpdate", 19);
            SessionRetry = new TargetContextEvent("SessionRetry", 20);
            PairingRetry = new TargetContextEvent("PairingRetry", 21);
            LaunchRetry = new TargetContextEvent("LaunchRetry", 22);
            Timeout = new TargetContextEvent("Timeout", 23);
            $VALUES = (new TargetContextEvent[] {
                StartTarget, LaunchSucceed, LaunchFailed, PairSucceed, PairFailed, PairFailedExistedPair, PairFailedNeedRegPair, PairNotAllowed, RegistrationInProgress, DeletePairSucceed, 
                StartSessionSucceed, HandShakeSucceed, HandShakeFailed, SendMessageSucceed, SendMessageFailed, SendMessageFailedNeedRepair, SendMessageFailedNeedNewSession, SessionEnd, SessionCommandReceived, TargetUpdate, 
                SessionRetry, PairingRetry, LaunchRetry, Timeout
            });
        }

        private TargetContextEvent(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class TargetState extends Enum
    {

        private static final TargetState $VALUES[];
        public static final TargetState StateBadPair;
        public static final TargetState StateHasError;
        public static final TargetState StateHasPair;
        public static final TargetState StateLaunched;
        public static final TargetState StateNeedHandShake;
        public static final TargetState StateNeedLaunched;
        public static final TargetState StateNeedRegPair;
        public static final TargetState StateNoPair;
        public static final TargetState StateNoPairNeedRegPair;
        public static final TargetState StateNotLaunched;
        public static final TargetState StateRetryExhausted;
        public static final TargetState StateSendingMessage;
        public static final TargetState StateSessionEnd;
        public static final TargetState StateSessionReady;
        public static final TargetState StateTimeout;
        private int mBaseRetryIntreval;
        private StateId mId;
        private String mName;
        private int mRetry;
        private int mTimeOut;

        public static TargetState valueOf(String s)
        {
            return (TargetState)Enum.valueOf(com/netflix/mediaclient/service/mdx/TargetStateManager$TargetState, s);
        }

        public static TargetState[] values()
        {
            return (TargetState[])$VALUES.clone();
        }

        public StateId getId()
        {
            return mId;
        }

        public String getName()
        {
            return mName;
        }

        public int getRetry()
        {
            return mRetry;
        }

        public int getRetryInterval()
        {
            return mBaseRetryIntreval;
        }

        public int getTimeOut()
        {
            return mTimeOut;
        }

        static 
        {
            StateNotLaunched = new TargetState("StateNotLaunched", 0, StateId.StateNotLaunched, "notlaunched", 0, 0, 1000);
            StateNeedLaunched = new TargetState("StateNeedLaunched", 1, StateId.StateNeedLaunched, "needlaunch", 1, 40000, 7000);
            StateLaunched = new TargetState("StateLaunched", 2, StateId.StateLaunched, "launched", 0, 0, 1000);
            StateHasPair = new TargetState("StateHasPair", 3, StateId.StateHasPair, "haspair", 2, 8000, 1000);
            StateBadPair = new TargetState("StateBadPair", 4, StateId.StateBadPair, "badpair", 0, 0, 1000);
            StateNoPair = new TargetState("StateNoPair", 5, StateId.StateNoPair, "nopair", 3, 24000, 3000);
            StateNoPairNeedRegPair = new TargetState("StateNoPairNeedRegPair", 6, StateId.StateNoPairNeedRegPair, "nopairneedregpair", 0, 0, 1000);
            StateNeedRegPair = new TargetState("StateNeedRegPair", 7, StateId.StateNeedRegPair, "needregpair", 3, 32000, 4000);
            StateNeedHandShake = new TargetState("StateNeedHandShake", 8, StateId.StateNeedHandShake, "needhandshake", 2, 8000, 1000);
            StateSessionReady = new TargetState("StateSessionReady", 9, StateId.StateSessionReady, "sessionready", 0, 0, 1000);
            StateSendingMessage = new TargetState("StateSendingMessage", 10, StateId.StateSendingMessage, "sendingmessage", 2, 8000, 1000);
            StateSessionEnd = new TargetState("StateSessionEnd", 11, StateId.StateSessionEnd, "sessionend", 0, 8000, 1000);
            StateRetryExhausted = new TargetState("StateRetryExhausted", 12, StateId.StateRetryExhausted, "retryexhausted", 0, 0, 1000);
            StateTimeout = new TargetState("StateTimeout", 13, StateId.StateTimeout, "timeout", 0, 0, 1000);
            StateHasError = new TargetState("StateHasError", 14, StateId.StateHasError, "haserror", 0, 0, 1000);
            $VALUES = (new TargetState[] {
                StateNotLaunched, StateNeedLaunched, StateLaunched, StateHasPair, StateBadPair, StateNoPair, StateNoPairNeedRegPair, StateNeedRegPair, StateNeedHandShake, StateSessionReady, 
                StateSendingMessage, StateSessionEnd, StateRetryExhausted, StateTimeout, StateHasError
            });
        }


        private TargetState(String s, int i, StateId stateid, String s1, int j, int k, int l)
        {
            super(s, i);
            mRetry = 0;
            mBaseRetryIntreval = 0;
            mName = s1;
            mRetry = j;
            mId = stateid;
            mTimeOut = k;
            mBaseRetryIntreval = l;
        }
    }

    public static interface TargetStateManagerListener
    {

        public abstract void removeEvents(TargetContextEvent targetcontextevent);

        public abstract void scheduleEvent(TargetContextEvent targetcontextevent, int i);

        public abstract void stateHasError(TargetState targetstate);

        public abstract void stateHasExhaustedRetry(TargetState targetstate);

        public abstract void stateHasTimedOut(TargetState targetstate);
    }


    private static final int DEFAULT_RETRY_INTERNAL = 1000;
    private static final int LAUNCH_TIMEOUT = 40000;
    private static final int PAIRING_RETRY_INTERVAL = 3000;
    private static final int PAIRING_TIMEOUT = 24000;
    private static final int REGPAIRING_RETRY_INTERVAL = 4000;
    private static final int REGPAIRING_TIMEOUT = 32000;
    private static final int SESSION_RETRY_INTERVAL = 1000;
    private static final int STATE_TIMEOUT = 8000;
    private static final String TAG = "nf_mdx";
    private boolean mActivated;
    TargetState mCurrentState;
    private Map mDefaultAction;
    private boolean mHasUiCommand;
    private boolean mIsPreviouslyPaired;
    private boolean mIsTargetSelected;
    private boolean mLaunched;
    private TargetStateManagerListener mListener;
    TargetState mPreviousState;
    private int mRegistrationAcceptance;
    int mRetryCurrentAction;
    int mRetryCurrentInterval;
    private ArrayList mSessionRequested;

    TargetStateManager(TargetStateManagerListener targetstatemanagerlistener, TargetState targetstate, boolean flag)
    {
        mSessionRequested = new ArrayList();
        mDefaultAction = new HashMap();
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("StateMachine: init state ").append(targetstate.getName()).toString());
        }
        mListener = targetstatemanagerlistener;
        mIsTargetSelected = flag;
        mCurrentState = targetstate;
        mRetryCurrentAction = targetstate.getRetry();
        mHasUiCommand = false;
    }

    private void scheduleRetry(TargetContextEvent targetcontextevent)
    {
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("TargetStateManager: schedule retry for ").append(mCurrentState.mName).append(" in ").append(mRetryCurrentInterval).toString());
        }
        mListener.scheduleEvent(targetcontextevent, mRetryCurrentInterval);
    }

    private void sessionEnded()
    {
        mHasUiCommand = false;
        mSessionRequested.clear();
        transitionStateTo(TargetState.StateSessionEnd);
    }

    private void transitionStateTo(TargetState targetstate)
    {
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("TargetStateManager: from ").append(mCurrentState.mName).append(" to ").append(targetstate.mName).toString());
        }
        mPreviousState = mCurrentState;
        if (mCurrentState != targetstate) goto _L2; else goto _L1
_L1:
        if (mRetryCurrentAction <= 0) goto _L4; else goto _L3
_L3:
        mRetryCurrentAction = mRetryCurrentAction - 1;
        mRetryCurrentInterval = mRetryCurrentInterval + mRetryCurrentInterval;
        mListener.removeEvents(TargetContextEvent.Timeout);
        mListener.removeEvents(TargetContextEvent.SessionRetry);
        mListener.removeEvents(TargetContextEvent.PairingRetry);
_L6:
        targetstate = (Runnable)mDefaultAction.get(mCurrentState.getId());
        if (targetstate != null)
        {
            targetstate.run();
            if (mCurrentState.getTimeOut() > 0)
            {
                mListener.scheduleEvent(TargetContextEvent.Timeout, mCurrentState.getTimeOut());
            }
        }
        return;
_L4:
        transitionStateTo(TargetState.StateRetryExhausted);
        mListener.stateHasExhaustedRetry(mPreviousState);
        return;
_L2:
        mListener.removeEvents(TargetContextEvent.Timeout);
        mListener.removeEvents(TargetContextEvent.SessionRetry);
        mListener.removeEvents(TargetContextEvent.PairingRetry);
        mCurrentState = targetstate;
        mRetryCurrentAction = mCurrentState.getRetry();
        mRetryCurrentInterval = mCurrentState.getRetryInterval();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void addSessionRequest(Runnable runnable)
    {
        mSessionRequested.add(runnable);
    }

    public void addUiCommand(Runnable runnable)
    {
        mHasUiCommand = true;
        mSessionRequested.add(runnable);
    }

    public boolean isSessionActive()
    {
        return TargetState.StateSessionReady.equals(mCurrentState) || TargetState.StateSendingMessage.equals(mCurrentState);
    }

    public void receivedEvent(TargetContextEvent targetcontextevent)
    {
        if (!TargetContextEvent.LaunchFailed.equals(targetcontextevent) || mCurrentState.getId() == StateId.StateNeedLaunched) goto _L2; else goto _L1
_L1:
        transitionStateTo(TargetState.StateNotLaunched);
        mLaunched = false;
_L20:
        return;
_L2:
        static class _cls1
        {

            static final int $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[];

            static 
            {
                $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId = new int[StateId.values().length];
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateNotLaunched.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateNeedLaunched.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateLaunched.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateHasPair.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateBadPair.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateNoPair.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateNoPairNeedRegPair.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateNeedRegPair.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateNeedHandShake.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateSessionReady.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateSendingMessage.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateSessionEnd.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateRetryExhausted.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateTimeout.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[StateId.StateHasError.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.netflix.mediaclient.service.mdx.TargetStateManager.StateId[mCurrentState.getId().ordinal()];
        JVM INSTR tableswitch 1 15: default 124
    //                   1 125
    //                   2 211
    //                   3 35
    //                   4 366
    //                   5 466
    //                   6 515
    //                   7 696
    //                   8 721
    //                   9 852
    //                   10 962
    //                   11 1033
    //                   12 1179
    //                   13 1233
    //                   14 1274
    //                   15 1315;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L6:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (TargetContextEvent.StartTarget.equals(targetcontextevent) || TargetContextEvent.SessionCommandReceived.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNeedLaunched);
            return;
        }
        if (TargetContextEvent.TargetUpdate.equals(targetcontextevent) && mLaunched || TargetContextEvent.LaunchSucceed.equals(targetcontextevent))
        {
            if (mIsPreviouslyPaired)
            {
                transitionStateTo(TargetState.StateHasPair);
                return;
            } else
            {
                transitionStateTo(TargetState.StateNoPair);
                return;
            }
        } else
        {
            transitionStateTo(TargetState.StateNotLaunched);
            return;
        }
_L5:
        if (TargetContextEvent.LaunchSucceed.equals(targetcontextevent))
        {
            if (mIsPreviouslyPaired)
            {
                transitionStateTo(TargetState.StateHasPair);
                return;
            }
            if (!mActivated)
            {
                transitionStateTo(TargetState.StateNeedRegPair);
                return;
            } else
            {
                transitionStateTo(TargetState.StateNoPair);
                return;
            }
        }
        if (TargetContextEvent.LaunchFailed.equals(targetcontextevent))
        {
            scheduleRetry(TargetContextEvent.LaunchRetry);
            return;
        }
        if (TargetContextEvent.LaunchRetry.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNeedLaunched);
            return;
        }
        if (TargetContextEvent.TargetUpdate.equals(targetcontextevent) && mLaunched)
        {
            if (mIsPreviouslyPaired)
            {
                transitionStateTo(TargetState.StateHasPair);
                return;
            } else
            {
                transitionStateTo(TargetState.StateNoPair);
                return;
            }
        }
        if (TargetContextEvent.Timeout.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateTimeout);
            mListener.stateHasTimedOut(mPreviousState);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (TargetContextEvent.StartSessionSucceed.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNeedHandShake);
            return;
        }
        if (TargetContextEvent.SendMessageFailedNeedRepair.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateBadPair);
            return;
        }
        if (TargetContextEvent.SendMessageFailed.equals(targetcontextevent) || TargetContextEvent.SendMessageFailedNeedNewSession.equals(targetcontextevent))
        {
            scheduleRetry(TargetContextEvent.SessionRetry);
            return;
        }
        if (TargetContextEvent.SessionRetry.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateHasPair);
            return;
        }
        if (TargetContextEvent.Timeout.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateHasPair);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (TargetContextEvent.DeletePairSucceed.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNoPair);
            return;
        }
        if (TargetContextEvent.Timeout.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateTimeout);
            mListener.stateHasTimedOut(mPreviousState);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (TargetContextEvent.PairSucceed.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateHasPair);
            return;
        }
        if (TargetContextEvent.PairFailedNeedRegPair.equals(targetcontextevent))
        {
            if (mRegistrationAcceptance != 0 && mHasUiCommand)
            {
                transitionStateTo(TargetState.StateNeedRegPair);
                return;
            }
            if (mRegistrationAcceptance != 0)
            {
                transitionStateTo(TargetState.StateNoPairNeedRegPair);
                return;
            } else
            {
                transitionStateTo(TargetState.StateHasError);
                mListener.stateHasError(mPreviousState);
                return;
            }
        }
        if (TargetContextEvent.PairFailedExistedPair.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateBadPair);
            return;
        }
        if (TargetContextEvent.PairFailed.equals(targetcontextevent))
        {
            scheduleRetry(TargetContextEvent.PairingRetry);
            return;
        }
        if (TargetContextEvent.PairingRetry.equals(targetcontextevent) || TargetContextEvent.RegistrationInProgress.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNoPair);
            return;
        }
        if (TargetContextEvent.Timeout.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateTimeout);
            mListener.stateHasTimedOut(mPreviousState);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (TargetContextEvent.SessionCommandReceived.equals(targetcontextevent) && mRegistrationAcceptance != 0)
        {
            transitionStateTo(TargetState.StateNeedRegPair);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (TargetContextEvent.PairSucceed.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateHasPair);
            return;
        }
        if (TargetContextEvent.PairFailedExistedPair.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateBadPair);
            return;
        }
        if (TargetContextEvent.Timeout.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateTimeout);
            mListener.stateHasTimedOut(mPreviousState);
            return;
        }
        if (TargetContextEvent.PairFailed.equals(targetcontextevent) || TargetContextEvent.PairFailedNeedRegPair.equals(targetcontextevent))
        {
            scheduleRetry(TargetContextEvent.PairingRetry);
            return;
        }
        if (TargetContextEvent.PairingRetry.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNeedRegPair);
            return;
        }
        if (TargetContextEvent.RegistrationInProgress.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNoPair);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (TargetContextEvent.SessionEnd.equals(targetcontextevent))
        {
            sessionEnded();
            return;
        }
        if (!TargetContextEvent.HandShakeSucceed.equals(targetcontextevent))
        {
            break; /* Loop/switch isn't completed */
        }
        transitionStateTo(TargetState.StateSessionReady);
        if (!mSessionRequested.isEmpty())
        {
            mListener.scheduleEvent(TargetContextEvent.SessionCommandReceived, 0);
            return;
        }
        if (true) goto _L20; else goto _L19
_L19:
        if (TargetContextEvent.HandShakeFailed.equals(targetcontextevent))
        {
            scheduleRetry(TargetContextEvent.SessionRetry);
            return;
        }
        if (TargetContextEvent.SessionRetry.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNeedHandShake);
            return;
        }
        if (TargetContextEvent.Timeout.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNeedHandShake);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (TargetContextEvent.SessionEnd.equals(targetcontextevent))
        {
            sessionEnded();
            return;
        }
        if (TargetContextEvent.SessionCommandReceived.equals(targetcontextevent))
        {
            if (!mSessionRequested.isEmpty())
            {
                setDefaultAction(StateId.StateSendingMessage, (Runnable)mSessionRequested.remove(0));
                transitionStateTo(TargetState.StateSendingMessage);
                return;
            } else
            {
                Log.e("nf_mdx", "StateMachine: SessionCommandReceived, but no task!");
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (TargetContextEvent.SessionEnd.equals(targetcontextevent))
        {
            sessionEnded();
            return;
        }
        if (!TargetContextEvent.SendMessageSucceed.equals(targetcontextevent))
        {
            break; /* Loop/switch isn't completed */
        }
        transitionStateTo(TargetState.StateSessionReady);
        if (!mSessionRequested.isEmpty())
        {
            mListener.scheduleEvent(TargetContextEvent.SessionCommandReceived, 0);
            return;
        }
        if (true) goto _L20; else goto _L21
_L21:
        if (TargetContextEvent.SendMessageFailedNeedRepair.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateBadPair);
            return;
        }
        if (TargetContextEvent.SendMessageFailedNeedNewSession.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateHasPair);
            return;
        }
        if (TargetContextEvent.SendMessageFailed.equals(targetcontextevent))
        {
            scheduleRetry(TargetContextEvent.SessionRetry);
            return;
        }
        if (TargetContextEvent.SessionRetry.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateSendingMessage);
            return;
        }
        if (TargetContextEvent.Timeout.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateSendingMessage);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        if (TargetContextEvent.SessionCommandReceived.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateHasPair);
            return;
        }
        if (TargetContextEvent.LaunchFailed.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNotLaunched);
            return;
        }
        if (TargetContextEvent.LaunchSucceed.equals(targetcontextevent))
        {
            transitionStateTo(TargetState.StateNeedHandShake);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        if (TargetContextEvent.SessionEnd.equals(targetcontextevent))
        {
            sessionEnded();
            return;
        }
        if (TargetContextEvent.SessionCommandReceived.equals(targetcontextevent) && mPreviousState != null)
        {
            transitionStateTo(mPreviousState);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        if (TargetContextEvent.SessionEnd.equals(targetcontextevent))
        {
            sessionEnded();
            return;
        }
        if (TargetContextEvent.SessionCommandReceived.equals(targetcontextevent) && mPreviousState != null)
        {
            transitionStateTo(mPreviousState);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L18:
        if (TargetContextEvent.SessionEnd.equals(targetcontextevent))
        {
            sessionEnded();
            return;
        }
        if (TargetContextEvent.SessionCommandReceived.equals(targetcontextevent) && mPreviousState != null)
        {
            transitionStateTo(mPreviousState);
            return;
        }
        if (true) goto _L20; else goto _L22
_L22:
    }

    public void setDefaultAction(StateId stateid, Runnable runnable)
    {
        mDefaultAction.put(stateid, runnable);
    }

    public void start(boolean flag, int i, boolean flag1, int j)
    {
        mIsPreviouslyPaired = flag;
        mRegistrationAcceptance = i;
        mActivated = flag1;
        if (j == 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        mLaunched = flag;
        if (mCurrentState.getId() == StateId.StateNotLaunched)
        {
            if (mIsTargetSelected)
            {
                transitionStateTo(TargetState.StateNeedLaunched);
            }
        } else
        {
            if (mCurrentState.getId() == StateId.StateLaunched)
            {
                if (mIsPreviouslyPaired)
                {
                    transitionStateTo(TargetState.StateHasPair);
                    return;
                } else
                {
                    transitionStateTo(TargetState.StateNoPair);
                    return;
                }
            }
            if (Log.isLoggable("nf_mdx", 3))
            {
                Log.d("nf_mdx", (new StringBuilder()).append("StateMachine: init state is not handled ").append(mCurrentState.getName()).toString());
                return;
            }
        }
    }

    public void updateTarget(boolean flag, int i, boolean flag1, int j)
    {
        mIsPreviouslyPaired = flag;
        mRegistrationAcceptance = i;
        mActivated = flag1;
        if (j == 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        mLaunched = flag;
    }
}
