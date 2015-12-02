// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.view.View;

// Referenced classes of package com.facebook.orca.emoji:
//            EmojiAttachmentPopup

class l
    implements android.view.View.OnClickListener
{

    final int a;
    final EmojiAttachmentPopup b;

    l(EmojiAttachmentPopup emojiattachmentpopup, int i)
    {
        b = emojiattachmentpopup;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        a;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 48
    //                   2 60
    //                   3 36
    //                   4 72;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        EmojiAttachmentPopup.a(b, a);
        return;
_L2:
        b.a("gallery_button");
        continue; /* Loop/switch isn't completed */
_L3:
        b.a("camera_button");
        continue; /* Loop/switch isn't completed */
_L4:
        b.a("image_search_button");
        if (true) goto _L1; else goto _L5
_L5:
    }
}
