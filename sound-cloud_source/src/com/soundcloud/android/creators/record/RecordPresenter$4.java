// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.DialogInterface;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordPresenter, SoundRecorder

class this._cls0
    implements android.content.ClickListener
{

    final RecordPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        RecordPresenter.access$000(RecordPresenter.this).revertFile();
        RecordPresenter recordpresenter = RecordPresenter.this;
        if (RecordPresenter.access$200(RecordPresenter.this).isPlayState())
        {
            dialoginterface = ateState.PLAYBACK;
        } else
        {
            dialoginterface = ateState.IDLE_PLAYBACK;
        }
        RecordPresenter.access$300(recordpresenter, dialoginterface);
    }

    ateState()
    {
        this$0 = RecordPresenter.this;
        super();
    }
}
