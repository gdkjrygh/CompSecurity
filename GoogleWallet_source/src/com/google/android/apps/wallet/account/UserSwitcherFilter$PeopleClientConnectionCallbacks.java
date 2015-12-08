// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;

// Referenced classes of package com.google.android.apps.wallet.account:
//            UserSwitcherFilter

final class <init>
    implements com.google.android.gms.common.api.acks
{

    public ownersLoadedListener ownersLoadedListener;
    final UserSwitcherFilter this$0;

    public final void onConnected(Bundle bundle)
    {
        if (UserSwitcherFilter.access$100(UserSwitcherFilter.this).isConnected())
        {
            bundle = (new com.google.android.gms.people.allbacks.this._cls0())._mth0(false);
            People.GraphApi.loadOwners(UserSwitcherFilter.access$100(UserSwitcherFilter.this), bundle).setResultCallback(ownersLoadedListener);
        }
    }

    public final void onConnectionSuspended(int i)
    {
    }

    private ()
    {
        this$0 = UserSwitcherFilter.this;
        super();
        ownersLoadedListener = new ownersLoadedListener(UserSwitcherFilter.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
