// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import android.net.Uri;
import android.text.TextUtils;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.app.token.SkypeTokenCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.ExecutorAsyncService;
import com.skype.android.config.FileUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.sync.ContactsIngestManager;
import com.skype.android.util.HttpUtil;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            AutoBuddyPreferenceResult, OnAutoBuddyPreferenceResult

public class AutoBuddyManager
    implements SkypeTokenCallback
{

    private static final String HEADER_APPLICATION_ID = "X-AppId";
    private static final String HEADER_SKYPE_TOKEN = "X-SkypeToken";
    private static final String PATH = "/people/account/settings";
    private static final String SETTING_AUTOBUDDY_FORMAT = "{\"Settings\":[{\"Name\":\"Skype.AutoBuddy\",\"Value\":\"%s\"}]}";
    private static final String URI_STRING_TEST = "https://people.directory.live-int.com";
    private static final Logger log = Logger.getLogger("AutoBuddyManager");
    private AsyncService async;
    private ContactsIngestManager contactsIngestManager;
    private EcsConfiguration ecsConfiguration;
    private EventBus eventBus;
    private HttpUtil httpUtil;
    private boolean queryIsWaitingForToken;
    private SkypeTokenAccess skypeTokenAccess;
    private String token;
    private Boolean updateIsWaitingForToken;
    private Provider userPrefsProvider;

    public AutoBuddyManager(ContactsIngestManager contactsingestmanager, Provider provider, SkypeTokenAccess skypetokenaccess, HttpUtil httputil, EventBus eventbus, EcsConfiguration ecsconfiguration)
    {
        updateIsWaitingForToken = null;
        userPrefsProvider = provider;
        skypeTokenAccess = skypetokenaccess;
        httpUtil = httputil;
        eventBus = eventbus;
        contactsIngestManager = contactsingestmanager;
        ecsConfiguration = ecsconfiguration;
        async = new ExecutorAsyncService(Executors.newSingleThreadExecutor());
    }

    private void addHeaders(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.addRequestProperty("X-AppId", "D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A");
        httpurlconnection.addRequestProperty("X-SkypeToken", token);
    }

    private boolean getAutoBuddySettingFromResponse(String s)
    {
        boolean flag;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag3 = false;
        flag4 = false;
        flag = false;
        flag2 = flag4;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Object obj;
        boolean flag1;
        obj = s;
        if (s.startsWith("<json>"))
        {
            obj = s.substring(s.indexOf('>') + 1);
        }
        flag1 = flag3;
        s = (new JSONObject(((String) (obj)))).getJSONArray("Settings");
        flag2 = flag4;
        if (s == null) goto _L2; else goto _L3
_L3:
        flag1 = flag3;
        flag2 = flag4;
        if (s.length() <= 0) goto _L2; else goto _L4
_L4:
        int i = 0;
_L5:
        flag1 = flag;
        flag2 = flag;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        obj = s.getJSONObject(i);
        flag2 = flag;
        flag1 = flag;
        if (!((JSONObject) (obj)).optString("Name").equals("Skype.AutoBuddy"))
        {
            break MISSING_BLOCK_LABEL_152;
        }
        flag1 = flag;
        flag2 = ((JSONObject) (obj)).optString("Value").equalsIgnoreCase("true");
        i++;
        flag = flag2;
        if (true) goto _L5; else goto _L2
        s;
        log.severe((new StringBuilder("getAutoBuddySettingFromResponse JSONException: ")).append(s.getMessage()).toString());
        flag2 = flag1;
_L2:
        return flag2;
    }

    private HttpURLConnection getConnection(String s)
    {
        Object obj = Uri.parse(ecsConfiguration.getAutoBuddyServerUrl()).buildUpon();
        ((android.net.Uri.Builder) (obj)).path("/people/account/settings");
        try
        {
            obj = httpUtil.a(((android.net.Uri.Builder) (obj)).toString());
            if (!TextUtils.isEmpty(s))
            {
                ((HttpURLConnection) (obj)).setRequestMethod(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            log.severe((new StringBuilder("getConnection Exception: ")).append(s.getMessage()).toString());
            return null;
        }
        return ((HttpURLConnection) (obj));
    }

    private String getPayload(boolean flag)
    {
        return String.format("{\"Settings\":[{\"Name\":\"Skype.AutoBuddy\",\"Value\":\"%s\"}]}", new Object[] {
            Boolean.valueOf(flag)
        });
    }

    private AutoBuddyPreferenceResult makeGetRequest()
    {
        Object obj1;
        Object obj4;
        AutoBuddyPreferenceResult autobuddypreferenceresult;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        obj4 = null;
        obj1 = null;
        autobuddypreferenceresult = new AutoBuddyPreferenceResult();
        autobuddypreferenceresult.setUpdateRequest(false);
        autobuddypreferenceresult.setUpdated(false);
        flag = false;
        flag2 = false;
        flag3 = false;
        flag1 = flag2;
        HttpURLConnection httpurlconnection = getConnection("GET");
        if (httpurlconnection == null)
        {
            if (httpurlconnection != null)
            {
                httpurlconnection.disconnect();
            }
            return autobuddypreferenceresult;
        }
        obj1 = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        httpurlconnection.addRequestProperty("Accept", "application/json");
        obj1 = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        addHeaders(httpurlconnection);
        Object obj;
        Object obj2;
        Object obj3;
        Object obj5;
        Object obj6;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj1 = null;
        obj2 = obj4;
        obj3 = obj5;
        obj = obj6;
        int i = httpurlconnection.getResponseCode();
        if (i < 200 || i > 300) goto _L2; else goto _L1
_L1:
        obj2 = obj4;
        obj3 = obj5;
        obj = obj6;
        obj1 = httpurlconnection.getInputStream();
        obj2 = obj1;
        obj3 = obj1;
        obj = obj1;
        obj4 = FileUtil.inputStreamToString(((java.io.InputStream) (obj1)));
        obj2 = obj1;
        obj3 = obj1;
        obj = obj1;
        log.info((new StringBuilder("makeGetRequest response = '")).append(((String) (obj4))).append("'").toString());
        obj2 = obj1;
        obj3 = obj1;
        obj = obj1;
        flag1 = getAutoBuddySettingFromResponse(((String) (obj4)));
        flag = flag1;
        obj = obj1;
_L3:
        obj1 = httpurlconnection;
        flag1 = flag;
        obj4 = httpurlconnection;
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        obj1 = httpurlconnection;
        flag1 = flag;
        obj4 = httpurlconnection;
        httpurlconnection.disconnect();
_L4:
        flag2 = flag;
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
            flag2 = flag;
        }
_L5:
        autobuddypreferenceresult.setOptionEnabled(flag2);
        return autobuddypreferenceresult;
_L2:
        obj2 = obj4;
        obj3 = obj5;
        obj = obj6;
        log.severe((new StringBuilder("makeGetRequest unexpected response code ")).append(i).toString());
        obj = obj1;
        flag = flag3;
          goto _L3
        obj1;
        obj = obj2;
        log.severe((new StringBuilder("makeGetRequest EOFException: ")).append(((EOFException) (obj1)).getMessage()).toString());
        obj1 = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        FileUtil.closeStream(((java.io.Closeable) (obj2)));
        obj1 = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        httpurlconnection.disconnect();
          goto _L4
        obj;
        obj4 = obj1;
        log.severe((new StringBuilder("makeGetRequest connection Exception: ")).append(((Exception) (obj)).getMessage()).toString());
        flag2 = flag1;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            flag2 = flag1;
        }
          goto _L5
        Exception exception;
        exception;
        obj = obj3;
        log.severe((new StringBuilder("makeGetRequest Exception: ")).append(exception.getMessage()).toString());
        exception = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        FileUtil.closeStream(((java.io.Closeable) (obj3)));
        exception = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        httpurlconnection.disconnect();
          goto _L4
        obj;
        if (obj4 != null)
        {
            ((HttpURLConnection) (obj4)).disconnect();
        }
        throw obj;
        Exception exception1;
        exception1;
        exception = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        exception = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        httpurlconnection.disconnect();
        exception = httpurlconnection;
        flag1 = flag2;
        obj4 = httpurlconnection;
        throw exception1;
          goto _L3
    }

    private AutoBuddyPreferenceResult makePostRequest(boolean flag)
    {
        Object obj2;
        Object obj3;
        AutoBuddyPreferenceResult autobuddypreferenceresult;
        String s;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        s = getPayload(flag);
        obj3 = null;
        obj2 = null;
        autobuddypreferenceresult = new AutoBuddyPreferenceResult();
        autobuddypreferenceresult.setUpdateRequest(true);
        autobuddypreferenceresult.setUpdated(false);
        flag4 = false;
        flag1 = false;
        flag2 = flag1;
        flag3 = flag4;
        HttpURLConnection httpurlconnection = getConnection("POST");
        if (httpurlconnection != null) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateLocallyCachedAutoBuddy(flag);
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
_L3:
        return autobuddypreferenceresult;
_L2:
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpurlconnection.setDoInput(true);
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpurlconnection.setDoOutput(true);
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpurlconnection.addRequestProperty("Accept-Encoding", "gzip");
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        addHeaders(httpurlconnection);
        Object obj4;
        Object obj5;
        Object obj6;
        obj2 = null;
        obj4 = null;
        obj5 = null;
        obj6 = null;
        obj3 = obj5;
        Object obj = httpurlconnection.getOutputStream();
        obj4 = obj;
        obj2 = obj;
        obj3 = obj5;
        obj5 = new BufferedWriter(new OutputStreamWriter(((java.io.OutputStream) (obj)), "UTF-8"));
        ((BufferedWriter) (obj5)).write(s);
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Flushable) (obj5)));
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Closeable) (obj5)));
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Closeable) (obj)));
_L4:
        int i;
        i = 0;
        obj3 = httpurlconnection;
        flag3 = flag4;
        int j = httpurlconnection.getResponseCode();
        i = j;
