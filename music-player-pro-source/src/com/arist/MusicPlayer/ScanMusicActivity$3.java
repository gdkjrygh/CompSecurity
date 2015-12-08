// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;
import com.arist.biz.MusicBiz;

// Referenced classes of package com.arist.MusicPlayer:
//            ScanMusicActivity

class this._cls0 extends Handler
{

    final ScanMusicActivity this$0;

    public void handleMessage(Message message)
    {
        if (message.what != 1) goto _L2; else goto _L1
_L1:
        ScanMusicActivity.access$2(ScanMusicActivity.this).setText((new StringBuilder(String.valueOf(getString(0x7f080071)))).append(" ").append(ScanMusicActivity.access$3(ScanMusicActivity.this).getCount()).append(" ").append(getString(0x7f08005d)).toString());
_L4:
        super.handleMessage(message);
        return;
_L2:
        if (message.what == 2)
        {
            ScanMusicActivity.access$0(ScanMusicActivity.this).setText(getString(0x7f080077));
        } else
        if (message.what == 3)
        {
            ScanMusicActivity.access$0(ScanMusicActivity.this).setText(getString(0x7f080072));
            ScanMusicActivity.access$0(ScanMusicActivity.this).setEnabled(true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = ScanMusicActivity.this;
        super();
    }
}
