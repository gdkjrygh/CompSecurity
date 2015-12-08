// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.app.Dialog;
import android.content.DialogInterface;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.playlists:
//            AddToPlaylistDialogFragment

class this._cls0
    implements android.content.r
{

    final AddToPlaylistDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        long l = AddToPlaylistDialogFragment.access$100(AddToPlaylistDialogFragment.this).getItemId(i);
        if (l == Urn.NOT_SET.getNumericId())
        {
            AddToPlaylistDialogFragment.access$200(AddToPlaylistDialogFragment.this);
            getDialog().dismiss();
        } else
        if (getActivity() != null)
        {
            AddToPlaylistDialogFragment.access$300(AddToPlaylistDialogFragment.this, l);
            return;
        }
    }

    PlaylistsAdapter()
    {
        this$0 = AddToPlaylistDialogFragment.this;
        super();
    }
}
