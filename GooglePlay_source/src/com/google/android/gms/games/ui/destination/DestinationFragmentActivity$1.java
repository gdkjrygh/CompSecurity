// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.people.accountswitcherview.OwnersListAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;
import com.google.android.gms.people.model.Owner;
import com.google.android.gms.people.model.OwnerBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationFragmentActivity

final class this._cls0
    implements ResultCallback
{

    final DestinationFragmentActivity this$0;

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.people.entActivity._cls1 _lcls1 = (com.google.android.gms.people.Adapter)result;
        DestinationFragmentActivity destinationfragmentactivity = DestinationFragmentActivity.this;
        if (!destinationfragmentactivity.getGoogleApiClient().isConnected())
        {
            GamesLog.w(DestinationFragmentActivity.TAG, "onOwnersLoaded - trying to update owners when not connected...");
        } else
        {
            result = _lcls1.us();
            OwnerBuffer ownerbuffer = _lcls1.rs();
            if (result.isSuccess())
            {
                ArrayList arraylist = new ArrayList();
                result = ownerbuffer.get(0);
                int j = ownerbuffer.getCount();
                int i = 0;
                while (i < j) 
                {
                    Owner owner = ownerbuffer.get(i);
                    if (owner.getAccountName().equals(destinationfragmentactivity.mCurrentAccountName))
                    {
                        result = owner;
                    } else
                    {
                        arraylist.add(owner);
                    }
                    i++;
                }
                if (destinationfragmentactivity.mOwnerAdapter == null)
                {
                    destinationfragmentactivity.mOwnerAdapter = new OwnersListAdapter(destinationfragmentactivity);
                    destinationfragmentactivity.mOwnerAdapter.mAvatarLoader = destinationfragmentactivity.mAvatarManager;
                    OwnersListAdapter ownerslistadapter = destinationfragmentactivity.mOwnerAdapter;
                    if (!ownerslistadapter.mShowManageAccounts)
                    {
                        ownerslistadapter.mShowManageAccounts = true;
                        ownerslistadapter.notifyDataSetChanged();
                    }
                    ownerslistadapter = destinationfragmentactivity.mOwnerAdapter;
                    if (!ownerslistadapter.mShowAddAccount)
                    {
                        ownerslistadapter.mShowAddAccount = true;
                        ownerslistadapter.notifyDataSetChanged();
                    }
                }
                destinationfragmentactivity.mOwnerAdapter.setOwners(arraylist);
                destinationfragmentactivity.mAccountSwitcher.bind(result);
                if (destinationfragmentactivity.mOwnerBuffer != null)
                {
                    destinationfragmentactivity.mOwnerBuffer.release();
                }
                destinationfragmentactivity.mOwnerBuffer = ownerbuffer;
                return;
            }
            GamesLog.e(DestinationFragmentActivity.TAG, (new StringBuilder("onOwnersLoaded - failed to load owners status: ")).append(result).toString());
            if (ownerbuffer != null)
            {
                ownerbuffer.release();
                return;
            }
        }
    }

    nView()
    {
        this$0 = DestinationFragmentActivity.this;
        super();
    }
}
