// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//            SortedList

public static class mWrappedCallback extends mWrappedCallback
{

    static final int TYPE_ADD = 1;
    static final int TYPE_CHANGE = 3;
    static final int TYPE_MOVE = 4;
    static final int TYPE_NONE = 0;
    static final int TYPE_REMOVE = 2;
    int mLastEventCount;
    int mLastEventPosition;
    int mLastEventType;
    private final mLastEventType mWrappedCallback;

    public boolean areContentsTheSame(Object obj, Object obj1)
    {
        return mWrappedCallback.entsTheSame(obj, obj1);
    }

    public boolean areItemsTheSame(Object obj, Object obj1)
    {
        return mWrappedCallback.sTheSame(obj, obj1);
    }

    public int compare(Object obj, Object obj1)
    {
        return mWrappedCallback.(obj, obj1);
    }

    public void dispatchLastEvent()
    {
        if (mLastEventType == 0)
        {
            return;
        }
        mLastEventType;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 46
    //                   2 64
    //                   3 82;
           goto _L1 _L2 _L3 _L4
_L1:
        mLastEventType = 0;
        return;
_L2:
        mWrappedCallback.ted(mLastEventPosition, mLastEventCount);
        continue; /* Loop/switch isn't completed */
_L3:
        mWrappedCallback.ed(mLastEventPosition, mLastEventCount);
        continue; /* Loop/switch isn't completed */
_L4:
        mWrappedCallback.ed(mLastEventPosition, mLastEventCount);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onChanged(int i, int j)
    {
        if (mLastEventType == 3 && i <= mLastEventPosition + mLastEventCount && i + j >= mLastEventPosition)
        {
            int k = mLastEventPosition;
            int l = mLastEventCount;
            mLastEventPosition = Math.min(i, mLastEventPosition);
            mLastEventCount = Math.max(k + l, i + j) - mLastEventPosition;
            return;
        } else
        {
            dispatchLastEvent();
            mLastEventPosition = i;
            mLastEventCount = j;
            mLastEventType = 3;
            return;
        }
    }

    public void onInserted(int i, int j)
    {
        if (mLastEventType == 1 && i >= mLastEventPosition && i <= mLastEventPosition + mLastEventCount)
        {
            mLastEventCount = mLastEventCount + j;
            mLastEventPosition = Math.min(i, mLastEventPosition);
            return;
        } else
        {
            dispatchLastEvent();
            mLastEventPosition = i;
            mLastEventCount = j;
            mLastEventType = 1;
            return;
        }
    }

    public void onMoved(int i, int j)
    {
        dispatchLastEvent();
        mWrappedCallback.(i, j);
    }

    public void onRemoved(int i, int j)
    {
        if (mLastEventType == 2 && mLastEventPosition == i)
        {
            mLastEventCount = mLastEventCount + j;
            return;
        } else
        {
            dispatchLastEvent();
            mLastEventPosition = i;
            mLastEventCount = j;
            mLastEventType = 2;
            return;
        }
    }


    public ( )
    {
        mLastEventType = 0;
        mLastEventPosition = -1;
        mLastEventCount = -1;
        mWrappedCallback = ;
    }
}
