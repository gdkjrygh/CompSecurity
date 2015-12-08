// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


public final class CircularArray
{

    private int mCapacityBitmask;
    private Object mElements[];
    private int mHead;
    private int mTail;

    public CircularArray()
    {
        this(8);
    }

    public CircularArray(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("capacity must be positive");
        }
        int j = i;
        if (Integer.bitCount(i) != 1)
        {
            j = 1 << Integer.highestOneBit(i) + 1;
        }
        mCapacityBitmask = j - 1;
        mElements = (Object[])new Object[j];
    }

    private void doubleCapacity()
    {
        int i = mElements.length;
        int j = i - mHead;
        int k = i << 1;
        if (k < 0)
        {
            throw new RuntimeException("Max array capacity exceeded");
        } else
        {
            Object aobj[] = new Object[k];
            System.arraycopy(((Object) (mElements)), mHead, ((Object) (aobj)), 0, j);
            System.arraycopy(((Object) (mElements)), 0, ((Object) (aobj)), j, mHead);
            mElements = (Object[])aobj;
            mHead = 0;
            mTail = i;
            mCapacityBitmask = k - 1;
            return;
        }
    }

    public final void addFirst(Object obj)
    {
        mHead = mHead - 1 & mCapacityBitmask;
        mElements[mHead] = obj;
        if (mHead == mTail)
        {
            doubleCapacity();
        }
    }

    public final void addLast(Object obj)
    {
        mElements[mTail] = obj;
        mTail = mTail + 1 & mCapacityBitmask;
        if (mTail == mHead)
        {
            doubleCapacity();
        }
    }

    public final void clear()
    {
        removeFromStart(size());
    }

    public final Object get(int i)
    {
        if (i < 0 || i >= size())
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return mElements[mHead + i & mCapacityBitmask];
        }
    }

    public final Object getFirst()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return mElements[mHead];
        }
    }

    public final Object getLast()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return mElements[mTail - 1 & mCapacityBitmask];
        }
    }

    public final boolean isEmpty()
    {
        return mHead == mTail;
    }

    public final Object popFirst()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            Object obj = mElements[mHead];
            mElements[mHead] = null;
            mHead = mHead + 1 & mCapacityBitmask;
            return obj;
        }
    }

    public final Object popLast()
    {
        if (mHead == mTail)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            int i = mTail - 1 & mCapacityBitmask;
            Object obj = mElements[i];
            mElements[i] = null;
            mTail = i;
            return obj;
        }
    }

    public final void removeFromEnd(int i)
    {
        if (i > 0)
        {
            if (i > size())
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            int j = 0;
            if (i < mTail)
            {
                j = mTail - i;
            }
            for (int l = j; l < mTail; l++)
            {
                mElements[l] = null;
            }

            j = mTail - j;
            i -= j;
            mTail = mTail - j;
            if (i > 0)
            {
                mTail = mElements.length;
                int k = mTail - i;
                for (i = k; i < mTail; i++)
                {
                    mElements[i] = null;
                }

                mTail = k;
                return;
            }
        }
    }

    public final void removeFromStart(int i)
    {
        if (i > 0)
        {
            if (i > size())
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            int k = mElements.length;
            int j = k;
            if (i < k - mHead)
            {
                j = mHead + i;
            }
            for (k = mHead; k < j; k++)
            {
                mElements[k] = null;
            }

            k = j - mHead;
            j = i - k;
            mHead = k + mHead & mCapacityBitmask;
            if (j > 0)
            {
                for (i = 0; i < j; i++)
                {
                    mElements[i] = null;
                }

                mHead = j;
                return;
            }
        }
    }

    public final int size()
    {
        return mTail - mHead & mCapacityBitmask;
    }
}
