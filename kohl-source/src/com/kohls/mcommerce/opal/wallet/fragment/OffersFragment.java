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
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseKohlsCashOffersFragment

public class OffersFragment extends BaseKohlsCashOffersFragment
{

    public OffersFragment()
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
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WalletItemResponse walletitemresponse = (WalletItemResponse)iterator.next();
            boolean flag1 = true;
            flag = flag1;
            if (walletitemresponse.getTypeCode().equalsIgnoreCase("offer"))
            {
                if (Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue() - Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue() < 0x5265c00L)
                {
                    walletitemresponse.setShortTermOffer(true);
                }
                if (!walletitemresponse.isShortTermOffer() && Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue() < System.currentTimeMillis() - timeZoneOfferOffset || walletitemresponse.getTypeCode().equalsIgnoreCase("offer") && walletitemresponse.isShortTermOffer() && Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue() < System.currentTimeMillis())
                {
                    walletitemresponse.setCouponState(EXPIRED.intValue());
                    arraylist3.add(walletitemresponse);
                } else
                if (walletitemresponse.isShortTermOffer() && Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue() > System.currentTimeMillis() || walletitemresponse.getTypeCode().equalsIgnoreCase("offer") && !walletitemresponse.isShortTermOffer() && Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue() > System.currentTimeMillis() - timeZoneOfferOffset)
                {
                    walletitemresponse.setCouponState(PENDING.intValue());
                    arraylist2.add(walletitemresponse);
                } else
                {
                    walletitemresponse.setCouponState(AVAILABLE.intValue());
                    arraylist.add(walletitemresponse);
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
        } while (true);
        list.clear();
        Collections.sort(arraylist2, new Comparator() {

            final OffersFragment this$0;

            public int compare(WalletItemResponse walletitemresponse1, WalletItemResponse walletitemresponse2)
            {
                return walletitemresponse1.getEffectiveStartDate().compareTo(walletitemresponse2.getEffectiveStartDate());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((WalletItemResponse)obj, (WalletItemResponse)obj1);
            }

            
            {
                this$0 = OffersFragment.this;
                super();
            }
        });
        list.addAll(arraylist);
        list.addAll(arraylist2);
        list.addAll(arraylist1);
        list.addAll(arraylist3);
        walletresponse.setWalletItems(list);
        return flag;
    }

    protected WalletAdapter getAdapter(List list)
    {
        mAdapter = new WalletAdapter(getActivity(), Constants.POSITION_OF_OFFERS_TAB_IN_WALLET, list);
        return mAdapter;
    }

    protected int getPosition()
    {
        return Constants.POSITION_OF_OFFERS_TAB_IN_WALLET;
    }

    protected void registerForModification()
    {
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(mOffersDeletedReceiver, new IntentFilter("offers_deleted"));
    }
}
