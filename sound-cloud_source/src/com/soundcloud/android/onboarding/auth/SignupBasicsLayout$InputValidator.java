// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupBasicsLayout

private abstract class this._cls0 extends com.soundcloud.android.utils.Validator
{

    final SignupBasicsLayout this$0;

    public void validate(TextView textview, String s)
    {
        if (validate(s))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(null, null, SignupBasicsLayout.access$100(SignupBasicsLayout.this), null);
        } else
        {
            textview.setCompoundDrawables(null, null, SignupBasicsLayout.access$200(SignupBasicsLayout.this), null);
        }
        SignupBasicsLayout.access$300(SignupBasicsLayout.this);
    }

    abstract boolean validate(String s);

    public (TextView textview)
    {
        this$0 = SignupBasicsLayout.this;
        super(textview);
    }
}
