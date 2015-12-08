// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.utils.ScTextUtils;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupBasicsLayout

private class <init> extends <init>
{

    final SignupBasicsLayout this$0;

    boolean validate(String s)
    {
        SignupBasicsLayout.access$402(SignupBasicsLayout.this, ScTextUtils.isEmail(s));
        return SignupBasicsLayout.access$400(SignupBasicsLayout.this);
    }

    public ()
    {
        this$0 = SignupBasicsLayout.this;
        super(SignupBasicsLayout.this, emailField);
    }
}
