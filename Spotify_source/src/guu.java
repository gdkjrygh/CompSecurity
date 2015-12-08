// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class guu extends HttpURLConnection
{

    private static final Set d = new LinkedHashSet(Arrays.asList(new String[] {
        "OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"
    }));
    private static final grs e = grs.a(null, new byte[0]);
    final gro a;
    protected gui b;
    grg c;
    private gri f;
    private long g;
    private int h;
    private IOException i;
    private grh j;
    private grw k;

    public guu(URL url, gro gro1)
    {
        super(url);
        f = new gri();
        g = -1L;
        a = gro1;
    }

    private grh a()
    {
        if (j == null)
        {
            Object obj = c().f();
            gri gri1 = ((grt) (obj)).f.b();
            Object obj1 = new StringBuilder();
            gsk.a();
            obj1 = ((StringBuilder) (obj1)).append(gsk.b()).append("-Response-Source").toString();
            if (((grt) (obj)).h == null)
            {
                if (((grt) (obj)).i == null)
                {
                    obj = "NONE";
                } else
                {
                    obj = (new StringBuilder("CACHE ")).append(((grt) (obj)).c).toString();
                }
            } else
            if (((grt) (obj)).i == null)
            {
                obj = (new StringBuilder("NETWORK ")).append(((grt) (obj)).c).toString();
            } else
            {
                obj = (new StringBuilder("CONDITIONAL_CACHE ")).append(((grt) (obj)).h.c).toString();
            }
            j = gri1.a(((String) (obj1)), ((String) (obj))).a();
        }
        return j;
    }

    private gui a(String s, gqz gqz1, gup gup1, grt grt1)
    {
        Object obj;
        Object obj1;
        int l;
        if (guk.b(s))
        {
            obj = e;
        } else
        {
            obj = null;
        }
        obj = (new grr()).a(getURL()).a(s, ((grs) (obj)));
        obj1 = f.a();
        l = 0;
        for (int i1 = ((grh) (obj1)).a.length / 2; l < i1; l++)
        {
            ((grr) (obj)).b(((grh) (obj1)).a(l), ((grh) (obj1)).b(l));
        }

        boolean flag1 = false;
        boolean flag = false;
        if (guk.c(s))
        {
            if (g != -1L)
            {
                ((grr) (obj)).a("Content-Length", Long.toString(g));
            } else
            if (chunkLength > 0)
            {
                ((grr) (obj)).a("Transfer-Encoding", "chunked");
            } else
            {
                flag = true;
            }
            flag1 = flag;
            if (((grh) (obj1)).a("Content-Type") == null)
            {
                ((grr) (obj)).a("Content-Type", "application/x-www-form-urlencoded");
                flag1 = flag;
            }
        }
        if (((grh) (obj1)).a("User-Agent") == null)
        {
            s = System.getProperty("http.agent");
            if (s != null)
            {
                s = gsp.b(s);
            } else
            {
                s = "okhttp/2.5.0";
            }
            ((grr) (obj)).a("User-Agent", s);
        }
        obj1 = ((grr) (obj)).b();
        obj = a;
        s = ((String) (obj));
        if (gsf.b.a(((gro) (obj))) != null)
        {
            s = ((String) (obj));
            if (!getUseCaches())
            {
                s = a.c().a(null);
            }
        }
        return new gui(s, ((grq) (obj1)), flag1, true, false, gqz1, null, gup1, grt1);
    }

    private void a(String s, boolean flag)
    {
        Object obj = new ArrayList();
        if (flag)
        {
            ((List) (obj)).addAll(a.d);
        }
        s = s.split(",", -1);
        int i1 = s.length;
        int l = 0;
        while (l < i1) 
        {
            String s1 = s[l];
            try
            {
                ((List) (obj)).add(Protocol.a(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalStateException(s);
            }
            l++;
        }
        s = a;
        obj = gsp.a(((List) (obj)));
        if (!((List) (obj)).contains(Protocol.b))
        {
            throw new IllegalArgumentException((new StringBuilder("protocols doesn't contain http/1.1: ")).append(obj).toString());
        }
        if (((List) (obj)).contains(Protocol.a))
        {
            throw new IllegalArgumentException((new StringBuilder("protocols must not contain http/1.0: ")).append(obj).toString());
        }
        if (((List) (obj)).contains(null))
        {
            throw new IllegalArgumentException("protocols must not contain null");
        } else
        {
            s.d = gsp.a(((List) (obj)));
            return;
        }
    }

    private boolean a(boolean flag)
    {
        grg grg;
        b.a();
        k = b.c;
        if (b.b == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        grg = b.b.i;
_L1:
        c = grg;
        if (flag)
        {
            try
            {
                b.j();
            }
            catch (RequestException requestexception)
            {
                IOException ioexception = requestexception.a();
                i = ioexception;
                throw ioexception;
            }
            catch (RouteException routeexception)
            {
                gui gui1 = b.a(routeexception);
                if (gui1 != null)
                {
                    b = gui1;
                    return false;
                } else
                {
                    IOException ioexception1 = routeexception.lastException;
                    i = ioexception1;
                    throw ioexception1;
                }
            }
            catch (IOException ioexception2)
            {
                gui gui2 = b;
                gui2 = gui2.a(ioexception2, gui2.e);
                if (gui2 != null)
                {
                    b = gui2;
                    return false;
                } else
                {
                    i = ioexception2;
                    throw ioexception2;
                }
            }
        }
        return true;
        grg = null;
          goto _L1
    }

    private void b()
    {
        if (i != null)
        {
            throw i;
        }
        if (b != null)
        {
            return;
        }
        connected = true;
        if (!doOutput) goto _L2; else goto _L1
_L1:
        if (!method.equals("GET")) goto _L4; else goto _L3
_L3:
        method = "POST";
_L2:
        b = a(method, null, null, null);
        return;
        IOException ioexception;
        ioexception;
        i = ioexception;
        throw ioexception;
_L4:
        if (guk.c(method)) goto _L2; else goto _L5
_L5:
        throw new ProtocolException((new StringBuilder()).append(method).append(" does not support writing").toString());
    }

    private gui c()
    {
        b();
        if (b.e())
        {
            return b;
        }
        do
        {
            while (!a(true)) ;
            grt1 = b.f();
            grq1 = b.k();
            if (grq1 == null)
            {
                b.g();
                return b;
            }
            int l = h + 1;
            h = l;
            if (l > 20)
            {
                throw new ProtocolException((new StringBuilder("Too many follow-up requests: ")).append(h).toString());
            }
            url = grq1.a();
            f = grq1.c.b();
            hcv = b.d();
            if (!grq1.b.equals(method))
            {
                hcv = null;
            }
            if (hcv == null || (hcv instanceof gup))
            {
                if (!b.a(grq1.a))
                {
                    b.g();
                }
                gqz gqz1 = b.i();
                b = a(grq1.b, gqz1, (gup)hcv, grt1);
            } else
            {
                throw new HttpRetryException("Cannot retry streamed HTTP body", responseCode);
            }
        } while (true);
    }

    public final void addRequestProperty(String s, String s1)
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot add request property after connection is made");
        }
        if (s == null)
        {
            throw new NullPointerException("field == null");
        }
        if (s1 == null)
        {
            gsk.a();
            gsk.a((new StringBuilder("Ignoring header ")).append(s).append(" because its value was null.").toString());
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s))
        {
            a(s1, true);
            return;
        } else
        {
            f.a(s, s1);
            return;
        }
    }

    public final void connect()
    {
        b();
        while (!a(false)) ;
    }

    public final void disconnect()
    {
        if (b == null)
        {
            return;
        } else
        {
            b.h();
            return;
        }
    }

    public final int getConnectTimeout()
    {
        return a.t;
    }

    public final InputStream getErrorStream()
    {
        Object obj = null;
        InputStream inputstream;
        gui gui1;
        try
        {
            gui1 = c();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        inputstream = obj;
        if (!gui.a(gui1.f()))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        inputstream = obj;
        if (gui1.f().c >= 400)
        {
            inputstream = gui1.f().g.d();
        }
        return inputstream;
    }

    public final String getHeaderField(int l)
    {
        String s;
        try
        {
            s = a().b(l);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return s;
    }

    public final String getHeaderField(String s)
    {
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        return gur.a(c().f()).toString();
        s = a().a(s);
        return s;
        s;
        return null;
    }

    public final String getHeaderFieldKey(int l)
    {
        String s;
        try
        {
            s = a().a(l);
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return s;
    }

    public final Map getHeaderFields()
    {
        Map map;
        try
        {
            map = gum.a(a(), gur.a(c().f()).toString());
        }
        catch (IOException ioexception)
        {
            return Collections.emptyMap();
        }
        return map;
    }

    public final InputStream getInputStream()
    {
        if (!doInput)
        {
            throw new ProtocolException("This protocol does not support input");
        }
        gui gui1 = c();
        if (getResponseCode() >= 400)
        {
            throw new FileNotFoundException(url.toString());
        } else
        {
            return gui1.f().g.d();
        }
    }

    public final OutputStream getOutputStream()
    {
        connect();
        gui gui1 = b;
        Object obj = gui1.f;
        if (obj == null)
        {
            obj = gui1.d();
            if (obj != null)
            {
                obj = hcq.a(((hcv) (obj)));
                gui1.f = ((hci) (obj));
            } else
            {
                obj = null;
            }
        }
        if (obj == null)
        {
            throw new ProtocolException((new StringBuilder("method does not support a request body: ")).append(method).toString());
        }
        if (b.e())
        {
            throw new ProtocolException("cannot write request body after response has been read");
        } else
        {
            return ((hci) (obj)).c();
        }
    }

    public final Permission getPermission()
    {
        Object obj = getURL();
        String s = ((URL) (obj)).getHost();
        int l;
        if (((URL) (obj)).getPort() != -1)
        {
            l = ((URL) (obj)).getPort();
        } else
        {
            l = grj.a(((URL) (obj)).getProtocol());
        }
        if (usingProxy())
        {
            obj = (InetSocketAddress)a.c.address();
            s = ((InetSocketAddress) (obj)).getHostName();
            l = ((InetSocketAddress) (obj)).getPort();
        }
        return new SocketPermission((new StringBuilder()).append(s).append(":").append(l).toString(), "connect, resolve");
    }

    public final int getReadTimeout()
    {
        return a.u;
    }

    public final Map getRequestProperties()
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        } else
        {
            return gum.a(f.a(), null);
        }
    }

    public final String getRequestProperty(String s)
    {
        if (s == null)
        {
            return null;
        }
        gri gri1 = f;
        for (int l = gri1.a.size() - 2; l >= 0; l -= 2)
        {
            if (s.equalsIgnoreCase((String)gri1.a.get(l)))
            {
                return (String)gri1.a.get(l + 1);
            }
        }

        return null;
    }

    public final int getResponseCode()
    {
        return c().f().c;
    }

    public final String getResponseMessage()
    {
        return c().f().d;
    }

    public final void setConnectTimeout(int l)
    {
        a.a(l, TimeUnit.MILLISECONDS);
    }

    public final void setFixedLengthStreamingMode(int l)
    {
        setFixedLengthStreamingMode(l);
    }

    public final void setFixedLengthStreamingMode(long l)
    {
        if (super.connected)
        {
            throw new IllegalStateException("Already connected");
        }
        if (chunkLength > 0)
        {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("contentLength < 0");
        } else
        {
            g = l;
            super.fixedContentLength = (int)Math.min(l, 0x7fffffffL);
            return;
        }
    }

    public final void setIfModifiedSince(long l)
    {
        super.setIfModifiedSince(l);
        if (ifModifiedSince != 0L)
        {
            f.b("If-Modified-Since", guh.a(new Date(ifModifiedSince)));
            return;
        } else
        {
            f.b("If-Modified-Since");
            return;
        }
    }

    public final void setInstanceFollowRedirects(boolean flag)
    {
        a.r = flag;
    }

    public final void setReadTimeout(int l)
    {
        a.b(l, TimeUnit.MILLISECONDS);
    }

    public final void setRequestMethod(String s)
    {
        if (!d.contains(s))
        {
            throw new ProtocolException((new StringBuilder("Expected one of ")).append(d).append(" but was ").append(s).toString());
        } else
        {
            method = s;
            return;
        }
    }

    public final void setRequestProperty(String s, String s1)
    {
        if (connected)
        {
            throw new IllegalStateException("Cannot set request property after connection is made");
        }
        if (s == null)
        {
            throw new NullPointerException("field == null");
        }
        if (s1 == null)
        {
            gsk.a();
            gsk.a((new StringBuilder("Ignoring header ")).append(s).append(" because its value was null.").toString());
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s))
        {
            a(s1, false);
            return;
        } else
        {
            f.b(s, s1);
            return;
        }
    }

    public final boolean usingProxy()
    {
        Proxy proxy;
        if (k != null)
        {
            proxy = k.b;
        } else
        {
            proxy = a.c;
        }
        return proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT;
    }

}
