// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

public abstract class ResultProcessor
{

    private FacebookCallback appCallback;

    public ResultProcessor(FacebookCallback facebookcallback)
    {
        appCallback = facebookcallback;
    }

    public void onCancel(AppCall appcall)
    {
        if (appCallback != null)
        {
            appCallback.onCancel();
        }
    }

    public void onError(AppCall appcall, FacebookException facebookexception)
    {
        if (appCallback != null)
        {
            appCallback.onError(facebookexception);
        }
    }

    public abstract void onSuccess(AppCall appcall, Bundle bundle);
}
