// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;
import org.xbmc.kore.utils.FileDownloadHelper;

// Referenced classes of package org.xbmc.kore.ui:
//            MusicVideoDetailsFragment

class this._cls0
    implements android.content.ner
{

    final MusicVideoDetailsFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        FileDownloadHelper.downloadFiles(getActivity(), MusicVideoDetailsFragment.access$300(MusicVideoDetailsFragment.this), MusicVideoDetailsFragment.access$400(MusicVideoDetailsFragment.this), 1, MusicVideoDetailsFragment.access$200(MusicVideoDetailsFragment.this));
    }

    er()
    {
        this$0 = MusicVideoDetailsFragment.this;
        super();
    }
}
