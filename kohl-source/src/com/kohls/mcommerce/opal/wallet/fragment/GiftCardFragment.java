// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.kohls.mcommerce.opal.wallet.adapter.WalletAdapter;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseKohlsCashOffersFragment

public class GiftCardFragment extends BaseKohlsCashOffersFragment
{

    public GiftCardFragment()
    {
    }

    protected boolean formatWalletData(WalletResponse walletresponse)
    {
        boolean flag = false;
        List list = walletresponse.getWalletItems();
        sortWalletData(walletresponse);
        List list1 = getNewEntriesFromPref();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            WalletItemResponse walletitemresponse = (WalletItemResponse)iterator.next();
            boolean flag1 = true;
            if (walletitemresponse.getTypeCode().equalsIgnoreCase("giftcard") || walletitemresponse.getTypeCode().equalsIgnoreCase("kmrc"))
            {
                if (Double.valueOf(walletitemresponse.getValue()).doubleValue() <= 0.0D)
                {
                    walletitemresponse.setCouponState(REDEEMED.intValue());
                    arraylist1.add(walletitemresponse);
                } else
                {
                    walletitemresponse.setCouponState(AVAILABLE.intValue());
                    arraylist.add(walletitemresponse);
                }
            }
            if (list1 != null && list1.contains(walletitemresponse.getId()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            walletitemresponse.setNewItem(flag);
            flag = flag1;
        }
        list.clear();
        list.addAll(arraylist);
        list.addAll(arraylist1);
        walletresponse.setWalletItems(list);
        return flag;
    }

    protected WalletAdapter getAdapter(List list)
    {
        mAdapter = new WalletAdapter(getActivity(), Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET, list);
        return mAdapter;
    }

    protected int getPosition()
    {
        return Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET;
    }

    protected void registerForModification()
    {
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(mOffersDeletedReceiver, new IntentFilter("giftcard_deleted"));
    }
}
