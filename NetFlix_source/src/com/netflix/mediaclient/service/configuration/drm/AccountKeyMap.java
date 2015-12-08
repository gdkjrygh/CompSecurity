// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

class AccountKeyMap
{
    class KeyIds
    {

        private String mKceKeyId;
        private String mKchKeyId;
        private String mKeySetId;
        final AccountKeyMap this$0;

        public String getKceKeyId()
        {
            return mKceKeyId;
        }

        public String getKchKeyId()
        {
            return mKchKeyId;
        }

        public String getKeySetId()
        {
            return mKeySetId;
        }

        JSONObject toJSON()
        {
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.putOpt("keySetId", mKeySetId).putOpt("kceKeyId", mKceKeyId).putOpt("kchKeyId", mKchKeyId);
            }
            catch (JSONException jsonexception)
            {
                Log.w(AccountKeyMap.TAG, (new StringBuilder()).append("can't turn KeyIds toJSON").append(jsonexception).toString());
                return jsonobject;
            }
            return jsonobject;
        }

        KeyIds(String s)
        {
            this$0 = AccountKeyMap.this;
            super();
            if (Log.isLoggable(AccountKeyMap.TAG, 3))
            {
                Log.d(AccountKeyMap.TAG, (new StringBuilder()).append("KeyIds from JSON ").append(s).toString());
            }
            try
            {
                accountkeymap = new JSONObject(s);
                mKeySetId = optString("keySetId");
                mKceKeyId = optString("kceKeyId");
                mKchKeyId = optString("kchKeyId");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AccountKeyMap accountkeymap)
            {
                Log.w(AccountKeyMap.TAG, (new StringBuilder()).append("can't turn JSON to KeyIds ").append(AccountKeyMap.this).toString());
            }
        }

        KeyIds(String s, String s1, String s2)
        {
            this$0 = AccountKeyMap.this;
            super();
            mKeySetId = s;
            mKceKeyId = s1;
            mKchKeyId = s2;
        }
    }


    private static final String CKE_KID_MAPKEY = "kceKeyId";
    private static final String CKH_KID_MAPKEY = "kchKeyId";
    private static final String CURRENT_ACCOUNT = "currentAccount";
    private static final String KSID_MAPKEY = "keySetId";
    private static final String TAG = com/netflix/mediaclient/service/configuration/drm/AccountKeyMap.getSimpleName();
    private JSONObject mAccountKeyMap;
    private Context mContext;
    private KeyIds mKeyIdsFromLegacy;

    AccountKeyMap(Context context)
    {
        mContext = context;
        context = PreferenceUtils.getStringPref(mContext, "nf_drm_acckeymap", null);
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("has json ").append(context).toString());
        }
        if (context == null)
        {
            mAccountKeyMap = new JSONObject();
            buildKeyIdsMapFromLegacy();
            return;
        }
        try
        {
            mAccountKeyMap = new JSONObject(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            mAccountKeyMap = new JSONObject();
        }
    }

    private void buildKeyIdsMapFromLegacy()
    {
        String s = PreferenceUtils.getStringPref(mContext, "nf_drm_cdm_keyset_id", null);
        String s1 = PreferenceUtils.getStringPref(mContext, "nf_drm_kce_key_id", null);
        String s2 = PreferenceUtils.getStringPref(mContext, "nf_drm_kch_key_id", null);
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("has legacy ksid [").append(s).append("], kce_id [").append(s1).append("], kch_id [").append(s2).append("]").toString());
        }
        if (StringUtils.isNotEmpty(s) && StringUtils.isNotEmpty(s1) && StringUtils.isNotEmpty(s2))
        {
            mKeyIdsFromLegacy = new KeyIds(s, s1, s2);
            PreferenceUtils.removePref(mContext, "nf_drm_cdm_keyset_id");
            PreferenceUtils.removePref(mContext, "nf_drm_kce_key_id");
            PreferenceUtils.removePref(mContext, "nf_drm_kch_key_id");
        }
    }

    private void saveToPreference()
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("saveToPreference ").append(mAccountKeyMap.toString()).toString());
        }
        PreferenceUtils.putStringPref(mContext, "nf_drm_acckeymap", mAccountKeyMap.toString());
    }

    void addCurrentKeyIds(String s, String s1, String s2)
    {
        String s3 = mAccountKeyMap.optString("currentAccount");
        if (!StringUtils.isNotEmpty(s3)) goto _L2; else goto _L1
_L1:
        s = new KeyIds(s, s1, s2);
        mAccountKeyMap.putOpt(s3, s.toJSON().toString());
_L4:
        saveToPreference();
        return;
_L2:
        try
        {
            Log.w(TAG, "addCurrentKeyIds no current account");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w(TAG, (new StringBuilder()).append("can't addCurrentKeyIds ").append(s).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void clearMap()
    {
        mAccountKeyMap = new JSONObject();
        saveToPreference();
    }

    String getCurrentAccount()
    {
        return mAccountKeyMap.optString("currentAccount");
    }

    KeyIds getCurrentKeyIds()
    {
        String s = mAccountKeyMap.optString("currentAccount");
        return new KeyIds(mAccountKeyMap.optString(s));
    }

    void removeCurrentKeyIds(String s)
    {
        mAccountKeyMap.remove(s);
        saveToPreference();
    }

    KeyIds restoreKeyIdsForAccount(String s)
    {
        String s1;
        if (StringUtils.isEmpty(s))
        {
            return restoreKeyIdsWithoutAccount();
        }
        s1 = mAccountKeyMap.optString("currentAccount");
        if (s.equals(s1)) goto _L2; else goto _L1
_L1:
        if (!mAccountKeyMap.has(s)) goto _L4; else goto _L3
_L3:
        mAccountKeyMap.putOpt("currentAccount", s);
_L6:
        saveToPreference();
_L2:
        return getCurrentKeyIds();
_L4:
        if (StringUtils.isEmpty(s1) && mKeyIdsFromLegacy != null)
        {
            mAccountKeyMap.putOpt("currentAccount", s);
            mAccountKeyMap.putOpt(s, mKeyIdsFromLegacy.toJSON().toString());
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("account not found when restoreKeyIdsForAccount ").append(s).toString());
            }
            mAccountKeyMap.putOpt("currentAccount", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w(TAG, (new StringBuilder()).append("can't buildKeyIdsToKeySetIdMapFromLegacy ").append(s).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    KeyIds restoreKeyIdsWithoutAccount()
    {
        Log.d(TAG, "restoreKeyIdsWithoutAccount not supported");
        return null;
    }


}
