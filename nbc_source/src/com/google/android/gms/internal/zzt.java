// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
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

// Referenced classes of package com.google.android.gms.internal:
//            zzf, zzs, zzu, zzk, 
//            zzo, zzr, zzp, zzaa, 
//            zzy, zzi, zzq, zza, 
//            zzj, zzh

public class zzt
    implements zzf
{

    protected static final boolean DEBUG;
    private static int zzao = 3000;
    private static int zzap = 4096;
    protected final zzy zzaq;
    protected final zzu zzar;

    public zzt(zzy zzy1)
    {
        this(zzy1, new zzu(zzap));
    }

    public zzt(zzy zzy1, zzu zzu1)
    {
        zzaq = zzy1;
        zzar = zzu1;
    }

    protected static Map zza(Header aheader[])
    {
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < aheader.length; i++)
        {
            treemap.put(aheader[i].getName(), aheader[i].getValue());
        }

        return treemap;
    }

    private void zza(long l, zzk zzk1, byte abyte0[], StatusLine statusline)
    {
        if (DEBUG || l > (long)zzao)
        {
            if (abyte0 != null)
            {
                abyte0 = Integer.valueOf(abyte0.length);
            } else
            {
                abyte0 = "null";
            }
            zzs.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                zzk1, Long.valueOf(l), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(zzk1.zzu().zze())
            });
        }
    }

    private static void zza(String s, zzk zzk1, zzr zzr1)
        throws zzr
    {
        zzo zzo1 = zzk1.zzu();
        int i = zzk1.zzt();
        try
        {
            zzo1.zza(zzr1);
        }
        // Misplaced declaration of an exception variable
        catch (zzr zzr1)
        {
            zzk1.zzc(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw zzr1;
        }
        zzk1.zzc(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    private void zza(Map map, zzb.zza zza1)
    {
        if (zza1 != null)
        {
            if (zza1.zzb != null)
            {
                map.put("If-None-Match", zza1.zzb);
            }
            if (zza1.zzd > 0L)
            {
                map.put("If-Modified-Since", DateUtils.formatDate(new Date(zza1.zzd)));
                return;
            }
        }
    }

    private byte[] zza(HttpEntity httpentity)
        throws IOException, zzp
    {
        Object obj;
        Exception exception;
        zzaa zzaa1;
        zzaa1 = new zzaa(zzar, (int)httpentity.getContentLength());
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
            zzs.zza("Error occured when calling consumingContent", new Object[0]);
        }
        zzar.zza(((byte []) (obj)));
        zzaa1.close();
        throw exception;
        obj = exception;
        abyte0 = zzar.zzb(1024);
_L2:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        zzaa1.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte1 = zzaa1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            zzs.zza("Error occured when calling consumingContent", new Object[0]);
        }
        zzar.zza(abyte0);
        zzaa1.close();
        return abyte1;
    }

    public zzi zza(zzk zzk1)
        throws zzr
    {
        long l = SystemClock.elapsedRealtime();
_L3:
        Object obj2;
        Object obj4;
        obj4 = null;
        obj2 = Collections.emptyMap();
        Object obj1;
        HashMap hashmap = new HashMap();
        zza(((Map) (hashmap)), zzk1.zzi());
        obj1 = zzaq.zza(zzk1, hashmap);
        Object obj = obj2;
        Object obj3 = ((HttpResponse) (obj1)).getStatusLine();
        obj = obj2;
        int i = ((StatusLine) (obj3)).getStatusCode();
        obj = obj2;
        obj4 = zza(((HttpResponse) (obj1)).getAllHeaders());
        if (i != 304)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj = obj4;
        obj2 = zzk1.zzi();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = obj4;
        return new zzi(304, null, ((Map) (obj4)), true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        ((zzb.zza) (obj2)).zzg.putAll(((Map) (obj4)));
        obj = obj4;
        return new zzi(304, ((zzb.zza) (obj2)).data, ((zzb.zza) (obj2)).zzg, true, SystemClock.elapsedRealtime() - l);
        obj = obj4;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L2; else goto _L1
_L1:
        obj = obj4;
        obj2 = zza(((HttpResponse) (obj1)).getEntity());
        obj = obj2;
_L4:
        zza(SystemClock.elapsedRealtime() - l, zzk1, ((byte []) (obj)), ((StatusLine) (obj3)));
        if (i >= 200 && i <= 299)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        throw new IOException();
        obj;
        zza("socket", zzk1, ((zzr) (new zzq())));
          goto _L3
_L2:
        obj = obj4;
        obj2 = new byte[0];
        obj = obj2;
          goto _L4
        obj2 = new zzi(i, ((byte []) (obj)), ((Map) (obj4)), false, SystemClock.elapsedRealtime() - l);
        return ((zzi) (obj2));
        obj;
        zza("connection", zzk1, ((zzr) (new zzq())));
          goto _L3
        obj;
        throw new RuntimeException((new StringBuilder()).append("Bad URL ").append(zzk1.getUrl()).toString(), ((Throwable) (obj)));
        obj1;
        obj3 = null;
        obj = obj2;
        obj2 = obj4;
_L5:
        if (obj2 != null)
        {
            int j = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
            zzs.zzc("Unexpected response code %d for %s", new Object[] {
                Integer.valueOf(j), zzk1.getUrl()
            });
            if (obj3 != null)
            {
                obj = new zzi(j, ((byte []) (obj3)), ((Map) (obj)), false, SystemClock.elapsedRealtime() - l);
                if (j == 401 || j == 403)
                {
                    zza("auth", zzk1, ((zzr) (new zza(((zzi) (obj))))));
                } else
                {
                    throw new zzp(((zzi) (obj)));
                }
            } else
            {
                throw new zzh(null);
            }
        } else
        {
            throw new zzj(((Throwable) (obj1)));
        }
          goto _L3
        obj4;
        obj3 = null;
        obj2 = obj1;
        obj1 = obj4;
          goto _L5
        IOException ioexception;
        ioexception;
        obj2 = obj1;
        obj1 = ioexception;
        ioexception = ((IOException) (obj));
        obj = obj4;
          goto _L5
    }

    static 
    {
        DEBUG = zzs.DEBUG;
    }
}
