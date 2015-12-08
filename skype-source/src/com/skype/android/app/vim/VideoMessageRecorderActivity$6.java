// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.telephony.PhoneStateListener;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

final class this._cls0 extends PhoneStateListener
{

    final VideoMessageRecorderActivity this$0;

    public final void onCallStateChanged(int i, String s)
    {
        if (i != 0)
        {
            VideoMessageRecorderActivity.access$500(VideoMessageRecorderActivity.this, REVIEW);
        }
    }

    ()
    {
        this$0 = VideoMessageRecorderActivity.this;
        super();
    }
}
