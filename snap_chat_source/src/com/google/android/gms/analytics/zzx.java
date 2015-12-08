// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.zzik;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.analytics:
//            zzf, zzae, zzw, GoogleAnalytics, 
//            zzak, zzan, zzk, zzy, 
//            zzac

class zzx extends Thread
    implements zzf
{
    class zzb
        implements Runnable
    {

        final zzx zzCP;

        public void run()
        {
            zzx.zzd(zzCP).dispatch();
        }

        private zzb()
        {
            zzCP = zzx.this;
            super();
        }

    }

    class zzc
        implements Runnable
    {

        final zzx zzCP;

        public void run()
        {
            zzx.zzd(zzCP).zzfh();
        }

        private zzc()
        {
            zzCP = zzx.this;
            super();
        }

    }

    class zzd
        implements Runnable
    {

        final zzx zzCP;
        private final Map zzCQ;

        private void zzA(Map map)
        {
            zzg zzg = zzx.zza(zzCP).zzgo();
            com.google.android.gms.analytics.zzan.zza(map, "&an", zzg);
            com.google.android.gms.analytics.zzan.zza(map, "&av", zzg);
            com.google.android.gms.analytics.zzan.zza(map, "&aid", zzg);
            com.google.android.gms.analytics.zzan.zza(map, "&aiid", zzg);
            map.put("&v", "1");
        }

        private boolean zzB(Map map)
        {
            if (map.get("&sf") == null)
            {
                return false;
            }
            double d = com.google.android.gms.analytics.zzan.zza((String)map.get("&sf"), 100D);
            if (d >= 100D)
            {
                return false;
            }
            if ((double)(zzx.zzan((String)map.get("&cid")) % 10000) >= d * 100D)
            {
                if (map.get("&t") == null)
                {
                    map = "unknown";
                } else
                {
                    map = (String)map.get("&t");
                }
                zzae.zzab(String.format("%s hit sampled out", new Object[] {
                    map
                }));
                return true;
            } else
            {
                return false;
            }
        }

        private String zzy(Map map)
        {
            if (map.containsKey("useSecure"))
            {
                if (com.google.android.gms.analytics.zzan.zze((String)map.get("useSecure"), true))
                {
                    return "https:";
                } else
                {
                    return "http:";
                }
            } else
            {
                return "https:";
            }
        }

        private void zzz(Map map)
        {
            zzx.zza(zzCP).getContext();
            zza zza1 = zzx.zza(zzCP).zzgq();
            com.google.android.gms.analytics.zzan.zza(map, "&adid", zza1);
            com.google.android.gms.analytics.zzan.zza(map, "&ate", zza1);
        }

        public void run()
        {
            zzz(zzCQ);
            if (TextUtils.isEmpty((CharSequence)zzCQ.get("&cid")))
            {
                zzk zzk1 = zzx.zza(zzCP).zzgp();
                zzCQ.put("&cid", zzk1.getValue("&cid"));
            }
            if (zzx.zza(zzCP).getAppOptOut() || zzB(zzCQ))
            {
                return;
            }
            if (!TextUtils.isEmpty(zzx.zzb(zzCP)))
            {
                com.google.android.gms.analytics.zzy.zzfV().zzF(true);
                Object obj = (new HitBuilders.HitBuilder()).setCampaignParamsFromUrl(zzx.zzb(zzCP));
                zzx.zza(zzCP, null);
                obj = ((HitBuilders.HitBuilder) (obj)).build();
                com.google.android.gms.analytics.zzy.zzfV().zzF(false);
                zzCQ.putAll(((Map) (obj)));
            }
            zzA(zzCQ);
            Map map = zzac.zzC(zzCQ);
            zzx.zzd(zzCP).zzb(map, Long.valueOf((String)zzCQ.get("&ht")).longValue(), zzy(zzCQ), zzx.zzc(zzCP));
        }

        zzd(Map map)
        {
            zzCP = zzx.this;
            super();
            zzCQ = new HashMap(map);
            map = (String)map.get("&ht");
            zzx1 = map;
            if (map == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            Long.valueOf(map);
            zzx1 = map;
_L2:
            if (zzx.this == null)
            {
                long l = System.currentTimeMillis();
                zzCQ.put("&ht", Long.toString(l));
            }
            return;
            zzx1;
            zzx1 = null;
            if (true) goto _L2; else goto _L1
_L1:
        }
    }


    private volatile boolean mClosed;
    private final GoogleAnalytics zzBN;
    private final LinkedBlockingQueue zzCJ = new LinkedBlockingQueue();
    private volatile boolean zzCK;
    private volatile String zzCL;
    private volatile zzak zzCM;
    private final Lock zzCN = new ReentrantLock();
    private final List zzCO = new ArrayList();

    zzx(GoogleAnalytics googleanalytics, zzak zzak1)
    {
        super("GAThread");
        com.google.android.gms.common.internal.zzx.zzl(googleanalytics);
        zzBN = googleanalytics;
        zzCM = zzak1;
        zzCO.add(new zzik("appendVersion", "&_v".substring(1), "ma4.0.6"));
        start();
    }

    static String zzH(Context context)
    {
        FileInputStream fileinputstream = context.openFileInput("gaInstallData");
        Object obj = fileinputstream;
        byte abyte0[] = new byte[8192];
        obj = fileinputstream;
        int i = fileinputstream.read(abyte0, 0, 8192);
        obj = fileinputstream;
        if (fileinputstream.available() <= 0) goto _L2; else goto _L1
_L1:
        obj = fileinputstream;
        zzae.zzZ("Too much campaign data, ignoring it.");
        obj = fileinputstream;
        fileinputstream.close();
        context.deleteFile("gaInstallData");
_L6:
        return null;
_L2:
        obj = fileinputstream;
        fileinputstream.close();
        context.deleteFile("gaInstallData");
        if (i > 0) goto _L4; else goto _L3
_L3:
        zzae.zzac("Campaign file is empty.");
        return null;
        context;
        fileinputstream = null;
_L11:
        obj = fileinputstream;
        zzae.zzaa("No campaign data found.");
        if (fileinputstream == null) goto _L6; else goto _L5
_L5:
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzae.zzZ((new StringBuilder("Failed to close campaign data in stream: ")).append(context).toString());
            return null;
        }
        return null;
_L4:
        obj = new String(abyte0, 0, i);
        zzae.zzaa((new StringBuilder("Campaign found: ")).append(((String) (obj))).toString());
        return ((String) (obj));
        obj;
        fileinputstream = null;
_L10:
        obj = fileinputstream;
        zzae.zzZ("Error reading campaign data.");
        obj = fileinputstream;
        context.deleteFile("gaInstallData");
        if (fileinputstream == null) goto _L6; else goto _L7
_L7:
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzae.zzZ((new StringBuilder("Failed to close campaign data in stream: ")).append(context).toString());
            return null;
        }
        return null;
        context;
        obj = null;
_L9:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                zzae.zzZ((new StringBuilder("Failed to close campaign data in stream: ")).append(ioexception).toString());
            }
        }
        throw context;
        context;
        if (true) goto _L9; else goto _L8
