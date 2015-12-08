// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;

import com.jcp.model.JCPStorePickupSettings;

// Referenced classes of package com.jcp.settings.model:
//            AndroidAppSettings, BrowseSettings, CartSettings, ImageSearchSettings, 
//            RewardsSettings, SecuritySettings, TestingSettings, IPhoneAppSettings

public class JCPSettings
{

    private AndroidAppSettings androidApp;
    private BrowseSettings browse;
    private CartSettings cart;
    private IPhoneAppSettings iPhoneApp;
    private ImageSearchSettings imageSearch;
    private JCPStorePickupSettings inStorePickup;
    private RewardsSettings rewards;
    private SecuritySettings security;
    private TestingSettings testing;

    public JCPSettings()
    {
    }

    public AndroidAppSettings getAndroidApp()
    {
        if (androidApp == null)
        {
            androidApp = new AndroidAppSettings();
        }
        return androidApp;
    }

    public BrowseSettings getBrowse()
    {
        if (browse == null)
        {
            browse = new BrowseSettings();
        }
        return browse;
    }

    public CartSettings getCart()
    {
        if (cart == null)
        {
            cart = new CartSettings();
        }
        return cart;
    }

    public ImageSearchSettings getImageSearch()
    {
        if (imageSearch == null)
        {
            imageSearch = new ImageSearchSettings();
        }
        return imageSearch;
    }

    public JCPStorePickupSettings getInStorePickup()
    {
        if (inStorePickup == null)
        {
            inStorePickup = new JCPStorePickupSettings();
        }
        return inStorePickup;
    }

    public RewardsSettings getRewards()
    {
        if (rewards == null)
        {
            rewards = new RewardsSettings();
        }
        return rewards;
    }

    public SecuritySettings getSecurity()
    {
        if (security == null)
        {
            security = new SecuritySettings();
        }
        return security;
    }

    public TestingSettings getTesting()
    {
        if (testing == null)
        {
            testing = new TestingSettings();
        }
        return testing;
    }

    public IPhoneAppSettings getiPhoneApp()
    {
        if (iPhoneApp == null)
        {
            iPhoneApp = new IPhoneAppSettings();
        }
        return iPhoneApp;
    }

    public void setAndroidApp(AndroidAppSettings androidappsettings)
    {
        androidApp = androidappsettings;
    }

    public void setBrowse(BrowseSettings browsesettings)
    {
        browse = browsesettings;
    }

    public void setCart(CartSettings cartsettings)
    {
        cart = cartsettings;
    }

    public void setImageSearch(ImageSearchSettings imagesearchsettings)
    {
        imageSearch = imagesearchsettings;
    }

    public void setInStorePickup(JCPStorePickupSettings jcpstorepickupsettings)
    {
        inStorePickup = jcpstorepickupsettings;
    }

    public void setRewards(RewardsSettings rewardssettings)
    {
        rewards = rewardssettings;
    }

    public void setSecurity(SecuritySettings securitysettings)
    {
        security = securitysettings;
    }

    public void setTesting(TestingSettings testingsettings)
    {
        testing = testingsettings;
    }

    public void setiPhoneApp(IPhoneAppSettings iphoneappsettings)
    {
        iPhoneApp = iphoneappsettings;
    }
}
