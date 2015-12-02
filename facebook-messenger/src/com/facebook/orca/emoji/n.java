// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.facebook.orca.emoji:
//            aq, EmojiAttachmentPopup

class n
    implements aq
{

    final EmojiAttachmentPopup a;

    n(EmojiAttachmentPopup emojiattachmentpopup)
    {
        a = emojiattachmentpopup;
        super();
    }

    public View a(Context context, Object obj, String s, int i)
    {
        return EmojiAttachmentPopup.a(a, context, obj, false);
    }
}
