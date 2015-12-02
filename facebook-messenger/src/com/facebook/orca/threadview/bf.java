// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            l, ThreadViewAudioAttachmentView

class bf
    implements android.view.View.OnLongClickListener
{

    final l a;
    final ThreadViewAudioAttachmentView b;

    bf(ThreadViewAudioAttachmentView threadviewaudioattachmentview, l l1)
    {
        b = threadviewaudioattachmentview;
        a = l1;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.a(null);
        return true;
    }
}