_L7:
        Object obj1;
        if (i >= 200 && i <= 300)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            flag4 = flag;
        } else
        if (!flag)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag1;
        log.info((new StringBuilder("makePostRequest Value:")).append(flag).append(" responseCode: ").append(i).append(" success:").append(flag1).toString());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag1;
        autobuddypreferenceresult.setUpdated(true);
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag1;
        autobuddypreferenceresult.setOptionEnabled(flag4);
        if (!flag1)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        updateLocallyCachedAutoBuddy(flag);
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
            return autobuddypreferenceresult;
        }
          goto _L3
        obj2;
        obj5 = obj6;
        obj = obj4;
        obj4 = obj2;
_L9:
        obj2 = obj;
        obj3 = obj5;
        log.severe((new StringBuilder("makePostRequest unable to write to BufferedWriter: ")).append(((Exception) (obj4)).getMessage()).toString());
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Flushable) (obj5)));
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Closeable) (obj5)));
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Closeable) (obj)));
          goto _L4
_L6:
        log.severe((new StringBuilder("makePostRequest connection Exception: ")).append(((Exception) (obj)).getMessage()).toString());
        if (!flag2)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        updateLocallyCachedAutoBuddy(flag);
        if (obj2 == null) goto _L3; else goto _L5
_L5:
        ((HttpURLConnection) (obj2)).disconnect();
        return autobuddypreferenceresult;
        obj5;
        obj4 = obj3;
        obj = obj2;
