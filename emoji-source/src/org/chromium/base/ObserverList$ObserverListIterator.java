// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.NoSuchElementException;

// Referenced classes of package org.chromium.base:
//            ObserverList

private class <init>
    implements <init>
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
            ObserverList.access$400(ObserverList.this);
        }
    }

    public boolean hasNext()
    {
        int i;
        for (i = mIndex; i < mListEndMarker && ObserverList.access$300(ObserverList.this, i) == null; i++) { }
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
        for (; mIndex < mListEndMarker && ObserverList.access$300(ObserverList.this, mIndex) == null; mIndex = mIndex + 1) { }
        if (mIndex < mListEndMarker)
        {
            ObserverList observerlist = ObserverList.this;
            int i = mIndex;
            mIndex = i + 1;
            return ObserverList.access$300(observerlist, i);
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
        ObserverList.access$100(ObserverList.this);
        mListEndMarker = ObserverList.access$200(ObserverList.this);
        mIsExhausted = false;
        mIndex = 0;
    }

    private _cls9()
    {
        this$0 = ObserverList.this;
        super();
        mIndex = 0;
        mIsExhausted = false;
        ObserverList.access$100(ObserverList.this);
        mListEndMarker = ObserverList.access$200(ObserverList.this);
    }

    mListEndMarker(mListEndMarker mlistendmarker)
    {
        this();
    }
}
