// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewAudioAttachmentView

class bd
    implements android.view.View.OnLongClickListener
{

    final ThreadViewAudioAttachmentView a;

    bd(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        a = threadviewaudioattachmentview;
        super();
    }

    public boolean onLongClick(View view)
    {
        return view.showContextMenu();
    }
}
