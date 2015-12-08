// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.queue.impl;

import com.digby.mm.android.library.events.queue.IBackoffManager;
import com.digby.mm.android.library.utils.Logger;

public class BackoffManager
    implements IBackoffManager
{

    private static final int mFirstBackoffValue = 1000;
    private int mBackoffValue;

    public BackoffManager()
    {
        mBackoffValue = 0;
    }

    public void decreaseBackoff()
    {
        if (mBackoffValue == 1000)
        {
            mBackoffValue = 0;
            return;
        }
        try
        {
            mBackoffValue = mBackoffValue / 2;
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("decreaseBackoff", exception);
        }
        return;
    }

    public int getBackoffValue()
    {
        return mBackoffValue;
    }

    public void increaseBackoff()
    {
        if (mBackoffValue == 0)
        {
            mBackoffValue = 1000;
            return;
        }
        try
        {
            mBackoffValue = mBackoffValue * 2;
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("increaseBackoff", exception);
        }
        return;
    }
}
