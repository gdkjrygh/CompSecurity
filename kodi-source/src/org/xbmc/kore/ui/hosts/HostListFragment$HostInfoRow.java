// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import org.xbmc.kore.host.HostInfo;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostListFragment

private class status
{

    public HostInfo hostInfo;
    public int status;
    final HostListFragment this$0;

    public _cls9(HostInfo hostinfo, int i)
    {
        this$0 = HostListFragment.this;
        super();
        hostInfo = hostinfo;
        status = i;
    }
}
