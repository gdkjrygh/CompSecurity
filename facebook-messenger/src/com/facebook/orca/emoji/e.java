// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;


// Referenced classes of package com.facebook.orca.emoji:
//            an, EmojiAttachmentPopup

class e
    implements an
{

    final EmojiAttachmentPopup a;

    e(EmojiAttachmentPopup emojiattachmentpopup)
    {
        a = emojiattachmentpopup;
        super();
    }

    public void a(int i)
    {
        EmojiAttachmentPopup.b(a, i);
    }

    public void a(String s)
    {
        EmojiAttachmentPopup.a(a, s);
    }
}
