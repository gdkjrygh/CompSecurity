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

final class this._cls0
    implements com.google.android.gms.common.api.ks
{

    final SimplifiedSetupProfileActivity this$0;

    public final void onConnected(Bundle bundle)
    {
        bundle = (new com.google.android.gms.people.Activity._cls7()).ePlusPages(false);
        PeopleGraphRequester peoplegraphrequester = peopleGraphRequester;
        PeopleGraphRequester.loadOwners(peopleClient, bundle, new ResultCallback() {

            final SimplifiedSetupProfileActivity._cls7 this$1;

            private void onResult(com.google.android.gms.people.Graph.LoadOwnersResult loadownersresult)
            {
                SimplifiedSetupProfileActivity.access$800(this$0, loadownersresult.getStatus(), loadownersresult.getOwners());
            }

            public final volatile void onResult(Result result)
            {
                onResult((com.google.android.gms.people.Graph.LoadOwnersResult)result);
            }

            
            {
                this$1 = SimplifiedSetupProfileActivity._cls7.this;
                super();
            }
        });
    }

    public final void onConnectionSuspended(int i)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = SimplifiedSetupProfileActivity.this;
        super();
    }
}
