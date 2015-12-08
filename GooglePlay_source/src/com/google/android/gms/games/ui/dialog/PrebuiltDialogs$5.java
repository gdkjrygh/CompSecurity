// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, PrebuiltDialogs, GamesDialogBuilder

public static final class t extends GamesDialogFragment
{

    final int val$messageId = 0x7f1002d1;
    final int val$titleId = 0x7f1002d2;

    protected final android.support.v7.app.r createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        return gamesdialogbuilder.setTitle(val$titleId).setMessage(val$messageId).setPositiveButton(0x104000a, null);
    }

    public (int i, int j)
    {
        super();
    }
}
