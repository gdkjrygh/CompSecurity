// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            ChatActivity, ChatFragment

final class this._cls0
    implements android.view.tener
{

    final ChatActivity this$0;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view = ChatActivity.access$000(ChatActivity.this).getView();
        if (view != null && motionevent.getRawX() > (float)view.getLeft())
        {
            view.dispatchTouchEvent(motionevent);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = ChatActivity.this;
        super();
    }
}
