// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.state;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.stats.WakeLock;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.util.state:
//            IState, State

public class StateMachine
{
    private class SmWaitIdleCmdData
    {

        public final CountDownLatch countDownLatch;
        public final int sequenceNumber;
    }

    public static final class LogRec
    {

        private IState mDstState;
        private String mInfo;
        private IState mOrgState;
        private StateMachine mSm;
        private IState mState;
        private long mTime;
        private int mWhat;

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("time=");
            Object obj = Calendar.getInstance();
            ((Calendar) (obj)).setTimeInMillis(mTime);
            stringbuilder.append(String.format("%tm-%td %tH:%tM:%tS.%tL", new Object[] {
                obj, obj, obj, obj, obj, obj
            }));
            stringbuilder.append(" processed=");
            if (mState == null)
            {
                obj = "<null>";
            } else
            {
                obj = mState.getName();
            }
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(" org=");
            if (mOrgState == null)
            {
                obj = "<null>";
            } else
            {
                obj = mOrgState.getName();
            }
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(" dest=");
            if (mDstState == null)
            {
                obj = "<null>";
            } else
            {
                obj = mDstState.getName();
            }
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(" what=");
            if (mSm != null)
            {
                obj = mSm.getWhatToString(mWhat);
            } else
            {
                obj = "";
            }
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(mWhat);
                stringbuilder.append("(0x");
                stringbuilder.append(Integer.toHexString(mWhat));
                stringbuilder.append(")");
            } else
            {
                stringbuilder.append(((String) (obj)));
            }
            if (!TextUtils.isEmpty(mInfo))
            {
                stringbuilder.append(" ");
                stringbuilder.append(mInfo);
            }
            return stringbuilder.toString();
        }

        public final void update(StateMachine statemachine, Message message, String s, IState istate, IState istate1, IState istate2)
        {
            mSm = statemachine;
            mTime = System.currentTimeMillis();
            int i;
            if (message != null)
            {
                i = message.what;
            } else
            {
                i = 0;
            }
            mWhat = i;
            mInfo = s;
            mState = istate;
            mOrgState = istate1;
            mDstState = istate2;
        }

        LogRec(StateMachine statemachine, Message message, String s, IState istate, IState istate1, IState istate2)
        {
            update(statemachine, message, s, istate, istate1, istate2);
        }
    }

    private static final class LogRecords
    {

        private int mCount;
        private boolean mLogOnlyTransitions;
        private final Vector mLogRecVector;
        private int mMaxSize;
        private int mOldestIndex;

        final void add(StateMachine statemachine, Message message, String s, IState istate, IState istate1, IState istate2)
        {
            this;
            JVM INSTR monitorenter ;
            mCount = mCount + 1;
            if (mLogRecVector.size() >= mMaxSize) goto _L2; else goto _L1
_L1:
            mLogRecVector.add(new LogRec(statemachine, message, s, istate, istate1, istate2));
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            LogRec logrec = (LogRec)mLogRecVector.get(mOldestIndex);
            mOldestIndex = mOldestIndex + 1;
            if (mOldestIndex >= mMaxSize)
            {
                mOldestIndex = 0;
            }
            logrec.update(statemachine, message, s, istate, istate1, istate2);
            if (true) goto _L4; else goto _L3
_L3:
            statemachine;
            throw statemachine;
        }

        final void cleanup()
        {
            this;
            JVM INSTR monitorenter ;
            mLogRecVector.clear();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        final int count()
        {
            this;
            JVM INSTR monitorenter ;
            int i = mCount;
            this;
            JVM INSTR monitorexit ;
            return i;
            Exception exception;
            exception;
            throw exception;
        }

        final LogRec get(int i)
        {
            this;
            JVM INSTR monitorenter ;
            int j = mOldestIndex + i;
            i = j;
            if (j >= mMaxSize)
            {
                i = j - mMaxSize;
            }
            j = size();
            if (i < j) goto _L2; else goto _L1
_L1:
            LogRec logrec = null;
_L4:
            this;
            JVM INSTR monitorexit ;
            return logrec;
_L2:
            logrec = (LogRec)mLogRecVector.get(i);
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        final boolean logOnlyTransitions()
        {
            this;
            JVM INSTR monitorenter ;
            return false;
        }

        final void setSize(int i)
        {
            this;
            JVM INSTR monitorenter ;
            mMaxSize = i;
            mCount = 0;
            mLogRecVector.clear();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        final int size()
        {
            this;
            JVM INSTR monitorenter ;
            int i = mLogRecVector.size();
            this;
            JVM INSTR monitorexit ;
            return i;
            Exception exception;
            exception;
            throw exception;
        }

        private LogRecords()
        {
            mLogRecVector = new Vector();
            mMaxSize = 20;
            mOldestIndex = 0;
            mCount = 0;
            mLogOnlyTransitions = false;
        }

        LogRecords(byte byte0)
        {
            this();
        }
    }

    private static final class SmHandler extends Handler
    {

        private static final Object mSmHandlerObj = new Object();
        private boolean mDbg;
        private final ArrayList mDeferredMessages;
        private State mDestState;
        private final HaltingState mHaltingState;
        private boolean mHasQuit;
        private State mInitialState;
        private boolean mIsConstructionCompleted;
        private final LogRecords mLogRecords;
        private Message mMsg;
        private final QuittingState mQuittingState;
        private StateMachine mSm;
        private final HashMap mStateInfo;
        private StateInfo mStateStack[];
        private int mStateStackTopIndex;
        private StateInfo mTempStateStack[];
        private int mTempStateStackCount;

        private final StateInfo addState(State state, State state1)
        {
            Object obj;
            if (mDbg)
            {
                Object obj1 = mSm;
                StringBuilder stringbuilder = (new StringBuilder("addStateInternal: E state=")).append(state.getName()).append(",parent=");
                if (state1 == null)
                {
                    obj = "";
                } else
                {
                    obj = state1.getName();
                }
                ((StateMachine) (obj1)).log(stringbuilder.append(((String) (obj))).toString());
            }
            obj = null;
            if (state1 != null)
            {
                obj1 = (StateInfo)mStateInfo.get(state1);
                obj = obj1;
                if (obj1 == null)
                {
                    obj = addState(state1, null);
                }
            }
            obj1 = (StateInfo)mStateInfo.get(state);
            state1 = ((State) (obj1));
            if (obj1 == null)
            {
                state1 = new StateInfo((byte)0);
                mStateInfo.put(state, state1);
            }
            if (((StateInfo) (state1)).parentStateInfo != null && ((StateInfo) (state1)).parentStateInfo != obj)
            {
                throw new RuntimeException("state already added");
            }
            state1.state = state;
            state1.parentStateInfo = ((StateInfo) (obj));
            state1.active = false;
            if (mDbg)
            {
                mSm.log((new StringBuilder("addStateInternal: X stateInfo: ")).append(state1).toString());
            }
            return state1;
        }

        private final void invokeEnterMethods(int i)
        {
            for (; i <= mStateStackTopIndex; i++)
            {
                if (mDbg)
                {
                    mSm.log((new StringBuilder("invokeEnterMethods: ")).append(mStateStack[i].state.getName()).toString());
                }
                mStateStack[i].state.enter();
                mStateStack[i].active = true;
            }

        }

        private final void invokeExitMethods(StateInfo stateinfo)
        {
            for (; mStateStackTopIndex >= 0 && mStateStack[mStateStackTopIndex] != stateinfo; mStateStackTopIndex = mStateStackTopIndex - 1)
            {
                State state = mStateStack[mStateStackTopIndex].state;
                if (mDbg)
                {
                    mSm.log((new StringBuilder("invokeExitMethods: ")).append(state.getName()).toString());
                }
                state.exit();
                mStateStack[mStateStackTopIndex].active = false;
            }

        }

        private final void moveDeferredMessageAtFrontOfQueue()
        {
            for (int i = mDeferredMessages.size() - 1; i >= 0; i--)
            {
                Message message = (Message)mDeferredMessages.get(i);
                if (mDbg)
                {
                    mSm.log((new StringBuilder("moveDeferredMessageAtFrontOfQueue; what=")).append(mSm.getWhatToString(message.what)).toString());
                }
                mSm.sendMessageAtFrontOfQueue(message);
            }

            mDeferredMessages.clear();
        }

        private final int moveTempStateStackToStateStack()
        {
            int k = mStateStackTopIndex + 1;
            int i = mTempStateStackCount - 1;
            int j = k;
            for (; i >= 0; i--)
            {
                if (mDbg)
                {
                    mSm.log((new StringBuilder("moveTempStackToStateStack: i=")).append(i).append(",j=").append(j).toString());
                }
                mStateStack[j] = mTempStateStack[i];
                j++;
            }

            mStateStackTopIndex = j - 1;
            if (mDbg)
            {
                mSm.log((new StringBuilder("moveTempStackToStateStack: X mStateStackTop=")).append(mStateStackTopIndex).append(",startingIndex=").append(k).append(",Top=").append(mStateStack[mStateStackTopIndex].state.getName()).toString());
            }
            return k;
        }

        private void performTransitions(State state, Message message)
        {
            State state1 = mStateStack[mStateStackTopIndex].state;
            int i;
            if (message.obj != mSmHandlerObj)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mLogRecords.logOnlyTransitions();
            if (i != 0)
            {
                mLogRecords.add(mSm, mMsg, "", state, state1, mDestState);
            }
            state = mDestState;
            message = state;
            if (state != null)
            {
                do
                {
                    if (mDbg)
                    {
                        mSm.log("handleMessage: new destination call exit/enter");
                    }
                    mTempStateStackCount = 0;
                    message = (StateInfo)mStateInfo.get(state);
                    do
                    {
                        StateInfo astateinfo[] = mTempStateStack;
                        i = mTempStateStackCount;
                        mTempStateStackCount = i + 1;
                        astateinfo[i] = message;
                        message = ((StateInfo) (message)).parentStateInfo;
                    } while (message != null && !((StateInfo) (message)).active);
                    if (mDbg)
                    {
                        mSm.log((new StringBuilder("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=")).append(mTempStateStackCount).append(",curStateInfo: ").append(message).toString());
                    }
                    invokeExitMethods(message);
                    invokeEnterMethods(moveTempStateStackToStateStack());
                    moveDeferredMessageAtFrontOfQueue();
                    if (state == mDestState)
                    {
                        break;
                    }
                    state = mDestState;
                } while (true);
                mDestState = null;
                message = state;
            }
            if (message != null && message == mQuittingState)
            {
                if (mSm.mSmThread != null)
                {
                    getLooper().quit();
                    mSm.mSmThread = null;
                }
                state = mSm;
                LinkedList linkedlist = ((mHasQuit) (this)).mHasQuit;
                mSm.mSmHandler = null;
                mSm = null;
                mMsg = null;
                mLogRecords.cleanup();
                mStateStack = null;
                mTempStateStack = null;
                mStateInfo.clear();
                mInitialState = null;
                mDestState = null;
                mDeferredMessages.clear();
                mHasQuit = true;
            }
        }

        private final State processMsg(Message message)
        {
            StateInfo stateinfo;
            StateInfo stateinfo1;
            stateinfo = mStateStack[mStateStackTopIndex];
            if (mDbg)
            {
                mSm.log((new StringBuilder("processMsg: ")).append(stateinfo.state.getName()).toString());
            }
            boolean flag;
            if (message.what == -1 && message.obj == mSmHandlerObj)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            stateinfo1 = stateinfo;
            if (!flag) goto _L2; else goto _L1
_L1:
            transitionTo(mQuittingState);
_L4:
            StateInfo stateinfo2;
            if (stateinfo != null)
            {
                return stateinfo.state;
            } else
            {
                return null;
            }
_L6:
            stateinfo1 = stateinfo2;
            if (mDbg)
            {
                mSm.log((new StringBuilder("processMsg: ")).append(stateinfo2.state.getName()).toString());
                stateinfo1 = stateinfo2;
            }
_L2:
            stateinfo = stateinfo1;
            if (stateinfo1.state.processMessage(message)) goto _L4; else goto _L3
_L3:
            stateinfo2 = stateinfo1.parentStateInfo;
            if (stateinfo2 != null) goto _L6; else goto _L5
_L5:
            StateMachine statemachine = mSm;
            stateinfo = stateinfo2;
            if (statemachine.mSmHandler.mDbg)
            {
                message = (new StringBuilder(" - unhandledMessage: msg.what=")).append(statemachine.getWhatToString(message.what)).toString();
                Log.e(statemachine.mName, message);
                stateinfo = stateinfo2;
            }
              goto _L4
        }

        private final void setupInitialStateStack()
        {
            if (mDbg)
            {
                mSm.log((new StringBuilder("setupInitialStateStack: E mInitialState=")).append(mInitialState.getName()).toString());
            }
            StateInfo stateinfo = (StateInfo)mStateInfo.get(mInitialState);
            for (mTempStateStackCount = 0; stateinfo != null; mTempStateStackCount = mTempStateStackCount + 1)
            {
                mTempStateStack[mTempStateStackCount] = stateinfo;
                stateinfo = stateinfo.parentStateInfo;
            }

            mStateStackTopIndex = -1;
            moveTempStateStackToStateStack();
        }

        private final void transitionTo(IState istate)
        {
            mDestState = (State)istate;
            if (mDbg)
            {
                mSm.log((new StringBuilder("transitionTo: destState=")).append(mDestState.getName()).toString());
            }
        }

        public final void handleMessage(Message message)
        {
            if (mHasQuit) goto _L2; else goto _L1
_L1:
            Object obj;
            if (mDbg)
            {
                mSm.log((new StringBuilder("handleMessage: E msg.what=")).append(mSm.getWhatToString(message.what)).toString());
            }
            obj = mSm;
            if (message.what != -3) goto _L4; else goto _L3
_L3:
            if (obj != null)
            {
                obj.mIdleSequenceNumOut = ((StateMachine) (obj)).mIdleSequenceNumOut + 1;
            }
_L6:
            if (mDbg && mSm != null)
            {
                mSm.log("handleMessage: X");
            }
_L2:
            return;
_L4:
            if (message.what == -4)
            {
                Message message1 = (Message)message.obj;
                handleMessage(message1);
                if (obj != null)
                {
                    synchronized (((StateMachine) (obj)).mOutstandingMessagesLock)
                    {
                        obj.mOutstandingMessages = ((StateMachine) (obj)).mOutstandingMessages - 1;
                        if (((StateMachine) (obj)).mOutstandingMessages == 0)
                        {
                            LinkedList linkedlist = ((mHasQuit) (this)).mHasQuit;
                        }
                    }
                }
                message1.recycle();
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_176;
            exception;
            message;
            JVM INSTR monitorexit ;
            throw exception;
            mMsg = message;
            exception = null;
            if (!mIsConstructionCompleted)
            {
                break; /* Loop/switch isn't completed */
            }
            exception = processMsg(message);
_L8:
            performTransitions(exception, message);
            if (true) goto _L6; else goto _L5
_L5:
            if (!mIsConstructionCompleted && mMsg.what == -2 && mMsg.obj == mSmHandlerObj)
            {
                mIsConstructionCompleted = true;
                invokeEnterMethods(0);
            } else
            {
                throw new RuntimeException((new StringBuilder("StateMachine.handleMessage: The start method not called, received msg: ")).append(message).toString());
            }
            if (true) goto _L8; else goto _L7
_L7:
            if (true) goto _L6; else goto _L9
_L9:
        }




/*
        public static void access$1400(SmHandler smhandler, State state)
        {
            if (smhandler.mDbg)
            {
                smhandler.mSm.log((new StringBuilder("setInitialState: initialState=")).append(state.getName()).toString());
            }
            smhandler.mInitialState = state;
            return;
        }

*/





/*
        public static void access$1900(SmHandler smhandler, Message message)
        {
            if (smhandler.mDbg)
            {
                smhandler.mSm.log((new StringBuilder("deferMessage: msg=")).append(smhandler.mSm.getWhatToString(message.what)).toString());
            }
            Message message1 = smhandler.obtainMessage();
            message1.copyFrom(message);
            smhandler.mDeferredMessages.add(message1);
            return;
        }

*/






/*
        public static void access$2700(SmHandler smhandler)
        {
            if (smhandler.mDbg)
            {
                smhandler.mSm.log("quit:");
            }
            smhandler.sendMessage(smhandler.obtainMessage(-1, mSmHandlerObj));
            return;
        }

*/





/*
        static void access$3100(SmHandler smhandler)
        {
            if (smhandler.mDbg)
            {
                smhandler.mSm.log("completeConstruction: E");
            }
            Iterator iterator = smhandler.mStateInfo.values().iterator();
            int i = 0;
            while (iterator.hasNext()) 
            {
                StateInfo stateinfo = (StateInfo)iterator.next();
                int j;
                for (j = 0; stateinfo != null; j++)
                {
                    stateinfo = stateinfo.parentStateInfo;
                }

                if (i >= j)
                {
                    j = i;
                }
                i = j;
            }
            if (smhandler.mDbg)
            {
                smhandler.mSm.log((new StringBuilder("completeConstruction: maxDepth=")).append(i).toString());
            }
            smhandler.mStateStack = new StateInfo[i];
            smhandler.mTempStateStack = new StateInfo[i];
            smhandler.setupInitialStateStack();
            smhandler.mSm.sendMessageAtFrontOfQueue(smhandler.obtainMessage(-2, mSmHandlerObj));
            if (smhandler.mDbg)
            {
                smhandler.mSm.log("completeConstruction: X");
            }
            return;
        }

*/

        private SmHandler(Looper looper, StateMachine statemachine)
        {
            super(looper);
            mHasQuit = false;
            mDbg = false;
            mLogRecords = new LogRecords((byte)0);
            mStateStackTopIndex = -1;
            mHaltingState = new HaltingState((byte)0);
            mQuittingState = new QuittingState((byte)0);
            mStateInfo = new HashMap();
            mDeferredMessages = new ArrayList();
            mSm = statemachine;
            addState(mHaltingState, null);
            addState(mQuittingState, null);
        }

        SmHandler(Looper looper, StateMachine statemachine, byte byte0)
        {
            this(looper, statemachine);
        }
    }

    private final class SmHandler.HaltingState extends State
    {

        final SmHandler this$0;

        public final boolean processMessage(Message message)
        {
            StateMachine _tmp = mSm;
            return true;
        }

        private SmHandler.HaltingState()
        {
            this$0 = SmHandler.this;
            super();
        }

        SmHandler.HaltingState(byte byte0)
        {
            this();
        }
    }

    private final class SmHandler.QuittingState extends State
    {

        final SmHandler this$0;

        public final boolean processMessage(Message message)
        {
            return false;
        }

        private SmHandler.QuittingState()
        {
            this$0 = SmHandler.this;
            super();
        }

        SmHandler.QuittingState(byte byte0)
        {
            this();
        }
    }

    private final class SmHandler.StateInfo
    {

        boolean active;
        SmHandler.StateInfo parentStateInfo;
        State state;
        final SmHandler this$0;

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder("state=")).append(state.getName()).append(",active=").append(active).append(",parent=");
            String s;
            if (parentStateInfo == null)
            {
                s = "null";
            } else
            {
                s = parentStateInfo.state.getName();
            }
            return stringbuilder.append(s).toString();
        }

        private SmHandler.StateInfo()
        {
            this$0 = SmHandler.this;
            super();
        }

        SmHandler.StateInfo(byte byte0)
        {
            this();
        }
    }


    private boolean mIdleNotificationEnabled;
    private AtomicInteger mIdleSequenceNumIn;
    int mIdleSequenceNumOut;
    private boolean mIsStarted;
    String mName;
    private final LinkedList mOutstandingIdleNotifications;
    int mOutstandingMessages;
    final Object mOutstandingMessagesLock;
    public SmHandler mSmHandler;
    HandlerThread mSmThread;
    final WakeLock mWakeLock;

    public StateMachine(String s)
    {
        this(s, (byte)0);
    }

    private StateMachine(String s, byte byte0)
    {
        mOutstandingMessagesLock = new Object();
        mOutstandingIdleNotifications = new LinkedList();
        mIdleSequenceNumIn = new AtomicInteger();
        mIdleSequenceNumOut = 0;
        mSmThread = new HandlerThread(s);
        mSmThread.start();
        Looper looper = mSmThread.getLooper();
        mName = s;
        mWakeLock = null;
        mSmHandler = new SmHandler(looper, this, (byte)0);
    }

    private static void checkState(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public final void dump$dcd0ff(PrintWriter printwriter)
    {
        printwriter.println((new StringBuilder()).append(mName).append(":").toString());
        StringBuilder stringbuilder = new StringBuilder(" total records=");
        SmHandler smhandler = mSmHandler;
        int i;
        if (smhandler == null)
        {
            i = 0;
        } else
        {
            i = smhandler.mLogRecords.count();
        }
        printwriter.println(stringbuilder.append(i).toString());
        i = 0;
        do
        {
            Object obj = mSmHandler;
            int j;
            if (obj == null)
            {
                j = 0;
            } else
            {
                j = ((SmHandler) (obj)).mLogRecords.size();
            }
            if (i < j)
            {
                obj = mSmHandler;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((SmHandler) (obj)).mLogRecords.get(i);
                }
                printwriter.printf(" rec[%d]: %s\n", new Object[] {
                    Integer.valueOf(i), ((LogRec) (obj)).toString()
                });
                printwriter.flush();
                i++;
            } else
            {
                printwriter.println((new StringBuilder("curState=")).append(getCurrentState().getName()).toString());
                return;
            }
        } while (true);
    }

    public final IState getCurrentState()
    {
        SmHandler smhandler = mSmHandler;
        if (smhandler == null)
        {
            return null;
        } else
        {
            return ((toString) (smhandler)).toString;
        }
    }

    public String getWhatToString(int i)
    {
        switch (i)
        {
        default:
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(i);
            stringbuilder.append("(0x");
            stringbuilder.append(Integer.toHexString(i));
            stringbuilder.append(")");
            return stringbuilder.toString();

        case -2: 
            return "SM_INIT_CMD";

        case -1: 
            return "SM_QUIT_CMD";

        case -3: 
            return "SM_WAIT_IDLE_CMD";

        case -4: 
            return "SM_WRAPPED_MESSAGE";
        }
    }

    protected final void log(String s)
    {
        Log.d(mName, s);
    }

    public final void logAndAddLogRec(String s)
    {
        SmHandler smhandler = mSmHandler;
        if (smhandler != null)
        {
            smhandler.mLogRecords.add(this, smhandler.mMsg, s, ((toString) (smhandler)).toString, smhandler.mStateStack[smhandler.mStateStackTopIndex].state, smhandler.mDestState);
        }
        smhandler = mSmHandler;
        boolean flag;
        if (smhandler == null)
        {
            flag = false;
        } else
        {
            flag = smhandler.mDbg;
        }
        if (flag)
        {
            log(s);
        }
    }

    public final Message obtainMessage(int i, Object obj)
    {
        return Message.obtain(mSmHandler, i, obj);
    }

    public final void sendMessage(int i, Object obj)
    {
        obj = obtainMessage(i, obj);
        SmHandler smhandler = mSmHandler;
        if (smhandler != null)
        {
            smhandler.sendMessage(wrapIfNeeded(((Message) (obj))));
        }
    }

    public final void sendMessageAtFrontOfQueue(int i, Object obj)
    {
        sendMessageAtFrontOfQueue(obtainMessage(i, obj));
    }

    protected final void sendMessageAtFrontOfQueue(Message message)
    {
        SmHandler smhandler = mSmHandler;
        if (smhandler == null)
        {
            return;
        } else
        {
            smhandler.sendMessageAtFrontOfQueue(wrapIfNeeded(message));
            return;
        }
    }

    public final void setDbg(boolean flag)
    {
        SmHandler smhandler = mSmHandler;
        if (smhandler == null)
        {
            return;
        } else
        {
            smhandler.mDbg = flag;
            return;
        }
    }

    public final void setLogRecSize(int i)
    {
        mSmHandler.mLogRecords.setSize(i);
    }

    public final void setWaitIdleNotificationEnabled(boolean flag)
    {
        boolean flag1;
        if (!mIsStarted)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        checkState(flag1, "setWaitIdleNotificationEnabled cannot be called after start().");
        mIdleNotificationEnabled = flag;
    }

    public final void start()
    {
        SmHandler smhandler = mSmHandler;
        if (smhandler == null)
        {
            return;
        } else
        {
            SmHandler.access._mth3100(smhandler);
            mIsStarted = true;
            return;
        }
    }

    public final Message wrapIfNeeded(Message message)
    {
        obj = message;
        if (mIdleNotificationEnabled)
        {
            synchronized (mOutstandingMessagesLock)
            {
                mOutstandingMessages = mOutstandingMessages + 1;
            }
            obj = obtainMessage(-4, message);
        }
        return ((Message) (obj));
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }


/*
    static void access$700(StateMachine statemachine, int i)
    {
        LinkedList linkedlist = statemachine.mOutstandingIdleNotifications;
        linkedlist;
        JVM INSTR monitorenter ;
        statemachine = statemachine.mOutstandingIdleNotifications.listIterator();
        do
        {
            if (!statemachine.hasNext())
            {
                break;
            }
            SmWaitIdleCmdData smwaitidlecmddata = (SmWaitIdleCmdData)statemachine.next();
            if (i >= smwaitidlecmddata.sequenceNumber)
            {
                smwaitidlecmddata.countDownLatch.countDown();
                statemachine.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_63;
        statemachine;
        linkedlist;
        JVM INSTR monitorexit ;
        throw statemachine;
        linkedlist;
        JVM INSTR monitorexit ;
        return;
    }

*/
}
