// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cleanmaster.common.a;
import com.cleanmaster.gaid.AdvertisingIdHelper;
import com.cleanmaster.ui.app.market.Ad;
import com.cleanmaster.ui.app.market.c;
import com.cleanmaster.ui.app.market.d;
import com.cleanmaster.util.ReceiverUtils;
import com.cleanmaster.util.i;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.picksinit:
//            Config, c, PicksMob, ErrorInfo, 
//            ICallBack, d, a, ClickAdFinishListener

public abstract class b
{

    private static long mCacheTime = 0xdbba0L;
    private static b mInstance;
    public final String TAG = "picks sdk";
    private int mAdResourceRp;
    private com.picksinit.a mBrowserConfig;
    private String mChannelId;
    private Config mConfig;
    private Context mContext;
    private int mCver;
    private boolean mIsCnVersion;
    private boolean mIsInit;
    private String mMid;
    private int mSSPId;

    public b()
    {
        mAdResourceRp = 1;
        mSSPId = -1;
        mIsInit = false;
    }

    private void filter(List list)
    {
        filterMtType(list);
        if (mConfig != null)
        {
            filterShowType(list, mConfig.getShowType());
            if (!mConfig.isNeedWebView())
            {
                filterWebView(list);
            }
            return;
        } else
        {
            filterShowType(list, null);
            filterWebView(list);
            return;
        }
    }

