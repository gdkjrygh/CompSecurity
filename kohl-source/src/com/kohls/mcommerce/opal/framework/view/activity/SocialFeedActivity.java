// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.webkit.WebView;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.SocialFeedFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class SocialFeedActivity extends BaseActivityWithoutSlider
{

    public SocialFeedActivity()
    {
    }

    protected int getLayoutId()
    {
        return 0x7f030059;
    }

    protected void initializeViews(Bundle bundle)
    {
        FragmentFactory.attachSocialFeedFragment(this, null);
    }

    public void onBackPressed()
    {
label0:
        {
            BaseFragment basefragment = FragmentHelper.getFragmentonTop(new WeakReference(this));
            WebView webview = ((SocialFeedFragment)basefragment).getWebView();
            if (basefragment != null && basefragment.getTag() == "tag-#KOHLS" && webview != null)
            {
                if (!webview.canGoBack())
                {
                    break label0;
                }
                webview.goBack();
            }
            return;
        }
        super.onBackPressed();
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarWithDetail(getResources().getString(0x7f0804e3));
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
