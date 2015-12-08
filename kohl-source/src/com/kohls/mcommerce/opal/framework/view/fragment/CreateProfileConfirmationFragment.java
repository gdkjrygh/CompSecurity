// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.iface.IListRegistryController;
import com.kohls.mcommerce.opal.framework.view.activity.AccountActivity;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.asynctask.RegisterEventAsyncTask;
import com.kohls.mcommerce.opal.wallet.util.Constants;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            BaseFragment

public class CreateProfileConfirmationFragment extends BaseFragment
{

    public static final String ACCOUNT_OPTION = "option";
    public static final int VIEW_YOUR_ACCOUNT = 1;
    private Button mViewYourAccountButton;

    public CreateProfileConfirmationFragment()
    {
    }

    private void appentViewYourAccountText(TextView textview)
    {
        Object obj = getActivity().getResources();
        String s = ((Resources) (obj)).getString(0x7f08053a);
        obj = UtilityMethods.getColorSpanable(s, ((Resources) (obj)).getColor(0x7f0c0040));
    /* block-local class not found */
    class MyClickableSpan {}

        ((Spannable) (obj)).setSpan(new MyClickableSpan(s), 0, s.length(), 33);
        textview.append(((CharSequence) (obj)));
        textview.setMovementMethod(LinkMovementMethod.getInstance());
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
        ((AccountActivity)getActivity()).setAccountScreenVisibility(false);
        ((AccountActivity)getActivity()).seAccountConfirmationScreenVisible(true);
        bundle = (TextView)getFragmentView().findViewById(0x7f0d021d);
        if (!getArguments().getBoolean("enrolled"))
        {
            bundle.setVisibility(8);
            getFragmentView().findViewById(0x7f0d021c).setVisibility(8);
        }
        TextView textview = (TextView)getFragmentView().findViewById(0x7f0d021f);
        TextView textview1 = (TextView)getFragmentView().findViewById(0x7f0d0220);
        appentViewYourAccountText(textview1);
        bundle.setOnClickListener(this);
        textview.setOnClickListener(this);
        textview1.setOnClickListener(this);
        if (KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getSpecificOfferListOn().equalsIgnoreCase("true"))
        {
            ControllerFactory.getListandRegistryController(null).getBlackFridayList();
        }
        bundle = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getFirstInstallValue();
        if (TextUtils.isEmpty(bundle) || bundle.equalsIgnoreCase("YES"))
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setFirstInstallValue("YES");
            if (getArguments().getBoolean("enrolled"))
            {
                (new RegisterEventAsyncTask(getActivity())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                    "Download_Signin_NativeApp"
                });
            }
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setFirstInstallValue("NO");
        }
    }

    protected int intializaLayoutId()
    {
        Constants.NEW_ACCOUNT = true;
        return 0x7f03005b;
    }

    protected void loadContent()
    {
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131558942: 
        default:
            return;

        case 2131558941: 
            view = new Intent(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
            if (getArguments().getBoolean("enrolled"))
            {
                view.putExtra("open_screen_key", "open_my_loyalty");
            } else
            {
                view.putExtra("open_screen_key", "open_my_enrollment");
            }
            startActivity(view);
            return;

        case 2131558943: 
            view = new Intent(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
            view.putExtra("open_screen_key", "open_my_wallet");
            startActivity(view);
            return;

        case 2131558944: 
            break;
        }
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            view = new Intent();
            view.putExtra("ATTACH_MANAGE_ACCOUNT_FRAGMENT", "ATTACH_MANAGE_ACCOUNT_FRAGMENT");
            getActivity().setResult(0, view);
            getActivity().finish();
            return;
        } else
        {
            UtilityMethods.openAccountActivity(getActivity(), true, true);
            return;
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
