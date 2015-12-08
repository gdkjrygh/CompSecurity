// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.skype.android.app.token.TokenRequestCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.ExecutorAsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.util.Charsets;
import com.skype.android.util.HttpUtil;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            ProfileServiceTokenRequest, ProfileServiceToken

public class ShortCircuitProfileWebClient
{
    public static class AliasInfo extends JSONObject
        implements Serializable
    {

        private boolean isMsa()
        {
            return optString("Source").compareToIgnoreCase("Msa") == 0;
        }

        private boolean isVerified()
        {
            return optString("State").compareToIgnoreCase("Verified") == 0;
        }

        private void updateSearchableState(boolean flag)
        {
            try
            {
                put("Searchable", flag);
                return;
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
        }

        public String getAlias()
        {
            return optString("Name");
        }

        public String getCountry()
        {
            return optString("Country");
        }

        public boolean isSearchable()
        {
            return optBoolean("Searchable");
        }




        public AliasInfo(JSONObject jsonobject)
            throws JSONException
        {
            this(jsonobject, ShortCircuitProfileWebClient.JSON_ATTRIBUTES);
        }

        public AliasInfo(JSONObject jsonobject, String as[])
            throws JSONException
        {
            super(jsonobject, as);
        }
    }

    public static class OnGetVerifiedAliasesResult
    {

        private List verifiedAliases;

        public List getVerifiedAliases()
        {
            return verifiedAliases;
        }

        public OnGetVerifiedAliasesResult(List list)
        {
            verifiedAliases = list;
        }
    }

    public static class OnRemoveAlias
    {

        public OnRemoveAlias()
        {
        }
    }

    private abstract class a
        implements TokenRequestCallback, Runnable
    {

        private final String operationLogTag;
        final ShortCircuitProfileWebClient this$0;

        public void onTokenRetrieved(com.skype.android.app.token.AbstractTokenRequest.TokenAccount tokenaccount, String s)
        {
            if (s != null)
            {
                token = ProfileServiceTokenRequest.getProfileServiceToken(tokenaccount, s);
                async.a(this);
                return;
            } else
            {
                ShortCircuitProfileWebClient.log.severe(String.format("Operation %s did not complete successfully. Unable to retrieve Token", new Object[] {
                    operationLogTag
                }));
                return;
            }
        }

        protected a(String s)
        {
            this$0 = ShortCircuitProfileWebClient.this;
            super();
            operationLogTag = s;
        }
    }


    private static final String APPLICATION_ID = "D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A";
    private static final String COUNTRY_ATTRIBUTE = "Country";
    private static final String DELETE_ALIAS_LOG_TAG = "deletePhone(AliasInfo)";
    private static final String DELETE_PHONE_PAYLOAD_FORMAT = "{ \"Attributes\": [ { \"Name\":\"PersonalContactProfile.Phones\",\"Delete\": [ { \"Name\": \"%s\",\"Country\": \"%s\" } ] } ] }";
    private static final String EDIT_ALIAS_PAYLOAD_FORMAT = "{ \"Attributes\": [ { \"Name\":\"PersonalContactProfile.Phones\",\"Edit\": [ %s ] } ] }";
    private static final String GET_ALIASES_LOG_TAG = "getVerifiedAliases()";
    private static final String HEADER_APPLICATION_ID = "PS-ApplicationId";
    private static final String HEADER_CALLER_ENVIROMENT_ID = "X-CallerEnvironmentId";
    private static final String HEADER_REQUIRE_TYPE_HINT = "PS-RequireTypeHint";
    private static final String JSON_ATTRIBUTES[] = {
        "Country", "Name", "Searchable", "State", "Source"
    };
    private static final String NAME_ATTRIBUTE = "Name";
    private static final String PHONES_ATTRIBUTE = "PersonalContactProfile.Phones";
    private static final String PROFILE_PATH = "/profile/mine/System.ShortCircuitProfile.json";
    private static final String SEARCHABLE_ATTRIBUTE = "Searchable";
    private static final String SEPARATOR = ":";
    private static final String SOURCE_ATTRIBUTE = "Source";
    private static final String STATE_ATTRIBUTE = "State";
    private static final String UPDATE_ALIASES_LOG_TAG = "updateAliasSearchableState(AliasInfo, boolean)";
    private static final String URI_STRING_TEST = "https://directory.services.live-int.com";
    private static Logger log = Logger.getLogger("ShortCircuitProfileWebClient");
    private AsyncService async;
    private EcsConfiguration ecsConfiguration;
    private EventBus eventBus;
    private HttpUtil httpUtil;
    private ProfileServiceTokenRequest profileServiceTokenRequest;
    private volatile ProfileServiceToken token;

    public ShortCircuitProfileWebClient(ProfileServiceTokenRequest profileservicetokenrequest, HttpUtil httputil, EventBus eventbus, EcsConfiguration ecsconfiguration)
    {
        profileServiceTokenRequest = profileservicetokenrequest;
        ecsConfiguration = ecsconfiguration;
        async = new ExecutorAsyncService(Executors.newSingleThreadExecutor());
        httpUtil = httputil;
        eventBus = eventbus;
    }

    private JSONObject buildPayloadForDelete(AliasInfo aliasinfo)
        throws JSONException
    {
        return new JSONObject(String.format("{ \"Attributes\": [ { \"Name\":\"PersonalContactProfile.Phones\",\"Delete\": [ { \"Name\": \"%s\",\"Country\": \"%s\" } ] } ] }", new Object[] {
            aliasinfo.getAlias(), aliasinfo.getCountry()
        }));
    }

    private JSONObject buildPayloadForUpdate(AliasInfo aliasinfo)
        throws JSONException
    {
        return new JSONObject(String.format("{ \"Attributes\": [ { \"Name\":\"PersonalContactProfile.Phones\",\"Edit\": [ %s ] } ] }", new Object[] {
            aliasinfo.toString()
        }));
    }

    private void enqueueOperation(a a1)
    {
        if (token != null)
        {
            async.a(a1);
            return;
        } else
        {
            profileServiceTokenRequest.requestToken(a1);
            return;
        }
    }

    private HttpURLConnection getURLConnection()
    {
        Object obj = Uri.parse(ecsConfiguration.getAutoBuddyServerUrl()).buildUpon();
        ((android.net.Uri.Builder) (obj)).path("/profile/mine/System.ShortCircuitProfile.json");
        obj = httpUtil.a(((android.net.Uri.Builder) (obj)).toString());
        ((HttpURLConnection) (obj)).addRequestProperty("PS-ApplicationId", "D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A");
        ((HttpURLConnection) (obj)).addRequestProperty("PS-RequireTypeHint", "True");
        ((HttpURLConnection) (obj)).addRequestProperty("X-CallerEnvironmentId", "1");
        ((HttpURLConnection) (obj)).addRequestProperty(token.getTokenHeader(), token.getToken());
        return ((HttpURLConnection) (obj));
    }

    private boolean parseResponseIsFailure(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return true;
        }
        Object obj;
        try
        {
            s = (new JSONObject(s)).optJSONArray("Errors");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return true;
        }
        if (s == null)
        {
            return false;
        }
        obj = s.getJSONObject(0);
        s = ((JSONObject) (obj)).getString("HttpResult");
        obj = ((JSONObject) (obj)).getString("Message");
        log.info((new StringBuilder("HttpResult:")).append(s).append(":").append(((String) (obj))).toString());
        return true;
    }

