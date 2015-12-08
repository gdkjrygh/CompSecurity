// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.soundcloud.android.utils.ScTextUtils;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorderService, SoundRecorder

class this._cls0 extends BroadcastReceiver
{

    final SoundRecorderService this$0;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (Log.isLoggable(SoundRecorderService.access$100(), 3))
        {
            SoundRecorderService.access$100();
            (new StringBuilder("BroadcastReceiver#onReceive(")).append(context).append(")");
        }
        if (!"com.soundcloud.android.playbackstarted".equals(context)) goto _L2; else goto _L1
_L1:
        if (intent.getBooleanExtra("shouldUseNotifications", true))
        {
            SoundRecorderService.access$300(SoundRecorderService.this, SoundRecorderService.access$000(SoundRecorderService.this).getRecording());
        }
_L4:
        return;
_L2:
        if ("com.soundcloud.android.playbackstopped".equals(context) || "com.soundcloud.android.playbackcomplete".equals(context) || "com.soundcloud.android.playbackerror".equals(context))
        {
            SoundRecorderService.access$400(SoundRecorderService.this, 1);
            return;
        }
        if (!"com.soundcloud.android.recordstarted".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        SoundRecorderService.access$500(SoundRecorderService.this);
        if (intent.getBooleanExtra("shouldUseNotifications", true))
        {
            SoundRecorderService.access$600(SoundRecorderService.this, SoundRecorderService.access$000(SoundRecorderService.this).getRecording());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"com.soundcloud.android.recordprogress".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        long l = intent.getLongExtra("elapsedTime", -1L) / 1000L;
        if (!ScTextUtils.usesSameTimeElapsedString(SoundRecorderService.access$700(SoundRecorderService.this), l))
        {
            SoundRecorderService.access$702(SoundRecorderService.this, l);
            SoundRecorderService.access$800(SoundRecorderService.this, l);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if ("com.soundcloud.android.recordfinished".equals(context))
        {
            SoundRecorderService.access$400(SoundRecorderService.this, 0);
            return;
        }
        if ("com.soundcloud.android.recorderror".equals(context))
        {
            SoundRecorderService.access$400(SoundRecorderService.this, 0);
            return;
        }
        if ("com.soundcloud.android.notificationState".equals(context))
        {
            if (intent.getBooleanExtra("shouldUseNotifications", true))
            {
                if (SoundRecorderService.access$000(SoundRecorderService.this).isRecording())
                {
                    SoundRecorderService.access$600(SoundRecorderService.this, SoundRecorderService.access$000(SoundRecorderService.this).getRecording());
                    return;
                }
                if (SoundRecorderService.access$000(SoundRecorderService.this).isPlaying())
                {
                    SoundRecorderService.access$300(SoundRecorderService.this, SoundRecorderService.access$000(SoundRecorderService.this).getRecording());
                    return;
                }
            } else
            {
                SoundRecorderService.access$702(SoundRecorderService.this, -1L);
                SoundRecorderService.access$900(SoundRecorderService.this, 1);
                SoundRecorderService.access$900(SoundRecorderService.this, 0);
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    ()
    {
        this$0 = SoundRecorderService.this;
        super();
    }
}
