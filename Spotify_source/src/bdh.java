// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.upstream.HttpDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bdh
    implements HttpDataSource
{

    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference b = new AtomicReference();
    private final String c;
    private final HashMap d = new HashMap();
    private final bdn e;
    private bde f;
    private HttpURLConnection g;
    private InputStream h;
    private boolean i;
    private long j;
    private long k;
    private long l;
    private long m;

    public bdh(String s, bdn bdn1)
    {
        c = bds.a(s);
        e = bdn1;
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
        matcher = a.matcher(httpurlconnection);
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

    private HttpURLConnection a(URL url, long l1, long l2, boolean flag)
    {
        HttpURLConnection httpurlconnection;
        httpurlconnection = (HttpURLConnection)url.openConnection();
        httpurlconnection.setConnectTimeout(8000);
        httpurlconnection.setReadTimeout(8000);
        url = d;
        url;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = d.entrySet().iterator(); iterator.hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_103;
        Exception exception;
        exception;
        url;
        JVM INSTR monitorexit ;
        throw exception;
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
        httpurlconnection.setRequestProperty("User-Agent", c);
        if (!flag)
        {
            httpurlconnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpurlconnection.setInstanceFollowRedirects(true);
        httpurlconnection.setDoOutput(false);
        httpurlconnection.connect();
        return httpurlconnection;
    }

    private void c()
    {
        if (g != null)
        {
            g.disconnect();
            g = null;
        }
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        byte abyte2[];
        if (l == j)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        abyte2 = (byte[])b.getAndSet(null);
        byte abyte1[];
        abyte1 = abyte2;
        if (abyte2 != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        abyte1 = new byte[4096];
_L1:
        int k1;
        if (l == j)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        k1 = (int)Math.min(j - l, abyte1.length);
        k1 = h.read(abyte1, 0, k1);
        if (Thread.interrupted())
        {
            throw new InterruptedIOException();
        }
        if (k1 != -1)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        throw new EOFException();
        l = l + (long)k1;
        if (e != null)
        {
            e.a(k1);
        }
          goto _L1
        b.set(abyte1);
        break MISSING_BLOCK_LABEL_168;
_L3:
        j1 = h.read(abyte0, i1, j1);
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        if (k != -1L && k != m)
        {
            throw new EOFException();
        }
        break MISSING_BLOCK_LABEL_288;
        m = m + (long)j1;
        i1 = j1;
        if (e == null)
        {
            break; /* Loop/switch isn't completed */
        }
        e.a(j1);
        return j1;
        if (k != -1L)
        {
            try
            {
                j1 = (int)Math.min(j1, k - m);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException(abyte0, f);
            }
        }
        if (j1 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = -1;
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        return i1;
        return -1;
    }

    public final long a(bde bde1)
    {
        f = bde1;
        m = 0L;
        l = 0L;
        URL url;
        long l1;
        long l2;
        url = new URL(bde1.a.toString());
        l1 = bde1.c;
        l2 = bde1.d;
        int i1;
        boolean flag;
        if ((bde1.f & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            g = a(url, l1, l2, flag);
        }
        catch (IOException ioexception)
        {
            throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException((new StringBuilder("Unable to connect to ")).append(bde1.a.toString()).toString(), ioexception, bde1);
        }
        try
        {
            i1 = g.getResponseCode();
        }
        catch (IOException ioexception1)
        {
            c();
            throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException((new StringBuilder("Unable to connect to ")).append(bde1.a.toString()).toString(), ioexception1, bde1);
        }
        if (i1 < 200 || i1 > 299)
        {
            java.util.Map map = g.getHeaderFields();
            c();
            throw new com.google.android.exoplayer.upstream.HttpDataSource.InvalidResponseCodeException(i1, map, bde1);
        }
        g.getContentType();
        if (i1 == 200 && bde1.c != 0L)
        {
            l1 = bde1.c;
        } else
        {
            l1 = 0L;
        }
        j = l1;
        if ((bde1.f & 1) == 0)
        {
            l1 = a(g);
            if (bde1.d != -1L)
            {
                l1 = bde1.d;
            } else
            if (l1 != -1L)
            {
                l1 -= j;
            } else
            {
                l1 = -1L;
            }
            k = l1;
        } else
        {
            k = bde1.d;
        }
        try
        {
            h = g.getInputStream();
        }
        catch (IOException ioexception2)
        {
            c();
            throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException(ioexception2, bde1);
        }
        i = true;
        if (e != null)
        {
            e.b();
        }
        return k;
    }

    public final String a()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.getURL().toString();
        }
    }

    public final void b()
    {
        if (h == null) goto _L2; else goto _L1
_L1:
        HttpURLConnection httpurlconnection;
        long l1;
        httpurlconnection = g;
        if (k != -1L)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        l1 = k;
_L3:
        bej.a(httpurlconnection, l1);
        h.close();
_L2:
        h = null;
        c();
        if (i)
        {
            i = false;
            if (e != null)
            {
                e.c();
            }
        }
        return;
        l1 = k - m;
          goto _L3
        Object obj;
        obj;
        throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException(((IOException) (obj)), f);
        obj;
        h = null;
        c();
        if (i)
        {
            i = false;
            if (e != null)
            {
                e.c();
            }
        }
        throw obj;
    }

}
