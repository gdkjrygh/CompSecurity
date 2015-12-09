// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, PrebuiltDialogs, GamesDialogBuilder

static final class t extends GamesDialogFragment
{

    final int val$messageStringId;

    protected final android.support.v7.app.r createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        return gamesdialogbuilder.setTitle(0x7f100201).setMessage(val$messageStringId).setPositiveButton(0x104000a, null);
    }

    (int i)
    {
        val$messageStringId = i;
        super();
    }
}
