// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.content.Context;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

class UserProfileMap
{

    private static final String CURRENT_ACCOUNT_MAPKEY = "currentAcc";
    private static final String PRIMARY_ACCOUNT_MAPKEY = "primaryAcc";
    private static final String TAG = "nf_service_useragentproilemap";
    private Context mContext;
    private JSONObject mEsnMigrationFlags;
    private boolean mMapChanaged;
    private JSONObject mProfileMap;

    UserProfileMap(Context context)
    {
        mContext = context;
        context = PreferenceUtils.getStringPref(mContext, "useragent_profilemap", "");
        if (Log.isLoggable("nf_service_useragentproilemap", 3))
        {
            Log.d("nf_service_useragentproilemap", (new StringBuilder()).append("UserProfileMap json ").append(context).toString());
        }
        try
        {
            mProfileMap = new JSONObject(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            mProfileMap = new JSONObject();
        }
        context = PreferenceUtils.getStringPref(mContext, "useragent_esnmigration_flags", "");
        if (Log.isLoggable("nf_service_useragentproilemap", 3))
        {
            Log.d("nf_service_useragentproilemap", (new StringBuilder()).append("mEsnMigrationFlags json ").append(context).toString());
        }
        try
        {
            mEsnMigrationFlags = new JSONObject(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            mEsnMigrationFlags = new JSONObject();
        }
    }

    void clear()
    {
        mProfileMap = new JSONObject();
        PreferenceUtils.putStringPref(mContext, "useragent_profilemap", mProfileMap.toString());
        mEsnMigrationFlags = new JSONObject();
        PreferenceUtils.putStringPref(mContext, "useragent_esnmigration_flags", mEsnMigrationFlags.toString());
    }

    void clearEsnMigrationForCurrentAccount()
    {
        String s = mProfileMap.optString("currentAcc");
        if (mEsnMigrationFlags.optBoolean(s, false))
        {
            mEsnMigrationFlags.remove(s);
            PreferenceUtils.putStringPref(mContext, "useragent_esnmigration_flags", mEsnMigrationFlags.toString());
        }
    }

    String getAcccountKeyFromProfileId(String s)
    {
        return mProfileMap.optString(s);
    }

    Pair getCurrentProfileIdAndKey()
    {
        String s = mProfileMap.optString("currentAcc");
        String s1 = mProfileMap.optString(s);
        if ("primaryAcc".equals(s))
        {
            s = "";
        }
        return Pair.create(s, s1);
    }

    String getPrimaryAccountKey()
    {
        return mProfileMap.optString("primaryAcc");
    }

    boolean isCurrentAccountNeedEsnMigration()
    {
        String s = mProfileMap.optString("currentAcc");
        return mEsnMigrationFlags.optBoolean(s, false);
    }

    void markAllAccountForEsnMigration()
    {
        if (Log.isLoggable("nf_service_useragentproilemap", 3))
        {
            Log.d("nf_service_useragentproilemap", "markAllAccountForEsnMigration");
        }
        if (mProfileMap != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator;
        boolean flag;
        flag = false;
        iterator = mProfileMap.keys();
_L3:
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)iterator.next();
        } while ("currentAcc".equals(s) || "primaryAcc".equals(s));
        mEsnMigrationFlags.putOpt(s, Boolean.valueOf(true));
        flag = true;
          goto _L3
        if (!flag) goto _L1; else goto _L4
_L4:
        if (Log.isLoggable("nf_service_useragentproilemap", 3))
        {
            Log.d("nf_service_useragentproilemap", (new StringBuilder()).append("markAllAccountForEsnMigration ").append(mEsnMigrationFlags).toString());
        }
        PreferenceUtils.putStringPref(mContext, "useragent_esnmigration_flags", mEsnMigrationFlags.toString());
        return;
        JSONException jsonexception;
        jsonexception;
          goto _L3
    }

    void setCurrentAccount(String s, String s1)
    {
        String s2;
        s2 = s;
        if (StringUtils.isEmpty(s))
        {
            s2 = "primaryAcc";
        }
        mProfileMap.putOpt("currentAcc", s2);
        if (!StringUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        mProfileMap.remove(s2);
_L3:
        mMapChanaged = true;
_L4:
        if (mMapChanaged)
        {
            PreferenceUtils.putStringPref(mContext, "useragent_profilemap", mProfileMap.toString());
        }
        return;
_L2:
        mProfileMap.putOpt(s2, s1);
          goto _L3
        s;
        mMapChanaged = false;
          goto _L4
    }
}
