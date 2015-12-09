// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog.changeaccount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.games.ui.dialog.changeaccount:
//            ChangeAccountDialogFragment

public final class IntentChangeAccountDialogFragment extends ChangeAccountDialogFragment
{
    public static interface IntentAccountSwitcher
    {

        public abstract void switchAccountForIntent(Intent intent);
    }

    public static interface IntentAccountSwitcherProvider
    {

        public abstract IntentAccountSwitcher getIntentAccountSwitcher();
    }


    public IntentChangeAccountDialogFragment()
    {
    }

    public static Bundle createArgs(String s, String s1, String s2, Intent intent)
    {
        Bundle bundle = new Bundle();
        bundle.putAll(ChangeAccountDialogFragment.createArgs(s, s1, s2));
        bundle.putParcelable("intent", intent);
        return bundle;
    }

    protected final void switchAccount()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = super.mActivity;
        Intent intent = (Intent)super.mArguments.getParcelable("intent");
        if (fragmentactivity instanceof IntentAccountSwitcherProvider)
        {
            ((IntentAccountSwitcher)Preconditions.checkNotNull(((IntentAccountSwitcherProvider)fragmentactivity).getIntentAccountSwitcher())).switchAccountForIntent(intent);
            return;
        } else
        {
            throw new IllegalStateException("IntentChangeAccountDialogFragment must be used with a parent Activity which implements IntentAccountSwitcherProvider.");
        }
    }
}
