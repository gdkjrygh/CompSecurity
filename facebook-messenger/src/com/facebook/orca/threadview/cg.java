// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.common.executors.a;
import com.facebook.orca.photos.b.i;
import com.facebook.orca.photos.b.w;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewImageAttachmentView, ch, cc

class cg extends i
{

    final ThreadViewImageAttachmentView a;

    private cg(ThreadViewImageAttachmentView threadviewimageattachmentview)
    {
        a = threadviewimageattachmentview;
        super();
    }

    cg(ThreadViewImageAttachmentView threadviewimageattachmentview, cc cc)
    {
        this(threadviewimageattachmentview);
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
        ThreadViewImageAttachmentView.e(a).b(new ch(this, w1));
    }
}
