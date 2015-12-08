// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.widget.PendingKeyboardDismissal;

// Referenced classes of package com.skype.android.app.main:
//            HubMaterialActivity

final class  extends PendingKeyboardDismissal
{

    final HubMaterialActivity this$0;
    final int val$objectId;

    protected final void proceed()
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        lib.getConversation(val$objectId, conversationimpl);
        navigation.chat(conversationimpl);
    }

    (View view, int i)
    {
        this$0 = final_hubmaterialactivity;
        val$objectId = i;
        super(InputMethodManager.this, view);
    }
}
