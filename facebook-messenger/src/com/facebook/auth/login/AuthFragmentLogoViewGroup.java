// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.facebook.i;

// Referenced classes of package com.facebook.auth.login:
//            m, f, g, l, 
//            e, c

public abstract class AuthFragmentLogoViewGroup extends m
{

    public static final String HELP_URL = "orca:authparam:help_url";
    public static final String LAYOUT_RESOURCE = "orca:authparam:layout_resource";
    private static final int LOGIN_GROUP_ANIM_DELAY_MS = 375;
    private static final int LOGIN_GROUP_ANIM_DURATION_MS = 125;
    public static final String LOGO1_RESOURCE = "orca:authparam:logo1";
    public static final String LOGO2_RESOURCE = "orca:authparam:logo2";
    private static final int SLIDE_ANIM_DELAY_MS = 200;
    private static final int SLIDE_ANIM_DURATION_MS = 500;
    public static final String SPLASH_LOGO1_RESOURCE = "orca:authparam:spash_logo1";
    public static final String SPLASH_LOGO2_RESOURCE = "orca:authparam:spash_logo2";
    public static final String SPLASH_TRANSITION = "orca:authparam:splash_transition";
    private final View mBottomGroup;
    private final ImageButton mHelpButton;
    private final e mLayoutDelegate;
    private final int mLogo1ResId = getResource("orca:authparam:logo1", 0);
    private final ImageView mLogo1View;
    private final int mLogo2ResId = getResource("orca:authparam:logo2", 0);
    private final ImageView mLogo2View;
    private final View mLogoGroup;
    private final View mMainGroup;
    private final View mRootGroup;
    private final View mSplashGroup;
    private int mSplashLogo1ResId;
    private final ImageView mSplashLogo1View;
    private int mSplashLogo2ResId;
    private final ImageView mSplashLogo2View;

    public AuthFragmentLogoViewGroup(Context context, c c1)
    {
        super(context, c1);
        setContentView(getResource("orca:authparam:layout_resource", getDefaultLayoutResource()));
        mSplashGroup = getView(i.login_splash);
        mSplashLogo1View = (ImageView)getView(i.login_logo1_splash);
        mSplashLogo2View = (ImageView)getView(i.login_logo2_splash);
        mRootGroup = getView(i.login_root);
        mMainGroup = getView(i.login_main_group);
        mBottomGroup = getView(i.login_bottom_group);
        mLogoGroup = getView(i.login_logo_container);
        mLogo1View = (ImageView)getView(i.login_logo1);
        mLogo2View = (ImageView)getView(i.login_logo2);
        mHelpButton = (ImageButton)getView(i.login_help_button);
        mSplashLogo1ResId = getResource("orca:authparam:spash_logo1", 0);
        mSplashLogo2ResId = getResource("orca:authparam:spash_logo2", 0);
        if (mSplashLogo1ResId == 0)
        {
            mSplashLogo1ResId = mLogo1ResId;
        }
        if (mSplashLogo2ResId == 0)
        {
            mSplashLogo2ResId = mLogo2ResId;
        }
        if (isLegacyLayout())
        {
            mLayoutDelegate = new f(this, null);
            return;
        } else
        {
            mLayoutDelegate = new g(this, null);
            return;
        }
    }

    public static Bundle createParameterBundle(int j, int k, int i1)
    {
        return createParameterBundle(j, k, i1, 0, 0, l.NONE, null);
    }

    public static Bundle createParameterBundle(int j, int k, int i1, int j1, int k1, l l1, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("orca:authparam:layout_resource", j);
        bundle.putInt("orca:authparam:logo1", k);
        bundle.putInt("orca:authparam:logo2", i1);
        bundle.putInt("orca:authparam:spash_logo1", j1);
        bundle.putInt("orca:authparam:spash_logo2", k1);
        bundle.putSerializable("orca:authparam:splash_transition", l1);
        bundle.putString("orca:authparam:help_url", s);
        return bundle;
    }

    private boolean isLegacyLayout()
    {
        View aview[] = new View[8];
        aview[0] = mSplashGroup;
        aview[1] = mSplashLogo1View;
        aview[2] = mSplashLogo2View;
        aview[3] = mRootGroup;
        aview[4] = mMainGroup;
        aview[5] = mBottomGroup;
        aview[6] = mLogoGroup;
        aview[7] = mHelpButton;
        int k = aview.length;
        for (int j = 0; j < k; j++)
        {
            if (aview[j] == null)
            {
                return true;
            }
        }

        return false;
    }

    protected abstract int getDefaultLayoutResource();

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mLayoutDelegate.a();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mLayoutDelegate.a(configuration);
    }

    protected void onHelpClick()
    {
        Uri uri = Uri.parse(getArguments().getString("orca:authparam:help_url"));
        control.b(new Intent("android.intent.action.VIEW", uri));
    }












}
