// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.support.v4.app.Fragment;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.ui.dialog.ProfileVisibilityDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, ExtendedAppContentSection

public final class EditProfileVisibilityAction extends ExtendedAppContentAction
{

    public EditProfileVisibilityAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        DialogFragmentUtil.show(((Fragment) (mFragment)).mActivity, new ProfileVisibilityDialogFragment(), "com.google.android.gms.games.ui.dialog.privateLevelDialog");
    }

    public final int getLogflowUiElementType()
    {
        return 1144;
    }
}
