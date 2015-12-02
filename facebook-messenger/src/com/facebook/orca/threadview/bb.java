// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.orca.d.k;
import com.facebook.orca.d.l;

// Referenced classes of package com.facebook.orca.threadview:
//            bg, ThreadViewAudioAttachmentView

class bb
    implements l
{

    final ThreadViewAudioAttachmentView a;

    bb(ThreadViewAudioAttachmentView threadviewaudioattachmentview)
    {
        a = threadviewaudioattachmentview;
        super();
    }

    public void a(k k1)
    {
        switch (bg.a[k1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            ThreadViewAudioAttachmentView.a(a);
            return;

        case 2: // '\002'
            a.c();
            return;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            ThreadViewAudioAttachmentView.b(a);
            break;
        }
    }
}
