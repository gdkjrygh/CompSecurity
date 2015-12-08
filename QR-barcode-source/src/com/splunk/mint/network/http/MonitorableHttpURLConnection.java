// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.http;

import com.splunk.mint.Properties;
import com.splunk.mint.network.MonitorRegistry;
import com.splunk.mint.network.NetLogManager;
import com.splunk.mint.network.Timer;
import com.splunk.mint.network.io.InputStreamMonitor;
import com.splunk.mint.network.io.InputStreamMonitorKitKat;
import com.splunk.mint.network.io.OutputStreamMonitor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.Map;

public final class MonitorableHttpURLConnection extends HttpURLConnection
{

    private final String connectionName;
    private InputStreamMonitor mInputStreamMonitor;
    private InputStreamMonitorKitKat mInputStreamMonitorKitKat;
    private OutputStreamMonitor mOutputStreamMonitor;
    private URLConnection original;
    private final MonitorRegistry registry;
    private final Timer timer;

    public MonitorableHttpURLConnection(MonitorRegistry monitorregistry, URLConnection urlconnection)
    {
        super(urlconnection.getURL());
        mInputStreamMonitor = null;
        mOutputStreamMonitor = null;
        mInputStreamMonitorKitKat = null;
        registry = monitorregistry;
        original = urlconnection;
        connectionName = url.toString();
        timer = new Timer(connectionName);
        NetLogManager.getInstance().startNetworkCall(urlconnection.getURL().toExternalForm(), urlconnection.getURL().toExternalForm(), System.currentTimeMillis(), "HTTP");
    }

    public void addRequestProperty(String s, String s1)
    {
        original.addRequestProperty(s, s1);
    }

    public void connect()
        throws IOException
    {
        try
        {
            timer.start();
            original.connect();
            return;
        }
        catch (IOException ioexception)
        {
            NetLogManager.getInstance().cancelNetworkCall(registry, url.toExternalForm(), System.currentTimeMillis(), "HTTP", ioexception.getMessage());
            throw ioexception;
        }
    }

    public void disconnect()
    {
        int i = NetLogManager.getStatusCodeFromURLConnection(original);
        NetLogManager.getInstance().endNetworkCall(registry, url.toExternalForm(), System.currentTimeMillis(), original.getHeaderFields(), i);
        if (original instanceof HttpURLConnection)
        {
            ((HttpURLConnection)original).disconnect();
        }
    }

    public boolean getAllowUserInteraction()
    {
        return original.getAllowUserInteraction();
    }

    public int getConnectTimeout()
    {
        return original.getConnectTimeout();
    }

    public Object getContent()
        throws IOException
    {
        Object obj;
        try
        {
            obj = original.getContent();
        }
        catch (IOException ioexception)
        {
            NetLogManager.getInstance().cancelNetworkCall(registry, url.toExternalForm(), System.currentTimeMillis(), "HTTP", ioexception.getMessage());
            throw ioexception;
        }
        return obj;
    }

