// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            PlaybackDelegate

class this._cls1
    implements android.content.ckListener
{

    final Y this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        PlaybackDelegate.access$100(_fld0).onPlaybackDismiss();
        NBCSystem.GEO_LOCATION_RETRY = true;
    }

    l.messageView()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/library/tve/PlaybackDelegate$6

/* anonymous class */
    class PlaybackDelegate._cls6
        implements Runnable
    {

        final PlaybackDelegate this$0;
        final TextView val$messageView;
        final String val$title;

        public void run()
        {
            (new android.app.AlertDialog.Builder(PlaybackDelegate.access$500(PlaybackDelegate.this))).setTitle(title).setView(messageView).setCancelable(false).setPositiveButton(0x104000a, new PlaybackDelegate._cls6._cls1()).create().show();
        }

            
            {
                this$0 = final_playbackdelegate;
                title = s;
                messageView = TextView.this;
                super();
            }
    }

}
