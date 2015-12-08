// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.host;

import android.content.ContentResolver;
import android.content.Context;

// Referenced classes of package org.xbmc.kore.host:
//            HostManager

class val.hostId
    implements Runnable
{

    final HostManager this$0;
    final int val$hostId;

    public void run()
    {
        HostManager.access$000(HostManager.this).getContentResolver().delete(org.xbmc.kore.provider.Hosts.buildHostUri(val$hostId), null, null);
    }

    act.Hosts()
    {
        this$0 = final_hostmanager;
        val$hostId = I.this;
        super();
    }
}