_L8:
        IOException ioexception1;
        ioexception1;
          goto _L10
        context;
          goto _L11
    }

    static GoogleAnalytics zza(zzx zzx1)
    {
        return zzx1.zzBN;
    }

    static String zza(zzx zzx1, String s)
    {
        zzx1.zzCL = s;
        return s;
    }

    static int zzan(String s)
    {
        int k = 1;
        if (!TextUtils.isEmpty(s))
        {
            int j = s.length();
            int i = 0;
            j--;
            do
            {
                k = i;
                if (j < 0)
                {
                    break;
                }
                k = s.charAt(j);
                k = (i << 6 & 0xfffffff) + k + (k << 14);
                int l = 0xfe00000 & k;
                i = k;
                if (l != 0)
                {
                    i = k ^ l >> 21;
                }
                j--;
            } while (true);
        }
        return k;
    }

    static String zzb(zzx zzx1)
    {
        return zzx1.zzCL;
    }

    static List zzc(zzx zzx1)
    {
        return zzx1.zzCO;
    }

    private void zzc(Runnable runnable)
    {
        zzCJ.add(runnable);
    }

    static zzak zzd(zzx zzx1)
    {
        return zzx1.zzCM;
    }

    private String zzf(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    public void dispatch()
    {
        zzc(new zzb());
    }

    public Thread getThread()
    {
        return this;
    }

    protected void init()
    {
        this;
        JVM INSTR monitorenter ;
        zzak zzak1 = zzCM;
        if (zzak1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzCM = new zzw(zzBN.getContext(), this);
        zzCM.zzfM();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        Process.setThreadPriority(10);
        Runnable runnable;
        Object obj;
        try
        {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedexception)
        {
            zzae.zzac("sleep interrupted in GAThread initialize");
        }
        try
        {
            init();
            zzCL = zzH(zzBN.getContext());
            zzae.zzab("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            zzae.zzZ((new StringBuilder("Error initializing the GAThread: ")).append(zzf(throwable)).toString());
            zzae.zzZ("Google Analytics will not start up.");
            zzCK = true;
        }
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)zzCJ.take();
        zzCN.lock();
        if (!zzCK)
        {
            runnable.run();
        }
        zzCN.unlock();
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            zzae.zzaa(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzae.zzZ((new StringBuilder("Error on GAThread: ")).append(zzf(((Throwable) (obj)))).toString());
            zzae.zzZ("Google Analytics is shutting down.");
            zzCK = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_35;
        Exception exception;
        exception;
        zzCN.unlock();
        throw exception;
_L1:
    }

    public void zzfh()
    {
        zzc(new zzc());
    }

    public LinkedBlockingQueue zzfi()
    {
        return zzCJ;
    }

    public void zzx(Map map)
    {
        zzc(new zzd(map));
    }
}
