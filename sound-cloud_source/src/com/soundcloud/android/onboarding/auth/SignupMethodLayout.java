// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import a.a;
import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthLayout

public class SignupMethodLayout extends AuthLayout
{
    public static interface SignUpMethodHandler
        extends AuthLayout.AuthHandler
    {

        public abstract void onEmailAuth();
    }


    private SignUpMethodHandler handler;

    public SignupMethodLayout(Context context)
    {
        super(context);
    }

    public SignupMethodLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SignupMethodLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected volatile AuthLayout.AuthHandler getAuthHandler()
    {
        return getAuthHandler();
    }

    protected SignUpMethodHandler getAuthHandler()
    {
        return handler;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a.a(this);
    }

    void onSignUpWithEmailClicked()
    {
        handler.onEmailAuth();
    }

    public void setSignUpMethodHandler(SignUpMethodHandler signupmethodhandler)
    {
        handler = signupmethodhandler;
    }
}
