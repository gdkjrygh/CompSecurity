// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

abstract class gut extends HttpsURLConnection
{

    private final HttpURLConnection a;

    public gut(HttpURLConnection httpurlconnection)
    {
        super(httpurlconnection.getURL());
        a = httpurlconnection;
    }

    protected abstract grg a();

    public void addRequestProperty(String s, String s1)
    {
        a.addRequestProperty(s, s1);
    }

    public void connect()
    {
        connected = true;
        a.connect();
    }

    public void disconnect()
    {
        a.disconnect();
    }

    public boolean getAllowUserInteraction()
    {
        return a.getAllowUserInteraction();
    }

    public String getCipherSuite()
    {
        grg grg1 = a();
        if (grg1 != null)
        {
            return grg1.a;
        } else
        {
            return null;
        }
    }

    public int getConnectTimeout()
    {
        return a.getConnectTimeout();
    }

    public Object getContent()
    {
        return a.getContent();
    }

    public Object getContent(Class aclass[])
    {
        return a.getContent(aclass);
    }

    public String getContentEncoding()
    {
        return a.getContentEncoding();
    }

    public int getContentLength()
    {
        return a.getContentLength();
    }

    public String getContentType()
    {
        return a.getContentType();
    }

    public long getDate()
    {
        return a.getDate();
    }

    public boolean getDefaultUseCaches()
    {
        return a.getDefaultUseCaches();
    }

    public boolean getDoInput()
    {
        return a.getDoInput();
    }

    public boolean getDoOutput()
    {
        return a.getDoOutput();
    }

    public InputStream getErrorStream()
    {
        return a.getErrorStream();
    }

    public long getExpiration()
    {
        return a.getExpiration();
    }

    public String getHeaderField(int i)
    {
        return a.getHeaderField(i);
    }

    public String getHeaderField(String s)
    {
        return a.getHeaderField(s);
    }

    public long getHeaderFieldDate(String s, long l)
    {
        return a.getHeaderFieldDate(s, l);
    }

    public int getHeaderFieldInt(String s, int i)
    {
        return a.getHeaderFieldInt(s, i);
    }

    public String getHeaderFieldKey(int i)
    {
        return a.getHeaderFieldKey(i);
    }

    public Map getHeaderFields()
    {
        return a.getHeaderFields();
    }

    public long getIfModifiedSince()
    {
        return a.getIfModifiedSince();
    }

    public InputStream getInputStream()
    {
        return a.getInputStream();
    }

    public boolean getInstanceFollowRedirects()
    {
        return a.getInstanceFollowRedirects();
    }

    public long getLastModified()
    {
        return a.getLastModified();
    }

    public Certificate[] getLocalCertificates()
    {
        Object obj = a();
        if (obj != null)
        {
            if (!((List) (obj = ((grg) (obj)).c)).isEmpty())
            {
                return (Certificate[])((List) (obj)).toArray(new Certificate[((List) (obj)).size()]);
            }
        }
        return null;
    }

    public Principal getLocalPrincipal()
    {
        Object obj = null;
        grg grg1 = a();
        javax.security.auth.x500.X500Principal x500principal = obj;
        if (grg1 != null)
        {
            x500principal = obj;
            if (!grg1.c.isEmpty())
            {
                x500principal = ((X509Certificate)grg1.c.get(0)).getSubjectX500Principal();
            }
        }
        return x500principal;
    }

    public OutputStream getOutputStream()
    {
        return a.getOutputStream();
    }

    public Principal getPeerPrincipal()
    {
        Object obj = null;
        grg grg1 = a();
        javax.security.auth.x500.X500Principal x500principal = obj;
        if (grg1 != null)
        {
            x500principal = obj;
            if (!grg1.b.isEmpty())
            {
                x500principal = ((X509Certificate)grg1.b.get(0)).getSubjectX500Principal();
            }
        }
        return x500principal;
    }

    public Permission getPermission()
    {
        return a.getPermission();
    }

    public int getReadTimeout()
    {
        return a.getReadTimeout();
    }

    public String getRequestMethod()
    {
        return a.getRequestMethod();
    }

    public Map getRequestProperties()
    {
        return a.getRequestProperties();
    }

    public String getRequestProperty(String s)
    {
        return a.getRequestProperty(s);
    }

    public int getResponseCode()
    {
        return a.getResponseCode();
    }

    public String getResponseMessage()
    {
        return a.getResponseMessage();
    }

    public Certificate[] getServerCertificates()
    {
        Object obj = a();
        if (obj != null)
        {
            if (!((List) (obj = ((grg) (obj)).b)).isEmpty())
            {
                return (Certificate[])((List) (obj)).toArray(new Certificate[((List) (obj)).size()]);
            }
        }
        return null;
    }

    public URL getURL()
    {
        return a.getURL();
    }

    public boolean getUseCaches()
    {
        return a.getUseCaches();
    }

    public void setAllowUserInteraction(boolean flag)
    {
        a.setAllowUserInteraction(flag);
    }

    public void setChunkedStreamingMode(int i)
    {
        a.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i)
    {
        a.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean flag)
    {
        a.setDefaultUseCaches(flag);
    }

    public void setDoInput(boolean flag)
    {
        a.setDoInput(flag);
    }

    public void setDoOutput(boolean flag)
    {
        a.setDoOutput(flag);
    }

    public void setFixedLengthStreamingMode(int i)
    {
        a.setFixedLengthStreamingMode(i);
    }

    public void setIfModifiedSince(long l)
    {
        a.setIfModifiedSince(l);
    }

    public void setInstanceFollowRedirects(boolean flag)
    {
        a.setInstanceFollowRedirects(flag);
    }

    public void setReadTimeout(int i)
    {
        a.setReadTimeout(i);
    }

    public void setRequestMethod(String s)
    {
        a.setRequestMethod(s);
    }

    public void setRequestProperty(String s, String s1)
    {
        a.setRequestProperty(s, s1);
    }

    public void setUseCaches(boolean flag)
    {
        a.setUseCaches(flag);
    }

    public String toString()
    {
        return a.toString();
    }

    public boolean usingProxy()
    {
        return a.usingProxy();
    }
}
