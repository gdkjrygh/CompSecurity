// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.util.Base64;
import com.google.android.gms.people.model.Owner;
import com.google.common.base.Function;
import java.nio.charset.Charset;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls0
    implements Function
{

    final NavDrawerFragment this$0;

    private static String apply(Owner owner)
    {
        return Base64.encodeToString(owner.getAccountName().getBytes(Charset.forName("UTF-8")), 0);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((Owner)obj);
    }

    ()
    {
        this$0 = NavDrawerFragment.this;
        super();
    }
}
