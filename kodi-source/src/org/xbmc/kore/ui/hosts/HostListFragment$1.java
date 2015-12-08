// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.ui.RemoteActivity;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostListFragment

class val.hostManager
    implements android.widget.lickListener
{

    final HostListFragment this$0;
    final HostManager val$hostManager;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (stInfoRow)HostListFragment.access$000(HostListFragment.this).get(i);
        val$hostManager.switchHost(((stInfoRow) (adapterview)).hostInfo);
        adapterview = new Intent(HostListFragment.access$100(HostListFragment.this), org/xbmc/kore/ui/RemoteActivity);
        HostListFragment.access$100(HostListFragment.this).startActivity(adapterview);
    }

    stInfoRow()
    {
        this$0 = final_hostlistfragment;
        val$hostManager = HostManager.this;
        super();
    }
}
