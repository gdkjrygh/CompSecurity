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

class this._cls0
    implements Runnable
{

    final PlaybackDelegate this$0;

    public void run()
    {
        PlaybackDelegate.access$1100(PlaybackDelegate.this).dismiss();
        PlaybackDelegate.access$100(PlaybackDelegate.this).onPlaybackDismiss();
        NBCSystem.GEO_LOCATION_RETRY = true;
        (new android.app.(PlaybackDelegate.access$500(PlaybackDelegate.this))).setTitle(0x7f07017a).setMessage(0x7f070069).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final PlaybackDelegate._cls7 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$1 = PlaybackDelegate._cls7.this;
                super();
            }
        }).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final PlaybackDelegate._cls7 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$1 = PlaybackDelegate._cls7.this;
                super();
            }
        }).setPositiveButton("Open Location Settings", new android.content.DialogInterface.OnClickListener() {

            final PlaybackDelegate._cls7 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                PlaybackDelegate.access$500(this$0).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                dialoginterface.dismiss();
            }

            
            {
                this$1 = PlaybackDelegate._cls7.this;
                super();
            }
        }).create().show();
    }

    _cls3.this._cls1()
    {
        this$0 = PlaybackDelegate.this;
        super();
    }
}
