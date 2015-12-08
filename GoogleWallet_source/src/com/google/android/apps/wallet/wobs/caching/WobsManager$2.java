// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.eventbus.RegistrationCallback;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager

final class this._cls0
    implements RegistrationCallback
{

    final WobsManager this$0;

    public final void handleRegistration(Object obj)
    {
        if (obj instanceof String)
        {
            WobsManager.access$100(WobsManager.this, (String)obj);
        }
    }

    ck()
    {
        this$0 = WobsManager.this;
        super();
    }
}
