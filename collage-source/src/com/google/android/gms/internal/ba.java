// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal:
//            ay, au, bd, gw

public class ba
{

    BlockingQueue a;
    ExecutorService b;
    LinkedHashMap c;
    String d;
    final Context e;
    final String f;
    private AtomicBoolean g;
    private File h;

    public ba(Context context, String s, String s1, Map map)
    {
        c = new LinkedHashMap();
        e = context;
        f = s;
        d = s1;
        g = new AtomicBoolean(false);
        g.set(((Boolean)ay.I.c()).booleanValue());
        if (g.get())
        {
            context = Environment.getExternalStorageDirectory();
            if (context != null)
            {
                h = new File(context, "sdk_csi_data.txt");
            }
        }
        for (context = map.entrySet().iterator(); context.hasNext(); c.put(s.getKey(), s.getValue()))
        {
            s = (java.util.Map.Entry)context.next();
        }

        a = new ArrayBlockingQueue(30);
        b = Executors.newSingleThreadExecutor();
        b.execute(new zzca._cls1(this));
    }

    private void a()
    {
        do
        {
            bd bd1;
            String s;
            do
            {
                bd1 = (bd)a.take();
                s = bd1.c();
            } while (TextUtils.isEmpty(s));
            c.putAll(bd1.d());
            a(((Map) (c)), s);
        } while (true);
        InterruptedException interruptedexception;
        interruptedexception;
        zzb.zzd("CsiReporter:reporter interrupted", interruptedexception);
        return;
    }

    static void a(ba ba1)
    {
        ba1.a();
    }

    private void a(File file, String s)
    {
        if (file == null) goto _L2; else goto _L1
_L1:
        FileOutputStream fileoutputstream = new FileOutputStream(file, true);
        file = fileoutputstream;
        fileoutputstream.write(s.getBytes());
        file = fileoutputstream;
        fileoutputstream.write(10);
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        fileoutputstream.close();
_L4:
        return;
        file;
        zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", file);
        return;
        IOException ioexception;
        ioexception;
        s = null;
_L7:
        file = s;
        zzb.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", ioexception);
        if (s == null) goto _L4; else goto _L3
_L3:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", file);
        }
        return;
        s;
        file = null;
_L6:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", file);
            }
        }
        throw s;
_L2:
        zzb.zzaE("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
        return;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        s = fileoutputstream;
          goto _L7
    }

    private void a(Map map, String s)
    {
        map = a(d, map, s);
        if (g.get())
        {
            a(h, ((String) (map)));
            return;
        } else
        {
            zzp.zzbx().a(e, f, map);
            return;
        }
    }

    String a(String s, Map map, String s1)
    {
        s = Uri.parse(s).buildUpon();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); s.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        s = new StringBuilder(s.build().toString());
        s.append("&").append("it").append("=").append(s1);
        return s.toString();
    }

    public void a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            c.put("e", TextUtils.join(",", list));
        }
    }

    public boolean a(bd bd1)
    {
        return a.offer(bd1);
    }
}
