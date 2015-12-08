// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import bolts.c;
import bolts.i;
import bolts.j;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookAppLinkResolver
{

    private static final String APP_LINK_ANDROID_TARGET_KEY = "android";
    private static final String APP_LINK_KEY = "app_links";
    private static final String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
    private static final String APP_LINK_TARGET_CLASS_KEY = "class";
    private static final String APP_LINK_TARGET_PACKAGE_KEY = "package";
    private static final String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
    private static final String APP_LINK_TARGET_URL_KEY = "url";
    private static final String APP_LINK_WEB_TARGET_KEY = "web";
    private final HashMap cachedAppLinks = new HashMap();

    public FacebookAppLinkResolver()
    {
    }

    private static bolts.c.a getAndroidTargetFromJson(JSONObject jsonobject)
    {
        Object obj = null;
        String s = tryGetStringFromJson(jsonobject, "package", null);
        if (s == null)
        {
            return null;
        }
        String s1 = tryGetStringFromJson(jsonobject, "class", null);
        String s2 = tryGetStringFromJson(jsonobject, "app_name", null);
        String s3 = tryGetStringFromJson(jsonobject, "url", null);
        jsonobject = obj;
        if (s3 != null)
        {
            jsonobject = Uri.parse(s3);
        }
        return new bolts.c.a(s, s1, jsonobject, s2);
    }

    private static Uri getWebFallbackUriFromJson(Uri uri, JSONObject jsonobject)
    {
        Object obj = null;
        jsonobject = jsonobject.getJSONObject("web");
        if (!tryGetBooleanFromJson(jsonobject, "should_fallback", true))
        {
            return null;
        }
        String s;
        try
        {
            s = tryGetStringFromJson(jsonobject, "url", null);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return uri;
        }
        jsonobject = obj;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        jsonobject = Uri.parse(s);
label0:
        {
            if (jsonobject != null)
            {
                return jsonobject;
            }
            break label0;
        }
    }

    private static boolean tryGetBooleanFromJson(JSONObject jsonobject, String s, boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = jsonobject.getBoolean(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return flag;
        }
        return flag1;
    }

    private static String tryGetStringFromJson(JSONObject jsonobject, String s, String s1)
    {
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return s1;
        }
        return jsonobject;
    }

    public j getAppLinkFromUrlInBackground(final Uri uri)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(uri);
        return getAppLinkFromUrlsInBackground(arraylist).c(new i() {

            final FacebookAppLinkResolver this$0;
            final Uri val$uri;

            public c then(j j1)
                throws Exception
            {
                return (c)((Map)j1.e()).get(uri);
            }

            public volatile Object then(j j1)
                throws Exception
            {
                return then(j1);
            }

            
            {
                this$0 = FacebookAppLinkResolver.this;
                uri = uri1;
                super();
            }
        });
    }

    public j getAppLinkFromUrlsInBackground(final List taskCompletionSource)
    {
        final HashSet urisToRequest;
        StringBuilder stringbuilder;
        appLinkResults = new HashMap();
        urisToRequest = new HashSet();
        stringbuilder = new StringBuilder();
        for (Iterator iterator = taskCompletionSource.iterator(); iterator.hasNext();)
        {
            Uri uri = (Uri)iterator.next();
            c c1;
            synchronized (cachedAppLinks)
            {
                c1 = (c)cachedAppLinks.get(uri);
            }
            if (c1 != null)
            {
                ((Map) (appLinkResults)).put(uri, c1);
            } else
            {
                if (!urisToRequest.isEmpty())
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(uri.toString());
                urisToRequest.add(uri);
            }
        }

        break MISSING_BLOCK_LABEL_138;
        appLinkResults;
        taskCompletionSource;
        JVM INSTR monitorexit ;
        throw appLinkResults;
        if (urisToRequest.isEmpty())
        {
            return j.a(appLinkResults);
        } else
        {
            taskCompletionSource = j.a();
            Bundle bundle = new Bundle();
            bundle.putString("ids", stringbuilder.toString());
            bundle.putString("fields", String.format("%s.fields(%s,%s)", new Object[] {
                "app_links", "android", "web"
            }));
            (new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, null, new com.facebook.GraphRequest.Callback() {

                final FacebookAppLinkResolver this$0;
                final Map val$appLinkResults;
                final bolts.j.a val$taskCompletionSource;
                final HashSet val$urisToRequest;

                public void onCompleted(GraphResponse graphresponse)
                {
                    Object obj;
                    obj = graphresponse.getError();
                    if (obj != null)
                    {
                        taskCompletionSource.b(((FacebookRequestError) (obj)).getException());
                        return;
                    }
                    graphresponse = graphresponse.getJSONObject();
                    if (graphresponse == null)
                    {
                        taskCompletionSource.b(appLinkResults);
                        return;
                    }
                    obj = urisToRequest.iterator();
_L2:
                    Uri uri1;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    uri1 = (Uri)((Iterator) (obj)).next();
                    if (!graphresponse.has(uri1.toString()))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    JSONObject jsonobject;
                    Object obj1;
                    ArrayList arraylist;
                    int k;
                    jsonobject = graphresponse.getJSONObject(uri1.toString()).getJSONObject("app_links");
                    obj1 = jsonobject.getJSONArray("android");
                    k = ((JSONArray) (obj1)).length();
                    arraylist = new ArrayList(k);
                    JSONException jsonexception;
                    bolts.c.a a;
                    for (int i = 0; i >= k; i++)
                    {
                        break MISSING_BLOCK_LABEL_162;
                    }

                    a = FacebookAppLinkResolver.getAndroidTargetFromJson(((JSONArray) (obj1)).getJSONObject(i));
                    if (a == null)
                    {
                        break MISSING_BLOCK_LABEL_247;
                    }
                    arraylist.add(a);
                    break MISSING_BLOCK_LABEL_247;
                    obj1 = new c(uri1, arraylist, FacebookAppLinkResolver.getWebFallbackUriFromJson(uri1, jsonobject));
                    appLinkResults.put(uri1, obj1);
                    synchronized (cachedAppLinks)
                    {
                        cachedAppLinks.put(uri1, obj1);
                    }
                    continue; /* Loop/switch isn't completed */
                    exception;
                    hashmap;
                    JVM INSTR monitorexit ;
                    try
                    {
                        throw exception;
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONException jsonexception) { }
                    if (true) goto _L2; else goto _L1
_L1:
                    taskCompletionSource.b(appLinkResults);
                    return;
                }

            
            {
                this$0 = FacebookAppLinkResolver.this;
                taskCompletionSource = a;
                appLinkResults = map;
                urisToRequest = hashset;
                super();
            }
            })).executeAsync();
            return taskCompletionSource.a();
        }
    }



}