    public void deletePhone(AliasInfo aliasinfo)
    {
        if (aliasinfo != null)
        {
            try
            {
                aliasinfo = new AliasInfo(aliasinfo);
            }
            // Misplaced declaration of an exception variable
            catch (AliasInfo aliasinfo)
            {
                aliasinfo.printStackTrace();
                return;
            }
            enqueueOperation(new a(new Handler()) {

                final ShortCircuitProfileWebClient this$0;
                final AliasInfo val$deleteItem;
                final Handler val$handler;

                public final void run()
                {
                    Object obj;
                    Object obj1;
                    HttpURLConnection httpurlconnection;
                    Object obj3;
                    obj1 = null;
                    obj3 = null;
                    httpurlconnection = getURLConnection();
                    obj = obj1;
                    httpurlconnection.setRequestMethod("POST");
                    obj = obj1;
                    JSONObject jsonobject = buildPayloadForDelete(deleteItem);
                    obj = obj1;
                    ShortCircuitProfileWebClient.log.info((new StringBuilder("Payload: ")).append(jsonobject.toString()).toString());
                    obj = obj1;
                    obj1 = new OutputStreamWriter(httpurlconnection.getOutputStream(), Charsets.a);
                    ((OutputStreamWriter) (obj1)).write(jsonobject.toString());
                    ((OutputStreamWriter) (obj1)).flush();
                    obj = httpUtil.c(httpurlconnection);
                    if (!parseResponseIsFailure(((String) (obj))))
                    {
                        handler.post(new Runnable() {

                            final _cls3 this$1;

                            public final void run()
                            {
                                deleteItem.updateSearchableState(false);
                                eventBus.a(new OnRemoveAlias());
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                    }
                    httpUtil.a(((java.io.Closeable) (obj1)));
                    return;
                    Object obj2;
                    obj2;
                    obj1 = obj3;
_L4:
                    obj = obj1;
                    ((Exception) (obj2)).printStackTrace();
                    httpUtil.a(((java.io.Closeable) (obj1)));
                    return;
                    obj1;
_L2:
                    httpUtil.a(((java.io.Closeable) (obj)));
                    throw obj1;
                    obj2;
                    obj = obj1;
                    obj1 = obj2;
                    if (true) goto _L2; else goto _L1
_L1:
                    obj2;
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                this$0 = ShortCircuitProfileWebClient.this;
                deleteItem = aliasinfo;
                handler = handler1;
                super(final_s);
            }
            });
        }
    }

    public void getVerifiedAliases()
    {
        enqueueOperation(new a("getVerifiedAliases()") {

            final ShortCircuitProfileWebClient this$0;

            public final void run()
            {
                Object obj;
                obj = getURLConnection();
                obj = httpUtil.c(((HttpURLConnection) (obj)));
                obj = parseVerifiedAliases(((String) (obj)));
                eventBus.a(new OnGetVerifiedAliasesResult(((List) (obj))));
                return;
                Object obj1;
                obj1;
                ((JSONException) (obj1)).printStackTrace();
                eventBus.a(new OnGetVerifiedAliasesResult(null));
                return;
                obj1;
                eventBus.a(new OnGetVerifiedAliasesResult(null));
                throw obj1;
            }

            
            {
                this$0 = ShortCircuitProfileWebClient.this;
                super(s);
            }
        });
    }

    public List parseVerifiedAliases(String s)
        throws JSONException
    {
        log.info((new StringBuilder("json : ")).append(s).toString());
        ArrayList arraylist = new ArrayList();
        s = (new JSONObject(s)).getJSONArray("Views").getJSONObject(0).getJSONArray("Attributes");
        if (s.length() > 0)
        {
            int i = 0;
            do
            {
                if (i >= s.length())
                {
                    break;
                }
                JSONObject jsonobject = s.getJSONObject(i);
                if (jsonobject.optString("Name").equals("PersonalContactProfile.Phones"))
                {
                    s = jsonobject.getJSONArray("Value");
                    for (i = 0; i < s.length(); i++)
                    {
                        AliasInfo aliasinfo = new AliasInfo(s.getJSONObject(i));
                        if (aliasinfo.isVerified() && !aliasinfo.isMsa())
                        {
                            arraylist.add(aliasinfo);
                        }
                    }

                    break;
                }
                i++;
            } while (true);
        }
        return arraylist;
    }

    public void updateAliasSearchableState(AliasInfo aliasinfo, boolean flag)
    {
        if (aliasinfo == null)
        {
            return;
        }
        try
        {
            aliasinfo = new AliasInfo(aliasinfo);
        }
        // Misplaced declaration of an exception variable
        catch (AliasInfo aliasinfo)
        {
            aliasinfo.printStackTrace();
            return;
        }
        aliasinfo.updateSearchableState(flag);
        aliasinfo.remove("Source");
        aliasinfo.remove("State");
        enqueueOperation(new a(aliasinfo) {

            final ShortCircuitProfileWebClient this$0;
            final AliasInfo val$updatedAlias;

            public final void run()
            {
                Object obj;
                Object obj1;
                HttpURLConnection httpurlconnection;
                Object obj3;
                obj1 = null;
                obj3 = null;
                httpurlconnection = getURLConnection();
                obj = obj1;
                httpurlconnection.setRequestMethod("POST");
                obj = obj1;
                JSONObject jsonobject = buildPayloadForUpdate(updatedAlias);
                obj = obj1;
                ShortCircuitProfileWebClient.log.info((new StringBuilder("Payload: ")).append(jsonobject.toString()).toString());
                obj = obj1;
                obj1 = new OutputStreamWriter(httpurlconnection.getOutputStream(), Charsets.a);
                ((OutputStreamWriter) (obj1)).write(jsonobject.toString());
                ((OutputStreamWriter) (obj1)).flush();
                obj = httpUtil.c(httpurlconnection);
                ShortCircuitProfileWebClient.log.info((new StringBuilder("Resp: ")).append(((String) (obj))).toString());
                httpUtil.a(((java.io.Closeable) (obj1)));
                return;
                Object obj2;
                obj2;
                obj1 = obj3;
_L4:
                obj = obj1;
                ((Exception) (obj2)).printStackTrace();
                httpUtil.a(((java.io.Closeable) (obj1)));
                return;
                obj1;
_L2:
                httpUtil.a(((java.io.Closeable) (obj)));
                throw obj1;
                obj2;
                obj = obj1;
                obj1 = obj2;
                if (true) goto _L2; else goto _L1
_L1:
                obj2;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = ShortCircuitProfileWebClient.this;
                updatedAlias = aliasinfo;
                super(final_s);
            }
        });
    }






/*
    static ProfileServiceToken access$1102(ShortCircuitProfileWebClient shortcircuitprofilewebclient, ProfileServiceToken profileservicetoken)
    {
        shortcircuitprofilewebclient.token = profileservicetoken;
        return profileservicetoken;
    }

*/






}
