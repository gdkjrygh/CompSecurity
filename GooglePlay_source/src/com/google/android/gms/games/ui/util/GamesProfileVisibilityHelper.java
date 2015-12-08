// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            BaseGamesProfileVisibilityHelper, DialogFragmentUtil

public final class GamesProfileVisibilityHelper extends BaseGamesProfileVisibilityHelper
{

    public GamesProfileVisibilityHelper(GamesFragmentActivity gamesfragmentactivity, BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer profilevisibilityinformer)
    {
        super(gamesfragmentactivity, profilevisibilityinformer);
    }

    protected final void dismissWaitingDialog()
    {
        DialogFragmentUtil.dismiss(mActivity, "com.google.android.gms.games.ui.dialog.progressDialogUpdatingProfileVisibility");
    }

    protected final void showWaitingDialog()
    {
        com.google.android.gms.games.ui.dialog.GamesDialogFragment gamesdialogfragment = PrebuiltDialogs.newProgressDialog(0x7f100229);
        DialogFragmentUtil.show(mActivity, gamesdialogfragment, "com.google.android.gms.games.ui.dialog.progressDialogUpdatingProfileVisibility");
    }
}
