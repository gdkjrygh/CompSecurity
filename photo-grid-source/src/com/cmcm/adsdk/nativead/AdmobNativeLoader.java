// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import android.text.TextUtils;
import com.cmcm.adsdk.a;
import com.cmcm.adsdk.b.c.b;
import com.google.android.gms.ads.AdLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            w, c, b, a, 
//            h

public class AdmobNativeLoader extends w
{

    public static final String ADMOB_PKGNAME = "com.admob.native";
    private static final int ADMOB_RES = 3002;
    private static final String TAG = "AdmobNativeLoader";
    private AtomicBoolean isLoading;
    private String mAdmobUniId;
    private List mAdmobdPool;
    private com.cmcm.a.a.a mCurrentAd;

    public AdmobNativeLoader(Context context, String s, String s1)
    {
        super(context, s, "ab");
        isLoading = new AtomicBoolean(false);
        mAdmobUniId = s1;
        mAdmobdPool = new ArrayList();
    }

    private boolean hasAdmobSDK()
    {
        try
        {
            Class.forName("com.google.android.gms.ads.AdLoader");
            Class.forName("com.google.android.gms.ads.AdListener");
            Class.forName("com.google.android.gms.ads.AdRequest");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return true;
    }

    private boolean hasValidAd()
    {
        if (mAdmobdPool != null && !mAdmobdPool.isEmpty())
        {
            removeExpiredAds(mAdmobdPool);
            if (mAdmobdPool.size() > 0)
            {
                return true;
            }
        }
        return false;
    }

    private void loadAdmobAd()
    {
        if (!a.d())
        {
            b.a("AdmobNativeLoader", "sdk has stop work");
            return;
        }
        if (TextUtils.isEmpty(mAdmobUniId))
        {
            b.a("AdmobNativeLoader", "admob is empty");
            notifyFailed("10003");
            return;
        }
        if (mContext == null)
        {
            b.a("AdmobNativeLoader", "Context is null");
            notifyFailed("10003");
            return;
        }
        if (isLoading.get())
        {
            b.a("AdmobNativeLoader", "isLoading ,avoid repeat load");
            return;
        } else
        {
            (new com.google.android.gms.ads.AdLoader.Builder(mContext, mAdmobUniId)).forAppInstallAd(new c(this)).forContentAd(new com.cmcm.adsdk.nativead.b(this)).withAdListener(new com.cmcm.adsdk.nativead.a(this)).build().loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
            isLoading.set(true);
            return;
        }
    }

    private void notifyAdSelected()
    {
        if (mNativeAdListener != null && hasValidAd())
        {
            com.cmcm.a.a.a a1 = (com.cmcm.a.a.a)mAdmobdPool.get(0);
            mNativeAdListener.a(a1);
        }
    }

    private void notifyFailed(String s)
    {
        if (mNativeAdListener != null)
        {
            mNativeAdListener.a(getAdName(), s);
        }
    }

    private void preloadAdmob()
    {
        if (hasAdmobSDK())
        {
            loadAdmobAd();
        }
    }

    public com.cmcm.a.a.a getAd()
    {
        com.cmcm.a.a.a a1 = null;
        b.a("AdmobNativeLoader", "getAd");
        if (!a.d())
        {
            b.a("AdmobNativeLoader", "sdk has stop work");
            return null;
        }
        if (hasValidAd())
        {
            a1 = (com.cmcm.a.a.a)mAdmobdPool.remove(0);
            b.a("AdmobNativeLoader", (new StringBuilder("adpool romove ad title:")).append(a1.d()).append(",adpool size :").append(mAdmobdPool.size()).toString());
        }
        if (mAdmobdPool != null && mAdmobdPool.isEmpty())
        {
            b.a("AdmobNativeLoader", "ad pool is Empty to preload Ad");
            preloadAdmob();
        }
        mCurrentAd = a1;
        return a1;
    }

    protected List getAdList(int i)
    {
        b.a("AdmobNativeLoader", "getAdList");
        if (!a.d())
        {
            b.a("AdmobNativeLoader", "sdk has stop work");
        } else
        if (hasValidAd())
        {
            ArrayList arraylist = new ArrayList();
            for (int j = 0; j < Math.min(i, mAdmobdPool.size()); j++)
            {
                arraylist.add((com.cmcm.a.a.a)mAdmobdPool.remove(0));
            }

            if (mAdmobdPool != null && mAdmobdPool.isEmpty())
            {
                b.a("AdmobNativeLoader", "ad pool is Empty to preload Ad");
                preloadAdmob();
            }
            return arraylist;
        }
        return null;
    }

    public void loadAd()
    {
        b.a("AdmobNativeLoader", "loadAd admob");
        if (hasValidAd())
        {
            b.a("AdmobNativeLoader", "ad pool has admob ad ");
            notifyAdSelected();
            return;
        }
        if (!hasAdmobSDK())
        {
            b.a("AdmobNativeLoader", "admob sdk non-exist ");
            notifyFailed("10003");
            return;
        } else
        {
            loadAdmobAd();
            return;
        }
    }

    protected void removeAdFromPool(com.cmcm.a.a.a a1)
    {
        if (mAdmobdPool != null)
        {
            mAdmobdPool.remove(a1);
            b.a("AdmobNativeLoader", (new StringBuilder("adpool remove ad title: ")).append(a1.d()).append(",adpool size:").append(mAdmobdPool.size()).toString());
        }
    }





}
