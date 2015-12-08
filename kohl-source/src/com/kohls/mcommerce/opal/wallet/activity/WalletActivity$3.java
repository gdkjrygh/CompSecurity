// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.activity;

import android.media.MediaPlayer;
import android.widget.ProgressBar;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.activity:
//            WalletActivity

class this._cls0
    implements android.media.orListener
{

    final WalletActivity this$0;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        ((ProgressBar)findViewById(0x7f0d010b)).setVisibility(8);
        return false;
    }

    ()
    {
        this$0 = WalletActivity.this;
        super();
    }
}
