// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.content.DialogInterface;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            ReplayDialogFragment

final class a
    implements android.content.Listener
{

    private ReplayDialogFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ReplayDialogFragment.a(a).a(playDialogResult.CANCEL, null);
    }

    playDialogResult(ReplayDialogFragment replaydialogfragment)
    {
        a = replaydialogfragment;
        super();
    }
}
