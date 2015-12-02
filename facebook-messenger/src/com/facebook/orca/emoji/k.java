// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.content.res.Resources;
import android.widget.ImageButton;

// Referenced classes of package com.facebook.orca.emoji:
//            EmojiAttachmentPopup

class k
    implements Runnable
{

    final ImageButton a;
    final Resources b;
    final int c;
    final EmojiAttachmentPopup d;

    k(EmojiAttachmentPopup emojiattachmentpopup, ImageButton imagebutton, Resources resources, int i)
    {
        d = emojiattachmentpopup;
        a = imagebutton;
        b = resources;
        c = i;
        super();
    }

    public void run()
    {
        a.setImageDrawable(b.getDrawable(c));
    }
}
