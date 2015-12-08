// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.http.NetworkAccessWhileInOfflineModeException;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.exo.InvalidResponseCodeException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class glk
    implements bdo
{

    private static final Pattern c = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    final HashMap a;
    public long b;
    private final String d;
    private final bdn e;
    private final gro f;
    private bde g;
    private InputStream h;
    private boolean i;
    private long j;
    private long k;

    public glk(String s)
    {
        this(s, null);
    }

    public glk(String s, bdn bdn1)
    {
        this(s, bdn1, (byte)0);
    }

    private glk(String s, bdn bdn1, byte byte0)
    {
        d = bds.a(s);
        e = bdn1;
        a = new HashMap();
        f = ((dms)dmz.a(dms)).a.c();
    }

    private static long a(grt grt1)
    {
        String s;
        long l;
        long l1;
        l1 = -1L;
        s = grt1.b("Content-Length");
        l = l1;
        Matcher matcher;
        long l2;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                l = Long.parseLong(s);
            }
            catch (NumberFormatException numberformatexception1)
            {
                Logger.c("Unexpected Content-Length [%s]", new Object[] {
                    s
                });
                l = l1;
            }
        }
        grt1 = grt1.b("Content-Range");
        l1 = l;
        if (TextUtils.isEmpty(grt1)) goto _L2; else goto _L1
_L1:
        matcher = c.matcher(grt1);
        l1 = l;
        if (!matcher.find()) goto _L2; else goto _L3
_L3:
        long l3;
        try
        {
            l1 = Long.parseLong(matcher.group(2));
            l2 = Long.parseLong(matcher.group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            Logger.c("Unexpected Content-Range [%s]", new Object[] {
                grt1
            });
            return l;
        }
        l3 = (l1 - l2) + 1L;
        if (l >= 0L) goto _L5; else goto _L4
_L4:
        l1 = l3;
_L2:
        return l1;
_L5:
        l1 = l;
        if (l == l3) goto _L2; else goto _L6
_L6:
        Logger.b("Inconsistent headers [%s] [%s]", new Object[] {
            s, grt1
        });
        l1 = Math.max(l, l3);
        return l1;
    }

    private grq b(bde bde1)
    {
        grr grr1;
        f.a(8000L, TimeUnit.MILLISECONDS);
        f.b(8000L, TimeUnit.MILLISECONDS);
        grr1 = (new grr()).a(new URL(bde1.a.toString())).b("User-Agent", d);
        if ((bde1.f & 1) == 0)
        {
            grr1.b("Accept-Encoding", "identity");
        }
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); grr1.b((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_154;
        bde1;
        hashmap;
        JVM INSTR monitorexit ;
        throw bde1;
        hashmap;
        JVM INSTR monitorexit ;
        if (bde1.c != 0L || bde1.d != -1L)
        {
            StringBuilder stringbuilder = (new StringBuilder("bytes=")).append(bde1.c).append('-');
            if (bde1.d != -1L)
            {
                stringbuilder.append((bde1.c + bde1.d) - 1L);
            }
            grr1.b("Range", stringbuilder.toString());
        }
        return grr1.b();
    }

    public final int a(byte abyte0[], int l, int i1)
    {
        try
        {
            l = h.read(abyte0, l, i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException(abyte0, g);
        }
        if (l > 0)
        {
            k = k + (long)l;
            if (e != null)
            {
                e.a(l);
            }
        } else
        if (j != -1L && j != k)
        {
            throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException(new EOFException(), g);
        }
        return l;
    }

    public final long a(bde bde1)
    {
        g = bde1;
        k = 0L;
        Object obj;
        int l;
        try
        {
            obj = b(bde1);
            obj = f.a(((grq) (obj))).a();
            b = (long)((grt) (obj)).j().a() * 1000L;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException((new StringBuilder("Unable to connect to ")).append(bde1.a.toString()).toString(), ((IOException) (obj)), bde1);
        }
        l = ((grt) (obj)).a();
        if (l < 200 || l > 299)
        {
            if (l == 503 && ((grt) (obj)).e() != null && "Offline mode enabled".equals(((grt) (obj)).e().f()))
            {
                throw new NetworkAccessWhileInOfflineModeException();
            }
            HashMap hashmap = new HashMap();
            String s;
            for (Iterator iterator = ((grt) (obj)).d().a().iterator(); iterator.hasNext(); hashmap.put(s, ((grt) (obj)).a(s)))
            {
                s = (String)iterator.next();
            }

            throw new InvalidResponseCodeException(l, hashmap, ((grt) (obj)).e().f(), bde1);
        }
        ((grt) (obj)).e().a().a();
        long l1 = a(((grt) (obj)));
        if (bde1.d != -1L)
        {
            l1 = bde1.d;
        }
        j = l1;
        try
        {
            h = ((grt) (obj)).e().d();
        }
        catch (IOException ioexception)
        {
            throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException(ioexception, bde1);
        }
        i = true;
        if (e != null)
        {
            e.b();
        }
        return j;
    }

    public final String a()
    {
        if (g != null)
        {
            return g.a.toString();
        } else
        {
            return null;
        }
    }

    public final void b()
    {
        InputStream inputstream = h;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        h.close();
        h = null;
        if (i)
        {
            i = false;
            if (e != null)
            {
                e.c();
            }
        }
        return;
        Object obj;
        obj;
        throw new com.google.android.exoplayer.upstream.HttpDataSource.HttpDataSourceException(((IOException) (obj)), g);
        obj;
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

    static 
    {
        new Object() {

        };
    }
}
