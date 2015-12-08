// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingMenu;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenController;
import com.kohls.mcommerce.opal.framework.controller.iface.IRefreshTokenListener;
import com.kohls.mcommerce.opal.framework.listener.HamburgerCloseListener;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithSlider;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wallet.activity.WalletActivity;
import com.kohls.mcommerce.opal.wallet.asynctask.GetAllWalletDataTask;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.manager.UpdateViewListener;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletItemResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.BarcodeCreator;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.WalletCache;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            RewardFragment, KohlsCashFragment, OffersFragment, GiftCardFragment, 
//            ZxingScannerActivity, ManualScanActivity, WalletUsageInfoActivity

public class MainActivity extends BaseFragment
    implements android.view.View.OnClickListener, ActionListener, IRefreshTokenListener, UpdateViewListener, HamburgerCloseListener
{

    public static int FINISH_WALLET = 0;
    private static final int GIFTCARD = 4;
    private static final int KOHLS_CASH = 2;
    private static final int LOYALTY = 1;
    private static final int OFFERS = 3;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private GiftCardFragment giftcard;
    private KohlsCashFragment kohlscash;
    private RewardFragment loyalty;
    ValueAnimator mAnimator_giftcard;
    ValueAnimator mAnimator_kohlscash;
    ValueAnimator mAnimator_loyalty;
    ValueAnimator mAnimator_offers;
    private boolean mHamburgerOpened;
    private SwipeRefreshLayout mRefreshLayout;
    private View mgiftcard_header;
    private View mkohls_cash_header;
    private TextView mkohls_cash_text;
    private TextView mkohls_offer_text;
    private ImageView mloyalty_header;
    private View moffers_header;
    private TextView mwallet_info;
    private OffersFragment offers;
    protected long timeZoneOfferOffset;
    protected int timeZonecashOffset;
    TimeZone tz1;
    TimeZone tz2;

    public MainActivity()
    {
        loyalty = null;
        kohlscash = null;
        offers = null;
        giftcard = null;
        timeZonecashOffset = TimeZone.getDefault().getOffset(Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis());
        tz1 = TimeZone.getDefault();
        tz2 = TimeZone.getTimeZone("US/Central");
        timeZoneOfferOffset = ((tz2.getRawOffset() - tz1.getRawOffset()) + tz2.getDSTSavings()) - tz1.getDSTSavings();
    }

    private void collapse(int i)
    {
        ValueAnimator valueanimator3;
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            ValueAnimator valueanimator = slideAnimator(getFragmentView().findViewById(0x7f0d00a8).getHeight(), 0, i);
            valueanimator.addListener(new android.animation.Animator.AnimatorListener() {

                final MainActivity this$0;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    getFragmentView().findViewById(0x7f0d00a8).setVisibility(8);
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            valueanimator.start();
            return;

        case 2: // '\002'
            ValueAnimator valueanimator1 = slideAnimator(getFragmentView().findViewById(0x7f0d00ab).getHeight(), 0, i);
            valueanimator1.addListener(new android.animation.Animator.AnimatorListener() {

                final MainActivity this$0;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    getFragmentView().findViewById(0x7f0d00ab).setVisibility(8);
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            valueanimator1.start();
            return;

        case 3: // '\003'
            ValueAnimator valueanimator2 = slideAnimator(getFragmentView().findViewById(0x7f0d00ad).getHeight(), 0, i);
            valueanimator2.addListener(new android.animation.Animator.AnimatorListener() {

                final MainActivity this$0;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    getFragmentView().findViewById(0x7f0d00ad).setVisibility(8);
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            valueanimator2.start();
            return;

        case 4: // '\004'
            valueanimator3 = slideAnimator(getFragmentView().findViewById(0x7f0d00af).getHeight(), 0, i);
            break;
        }
        valueanimator3.addListener(new android.animation.Animator.AnimatorListener() {

            final MainActivity this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                getFragmentView().findViewById(0x7f0d00af).setVisibility(8);
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        valueanimator3.start();
    }

    private void expand(int i)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            getFragmentView().findViewById(0x7f0d00a8).setVisibility(0);
            mAnimator_loyalty.start();
            return;

        case 2: // '\002'
            getFragmentView().findViewById(0x7f0d00ab).setVisibility(0);
            mAnimator_kohlscash.start();
            return;

        case 3: // '\003'
            getFragmentView().findViewById(0x7f0d00ad).setVisibility(0);
            mAnimator_offers.start();
            return;

        case 4: // '\004'
            getFragmentView().findViewById(0x7f0d00af).setVisibility(0);
            break;
        }
        mAnimator_giftcard.start();
    }

    private WalletResponse getWalletResponseFromCache()
    {
        return WalletCache.get(getActivity().getApplicationContext(), "rpwallet");
    }

    private void initResources()
    {
        mRefreshLayout = (SwipeRefreshLayout)getFragmentView().findViewById(0x7f0d00a3);
        mloyalty_header = (ImageView)getFragmentView().findViewById(0x7f0d00a7);
        mkohls_cash_header = getFragmentView().findViewById(0x7f0d00aa);
        moffers_header = getFragmentView().findViewById(0x7f0d00ac);
        mgiftcard_header = getFragmentView().findViewById(0x7f0d00ae);
        mwallet_info = (TextView)getFragmentView().findViewById(0x7f0d00a4);
        mkohls_cash_text = (TextView)mkohls_cash_header.findViewById(0x7f0d010f);
        Object obj = (TextView)mgiftcard_header.findViewById(0x7f0d010f);
        mloyalty_header.setOnClickListener(this);
        mkohls_cash_header.setOnClickListener(this);
        moffers_header.setOnClickListener(this);
        mwallet_info.setOnClickListener(this);
        mgiftcard_header.setOnClickListener(this);
        getFragmentView().findViewById(0x7f0d00a8).setOnClickListener(this);
        getFragmentView().findViewById(0x7f0d00ab).setOnClickListener(this);
        getFragmentView().findViewById(0x7f0d00ad).setOnClickListener(this);
        getFragmentView().findViewById(0x7f0d00af).setOnClickListener(this);
        getFragmentView().findViewById(0x7f0d00a0).setOnClickListener(this);
        getFragmentView().findViewById(0x7f0d00a1).setOnClickListener(this);
        mkohls_cash_text.setText(getResources().getString(0x7f08025f));
        mkohls_cash_text.setCompoundDrawablesWithIntrinsicBounds(0x7f020105, 0, 0, 0);
        ((TextView) (obj)).setText(getResources().getString(0x7f080222));
        ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(0x7f0200b2, 0, 0, 0);
        ((TextView)getFragmentView().findViewById(0x7f0d00a0)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        ((TextView)getFragmentView().findViewById(0x7f0d00a1)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        obj = new SpannableString("USING YOUR WALLET");
        ((SpannableString) (obj)).setSpan(new UnderlineSpan(), 0, ((SpannableString) (obj)).length(), 0);
        mwallet_info.setText(((CharSequence) (obj)));
        mwallet_info.setTypeface(WalletFontCache.getGothamBold(getActivity()));
        getFragmentView().findViewById(0x7f0d00a0).setPadding(getResources().getDimensionPixelSize(0x7f0900d9), 0, 0, 0);
        getFragmentView().findViewById(0x7f0d00a1).setPadding(getResources().getDimensionPixelSize(0x7f0900d9), 0, getResources().getDimensionPixelSize(0x7f0900d9), 0);
        if (getActivity() != null)
        {
            mAnimator_loyalty = slideAnimator(0, getResources().getDimensionPixelSize(0x7f090130), 1);
            mAnimator_offers = slideAnimator(0, getResources().getDimensionPixelSize(0x7f090130), 3);
            mAnimator_kohlscash = slideAnimator(0, getResources().getDimensionPixelSize(0x7f090130), 2);
            mAnimator_giftcard = slideAnimator(0, getResources().getDimensionPixelSize(0x7f090130), 4);
        }
        mRefreshLayout.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {

            final MainActivity this$0;

            public void onRefresh()
            {
                mRefreshLayout.setRefreshing(true);
                loadWalletData();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        if (fragmentManager.findFragmentByTag("Loyalty") == null)
        {
            fragmentTransaction = fragmentManager.beginTransaction();
            loyalty = new RewardFragment();
            fragmentTransaction.add(0x7f0d00a8, loyalty, "Loyalty");
            mloyalty_header.setVisibility(8);
            getFragmentView().findViewById(0x7f0d00a8).setVisibility(0);
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    private void loadHeaderData()
    {
        Object obj = getWalletResponseFromCache();
        if (obj == null || !((WalletResponse) (obj)).isSuccess())
        {
            return;
        }
        float f4 = 0.0F;
        float f = 0.0F;
        float f5 = 0.0F;
        float f1 = 0.0F;
        boolean flag = false;
        int i = 0;
        int j = ((flag) ? 1 : 0);
        float f2 = f5;
        float f3 = f4;
        if (obj != null)
        {
            j = ((flag) ? 1 : 0);
            f2 = f5;
            f3 = f4;
            if (((WalletResponse) (obj)).getWalletItems() != null)
            {
                j = ((flag) ? 1 : 0);
                f2 = f5;
                f3 = f4;
                if (((WalletResponse) (obj)).getWalletItems().size() > 0)
                {
                    obj = ((WalletResponse) (obj)).getWalletItems().iterator();
                    do
                    {
                        j = i;
                        f2 = f1;
                        f3 = f;
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        WalletItemResponse walletitemresponse = (WalletItemResponse)((Iterator) (obj)).next();
                        if (walletitemresponse.getTypeCode().equals("offer"))
                        {
                            if (Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue() - Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue() < 0x5265c00L)
                            {
                                walletitemresponse.setShortTermOffer(true);
                            }
                            if ((walletitemresponse.isShortTermOffer() || Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue() >= System.currentTimeMillis() - timeZoneOfferOffset) && (!walletitemresponse.getTypeCode().equalsIgnoreCase("offer") || !walletitemresponse.isShortTermOffer() || Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue() >= System.currentTimeMillis()) && (!walletitemresponse.getTypeCode().equals("offer") || !walletitemresponse.isShortTermOffer() || Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue() <= System.currentTimeMillis()) && (!walletitemresponse.getTypeCode().equalsIgnoreCase("offer") || walletitemresponse.isShortTermOffer() || Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue() <= System.currentTimeMillis() - timeZoneOfferOffset))
                            {
                                i++;
                            }
                        } else
                        if (walletitemresponse.getTypeCode().equals("kohlscash") || walletitemresponse.getTypeCode().equals("loyalty"))
                        {
                            Object obj1 = TimeZone.getTimeZone("US/Central");
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar1 = Calendar.getInstance(((TimeZone) (obj1)));
                            calendar1.setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveStartDate()).longValue());
                            obj1 = Calendar.getInstance(((TimeZone) (obj1)));
                            ((Calendar) (obj1)).setTimeInMillis(Long.valueOf(walletitemresponse.getEffectiveEndDate()).longValue());
                            ((Calendar) (obj1)).set(((Calendar) (obj1)).get(1), ((Calendar) (obj1)).get(2), ((Calendar) (obj1)).get(5), 23, 59);
                            if (!((Calendar) (obj1)).getTime().before(calendar.getTime()) && !calendar1.getTime().after(calendar.getTime()) && Double.valueOf(walletitemresponse.getValue()).doubleValue() > 0.0D)
                            {
                                f += Float.valueOf(walletitemresponse.getValue()).floatValue();
                            }
                        } else
                        if ((walletitemresponse.getTypeCode().equalsIgnoreCase("giftcard") || walletitemresponse.getTypeCode().equalsIgnoreCase("kmrc")) && Float.valueOf(walletitemresponse.getValue()).floatValue() > 0.0F)
                        {
                            walletitemresponse.setCouponState(Constants.AVAILABLE.intValue());
                            f1 += Float.valueOf(walletitemresponse.getValue()).floatValue();
                        }
                    } while (true);
                }
            }
        }
        if (f3 > 0.0F)
        {
            ((TextView)mkohls_cash_header.findViewById(0x7f0d0110)).setText((new StringBuilder()).append("$").append(DateUtils.formatPriceTxtforkcTotal(Float.valueOf(f3))).toString());
        } else
        {
            ((TextView)mkohls_cash_header.findViewById(0x7f0d0110)).setText("$0");
        }
        ((TextView)mkohls_cash_header.findViewById(0x7f0d010f)).setText(getResources().getString(0x7f08025f));
        ((TextView)moffers_header.findViewById(0x7f0d0110)).setText((new StringBuilder()).append("").append(j).toString());
        ((TextView)moffers_header.findViewById(0x7f0d010f)).setText("YOUR KOHL'S OFFERS");
        if (f2 > 0.0F)
        {
            ((TextView)mgiftcard_header.findViewById(0x7f0d0110)).setText((new StringBuilder()).append("$").append(DateUtils.formatPriceTxtforkcTotal(Float.valueOf(f2))).toString());
        } else
        {
            ((TextView)mgiftcard_header.findViewById(0x7f0d0110)).setText("$0");
        }
        ((TextView)mgiftcard_header.findViewById(0x7f0d010f)).setText(getResources().getString(0x7f080222));
    }

    private void loadWalletData()
    {
        (new GetAllWalletDataTask(getActivity(), true)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void setTabValues()
    {
        Constants.POSITION_OF_REWARD_TAB_IN_WALLET = 0;
        Constants.POSITION_OF_CASH_TAB_IN_WALLET = 1;
        Constants.POSITION_OF_OFFERS_TAB_IN_WALLET = 2;
        Constants.POSITION_OF_GIFTCARD_TAB_IN_WALLET = 3;
    }

    private void setupPageView()
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            fragmentManager = getFragmentManager();
        } else
        {
            fragmentManager = getChildFragmentManager();
        }
        fragmentTransaction = fragmentManager.beginTransaction();
        setTabValues();
        initResources();
        loadHeaderData();
        ((HomeActivity)getActivity()).getSlidingMenu().addIgnoredView(getFragmentView().findViewById(0x7f0d00a5));
        Appconfig.lastVisited = new HashMap();
    }

    private ValueAnimator slideAnimator(int i, int j, final int row)
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            i, j
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final MainActivity this$0;
            final int val$row;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                int k = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                switch (row)
                {
                default:
                    return;

                case 1: // '\001'
                    valueanimator1 = getFragmentView().findViewById(0x7f0d00a8).getLayoutParams();
                    valueanimator1.height = k;
                    getFragmentView().findViewById(0x7f0d00a8).setLayoutParams(valueanimator1);
                    return;

                case 2: // '\002'
                    valueanimator1 = getFragmentView().findViewById(0x7f0d00ab).getLayoutParams();
                    valueanimator1.height = k;
                    getFragmentView().findViewById(0x7f0d00ab).setLayoutParams(valueanimator1);
                    return;

                case 3: // '\003'
                    valueanimator1 = getFragmentView().findViewById(0x7f0d00ad).getLayoutParams();
                    valueanimator1.height = k;
                    getFragmentView().findViewById(0x7f0d00ad).setLayoutParams(valueanimator1);
                    return;

                case 4: // '\004'
                    valueanimator1 = getFragmentView().findViewById(0x7f0d00af).getLayoutParams();
                    break;
                }
                valueanimator1.height = k;
                getFragmentView().findViewById(0x7f0d00af).setLayoutParams(valueanimator1);
            }

            
            {
                this$0 = MainActivity.this;
                row = i;
                super();
            }
        });
        return valueanimator;
    }

    protected void initializeAttributes()
    {
        ListenerManager.getInstance().registerListener(this, "allwallet");
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
    }

    protected int intializaLayoutId()
    {
        return 0x7f030015;
    }

    protected boolean isUserEnrolledToLoyalty()
    {
        return !TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref());
    }

    protected void loadContent()
    {
        ControllerFactory.getRefreshTokenController().checkAndRefreshToken(this);
    }

    public void onActionPerformed()
    {
        setupPageView();
        mRefreshLayout.setRefreshing(false);
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131558560 2131558574: default 80
    //                   2131558560 1050
    //                   2131558561 1004
    //                   2131558562 80
    //                   2131558563 80
    //                   2131558564 1080
    //                   2131558565 80
    //                   2131558566 80
    //                   2131558567 81
    //                   2131558568 80
    //                   2131558569 80
    //                   2131558570 314
    //                   2131558571 80
    //                   2131558572 540
    //                   2131558573 80
    //                   2131558574 778;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L1 _L1 _L5 _L1 _L1 _L6 _L1 _L7 _L1 _L8
_L3:
        break MISSING_BLOCK_LABEL_1004;
_L2:
        break MISSING_BLOCK_LABEL_1050;
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_1080;
_L9:
        return;
_L5:
        if (getFragmentView().findViewById(0x7f0d00a8).getVisibility() == 8)
        {
            mloyalty_header.setVisibility(8);
            getFragmentView().findViewById(0x7f0d00a8).setOnClickListener(null);
            expand(1);
        } else
        {
            collapse(1);
            getFragmentView().findViewById(0x7f0d00a8).setOnClickListener(this);
            mloyalty_header.setVisibility(0);
        }
        fragmentTransaction = fragmentManager.beginTransaction();
        if (offers != null)
        {
            collapse(3);
            moffers_header.setVisibility(0);
        }
        if (kohlscash != null)
        {
            collapse(2);
            mkohls_cash_header.setVisibility(0);
        }
        if (giftcard != null)
        {
            collapse(4);
            mgiftcard_header.setVisibility(0);
        }
        if (fragmentManager.findFragmentByTag("Loyalty") != null && android.os.Build.VERSION.SDK_INT > 16)
        {
            fragmentTransaction.show(fragmentManager.findFragmentByTag("Loyalty"));
        } else
        {
            loyalty = new RewardFragment();
            fragmentTransaction.add(0x7f0d00a8, loyalty, "Loyalty");
        }
        fragmentTransaction.commitAllowingStateLoss();
        if (isUserEnrolledToLoyalty())
        {
            AnalyticsHelper.sendAnalyticsWalletYesTo();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (getFragmentView().findViewById(0x7f0d00ab).getVisibility() == 8)
        {
            mkohls_cash_header.setVisibility(8);
            expand(2);
            getFragmentView().findViewById(0x7f0d00ab).setOnClickListener(null);
        } else
        {
            collapse(2);
            mkohls_cash_header.setVisibility(0);
            getFragmentView().findViewById(0x7f0d00ab).setOnClickListener(this);
        }
        fragmentTransaction = fragmentManager.beginTransaction();
        if (offers != null)
        {
            collapse(3);
            moffers_header.setVisibility(0);
        }
        if (loyalty != null)
        {
            collapse(1);
            mloyalty_header.setVisibility(0);
        }
        if (giftcard != null)
        {
            collapse(4);
            mgiftcard_header.setVisibility(0);
        }
        if (fragmentManager.findFragmentByTag("kohlscash") != null && android.os.Build.VERSION.SDK_INT > 16)
        {
            fragmentTransaction.show(fragmentManager.findFragmentByTag("kohlscash"));
        } else
        {
            kohlscash = new KohlsCashFragment();
            fragmentTransaction.add(0x7f0d00ab, kohlscash, "kohlscash");
        }
        fragmentTransaction.commit();
        AnalyticsHelper.sendAnalyticsWalletKCAndRewards();
        return;
_L7:
        if (moffers_header.getVisibility() != 8)
        {
            if (getFragmentView().findViewById(0x7f0d00ad).getVisibility() == 8)
            {
                moffers_header.setVisibility(8);
                expand(3);
                getFragmentView().findViewById(0x7f0d00ad).setOnClickListener(null);
            } else
            {
                collapse(3);
                moffers_header.setVisibility(0);
                getFragmentView().findViewById(0x7f0d00ad).setOnClickListener(this);
            }
            fragmentTransaction = fragmentManager.beginTransaction();
            if (loyalty != null)
            {
                collapse(1);
                mloyalty_header.setVisibility(0);
            }
            if (kohlscash != null)
            {
                collapse(2);
                mkohls_cash_header.setVisibility(0);
            }
            if (giftcard != null)
            {
                collapse(4);
                mgiftcard_header.setVisibility(0);
            }
            if (fragmentManager.findFragmentByTag("Offers") != null && android.os.Build.VERSION.SDK_INT > 16)
            {
                fragmentTransaction.show(fragmentManager.findFragmentByTag("Offers"));
            } else
            {
                offers = new OffersFragment();
                fragmentTransaction.add(0x7f0d00ad, offers, "Offers");
            }
            fragmentTransaction.commitAllowingStateLoss();
            AnalyticsHelper.sendAnalyticsWalletKohlsOffer();
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
        if (getFragmentView().findViewById(0x7f0d00af).getVisibility() == 8)
        {
            mgiftcard_header.setVisibility(8);
            expand(4);
            getFragmentView().findViewById(0x7f0d00af).setOnClickListener(null);
        } else
        {
            collapse(4);
            mgiftcard_header.setVisibility(0);
            getFragmentView().findViewById(0x7f0d00af).setOnClickListener(this);
        }
        fragmentTransaction = fragmentManager.beginTransaction();
        if (loyalty != null)
        {
            collapse(1);
            mloyalty_header.setVisibility(0);
        }
        if (kohlscash != null)
        {
            collapse(2);
            mkohls_cash_header.setVisibility(0);
        }
        if (offers != null)
        {
            collapse(3);
            moffers_header.setVisibility(0);
        }
        if (fragmentManager.findFragmentByTag("giftcard") != null && android.os.Build.VERSION.SDK_INT > 16)
        {
            fragmentTransaction.show(fragmentManager.findFragmentByTag("giftcard"));
        } else
        {
            giftcard = new GiftCardFragment();
            fragmentTransaction.add(0x7f0d00af, giftcard, "giftcard");
        }
        fragmentTransaction.commitAllowingStateLoss();
        AnalyticsHelper.sendAnalyticsWalletGiftCard();
        return;
        view = new Bundle();
        view.putBoolean("isMultiScan", false);
        Intent intent = new Intent(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/ZxingScannerActivity);
        intent.putExtras(view);
        startActivityForResult(intent, FINISH_WALLET);
        return;
        view = new Intent(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/ManualScanActivity);
        view.putExtra("fromHome", true);
        startActivity(view);
        return;
        view = new Intent(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/WalletUsageInfoActivity);
        if (TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getwalletHelpURL()))
        {
            view.putExtra("help_bundle", Appconfig.WALLET_HELP_PAGE_FAIL_SAFE);
        } else
        {
            view.putExtra("help_bundle", KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getwalletHelpURL());
        }
        startActivity(view);
        AnalyticsHelper.sendAnalyticsOnUsingWallet();
        return;
    }

    public void onDestroy()
    {
        ListenerManager.getInstance().unRegisterListener("allwallet", this);
        ListenerManager.getInstance().unRegisterListener("onlyreward", this);
        ListenerManager.getInstance().unRegisterListener("cashoffersdata", this);
        super.onDestroy();
    }

    public void onHamburgerMenuClose()
    {
        if (mHamburgerOpened)
        {
            AnalyticsHelper.sendAnalyticsOnWalletLandingPage();
            mHamburgerOpened = false;
        }
    }

    public void onHamburgerMenuOpened()
    {
        mHamburgerOpened = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131560185 2131560186: default 28
    //                   2131560185 34
    //                   2131560186 206;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        if (TextUtils.isEmpty(Appconfig.WALLET_ID))
        {
            Toast.makeText(getActivity(), "Unexpected Error. Please retry", 0).show();
        } else
        {
            AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
            Object obj = ((LayoutInflater)getActivity().getSystemService("layout_inflater")).inflate(0x7f0300db, null);
            (new AsyncTask() {

                final MainActivity this$0;
                final ImageView val$img;
                final View val$parent;

                protected volatile Object doInBackground(Object aobj[])
                {
                    return doInBackground((Void[])aobj);
                }

                protected transient WeakReference doInBackground(Void avoid[])
                {
                    return (new BarcodeCreator()).renderQRcode(Appconfig.WALLET_ID, getResources().getDisplayMetrics().widthPixels - 100, getResources().getDisplayMetrics().heightPixels / 2, 0xff000000);
                }

                protected volatile void onPostExecute(Object obj1)
                {
                    onPostExecute((WeakReference)obj1);
                }

                protected void onPostExecute(WeakReference weakreference)
                {
                    if (weakreference != null)
                    {
                        img.setImageDrawable(new BitmapDrawable(getResources(), (Bitmap)weakreference.get()));
                    }
                    parent.findViewById(0x7f0d0588).setVisibility(8);
                    super.onPostExecute(weakreference);
                }

            
            {
                this$0 = MainActivity.this;
                img = imageview;
                parent = view;
                super();
            }
            }).execute(new Void[0]);
            alertdialog.setCanceledOnTouchOutside(true);
            alertdialog.setCancelable(true);
            alertdialog.setView(((View) (obj)));
            obj = new android.view.WindowManager.LayoutParams();
            ((android.view.WindowManager.LayoutParams) (obj)).copyFrom(alertdialog.getWindow().getAttributes());
            obj.width = getResources().getDisplayMetrics().widthPixels - 100;
            obj.height = getResources().getDisplayMetrics().heightPixels / 2;
            alertdialog.show();
            alertdialog.getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        Intent intent = new Intent(getActivity(), com/kohls/mcommerce/opal/wallet/activity/WalletActivity);
        intent.putExtra("signin", false);
        startActivity(intent);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onRefreshTokenFailure()
    {
        if (getActivity() != null)
        {
            UtilityMethods.openAccountActivity(getActivity(), true, false);
        }
    }

    public void onRefreshTokenSuccess()
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && !TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletHash()))
        {
            KohlsPhoneApplication.getInstance().setApplicationForeground();
            setupPageView();
        } else
        if (getActivity() != null)
        {
            UtilityMethods.openAccountActivity(getActivity(), true, false);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (!TextUtils.isEmpty("signinshown") && "signinshown".equalsIgnoreCase("YES"))
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setSigninStatus("NO");
        }
    }

    public void onStart()
    {
        super.onStart();
        AnalyticsHelper.sendAnalyticsOnWalletLandingPage();
        if (getActivity() instanceof BaseActivityWithSlider)
        {
            ((BaseActivityWithSlider)getActivity()).setHamburgerCloseListener(this);
        }
    }

    public void onStop()
    {
        super.onStop();
        if (getActivity() instanceof BaseActivityWithSlider)
        {
            ((BaseActivityWithSlider)getActivity()).removeHamburgerCloseListener();
        }
    }

    public void updateSectionHeader(int i, String s)
    {
        if (i == 1)
        {
            mkohls_cash_text.setText(s);
        } else
        if (i == 2)
        {
            return;
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }

    static 
    {
        FINISH_WALLET = 100;
    }














}
