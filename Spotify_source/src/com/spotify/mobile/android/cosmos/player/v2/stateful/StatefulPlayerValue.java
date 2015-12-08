// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;


class StatefulPlayerValue
{

    private long mLastUpdateTimestamp;
    private int mLocalUpdateCounter;
    private boolean mValue;

    StatefulPlayerValue()
    {
    }

    public int getUpdateCounter()
    {
        return mLocalUpdateCounter;
    }

    public boolean getValue()
    {
        return mValue;
    }

    public boolean hasLocalChanges()
    {
        return mLocalUpdateCounter > 0;
    }

    public Rendezvous rendezvous()
    {
        return new Rendezvous();
    }

    public boolean updateValue(boolean flag, long l, boolean flag1)
    {
        while (flag == mValue || l <= mLastUpdateTimestamp) 
        {
            return false;
        }
        if (flag1)
        {
            mLocalUpdateCounter = mLocalUpdateCounter + 1;
        } else
        if (hasLocalChanges())
        {
            return false;
        }
        mLastUpdateTimestamp = l;
        mValue = flag;
        return true;
    }



/*
    static int access$002(StatefulPlayerValue statefulplayervalue, int i)
    {
        statefulplayervalue.mLocalUpdateCounter = i;
        return i;
    }

*/

    private class Rendezvous
    {

        private int mUpdateCounter;
        final StatefulPlayerValue this$0;

        public boolean tryComplete()
        {
            if (mLocalUpdateCounter != mUpdateCounter)
            {
                return false;
            } else
            {
                mLocalUpdateCounter = 0;
                return true;
            }
        }

        public Rendezvous()
        {
            this$0 = StatefulPlayerValue.this;
            super();
            mUpdateCounter = mLocalUpdateCounter;
        }
    }

}
