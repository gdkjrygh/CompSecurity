// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget:
//            TalkToCoverView

final class dy
    implements android.content.DialogInterface.OnClickListener
{

    final TalkToCoverView a;

    dy(TalkToCoverView talktocoverview)
    {
        a = talktocoverview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            TalkToCoverView.b(a);
            return;

        case 1: // '\001'
            TalkToCoverView.c(a);
            return;

        case 2: // '\002'
            TalkToCoverView.d(a);
            break;
        }
    }
}
