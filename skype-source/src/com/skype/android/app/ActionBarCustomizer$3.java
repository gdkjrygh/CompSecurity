// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.view.View;
import com.skype.Conversation;
import com.skype.android.app.chat.ParticipantActivity;

// Referenced classes of package com.skype.android.app:
//            ActionBarCustomizer, Navigation

final class val.conversation
    implements android.view.omizer._cls3
{

    final ActionBarCustomizer this$0;
    final Conversation val$conversation;

    public final void onClick(View view)
    {
        ActionBarCustomizer.access$100(ActionBarCustomizer.this).startIntentFor(val$conversation, com/skype/android/app/chat/ParticipantActivity);
    }

    ty()
    {
        this$0 = final_actionbarcustomizer;
        val$conversation = Conversation.this;
        super();
    }
}
