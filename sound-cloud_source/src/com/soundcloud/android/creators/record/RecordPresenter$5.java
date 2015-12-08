// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.utils.AndroidUtils;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordPresenter, RecordFragment

class this._cls0 extends BroadcastReceiver
{

    final RecordPresenter this$0;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
        flag = false;
        context = intent.getAction();
        if (!"com.soundcloud.android.recordstarted".equals(context)) goto _L2; else goto _L1
_L1:
        RecordPresenter.access$300(RecordPresenter.this, ateState.RECORD);
_L4:
        return;
_L2:
        if (!"com.soundcloud.android.recordsample".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        if (RecordPresenter.access$200(RecordPresenter.this) == ateState.IDLE_RECORD || RecordPresenter.access$200(RecordPresenter.this) == ateState.RECORD)
        {
            context = RecordPresenter.this;
            float f = intent.getFloatExtra("amplitude", -1F);
            if (RecordPresenter.access$200(RecordPresenter.this) == ateState.RECORD)
            {
                flag = true;
            }
            context.updateAmplitude(f, flag);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("com.soundcloud.android.recordprogress".equals(context))
        {
            updateRecordProgress(intent.getLongExtra("elapsedTime", -1L));
            return;
        }
        if ("com.soundcloud.android.recorderror".equals(context))
        {
            RecordPresenter.access$300(RecordPresenter.this, ateState.IDLE_RECORD);
            return;
        }
        if ("com.soundcloud.android.recordfinished".equals(context))
        {
            if (intent.getLongExtra("time_remaining", -1L) == 0L)
            {
                AndroidUtils.showToast(RecordPresenter.access$400(RecordPresenter.this).getActivity(), 0x7f0701bf, new Object[0]);
            }
            RecordPresenter.access$300(RecordPresenter.this, ateState.IDLE_PLAYBACK);
            return;
        }
        if ("com.soundcloud.android.playbackstarted".equals(context))
        {
            intent = RecordPresenter.this;
            if (RecordPresenter.access$200(RecordPresenter.this) == ateState.EDIT || RecordPresenter.access$200(RecordPresenter.this) == ateState.EDIT_PLAYBACK)
            {
                context = ateState.EDIT_PLAYBACK;
            } else
            {
                context = ateState.PLAYBACK;
            }
            RecordPresenter.access$300(intent, context);
            return;
        }
        if ("com.soundcloud.android.playbackprogress".equals(context))
        {
            setProgress(intent.getLongExtra("position", 0L), intent.getLongExtra("duration", 0L));
            return;
        }
        if (!"com.soundcloud.android.playbackcomplete".equals(context) && !"com.soundcloud.android.playbackstopped".equals(context) && !"com.soundcloud.android.playbackerror".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (RecordPresenter.access$200(RecordPresenter.this) != ateState.PLAYBACK && RecordPresenter.access$200(RecordPresenter.this) != ateState.EDIT_PLAYBACK) goto _L4; else goto _L5
_L5:
        intent = RecordPresenter.this;
        if (RecordPresenter.access$200(RecordPresenter.this) == ateState.EDIT_PLAYBACK)
        {
            context = ateState.EDIT;
        } else
        {
            context = ateState.IDLE_PLAYBACK;
        }
        RecordPresenter.access$300(intent, context);
        return;
        if (!"android.intent.action.MEDIA_MOUNTED".equals(context) && !"android.intent.action.MEDIA_REMOVED".equals(context) || RecordPresenter.access$200(RecordPresenter.this) != ateState.IDLE_RECORD) goto _L4; else goto _L6
_L6:
        RecordPresenter.access$300(RecordPresenter.this, ateState.IDLE_RECORD);
        return;
    }

    ateState()
    {
        this$0 = RecordPresenter.this;
        super();
    }
}
