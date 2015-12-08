// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            Utils

public final class KohlsError
{

    private static final String ERROR_DEFAULT_HTTP_ERROR = "defaultHttpErrorMessage";
    private static final String ERROR_DEFAULT_HTTP_ERROR_MSG = "We're sorry! We're unable to process your request at this time. Please try again later.";
    private static final String ERROR_FILE_NAME = "error.json";
    private static final String ERROR_UPDATE_TIMESTAMP = "error_timestamp";
    private static final boolean GET_ERRORS_FROM_SERVER = false;
    private static final String KOHLS_ERROR_KEY = "KohlsError_code";
    private static final long ONE_DAY_MILISECONDS = 0x5265c00L;
    private static KohlsError sInstance = new KohlsError();

    private KohlsError()
    {
    }

    private JSONObject getErrorsFromFile(Context context, String s)
    {
        context = new JSONObject(Utils.convertStreamToString(context.getResources().getAssets().open(s, 1)));
        return context;
        context;
_L2:
        return null;
        context;
        continue; /* Loop/switch isn't completed */
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static KohlsError getInstance()
    {
        return sInstance;
    }

    private boolean isRefreshRequired(Context context)
    {
        return TextUtils.isEmpty(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getErrorTimestamp());
    }

    private boolean loadErrors(Context context, JSONObject jsonobject)
    {
        boolean flag;
        if (jsonobject == null)
        {
            return false;
        }
        JSONArray jsonarray;
        String s;
        String s1;
        int i;
        try
        {
            jsonarray = jsonobject.getJSONArray("errors");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        flag = false;
        i = 0;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        context = jsonobject.getString("code").trim();
        s = jsonobject.getString("key").trim();
        s1 = jsonobject.getString("message").trim();
        jsonobject = context;
        if (!TextUtils.isEmpty(s))
        {
            jsonobject = (new StringBuilder()).append(context).append(s).toString();
        }
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().setServerError(jsonobject, s1);
        flag = true;
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_19;
        context;
        if (true) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().setErrorTimestamp(String.valueOf(System.currentTimeMillis()));
        }
        return true;
    }

    private void performRefresh(Context context, JSONObject jsonobject)
    {
        if (loadErrors(context, getErrorsFromFile(context, "error.json")));
    }

    public String getErrorMessage(String s)
    {
        String s1 = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getServerError(s);
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getServerError(String.valueOf("defaultHttpErrorMessage"));
        }
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "We're sorry! We're unable to process your request at this time. Please try again later.";
        }
        return s1;
    }

    public String getErrorMessage(String s, String s1)
    {
        return getErrorMessage((new StringBuilder()).append(s).append(s1).toString());
    }

    public void load(Context context, JSONObject jsonobject)
    {
        if (isRefreshRequired(context))
        {
            performRefresh(context, jsonobject);
        }
    }

}
