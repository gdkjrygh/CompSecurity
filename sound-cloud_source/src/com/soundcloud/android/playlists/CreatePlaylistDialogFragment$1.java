// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

// Referenced classes of package com.soundcloud.android.playlists:
//            CreatePlaylistDialogFragment

class this._cls0
    implements android.content.
{

    final CreatePlaylistDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = input.getText().toString().trim();
        if (TextUtils.isEmpty(dialoginterface))
        {
            Toast.makeText(getActivity(), 0x7f07012b, 0).show();
            return;
        } else
        {
            CreatePlaylistDialogFragment.access$000(CreatePlaylistDialogFragment.this, dialoginterface, privacy.isChecked(), offline.isChecked());
            Toast.makeText(getActivity(), 0x7f070069, 0).show();
            dismiss();
            return;
        }
    }

    ()
    {
        this$0 = CreatePlaylistDialogFragment.this;
        super();
    }
}
