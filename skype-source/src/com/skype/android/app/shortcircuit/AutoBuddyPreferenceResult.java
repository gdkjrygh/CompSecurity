// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;


public class AutoBuddyPreferenceResult
{

    private boolean isOptionEnabled;
    private boolean isUpdateRequest;
    private boolean isUpdated;

    public AutoBuddyPreferenceResult()
    {
    }

    public boolean isOptionEnabled()
    {
        return isOptionEnabled;
    }

    public boolean isUpdateRequest()
    {
        return isUpdateRequest;
    }

    public boolean isUpdated()
    {
        return isUpdated;
    }

    void setOptionEnabled(boolean flag)
    {
        isOptionEnabled = flag;
    }

    void setUpdateRequest(boolean flag)
    {
        isUpdateRequest = flag;
    }

    void setUpdated(boolean flag)
    {
        isUpdated = flag;
    }
}
