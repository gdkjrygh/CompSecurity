// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.gms.people.model.Owner;
import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity

final class this._cls0
    implements Function
{

    final SimplifiedSetupProfileActivity this$0;

    private static String apply(Owner owner)
    {
        return owner.getAccountName();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((Owner)obj);
    }

    ()
    {
        this$0 = SimplifiedSetupProfileActivity.this;
        super();
    }
}
