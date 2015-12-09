// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.cdn;

import com.dominos.android.sdk.common.AmazonUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.models.ApplicationConfigVersion;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsUpsellData;
import com.dominos.android.sdk.core.models.ReplacedProducts;
import com.dominos.android.sdk.core.models.json.UpsellDataDeserializer;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQHolder;
import com.google.b.k;
import com.google.b.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.data.http.cdn:
//            ContentRestInterface

public class ContentRestClient
{

    private static final String DEFAULT_URL = "http://cache.dominos.com/";
    public static final String TAG = com/dominos/android/sdk/data/http/cdn/ContentRestClient.getSimpleName();
    ContentRestInterface mContentServiceInterface;

    public ContentRestClient()
    {
    }

    public ApplicationConfigVersion getApplicationConfigVersion(String s)
    {
        String s1;
        if (AmazonUtil.isAmazonDevice())
        {
            s1 = "amazon_config_version_%s.cfg";
        } else
        {
            s1 = "google_config_version_%s.cfg";
        }
        s = String.format(s1, new Object[] {
            s
        });
        try
        {
            s = mContentServiceInterface.getApplicationConfigVersion(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, "%s", new Object[] {
                s.getMessage()
            });
            return null;
        }
        return s;
    }

    public ApplicationConfiguration getApplicationConfiguration(String s)
    {
        if (AmazonUtil.isAmazonDevice())
        {
            s = String.format("amazon_%s.cfg", new Object[] {
                s
            });
        } else
        {
            s = String.format("google_%s.cfg", new Object[] {
                s
            });
        }
        try
        {
            s = mContentServiceInterface.getApplicationConfiguration(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, "%s", new Object[] {
                s.getMessage()
            });
            return null;
        }
        return s;
    }

    public List getLoyaltyFaqs(String s)
    {
        s = mContentServiceInterface.getLoyaltyFaqs(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        s = s.getFaqs();
        return s;
        s;
        LogUtil.e(TAG, "%s", new Object[] {
            s.getMessage()
        });
        return null;
    }

    public String getPrompts(String s)
    {
        try
        {
            s = mContentServiceInterface.getPrompts(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, "%s", new Object[] {
                s.getMessage()
            });
            return null;
        }
        return s;
    }

    public ReplacedProducts getReplacedProducts()
    {
        ReplacedProducts replacedproducts;
        try
        {
            mContentServiceInterface.setRootUrl("http://cache.dominos.com/");
            replacedproducts = mContentServiceInterface.getReplacedProducts();
        }
        catch (Exception exception)
        {
            LogUtil.e(TAG, "%s", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return replacedproducts;
    }

    public ArrayList getUpsellBarList(String s)
    {
        try
        {
            mContentServiceInterface.setRootUrl("http://cache.dominos.com/");
            Object obj = Arrays.asList(mContentServiceInterface.getUpsellBarData(s).categories);
            s = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.addAll(Arrays.asList(((com.dominos.android.sdk.core.upsell.UpsellBarProductData.UpsellBarCategory)((Iterator) (obj)).next()).products))) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public LabsUpsellData getUpsellConfiguration(String s)
    {
        try
        {
            s = mContentServiceInterface.getUpsellConfiguration(s);
            s = (LabsUpsellData)(new r()).a(com/dominos/android/sdk/core/models/LabsUpsellData, new UpsellDataDeserializer()).f().a(s, com/dominos/android/sdk/core/models/LabsUpsellData);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e(TAG, "%s", new Object[] {
                s.getMessage()
            });
            return null;
        }
        return s;
    }

    public void setRootUrl(String s)
    {
        mContentServiceInterface.setRootUrl(s);
    }

}
