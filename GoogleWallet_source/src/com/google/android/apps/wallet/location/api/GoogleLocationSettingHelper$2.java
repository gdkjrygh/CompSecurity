// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.api;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.google.android.apps.wallet.location.api:
//            GoogleLocationSettingHelper

final class this._cls0 extends ContentObserver
{

    final GoogleLocationSettingHelper this$0;

    public final boolean deliverSelfNotifications()
    {
        return false;
    }

    public final void onChange(boolean flag)
    {
        GoogleLocationSettingHelper.access$200(GoogleLocationSettingHelper.this);
    }

    (Handler handler)
    {
        this$0 = GoogleLocationSettingHelper.this;
        super(handler);
    }
}
