// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.responses;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.ServerLogger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.common.util.listRegistry.Helper;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.responses:
//            ResponseBase

public class Response
{
    public static final class ErrorType extends Enum
    {

        private static final ErrorType $VALUES[];
        public static final ErrorType API_ERROR;
        public static final ErrorType AUTHENTICATION_ERROR;
        public static final ErrorType BAD_REQUEST;
        public static final ErrorType CONNECTION_ERROR;
        public static final ErrorType HTTP_ERROR;
        public static final ErrorType NOT_FOUND;
        public static final ErrorType PARSE_ERROR;

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/kohls/mcommerce/opal/wallet/rest/responses/Response$ErrorType, s);
        }

        public static ErrorType[] values()
        {
            return (ErrorType[])$VALUES.clone();
        }

        static 
        {
            HTTP_ERROR = new ErrorType("HTTP_ERROR", 0);
            API_ERROR = new ErrorType("API_ERROR", 1);
            CONNECTION_ERROR = new ErrorType("CONNECTION_ERROR", 2);
            AUTHENTICATION_ERROR = new ErrorType("AUTHENTICATION_ERROR", 3);
            PARSE_ERROR = new ErrorType("PARSE_ERROR", 4);
            NOT_FOUND = new ErrorType("NOT_FOUND", 5);
            BAD_REQUEST = new ErrorType("BAD_REQUEST", 6);
            $VALUES = (new ErrorType[] {
                HTTP_ERROR, API_ERROR, CONNECTION_ERROR, AUTHENTICATION_ERROR, PARSE_ERROR, NOT_FOUND, BAD_REQUEST
            });
        }

        private ErrorType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status ERROR;
        public static final Status OK;
        public static final Status UNKNOWN;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/kohls/mcommerce/opal/wallet/rest/responses/Response$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            OK = new Status("OK", 0);
            ERROR = new Status("ERROR", 1);
            UNKNOWN = new Status("UNKNOWN", 2);
            $VALUES = (new Status[] {
                OK, ERROR, UNKNOWN
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    public Response()
    {
    }

    public static ResponseBase executeRequest(HttpUriRequest httpurirequest, Class class1, String as[])
    {
        Object obj;
        httpurirequest.setHeader("Content-Type", "application/json");
        httpurirequest.setHeader("Accept", "application/json");
        httpurirequest.setHeader("LastName", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref());
        httpurirequest.setHeader("FirstName", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
        httpurirequest.setHeader("Email", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        httpurirequest.setHeader("UserToken", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletHash());
        httpurirequest.setHeader("Timestamp", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getWalletTimestamp());
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().checkUserSessionValid())
        {
            String s = String.valueOf(System.currentTimeMillis());
            httpurirequest.setHeader("UserToken", UtilityMethods.getMD5HexString(UtilityMethods.getUserTokenString(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref().trim(), KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref().trim(), KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref(), s)));
            httpurirequest.setHeader("Timestamp", s);
        }
        obj = new BasicHttpParams();
        ((HttpParams) (obj)).setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 30000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 30000);
        obj = new DefaultHttpClient(((HttpParams) (obj)));
        if (as != null)
        {
            as = new UsernamePasswordCredentials(as[0], as[1]);
            AuthScope authscope = new AuthScope(null, -1);
            ((DefaultHttpClient) (obj)).getCredentialsProvider().setCredentials(authscope, as);
        }
        as = null;
        ResponseBase responsebase;
        try
        {
            obj = ((DefaultHttpClient) (obj)).execute(httpurirequest);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            obj = as;
            if (!(exception instanceof NoHttpResponseException))
            {
                obj = as;
                if (exception instanceof ConnectTimeoutException)
                {
                    obj = as;
                }
            }
        }
        as = null;
        responsebase = (ResponseBase)class1.newInstance();
        as = responsebase;
_L5:
        Object obj1;
        int i;
        if (obj == null)
        {
            as.setConnectionError();
            Log.e("Response null", httpurirequest.getURI().toString());
            ServerLogger.error("wallet_loyalty", UtilityMethods.getWalletHeaders(httpurirequest.getAllHeaders()), "Response is Null");
            return as;
        }
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (i == 405)
        {
            as.setConnectionError();
            ServerLogger.error("wallet_loyalty", UtilityMethods.getWalletHeaders(httpurirequest.getAllHeaders()), (new StringBuilder()).append("").append(i).toString());
            return as;
        }
        if (i == 401 || i == 403)
        {
            as.setAuthenticationError(((HttpResponse) (obj)));
            ServerLogger.error("wallet_loyalty", UtilityMethods.getWalletHeaders(httpurirequest.getAllHeaders()), (new StringBuilder()).append("").append(i).toString());
            return as;
        }
        if (i == 404)
        {
            ServerLogger.error("wallet_loyalty", UtilityMethods.getWalletHeaders(httpurirequest.getAllHeaders()), (new StringBuilder()).append("").append(i).toString());
            as.setHttpStatusCode(i);
            return as;
        }
        obj1 = as;
        Object obj2;
        if (((HttpResponse) (obj)).getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_805;
        }
        obj2 = ((HttpResponse) (obj)).getEntity().getContent();
        obj1 = as;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_805;
        }
        Gson gson;
        gson = (new GsonBuilder()).setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
        obj1 = new BufferedReader(new InputStreamReader(((InputStream) (obj2))));
        obj2 = new StringBuilder();
_L1:
        String s1 = ((BufferedReader) (obj1)).readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_637;
        }
        ((StringBuilder) (obj2)).append(s1);
          goto _L1
        httpurirequest;
        as.setJsonError(((HttpResponse) (obj)));
        return as;
        boolean flag;
        s1 = ((StringBuilder) (obj2)).toString();
        Log.e("", (new StringBuilder()).append("json: ").append(((StringBuilder) (obj2)).toString()).toString());
        flag = TextUtils.isEmpty(s1);
        obj1 = as;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_805;
        }
        int j;
        obj1 = new JSONObject(s1);
        j = Helper.getInt(((JSONObject) (obj1)), "errorCode", -1);
        obj1 = Helper.getString(((JSONObject) (obj1)), "message", null);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_789;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_789;
        }
        ServerLogger.error("wallet_loyalty", UtilityMethods.getWalletHeaders(httpurirequest.getAllHeaders()), (new StringBuilder()).append(j).append(File.separator).append(((String) (obj1))).toString());
        as.setHttpStatusCode(401);
        return as;
        httpurirequest;
        httpurirequest.printStackTrace();
        obj1 = (ResponseBase)gson.fromJson(((StringBuilder) (obj2)).toString(), class1);