    private void filterMtType(List list)
    {
        if (list != null && list.size() > 0)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Ad ad = (Ad)list.next();
                if (ad != null)
                {
                    if (ad.getMtType() == 64)
                    {
                        list.remove();
                    }
                } else
                {
                    list.remove();
                }
            } while (true);
        }
    }

    private void filterShowType(List list, Set set)
    {
        if (list != null && list.size() > 0)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Ad ad = (Ad)list.next();
                if (ad != null)
                {
                    if (set != null)
                    {
                        if (!set.contains(Integer.valueOf(ad.getAppShowType())) && ad.getAppShowType() != 50000 && ad.getAppShowType() != 50001 && ad.getAppShowType() != 0 && ad.getAppShowType() != 1016)
                        {
                            list.remove();
                        }
                    } else
                    if (ad.getAppShowType() != 50000 && ad.getAppShowType() != 50001 && ad.getAppShowType() != 0 && ad.getAppShowType() != 1016)
                    {
                        list.remove();
                    }
                } else
                {
                    list.remove();
                }
            } while (true);
        }
    }

    private void filterWebView(List list)
    {
        if (list != null && list.size() > 0)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Ad ad = (Ad)list.next();
                if (ad == null || !TextUtils.isEmpty(ad.getHtml()) && TextUtils.isEmpty(ad.getPicUrl()))
                {
                    list.remove();
                }
            } while (true);
        }
    }

    private void freshConfig()
    {
        if (c.a("config_last_save_time", 0x5265c00L))
        {
            (new Thread(new com.picksinit.c(this))).start();
        }
    }

    public static b getInstance()
    {
        if (mInstance != null) goto _L2; else goto _L1
_L1:
        com/picksinit/b;
        JVM INSTR monitorenter ;
        if (mInstance == null)
        {
            mInstance = new PicksMob();
        }
        com/picksinit/b;
        JVM INSTR monitorexit ;
_L2:
        return mInstance;
        Exception exception;
        exception;
        com/picksinit/b;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void loadAd(int j, int k, ICallBack icallback, int l, int i1, int j1, int k1)
    {
        i.a(mIsInit, "you not init picks sdk, please excete init sdk first");
        if (l <= 0 || l > 30 || j < 0)
        {
            if (icallback != null)
            {
                icallback.onLoadError(new ErrorInfo(500, "params is error", k));
            }
        } else
        if (!a.c(mContext))
        {
            if (icallback != null)
            {
                icallback.onLoadError(new ErrorInfo(300, "netWork is unable", k));
                return;
            }
        } else
        {
            icallback = new com.picksinit.d(this, j, l, String.valueOf(k), icallback, k, j1, k1);
            if (i1 > 0)
            {
                icallback.a(i1);
            }
            icallback.c(new Void[0]);
            return;
        }
    }

    public void clearCacheTime(String s)
    {
        SharedPreferences sharedpreferences = mContext.getSharedPreferences("market_config", 0);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            sharedpreferences.edit().putLong((new StringBuilder()).append(s).append("_cache_time").toString(), 0L).apply();
            return;
        } else
        {
            sharedpreferences.edit().putLong((new StringBuilder()).append(s).append("_cache_time").toString(), 0L).commit();
            return;
        }
    }

    public abstract void clearParse302Url(int j);

    public abstract void doFaceBookClickReport(String s, String s1, String s2, String s3, int j);

    public abstract void doFaceBookViewReport(String s, String s1, String s2, String s3, int j);

    public void doInstallSuccessReport(String s, Ad ad, String s1)
    {
        d.d(s, ad, s1);
    }

    public void doRecommendAdClickReport(String s, String s1, int j)
    {
        d.b(s, s1, j);
    }

    public void doRecommendAdViewReport(String s, String s1, int j)
    {
        d.a(s, s1, j);
    }

    public abstract void downloadSuccessReport(String s, Ad ad, String s1);

    public com.picksinit.a getBrowserConfig()
    {
        return mBrowserConfig;
    }

    public String getChannelId()
    {
        return mChannelId;
    }

    public Context getContext()
    {
        i.a(mIsInit, "please init picks sdk first");
        return mContext;
    }

    public abstract com.cleanmaster.down.a getExtraDownLoader();

    public int getIntMid()
    {
        int j;
        try
        {
            j = Integer.parseInt(getMid());
        }
        catch (Exception exception)
        {
            return 0;
        }
        return j;
    }

    public String getMid()
    {
        return mMid;
    }

    public int getSSPId()
    {
        i.a(mIsInit, "please init picks sdk first");
        return mSSPId;
    }

    public String getTestReportIp()
    {
        if (mConfig != null)
        {
            return mConfig.getTestReportIp();
        } else
        {
            return "";
        }
    }

    public String getUserAgent()
    {
        i.a(mIsInit, "please init picks sdk first");
        return com.cleanmaster.ui.app.market.transport.b.b();
    }

    public int getmAdResourceRp()
    {
        return mAdResourceRp;
    }

    public int getmCver()
    {
        return mCver;
    }

    public void init(Context context, String s, String s1, boolean flag)
    {
        mContext = context.getApplicationContext();
        mChannelId = s1;
        mMid = s;
        mIsCnVersion = flag;
        mIsInit = true;
        AdvertisingIdHelper.getInstance().asyncGetGAId();
        freshConfig();
        ReceiverUtils.a(mContext);
    }

    public void initUserAgent()
    {
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            com.cleanmaster.ui.app.market.transport.b.a();
        }
    }

    public boolean isCnVersion()
    {
        return mIsCnVersion;
    }

    public boolean isDebug()
    {
        if (mConfig != null)
        {
            return mConfig.isDebug();
        } else
        {
            return false;
        }
    }

    public abstract boolean ishaveInternalDown();

    public void loadad(int j, int k, ICallBack icallback, int l, int i1)
    {
        loadAd(j, k, icallback, l, i1, 0, 0);
    }

    public void loadad(int j, ICallBack icallback, int k, int l)
    {
        loadAd(0, j, icallback, k, l, 0, 0);
    }

    public void loadad(int j, ICallBack icallback, int k, int l, int i1, int j1)
    {
        loadAd(0, j, icallback, k, j1, l, i1);
    }

    public void onClickAdNoDialog(Context context, String s, Ad ad, ClickAdFinishListener clickadfinishlistener)
    {
        d.a(context, s, ad, null, true, clickadfinishlistener);
    }

    public abstract void preLoad302Ad(Ad ad, int j);

    public abstract void reportDowned(String s);

    public abstract void reportInstall(String s);

    public void setBrowserConfig(String s)
    {
        i.a(mIsInit, "please init picks sdk first");
        mBrowserConfig = new com.picksinit.a(s);
    }

    public void setBrowserConfig(String s, Object obj, String s1)
    {
        mBrowserConfig = new com.picksinit.a(s, obj, s1);
    }

    public void setCacheTime(long l)
    {
        i.a(mIsInit, "please init picks sdk first");
        mCacheTime = l;
    }

    public void setChannelId(String s)
    {
        mChannelId = s;
    }

    public void setConfig(Config config)
    {
        mConfig = config;
    }

    public abstract void setDownLoader(com.cleanmaster.down.a a1);

    public void setSSPId(int j)
    {
        i.a(mIsInit, "please init picks sdk first");
        mSSPId = j;
    }

    public void setUserAgent(String s)
    {
        i.a(mIsInit, "please init picks sdk first");
        com.cleanmaster.ui.app.market.transport.b.a(s);
    }

    public void setmAdResourceRp(int j)
    {
    }

    public void setmCver(int j)
    {
        mCver = j;
    }

    public void showReport(Context context, String s, Ad ad)
    {
        d.a(ad, s, null);
        d.b(ad);
    }


}
