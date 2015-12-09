// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, PrebuiltDialogs, GamesDialogBuilder

static final class t extends GamesDialogFragment
{

    final int val$messageId;

    protected final android.support.v7.app.r createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        bundle = super.mActivity.getLayoutInflater().inflate(0x7f0400c0, null);
        ((TextView)bundle.findViewById(0x7f0d0105)).setText(val$messageId);
        return gamesdialogbuilder.setTitle(0x7f100233).setView(bundle).setCancelable(false);
    }

    (int i)
    {
        val$messageId = i;
        super();
    }
}
