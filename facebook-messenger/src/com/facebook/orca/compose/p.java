// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import com.facebook.ui.media.attachments.a;

// Referenced classes of package com.facebook.orca.compose:
//            g, ComposeFragment, ComposeAttachmentContainer

class p
    implements g
{

    final ComposeFragment a;

    p(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a()
    {
        ComposeFragment.A(a);
        ComposeFragment.B(a);
    }

    public void a(a a1)
    {
        ComposeFragment.y(a).a(a1, ComposeFragment.x(a));
        ComposeFragment.z(a);
    }
}
