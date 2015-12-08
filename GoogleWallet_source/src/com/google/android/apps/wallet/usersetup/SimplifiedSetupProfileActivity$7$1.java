// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.os.Bundle;
import com.google.android.apps.wallet.gms.PeopleGraphRequester;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity

final class this._cls1
    implements ResultCallback
{

    final onResult this$1;

    private void onResult(com.google.android.gms.people.tivity._cls7._cls1 _pcls1)
    {
        SimplifiedSetupProfileActivity.access$800(_fld0, _pcls1._mth0(), _pcls1._mth0());
    }

    public final volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.people.tivity._cls7._cls1.onResult)result);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/usersetup/SimplifiedSetupProfileActivity$7

/* anonymous class */
    final class SimplifiedSetupProfileActivity._cls7
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        final SimplifiedSetupProfileActivity this$0;

        public final void onConnected(Bundle bundle)
        {
            bundle = (new com.google.android.gms.people.Graph.LoadOwnersOptions()).setIncludePlusPages(false);
            PeopleGraphRequester peoplegraphrequester = peopleGraphRequester;
            PeopleGraphRequester.loadOwners(peopleClient, bundle, new SimplifiedSetupProfileActivity._cls7._cls1());
        }

        public final void onConnectionSuspended(int i)
        {
        }

            
            {
                this$0 = SimplifiedSetupProfileActivity.this;
                super();
            }
    }

}
