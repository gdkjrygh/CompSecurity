// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class guv extends gut
{

    private final guu a;

    private guv(guu guu1)
    {
        super(guu1);
        a = guu1;
    }

    public guv(URL url, gro gro1)
    {
        this(new guu(url, gro1));
    }

    protected final grg a()
    {
        if (a.b == null)
        {
            throw new IllegalStateException("Connection has not yet been established");
        }
        if (a.b.e())
        {
            return a.b.f().e;
        } else
        {
            return a.c;
        }
    }

    public final volatile void addRequestProperty(String s, String s1)
    {
        super.addRequestProperty(s, s1);
    }

    public final volatile void connect()
    {
        super.connect();
    }

    public final volatile void disconnect()
    {
        super.disconnect();
    }

    public final volatile boolean getAllowUserInteraction()
    {
        return super.getAllowUserInteraction();
    }

    public final volatile String getCipherSuite()
    {
        return super.getCipherSuite();
    }

    public final volatile int getConnectTimeout()
    {
        return super.getConnectTimeout();
    }

    public final volatile Object getContent()
    {
        return super.getContent();
    }

    public final volatile Object getContent(Class aclass[])
    {
        return super.getContent(aclass);
    }

    public final volatile String getContentEncoding()
    {
        return super.getContentEncoding();
    }

    public final volatile int getContentLength()
    {
        return super.getContentLength();
    }

    public final volatile String getContentType()
    {
        return super.getContentType();
    }

    public final volatile long getDate()
    {
        return super.getDate();
    }

    public final volatile boolean getDefaultUseCaches()
    {
        return super.getDefaultUseCaches();
    }

    public final volatile boolean getDoInput()
    {
        return super.getDoInput();
    }

    public final volatile boolean getDoOutput()
    {
        return super.getDoOutput();
    }

    public final volatile InputStream getErrorStream()
    {
        return super.getErrorStream();
    }

    public final volatile long getExpiration()
    {
        return super.getExpiration();
    }

    public final volatile String getHeaderField(int i)
    {
        return super.getHeaderField(i);
    }

    public final volatile String getHeaderField(String s)
    {
        return super.getHeaderField(s);
    }

    public final volatile long getHeaderFieldDate(String s, long l)
    {
        return super.getHeaderFieldDate(s, l);
    }

    public final volatile int getHeaderFieldInt(String s, int i)
    {
        return super.getHeaderFieldInt(s, i);
    }

    public final volatile String getHeaderFieldKey(int i)
    {
        return super.getHeaderFieldKey(i);
    }

    public final volatile Map getHeaderFields()
    {
        return super.getHeaderFields();
    }

    public final HostnameVerifier getHostnameVerifier()
    {
        return a.a.m;
    }

    public final volatile long getIfModifiedSince()
    {
        return super.getIfModifiedSince();
    }

    public final volatile InputStream getInputStream()
    {
        return super.getInputStream();
    }

    public final volatile boolean getInstanceFollowRedirects()
    {
        return super.getInstanceFollowRedirects();
    }

    public final volatile long getLastModified()
    {
        return super.getLastModified();
    }

    public final volatile Certificate[] getLocalCertificates()
    {
        return super.getLocalCertificates();
    }

    public final volatile Principal getLocalPrincipal()
    {
        return super.getLocalPrincipal();
    }

    public final volatile OutputStream getOutputStream()
    {
        return super.getOutputStream();
    }

    public final volatile Principal getPeerPrincipal()
    {
        return super.getPeerPrincipal();
    }

    public final volatile Permission getPermission()
    {
        return super.getPermission();
    }

    public final volatile int getReadTimeout()
    {
        return super.getReadTimeout();
    }

    public final volatile String getRequestMethod()
    {
        return super.getRequestMethod();
    }

    public final volatile Map getRequestProperties()
    {
        return super.getRequestProperties();
    }

    public final volatile String getRequestProperty(String s)
    {
        return super.getRequestProperty(s);
    }

    public final volatile int getResponseCode()
    {
        return super.getResponseCode();
    }

    public final volatile String getResponseMessage()
    {
        return super.getResponseMessage();
    }

    public final SSLSocketFactory getSSLSocketFactory()
    {
        return a.a.l;
    }

    public final volatile Certificate[] getServerCertificates()
    {
        return super.getServerCertificates();
    }

    public final volatile URL getURL()
    {
        return super.getURL();
    }

    public final volatile boolean getUseCaches()
    {
        return super.getUseCaches();
    }

    public final volatile void setAllowUserInteraction(boolean flag)
    {
        super.setAllowUserInteraction(flag);
    }

    public final volatile void setChunkedStreamingMode(int i)
    {
        super.setChunkedStreamingMode(i);
    }

    public final volatile void setConnectTimeout(int i)
    {
        super.setConnectTimeout(i);
    }

    public final volatile void setDefaultUseCaches(boolean flag)
    {
        super.setDefaultUseCaches(flag);
    }

    public final volatile void setDoInput(boolean flag)
    {
        super.setDoInput(flag);
    }

    public final volatile void setDoOutput(boolean flag)
    {
        super.setDoOutput(flag);
    }

    public final volatile void setFixedLengthStreamingMode(int i)
    {
        super.setFixedLengthStreamingMode(i);
    }

    public final void setFixedLengthStreamingMode(long l)
    {
        a.setFixedLengthStreamingMode(l);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameverifier)
    {
        a.a.m = hostnameverifier;
    }

    public final volatile void setIfModifiedSince(long l)
    {
        super.setIfModifiedSince(l);
    }

    public final volatile void setInstanceFollowRedirects(boolean flag)
    {
        super.setInstanceFollowRedirects(flag);
    }

    public final volatile void setReadTimeout(int i)
    {
        super.setReadTimeout(i);
    }

    public final volatile void setRequestMethod(String s)
    {
        super.setRequestMethod(s);
    }

    public final volatile void setRequestProperty(String s, String s1)
    {
        super.setRequestProperty(s, s1);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        a.a.l = sslsocketfactory;
    }

    public final volatile void setUseCaches(boolean flag)
    {
        super.setUseCaches(flag);
    }

    public final volatile String toString()
    {
        return super.toString();
    }

    public final volatile boolean usingProxy()
    {
        return super.usingProxy();
    }
}
