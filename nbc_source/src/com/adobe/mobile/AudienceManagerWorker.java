// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobileConfig, VisitorIDService, MobilePrivacyStatus, 
//            RequestHandler

final class AudienceManagerWorker
{
    public static class SubmitSignalTask
        implements Runnable
    {

        public final AudienceManager.AudienceManagerCallback callback;
        public final Map data;

        public void run()
        {
            HashMap hashmap = new HashMap();
            boolean flag = MobileConfig.getInstance().mobileUsingAudienceManager();
            if (flag) goto _L2; else goto _L1
_L1:
            if (callback != null)
            {
                (new Thread(hashmap. new Runnable() {

                    final SubmitSignalTask this$0;
                    final HashMap val$callbackData;

                    public void run()
                    {
                        callback.call(callbackData);
                    }

            
            {
                this$0 = final_submitsignaltask;
                callbackData = HashMap.this;
                super();
            }
                })).start();
            }
_L4:
            return;
_L2:
            if (MobileConfig.getInstance().getPrivacyStatus() != MobilePrivacyStatus.MOBILE_PRIVACY_STATUS_OPT_OUT)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            StaticMethods.logDebugFormat("Audience Manager - Privacy status is set to opt out, no signals will be submitted.", new Object[0]);
            if (callback == null) goto _L4; else goto _L3
_L3:
            (new Thread(hashmap. new _cls1())).start();
            return;
            Object obj2;
            obj2 = AudienceManagerWorker.BuildSchemaRequest(data);
            if (((String) (obj2)).length() > 1)
            {
                break MISSING_BLOCK_LABEL_148;
            }
            StaticMethods.logWarningFormat("Audience Manager - Unable to create URL object", new Object[0]);
            if (callback == null) goto _L4; else goto _L5
_L5:
            (new Thread(hashmap. new _cls1())).start();
            return;
            Object obj;
            StaticMethods.logDebugFormat("Audience Manager - request (%s)", new Object[] {
                obj2
            });
            obj = new StringBuilder();
            obj2 = (new DefaultHttpClient()).execute(new HttpGet(((String) (obj2))));
            if (((HttpResponse) (obj2)).getStatusLine().getStatusCode() != 200)
            {
                break MISSING_BLOCK_LABEL_302;
            }
            obj2 = new BufferedReader(new InputStreamReader(((HttpResponse) (obj2)).getEntity().getContent(), "UTF-8"));
_L6:
            Object obj3 = ((BufferedReader) (obj2)).readLine();
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_298;
            }
            ((StringBuilder) (obj)).append(((String) (obj3)));
              goto _L6
            obj;
            StaticMethods.logWarningFormat("Audience Manager - Unable to read response from server (%s)", new Object[] {
                ((IOException) (obj)).getLocalizedMessage()
            });
            if (callback == null) goto _L4; else goto _L7
_L7:
            (new Thread(hashmap. new _cls1())).start();
            return;
            ((BufferedReader) (obj2)).close();
            obj = new JSONObject(((StringBuilder) (obj)).toString());
            obj2 = ((JSONObject) (obj)).getJSONArray("dests");
            int i = 0;
_L14:
            if (i >= ((JSONArray) (obj2)).length()) goto _L9; else goto _L8
_L8:
            obj3 = ((JSONArray) (obj2)).getJSONObject(i).getString("c");
            if (obj3 == null) goto _L11; else goto _L10
_L10:
            if (((String) (obj3)).length() > 0)
            {
                RequestHandler.sendGenericRequest(((String) (obj3)), null, 5000, "Audience Manager");
            }
              goto _L11
_L9:
            AudienceManagerWorker.SetUUID(((JSONObject) (obj)).getString("uuid"));
            obj = ((JSONObject) (obj)).getJSONArray("stuff");
            obj2 = new HashMap();
            i = 0;
_L15:
            if (i >= ((JSONArray) (obj)).length())
            {
                break MISSING_BLOCK_LABEL_444;
            }
            obj3 = ((JSONArray) (obj)).getJSONObject(i);
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_662;
            }
            ((HashMap) (obj2)).put(((JSONObject) (obj3)).getString("cn"), ((JSONObject) (obj3)).getString("cv"));
            break MISSING_BLOCK_LABEL_662;
            if (((HashMap) (obj2)).size() > 0)
            {
                break MISSING_BLOCK_LABEL_487;
            }
            StaticMethods.logWarningFormat("Audience Manager - response was empty", new Object[0]);
            if (callback == null) goto _L4; else goto _L12
_L12:
            (new Thread(hashmap. new _cls1())).start();
            return;
            StaticMethods.logDebugFormat("Audience Manager - response (%s)", new Object[] {
                obj2
            });
            AudienceManagerWorker.SetVisitorProfile(((Map) (obj2)));
            hashmap.putAll(((Map) (obj2)));
            if (callback != null)
            {
                (new Thread(hashmap. new _cls1())).start();
                return;
            }
              goto _L4
            Object obj1;
            obj1;
            StaticMethods.logWarningFormat("Audience Manager - Unable to parse JSON data (%s)", new Object[] {
                ((JSONException) (obj1)).getLocalizedMessage()
            });
            if (callback != null)
            {
                (new Thread(hashmap. new _cls1())).start();
                return;
            }
              goto _L4
            obj1;
            StaticMethods.logWarningFormat("Audience Manager - Unexpected error parsing result (%s)", new Object[] {
                ((Exception) (obj1)).getLocalizedMessage()
            });
            if (callback == null) goto _L4; else goto _L13
_L13:
            (new Thread(hashmap. new _cls1())).start();
            return;
            obj1;
            if (callback != null)
            {
                (new Thread(hashmap. new _cls1())).start();
            }
            throw obj1;
_L11:
            i++;
              goto _L14
            i++;
              goto _L15
        }

        public SubmitSignalTask(Map map, AudienceManager.AudienceManagerCallback audiencemanagercallback)
        {
            data = map;
            callback = audiencemanagercallback;
        }
    }


    private static final String AUDIENCE_MANAGER_CUSTOMER_DATA_PREFIX = "c_";
    private static final String AUDIENCE_MANAGER_DATA_PROVIDER_ID_KEY = "d_dpid";
    private static final String AUDIENCE_MANAGER_DATA_PROVIDER_USER_ID_KEY = "d_dpuuid";
    private static final String AUDIENCE_MANAGER_JSON_COOKIE_NAME_KEY = "cn";
    private static final String AUDIENCE_MANAGER_JSON_COOKIE_VALUE_KEY = "cv";
    private static final String AUDIENCE_MANAGER_JSON_DESTS_KEY = "dests";
    private static final String AUDIENCE_MANAGER_JSON_STUFF_KEY = "stuff";
    private static final String AUDIENCE_MANAGER_JSON_URL_KEY = "c";
    private static final String AUDIENCE_MANAGER_JSON_USER_ID_KEY = "uuid";
    private static final String AUDIENCE_MANAGER_SHARED_PREFS_PROFILE_KEY = "AAMUserProfile";
    private static final String AUDIENCE_MANAGER_SHARED_PREFS_USER_ID_KEY = "AAMUserId";
    private static final String AUDIENCE_MANAGER_URL_PREFIX = "http://%s/event?";
    private static final String AUDIENCE_MANAGER_URL_SUFFIX = "&d_ptfm=android&d_dst=1&d_rtbd=json";
    private static final String AUDIENCE_MANAGER_USER_ID_KEY = "d_uuid";
    private static volatile boolean UrlPrefix_pred = true;
    private static volatile boolean VisitorProfile_pred = true;
    private static String _dpid = null;
    private static String _dpuuid = null;
    private static String _urlPrefix = null;
    private static HashMap _visitorProfile = null;

    AudienceManagerWorker()
    {
    }

    private static String BuildSchemaRequest(Map map)
    {
        if (GetUrlPrefix() == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(GetUrlPrefix()).append(GetCustomUrlVariables(map)).append(GetDataProviderUrlVariables()).append("&d_ptfm=android&d_dst=1&d_rtbd=json").toString().replace("?&", "?");
        }
    }

    private static String GetCustomUrlVariables(Map map)
    {
        if (map == null || map.size() <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(1024);
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            String s = (String)entry.getKey();
            Object obj = entry.getValue();
            if (s != null && s.length() > 0 && obj != null && obj.toString().length() > 0 && entry.getValue().getClass() == java/lang/String)
            {
                stringbuilder.append("&").append("c_").append(StaticMethods.URLEncode(SanitizeUrlVariableName(s))).append("=").append(StaticMethods.URLEncode(obj.toString()));
            }
        } while (true);
        return stringbuilder.toString();
    }

    private static String GetDataProviderUrlVariables()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (MobileConfig.getInstance().getVisitorIdServiceEnabled())
        {
            stringbuilder.append(VisitorIDService.sharedInstance().getAAMParameterString());
        }
        if (GetUUID() != null)
        {
            stringbuilder.append("&").append("d_uuid").append("=").append(GetUUID());
        }
        if (_dpid != null && _dpid.length() > 0 && _dpuuid != null && _dpuuid.length() > 0)
        {
            stringbuilder.append("&").append("d_dpid").append("=").append(_dpid).append("&").append("d_dpuuid").append("=").append(_dpuuid);
        }
        return stringbuilder.toString();
    }

    public static String GetDpid()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return AudienceManagerWorker._dpid;
            }

        });
        StaticMethods.getAudienceExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Audience Manager - Unable to get Dpid (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    public static String GetDpuuid()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public String call()
                throws Exception
            {
                return AudienceManagerWorker._dpuuid;
            }

        });
        StaticMethods.getAudienceExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (String)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Audience Manager - Unable to get Dpid (%s)", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((String) (obj));
    }

    private static String GetUUID()
    {
        String s;
        try
        {
            s = StaticMethods.getSharedPreferences().getString("AAMUserId", null);
        }
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logErrorFormat("Audience Manager - Error getting uuid from shared preferences (%s).", new Object[] {
                nullcontextexception.getMessage()
            });
            return null;
        }
        return s;
    }

    private static String GetUrlPrefix()
    {
        if (UrlPrefix_pred && MobileConfig.getInstance().mobileUsingAudienceManager())
        {
            UrlPrefix_pred = false;
            _urlPrefix = String.format("http://%s/event?", new Object[] {
                MobileConfig.getInstance().getAamServer()
            });
        }
        return _urlPrefix;
    }

    public static HashMap GetVisitorProfile()
    {
        Object obj = new FutureTask(new Callable() {

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public HashMap call()
                throws Exception
            {
                if (!AudienceManagerWorker.VisitorProfile_pred) goto _L2; else goto _L1
_L1:
                String s = StaticMethods.getSharedPreferences().getString("AAMUserProfile", null);
                if (s == null) goto _L2; else goto _L3
_L3:
                int i = s.length();
                if (i <= 0) goto _L2; else goto _L4
_L4:
                AudienceManagerWorker._visitorProfile = StaticMethods.mapFromJson(new JSONObject(s));
_L5:
                AudienceManagerWorker.VisitorProfile_pred = false;
_L2:
                return AudienceManagerWorker._visitorProfile;
                Object obj1;
                obj1;
                StaticMethods.logWarningFormat("Audience Manager - Problem accessing profile data (%s)", new Object[] {
                    ((JSONException) (obj1)).getLocalizedMessage()
                });
                  goto _L5
                obj1;
                StaticMethods.logErrorFormat("Audience Manager - Problem accessing profile data (%s)", new Object[] {
                    ((StaticMethods.NullContextException) (obj1)).getMessage()
                });
                  goto _L2
            }

        });
        StaticMethods.getAudienceExecutor().execute(((Runnable) (obj)));
        try
        {
            obj = (HashMap)((FutureTask) (obj)).get();
        }
        catch (Exception exception)
        {
            StaticMethods.logErrorFormat("Audience Manager - Unable to retrieve Visitor Profile", new Object[] {
                exception.getMessage()
            });
            return null;
        }
        return ((HashMap) (obj));
    }

    public static void Reset()
    {
        StaticMethods.getAudienceExecutor().execute(new Runnable() {

            public void run()
            {
                AudienceManagerWorker.SetUUID(null);
                AudienceManagerWorker.SetVisitorProfile(null);
            }

        });
    }

    private static String SanitizeUrlVariableName(String s)
    {
        return s.replace(".", "_");
    }

    public static void SetDpidAndDpuuid(String s, String s1)
    {
        StaticMethods.getAudienceExecutor().execute(new Runnable(s, s1) {

            final String val$newDpid;
            final String val$newDpuuid;

            public void run()
            {
                AudienceManagerWorker._dpid = newDpid;
                AudienceManagerWorker._dpuuid = newDpuuid;
            }

            
            {
                newDpid = s;
                newDpuuid = s1;
                super();
            }
        });
    }

    private static void SetUUID(String s)
    {
        android.content.SharedPreferences.Editor editor;
        try
        {
            editor = StaticMethods.getSharedPreferencesEditor();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Audience Manager - Error updating uuid in shared preferences (%s)", new Object[] {
                s.getMessage()
            });
            return;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        editor.remove("AAMUserId");
