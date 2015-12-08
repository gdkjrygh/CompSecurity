// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.activity;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.activity:
//            WalletActivity

class this._cls0
    implements android.media.pletionListener
{

    final WalletActivity this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        ((VideoView)findViewById(0x7f0d010c)).setVisibility(8);
        setRequestedOrientation(1);
    }

    ()
    {
        this$0 = WalletActivity.this;
        super();
    }
}
