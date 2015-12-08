// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import java.util.ArrayList;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchListener

public final class PlaySearchController
{

    String mCurrentQuery;
    int mCurrentSearchMode;
    final ArrayList mListeners = new ArrayList();
    android.view.View.OnClickListener mNavigationClickListener;
    private int mSteadyStateMode;

    public PlaySearchController()
    {
        mSteadyStateMode = 1;
        mCurrentQuery = "";
    }

    public final void addPlaySearchListener(PlaySearchListener playsearchlistener)
    {
        mListeners.add(playsearchlistener);
    }

    public final boolean isInSteadyStateMode()
    {
        return mCurrentSearchMode == mSteadyStateMode;
    }

    final void notifyQueryChangeInternal(boolean flag)
    {
        for (int i = mListeners.size() - 1; i >= 0; i--)
        {
            ((PlaySearchListener)mListeners.get(i)).onQueryChanged$505cbf4b(mCurrentQuery);
        }

    }

    public final void onSearch()
    {
        for (int i = mListeners.size() - 1; i >= 0; i--)
        {
            ((PlaySearchListener)mListeners.get(i)).onSearch$552c4e01();
        }

    }

    public final void removePlaySearchListener(PlaySearchListener playsearchlistener)
    {
        mListeners.remove(playsearchlistener);
    }

    public final void setMode(int i)
    {
        if (mCurrentSearchMode != i)
        {
            mCurrentSearchMode = i;
            int j = mListeners.size() - 1;
            while (j >= 0) 
            {
                ((PlaySearchListener)mListeners.get(j)).onModeChanged(i);
                j--;
            }
        }
    }

    final void setQueryInternal(String s, boolean flag)
    {
        if (mCurrentQuery.equals(s))
        {
            return;
        } else
        {
            mCurrentQuery = s;
            notifyQueryChangeInternal(flag);
            return;
        }
    }

    public final void switchToSteadyStateMode()
    {
        setMode(mSteadyStateMode);
    }
}
