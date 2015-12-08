// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package crittercism.android:
//            c, ab, d, bc, 
//            dx, e, p, t, 
//            u

public final class s extends HttpsURLConnection
{

    private e a;
    private HttpsURLConnection b;
    private c c;
    private d d;
    private boolean e;
    private boolean f;

    public s(HttpsURLConnection httpsurlconnection, e e1, d d1)
    {
        super(httpsurlconnection.getURL());
        a = null;
        b = null;
        c = null;
        d = null;
        e = false;
        f = false;
        a = e1;
        b = httpsurlconnection;
        d = d1;
        c = new c(httpsurlconnection.getURL());
        httpsurlconnection = b.getSSLSocketFactory();
        if (httpsurlconnection instanceof ab)
        {
            httpsurlconnection = (ab)httpsurlconnection;
            b.setSSLSocketFactory(httpsurlconnection.a());
        }
    }

    private void a()
    {
        try
        {
            if (!f)
            {
                f = true;
                c.f = b.getRequestMethod();
                c.b();
                c.j = d.a();
                if (bc.b())
                {
                    c.a(bc.a());
                }
            }
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    private void a(Throwable throwable)
    {
        if (e)
        {
            return;
        }
        try
        {
            e = true;
            c.c();
            c.a(throwable);
            a.a(c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
        return;
    }

    private void b()
    {
        boolean flag;
        int i;
        i = 0;
        flag = false;
        if (e) goto _L2; else goto _L1
_L1:
        p p1;
        e = true;
        c.c();
        if (b.getHeaderFields() == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        p1 = new p(b.getHeaderFields());
        i = p1.b("Content-Length");
        if (i != -1)
        {
            long l;
            long l1;
            try
            {
                c.b(i);
            }
            catch (ThreadDeath threaddeath)
            {
                throw threaddeath;
            }
            catch (Throwable throwable)
            {
                dx.a(throwable);
                return;
            }
            flag = true;
        }
        l = p1.a("X-Android-Sent-Millis");
        l1 = p1.a("X-Android-Received-Millis");
        i = ((flag) ? 1 : 0);
        if (l == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        i = ((flag) ? 1 : 0);
        if (l1 == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        c.e(l);
        c.f(l1);
        i = ((flag) ? 1 : 0);
        c.e = b.getResponseCode();
_L5:
        if (i == 0) goto _L2; else goto _L3
_L3:
        a.a(c);
_L2:
        return;
        IOException ioexception;
        ioexception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void addRequestProperty(String s1, String s2)
    {
        b.addRequestProperty(s1, s2);
    }

    public final void connect()
    {
        b.connect();
    }

    public final void disconnect()
    {
        b.disconnect();
        try
        {
            if (e && !c.b)
            {
                a.a(c);
            }
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public final boolean equals(Object obj)
    {
        return b.equals(obj);
    }

    public final boolean getAllowUserInteraction()
    {
        return b.getAllowUserInteraction();
    }

    public final String getCipherSuite()
    {
        return b.getCipherSuite();
    }

    public final int getConnectTimeout()
    {
        return b.getConnectTimeout();
    }

    public final Object getContent()
    {
        a();
        Object obj;
        try
        {
            obj = b.getContent();
            b();
        }
        catch (IOException ioexception)
        {
            a(ioexception);
            throw ioexception;
        }
        return obj;
    }

    public final Object getContent(Class aclass[])
    {
        a();
        try
        {
            aclass = ((Class []) (b.getContent(aclass)));
            b();
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            a(aclass);
            throw aclass;
        }
        return aclass;
    }

    public final String getContentEncoding()
    {
        a();
        String s1 = b.getContentEncoding();
        b();
        return s1;
    }

    public final int getContentLength()
    {
        return b.getContentLength();
    }

    public final String getContentType()
    {
        a();
        String s1 = b.getContentType();
        b();
        return s1;
    }

    public final long getDate()
    {
        return b.getDate();
    }

    public final boolean getDefaultUseCaches()
    {
        return b.getDefaultUseCaches();
    }

    public final boolean getDoInput()
    {
        return b.getDoInput();
    }

    public final boolean getDoOutput()
    {
        return b.getDoOutput();
    }

    public final InputStream getErrorStream()
    {
        Object obj;
        a();
        obj = b.getErrorStream();
        b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        t t1 = new t(((InputStream) (obj)), a, c);
        return t1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        dx.a(throwable);
        return ((InputStream) (obj));
    }

    public final long getExpiration()
    {
        return b.getExpiration();
    }

    public final String getHeaderField(int i)
    {
        a();
        String s1 = b.getHeaderField(i);
        b();
        return s1;
    }

    public final String getHeaderField(String s1)
    {
        a();
        s1 = b.getHeaderField(s1);
        b();
        return s1;
    }

    public final long getHeaderFieldDate(String s1, long l)
    {
        a();
        l = b.getHeaderFieldDate(s1, l);
        b();
        return l;
    }

    public final int getHeaderFieldInt(String s1, int i)
    {
        a();
        i = b.getHeaderFieldInt(s1, i);
        b();
        return i;
    }

    public final String getHeaderFieldKey(int i)
    {
        a();
        String s1 = b.getHeaderFieldKey(i);
        b();
        return s1;
    }

    public final Map getHeaderFields()
    {
        a();
        Map map = b.getHeaderFields();
        b();
        return map;
    }

    public final HostnameVerifier getHostnameVerifier()
    {
        return b.getHostnameVerifier();
    }

    public final long getIfModifiedSince()
    {
        return b.getIfModifiedSince();
    }

    public final InputStream getInputStream()
    {
        Object obj;
        a();
        t t1;
        try
        {
            obj = b.getInputStream();
            b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
            throw obj;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        t1 = new t(((InputStream) (obj)), a, c);
        return t1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        dx.a(throwable);
        return ((InputStream) (obj));
    }

    public final boolean getInstanceFollowRedirects()
    {
        return b.getInstanceFollowRedirects();
    }

    public final long getLastModified()
    {
        return b.getLastModified();
    }

    public final Certificate[] getLocalCertificates()
    {
        return b.getLocalCertificates();
    }

    public final Principal getLocalPrincipal()
    {
        return b.getLocalPrincipal();
    }

    public final OutputStream getOutputStream()
    {
        Object obj;
        obj = b.getOutputStream();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        u u1 = new u(((OutputStream) (obj)), c);
        return u1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        dx.a(throwable);
        return ((OutputStream) (obj));
    }

    public final Principal getPeerPrincipal()
    {
        return b.getPeerPrincipal();
    }

    public final Permission getPermission()
    {
        return b.getPermission();
    }

    public final int getReadTimeout()
    {
        return b.getReadTimeout();
    }

    public final String getRequestMethod()
    {
        return b.getRequestMethod();
    }

    public final Map getRequestProperties()
    {
        return b.getRequestProperties();
    }

    public final String getRequestProperty(String s1)
    {
        return b.getRequestProperty(s1);
    }

    public final int getResponseCode()
    {
        a();
        int i;
        try
        {
            i = b.getResponseCode();
            b();
        }
        catch (IOException ioexception)
        {
            a(ioexception);
            throw ioexception;
        }
        return i;
    }

    public final String getResponseMessage()
    {
        a();
        String s1;
        try
        {
            s1 = b.getResponseMessage();
            b();
        }
        catch (IOException ioexception)
        {
            a(ioexception);
            throw ioexception;
        }
        return s1;
    }

    public final SSLSocketFactory getSSLSocketFactory()
    {
        return b.getSSLSocketFactory();
    }

    public final Certificate[] getServerCertificates()
    {
        return b.getServerCertificates();
    }

    public final URL getURL()
    {
        return b.getURL();
    }

    public final boolean getUseCaches()
    {
        return b.getUseCaches();
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final void setAllowUserInteraction(boolean flag)
    {
        b.setAllowUserInteraction(flag);
    }

    public final void setChunkedStreamingMode(int i)
    {
        b.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i)
    {
        b.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean flag)
    {
        b.setDefaultUseCaches(flag);
    }

    public final void setDoInput(boolean flag)
    {
        b.setDoInput(flag);
    }

    public final void setDoOutput(boolean flag)
    {
        b.setDoOutput(flag);
    }

    public final void setFixedLengthStreamingMode(int i)
    {
        b.setFixedLengthStreamingMode(i);
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameverifier)
    {
        b.setHostnameVerifier(hostnameverifier);
    }

    public final void setIfModifiedSince(long l)
    {
        b.setIfModifiedSince(l);
    }

    public final void setInstanceFollowRedirects(boolean flag)
    {
        b.setInstanceFollowRedirects(flag);
    }

    public final void setReadTimeout(int i)
    {
        b.setReadTimeout(i);
    }

    public final void setRequestMethod(String s1)
    {
        b.setRequestMethod(s1);
    }

    public final void setRequestProperty(String s1, String s2)
    {
        b.setRequestProperty(s1, s2);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        SSLSocketFactory sslsocketfactory1 = sslsocketfactory;
        try
        {
            if (sslsocketfactory instanceof ab)
            {
                sslsocketfactory1 = ((ab)sslsocketfactory).a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (SSLSocketFactory sslsocketfactory)
        {
            throw sslsocketfactory;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
            throwable = sslsocketfactory;
        }
        b.setSSLSocketFactory(sslsocketfactory1);
    }

    public final void setUseCaches(boolean flag)
    {
        b.setUseCaches(flag);
    }

    public final String toString()
    {
        return b.toString();
    }

    public final boolean usingProxy()
    {
        return b.usingProxy();
    }
}
