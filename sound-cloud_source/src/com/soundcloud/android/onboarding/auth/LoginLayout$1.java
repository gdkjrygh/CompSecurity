// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.widget.AutoCompleteTextView;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            LoginLayout

class this._cls0
    implements com.soundcloud.android.utils.ickSpan.OnClickListener
{

    final LoginLayout this$0;

    public void onClick()
    {
        getLoginHandler().onRecoverPassword(emailField.getText().toString());
    }

    ginHandler()
    {
        this$0 = LoginLayout.this;
        super();
    }
}