_L3:
        if (obj1 != null)
        {
            ((ResponseBase) (obj1)).setHttpStatusCode(i);
        }
        return ((ResponseBase) (obj1));
        httpurirequest;
        httpurirequest.printStackTrace();
        obj1 = as;
        continue; /* Loop/switch isn't completed */
        httpurirequest;
        httpurirequest.printStackTrace();
        obj1 = as;
        continue; /* Loop/switch isn't completed */
        httpurirequest;
        httpurirequest.printStackTrace();
        obj1 = as;
        continue; /* Loop/switch isn't completed */
        httpurirequest;
        httpurirequest.printStackTrace();
        obj1 = as;
        if (true) goto _L3; else goto _L2
_L2:
        Exception exception1;
        exception1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static ResponseBase executeRequest1(HttpUriRequest httpurirequest, Class class1, String as[])
    {
        httpurirequest.setHeader("Content-Type", "application/json");
        httpurirequest.setHeader("Accept", "application/json");
        httpurirequest.setHeader("UserToken", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getUserAccessTokenFromPref());
        httpurirequest.setHeader("Timestamp", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSessionTimestamp());
        httpurirequest.setHeader("LastName", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUserLastnameFromPref());
        httpurirequest.setHeader("FirstName", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
        httpurirequest.setHeader("Email", KohlsPhoneApplication.getInstance().getAuthenticationUtils().getPreviousUserMailIdFromPref());
        Object obj = new BasicHttpParams();
        ((HttpParams) (obj)).setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 3000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 5000);
        obj = new DefaultHttpClient(((HttpParams) (obj)));
        if (as != null)
        {
            as = new UsernamePasswordCredentials(as[0], as[1]);
            AuthScope authscope = new AuthScope(null, -1);
            ((DefaultHttpClient) (obj)).getCredentialsProvider().setCredentials(authscope, as);
        }
        as = null;
        try
        {
            httpurirequest = ((DefaultHttpClient) (obj)).execute(httpurirequest);
        }
        catch (IOException ioexception)
        {
            httpurirequest = as;
            if (!(ioexception instanceof NoHttpResponseException))
            {
                httpurirequest = as;
                if (ioexception instanceof ConnectTimeoutException)
                {
                    httpurirequest = as;
                }
            }
        }
        as = null;
        int i;
        try
        {
            class1 = (ResponseBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1 = as;
        }
        if (httpurirequest == null)
        {
            class1.setConnectionError();
            return class1;
        }
        i = httpurirequest.getStatusLine().getStatusCode();
        try
        {
            Logger.error("", (new StringBuilder()).append("V is ").append(slurp(httpurirequest.getEntity().getContent(), 1024)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            httpurirequest.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            httpurirequest.printStackTrace();
        }
        class1.setHttpStatusCode(i);
        return class1;
    }

    public static String slurp(InputStream inputstream, int i)
    {
        StringBuilder stringbuilder;
        char ac[];
        ac = new char[i];
        stringbuilder = new StringBuilder();
        inputstream = new InputStreamReader(inputstream, "UTF-8");
_L1:
        i = inputstream.read(ac, 0, ac.length);
        if (i < 0)
        {
            Exception exception;
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
            return stringbuilder.toString();
        }
        stringbuilder.append(ac, 0, i);
          goto _L1
        exception;
        inputstream.close();
        throw exception;
    }
}
