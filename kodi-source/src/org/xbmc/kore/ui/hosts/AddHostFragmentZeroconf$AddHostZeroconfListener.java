// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import org.xbmc.kore.host.HostInfo;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            AddHostFragmentZeroconf

public static interface 
{

    public abstract void onAddHostZeroconfFoundHost(HostInfo hostinfo);

    public abstract void onAddHostZeroconfNoHost();
}
