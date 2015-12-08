// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            ApplicationStatus, ObserverList

private static class <init>
{

    private ObserverList mListeners;
    private int mStatus;

    public ObserverList getListeners()
    {
        return mListeners;
    }

    public int getStatus()
    {
        return mStatus;
    }

    public void setStatus(int i)
    {
        mStatus = i;
    }

    private ()
    {
        mStatus = 6;
        mListeners = new ObserverList();
    }

    mListeners(mListeners mlisteners)
    {
        this();
    }
}
