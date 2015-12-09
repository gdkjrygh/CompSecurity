// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzh;
import com.google.android.gms.internal.zzj;
import com.google.android.gms.internal.zzk;
import com.google.android.gms.internal.zzp;
import com.google.android.gms.internal.zzq;
import com.google.android.gms.internal.zzr;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public final class cos
    implements cfx
{

    private static boolean a;
    private static int b = 3000;
    private static int c = 4096;
    private coz d;
    private cot e;

    public cos(coz coz1)
    {
        this(coz1, new cot(c));
    }

    private cos(coz coz1, cot cot1)
    {
        d = coz1;
        e = cot1;
    }

    private static Map a(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < aheader.length; i++)
        {
            treemap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return treemap;
    }

    private static void a(String s, zzk zzk1, zzr zzr1)
    {
        cnz cnz1 = zzk1.h;
        int i = zzk1.b();
        try
        {
            cnz1.a(zzr1);
        }
        // Misplaced declaration of an exception variable
        catch (zzr zzr1)
        {
            zzk1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw zzr1;
        }
        zzk1.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    private byte[] a(HttpEntity httpentity)
    {
        Object obj;
        Exception exception;
        byp byp1;
        byp1 = new byp(e, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new zzp();
        exception;
        byte abyte0[];
        byte abyte1[];
        int i;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            cop.a("Error occured when calling consumingContent", new Object[0]);
        }
        e.a(((byte []) (obj)));
        byp1.close();
        throw exception;
        obj = exception;
        abyte0 = e.a(1024);
_L2:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        byp1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = byp1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            cop.a("Error occured when calling consumingContent", new Object[0]);
        }
        e.a(abyte0);
        byp1.close();
        return abyte1;
    }

    public final cjd a(zzk zzk1)
    {
        long l = SystemClock.elapsedRealtime();
_L3:
        Object obj;
        Map map;
        byte abyte0[];
        HttpResponse httpresponse;
        Object obj2;
        HttpResponse httpresponse1;
        httpresponse1 = null;
        obj = null;
        obj2 = Collections.emptyMap();
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        Object obj3 = new HashMap();
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        Object obj4 = zzk1.i;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (((bzy) (obj4)).b == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        ((Map) (obj3)).put("If-None-Match", ((bzy) (obj4)).b);
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (((bzy) (obj4)).d <= 0L)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        ((Map) (obj3)).put("If-Modified-Since", DateUtils.formatDate(new Date(((bzy) (obj4)).d)));
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        httpresponse1 = d.a(zzk1, ((Map) (obj3)));
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj4 = httpresponse1.getStatusLine();
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        int i = ((StatusLine) (obj4)).getStatusCode();
        map = ((Map) (obj2));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj3 = a(httpresponse1.getAllHeaders());
        if (i != 304)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj4 = zzk1.i;
        if (obj4 != null) goto _L2; else goto _L1
_L1:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        SystemClock.elapsedRealtime();
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        byte abyte1[];
        long l1;
        try
        {
            return new cjd(null, ((Map) (obj3)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("socket", zzk1, ((zzr) (new zzq())));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("connection", zzk1, ((zzr) (new zzq())));
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder("Bad URL ")).append(zzk1.a).toString(), malformedurlexception);
        }
        catch (Object obj1)
        {
            if (httpresponse != null)
            {
                i = httpresponse.getStatusLine().getStatusCode();
                cop.c("Unexpected response code %d for %s", new Object[] {
                    Integer.valueOf(i), zzk1.a
                });
                if (abyte0 != null)
                {
                    SystemClock.elapsedRealtime();
                    obj1 = new cjd(abyte0, map, false);
                    if (i == 401 || i == 403)
                    {
                        a("auth", zzk1, ((zzr) (new zza(((cjd) (obj1))))));
                    } else
                    {
                        throw new zzp(((cjd) (obj1)));
                    }
                } else
                {
                    throw new zzh((byte)0);
                }
            } else
            {
                throw new zzj(((Throwable) (obj1)));
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        ((bzy) (obj4)).g.putAll(((Map) (obj3)));
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        abyte1 = ((bzy) (obj4)).a;
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj4 = ((bzy) (obj4)).g;
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        SystemClock.elapsedRealtime();
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj = new cjd(abyte1, ((Map) (obj4)), true);
        return ((cjd) (obj));
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (httpresponse1.getEntity() == null) goto _L5; else goto _L4
_L4:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj = a(httpresponse1.getEntity());
_L11:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        l1 = SystemClock.elapsedRealtime() - l;
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (a) goto _L7; else goto _L6
_L6:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        if (l1 <= (long)b) goto _L8; else goto _L7
_L7:
        if (obj == null) goto _L10; else goto _L9
_L9:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        abyte1 = Integer.valueOf(obj.length);
_L14:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        cop.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
            zzk1, Long.valueOf(l1), abyte1, Integer.valueOf(((StatusLine) (obj4)).getStatusCode()), Integer.valueOf(zzk1.h.b())
        });
          goto _L8
_L12:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        throw new IOException();
_L5:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj = new byte[0];
          goto _L11
_L13:
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        SystemClock.elapsedRealtime();
        map = ((Map) (obj3));
        abyte0 = ((byte []) (obj));
        httpresponse = httpresponse1;
        obj = new cjd(((byte []) (obj)), ((Map) (obj3)), false);
        return ((cjd) (obj));
_L8:
        if (i >= 200 && i <= 299) goto _L13; else goto _L12
_L10:
        abyte1 = "null";
          goto _L14
    }

    static 
    {
        a = cop.a;
    }
}
