// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.DialogInterface;
import kik.a.d.k;
import kik.a.e.i;

// Referenced classes of package kik.android.widget:
//            TalkToCoverView

final class eb
    implements android.content.DialogInterface.OnClickListener
{

    final TalkToCoverView a;

    eb(TalkToCoverView talktocoverview)
    {
        a = talktocoverview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        a.d.c(TalkToCoverView.e(a).b());
    }
}
