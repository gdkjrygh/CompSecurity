// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content_public.browser;

import java.util.ArrayList;

// Referenced classes of package org.chromium.content_public.browser:
//            NavigationEntry

public class NavigationHistory
{

    private int mCurrentEntryIndex;
    private final ArrayList mEntries = new ArrayList();

    public NavigationHistory()
    {
    }

    public void addEntry(NavigationEntry navigationentry)
    {
        mEntries.add(navigationentry);
    }

    public int getCurrentEntryIndex()
    {
        return mCurrentEntryIndex;
    }

    public NavigationEntry getEntryAtIndex(int i)
    {
        return (NavigationEntry)mEntries.get(i);
    }

    public int getEntryCount()
    {
        return mEntries.size();
    }

    public void setCurrentEntryIndex(int i)
    {
        mCurrentEntryIndex = i;
    }
}
