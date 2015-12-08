// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

final class this._cls0
    implements Runnable
{

    final VideoMessageRecorderActivity this$0;

    public final void run()
    {
        Object obj;
        long l;
        long l1;
        l = SystemClock.elapsedRealtime() - VideoMessageRecorderActivity.access$000(VideoMessageRecorderActivity.this);
        l1 = (long)VideoMessageRecorderActivity.access$100(VideoMessageRecorderActivity.this) - l;
        VideoMessageRecorderActivity.access$202(VideoMessageRecorderActivity.this, l);
        obj = TimeUtil.c(l1);
        recordTimeText.setText(((CharSequence) (obj)));
        if (l1 < 0L) goto _L2; else goto _L1
_L1:
        CharSequence charsequence = timeUtil.a(0x7f0800fd, (int)(l1 / 1000L), false);
        obj = charsequence;
_L4:
        recordTimeText.setContentDescription(((CharSequence) (obj)));
_L2:
        ((View)recordTimeText.getParent()).invalidate();
        if (VideoMessageRecorderActivity.access$300(VideoMessageRecorderActivity.this) == RECORDING)
        {
            recordTimeText.postDelayed(this, l1 % 1000L);
        }
        if (l > 2000L)
        {
            VideoMessageRecorderActivity.access$400(VideoMessageRecorderActivity.this, recordButton, true);
        }
        if (l1 <= 0L)
        {
            VideoMessageRecorderActivity.access$500(VideoMessageRecorderActivity.this, REVIEW);
        }
        return;
        TimeAnomalyException timeanomalyexception;
        timeanomalyexception;
        timeAnomalyTelemetry.a(timeanomalyexception, Long.valueOf(l1), "VideoMessageRecorderActivity#updateRecordTime");
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = VideoMessageRecorderActivity.this;
        super();
    }
}
