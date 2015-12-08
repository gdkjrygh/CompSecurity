// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.os.Handler;
import com.arist.util.Constant;
import com.arist.util.LrcFileUtil;
import java.io.File;
import java.util.Timer;

// Referenced classes of package com.arist.MusicPlayer:
//            ScanMusicActivity

class this._cls0 extends Thread
{

    final ScanMusicActivity this$0;

    public void run()
    {
        ScanMusicActivity.access$4(ScanMusicActivity.this);
        ScanMusicActivity.access$5(ScanMusicActivity.this).sendEmptyMessage(2);
        LrcFileUtil.moveLrcFile(new File(Constant.rootDir));
        ScanMusicActivity.access$5(ScanMusicActivity.this).sendEmptyMessage(3);
        ScanMusicActivity.access$6(ScanMusicActivity.this).cancel();
    }

    ()
    {
        this$0 = ScanMusicActivity.this;
        super();
    }
}
