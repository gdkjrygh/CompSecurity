// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

// Referenced classes of package com.arist.MusicPlayer:
//            MusicPlayActivity, MyApplication

class this._cls0
    implements android.view.
{

    final MusicPlayActivity this$0;

    public void onClick(View view)
    {
        int i = MyApplication.playMode + 1;
        MyApplication.playMode = i;
        if (i > 4)
        {
            i = 1;
        } else
        {
            i = MyApplication.playMode;
        }
        MyApplication.playMode = i;
        Toast.makeText(MusicPlayActivity.this, MusicPlayActivity.access$11(MusicPlayActivity.this)[MyApplication.playMode - 1], 0).show();
        MusicPlayActivity.access$12(MusicPlayActivity.this).setImageResource(MusicPlayActivity.access$13(MusicPlayActivity.this)[MyApplication.playMode - 1]);
    }

    ()
    {
        this$0 = MusicPlayActivity.this;
        super();
    }
}
