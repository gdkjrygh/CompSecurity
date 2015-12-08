// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            KidsOnPhoneConfigData

public class AccountConfigData
{

    private static final String FIELD_KIDS_ON_PHONE = "kidsOnPhoneConfig";
    private static final String TAG = "nf_config";
    private final String castWhitelist = null;
    private boolean enableCast;
    private String jPlayerConfig;
    private KidsOnPhoneConfigData kidsOnPhoneConfig;
    private JSONArray mCastWhitelistJSONArray;
    private JSONObject mJPlayerConfigJSON;
    private JSONArray mMdxBlacklistTargetsJSONArray;
    private final String mdxBlacklistTargets = null;
    private final int videoBufferSize = 0;

    public AccountConfigData()
    {
        mCastWhitelistJSONArray = null;
        mMdxBlacklistTargetsJSONArray = null;
        kidsOnPhoneConfig = KidsOnPhoneConfigData.DEFAULT_KIDS_CONFIG;
        mJPlayerConfigJSON = null;
    }

    public static AccountConfigData fromString(String s)
    {
        AccountConfigData accountconfigdata;
        if (StringUtils.isEmpty(s))
        {
            return null;
        }
        accountconfigdata = (AccountConfigData)FalcorParseUtils.getGson().fromJson(s, com/netflix/mediaclient/service/webclient/model/leafs/AccountConfigData);
        accountconfigdata.mCastWhitelistJSONArray = null;
        accountconfigdata.mMdxBlacklistTargetsJSONArray = null;
        accountconfigdata.mJPlayerConfigJSON = null;
        if (!StringUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s = new JSONObject();
_L1:
        s = JsonUtils.getString(s, "kidsOnPhoneConfig", null);
        if (s != null)
        {
            try
            {
                accountconfigdata.kidsOnPhoneConfig = (KidsOnPhoneConfigData)FalcorParseUtils.getGson().fromJson(s, com/netflix/mediaclient/service/webclient/model/leafs/KidsOnPhoneConfigData);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.handleException("nf_config", s);
                return accountconfigdata;
            }
            return accountconfigdata;
        }
        break MISSING_BLOCK_LABEL_103;
        s = new JSONObject(s);
          goto _L1
        accountconfigdata.kidsOnPhoneConfig = KidsOnPhoneConfigData.DEFAULT_KIDS_CONFIG;
        return accountconfigdata;
    }

    public String getCastBlacklist()
    {
        return castWhitelist;
    }

    public boolean getCastEnabled()
    {
        return enableCast;
    }

    public JSONArray getCastWhitelistAsJsonArray()
    {
        if (mCastWhitelistJSONArray == null)
        {
            Object obj = null;
            JSONArray jsonarray = obj;
            if (StringUtils.isNotEmpty(castWhitelist))
            {
                try
                {
                    jsonarray = new JSONArray(castWhitelist);
                }
                catch (JSONException jsonexception)
                {
                    Log.d("nf_config", String.format("castWhitelist bad json: %s", new Object[] {
                        castWhitelist
                    }));
                    jsonexception = obj;
                }
            }
            mCastWhitelistJSONArray = jsonarray;
        }
        return mCastWhitelistJSONArray;
    }

    public JSONObject getJPlayerThreadConfigAsJson()
    {
        if (mJPlayerConfigJSON == null)
        {
            Object obj = null;
            JSONObject jsonobject = obj;
            if (StringUtils.isNotEmpty(jPlayerConfig))
            {
                try
                {
                    jsonobject = new JSONObject(jPlayerConfig);
                }
                catch (JSONException jsonexception)
                {
                    Log.d("nf_config", String.format("jPlayerThreadConfig bad json: %s", new Object[] {
                        jPlayerConfig
                    }));
                    jsonexception = obj;
                }
            }
            mJPlayerConfigJSON = jsonobject;
        }
        return mJPlayerConfigJSON;
    }

    public KidsOnPhoneConfiguration getKidsOnPhone()
    {
        return kidsOnPhoneConfig;
    }

    public String getMdxBlacklist()
    {
        return mdxBlacklistTargets;
    }

    public JSONArray getMdxBlacklistAsJsonArray()
    {
        if (mMdxBlacklistTargetsJSONArray == null)
        {
            Object obj = null;
            JSONArray jsonarray = obj;
            if (StringUtils.isNotEmpty(mdxBlacklistTargets))
            {
                try
                {
                    jsonarray = new JSONArray(mdxBlacklistTargets);
                }
                catch (JSONException jsonexception)
                {
                    Log.d("nf_config", String.format("mdxBlacklistTargets bad json: %s", new Object[] {
                        mdxBlacklistTargets
                    }));
                    jsonexception = obj;
                }
            }
            mMdxBlacklistTargetsJSONArray = jsonarray;
        }
        return mMdxBlacklistTargetsJSONArray;
    }

    public int getVideoBufferSize()
    {
        return 0;
    }

    public String toString()
    {
        String s = FalcorParseUtils.getGson().toJson(this);
        Log.d("nf_config", (new StringBuilder()).append("AccountConfig=").append(s).toString());
        return s;
    }
}
