// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.telephony.TelephonyManager;
import android.view.View;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

final class this._cls0
    implements android.view.erActivity._cls3
{

    final VideoMessageRecorderActivity this$0;

    public final void onClick(View view)
    {
        .SwitchMap.com.skype.android.app.vim.VideoMessageRecorderActivity.State[VideoMessageRecorderActivity.access$300(VideoMessageRecorderActivity.this).ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 61;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (telephonyManager.getCallState() == 0)
        {
            VideoMessageRecorderActivity.access$500(VideoMessageRecorderActivity.this, RECORDING);
            return;
        }
          goto _L1
_L3:
        VideoMessageRecorderActivity.access$500(VideoMessageRecorderActivity.this, REVIEW);
        return;
    }

    ()
    {
        this$0 = VideoMessageRecorderActivity.this;
        super();
    }
}
