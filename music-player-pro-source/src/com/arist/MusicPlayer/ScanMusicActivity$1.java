// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.view.View;
import android.widget.Button;

// Referenced classes of package com.arist.MusicPlayer:
//            ScanMusicActivity

class this._cls0
    implements android.view.
{

    final ScanMusicActivity this$0;

    public void onClick(View view)
    {
        if (getString(0x7f080072).equals(ScanMusicActivity.access$0(ScanMusicActivity.this).getText()))
        {
            finish();
            return;
        } else
        {
            ScanMusicActivity.access$1(ScanMusicActivity.this).start();
            ScanMusicActivity.access$0(ScanMusicActivity.this).setText(getString(0x7f080073));
            ScanMusicActivity.access$0(ScanMusicActivity.this).setEnabled(false);
            return;
        }
    }

    ()
    {
        this$0 = ScanMusicActivity.this;
        super();
    }
}
