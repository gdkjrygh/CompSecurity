// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewAudioAttachmentView

class bc
    implements android.view.View.OnClickListener
{

    final ThreadViewAudioAttachmentView a;

    bc(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        a = threadviewaudioattachmentview;
        super();
    }

    public void onClick(View view)
    {
        ThreadViewAudioAttachmentView.c(a);
    }
}
