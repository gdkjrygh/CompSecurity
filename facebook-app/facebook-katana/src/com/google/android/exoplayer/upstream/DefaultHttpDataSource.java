// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Predicate;
import com.google.android.exoplayer.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            HttpDataSource, TransferListener, DataSpec

public class DefaultHttpDataSource
    implements HttpDataSource
{

    private static final Pattern b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference c = new AtomicReference();
    private final boolean d;
    private final int e;
    private final int f;
    private final String g;
    private final Predicate h;
    private final HashMap i;
    private final TransferListener j;
    private DataSpec k;
    private HttpURLConnection l;
    private InputStream m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;

    public DefaultHttpDataSource(String s, Predicate predicate)
    {
        this(s, predicate, null);
    }

    public DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener)
    {
        this(s, predicate, transferlistener, 8000, 8000);
    }

    private DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener, int i1, int j1)
    {
        this(s, predicate, transferlistener, i1, j1, false);
    }

    public DefaultHttpDataSource(String s, Predicate predicate, TransferListener transferlistener, int i1, int j1, boolean flag)
    {
        g = Assertions.a(s);
        h = predicate;
        j = transferlistener;
        i = new HashMap();
        e = i1;
        f = j1;
        d = flag;
    }

    private static long a(HttpURLConnection httpurlconnection)
    {
        String s;
        long l1;
        long l2;
        l2 = -1L;
        s = httpurlconnection.getHeaderField("Content-Length");
        l1 = l2;
        Matcher matcher;
        long l3;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                l1 = Long.parseLong(s);
            }
            catch (NumberFormatException numberformatexception1)
            {
                Log.e("HttpDataSource", (new StringBuilder("Unexpected Content-Length [")).append(s).append("]").toString());
                l1 = l2;
            }
        }
        httpurlconnection = httpurlconnection.getHeaderField("Content-Range");
        l2 = l1;
        if (TextUtils.isEmpty(httpurlconnection)) goto _L2; else goto _L1
_L1:
        matcher = b.matcher(httpurlconnection);
        l2 = l1;
        if (!matcher.find()) goto _L2; else goto _L3
