// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.util.Hashtable;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkView;

// Referenced classes of package org.apache.cordova:
//            CordovaUriHelper, AuthenticationToken, LOG, CordovaWebView, 
//            CordovaInterface

public class CordovaWebViewClient extends XWalkResourceClient
{

    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_OK = 0;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    private static final String TAG = "CordovaWebViewClient";
    CordovaWebView appView;
    private Hashtable authenticationTokens;
    CordovaInterface cordova;
    CordovaUriHelper helper;

    public CordovaWebViewClient(CordovaInterface cordovainterface)
    {
        super(null);
        authenticationTokens = new Hashtable();
        cordova = cordovainterface;
    }

    public CordovaWebViewClient(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super(cordovawebview);
        authenticationTokens = new Hashtable();
        cordova = cordovainterface;
        appView = cordovawebview;
        helper = new CordovaUriHelper(cordovainterface, cordovawebview);
    }

    public void clearAuthenticationTokens()
    {
        authenticationTokens.clear();
    }

    public AuthenticationToken getAuthenticationToken(String s, String s1)
    {
        AuthenticationToken authenticationtoken = (AuthenticationToken)authenticationTokens.get(s.concat(s1));
        Object obj = authenticationtoken;
        if (authenticationtoken == null)
        {
            obj = (AuthenticationToken)authenticationTokens.get(s);
            s = ((String) (obj));
            if (obj == null)
            {
                s = (AuthenticationToken)authenticationTokens.get(s1);
            }
            obj = s;
            if (s == null)
            {
                obj = (AuthenticationToken)authenticationTokens.get("");
            }
        }
        return ((AuthenticationToken) (obj));
    }

    public void onReceivedLoadError(XWalkView xwalkview, int i, String s, String s1)
    {
        LOG.d("CordovaWebViewClient", "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s", new Object[] {
            Integer.valueOf(i), s, s1
        });
        xwalkview = appView;
        xwalkview.loadUrlTimeout = ((CordovaWebView) (xwalkview)).loadUrlTimeout + 1;
        xwalkview = new JSONObject();
        try
        {
            xwalkview.put("errorCode", i);
            xwalkview.put("description", s);
            xwalkview.put("url", s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        appView.postMessage("onReceivedError", xwalkview);
    }

    public AuthenticationToken removeAuthenticationToken(String s, String s1)
    {
        return (AuthenticationToken)authenticationTokens.remove(s.concat(s1));
    }

    public void setAuthenticationToken(AuthenticationToken authenticationtoken, String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        authenticationTokens.put(s2.concat(s), authenticationtoken);
    }

    public void setWebView(CordovaWebView cordovawebview)
    {
        appView = cordovawebview;
        helper = new CordovaUriHelper(cordova, cordovawebview);
    }

    public boolean shouldOverrideUrlLoading(XWalkView xwalkview, String s)
    {
        return helper.shouldOverrideUrlLoading(xwalkview, s);
    }
}
