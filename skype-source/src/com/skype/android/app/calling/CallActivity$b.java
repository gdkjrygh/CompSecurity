// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.Conversation;
import com.skype.android.app.ActionBarCustomizer;

// Referenced classes of package com.skype.android.app.calling:
//            CallActivity

private final class <init>
    implements <init>
{

    final CallActivity this$0;

    public final void onCallDurationUpdated(Conversation conversation)
    {
        actionBarCustomizer.updateCallDuration(conversation);
    }

    private ()
    {
        this$0 = CallActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
