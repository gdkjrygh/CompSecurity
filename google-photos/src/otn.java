// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.ResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlRequestListener;

public final class otn extends UrlRequestListener
    implements jmw
{

    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private UrlRequest b;
    private jms c;
    private ResponseInfo d;
    private volatile int e;
    private ots f;
    private volatile String g;
    private volatile jmx h;
    private volatile long i;
    private volatile AtomicLong j;
    private volatile boolean k;
    private volatile int l;

    static int a(otn otn1, int i1)
    {
        otn1.l = i1;
        return i1;
    }

    private static long a(Map map)
    {
        Object obj = (List)map.get("Content-Length");
        if (obj == null || ((List) (obj)).size() <= 0 || TextUtils.isEmpty((CharSequence)((List) (obj)).get(0))) goto _L2; else goto _L1
_L1:
        long l1 = Long.parseLong((String)((List) (obj)).get(0));
_L13:
        long l2;
        map = (List)map.get("Content-Range");
        l2 = l1;
        if (map == null) goto _L4; else goto _L3
_L3:
        l2 = l1;
        if (map.size() <= 0) goto _L4; else goto _L5
_L5:
        l2 = l1;
        if (TextUtils.isEmpty((CharSequence)map.get(0))) goto _L4; else goto _L6
_L6:
        Matcher matcher;
        matcher = a.matcher((CharSequence)map.get(0));
        l2 = l1;
        if (!matcher.find()) goto _L4; else goto _L7
_L7:
        long l3;
        l2 = Long.parseLong(matcher.group(2));
        l3 = Long.parseLong(matcher.group(1));
        l3 = (l2 - l3) + 1L;
        if (l1 >= 0L) goto _L9; else goto _L8
_L8:
        l2 = l3;
_L4:
        return l2;
        NumberFormatException numberformatexception1;
        numberformatexception1;
        if (Log.isLoggable("DirectCronetDataSource", 6))
        {
            String s = String.valueOf(obj);
            Log.e("DirectCronetDataSource", (new StringBuilder(String.valueOf(s).length() + 28)).append("Unexpected Content-Length [").append(s).append("]").toString());
        }
_L2:
        l1 = -1L;
        continue; /* Loop/switch isn't completed */
_L9:
        l2 = l1;
        if (l1 == l3) goto _L4; else goto _L10
_L10:
        if (Log.isLoggable("DirectCronetDataSource", 5))
        {
            obj = String.valueOf(obj);
            String s1 = String.valueOf(map);
            Log.w("DirectCronetDataSource", (new StringBuilder(String.valueOf(obj).length() + 26 + String.valueOf(s1).length())).append("Inconsistent headers [").append(((String) (obj))).append("] [").append(s1).append("]").toString());
        }
        l2 = Math.max(l1, l3);
        return l2;
        NumberFormatException numberformatexception;
        numberformatexception;
        l2 = l1;
        if (!Log.isLoggable("DirectCronetDataSource", 6)) goto _L4; else goto _L11
_L11:
        map = String.valueOf(map);
        Log.e("DirectCronetDataSource", (new StringBuilder(String.valueOf(map).length() + 27)).append("Unexpected Content-Range [").append(map).append("]").toString());
        return l1;
        if (true) goto _L13; else goto _L12
_L12:
    }

    static k a(otn otn1)
    {
        return null;
    }

    static ConditionVariable b(otn otn1)
    {
        return null;
    }

    private void b()
    {
        throw new NullPointerException();
    }

    static int c(otn otn1)
    {
        return 0;
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        p.a("DirectCronetDataSource.read");
        this;
        JVM INSTR monitorenter ;
        if (e != otp.d)
        {
            throw new IllegalStateException("Connection not ready");
        }
        break MISSING_BLOCK_LABEL_38;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        p.b();
        throw abyte0;
        this;
        JVM INSTR monitorexit ;
        long l1;
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        l1 = j.get();
        if (l1 <= 0L)
        {
            p.b();
            return -1;
        }
        if (!k)
        {
            if (h != null)
            {
                throw h;
            } else
            {
                throw new NullPointerException();
            }
        } else
        {
            throw new NullPointerException();
        }
    }

    public final long a(jms jms1)
    {
        p.a("DirectCronetDataSource.open");
        p.a(jms1);
        this;
        JVM INSTR monitorenter ;
        if (e != otp.a && e != otp.e)
        {
            throw new IllegalStateException("Connection already open");
        }
        break MISSING_BLOCK_LABEL_53;
        jms1;
        this;
        JVM INSTR monitorexit ;
        throw jms1;
        jms1;
        p.b();
        throw jms1;
        e = otp.b;
        this;
        JVM INSTR monitorexit ;
        g = jms1.a.toString();
        c = jms1;
        jms1 = g;
        throw new NullPointerException();
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        p.a("DirectCronetDataSource.close");
        if (b != null)
        {
            b.c();
            b = null;
        }
        if (f != null)
        {
            ots.a(f);
            f = null;
        }
        c = null;
        g = null;
        h = null;
        i = 0L;
        k = false;
        d = null;
        l = 0;
        e = otp.e;
        p.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        p.b();
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(UrlRequest urlrequest, ByteBuffer bytebuffer)
    {
        this;
        JVM INSTR monitorenter ;
        bytebuffer = b;
        if (urlrequest == bytebuffer)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        throw new NullPointerException();
        urlrequest;
        this;
        JVM INSTR monitorexit ;
        throw urlrequest;
    }

    public final void a(UrlRequest urlrequest, ResponseInfo responseinfo)
    {
        this;
        JVM INSTR monitorenter ;
        UrlRequest urlrequest1 = b;
        if (urlrequest == urlrequest1)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        p.a("DirectCronetDataSource.onResponseStarted");
        int i1 = responseinfo.b();
        if (i1 >= 200 && i1 <= 299)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        try
        {
            throw new jmz(i1, responseinfo.c(), c);
        }
        // Misplaced declaration of an exception variable
        catch (UrlRequest urlrequest) { }
        finally { }
        h = urlrequest;
        if (f != null)
        {
            ots.a(f);
            f = null;
        }
        throw new NullPointerException();
        urlrequest;
        this;
        JVM INSTR monitorexit ;
        throw urlrequest;
        ((List)responseinfo.c().get("Content-Type")).get(0);
        d = responseinfo;
        i = a(responseinfo.c());
        if (c.d != -1L && i != -1L && c.d != i)
        {
            throw new otq("Content length did not match requested length", c);
        }
        break MISSING_BLOCK_LABEL_240;
        if (f != null)
        {
            ots.a(f);
            f = null;
        }
        throw new NullPointerException();
        urlrequest;
        throw new jmy(null, c);
        if (i > 0L)
        {
            j = new AtomicLong(i);
        }
        g = d.a();
        e = otp.c;
        if (f != null)
        {
            ots.a(f);
            f = null;
        }
        throw new NullPointerException();
    }

    public final void a(UrlRequest urlrequest, ResponseInfo responseinfo, String s)
    {
        if (c.b != null)
        {
            int i1 = responseinfo.b();
            if (i1 == 307 || i1 == 308)
            {
                h = new otq("POST request redirected with 307 or 308 response code.", c);
                throw new NullPointerException();
            }
        }
        while (f == null) 
        {
            return;
        }
        ots.b(f);
        urlrequest.b();
    }

    public final void a(UrlRequest urlrequest, UrlRequestException urlrequestexception)
    {
        this;
        JVM INSTR monitorenter ;
        UrlRequest urlrequest1 = b;
        if (urlrequest == urlrequest1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e == otp.b)
        {
            h = new otq(urlrequestexception, c);
            if (f != null)
            {
                ots.a(f);
                f = null;
            }
            throw new NullPointerException();
        }
        continue; /* Loop/switch isn't completed */
        urlrequest;
        this;
        JVM INSTR monitorexit ;
        throw urlrequest;
        if (e != otp.d) goto _L1; else goto _L3
_L3:
        h = new otr(urlrequestexception, c);
        throw new NullPointerException();
    }

}
