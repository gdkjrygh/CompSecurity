// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            ChatListManager

final class this._cls0
    implements android.view.er
{

    final ChatListManager this$0;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 30
    //                   1 58;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        ChatListManager.access$502(ChatListManager.this, (int)motionevent.getX());
        ChatListManager.access$602(ChatListManager.this, (int)motionevent.getY());
        return false;
_L3:
        if (motionevent.getEventTime() - motionevent.getDownTime() < (long)ChatListManager.access$700(ChatListManager.this))
        {
            int i = (int)motionevent.getX();
            int j = ChatListManager.access$500(ChatListManager.this);
            int k = (int)motionevent.getY();
            int l = ChatListManager.access$600(ChatListManager.this);
            if (Math.abs(i - j) <= ChatListManager.access$800(ChatListManager.this) && Math.abs(k - l) <= ChatListManager.access$800(ChatListManager.this))
            {
                ChatListManager.access$900(ChatListManager.this).onHideMessageArea();
            }
            ChatListManager.access$502(ChatListManager.this, -1);
            ChatListManager.access$602(ChatListManager.this, -1);
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    atListCallback()
    {
        this$0 = ChatListManager.this;
        super();
    }
}
