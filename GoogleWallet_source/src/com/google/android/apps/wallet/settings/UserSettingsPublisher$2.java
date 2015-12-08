// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            UserSettingsPublisher, UserSettingsStorageManager

final class this._cls0
    implements Callable
{

    final UserSettingsPublisher this$0;

    private com.google.wallet.proto.api.SettingsResponse call()
        throws Exception
    {
        return (com.google.wallet.proto.api.SettingsResponse)UserSettingsPublisher.access$100(UserSettingsPublisher.this).get(new com.google.wallet.proto.api.SettingsResponse());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    onse()
    {
        this$0 = UserSettingsPublisher.this;
        super();
    }
}
