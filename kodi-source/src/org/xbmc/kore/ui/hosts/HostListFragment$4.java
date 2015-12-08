// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import java.util.ArrayList;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostListFragment

class val.hostId
    implements nfirmDeleteDialogFragment.ConfirmDeleteDialogListener
{

    final HostListFragment this$0;
    final int val$hostId;

    public void onDialogNegativeClick()
    {
    }

    public void onDialogPositiveClick()
    {
        HostManager.getInstance(getActivity()).deleteHost(val$hostId);
        int i = 0;
        do
        {
label0:
            {
                if (i < HostListFragment.access$000(HostListFragment.this).size())
                {
                    if (((stInfoRow)HostListFragment.access$000(HostListFragment.this).get(i)).hostInfo.getId() != val$hostId)
                    {
                        break label0;
                    }
                    HostListFragment.access$000(HostListFragment.this).remove(i);
                }
                HostListFragment.access$200(HostListFragment.this).notifyDataSetChanged();
                return;
            }
            i++;
        } while (true);
    }

    stListAdapter()
    {
        this$0 = final_hostlistfragment;
        val$hostId = I.this;
        super();
    }
}
