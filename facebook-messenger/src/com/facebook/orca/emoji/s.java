// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.c;
import com.facebook.orca.annotations.IsEmojiAttachmentPopupEnabled;

// Referenced classes of package com.facebook.orca.emoji:
//            z, u, aa, v, 
//            aj

public class s extends c
{

    public s()
    {
    }

    protected void a()
    {
        a(com/facebook/orca/emoji/z).a(new u(this, null));
        a(com/facebook/orca/emoji/aa).a(new v(this, null)).a();
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsEmojiAttachmentPopupEnabled).c(com/facebook/orca/emoji/aj);
    }
}
