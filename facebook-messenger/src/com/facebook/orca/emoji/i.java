// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.view.View;

// Referenced classes of package com.facebook.orca.emoji:
//            EmojiAttachmentPopup

class i
    implements android.view.View.OnClickListener
{

    final EmojiAttachmentPopup a;

    i(EmojiAttachmentPopup emojiattachmentpopup)
    {
        a = emojiattachmentpopup;
        super();
    }

    public void onClick(View view)
    {
        a.a(a.ag, com.facebook.i.emoji_back_container).setVisibility(8);
        a.a(a.ag, com.facebook.i.emoji_front_container).setVisibility(0);
    }
}
