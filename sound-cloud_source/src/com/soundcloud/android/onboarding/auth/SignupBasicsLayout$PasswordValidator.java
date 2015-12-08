// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;


// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupBasicsLayout

private class it> extends it>
{

    final SignupBasicsLayout this$0;

    boolean validate(String s)
    {
        SignupBasicsLayout.access$502(SignupBasicsLayout.this, SignupBasicsLayout.checkPassword(s));
        return SignupBasicsLayout.access$500(SignupBasicsLayout.this);
    }

    public Q()
    {
        this$0 = SignupBasicsLayout.this;
        super(SignupBasicsLayout.this, passwordField);
    }
}
