// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlay, PlayerActivity

class this._cls0
    implements android.view.kListener
{

    final PostPlay this$0;

    public void onClick(View view)
    {
        Log.d("nf_postplay", "Interrupter mode, stop");
        mContext.finish();
    }

    ity()
    {
        this$0 = PostPlay.this;
        super();
    }
}
