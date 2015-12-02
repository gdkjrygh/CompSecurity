// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;
import com.facebook.orca.attachments.ImageAttachmentData;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewImageAttachmentView

class cd
    implements android.view.View.OnClickListener
{

    final ImageAttachmentData a;
    final ThreadViewImageAttachmentView b;

    cd(ThreadViewImageAttachmentView threadviewimageattachmentview, ImageAttachmentData imageattachmentdata)
    {
        b = threadviewimageattachmentview;
        a = imageattachmentdata;
        super();
    }

    public void onClick(View view)
    {
        ThreadViewImageAttachmentView.a(b, a);
    }
}
