// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.UIUtils;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostListFragment, EditHostActivity

class this._cls0
    implements android.view.r
{

    final HostListFragment this$0;

    public void onClick(View view)
    {
        final HostInfo hostInfo = (HostInfo)view.getTag();
        view = new PopupMenu(getActivity(), view);
        view.getMenuInflater().inflate(0x7f0f0002, view.getMenu());
        view.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

            final HostListFragment._cls3 this$1;
            final HostInfo val$hostInfo;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                switch (menuitem.getItemId())
                {
                default:
                    return false;

                case 2131624157: 
                    HostListFragment.ConfirmDeleteDialogFragment.getInstance(HostListFragment.access$300(this$0, hostInfo.getId())).show(getFragmentManager(), "confirmdelete");
                    return true;

                case 2131624158: 
                    menuitem = (new Intent(getActivity(), org/xbmc/kore/ui/hosts/EditHostActivity)).addFlags(0x20000000).putExtra("org.xbmc.kore.host_id", hostInfo.getId());
                    startActivity(menuitem);
                    getActivity().overridePendingTransition(0x7f04000a, 0x7f04000b);
                    return true;

                case 2131624159: 
                    UIUtils.sendWolAsync(getActivity(), hostInfo);
                    break;
                }
                return true;
            }

            
            {
                this$1 = HostListFragment._cls3.this;
                hostInfo = hostinfo;
                super();
            }
        });
        view.show();
    }

    _cls1.val.hostInfo()
    {
        this$0 = HostListFragment.this;
        super();
    }
}