_L2:
        editor.commit();
        return;
        editor.putString("AAMUserId", s);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void SetVisitorProfile(Map map)
    {
        VisitorProfile_pred = false;
        android.content.SharedPreferences.Editor editor;
        try
        {
            editor = StaticMethods.getSharedPreferencesEditor();
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            StaticMethods.logErrorFormat("Audience Manager - Error updating visitor profile (%s)", new Object[] {
                map.getMessage()
            });
            return;
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        editor.putString("AAMUserProfile", (new JSONObject(map)).toString());
        _visitorProfile = new HashMap(map);
_L2:
        editor.commit();
        return;
        editor.remove("AAMUserProfile");
        _visitorProfile = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void SubmitSignal(Map map, AudienceManager.AudienceManagerCallback audiencemanagercallback)
    {
        StaticMethods.getAudienceExecutor().execute(new SubmitSignalTask(map, audiencemanagercallback));
    }




/*
    static boolean access$002(boolean flag)
    {
        VisitorProfile_pred = flag;
        return flag;
    }

*/



/*
    static HashMap access$102(HashMap hashmap)
    {
        _visitorProfile = hashmap;
        return hashmap;
    }

*/



/*
    static String access$202(String s)
    {
        _dpuuid = s;
        return s;
    }

*/



/*
    static String access$302(String s)
    {
        _dpid = s;
        return s;
    }

*/



}
