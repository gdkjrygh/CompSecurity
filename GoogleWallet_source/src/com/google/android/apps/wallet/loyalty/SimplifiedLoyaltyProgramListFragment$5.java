// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            SimplifiedLoyaltyProgramListFragment

final class this._cls0
    implements AsyncCallback
{

    final SimplifiedLoyaltyProgramListFragment this$0;

    private void onSuccess(com.google.wallet.proto.api.msResponse msresponse)
    {
        SimplifiedLoyaltyProgramListFragment.access$400(SimplifiedLoyaltyProgramListFragment.this, Arrays.asList(msresponse.programs));
        setDisplayType(splayType.LIST);
    }

    public final void onFailure(Exception exception)
    {
        setDisplayType(splayType.ERROR);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.msResponse)obj);
    }

    splayType()
    {
        this$0 = SimplifiedLoyaltyProgramListFragment.this;
        super();
    }
}
