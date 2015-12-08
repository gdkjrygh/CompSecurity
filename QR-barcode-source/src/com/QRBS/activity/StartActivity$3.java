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

class this._cls0
    implements android.content.OnClickListener
{

    final StartActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Utils.setLastElem(-1);
        if (StartActivity.access$3(StartActivity.this).isLoaded())
        {
            StartActivity.access$3(StartActivity.this).show();
            StartActivity.access$3(StartActivity.this).setAdListener(new AdListener() {

                final StartActivity._cls3 this$1;

                public void onAdClosed()
                {
                    if (SoundControl.isSoundLoaded())
                    {
                        SoundControl.destroySound();
                    }
                    StartActivity.access$4(this$0, true);
                    finish();
                }

            
            {
                this$1 = StartActivity._cls3.this;
                super();
            }
            });
            return;
        }
        if (SoundControl.isSoundLoaded())
        {
            SoundControl.destroySound();
        }
        StartActivity.access$4(StartActivity.this, true);
        finish();
    }


    ner()
    {
        this$0 = StartActivity.this;
        super();
    }
}
