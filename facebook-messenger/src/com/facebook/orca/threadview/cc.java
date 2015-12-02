// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;
import com.facebook.orca.attachments.ImageAttachmentData;

// Referenced classes of package com.facebook.orca.threadview:
//            l, ThreadViewImageAttachmentView

class cc
    implements android.view.View.OnLongClickListener
{

    final l a;
    final ImageAttachmentData b;
    final ThreadViewImageAttachmentView c;

    cc(ThreadViewImageAttachmentView threadviewimageattachmentview, l l1, ImageAttachmentData imageattachmentdata)
    {
        c = threadviewimageattachmentview;
        a = l1;
        b = imageattachmentdata;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.a(b);
        return true;
    }
}
