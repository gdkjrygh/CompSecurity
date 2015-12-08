// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class ModificationModel
    implements JacksonModel
{

    private final String mError;
    private final boolean mSuccess;

    public ModificationModel(String s, boolean flag)
    {
        mError = s;
        mSuccess = flag;
    }

    public String getError()
    {
        return mError;
    }

    public boolean isSuccess()
    {
        return mSuccess;
    }
}
