// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupBasicsLayout

class val.target
    implements TextWatcher
{

    final er this$0;
    final SignupBasicsLayout val$target;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        val$target.yearTextListener();
    }

    ()
    {
        this$0 = final_;
        val$target = SignupBasicsLayout.this;
        super();
    }
}
