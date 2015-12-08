// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package twitter4j.internal.http:
//            HttpClientConfiguration, HttpClient

public final class HttpClientFactory
{

    private static final Constructor HTTP_CLIENT_CONSTRUCTOR;
    private static final String HTTP_CLIENT_IMPLEMENTATION = "twitter4j.http.httpClient";

    public HttpClientFactory()
    {
    }

    public static HttpClient getInstance(HttpClientConfiguration httpclientconfiguration)
    {
        try
        {
            httpclientconfiguration = (HttpClient)HTTP_CLIENT_CONSTRUCTOR.newInstance(new Object[] {
                httpclientconfiguration
            });
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
        return httpclientconfiguration;
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
                obj1 = Class.forName("twitter4j.internal.http.alternative.HttpClientImpl");
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
                obj = Class.forName("twitter4j.internal.http.HttpClientImpl");
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
                twitter4j/internal/http/HttpClientConfiguration
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
    }
}
