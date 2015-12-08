// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog.changeaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

// Referenced classes of package com.google.android.gms.games.ui.dialog.changeaccount:
//            ChangeAccountDialogFragment

public final class MatchChangeAccountDialogFragment extends ChangeAccountDialogFragment
{
    public static interface MatchAccountSwitcher
    {

        public abstract void switchAccountForRematch(TurnBasedMatch turnbasedmatch);

        public abstract void switchAccountForTurnBasedMatch(TurnBasedMatch turnbasedmatch);
    }

    public static interface MatchAccountSwitcherProvider
    {

        public abstract MatchAccountSwitcher getMatchAccountSwitcher();
    }


    public MatchChangeAccountDialogFragment()
    {
    }

    public static Bundle createArgs(String s, String s1, TurnBasedMatch turnbasedmatch, boolean flag)
    {
        turnbasedmatch = (TurnBasedMatch)turnbasedmatch.freeze();
        Bundle bundle = new Bundle();
        bundle.putAll(ChangeAccountDialogFragment.createArgs(turnbasedmatch.getGame().getDisplayName(), s, s1));
        bundle.putParcelable("match", turnbasedmatch);
        bundle.putBoolean("isRematch", flag);
        return bundle;
    }

    protected final void switchAccount()
    {
        Object obj = super.mActivity;
        TurnBasedMatch turnbasedmatch = (TurnBasedMatch)super.mArguments.getParcelable("match");
        boolean flag = super.mArguments.getBoolean("isRematch");
        if (obj instanceof MatchAccountSwitcher)
        {
            obj = (MatchAccountSwitcher)obj;
        } else
        if (obj instanceof MatchAccountSwitcherProvider)
        {
            obj = (MatchAccountSwitcher)Preconditions.checkNotNull(((MatchAccountSwitcherProvider)obj).getMatchAccountSwitcher());
        } else
        {
            throw new IllegalStateException("MatchChangeAccountDialogFragment must be used with a parent Activity which implements MatchAccountSwitcher or MatchAccountSwitcherProvider.");
        }
        if (flag)
        {
            ((MatchAccountSwitcher) (obj)).switchAccountForRematch(turnbasedmatch);
            return;
        } else
        {
            ((MatchAccountSwitcher) (obj)).switchAccountForTurnBasedMatch(turnbasedmatch);
            return;
        }
    }
}
