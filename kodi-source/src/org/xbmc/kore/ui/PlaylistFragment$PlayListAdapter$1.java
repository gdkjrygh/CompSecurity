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

class this._cls1
    implements android.view.r._cls1
{

    final st this$1;

    public void onClick(View view)
    {
        final int position = ((Integer)view.getTag()).intValue();
        view = new PopupMenu(getActivity(), view);
        view.getMenuInflater().inflate(0x7f0f0007, view.getMenu());
        view.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

            final PlaylistFragment.PlayListAdapter._cls1 this$2;
            final int val$position;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                switch (menuitem.getItemId())
                {
                default:
                    return false;

                case 2131624167: 
                    (new org.xbmc.kore.jsonrpc.method.Playlist.Remove(PlaylistFragment.access$000(this$0), position)).execute(PlaylistFragment.access$100(this$0).getConnection(), PlaylistFragment.access$200(this$0), PlaylistFragment.access$300(this$0));
                    break;
                }
                forceRefreshPlaylist();
                return true;
            }

            
            {
                this$2 = PlaylistFragment.PlayListAdapter._cls1.this;
                position = i;
                super();
            }
        });
        view.show();
    }

    _cls1.val.position()
    {
        this$1 = this._cls1.this;
        super();
    }
}
