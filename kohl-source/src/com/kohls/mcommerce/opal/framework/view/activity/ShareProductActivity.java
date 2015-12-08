// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.kohls.mcommerce.opal.framework.view.fragment.InstagramFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.PinterestFragment;
import com.kohls.mcommerce.opal.framework.view.fragment.TwitterFragment;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FacebookWebShareActivity

public class ShareProductActivity extends FragmentActivity
{

    private String FACEBOOK_TITLE;
    private String FOLLOW_INSTAGRAM_TAG;
    private String FOLLOW_PINTEREST_TAG;
    private String INSTAGRAM_TITLE;
    private String PINTEREST_TITLE;
    private String SHARE_FACEBOOK_TAG;
    private String SHARE_TWITTER_TAG;
    private String TWITTER_TITLE;
    private android.support.v4.app.FragmentManager mFragmentManager;
    com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues.ShareFeatureHostScreen mHostScreen;
    int mShareVia;
    private TextView mtitle;

    public ShareProductActivity()
    {
        SHARE_FACEBOOK_TAG = "facebook_fragment";
        SHARE_TWITTER_TAG = "twitter_fragment";
        FOLLOW_PINTEREST_TAG = "pinterest_fragment";
        FOLLOW_INSTAGRAM_TAG = "instagram_fragment";
        FACEBOOK_TITLE = "FACEBOOK";
        TWITTER_TITLE = "TWITTER";
        PINTEREST_TITLE = "PINTEREST";
        INSTAGRAM_TITLE = "INSTAGRAM";
    }

    private Bundle getBundleListShareData()
    {
        Bundle bundle = new Bundle();
        bundle.putString("description", getIntent().getExtras().getString("description"));
        bundle.putString("name", "");
        bundle.putString("picture", getIntent().getExtras().getString("picture"));
        bundle.putString("display", "");
        bundle.putString("link", getIntent().getExtras().getString("link"));
        bundle.putString("caption", "");
        return bundle;
    }

    private Bundle getBundlePDPShareData()
    {
        Bundle bundle = new Bundle();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("I love this item I found on Kohls.com. I just had to share it!");
        stringbuilder.append('\n');
        stringbuilder.append(getIntent().getExtras().getString("product_link"));
        bundle.putString("description", stringbuilder.toString());
        bundle.putString("name", getIntent().getExtras().getString("product_title"));
        bundle.putString("picture", getIntent().getExtras().getString("product_image_link"));
        bundle.putString("display", "");
        bundle.putString("link", "");
        bundle.putString("caption", "");
        return bundle;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f0300d8);
        mtitle = (TextView)findViewById(0x7f0d055c);
        mShareVia = getIntent().getExtras().getInt("share_via");
        mHostScreen = (com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues.ShareFeatureHostScreen)getIntent().getExtras().getSerializable("origin_of_fragment");
        if (mShareVia == 7001)
        {
            bundle = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/FacebookWebShareActivity);
            if (mHostScreen == com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues.ShareFeatureHostScreen.LIST_DETAILS_SCREEN)
            {
                bundle.putExtra("facebook", getBundleListShareData());
            } else
            {
                bundle.putExtra("facebook", getBundlePDPShareData());
            }
            startActivity(bundle);
            finish();
        } else
        {
            if (mShareVia == 7002)
            {
                bundle = getFragmentManager().beginTransaction();
                mtitle.setText(TWITTER_TITLE);
                bundle.replace(0x7f0d055d, new TwitterFragment(), SHARE_TWITTER_TAG).commit();
                return;
            }
            if (mShareVia == 7003)
            {
                bundle = getFragmentManager().beginTransaction();
                mtitle.setText(PINTEREST_TITLE);
                bundle.replace(0x7f0d055d, new PinterestFragment(), FOLLOW_PINTEREST_TAG).commit();
                return;
            }
            if (mShareVia == 7004)
            {
                bundle = getFragmentManager().beginTransaction();
                mtitle.setText(INSTAGRAM_TITLE);
                bundle.replace(0x7f0d055d, new InstagramFragment(), FOLLOW_INSTAGRAM_TAG).commit();
                return;
            }
        }
    }
}
