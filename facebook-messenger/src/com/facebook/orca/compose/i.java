// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.View;
import com.facebook.ui.media.attachments.a;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeAttachmentContainer

class i
    implements android.view.View.OnClickListener
{

    final a a;
    final ComposeAttachmentContainer b;

    i(ComposeAttachmentContainer composeattachmentcontainer, a a1)
    {
        b = composeattachmentcontainer;
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        com.facebook.orca.compose.ComposeAttachmentContainer.a(b, a);
    }
}
