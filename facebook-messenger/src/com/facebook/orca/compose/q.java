// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import com.facebook.ui.media.attachments.a;

// Referenced classes of package com.facebook.orca.compose:
//            k, ComposeFragment, ComposeAttachmentContainer, aq

class q
    implements k
{

    final ComposeFragment a;

    q(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void a()
    {
        ComposeFragment.C(a);
    }

    public void a(a a1)
    {
        ComposeFragment.E(a).a(ComposeFragment.D(a), ComposeFragment.y(a).getMediaResources(), a1);
    }
}
