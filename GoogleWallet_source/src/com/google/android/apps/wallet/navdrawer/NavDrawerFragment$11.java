// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.accounts.Account;
import com.google.android.gms.people.model.Owner;
import com.google.common.base.Predicate;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls0
    implements Predicate
{

    final NavDrawerFragment this$0;

    private boolean apply(Owner owner)
    {
        return !owner.getAccountName().equals(((Account)account.get()).name);
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((Owner)obj);
    }

    ()
    {
        this$0 = NavDrawerFragment.this;
        super();
    }
}
