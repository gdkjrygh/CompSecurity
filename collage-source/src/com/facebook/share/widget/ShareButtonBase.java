// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;

public abstract class ShareButtonBase extends FacebookButtonBase
{

    private boolean enabledExplicitlySet;
    private int requestCode;
    private ShareContent shareContent;

    protected ShareButtonBase(Context context, AttributeSet attributeset, int i, String s, String s1)
    {
        super(context, attributeset, i, 0, s, s1);
        requestCode = 0;
        enabledExplicitlySet = false;
        if (isInEditMode())
        {
            i = 0;
        } else
        {
            i = getDefaultRequestCode();
        }
        requestCode = i;
        internalSetEnabled(false);
    }

    private void internalSetEnabled(boolean flag)
    {
        setEnabled(flag);
        enabledExplicitlySet = false;
    }

    protected boolean canShare()
    {
        return getDialog().canShow(getShareContent());
    }

    protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
    {
        super.configureButton(context, attributeset, i, j);
        setInternalOnClickListener(getShareOnClickListener());
    }

    protected abstract FacebookDialogBase getDialog();

    public int getRequestCode()
    {
        return requestCode;
    }

    public ShareContent getShareContent()
    {
        return shareContent;
    }

    protected android.view.View.OnClickListener getShareOnClickListener()
    {
        return new android.view.View.OnClickListener() {

            final ShareButtonBase this$0;

            public void onClick(View view)
            {
                callExternalOnClickListener(view);
                getDialog().show(getShareContent());
            }

            
            {
                this$0 = ShareButtonBase.this;
                super();
            }
        };
    }

    public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
    {
        ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackmanager, facebookcallback);
    }

    public void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback, int i)
    {
        setRequestCode(i);
        registerCallback(callbackmanager, facebookcallback);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        enabledExplicitlySet = true;
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
        if (!enabledExplicitlySet)
        {
            internalSetEnabled(canShare());
        }
    }

}
