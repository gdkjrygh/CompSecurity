// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.state;

import android.os.Message;
import java.util.Vector;

// Referenced classes of package com.google.android.gms.common.util.state:
//            StateMachine, IState

private static final class <init>
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
        mLogRecVector.add(new t>(statemachine, message, s, istate, istate1, istate2));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        <init> <init>1 = (t>)mLogRecVector.get(mOldestIndex);
        mOldestIndex = mOldestIndex + 1;
        if (mOldestIndex >= mMaxSize)
        {
            mOldestIndex = 0;
        }
        <init>1.te(statemachine, message, s, istate, istate1, istate2);
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

    final mCount get(int i)
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
        mCount mcount = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return mcount;
_L2:
        mcount = (size)mLogRecVector.get(i);
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

    private ()
    {
        mLogRecVector = new Vector();
        mMaxSize = 20;
        mOldestIndex = 0;
        mCount = 0;
        mLogOnlyTransitions = false;
    }

    mLogOnlyTransitions(byte byte0)
    {
        this();
    }
}
