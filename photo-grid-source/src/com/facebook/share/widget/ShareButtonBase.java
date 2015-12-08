// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;

public abstract class ShareButtonBase extends FacebookButtonBase
{

    private ShareContent shareContent;

    protected ShareButtonBase(Context context, AttributeSet attributeset, int i, String s, int j)
    {
        super(context, attributeset, i, 0, s, j);
    }

    protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
    {
        super.configureButton(context, attributeset, i, j);
        setInternalOnClickListener(getShareOnClickListener());
    }

    public ShareContent getShareContent()
    {
        return shareContent;
    }

    protected abstract android.view.View.OnClickListener getShareOnClickListener();

    public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
    {
        ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackmanager, facebookcallback);
    }

    public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback, int i)
    {
        setRequestCode(i);
        registerCallback(callbackmanager, facebookcallback);
    }

    public void setShareContent(ShareContent sharecontent)
    {
        shareContent = sharecontent;
    }
}
