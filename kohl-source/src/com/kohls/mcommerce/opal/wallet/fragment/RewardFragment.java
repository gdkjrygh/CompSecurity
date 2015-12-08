// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.Customer;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.BarcodeCreator;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import com.kohls.mcommerce.opal.wallet.util.RewardCache;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseWalletFragment, RewardNotEnrolledFragment, LinkActivity, DisplayActivityList

public class RewardFragment extends BaseWalletFragment
    implements ActionListener, android.view.View.OnClickListener
{

    private Animation animation1;
    private Animation animation2;
    ImageView barcodeImgView;
    LinearLayout infoLayout_back;
    LinearLayout infoLayout_front;
    TextView loyaltyIdTitle;
    TextView loyaltyIdTxtView;
    ValueAnimator mAnimator;
    private boolean mLinkClicked;
    private View mParent;
    ImageView myRewardInfoBtn_back;
    ImageView myRewardInfoBtn_front;
    TextView userNameTxtViewBack;
    TextView userNameTxtViewFront;

    public RewardFragment()
    {
        mLinkClicked = false;
    }

    private void loadRewardData(LoyaltyProfileResponse loyaltyprofileresponse)
    {
        infoLayout_front.setVisibility(0);
        String s = loyaltyprofileresponse.getProfile().getLoyaltyId();
        if (!TextUtils.isEmpty(s))
        {
            Object obj;
            try
            {
                obj = (new StringBuilder()).append(s.substring(0, 4)).append("  ").append(s.substring(4, 8)).append("  ").append(s.substring(8)).toString();
            }
            catch (Exception exception)
            {
                exception = s;
            }
            loyaltyIdTxtView.setText((new StringBuilder()).append(getResources().getString(0x7f080499)).append(" ").append(((String) (obj))).toString());
            barcodeImgView.setImageBitmap((Bitmap)(new BarcodeCreator()).renderBarcode(s, 500, 90, 0xff000000).get());
            barcodeImgView.setVisibility(0);
            if (Integer.parseInt(loyaltyprofileresponse.getProfile().getPointBalance()) > 0)
            {
                loyaltyIdTitle.setText(Html.fromHtml((new StringBuilder()).append(getResources().getString(0x7f08049b)).append(" <b>").append(loyaltyprofileresponse.getProfile().getPointBalance()).append("</b>").toString()));
                loyaltyIdTitle.setTypeface(WalletFontCache.getGothamBook(getActivity()));
            } else
            {
                loyaltyIdTitle.setText("Your earned points can take up to 24 hours to appear");
                loyaltyIdTitle.setTypeface(WalletFontCache.getGothamBold(getActivity()));
            }
        }
        obj = loyaltyprofileresponse.getProfile().getCustomerName();
        if (obj != null && !TextUtils.isEmpty(((Customer) (obj)).getFirstName()))
        {
            userNameTxtViewFront.setText((new StringBuilder()).append(DateUtils.convertStringToTitleCase(loyaltyprofileresponse.getProfile().getCustomerName().getFirstName())).append(" ").append(DateUtils.convertStringToTitleCase(((Customer) (obj)).getLastName())).toString());
            userNameTxtViewFront.setVisibility(0);
            userNameTxtViewBack.setText((new StringBuilder()).append(DateUtils.convertStringToTitleCase(((Customer) (obj)).getFirstName())).append(" ").append(DateUtils.convertStringToTitleCase(((Customer) (obj)).getLastName())).toString());
            userNameTxtViewBack.setVisibility(0);
        }
        infoLayout_back.setVisibility(8);
        myRewardInfoBtn_front.setVisibility(0);
        if (Appconfig.LOYALTY_RESPONSE_FROM_CACHE)
        {
            myRewardInfoBtn_front.setEnabled(false);
            return;
        } else
        {
            myRewardInfoBtn_front.setEnabled(true);
            return;
        }
    }

    private void showNotEnrolledFragment()
    {
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        fragmenttransaction.replace(0x7f0d00f6, new RewardNotEnrolledFragment(), "Loyalty");
        mParent.setVisibility(8);
        fragmenttransaction.commitAllowingStateLoss();
    }

    protected View doOnCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mParent = layoutinflater.inflate(0x7f0300f7, viewgroup, false);
        infoLayout_front = (LinearLayout)mParent.findViewById(0x7f0d065f);
        infoLayout_back = (LinearLayout)mParent.findViewById(0x7f0d0659);
        loyaltyIdTxtView = (TextView)mParent.findViewById(0x7f0d0661);
        loyaltyIdTitle = (TextView)mParent.findViewById(0x7f0d0658);
        userNameTxtViewFront = (TextView)mParent.findViewById(0x7f0d0660);
        userNameTxtViewFront.setTypeface(WalletFontCache.getGothamBook(getActivity()), 1);
        userNameTxtViewBack = (TextView)mParent.findViewById(0x7f0d065a);
        barcodeImgView = (ImageView)mParent.findViewById(0x7f0d0662);
        myRewardInfoBtn_front = (ImageView)mParent.findViewById(0x7f0d0663);
        myRewardInfoBtn_back = (ImageView)mParent.findViewById(0x7f0d065e);
        ((TextView)mParent.findViewById(0x7f0d065d)).setMovementMethod(new ScrollingMovementMethod());
        ((TextView)mParent.findViewById(0x7f0d065b)).setPaintFlags(8);
        ((TextView)mParent.findViewById(0x7f0d065c)).setPaintFlags(8);
        animation1 = AnimationUtils.loadAnimation(getActivity(), 0x7f040004);
        animation2 = AnimationUtils.loadAnimation(getActivity(), 0x7f040000);
        loyaltyIdTxtView.setTypeface(WalletFontCache.getGothamBook(getActivity()));
        userNameTxtViewFront.setTypeface(WalletFontCache.getGothamBook(getActivity()), 1);
        userNameTxtViewBack.setTypeface(WalletFontCache.getGothamBook(getActivity()), 1);
        ((TextView)mParent.findViewById(0x7f0d065b)).setOnClickListener(this);
        ((TextView)mParent.findViewById(0x7f0d065c)).setOnClickListener(this);
        myRewardInfoBtn_front.setOnClickListener(this);
        myRewardInfoBtn_back.setOnClickListener(this);
        if (!isUserEnrolledToLoyalty())
        {
            showNotEnrolledFragment();
        } else
        {
            setupView();
        }
        ListenerManager.getInstance().registerListener(this, "allwallet");
        loadWalletData(true);
        return mParent;
    }

    protected View getProgressbarContainer()
    {
        return mParent.findViewById(0x7f0d0118);
    }

    public void onActionPerformed()
    {
        if (mLinkClicked)
        {
            if (TextUtils.isEmpty("tnc"))
            {
                return;
            } else
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.putExtra("linkurl", "tnc");
                intent.putExtra("pagetitle", getResources().getString(0x7f08051a));
                intent.setClass(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/LinkActivity);
                startActivity(intent);
                OmnitureMeasurement.getInstance().setRewardsTnCPageEvents();
                return;
            }
        }
        ((ProgressBar)mParent.findViewById(0x7f0d0118)).setVisibility(4);
        if (isUserEnrolledToLoyalty())
        {
            setupView();
            return;
        } else
        {
            showNotEnrolledFragment();
            return;
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131560029: 
        case 2131560031: 
        case 2131560032: 
        case 2131560033: 
        case 2131560034: 
        default:
            return;

        case 2131560027: 
            ((HomeActivity)getActivity()).attachLoyaltyFragment(null);
            return;

        case 2131560028: 
            view = new Intent(getActivity().getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/DisplayActivityList);
            view.putExtra("signedup", "NO");
            startActivity(view);
            return;

        case 2131560035: 
            infoLayout_front.setVisibility(8);
            infoLayout_front.startAnimation(animation1);
            infoLayout_back.setVisibility(0);
            infoLayout_back.startAnimation(animation2);
            return;

        case 2131560030: 
            infoLayout_back.setVisibility(8);
            infoLayout_back.startAnimation(animation1);
            infoLayout_front.setVisibility(0);
            infoLayout_front.startAnimation(animation2);
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        ListenerManager.getInstance().unRegisterListener("allwallet", this);
    }

    public void onStart()
    {
        super.onStart();
        ListenerManager.getInstance().registerListener(this, "activitylink");
    }

    public void onStop()
    {
        super.onStop();
        ListenerManager.getInstance().unRegisterListener("activitylink", this);
    }

    public void setupView()
    {
        LoyaltyProfileResponse loyaltyprofileresponse = RewardCache.get(getActivity().getApplicationContext());
        if (loyaltyprofileresponse == null || !loyaltyprofileresponse.isSuccess())
        {
            ((ProgressBar)mParent.findViewById(0x7f0d0118)).setVisibility(4);
            getActivity().invalidateOptionsMenu();
            return;
        }
        if (loyaltyprofileresponse.getProfile() != null)
        {
            loadRewardData(loyaltyprofileresponse);
        }
        ((ProgressBar)mParent.findViewById(0x7f0d0118)).setVisibility(4);
        getActivity().invalidateOptionsMenu();
    }
}
