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

class val.messageView
    implements Runnable
{

    final PlaybackDelegate this$0;
    final TextView val$messageView;
    final String val$title;

    public void run()
    {
        (new android.app.(PlaybackDelegate.access$500(PlaybackDelegate.this))).setTitle(val$title).setView(val$messageView).setCancelable(false).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final PlaybackDelegate._cls6 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                PlaybackDelegate.access$100(this$0).onPlaybackDismiss();
                NBCSystem.GEO_LOCATION_RETRY = true;
            }

            
            {
                this$1 = PlaybackDelegate._cls6.this;
                super();
            }
        }).create().show();
    }

    _cls1.this._cls1()
    {
        this$0 = final_playbackdelegate;
        val$title = s;
        val$messageView = TextView.this;
        super();
    }
}
