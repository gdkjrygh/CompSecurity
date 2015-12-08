// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cleanmaster.gaid.AdvertisingIdHelper;
import com.cmcm.adsdk.a;
import com.cmcm.adsdk.b.c.b;
import com.mopub.common.ClientMetadata;
import com.mopub.nativeads.MoPubNative;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            w, i, h

public class MopubNativeAdLoader extends w
{

    private static final String MUPUB_PKG_NAME = "com.mopub.ad";
    private static final String TAG = "MopubNativeAdLoader";
    private static SharedPreferences sSharedPreferences;
    private final int MOPUB_RES = 3003;
    private final String PREFS_NAME = "cmcmadsdk_config";
    private boolean isLoading;
    private com.cmcm.a.a.a mCurrentAd;
    private List mMopubAdPool;
    private String mMopubUniId;

    public MopubNativeAdLoader(Context context, String s, String s1)
    {
        super(context, s, "mp");
        isLoading = false;
        mMopubUniId = s1;
        sSharedPreferences = mContext.getSharedPreferences("cmcmadsdk_config", 0);
    }

    private boolean hasValidAd()
    {
        if (mMopubAdPool != null && !mMopubAdPool.isEmpty())
        {
            removeExpiredAds(mMopubAdPool);
            if (mMopubAdPool.size() > 0)
            {
                return true;
            }
        }
        return false;
    }

    private void loadMopubAd()
    {
        if (!a.d())
        {
            b.a("MopubNativeAdLoader", "sdk has stop work");
            return;
        }
        if (TextUtils.isEmpty(mMopubUniId))
        {
            b.a("MopubNativeAdLoader", "MopubUniId is empty");
            notifyFailed("10003");
            return;
        }
        if (isLoading)
        {
            b.a("MopubNativeAdLoader", "isLoading ,avoid repeat load");
            return;
        }
        if (mMopubAdPool == null)
        {
            mMopubAdPool = new ArrayList();
        }
        if (mContext == null)
        {
            b.a("MopubNativeAdLoader", "Context is null");
            notifyFailed("10003");
            return;
        }
        MoPubNative mopubnative = new MoPubNative(mContext, mMopubUniId, new i(this));
        String s = AdvertisingIdHelper.getInstance().getGAId();
        s.trim();
        boolean flag = AdvertisingIdHelper.getInstance().getTrackFlag();
        ClientMetadata clientmetadata = ClientMetadata.getInstance(mContext);
        if (!TextUtils.isEmpty(s))
        {
            clientmetadata.setAdvertisingInfo(s, flag);
        }
        b.a("MopubNativeAdLoader", "request,set is loading");
        isLoading = true;
        mopubnative.makeRequest();
    }

    private void notifyAdSelected()
    {
        if (mNativeAdListener != null && hasValidAd())
        {
            mCurrentAd = (com.cmcm.a.a.a)mMopubAdPool.get(0);
            mNativeAdListener.a(mCurrentAd);
        }
    }

    private void notifyFailed(String s)
    {
        if (mNativeAdListener != null)
        {
            mNativeAdListener.a(getAdName(), s);
        }
    }

    private void preloadMopubAd()
    {
        loadMopubAd();
    }

    public com.cmcm.a.a.a getAd()
    {
        com.cmcm.a.a.a a1 = null;
        com.cmcm.a.a.a a2 = null;
        b.a("MopubNativeAdLoader", "getAd");
        if (!a.d())
        {
            b.a("MopubNativeAdLoader", "sdk has stop work");
        } else
        {
            if (hasValidAd())
            {
                a1 = (com.cmcm.a.a.a)mMopubAdPool.remove(0);
                b.a("MopubNativeAdLoader", (new StringBuilder("adpool romove ad title:")).append(a1.d()).append(",adpool size :").append(mMopubAdPool.size()).toString());
                mCurrentAd = a1;
            }
            a2 = a1;
            if (mMopubAdPool != null)
            {
                a2 = a1;
                if (mMopubAdPool.isEmpty())
                {
                    b.a("MopubNativeAdLoader", "ad pool is Empty to preload Ad");
                    preloadMopubAd();
                    return a1;
                }
            }
        }
        return a2;
    }

    protected List getAdList(int j)
    {
        b.a("MopubNativeAdLoader", "getAdList");
        if (!a.d())
        {
            b.a("MopubNativeAdLoader", "sdk has stop work");
        } else
        if (hasValidAd())
        {
            ArrayList arraylist = new ArrayList();
            for (int k = 0; k < Math.min(j, mMopubAdPool.size()); k++)
            {
                arraylist.add((com.cmcm.a.a.a)mMopubAdPool.remove(0));
            }

            if (mMopubAdPool != null && mMopubAdPool.isEmpty())
            {
                b.a("MopubNativeAdLoader", "ad pool is Empty to preload Ad");
                preloadMopubAd();
            }
            return arraylist;
        }
        return null;
    }

    public void loadAd()
    {
        b.a("MopubNativeAdLoader", "loadAd mopub");
        if (hasValidAd())
        {
            b.a("MopubNativeAdLoader", "ad pool has mopub ad ");
            notifyAdSelected();
            return;
        } else
        {
            loadMopubAd();
            return;
        }
    }

    protected void removeAdFromPool(com.cmcm.a.a.a a1)
    {
        if (mMopubAdPool != null)
        {
            mMopubAdPool.remove(a1);
            b.a("MopubNativeAdLoader", (new StringBuilder("adpool remove ad title: ")).append(a1.d()).append(",adpool size:").append(mMopubAdPool.size()).toString());
        }
    }




/*
    static boolean access$102(MopubNativeAdLoader mopubnativeadloader, boolean flag)
    {
        mopubnativeadloader.isLoading = flag;
        return flag;
    }

*/



}