_L3:
        long l4;
        try
        {
            l2 = Long.parseLong(matcher.group(2));
            l3 = Long.parseLong(matcher.group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.e("HttpDataSource", (new StringBuilder("Unexpected Content-Range [")).append(httpurlconnection).append("]").toString());
            return l1;
        }
        l4 = (l2 - l3) + 1L;
        if (l1 >= 0L) goto _L5; else goto _L4
_L4:
        l2 = l4;
_L2:
        return l2;
_L5:
        l2 = l1;
        if (l1 == l4) goto _L2; else goto _L6
_L6:
        Log.w("HttpDataSource", (new StringBuilder("Inconsistent headers [")).append(s).append("] [").append(httpurlconnection).append("]").toString());
        l2 = Math.max(l1, l4);
        return l2;
    }

    private HttpURLConnection a(URL url, byte abyte0[], long l1, long l2, boolean flag, 
            boolean flag1)
    {
        HttpURLConnection httpurlconnection;
        httpurlconnection = (HttpURLConnection)url.openConnection();
        httpurlconnection.setConnectTimeout(e);
        httpurlconnection.setReadTimeout(f);
        url = i;
        url;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = i.entrySet().iterator(); iterator.hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_103;
        abyte0;
        url;
        JVM INSTR monitorexit ;
        throw abyte0;
        url;
        JVM INSTR monitorexit ;
        if (l1 != 0L || l2 != -1L)
        {
            String s = (new StringBuilder("bytes=")).append(l1).append("-").toString();
            url = s;
            if (l2 != -1L)
            {
                url = (new StringBuilder()).append(s).append((l1 + l2) - 1L).toString();
            }
            httpurlconnection.setRequestProperty("Range", url);
        }
        httpurlconnection.setRequestProperty("User-Agent", g);
        if (!flag)
        {
            httpurlconnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpurlconnection.setInstanceFollowRedirects(flag1);
        if (abyte0 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        httpurlconnection.setDoOutput(flag);
        if (abyte0 != null)
        {
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            httpurlconnection.connect();
            url = httpurlconnection.getOutputStream();
            url.write(abyte0);
            url.close();
            return httpurlconnection;
        } else
        {
            httpurlconnection.connect();
            return httpurlconnection;
        }
    }

    private static URL a(URL url, String s)
    {
        if (s == null)
        {
            throw new ProtocolException("Null location redirect");
        }
        url = new URL(url, s);
        s = url.getProtocol();
        if (!"https".equals(s) && !"http".equals(s))
        {
            throw new ProtocolException((new StringBuilder("Unsupported protocol redirect: ")).append(s).toString());
        } else
        {
            return url;
        }
    }

    private int b(byte abyte0[], int i1, int j1)
    {
        if (p != -1L)
        {
            j1 = (int)Math.min(j1, p - r);
        }
        if (j1 != 0)
        {
            i1 = m.read(abyte0, i1, j1);
            if (i1 == -1)
            {
                if (p != -1L && p != r)
                {
                    throw new EOFException();
                }
            } else
            {
                r = r + (long)i1;
                if (j != null)
                {
                    j.a(i1);
                }
                return i1;
            }
        }
        return -1;
    }

    private HttpURLConnection b(DataSpec dataspec)
    {
        URL url = new URL(dataspec.a.toString());
        byte abyte0[] = dataspec.b;
        long l1 = dataspec.d;
        long l2 = dataspec.e;
        boolean flag;
        if ((dataspec.g & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!d)
        {
            return a(url, abyte0, l1, l2, flag, true);
        }
        int i1 = 0;
        dataspec = url;
        do
        {
            int j1 = i1 + 1;
            if (i1 <= 20)
            {
                HttpURLConnection httpurlconnection = a(dataspec, abyte0, l1, l2, flag, false);
                i1 = httpurlconnection.getResponseCode();
                if (i1 == 300 || i1 == 301 || i1 == 302 || i1 == 303 || abyte0 == null && (i1 == 307 || i1 == 308))
                {
                    abyte0 = null;
                    String s = httpurlconnection.getHeaderField("Location");
                    httpurlconnection.disconnect();
                    dataspec = a(dataspec, s);
                    i1 = j1;
                } else
                {
                    return httpurlconnection;
                }
            } else
            {
                throw new NoRouteToHostException((new StringBuilder("Too many redirects: ")).append(j1).toString());
            }
        } while (true);
    }

    private long c()
    {
        if (p == -1L)
        {
            return p;
        } else
        {
            return p - r;
        }
    }

    private void d()
    {
        if (q == o)
        {
            return;
        }
        byte abyte1[] = (byte[])c.getAndSet(null);
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = new byte[4096];
        }
        do
        {
            if (q == o)
            {
                break;
            }
            int i1 = (int)Math.min(o - q, abyte0.length);
            i1 = m.read(abyte0, 0, i1);
            if (Thread.interrupted())
            {
                throw new InterruptedIOException();
            }
            if (i1 == -1)
            {
                throw new EOFException();
            }
            q = q + (long)i1;
            if (j != null)
            {
                j.a(i1);
            }
        } while (true);
        c.set(abyte0);
    }

    private void e()
    {
        if (l != null)
        {
            l.disconnect();
            l = null;
        }
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        try
        {
            d();
            i1 = b(abyte0, i1, j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new HttpDataSource.HttpDataSourceException(abyte0, k);
        }
        return i1;
    }

    public final long a(DataSpec dataspec)
    {
        long l3 = 0L;
        k = dataspec;
        r = 0L;
        q = 0L;
        int i1;
        try
        {
            l = b(dataspec);
        }
        catch (IOException ioexception)
        {
            throw new HttpDataSource.HttpDataSourceException((new StringBuilder("Unable to connect to ")).append(dataspec.a.toString()).toString(), ioexception, dataspec);
        }
        try
        {
            i1 = l.getResponseCode();
        }
        catch (IOException ioexception1)
        {
            e();
            throw new HttpDataSource.HttpDataSourceException((new StringBuilder("Unable to connect to ")).append(dataspec.a.toString()).toString(), ioexception1, dataspec);
        }
        if (i1 < 200 || i1 > 299)
        {
            java.util.Map map = l.getHeaderFields();
            e();
            throw new HttpDataSource.InvalidResponseCodeException(i1, map, dataspec);
        }
        String s = l.getContentType();
        if (h != null && !h.a(s))
        {
            e();
            throw new HttpDataSource.InvalidContentTypeException(s, dataspec);
        }
        long l1 = l3;
        if (i1 == 200)
        {
            l1 = l3;
            if (dataspec.d != 0L)
            {
                l1 = dataspec.d;
            }
        }
        o = l1;
        if ((dataspec.g & 1) == 0)
        {
            long l2 = a(l);
            if (dataspec.e != -1L)
            {
                l2 = dataspec.e;
            } else
            if (l2 != -1L)
            {
                l2 -= o;
            } else
            {
                l2 = -1L;
            }
            p = l2;
        } else
        {
            p = dataspec.e;
        }
        try
        {
            m = l.getInputStream();
        }
        catch (IOException ioexception2)
        {
            e();
            throw new HttpDataSource.HttpDataSourceException(ioexception2, dataspec);
        }
        n = true;
        if (j != null)
        {
            j.b();
        }
        return p;
    }

    public final void a()
    {
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        Util.a(l, c());
        m.close();
        m = null;
        e();
        if (n)
        {
            n = false;
            if (j != null)
            {
                j.c();
            }
        }
        return;
        Object obj;
        obj;
        throw new HttpDataSource.HttpDataSourceException(((IOException) (obj)), k);
        obj;
        m = null;
        e();
        if (n)
        {
            n = false;
            if (j != null)
            {
                j.c();
            }
        }
        throw obj;
    }

    public final String b()
    {
        if (l == null)
        {
            return null;
        } else
        {
            return l.getURL().toString();
        }
    }

}
