// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.networkmanager;

import com.snapchat.android.Timber;
import oV;

// Referenced classes of package com.snapchat.android.networkmanager:
//            NetworkManager

final class a
    implements Runnable
{

    private oV a;

    public final void run()
    {
        a.cancel();
        Timber.c("NetworkManager", "NETWORK-MANAGER: Canceled request to %s %s", new Object[] {
            a.getUrl(), a.getRequestTag()
        });
    }

    (oV ov)
    {
        a = ov;
        super();
    }
}
