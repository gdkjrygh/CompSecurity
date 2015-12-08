// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Intent;
import android.view.View;
import com.skype.android.app.dialer.SelectCountryActivity;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingNumberActivity

final class this._cls0
    implements android.view.NumberActivity._cls1
{

    final CallForwardingNumberActivity this$0;

    public final void onClick(View view)
    {
        view = new Intent(CallForwardingNumberActivity.this, com/skype/android/app/dialer/SelectCountryActivity);
        startActivityForResult(view, 1);
    }

    ()
    {
        this$0 = CallForwardingNumberActivity.this;
        super();
    }
}
