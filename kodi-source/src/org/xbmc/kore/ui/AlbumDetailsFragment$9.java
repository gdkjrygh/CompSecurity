// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumDetailsFragment

class this._cls0
    implements android.view.t._cls9
{

    final AlbumDetailsFragment this$0;

    public void onClick(View view)
    {
        AlbumDetailsFragment.access$600(AlbumDetailsFragment.this, ((org.xbmc.kore.utils.Info)view.getTag()).songId);
    }

    ongInfo()
    {
        this$0 = AlbumDetailsFragment.this;
        super();
    }
}
