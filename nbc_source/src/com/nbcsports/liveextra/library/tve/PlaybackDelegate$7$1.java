// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            PlaybackDelegate

class this._cls1
    implements android.content.ckListener
{

    final is._cls0 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        PlaybackDelegate.access$500(_fld0).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        dialoginterface.dismiss();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/library/tve/PlaybackDelegate$7

/* anonymous class */
    class PlaybackDelegate._cls7
        implements Runnable
    {

        final PlaybackDelegate this$0;

        public void run()
        {
            PlaybackDelegate.access$1100(PlaybackDelegate.this).dismiss();
            PlaybackDelegate.access$100(PlaybackDelegate.this).onPlaybackDismiss();
            NBCSystem.GEO_LOCATION_RETRY = true;
            (new android.app.AlertDialog.Builder(PlaybackDelegate.access$500(PlaybackDelegate.this))).setTitle(0x7f07017a).setMessage(0x7f070069).setOnCancelListener(new PlaybackDelegate._cls7._cls3()).setNegativeButton(0x1040000, new PlaybackDelegate._cls7._cls2()).setPositiveButton("Open Location Settings", new PlaybackDelegate._cls7._cls1()).create().show();
        }

            
            {
                this$0 = PlaybackDelegate.this;
                super();
            }

        // Unreferenced inner class com/nbcsports/liveextra/library/tve/PlaybackDelegate$7$2

/* anonymous class */
        class PlaybackDelegate._cls7._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final PlaybackDelegate._cls7 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = PlaybackDelegate._cls7.this;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcsports/liveextra/library/tve/PlaybackDelegate$7$3

/* anonymous class */
        class PlaybackDelegate._cls7._cls3
            implements android.content.DialogInterface.OnCancelListener
        {

            final PlaybackDelegate._cls7 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = PlaybackDelegate._cls7.this;
                        super();
                    }
        }

    }

}
