// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            TalkToCoverView

final class dv
    implements android.view.View.OnClickListener
{

    final TalkToCoverView a;

    dv(TalkToCoverView talktocoverview)
    {
        a = talktocoverview;
        super();
    }

    public final void onClick(View view)
    {
        a.deleteConversation();
    }
}
