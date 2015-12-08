// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            ReplayDialogFragment

final class a
    implements android.widget.Listener
{

    private ArrayList a;
    private ReplayDialogFragment b;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == a.size())
        {
            ReplayDialogFragment.a(b).a(playDialogResult.CANCEL, null);
        } else
        {
            ReplayDialogFragment.a(b).a(playDialogResult.PAID_REPLAY, (String)a.get(i));
        }
        b.dismiss();
    }

    playDialogResult(ReplayDialogFragment replaydialogfragment, ArrayList arraylist)
    {
        b = replaydialogfragment;
        a = arraylist;
        super();
    }
}
