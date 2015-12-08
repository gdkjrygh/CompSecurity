// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.adapter.WalletAdapter;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.WalletCache;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseWalletFragment

public abstract class BaseKohlsCashOffersFragment extends BaseWalletFragment
    implements ActionListener
{

    protected static final Integer AVAILABLE = Integer.valueOf(9092);
    protected static final Integer EXPIRED = Integer.valueOf(9095);
    protected static final Integer PENDING = Integer.valueOf(9093);
    protected static final Integer REDEEMED = Integer.valueOf(9094);
    protected boolean isAnimationPending;
    protected boolean isFromCache;
    protected WalletAdapter mAdapter;
    protected RelativeLayout mEmptyWalletText;
    protected TextView mHeaderTitle;
    protected ViewPager mListView;
    protected RelativeLayout mPageviewContent;
    protected View mParent;
    protected SwipeRefreshLayout mScrollView;
    protected TextView mValueToSet;
    protected long timeZoneOfferOffset;
    protected int timeZonecashOffset;
    TimeZone tz1;
    TimeZone tz2;

    public BaseKohlsCashOffersFragment()
    {
        isAnimationPending = true;
        timeZonecashOffset = TimeZone.getDefault().getOffset(Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis());
        tz1 = TimeZone.getDefault();
        tz2 = TimeZone.getTimeZone("US/Central");
        timeZoneOfferOffset = ((tz2.getRawOffset() - tz1.getRawOffset()) + tz2.getDSTSavings()) - tz1.getDSTSavings();
        isFromCache = false;
    }

    private WalletResponse getWalletResponseFromCache()
    {
        return WalletCache.get(getActivity().getApplicationContext(), "rpwallet");
    }

    protected View doOnCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mParent = layoutinflater.inflate(0x7f03001f, viewgroup, false);
        mListView = (ViewPager)mParent.findViewById(0x7f0d0112);
        mPageviewContent = (RelativeLayout)mParent.findViewById(0x7f0d010d);
        mHeaderTitle = (TextView)mParent.findViewById(0x7f0d010f);
        mValueToSet = (TextView)mParent.findViewById(0x7f0d0110);
        mAdapter = getAdapter(new ArrayList());
        mListView.setAdapter(mAdapter);
        mListView.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final BaseKohlsCashOffersFragment this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                int j = i;
                if (i > 0)
                {
                    if (i == mAdapter.getCount() - 1 && mAdapter.getCount() > 2)
                    {
                        j = 2;
                    } else
                    {
                        j = 1;
                    }
                }
                switch (j)
                {
                default:
                    ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020165);
                    ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020164);
                    ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020165);
                    return;

                case 0: // '\0'
                    ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020164);
                    ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020165);
                    ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020165);
                    return;

                case 1: // '\001'
                    ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020165);
                    ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020164);
                    ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020165);
                    return;

                case 2: // '\002'
                    ((ImageView)mParent.findViewById(0x7f0d0115)).setImageResource(0x7f020165);
                    break;
                }
                ((ImageView)mParent.findViewById(0x7f0d0116)).setImageResource(0x7f020165);
                ((ImageView)mParent.findViewById(0x7f0d0117)).setImageResource(0x7f020164);
            }

            
            {
                this$0 = BaseKohlsCashOffersFragment.this;
                super();
            }
        });
        registerForWalletData();
        if (ListenerManager.getInstance().isDataAvailable())
        {
            onActionPerformed();
        }
        registerForModification();
        mAdapter.registerDataSetObserver(new DataSetObserver() {

            final BaseKohlsCashOffersFragment this$0;

            public void onChanged()
            {
                isFromCache = false;
                setupView();
                super.onChanged();
            }

            
            {
                this$0 = BaseKohlsCashOffersFragment.this;
                super();
            }
        });
        isFromCache = true;
        setupView();
        return mParent;
    }

    protected abstract boolean formatWalletData(WalletResponse walletresponse);

    protected abstract WalletAdapter getAdapter(List list);

    protected List getNewEntriesFromPref()
    {
        ArrayList arraylist = null;
        if (getActivity() != null)
        {
            arraylist = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreferenceId();
        }
        return arraylist;
    }

    protected abstract int getPosition();

    protected View getProgressbarContainer()
    {
        return mParent.findViewById(0x7f0d0118);
    }

    void loadPageIndicators(int i)
    {
        mParent.findViewById(0x7f0d0114).setVisibility(0);
        switch (i)
        {
        default:
            mParent.findViewById(0x7f0d0115).setVisibility(0);
            mParent.findViewById(0x7f0d0116).setVisibility(0);
            mParent.findViewById(0x7f0d0117).setVisibility(0);
            return;

        case 1: // '\001'
            mParent.findViewById(0x7f0d0115).setVisibility(0);
            mParent.findViewById(0x7f0d0116).setVisibility(8);
            mParent.findViewById(0x7f0d0117).setVisibility(8);
            return;

        case 2: // '\002'
            mParent.findViewById(0x7f0d0115).setVisibility(0);
            mParent.findViewById(0x7f0d0116).setVisibility(0);
            mParent.findViewById(0x7f0d0117).setVisibility(8);
            return;

        case 3: // '\003'
            mParent.findViewById(0x7f0d0115).setVisibility(0);
            break;
        }
        mParent.findViewById(0x7f0d0116).setVisibility(0);
        mParent.findViewById(0x7f0d0117).setVisibility(0);
    }

    public void onActionPerformed()
    {
        isFromCache = false;
        setupView();
    }

    public void onDestroy()
    {
        super.onDestroy();
        unregisterForWalletData();
    }

    protected abstract void registerForModification();

    protected void registerForWalletData()
    {
        ListenerManager.getInstance().registerListener(this, "allwallet");
    }

    public void setupView()
    {
        Object obj;
        obj = getWalletResponseFromCache();
        if (obj == null || !((WalletResponse) (obj)).isSuccess())
        {
            getActivity().invalidateOptionsMenu();
            ((ProgressBar)mParent.findViewById(0x7f0d0118)).setVisibility(4);
            return;
        }
        formatWalletData(((WalletResponse) (obj)));
        mEmptyWalletText = (RelativeLayout)mParent.findViewById(0x7f0d0113);
        if (obj == null || ((WalletResponse) (obj)).getWalletItems() == null || ((WalletResponse) (obj)).getWalletItems().size() <= 0) goto _L2; else goto _L1
_L1:
        mAdapter = getAdapter(((WalletResponse) (obj)).getWalletItems());
        mListView.setAdapter(mAdapter);
        mEmptyWalletText.setVisibility(4);
        mListView.setVisibility(0);
        mParent.findViewById(0x7f0d0114).setVisibility(0);
        loadPageIndicators(mAdapter.getCount());
        if (getPosition() == Constants.POSITION_OF_CASH_TAB_IN_WALLET)
        {
            float f = 0.0F;
            obj = ((WalletResponse) (obj)).getWalletItems().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                WalletItemResponse walletitemresponse = (WalletItemResponse)((Iterator) (obj)).next();
                if (walletitemresponse.getCouponState() == Constants.AVAILABLE.intValue())
                {
                    f += Float.valueOf(walletitemresponse.getValue()).floatValue();
                }
            } while (true);
            mValueToSet.setText((new StringBuilder()).append("$").append(DateUtils.formatPriceTxtforkcTotal(Float.valueOf(f))).toString());
            mHeaderTitle.setText(getResources().getString(0x7f08025f));
            mHeaderTitle.setCompoundDrawablesWithIntrinsicBounds(0x7f020105, 0, 0, 0);
        } else
        if (getPosition() == Constants.POSITION_OF_OFFERS_TAB_IN_WALLET)
        {
            int i = 0;
            obj = ((WalletResponse) (obj)).getWalletItems().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                if (((WalletItemResponse)((Iterator) (obj)).next()).getCouponState() == Constants.AVAILABLE.intValue())
                {
                    i++;
                }
            } while (true);
            mValueToSet.setText((new StringBuilder()).append("").append(i).toString());
            mHeaderTitle.setText("YOUR KOHL'S OFFERS");
            mHeaderTitle.setCompoundDrawablesWithIntrinsicBounds(0x7f0201a6, 0, 0, 0);
        } else
        if (getPosition() == Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET)
        {
            float f1 = 0.0F;
            obj = ((WalletResponse) (obj)).getWalletItems().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                WalletItemResponse walletitemresponse1 = (WalletItemResponse)((Iterator) (obj)).next();
                if (walletitemresponse1.getCouponState() == Constants.AVAILABLE.intValue())
                {
                    f1 += Float.valueOf(walletitemresponse1.getValue()).floatValue();
                }
            } while (true);
            mValueToSet.setText((new StringBuilder()).append("$").append(DateUtils.formatPriceTxtforkcTotal(Float.valueOf(f1))).toString());
            mHeaderTitle.setText(getResources().getString(0x7f080222));
            mHeaderTitle.setCompoundDrawablesWithIntrinsicBounds(0x7f0200b2, 0, 0, 0);
        }
        mParent.findViewById(0x7f0d010e).setVisibility(0);
        mAdapter.notifyDataSetChanged();