_L8:
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Flushable) (obj4)));
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Closeable) (obj4)));
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpUtil.a(((java.io.Closeable) (obj)));
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        try
        {
            throw obj5;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj3 = obj2;
            flag3 = flag2;
        }
        finally
        {
            if (!flag3) goto _L0; else goto _L0
        }
          goto _L6
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateLocallyCachedAutoBuddy(flag);
        if (obj3 != null)
        {
            ((HttpURLConnection) (obj3)).disconnect();
        }
        throw obj1;
        obj1;
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        log.severe((new StringBuilder("makePostRequest response code EOFException: ")).append(((EOFException) (obj1)).getMessage()).toString());
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpurlconnection.disconnect();
          goto _L7
        obj1;
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        log.severe((new StringBuilder("makePostRequest response code Exception: ")).append(((Exception) (obj1)).getMessage()).toString());
        obj2 = httpurlconnection;
        flag2 = flag1;
        obj3 = httpurlconnection;
        flag3 = flag4;
        httpurlconnection.disconnect();
          goto _L7
        Exception exception;
        exception;
        obj4 = obj5;
        obj5 = exception;
          goto _L8
        obj4;
          goto _L9
    }

    private void queryAutoBuddyImmediately()
    {
        if (!TextUtils.isEmpty(token))
        {
            async.a(new Runnable() {

                final AutoBuddyManager this$0;

                public final void run()
                {
                    AutoBuddyPreferenceResult autobuddypreferenceresult = makeGetRequest();
                    updateLocallyCachedAutoBuddy(autobuddypreferenceresult);
                    eventBus.a(new OnAutoBuddyPreferenceResult(autobuddypreferenceresult));
                    contactsIngestManager.runNow();
                }

            
            {
                this$0 = AutoBuddyManager.this;
                super();
            }
            });
            return;
        } else
        {
            eventBus.a(new OnAutoBuddyPreferenceResult("AutoBuddy Get SkypeToken is empty"));
            return;
        }
    }

    private void updateLocallyCachedAutoBuddy(AutoBuddyPreferenceResult autobuddypreferenceresult)
    {
        updateLocallyCachedAutoBuddy(autobuddypreferenceresult.isOptionEnabled());
    }

    private void updateLocallyCachedAutoBuddy(boolean flag)
    {
        ((UserPreferences)userPrefsProvider.get()).setLocallyCachedAutoBuddy(flag);
    }

    public void onSkypeTokenRetrieved(String s)
    {
        token = s;
        if (queryIsWaitingForToken)
        {
            queryIsWaitingForToken = false;
            queryAutoBuddyImmediately();
        } else
        if (updateIsWaitingForToken != null)
        {
            updateAutoBuddy(updateIsWaitingForToken.booleanValue());
            return;
        }
    }

    public void queryAutoBuddy()
    {
        if (TextUtils.isEmpty(token))
        {
            queryIsWaitingForToken = true;
            requestSkypeToken();
            return;
        } else
        {
            queryAutoBuddyImmediately();
            return;
        }
    }

    public void requestSkypeToken()
    {
        skypeTokenAccess.requestSkypeToken(this);
    }

    public void sync(String s)
    {
        token = s;
        queryAutoBuddy();
    }

    public void updateAutoBuddy(final boolean enable)
    {
        if (!TextUtils.isEmpty(token))
        {
            updateIsWaitingForToken = null;
            async.a(new Runnable() {

                final AutoBuddyManager this$0;
                final boolean val$enable;

                public final void run()
                {
                    AutoBuddyPreferenceResult autobuddypreferenceresult = makePostRequest(enable);
                    eventBus.a(new OnAutoBuddyPreferenceResult(autobuddypreferenceresult));
                    contactsIngestManager.runNow();
                }

            
            {
                this$0 = AutoBuddyManager.this;
                enable = flag;
                super();
            }
            });
            return;
        } else
        {
            updateIsWaitingForToken = Boolean.valueOf(enable);
            requestSkypeToken();
            return;
        }
    }






}
