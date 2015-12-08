// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            RecoverActivity

class this._cls0
    implements com.soundcloud.android.utils.pan.OnClickListener
{

    final RecoverActivity this$0;

    public void onClick()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f070330))));
    }

    kListener()
    {
        this$0 = RecoverActivity.this;
        super();
    }
}
