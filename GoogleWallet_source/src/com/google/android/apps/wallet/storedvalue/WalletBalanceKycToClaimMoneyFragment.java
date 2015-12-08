// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.p2p.ClaimMoneyTile;
import com.google.android.apps.wallet.p2p.ClaimablePurchaseRecordEvent;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalanceKycToClaimMoneyFragment extends TileFragment
{

    ClaimMoneyTile claimMoneyTile;
    EventBus eventBus;
    private boolean haveMoneyToClaim;
    private boolean knowKyc;
    private boolean knowMoneyToClaim;
    private boolean needKyc;

    public WalletBalanceKycToClaimMoneyFragment()
    {
        knowKyc = false;
        knowMoneyToClaim = false;
    }

    private void onClaimablePurchaseRecordEvent(ClaimablePurchaseRecordEvent claimablepurchaserecordevent)
    {
        knowMoneyToClaim = true;
        haveMoneyToClaim = ClaimMoneyTile.shouldShowOn(claimablepurchaserecordevent);
        claimMoneyTile.onClaimablePurchaseRecordEvent(claimablepurchaserecordevent);
        updateTileVisibilityAndPossiblyNotify();
    }

    private void onKycStatusEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
    {
        boolean flag = true;
        if (kycstatusevent.getStatus() != null)
        {
            knowKyc = true;
            if (kycstatusevent.getStatus().intValue() == 1)
            {
                flag = false;
            }
            needKyc = flag;
            updateTileVisibilityAndPossiblyNotify();
            return;
        } else
        {
            notifyTileChanged();
            return;
        }
    }

    private void updateTileVisibilityAndPossiblyNotify()
    {
        View view = claimMoneyTile.getView();
        int i;
        if (haveMoneyToClaim)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (!knowKyc || !needKyc || knowMoneyToClaim)
        {
            notifyTileChanged();
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = claimMoneyTile.onCreateView(viewgroup);
        claimMoneyTile.setView(layoutinflater);
        return layoutinflater;
    }

    public final void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        eventBus.register(this);
    }

    public final boolean shouldShow()
    {
        return needKyc && haveMoneyToClaim;
    }
}
