// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.AdapterView;
import org.xbmc.kore.host.HostManager;

// Referenced classes of package org.xbmc.kore.ui:
//            PlaylistFragment

class this._cls0
    implements android.widget.lickListener
{

    final PlaylistFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        (new org.xbmc.kore.jsonrpc.method.(PlaylistFragment.access$000(PlaylistFragment.this), i)).(PlaylistFragment.access$100(PlaylistFragment.this).getConnection(), PlaylistFragment.access$200(PlaylistFragment.this), PlaylistFragment.access$300(PlaylistFragment.this));
    }

    Open()
    {
        this$0 = PlaylistFragment.this;
        super();
    }
}
