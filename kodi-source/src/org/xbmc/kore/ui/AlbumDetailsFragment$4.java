// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;
import org.xbmc.kore.utils.FileDownloadHelper;

// Referenced classes of package org.xbmc.kore.ui:
//            AlbumDetailsFragment

class this._cls0
    implements android.content.Listener
{

    final AlbumDetailsFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        FileDownloadHelper.downloadFiles(getActivity(), AlbumDetailsFragment.access$000(AlbumDetailsFragment.this), AlbumDetailsFragment.access$100(AlbumDetailsFragment.this), 1, AlbumDetailsFragment.access$200(AlbumDetailsFragment.this));
    }

    istener()
    {
        this$0 = AlbumDetailsFragment.this;
        super();
    }
}
