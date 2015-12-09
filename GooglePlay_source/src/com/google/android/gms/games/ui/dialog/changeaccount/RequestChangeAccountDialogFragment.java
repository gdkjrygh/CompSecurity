// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog.changeaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.request.GameRequest;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.dialog.changeaccount:
//            ChangeAccountDialogFragment

public final class RequestChangeAccountDialogFragment extends ChangeAccountDialogFragment
{
    public static interface RequestAccountSwitcher
    {

        public abstract void switchAccountForRequests(ArrayList arraylist);
    }

    public static interface RequestAccountSwitcherProvider
    {

        public abstract RequestAccountSwitcher getRequestAccountSwitcher();
    }


    public RequestChangeAccountDialogFragment()
    {
    }

    public static Bundle createArgs(String s, String s1, ArrayList arraylist)
    {
        arraylist = FreezableUtils.freeze(arraylist);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("requests", arraylist);
        bundle.putAll(ChangeAccountDialogFragment.createArgs(((GameRequest)arraylist.get(0)).getGame().getDisplayName(), s, s1));
        return bundle;
    }

    protected final void switchAccount()
    {
        Object obj = super.mActivity;
        ArrayList arraylist = super.mArguments.getParcelableArrayList("requests");
        if (obj instanceof RequestAccountSwitcher)
        {
            obj = (RequestAccountSwitcher)obj;
        } else
        if (obj instanceof RequestAccountSwitcherProvider)
        {
            obj = (RequestAccountSwitcher)Preconditions.checkNotNull(((RequestAccountSwitcherProvider)obj).getRequestAccountSwitcher());
        } else
        {
            throw new IllegalStateException("RequestChangeAccountDialogFragment must be used with a parent Activity which implements RequestAccountSwitcher or RequestAccountSwitcherProvider.");
        }
        ((RequestAccountSwitcher) (obj)).switchAccountForRequests(arraylist);
    }
}
