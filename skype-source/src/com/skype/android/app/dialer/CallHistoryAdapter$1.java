// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.view.View;
import com.skype.Conversation;
import com.skype.android.app.Navigation;
import com.skype.android.app.recents.Recent;
import com.skype.android.skylib.ObjectIdMap;

// Referenced classes of package com.skype.android.app.dialer:
//            CallHistoryAdapter

final class val.position
    implements android.view.istoryAdapter._cls1
{

    final CallHistoryAdapter this$0;
    final int val$position;

    public final void onClick(View view)
    {
        view = ((View) (getItem(val$position)));
        if (view instanceof Recent)
        {
            int i = ((Recent)view).getConversationObjectId();
            view = (Conversation)map.a(i, com/skype/Conversation);
            navigation.placeCall(view);
        }
    }

    ()
    {
        this$0 = final_callhistoryadapter;
        val$position = I.this;
        super();
    }
}
