// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;

import com.google.gson.Gson;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.security.Security;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Referenced classes of package com.stripe.net:
//            StripeResponseGetter, RequestOptions, StripeResponse, APIResource, 
//            MultipartProcessor

public class LiveStripeResponseGetter
    implements StripeResponseGetter
{

    private static final String CUSTOM_URL_STREAM_HANDLER_PROPERTY_NAME = "com.stripe.net.customURLStreamHandler";
    private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";

    public LiveStripeResponseGetter()
    {
    }

    private static Object _request(APIResource.RequestMethod requestmethod, String s, Map map, Class class1, APIResource.RequestType requesttype, RequestOptions requestoptions)
    {
        RequestOptions requestoptions1;
        Boolean boolean1;
        requestoptions1 = requestoptions;
        if (requestoptions == null)
        {
            requestoptions1 = RequestOptions.getDefault();
        }
        requestoptions = null;
        boolean1 = Boolean.valueOf(true);
        Object obj = Security.getProperty("networkaddress.cache.ttl");
        requestoptions = ((RequestOptions) (obj));
        Security.setProperty("networkaddress.cache.ttl", "0");
        requestoptions = ((RequestOptions) (obj));
        obj = boolean1;
_L2:
        String s1 = requestoptions1.getApiKey();
        if (s1 == null || s1.trim().isEmpty())
        {
            throw new AuthenticationException("No API key provided. (HINT: set your API key using 'Stripe.apiKey = <API-KEY>'. You can generate API keys from the Stripe web interface. See https://stripe.com/api for details or email support@stripe.com if you have questions.");
        }
        break; /* Loop/switch isn't completed */
        obj;
        obj = Boolean.valueOf(false);
        if (true) goto _L2; else goto _L1
_L1:
        class _cls1
        {

            static final int $SwitchMap$com$stripe$net$APIResource$RequestMethod[];
            static final int $SwitchMap$com$stripe$net$APIResource$RequestType[];

            static 
            {
                $SwitchMap$com$stripe$net$APIResource$RequestType = new int[APIResource.RequestType.values().length];
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestType[APIResource.RequestType.NORMAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestType[APIResource.RequestType.MULTIPART.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$stripe$net$APIResource$RequestMethod = new int[APIResource.RequestMethod.values().length];
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestMethod[APIResource.RequestMethod.GET.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestMethod[APIResource.RequestMethod.POST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$stripe$net$APIResource$RequestMethod[APIResource.RequestMethod.DELETE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.stripe.net.APIResource.RequestType[requesttype.ordinal()])
        {
        default:
            throw new RuntimeException("Invalid APIResource request type. This indicates a bug in the Stripe bindings. Please contact support@stripe.com for assistance.");

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_230;

        case 1: // '\001'
            break;
        }
        break MISSING_BLOCK_LABEL_157;
        requestmethod;
        int i;
        if (((Boolean) (obj)).booleanValue())
        {
            if (requestoptions == null)
            {
                Security.setProperty("networkaddress.cache.ttl", "-1");
            } else
            {
                Security.setProperty("networkaddress.cache.ttl", requestoptions);
            }
        }
        throw requestmethod;
        requestmethod = getStripeResponse(requestmethod, s, map, requestoptions1);
_L3:
        i = ((StripeResponse) (requestmethod)).responseCode;
        requestmethod = ((StripeResponse) (requestmethod)).responseBody;
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        handleAPIError(requestmethod, i);
        requestmethod = ((APIResource.RequestMethod) (APIResource.GSON.a(requestmethod, class1)));
        if (((Boolean) (obj)).booleanValue())
        {
            if (requestoptions != null)
            {
                break MISSING_BLOCK_LABEL_242;
            }
            Security.setProperty("networkaddress.cache.ttl", "-1");
        }
        return requestmethod;
        requestmethod = getMultipartStripeResponse(requestmethod, s, map, requestoptions1);
          goto _L3
        Security.setProperty("networkaddress.cache.ttl", requestoptions);
        return requestmethod;
    }

    private static HttpURLConnection createDeleteConnection(String s, String s1, RequestOptions requestoptions)
    {
        s = createStripeConnection(formatURL(s, s1), requestoptions);
        s.setRequestMethod("DELETE");
        return s;
    }

    private static HttpURLConnection createGetConnection(String s, String s1, RequestOptions requestoptions)
    {
        s = createStripeConnection(formatURL(s, s1), requestoptions);
        s.setRequestMethod("GET");
        return s;
    }

    private static HttpURLConnection createPostConnection(String s, String s1, RequestOptions requestoptions)
    {
        HttpURLConnection httpurlconnection;
        httpurlconnection = createStripeConnection(s, requestoptions);
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setRequestMethod("POST");
        httpurlconnection.setRequestProperty("Content-Type", String.format("application/x-www-form-urlencoded;charset=%s", new Object[] {
            "UTF-8"
        }));
        s = null;
        requestoptions = httpurlconnection.getOutputStream();
        s = requestoptions;
        requestoptions.write(s1.getBytes("UTF-8"));
        if (requestoptions != null)
        {
            requestoptions.close();
        }
        return httpurlconnection;
        s1;
        if (s != null)
        {
            s.close();
        }
        throw s1;
    }

    static String createQuery(Map map)
    {
        Object obj = flattenParams(map);
        map = new StringBuilder();
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); map.append(urlEncodePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (map.length() > 0)
            {
                map.append("&");
            }
        }

        return map.toString();
    }

    private static HttpURLConnection createStripeConnection(String s, RequestOptions requestoptions)
    {
        String s1 = System.getProperty("com.stripe.net.customURLStreamHandler", null);
        if (s1 != null)
        {
            try
            {
                s = new URL(null, s, (URLStreamHandler)Class.forName(s1).getConstructor(new Class[0]).newInstance(new Object[0]));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IOException(s);
            }
        } else
        {
            s = new URL(s);
        }
        s = (HttpURLConnection)s.openConnection();
        s.setConnectTimeout(30000);
        s.setReadTimeout(0x13880);
        s.setUseCaches(false);
        java.util.Map.Entry entry;
        for (requestoptions = getHeaders(requestoptions).entrySet().iterator(); requestoptions.hasNext(); s.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)requestoptions.next();
        }

        return s;
    }

    private static Map flattenParams(Map map)
    {
        if (map == null)
        {
            return new HashMap();
        }
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            String s = (String)entry.getKey();
            Object obj = entry.getValue();
            if (obj instanceof Map)
            {
                LinkedHashMap linkedhashmap1 = new LinkedHashMap();
                java.util.Map.Entry entry1;
                for (obj = ((Map)obj).entrySet().iterator(); ((Iterator) (obj)).hasNext(); linkedhashmap1.put(String.format("%s[%s]", new Object[] {
    s, entry1.getKey()
}), entry1.getValue()))
                {
                    entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                }

                linkedhashmap.putAll(flattenParams(((Map) (linkedhashmap1))));
            } else
            if (obj instanceof List)
            {
                LinkedHashMap linkedhashmap2 = new LinkedHashMap();
                obj = ((List)obj).iterator();
                for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
                {
                    linkedhashmap2.put(String.format("%s[%s]", new Object[] {
                        s, Integer.valueOf(i)
                    }), ((Iterator) (obj)).next());
                }

                linkedhashmap.putAll(flattenParams(((Map) (linkedhashmap2))));
            } else
            {
                if ("".equals(obj))
                {
                    throw new InvalidRequestException((new StringBuilder()).append("You cannot set '").append(s).append("' to an empty string. ").append("We interpret empty strings as null in requests. ").append("You may set '").append(s).append("' to null to delete the property.").toString(), s, null);
                }
                if (obj == null)
                {
                    linkedhashmap.put(s, "");
                } else
                {
                    linkedhashmap.put(s, obj.toString());
                }
            }
        }

        return linkedhashmap;
    }

    private static String formatURL(String s, String s1)
    {
        if (s1 == null || s1.isEmpty())
        {
            return s;
        }
        String s2;
        if (s.contains("?"))
        {
            s2 = "&";
        } else
        {
            s2 = "?";
        }
        return String.format("%s%s%s", new Object[] {
            s, s2, s1
        });
    }

    static Map getHeaders(RequestOptions requestoptions)
    {
        int i = 0;
        HashMap hashmap = new HashMap();
        String s = requestoptions.getStripeVersion();
        hashmap.put("Accept-Charset", "UTF-8");
        hashmap.put("Accept", "application/json");
        hashmap.put("User-Agent", String.format("Stripe/v1 JavaBindings/%s", new Object[] {
            "1.31.0"
        }));
        hashmap.put("Authorization", String.format("Bearer %s", new Object[] {
            requestoptions.getApiKey()
        }));
        String as[] = new String[7];
        as[0] = "os.name";
        as[1] = "os.version";
        as[2] = "os.arch";
        as[3] = "java.version";
        as[4] = "java.vendor";
        as[5] = "java.vm.version";
        as[6] = "java.vm.vendor";
        HashMap hashmap1 = new HashMap();
        for (int j = as.length; i < j; i++)
        {
            String s1 = as[i];
            hashmap1.put(s1, System.getProperty(s1));
        }

        hashmap1.put("bindings.version", "1.31.0");
        hashmap1.put("lang", "Java");
        hashmap1.put("publisher", "Stripe");
        hashmap.put("X-Stripe-Client-User-Agent", APIResource.GSON.a(hashmap1));
        if (s != null)
        {
            hashmap.put("Stripe-Version", s);
        }
        if (requestoptions.getIdempotencyKey() != null)
        {
            hashmap.put("Idempotency-Key", requestoptions.getIdempotencyKey());
        }
        if (requestoptions.getStripeAccount() != null)
        {
            hashmap.put("Stripe-Account", requestoptions.getStripeAccount());
        }
        return hashmap;
    }

    private static StripeResponse getMultipartStripeResponse(APIResource.RequestMethod requestmethod, String s, Map map, RequestOptions requestoptions)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (requestmethod != APIResource.RequestMethod.POST)
        {
            throw new InvalidRequestException("Multipart requests for HTTP methods other than POST are currently not supported.", null, null);
        }
        requestmethod = createStripeConnection(s, requestoptions);
        s = MultipartProcessor.getBoundary();
        requestmethod.setDoOutput(true);
        requestmethod.setRequestMethod("POST");
        requestmethod.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", new Object[] {
            s
        }));
        s = new MultipartProcessor(requestmethod, s, "UTF-8");
        map = map.entrySet().iterator();
_L6:
        if (!map.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (java.util.Map.Entry)map.next();
        requestoptions = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = ((java.util.Map.Entry) (obj)).getValue();
        if (!(obj instanceof File)) goto _L4; else goto _L3
_L3:
        obj = (File)obj;
        if (!((File) (obj)).exists())
        {
            throw new InvalidRequestException((new StringBuilder()).append("File for key ").append(requestoptions).append(" must exist.").toString(), null, null);
        }
          goto _L5
        requestoptions;
        map = s;
        s = requestoptions;
_L10:
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        map.finish();
        throw s;
        s;
_L9:
        throw new APIConnectionException(String.format("IOException during API request to Stripe (%s): %s Please check your internet connection and try again. If this problem persists,you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", new Object[] {
            Stripe.getApiBase(), s.getMessage()
        }), s);
        s;
_L8:
        if (requestmethod != null)
        {
            requestmethod.disconnect();
        }
        throw s;
_L5:
        if (!((File) (obj)).isFile())
        {
            throw new InvalidRequestException((new StringBuilder()).append("File for key ").append(requestoptions).append(" must be a file and not a directory.").toString(), null, null);
        }
        if (!((File) (obj)).canRead())
        {
            throw new InvalidRequestException((new StringBuilder()).append("Must have read permissions on file for key ").append(requestoptions).append(".").toString(), null, null);
        }
        s.addFileField(requestoptions, ((File) (obj)));
          goto _L6
_L4:
        s.addFormField(requestoptions, (String)obj);
          goto _L6
_L2:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        s.finish();
        int i = requestmethod.getResponseCode();
        if (i < 200 || i >= 300)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        s = getResponseBody(requestmethod.getInputStream());
_L7:
        s = new StripeResponse(i, s, requestmethod.getHeaderFields());
        if (requestmethod != null)
        {
            requestmethod.disconnect();
        }
        return s;
        s = getResponseBody(requestmethod.getErrorStream());
          goto _L7
        s;
        requestmethod = null;
          goto _L8
        s;
          goto _L8
        s;
        requestmethod = obj1;
          goto _L9
        s;
        map = ((Map) (obj));
          goto _L10
    }

    private static String getResponseBody(InputStream inputstream)
    {
        String s = (new Scanner(inputstream, "UTF-8")).useDelimiter("\\A").next();
        inputstream.close();
        return s;
    }

    private static StripeResponse getStripeResponse(APIResource.RequestMethod requestmethod, String s, Map map, RequestOptions requestoptions)
    {
        StripeResponse striperesponse;
        try
        {
            map = createQuery(map);
        }
        // Misplaced declaration of an exception variable
        catch (APIResource.RequestMethod requestmethod)
        {
            throw new InvalidRequestException("Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance.", null, requestmethod);
        }
        try
        {
            striperesponse = makeURLConnectionRequest(requestmethod, s, map, requestoptions);
        }
        catch (ClassCastException classcastexception)
        {
            if (System.getProperty("com.google.appengine.runtime.environment", null) != null)
            {
                return makeAppEngineRequest(requestmethod, s, map, requestoptions);
            } else
            {
                throw classcastexception;
            }
        }
        return striperesponse;
    }

    private static void handleAPIError(String s, int i)
    {
        s = ((ErrorContainer)APIResource.GSON.a(s, com/stripe/net/LiveStripeResponseGetter$ErrorContainer)).error;
        switch (i)
        {
        case 403: 
        default:
            throw new APIException(((Error) (s)).message, null);

        case 400: 
            throw new InvalidRequestException(((Error) (s)).message, ((Error) (s)).param, null);

        case 404: 
            throw new InvalidRequestException(((Error) (s)).message, ((Error) (s)).param, null);

        case 401: 
            throw new AuthenticationException(((Error) (s)).message);

        case 402: 
            throw new CardException(((Error) (s)).message, ((Error) (s)).code, ((Error) (s)).param, ((Error) (s)).decline_code, ((Error) (s)).charge, null);
        }
    }

    private static StripeResponse makeAppEngineRequest(APIResource.RequestMethod requestmethod, String s, String s1, RequestOptions requestoptions)
    {
        if (requestmethod == APIResource.RequestMethod.GET)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        Object obj = s;
        if (requestmethod != APIResource.RequestMethod.DELETE)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        obj = String.format("%s?%s", new Object[] {
            s, s1
        });
        URL url;
        Class class1;
        Object obj1;
        url = new URL(((String) (obj)));
        class1 = Class.forName("com.google.appengine.api.urlfetch.HTTPMethod");
        obj1 = class1.getDeclaredField(requestmethod.name()).get(null);
        obj = Class.forName("com.google.appengine.api.urlfetch.FetchOptions$Builder");
        s = ((String) (((Class) (obj)).getDeclaredMethod("validateCertificate", new Class[0]).invoke(null, new Object[0])));
_L1:
        try
        {
            Class class2 = Class.forName("com.google.appengine.api.urlfetch.FetchOptions");
            class2.getDeclaredMethod("setDeadline", new Class[] {
                java/lang/Double
            }).invoke(s, new Object[] {
                new Double(55D)
            });
            obj = Class.forName("com.google.appengine.api.urlfetch.HTTPRequest");
            s = ((String) (((Class) (obj)).getDeclaredConstructor(new Class[] {
                java/net/URL, class1, class2
            }).newInstance(new Object[] {
                url, obj1, s
            })));
            if (requestmethod == APIResource.RequestMethod.POST)
            {
                ((Class) (obj)).getDeclaredMethod("setPayload", new Class[] {
                    [B
                }).invoke(s, new Object[] {
                    s1.getBytes()
                });
            }
            for (requestmethod = getHeaders(requestoptions).entrySet().iterator(); requestmethod.hasNext(); ((Class) (obj)).getDeclaredMethod("setHeader", new Class[] {
    s1
}).invoke(s, new Object[] {
    requestoptions
}))
            {
                requestoptions = (java.util.Map.Entry)requestmethod.next();
                s1 = Class.forName("com.google.appengine.api.urlfetch.HTTPHeader");
                requestoptions = ((RequestOptions) (s1.getDeclaredConstructor(new Class[] {
                    java/lang/String, java/lang/String
                }).newInstance(new Object[] {
                    requestoptions.getKey(), requestoptions.getValue()
                })));
            }

        }
        // Misplaced declaration of an exception variable
        catch (APIResource.RequestMethod requestmethod)
        {
            throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        }
        break MISSING_BLOCK_LABEL_407;
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        s;
        System.err.println("Warning: this App Engine SDK version does not allow verification of SSL certificates;this exposes you to a MITM attack. Please upgrade your App Engine SDK to >=1.5.0. If you have questions, contact support@stripe.com.");
        s = ((String) (((Class) (obj)).getDeclaredMethod("withDefaults", new Class[0]).invoke(null, new Object[0])));
          goto _L1
        requestmethod = ((APIResource.RequestMethod) (Class.forName("com.google.appengine.api.urlfetch.URLFetchServiceFactory").getDeclaredMethod("getURLFetchService", new Class[0]).invoke(null, new Object[0])));
        s1 = requestmethod.getClass().getDeclaredMethod("fetch", new Class[] {
            obj
        });
        s1.setAccessible(true);
        requestmethod = ((APIResource.RequestMethod) (s1.invoke(requestmethod, new Object[] {
            s
        })));
        requestmethod = new StripeResponse(((Integer)requestmethod.getClass().getDeclaredMethod("getResponseCode", new Class[0]).invoke(requestmethod, new Object[0])).intValue(), new String((byte[])(byte[])requestmethod.getClass().getDeclaredMethod("getContent", new Class[0]).invoke(requestmethod, new Object[0]), "UTF-8"));
        return requestmethod;
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
        requestmethod;
        throw new APIException("Sorry, an unknown error occurred while trying to use the Google App Engine runtime. Please contact support@stripe.com for assistance.", requestmethod);
    }

    private static StripeResponse makeURLConnectionRequest(APIResource.RequestMethod requestmethod, String s, String s1, RequestOptions requestoptions)
    {
        APIResource.RequestMethod requestmethod1;
        APIResource.RequestMethod requestmethod2;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        requestmethod2 = obj;
        requestmethod1 = obj1;
        _cls1..SwitchMap.com.stripe.net.APIResource.RequestMethod[requestmethod.ordinal()];
        JVM INSTR tableswitch 1 3: default 269
    //                   1 128
    //                   2 216
    //                   3 234;
           goto _L1 _L2 _L3 _L4
_L1:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        try
        {
            throw new APIConnectionException(String.format("Unrecognized HTTP method %s. This indicates a bug in the Stripe bindings. Please contact support@stripe.com for assistance.", new Object[] {
                requestmethod
            }));
        }
        // Misplaced declaration of an exception variable
        catch (APIResource.RequestMethod requestmethod)
        {
            requestmethod1 = requestmethod2;
        }
        finally
        {
            if (requestmethod1 == null) goto _L0; else goto _L0
        }
        throw new APIConnectionException(String.format("IOException during API request to Stripe (%s): %s Please check your internet connection and try again. If this problem persists,you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", new Object[] {
            Stripe.getApiBase(), requestmethod.getMessage()
        }), requestmethod);
        requestmethod1.disconnect();
        throw requestmethod;
_L2:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        requestmethod = createGetConnection(s, s1, requestoptions);
_L7:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        int i = requestmethod.getResponseCode();
        if (i < 200 || i >= 300) goto _L6; else goto _L5
_L5:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        s = getResponseBody(requestmethod.getInputStream());
_L8:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        s = new StripeResponse(i, s, requestmethod.getHeaderFields());
        if (requestmethod != null)
        {
            requestmethod.disconnect();
        }
        return s;
_L3:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        requestmethod = createPostConnection(s, s1, requestoptions);
          goto _L7
_L4:
        requestmethod2 = obj;
        requestmethod1 = obj1;
        requestmethod = createDeleteConnection(s, s1, requestoptions);
          goto _L7
_L6:
        requestmethod2 = requestmethod;
        requestmethod1 = requestmethod;
        s = getResponseBody(requestmethod.getErrorStream());
          goto _L8
    }

    private static String urlEncodePair(String s, String s1)
    {
        return String.format("%s=%s", new Object[] {
            APIResource.urlEncode(s), APIResource.urlEncode(s1)
        });
    }

    public Object request(APIResource.RequestMethod requestmethod, String s, Map map, Class class1, APIResource.RequestType requesttype, RequestOptions requestoptions)
    {
        return _request(requestmethod, s, map, class1, requesttype, requestoptions);
    }

    private class ErrorContainer
    {

        private Error error;


        private ErrorContainer()
        {
        }
    }


    private class Error
    {

        String charge;
        String code;
        String decline_code;
        String message;
        String param;
        String type;

        private Error()
        {
        }
    }

}
