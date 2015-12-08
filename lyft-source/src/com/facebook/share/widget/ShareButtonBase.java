// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;

public abstract class ShareButtonBase extends FacebookButtonBase
{

    private int requestCode;
    private ShareContent shareContent;

    protected ShareButtonBase(Context context, AttributeSet attributeset, int i, String s, String s1)
    {
        boolean flag = false;
        super(context, attributeset, i, 0, s, s1);
        requestCode = 0;
        if (isInEditMode())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = getDefaultRequestCode();
        }
        requestCode = i;
    }

    protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
    {
        super.configureButton(context, attributeset, i, j);
        setInternalOnClickListener(getShareOnClickListener());
    }

    public int getRequestCode()
    {
        return requestCode;
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

    protected void setRequestCode(int i)
    {
        if (FacebookSdk.isFacebookRequestCode(i))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Request code ").append(i).append(" cannot be within the range reserved by the Facebook SDK.").toString());
        } else
        {
            requestCode = i;
            return;
        }
    }

    public void setShareContent(ShareContent sharecontent)
    {
        shareContent = sharecontent;
    }
}
