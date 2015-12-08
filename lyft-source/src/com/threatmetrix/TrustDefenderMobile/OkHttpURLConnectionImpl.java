// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            TDURLConnection, StringUtils, THMStatusCode, OkHttpClientImpl, 
//            HttpParameterMap, CancelState

class OkHttpURLConnectionImpl
    implements TDURLConnection
{

    private static final String a = StringUtils.a(com/threatmetrix/TrustDefenderMobile/OkHttpURLConnectionImpl);
    private THMStatusCode b;
    private CancelState c;
    private Map d;
    private Request e;
    private OkHttpClientImpl f;
    private OkHttpClient g;
    private Response h;
    private Call i;

    OkHttpURLConnectionImpl(OkHttpClientImpl okhttpclientimpl, CancelState cancelstate)
    {
        d = new HashMap();
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        b = THMStatusCode.a;
        c = cancelstate;
        f = okhttpclientimpl;
        g = okhttpclientimpl.a();
    }

    private void b(String s, HttpParameterMap httpparametermap)
    {
        com.squareup.okhttp.Request.Builder builder;
        builder = (new com.squareup.okhttp.Request.Builder()).url(s);
        d.put("User-Agent", f.b());
        for (s = d.entrySet().iterator(); s.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)s.next();
            if (entry.getValue() == null)
            {
                Log.d(a, (new StringBuilder()).append("null value for ").append((String)entry.getKey()).toString());
            } else
            {
                builder.addHeader((String)entry.getKey(), (String)entry.getValue());
            }
        }

        if (httpparametermap != null)
        {
            FormEncodingBuilder formencodingbuilder = new FormEncodingBuilder();
            Iterator iterator = httpparametermap.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                String s1 = (String)httpparametermap.get(s2);
                if (s1 != null && !s1.isEmpty())
                {
                    Integer integer = httpparametermap.a(s2);
                    s = s1;
                    if (integer != null)
                    {
                        s = s1;
                        if (s1.length() > integer.intValue())
                        {
                            s = s1.substring(0, integer.intValue());
                        }
                    }
                    s1 = s;
                    if (integer == null)
                    {
                        s1 = s;
                        if (httpparametermap.a() != 0)
                        {
                            s1 = s;
                            if (s.length() > httpparametermap.a())
                            {
                                s1 = s.substring(0, httpparametermap.a());
                            }
                        }
                    }
                    formencodingbuilder.add(s2, s1);
                }
            } while (true);
            builder.post(formencodingbuilder.build());
        }
        this;
        JVM INSTR monitorenter ;
        e = builder.build();
        this;
        JVM INSTR monitorexit ;
        try
        {
            i = g.newCall(e);
            h = i.execute();
            b = THMStatusCode.b;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(a, "Caught runtime exception:", s);
            b = THMStatusCode.c;
            return;
        }
        break MISSING_BLOCK_LABEL_361;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (s.getCause() instanceof CertificateException)
        {
            b = THMStatusCode.g;
        } else
        if (s instanceof SSLPeerUnverifiedException)
        {
            b = THMStatusCode.g;
        } else
        if (s instanceof UnknownHostException)
        {
            b = THMStatusCode.d;
        } else
        if (s instanceof SocketTimeoutException)
        {
            b = THMStatusCode.e;
        } else
        if (b == THMStatusCode.a)
        {
            b = THMStatusCode.c;
        }
        if (c != null && c.a())
        {
            Log.d(a, "Connection interrupted due to cancel!");
            c();
            return;
        } else
        {
            Log.e(a, "Failed to retrieve URI", s);
            return;
        }
    }

    public long a(String s)
    {
        b(s, null);
        if (h == null || b != THMStatusCode.b)
        {
            return -1L;
        } else
        {
            return (long)h.code();
        }
    }

    public long a(String s, HttpParameterMap httpparametermap)
    {
        b(s, httpparametermap);
        if (h == null || b != THMStatusCode.b)
        {
            return -1L;
        } else
        {
            return (long)h.code();
        }
    }

    public String a()
    {
        if (e != null)
        {
            return e.url().toString();
        } else
        {
            return null;
        }
    }

    public void a(Map map)
    {
        d.putAll(map);
    }

    public String b()
    {
        if (e != null)
        {
            return e.url().getHost();
        } else
        {
            return null;
        }
    }

    public void c()
    {
        if (i != null)
        {
            i.cancel();
        }
    }

    public InputStream d()
    {
        if (h == null)
        {
            return null;
        } else
        {
            return h.body().byteStream();
        }
    }

    public int e()
    {
        if (h != null)
        {
            return h.code();
        } else
        {
            return -1;
        }
    }

    public void f()
    {
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        h.body().close();
        return;
        IOException ioexception;
        ioexception;
        Log.e(a, "Failed to close response body", ioexception);
        return;
    }

    public THMStatusCode g()
    {
        return b;
    }

}
