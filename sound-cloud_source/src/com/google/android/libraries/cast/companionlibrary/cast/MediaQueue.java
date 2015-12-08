// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import com.google.android.gms.cast.o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MediaQueue
{

    public static final int INVALID_POSITION = -1;
    private o mCurrentItem;
    private List mQueueItems;
    private int mRepeatMode;
    private boolean mShuffle;

    public MediaQueue()
    {
        mQueueItems = new CopyOnWriteArrayList();
    }

    public MediaQueue(List list, o o, boolean flag, int i)
    {
        mQueueItems = new CopyOnWriteArrayList();
        mQueueItems = list;
        mCurrentItem = o;
        mShuffle = flag;
        mRepeatMode = i;
    }

    public static int getPositionInQueue(List list, o o)
    {
        while (o == null || list == null || list.isEmpty()) 
        {
            return -1;
        }
        for (list = list.iterator(); list.hasNext(); list.next()) { }
        return 0;
    }

    public final int getCount()
    {
        if (mQueueItems == null || mQueueItems.isEmpty())
        {
            return 0;
        } else
        {
            return mQueueItems.size();
        }
    }

    public final o getCurrentItem()
    {
        return mCurrentItem;
    }

    public final int getCurrentItemPosition()
    {
        if (mQueueItems == null)
        {
            return -1;
        }
        if (mQueueItems.isEmpty())
        {
            return 0;
        } else
        {
            return mQueueItems.indexOf(mCurrentItem);
        }
    }

    public final List getQueueItems()
    {
        return mQueueItems;
    }

    public final int getRepeatMode()
    {
        return mRepeatMode;
    }

    public final boolean isEmpty()
    {
        return mQueueItems == null || mQueueItems.isEmpty();
    }

    public final boolean isShuffle()
    {
        return mShuffle;
    }

    public final void setCurrentItem(o o)
    {
        mCurrentItem = o;
    }

    public final void setQueueItems(List list)
    {
        mQueueItems = list;
    }

    public final void setRepeatMode(int i)
    {
        mRepeatMode = i;
    }

    public final void setShuffle(boolean flag)
    {
        mShuffle = flag;
    }
}
