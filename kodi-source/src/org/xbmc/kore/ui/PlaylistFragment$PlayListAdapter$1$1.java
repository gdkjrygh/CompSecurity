// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import org.xbmc.kore.host.HostManager;

// Referenced classes of package org.xbmc.kore.ui:
//            PlaylistFragment

class val.position
    implements android.widget._cls1
{

    final  this$2;
    final int val$position;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131624167: 
            (new org.xbmc.kore.jsonrpc.method.(PlaylistFragment.access$000(_fld0), val$position)).(PlaylistFragment.access$100(_fld0).getConnection(), PlaylistFragment.access$200(_fld0), PlaylistFragment.access$300(_fld0));
            break;
        }
        forceRefreshPlaylist();
        return true;
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$position = I.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/PlaylistFragment$PlayListAdapter$1

/* anonymous class */
    class PlaylistFragment.PlayListAdapter._cls1
        implements android.view.View.OnClickListener
    {

        final PlaylistFragment.PlayListAdapter this$1;

        public void onClick(View view)
        {
            int i = ((Integer)view.getTag()).intValue();
            view = new PopupMenu(getActivity(), view);
            view.getMenuInflater().inflate(0x7f0f0007, view.getMenu());
            view.setOnMenuItemClickListener(i. new PlaylistFragment.PlayListAdapter._cls1._cls1());
            view.show();
        }

            
            {
                this$1 = PlaylistFragment.PlayListAdapter.this;
                super();
            }
    }

}
