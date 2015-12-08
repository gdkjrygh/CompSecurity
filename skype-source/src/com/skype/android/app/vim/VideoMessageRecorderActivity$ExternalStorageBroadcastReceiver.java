// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Context;
import android.content.Intent;
import com.skype.android.util.CheckedBroadcastReceiver;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

public class this._cls0 extends CheckedBroadcastReceiver
{

    final VideoMessageRecorderActivity this$0;

    public void onReceiveFiltered(Context context, Intent intent, int i)
    {
        VideoMessageRecorderActivity.access$600(VideoMessageRecorderActivity.this);
    }

    ()
    {
        this$0 = VideoMessageRecorderActivity.this;
        super(VideoMessageRecorderActivity.STORAGE_ACTIONS);
    }
}
