// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import javax.jmdns.ServiceInfo;
import org.xbmc.kore.host.HostInfo;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            AddHostFragmentZeroconf

class val.serviceInfos
    implements android.widget.tener
{

    final AddHostFragmentZeroconf this$0;
    final ServiceInfo val$serviceInfos[];

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = val$serviceInfos[i];
        view = adapterview.getHostAddresses();
        if (view.length == 0)
        {
            Toast.makeText(getActivity(), 0x7f0700e2, 1).show();
            return;
        } else
        {
            adapterview = new HostInfo(adapterview.getName(), view[0], 0, adapterview.getPort(), 9090, null, null, true, 9777);
            AddHostFragmentZeroconf.access$300(AddHostFragmentZeroconf.this).onAddHostZeroconfFoundHost(adapterview);
            return;
        }
    }

    dHostZeroconfListener()
    {
        this$0 = final_addhostfragmentzeroconf;
        val$serviceInfos = _5B_Ljavax.jmdns.ServiceInfo_3B_.this;
        super();
    }
}
