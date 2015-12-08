// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.os.Handler;
import android.view.View;
import com.skype.Voicemail;

// Referenced classes of package com.skype.android.app.chat:
//            m

private final class vm
    implements android.view..OnClickListener
{

    final m this$0;
    Voicemail vm;

    public final void onClick(View view)
    {
        if (vm.getStatusProp() != com.skype.email.STATUS.PLAYING && vm.getStatusProp() != com.skype.email.STATUS.BUFFERING) goto _L2; else goto _L1
_L1:
        m.access$500(m.this).sendEmptyMessage(3);
        vm.stopPlayback();
_L4:
        refreshContent();
        return;
_L2:
        if (vm.getStatusProp() == com.skype.email.STATUS.UNPLAYED || vm.getStatusProp() == com.skype.email.STATUS.PLAYED || vm.getStatusProp() == com.skype.email.STATUS.NOTDOWNLOADED)
        {
            m.access$500(m.this).sendEmptyMessage(2);
            vm.startPlayback();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public er(Voicemail voicemail)
    {
        this$0 = m.this;
        super();
        vm = voicemail;
    }
}
