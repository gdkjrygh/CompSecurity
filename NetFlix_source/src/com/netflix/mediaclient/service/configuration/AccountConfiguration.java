// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountConfigData;
import com.netflix.mediaclient.util.PreferenceUtils;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            KidsOnPhoneConfiguration

public class AccountConfiguration
{

    AccountConfigData mAccountConfigData;
    Context mContext;

    public AccountConfiguration(Context context)
    {
        mContext = context;
        mAccountConfigData = AccountConfigData.fromString(PreferenceUtils.getStringPref(context, "accountConfig", null));
    }

    public void clear()
    {
        PreferenceUtils.putStringPref(mContext, "streamingqoe", null);
        PreferenceUtils.putStringPref(mContext, "accountConfig", null);
    }

    public boolean getCastEnabled()
    {
        if (mAccountConfigData == null)
        {
            return false;
        } else
        {
            return mAccountConfigData.getCastEnabled();
        }
    }

    public JSONArray getCastWhitelist()
    {
        if (mAccountConfigData == null)
        {
            return null;
        } else
        {
            return mAccountConfigData.getCastWhitelistAsJsonArray();
        }
    }

    public JSONObject getJPlayerConfig()
    {
        if (mAccountConfigData == null)
        {
            return null;
        } else
        {
            return mAccountConfigData.getJPlayerThreadConfigAsJson();
        }
    }

    public KidsOnPhoneConfiguration getKidsOnPhoneConfiguration()
    {
        if (mAccountConfigData == null)
        {
            return null;
        } else
        {
            return mAccountConfigData.getKidsOnPhone();
        }
    }

    public JSONArray getMdxBlacklist()
    {
        if (mAccountConfigData == null)
        {
            return null;
        } else
        {
            return mAccountConfigData.getMdxBlacklistAsJsonArray();
        }
    }

    public String getStreamingQoe()
    {
        return PreferenceUtils.getStringPref(mContext, "streamingqoe", null);
    }

    public int getVideoBufferSize()
    {
        if (mAccountConfigData == null)
        {
            return 0;
        } else
        {
            return mAccountConfigData.getVideoBufferSize();
        }
    }

    public void persistAccountConfigOverride(AccountConfigData accountconfigdata)
    {
        String s = null;
        if (accountconfigdata != null)
        {
            s = accountconfigdata.toString();
        }
        PreferenceUtils.putStringPref(mContext, "accountConfig", s);
        mAccountConfigData = accountconfigdata;
    }

    public void persistStreamingOverride(String s)
    {
        PreferenceUtils.putStringPref(mContext, "streamingqoe", s);
    }
}