_L4:
        mListView.setEnabled(true);
        getActivity().invalidateOptionsMenu();
        ((ProgressBar)mParent.findViewById(0x7f0d0118)).setVisibility(4);
        isFromCache = false;
        return;
_L2:
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        obj.topMargin = getResources().getDimensionPixelSize(0x7f09001d);
        if (getPosition() != Constants.POSITION_OF_CASH_TAB_IN_WALLET)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = ((LayoutInflater)getActivity().getSystemService("layout_inflater")).inflate(0x7f030091, null);
        ((TextView)view.findViewById(0x7f0d037f)).setTypeface(WalletFontCache.getGothamBold(getActivity()));
        ((TextView)view.findViewById(0x7f0d0380)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        mValueToSet.setText("$0");
        mHeaderTitle.setText(getResources().getString(0x7f08025f));
        mHeaderTitle.setCompoundDrawablesWithIntrinsicBounds(0x7f020105, 0, 0, 0);
        mEmptyWalletText.addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
_L5:
        mParent.findViewById(0x7f0d0114).setVisibility(8);
        mListView.setVisibility(8);
        mEmptyWalletText.setVisibility(0);
        if (true) goto _L4; else goto _L3
_L3:
        if (getPosition() == Constants.POSITION_OF_OFFERS_TAB_IN_WALLET)
        {
            View view1 = ((LayoutInflater)getActivity().getSystemService("layout_inflater")).inflate(0x7f0300bc, null);
            ((TextView)view1.findViewById(0x7f0d04b3)).setTypeface(WalletFontCache.getGothamBold(getActivity()));
            ((TextView)view1.findViewById(0x7f0d04b4)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
            mValueToSet.setText("0");
            mHeaderTitle.setText("YOUR KOHL'S OFFERS");
            mHeaderTitle.setCompoundDrawablesWithIntrinsicBounds(0x7f0201a6, 0, 0, 0);
            mEmptyWalletText.addView(view1, ((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        if (getPosition() == Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET)
        {
            View view2 = ((LayoutInflater)getActivity().getSystemService("layout_inflater")).inflate(0x7f030083, null);
            ((TextView)view2.findViewById(0x7f0d0317)).setTypeface(WalletFontCache.getGothamBold(getActivity()));
            ((TextView)view2.findViewById(0x7f0d0318)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
            mValueToSet.setText("$0");
            mHeaderTitle.setText(getString(0x7f080222));
            mHeaderTitle.setCompoundDrawablesWithIntrinsicBounds(0x7f0200b2, 0, 0, 0);
            mEmptyWalletText.addView(view2, ((android.view.ViewGroup.LayoutParams) (obj)));
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected void sortWalletData(WalletResponse walletresponse)
    {
        Collections.sort(walletresponse.getWalletItems(), new Comparator() {

            final BaseKohlsCashOffersFragment this$0;

            public int compare(WalletItemResponse walletitemresponse, WalletItemResponse walletitemresponse1)
            {
                if (walletitemresponse.getEffectiveEndDate().compareTo(walletitemresponse1.getEffectiveEndDate()) != 0)
                {
                    return walletitemresponse.getEffectiveEndDate().compareTo(walletitemresponse1.getEffectiveEndDate());
                }
                return Double.valueOf(walletitemresponse.getValue()).doubleValue() < Double.valueOf(walletitemresponse1.getValue()).doubleValue() ? 1 : -1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((WalletItemResponse)obj, (WalletItemResponse)obj1);
            }

            
            {
                this$0 = BaseKohlsCashOffersFragment.this;
                super();
            }
        });
    }

    protected void unregisterForWalletData()
    {
        ListenerManager.getInstance().unRegisterListener("allwallet", this);
    }

}
