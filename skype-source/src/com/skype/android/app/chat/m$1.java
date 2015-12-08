// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.media.AudioManager;
import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            m

final class val.vmStatus
    implements android.view..OnClickListener
{

    final m this$0;
    final com.skype.email.STATUS val$vmStatus;

    public final void onClick(View view)
    {
        if (val$vmStatus == com.skype.email.STATUS.PLAYING || val$vmStatus == com.skype.email.STATUS.BUFFERING)
        {
            view = m.this;
            boolean flag;
            if (!audioManager.isSpeakerphoneOn())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            m.access$400(view, flag);
        }
        refreshContent();
    }

    er()
    {
        this$0 = final_m1;
        val$vmStatus = com.skype.email.STATUS.this;
        super();
    }
}
