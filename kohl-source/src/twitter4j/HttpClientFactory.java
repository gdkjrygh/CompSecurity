// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j:
//            HttpClientConfiguration, HttpClient

public final class HttpClientFactory
{

    private static final Constructor HTTP_CLIENT_CONSTRUCTOR;
    private static final String HTTP_CLIENT_IMPLEMENTATION = "twitter4j.http.httpClient";
    private static final HashMap confClientMap = new HashMap();

    public HttpClientFactory()
    {
    }

    public static HttpClient getInstance()
    {
        return getInstance(ConfigurationContext.getInstance().getHttpClientConfiguration());
    }

    public static HttpClient getInstance(HttpClientConfiguration httpclientconfiguration)
    {
        HttpClient httpclient1 = (HttpClient)confClientMap.get(httpclientconfiguration);
        HttpClient httpclient = httpclient1;
        if (httpclient1 == null)
        {
            try
            {
                httpclient = (HttpClient)HTTP_CLIENT_CONSTRUCTOR.newInstance(new Object[] {
                    httpclientconfiguration
                });
                confClientMap.put(httpclientconfiguration, httpclient);
            }
            // Misplaced declaration of an exception variable
            catch (HttpClientConfiguration httpclientconfiguration)
            {
                throw new AssertionError(httpclientconfiguration);
            }
            // Misplaced declaration of an exception variable
            catch (HttpClientConfiguration httpclientconfiguration)
            {
                throw new AssertionError(httpclientconfiguration);
            }
            // Misplaced declaration of an exception variable
            catch (HttpClientConfiguration httpclientconfiguration)
            {
                throw new AssertionError(httpclientconfiguration);
            }
        }
        return httpclient;
    }

    static 
    {
        Object obj1 = null;
        String s = System.getProperty("twitter4j.http.httpClient");
        Object obj = obj1;
        if (s != null)
        {
            try
            {
                obj = Class.forName(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = Class.forName("twitter4j.AlternativeHttpClientImpl");
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                classnotfoundexception = ((ClassNotFoundException) (obj));
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            try
            {
                obj = Class.forName("twitter4j.HttpClientImpl");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new AssertionError(obj);
            }
        }
        try
        {
            HTTP_CLIENT_CONSTRUCTOR = ((Class) (obj)).getConstructor(new Class[] {
                twitter4j/HttpClientConfiguration
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }
}
