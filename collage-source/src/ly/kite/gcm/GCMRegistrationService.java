// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.gcm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.iid.a;
import ly.kite.KiteSDK;
import ly.kite.util.HTTPJSONRequest;
import org.json.JSONException;
import org.json.JSONObject;

public class GCMRegistrationService extends IntentService
    implements ly.kite.util.HTTPJSONRequest.HTTPJSONRequestListener
{

    private static final String JSON_NAME_ENVIRONMENT = "environment";
    private static final String JSON_NAME_PLATFORM = "platform";
    private static final String JSON_NAME_PUSH_TOKEN = "push_token";
    private static final String JSON_NAME_SET = "set";
    private static final String JSON_NAME_TOKEN = "token";
    private static final String JSON_NAME_UUID = "uuid";
    private static final String JSON_VALUE_ANDROID = "Android";
    private static final String SHARED_PREFERENCES_KEY_GCM_REGISTRATION_REQUIRED = "gcm_registration_required";
    private static final String SHARED_PREFERENCES_NAME = "kite_sdk_gcm_shared_prefs";
    private static final String TAG = "GCMRegistrationService";
    private static final String USER_REQUEST_FORMAT_STRING = "%s/person/";
    private HTTPJSONRequest mHTTPJSONRequest;
    private SharedPreferences mSharedPreferences;

    public GCMRegistrationService()
    {
        super("GCMRegistrationService");
    }

    private SharedPreferences getSharedPreferences()
    {
        return getSharedPreferences("kite_sdk_gcm_shared_prefs", 0);
    }

    private void savedRegistrationRequired(boolean flag)
    {
        getSharedPreferences().edit().putBoolean("gcm_registration_required", flag).apply();
    }

    private void sendRegistrationToServer(String s)
        throws JSONException
    {
        if (mHTTPJSONRequest != null)
        {
            return;
        } else
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("platform", "Android");
            jsonobject.put("token", s);
            s = new JSONObject();
            s.put("push_token", jsonobject);
            s.put("platform", "Android");
            s.put("environment", KiteSDK.getInstance(this).getEnvironment().toString());
            jsonobject = new JSONObject();
            jsonobject.put("uuid", KiteSDK.getInstance(this).getUniqueUserId());
            jsonobject.put("set", s);
            s = String.format("%s/person/", new Object[] {
                KiteSDK.getInstance(this).getAPIEndpoint()
            });
            mHTTPJSONRequest = new HTTPJSONRequest(this, ly.kite.util.HTTPJSONRequest.HttpMethod.POST, s, null, jsonobject.toString());
            mHTTPJSONRequest.start(this);
            return;
        }
    }

    public static void start(Context context)
    {
        context.startService(new Intent(context, ly/kite/gcm/GCMRegistrationService));
    }

    public void onError(Exception exception)
    {
        Log.e("GCMRegistrationService", "Failed to register GCM token", exception);
        savedRegistrationRequired(true);
        mHTTPJSONRequest = null;
    }

    protected void onHandleIntent(Intent intent)
    {
        for (intent = getString(ly.kite.R.string.gcm_sender_id); intent == null || intent.trim().equals("") || !getSharedPreferences().getBoolean("gcm_registration_required", true);)
        {
            return;
        }

        try
        {
            intent = a.b(this).a(intent, "GCM", null);
            Log.i("GCMRegistrationService", (new StringBuilder()).append("Got GCM registration token: ").append(intent).toString());
            sendRegistrationToServer(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("GCMRegistrationService", "Failed to complete token refresh", intent);
        }
        savedRegistrationRequired(true);
    }

    public void onSuccess(int i, JSONObject jsonobject)
    {
        Log.i("GCMRegistrationService", "Registered GCM token OK");
        savedRegistrationRequired(false);
        mHTTPJSONRequest = null;
    }
}
