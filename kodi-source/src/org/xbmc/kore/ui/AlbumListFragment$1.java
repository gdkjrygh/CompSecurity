// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumListFragment

class this._cls0
    implements android.widget.ickListener
{

    final AlbumListFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ewHolder)view.getTag();
        AlbumListFragment.access$000(AlbumListFragment.this).onAlbumSelected(((ewHolder) (adapterview)).albumId, ((ewHolder) (adapterview)).albumTitle);
    }

    AlbumSelectedListener()
    {
        this$0 = AlbumListFragment.this;
        super();
    }
}
