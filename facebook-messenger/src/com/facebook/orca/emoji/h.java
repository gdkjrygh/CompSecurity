// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.orca.emoji:
//            EmojiAttachmentPopup

class h
    implements android.view.View.OnTouchListener
{

    final EmojiAttachmentPopup a;

    h(EmojiAttachmentPopup emojiattachmentpopup)
    {
        a = emojiattachmentpopup;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        EmojiAttachmentPopup.a(a, motionevent);
        return false;
    }
}
