// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.crypto;


// Referenced classes of package com.snapchat.android.util.crypto:
//            DeviceTokenManager

final class this._cls0
    implements Runnable
{

    final DeviceTokenManager this$0;

    public final void run()
    {
        checkForDeviceTokenSynchronously(true);
    }

    ()
    {
        this$0 = DeviceTokenManager.this;
        super();
    }
}
