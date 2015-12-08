// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog.changeaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;

// Referenced classes of package com.google.android.gms.games.ui.dialog.changeaccount:
//            ChangeAccountDialogFragment

public final class InvitationChangeAccountDialogFragment extends ChangeAccountDialogFragment
{
    public static interface InvitationAccountSwitcher
    {

        public abstract void switchAccountForInvitation(Invitation invitation);
    }

    public static interface InvitationAccountSwitcherProvider
    {

        public abstract InvitationAccountSwitcher getInvitationAccountSwitcher();
    }


    public InvitationChangeAccountDialogFragment()
    {
    }

    public static Bundle createArgs(String s, String s1, Invitation invitation)
    {
        invitation = (Invitation)invitation.freeze();
        Bundle bundle = new Bundle();
        bundle.putAll(ChangeAccountDialogFragment.createArgs(invitation.getGame().getDisplayName(), s, s1));
        bundle.putParcelable("invitation", invitation);
        return bundle;
    }

    protected final void switchAccount()
    {
        Object obj = super.mActivity;
        Invitation invitation = (Invitation)super.mArguments.getParcelable("invitation");
        if (obj instanceof InvitationAccountSwitcher)
        {
            obj = (InvitationAccountSwitcher)obj;
        } else
        if (obj instanceof InvitationAccountSwitcherProvider)
        {
            obj = (InvitationAccountSwitcher)Preconditions.checkNotNull(((InvitationAccountSwitcherProvider)obj).getInvitationAccountSwitcher());
        } else
        {
            throw new IllegalStateException("InvitationChangeAccountDialogFragment must be used with a parent Activity which implements InvitationAccountSwitcher or InvitationAccountSwitcherProvider.");
        }
        ((InvitationAccountSwitcher) (obj)).switchAccountForInvitation(invitation);
    }
}
