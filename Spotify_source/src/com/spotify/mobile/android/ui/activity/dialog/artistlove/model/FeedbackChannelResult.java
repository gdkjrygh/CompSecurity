// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog.artistlove.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public class FeedbackChannelResult
    implements JacksonModel
{

    private List mShares;

    public FeedbackChannelResult(List list)
    {
        mShares = list;
    }

    public List getShares()
    {
        return mShares;
    }

    public void setShares(List list)
    {
        mShares = list;
    }
}
