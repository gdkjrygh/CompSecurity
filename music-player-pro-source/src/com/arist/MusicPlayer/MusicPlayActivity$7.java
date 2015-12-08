// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.arist.MusicPlayer:
//            MusicPlayActivity, MyApplication, MainActivity

class this._cls0
    implements android.view.
{

    final MusicPlayActivity this$0;

    public void onClick(View view)
    {
        MyApplication.showList = true;
        view = new Intent(MusicPlayActivity.this, com/arist/MusicPlayer/MainActivity);
        startActivity(view);
        overridePendingTransition(0x7f040002, 0x7f040007);
        finish();
    }

    ()
    {
        this$0 = MusicPlayActivity.this;
        super();
    }
}
