// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public abstract class AuthLayout extends RelativeLayout
{
    public static interface AuthHandler
    {

        public abstract void onFacebookAuth();

        public abstract void onGooglePlusAuth();
    }


    public AuthLayout(Context context)
    {
        super(context);
    }

    public AuthLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AuthLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected abstract AuthHandler getAuthHandler();

    public void onFacebookClick()
    {
        getAuthHandler().onFacebookAuth();
    }

    public void onGooglePlusClick()
    {
        getAuthHandler().onGooglePlusAuth();
    }

    public void setGooglePlusVisibility(boolean flag)
    {
        View view = findViewById(0x7f0f00b1);
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }
}
