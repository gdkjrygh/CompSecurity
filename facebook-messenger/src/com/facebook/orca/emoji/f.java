// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.view.View;

// Referenced classes of package com.facebook.orca.emoji:
//            EmojiAttachmentPopup, c

class f
    implements android.view.View.OnClickListener
{

    final c a;
    final boolean b;
    final EmojiAttachmentPopup c;

    f(EmojiAttachmentPopup emojiattachmentpopup, c c1, boolean flag)
    {
        c = emojiattachmentpopup;
        a = c1;
        b = flag;
        super();
    }

    public void onClick(View view)
    {
        EmojiAttachmentPopup.a(c, a, b);
    }
}
