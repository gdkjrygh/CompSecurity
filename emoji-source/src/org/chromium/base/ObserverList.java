// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ObserverList
    implements Iterable
{
    private class ObserverListIterator
        implements RewindableIterator
    {

        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;
        final ObserverList this$0;

        private void compactListIfNeeded()
        {
            if (!mIsExhausted)
            {
                mIsExhausted = true;
                decrementIterationDepthAndCompactIfNeeded();
            }
        }

        public boolean hasNext()
        {
            int i;
            for (i = mIndex; i < mListEndMarker && getObserverAt(i) == null; i++) { }
            if (i < mListEndMarker)
            {
                return true;
            } else
            {
                compactListIfNeeded();
                return false;
            }
        }

        public Object next()
        {
            for (; mIndex < mListEndMarker && getObserverAt(mIndex) == null; mIndex = mIndex + 1) { }
            if (mIndex < mListEndMarker)
            {
                ObserverList observerlist = ObserverList.this;
                int i = mIndex;
                mIndex = i + 1;
                return observerlist.getObserverAt(i);
            } else
            {
                compactListIfNeeded();
                throw new NoSuchElementException();
            }
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public void rewind()
        {
            compactListIfNeeded();
            incrementIterationDepth();
            mListEndMarker = capacity();
            mIsExhausted = false;
            mIndex = 0;
        }

        private ObserverListIterator()
        {
            this$0 = ObserverList.this;
            super();
            mIndex = 0;
            mIsExhausted = false;
            incrementIterationDepth();
            mListEndMarker = capacity();
        }

    }

    public static interface RewindableIterator
        extends Iterator
    {

        public abstract void rewind();
    }


    static final boolean $assertionsDisabled;
    private int mCount;
    private int mIterationDepth;
    public final List mObservers = new ArrayList();

    public ObserverList()
    {
        mIterationDepth = 0;
        mCount = 0;
    }

    private int capacity()
    {
        return mObservers.size();
    }

    private void compact()
    {
        if (!$assertionsDisabled && mIterationDepth != 0)
        {
            throw new AssertionError();
        }
        for (int i = mObservers.size() - 1; i >= 0; i--)
        {
            if (mObservers.get(i) == null)
            {
                mObservers.remove(i);
            }
        }

    }

    private void decrementIterationDepthAndCompactIfNeeded()
    {
        mIterationDepth = mIterationDepth - 1;
        if (!$assertionsDisabled && mIterationDepth < 0)
        {
            throw new AssertionError();
        }
        if (mIterationDepth == 0)
        {
            compact();
        }
    }

    private Object getObserverAt(int i)
    {
        return mObservers.get(i);
    }

    private void incrementIterationDepth()
    {
        mIterationDepth = mIterationDepth + 1;
    }

    public boolean addObserver(Object obj)
    {
        if (obj == null || mObservers.contains(obj))
        {
            return false;
        }
        boolean flag = mObservers.add(obj);
        if (!$assertionsDisabled && !flag)
        {
            throw new AssertionError();
        } else
        {
            mCount = mCount + 1;
            return true;
        }
    }

    public void clear()
    {
        mCount = 0;
        if (mIterationDepth == 0)
        {
            mObservers.clear();
        } else
        {
            int j = mObservers.size();
            int i = 0;
            while (i < j) 
            {
                mObservers.set(i, null);
                i++;
            }
        }
    }

    public boolean hasObserver(Object obj)
    {
        return mObservers.contains(obj);
    }

    public boolean isEmpty()
    {
        return mCount == 0;
    }

    public Iterator iterator()
    {
        return new ObserverListIterator();
    }

    public boolean removeObserver(Object obj)
    {
        int i;
        if (obj != null)
        {
            if ((i = mObservers.indexOf(obj)) != -1)
            {
                if (mIterationDepth == 0)
                {
                    mObservers.remove(i);
                } else
                {
                    mObservers.set(i, null);
                }
                mCount = mCount - 1;
                if (!$assertionsDisabled && mCount < 0)
                {
                    throw new AssertionError();
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public RewindableIterator rewindableIterator()
    {
        return new ObserverListIterator();
    }

    public int size()
    {
        return mCount;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/ObserverList.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }




}
