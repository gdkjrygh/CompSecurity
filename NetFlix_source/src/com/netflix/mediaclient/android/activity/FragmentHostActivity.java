// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.netflix.mediaclient.android.app.LoadingStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

public abstract class FragmentHostActivity extends NetflixActivity
{

    public static final String PRIMARY_FRAG_TAG = "primary";
    public static final String SECONDARY_FRAG_TAG = "secondary";
    static final float STANDARD_PRIMARY_FRAG_WEIGHT = 0.6F;
    static final float STANDARD_SECONDARY_FRAG_WEIGHT = 1F;
    private LinearLayout contentHost;
    private Fragment primaryFrag;
    private ViewGroup primaryFragContainer;
    private Fragment secondaryFrag;
    private ViewGroup secondaryFragContainer;

    public FragmentHostActivity()
    {
    }

    private void configureLinearLayout()
    {
        Object obj = contentHost;
        int i;
        if (DeviceUtils.getBasicScreenOrientation(this) == 2)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((LinearLayout) (obj)).setOrientation(i);
        obj = (android.widget.LinearLayout.LayoutParams)primaryFragContainer.getLayoutParams();
        obj.weight = 0.6F;
        primaryFragContainer.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        if (secondaryFrag != null)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)secondaryFragContainer.getLayoutParams();
            layoutparams.weight = 1.0F;
            secondaryFragContainer.setLayoutParams(layoutparams);
        }
    }

    protected abstract Fragment createPrimaryFrag();

    protected Fragment createSecondaryFrag()
    {
        return null;
    }

    protected ViewGroup getContentHost()
    {
        return contentHost;
    }

    protected int getContentLayoutId()
    {
        return 0x7f03002d;
    }

    public Fragment getPrimaryFrag()
    {
        return primaryFrag;
    }

    protected ViewGroup getPrimaryFragContainer()
    {
        return primaryFragContainer;
    }

    protected Fragment getSecondaryFrag()
    {
        return secondaryFrag;
    }

    protected ViewGroup getSecondaryFragContainer()
    {
        return secondaryFragContainer;
    }

    public boolean isLoadingData()
    {
        boolean flag1 = ((LoadingStatus)primaryFrag).isLoadingData();
        boolean flag = flag1;
        if (secondaryFrag != null)
        {
            flag = flag1 | ((LoadingStatus)secondaryFrag).isLoadingData();
        }
        return flag;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(getContentLayoutId());
        contentHost = (LinearLayout)findViewById(0x7f0700b6);
        primaryFragContainer = (ViewGroup)findViewById(0x7f0700b7);
        secondaryFragContainer = (ViewGroup)findViewById(0x7f0700b8);
        if (bundle == null)
        {
            primaryFrag = createPrimaryFrag();
            secondaryFrag = createSecondaryFrag();
            bundle = getFragmentManager().beginTransaction();
            bundle.add(0x7f0700b7, primaryFrag, "primary");
            if (secondaryFrag != null)
            {
                bundle.add(0x7f0700b8, secondaryFrag, "secondary");
            }
            bundle.commit();
        } else
        {
            primaryFrag = getFragmentManager().findFragmentByTag("primary");
            secondaryFrag = getFragmentManager().findFragmentByTag("secondary");
        }
        if (contentHost != null)
        {
            configureLinearLayout();
        }
        if (secondaryFragContainer != null)
        {
            bundle = secondaryFragContainer;
            byte byte0;
            if (secondaryFrag == null)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            bundle.setVisibility(byte0);
        }
    }

    public void setLoadingStatusCallback(com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingstatuscallback)
    {
        super.setLoadingStatusCallback(loadingstatuscallback);
        if (primaryFrag != null)
        {
            ((LoadingStatus)primaryFrag).setLoadingStatusCallback(loadingstatuscallback);
        }
        if (secondaryFrag != null)
        {
            ((LoadingStatus)secondaryFrag).setLoadingStatusCallback(loadingstatuscallback);
        }
    }

    protected void setPrimaryFrag(NetflixFrag netflixfrag)
    {
        primaryFrag = netflixfrag;
    }
}