    public Object getContent(Class aclass[])
        throws IOException
    {
        try
        {
            aclass = ((Class []) (original.getContent(aclass)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            NetLogManager.getInstance().cancelNetworkCall(registry, url.toExternalForm(), System.currentTimeMillis(), "HTTP", aclass.getMessage());
            throw aclass;
        }
        return aclass;
    }

    public String getContentEncoding()
    {
        return original.getContentEncoding();
    }

    public int getContentLength()
    {
        return original.getContentLength();
    }

    public String getContentType()
    {
        return original.getContentType();
    }

    public long getDate()
    {
        return original.getDate();
    }

    public boolean getDefaultUseCaches()
    {
        return original.getDefaultUseCaches();
    }

    public boolean getDoInput()
    {
        return original.getDoInput();
    }

    public boolean getDoOutput()
    {
        return original.getDoOutput();
    }

    public InputStream getErrorStream()
    {
        if (original instanceof HttpURLConnection)
        {
            return ((HttpURLConnection)original).getErrorStream();
        } else
        {
            return null;
        }
    }

    public long getExpiration()
    {
        return original.getExpiration();
    }

    public String getHeaderField(int i)
    {
        return original.getHeaderField(i);
    }

    public String getHeaderField(String s)
    {
        return original.getHeaderField(s);
    }

    public long getHeaderFieldDate(String s, long l)
    {
        return original.getHeaderFieldDate(s, l);
    }

    public int getHeaderFieldInt(String s, int i)
    {
        return original.getHeaderFieldInt(s, i);
    }

    public String getHeaderFieldKey(int i)
    {
        return original.getHeaderFieldKey(i);
    }

    public Map getHeaderFields()
    {
        return original.getHeaderFields();
    }

    public long getIfModifiedSince()
    {
        return original.getIfModifiedSince();
    }

    public InputStream getInputStream()
        throws IOException
    {
        InputStreamMonitor inputstreammonitor;
        try
        {
            if (Properties.isKitKat)
            {
                if (mInputStreamMonitorKitKat == null)
                {
                    mInputStreamMonitorKitKat = new InputStreamMonitorKitKat((new StringBuilder()).append(original.getURL().toString()).append("-in").toString(), registry, original.getInputStream(), null);
                }
                return mInputStreamMonitorKitKat;
            }
            if (mInputStreamMonitor == null)
            {
                mInputStreamMonitor = new InputStreamMonitor((new StringBuilder()).append(original.getURL().toString()).append("-in").toString(), registry, original.getInputStream(), null);
            }
            inputstreammonitor = mInputStreamMonitor;
        }
        catch (IOException ioexception)
        {
            NetLogManager.getInstance().cancelNetworkCall(registry, url.toExternalForm(), System.currentTimeMillis(), "HTTPS", ioexception.getMessage());
            throw ioexception;
        }
        return inputstreammonitor;
    }

    public boolean getInstanceFollowRedirects()
    {
        if (original instanceof HttpURLConnection)
        {
            return ((HttpURLConnection)original).getInstanceFollowRedirects();
        } else
        {
            return true;
        }
    }

    public long getLastModified()
    {
        return original.getLastModified();
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        OutputStreamMonitor outputstreammonitor;
        try
        {
            if (mOutputStreamMonitor == null)
            {
                mOutputStreamMonitor = new OutputStreamMonitor((new StringBuilder()).append(original.getURL().toString()).append("-out").toString(), registry, original.getOutputStream());
            }
            outputstreammonitor = mOutputStreamMonitor;
        }
        catch (IOException ioexception)
        {
            NetLogManager.getInstance().cancelNetworkCall(registry, url.toExternalForm(), System.currentTimeMillis(), "HTTP", ioexception.getMessage());
            throw ioexception;
        }
        return outputstreammonitor;
    }

    public Permission getPermission()
        throws IOException
    {
        Permission permission;
        try
        {
            permission = original.getPermission();
        }
        catch (IOException ioexception)
        {
            NetLogManager.getInstance().cancelNetworkCall(registry, url.toExternalForm(), System.currentTimeMillis(), "HTTP", ioexception.getMessage());
            throw ioexception;
        }
        return permission;
    }

    public int getReadTimeout()
    {
        return original.getReadTimeout();
    }

    public String getRequestMethod()
    {
        if (original instanceof HttpURLConnection)
        {
            return ((HttpURLConnection)original).getRequestMethod();
        } else
        {
            return "GET";
        }
    }

    public Map getRequestProperties()
    {
        return original.getRequestProperties();
    }

    public String getRequestProperty(String s)
    {
        return original.getRequestProperty(s);
    }

    public int getResponseCode()
        throws IOException
    {
        if (original instanceof HttpURLConnection)
        {
            return ((HttpURLConnection)original).getResponseCode();
        } else
        {
            return -1;
        }
    }

    public String getResponseMessage()
        throws IOException
    {
        if (original instanceof HttpURLConnection)
        {
            return ((HttpURLConnection)original).getResponseMessage();
        } else
        {
            return "";
        }
    }

    public URL getURL()
    {
        return original.getURL();
    }

    public boolean getUseCaches()
    {
        return original.getUseCaches();
    }

    public void setAllowUserInteraction(boolean flag)
    {
        original.setAllowUserInteraction(flag);
    }

    public void setChunkedStreamingMode(int i)
    {
        if (original instanceof HttpURLConnection)
        {
            ((HttpURLConnection)original).setChunkedStreamingMode(i);
        }
    }

    public void setConnectTimeout(int i)
    {
        original.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean flag)
    {
        original.setDefaultUseCaches(flag);
    }

    public void setDoInput(boolean flag)
    {
        original.setDoInput(flag);
    }

    public void setDoOutput(boolean flag)
    {
        original.setDoOutput(flag);
    }

    public void setFixedLengthStreamingMode(int i)
    {
        if (original instanceof HttpURLConnection)
        {
            ((HttpURLConnection)original).setFixedLengthStreamingMode(i);
        }
    }

    public void setIfModifiedSince(long l)
    {
        original.setIfModifiedSince(l);
    }

    public void setInstanceFollowRedirects(boolean flag)
    {
        if (original instanceof HttpURLConnection)
        {
            ((HttpURLConnection)original).setInstanceFollowRedirects(flag);
        }
    }

    public void setReadTimeout(int i)
    {
        original.setReadTimeout(i);
    }

    public void setRequestMethod(String s)
        throws ProtocolException
    {
        if (original instanceof HttpURLConnection)
        {
            ((HttpURLConnection)original).setRequestMethod(s);
        }
    }

    public void setRequestProperty(String s, String s1)
    {
        original.setRequestProperty(s, s1);
    }

    public void setUseCaches(boolean flag)
    {
        original.setUseCaches(flag);
    }

    public boolean usingProxy()
    {
        if (original instanceof HttpURLConnection)
        {
            return ((HttpURLConnection)original).usingProxy();
        } else
        {
            return false;
        }
    }
}
