// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.DialogInterface;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.scannerfire.utils.SoundControl;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class r extends AdListener
{

    final sh this$1;

    public void onAdClosed()
    {
        if (SoundControl.isSoundLoaded())
        {
            SoundControl.destroySound();
        }
        StartActivity.access$4(_fld0, true);
        finish();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/QRBS/activity/StartActivity$3

/* anonymous class */
    class StartActivity._cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final StartActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            Utils.setLastElem(-1);
            if (StartActivity.access$3(StartActivity.this).isLoaded())
            {
                StartActivity.access$3(StartActivity.this).show();
                StartActivity.access$3(StartActivity.this).setAdListener(new StartActivity._cls3._cls1());
                return;
            }
            if (SoundControl.isSoundLoaded())
            {
                SoundControl.destroySound();
            }
            StartActivity.access$4(StartActivity.this, true);
            finish();
        }


            
            {
                this$0 = StartActivity.this;
                super();
            }
    }

}
