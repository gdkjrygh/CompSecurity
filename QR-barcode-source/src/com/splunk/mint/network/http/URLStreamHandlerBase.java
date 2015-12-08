// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.http;

import com.splunk.mint.Logger;
import com.splunk.mint.network.util.ReflectionUtil;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public abstract class URLStreamHandlerBase extends URLStreamHandler
{

    public static final Class PROXY_FIELD_TYPES[];
    public static final Class SIMPLE_FIELD_TYPES[];
    private Constructor proxyConstructor;
    private Constructor simpleConstructor;

    public URLStreamHandlerBase(String as[])
        throws ClassNotFoundException
    {
        initConstructors(as);
        if (proxyConstructor == null || simpleConstructor == null)
        {
            throw new ClassNotFoundException("No implementation detected");
        } else
        {
            return;
        }
    }

    private void initConstructors(String as[])
    {
        int i;
        int j;
        j = as.length;
        i = 0;
_L2:
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        s = as[i];
        proxyConstructor = ReflectionUtil.findConstructor(s, PROXY_FIELD_TYPES);
        if (proxyConstructor == null);
        simpleConstructor = ReflectionUtil.findConstructor(s, SIMPLE_FIELD_TYPES);
        if (simpleConstructor == null);
        proxyConstructor.setAccessible(true);
        simpleConstructor.setAccessible(true);
        return;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        proxyConstructor = null;
        simpleConstructor = null;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract int getDefaultPort();

    public abstract String getProtocol();

    protected URLConnection openConnection(URL url)
        throws IOException
    {
        try
        {
            url = (URLConnection)simpleConstructor.newInstance(new Object[] {
                url, Integer.valueOf(getDefaultPort())
            });
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - can't instantiate object: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - can't access constructor: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - invalid argument: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - can't invoke target: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        return url;
    }

    protected URLConnection openConnection(URL url, Proxy proxy)
        throws IOException
    {
        if (proxy == null)
        {
            return openConnection(url);
        }
        try
        {
            url = (URLConnection)proxyConstructor.newInstance(new Object[] {
                url, Integer.valueOf(getDefaultPort()), proxy
            });
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - can't instantiate object: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - can't access constructor: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - invalid argument: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Logger.logError((new StringBuilder()).append("Error initializing connection - can't invoke target: ").append(url.getMessage()).toString());
            throw new IOException();
        }
        return url;
    }

    static 
    {
        SIMPLE_FIELD_TYPES = (new Class[] {
            java/net/URL, Integer.TYPE
        });
        PROXY_FIELD_TYPES = (new Class[] {
            java/net/URL, Integer.TYPE, java/net/Proxy
        });
    }
}
