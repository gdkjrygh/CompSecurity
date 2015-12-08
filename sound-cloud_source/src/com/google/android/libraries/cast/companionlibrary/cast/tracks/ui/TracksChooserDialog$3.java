// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.gms.cast.q;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui:
//            TracksChooserDialog, TracksListAdapter

class this._cls0
    implements android.content.kListener
{

    final TracksChooserDialog this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new ArrayList();
        q q1 = TracksChooserDialog.access$000(TracksChooserDialog.this).getSelectedTrack();
        if (q1.a != -1L)
        {
            dialoginterface.add(q1);
        }
        q1 = TracksChooserDialog.access$100(TracksChooserDialog.this).getSelectedTrack();
        if (q1 != null)
        {
            dialoginterface.add(q1);
        }
        TracksChooserDialog.access$200(TracksChooserDialog.this).notifyTracksSelectedListeners(dialoginterface);
        getDialog().cancel();
    }

    ()
    {
        this$0 = TracksChooserDialog.this;
        super();
    }
}
