// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import com.facebook.common.executors.a;
import com.facebook.orca.photos.b.i;
import com.facebook.orca.photos.b.w;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeAttachmentContainer, m, i

class l extends i
{

    final ComposeAttachmentContainer a;

    private l(ComposeAttachmentContainer composeattachmentcontainer)
    {
        a = composeattachmentcontainer;
        super();
    }

    l(ComposeAttachmentContainer composeattachmentcontainer, com.facebook.orca.compose.i j)
    {
        this(composeattachmentcontainer);
    }

    public Class a()
    {
        return com/facebook/orca/photos/b/w;
    }

    public volatile void a(com.facebook.c.a.a a1)
    {
        a((w)a1);
    }

    public void a(w w1)
    {
        ComposeAttachmentContainer.c(a).b(new m(this, w1));
    }
}
