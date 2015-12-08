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
import java.util.HashMap;
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
//            cy, cx, dd, dg, 
//            dm, qa

public final class dc
{

    BlockingQueue a;
    ExecutorService b;
    LinkedHashMap c;
    Map d;
    String e;
    final Context f;
    final String g;
    private AtomicBoolean h;
    private File i;

    public dc(Context context, String s, String s1, Map map)
    {
        c = new LinkedHashMap();
        d = new HashMap();
        f = context;
        g = s;
        e = s1;
        h = new AtomicBoolean(false);
        context = h;
        s = cy.I;
        context.set(((Boolean)zzp.zzbE().a(s)).booleanValue());
        if (h.get())
        {
            context = Environment.getExternalStorageDirectory();
            if (context != null)
            {
                i = new File(context, "sdk_csi_data.txt");
            }
        }
        for (context = map.entrySet().iterator(); context.hasNext(); c.put(s.getKey(), s.getValue()))
        {
            s = (java.util.Map.Entry)context.next();
        }

        a = new ArrayBlockingQueue(30);
        b = Executors.newSingleThreadExecutor();
        b.execute(new dd(this));
        d.put("action", dg.b);
        d.put("ad_format", dg.b);
        d.put("e", dg.c);
    }

    static void a(dc dc1)
    {
_L5:
        Object obj;
        Object obj1;
        do
        {
            obj1 = (dm)dc1.a.take();
            obj = ((dm) (obj1)).c();
        } while (TextUtils.isEmpty(((CharSequence) (obj))));
        Object obj2 = dc1.a(((Map) (dc1.c)), ((dm) (obj1)).d());
        obj1 = Uri.parse(dc1.e).buildUpon();
        java.util.Map.Entry entry;
        for (obj2 = ((Map) (obj2)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); ((android.net.Uri.Builder) (obj1)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
        }

        break MISSING_BLOCK_LABEL_117;
        dc1;
        zzb.zzd("CsiReporter:reporter interrupted", dc1);
        return;
        Object obj3;
        obj1 = new StringBuilder(((android.net.Uri.Builder) (obj1)).build().toString());
        ((StringBuilder) (obj1)).append("&it=").append(((String) (obj)));
        obj3 = ((StringBuilder) (obj1)).toString();
        if (!dc1.h.get()) goto _L2; else goto _L1
_L1:
        obj = dc1.i;
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj1 = new FileOutputStream(((File) (obj)), true);
        obj = obj1;
        ((FileOutputStream) (obj1)).write(((String) (obj3)).getBytes());
        obj = obj1;
        ((FileOutputStream) (obj1)).write(10);
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
        }
          goto _L5
        obj3;
        obj1 = null;
_L7:
        obj = obj1;
        zzb.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", ((Throwable) (obj3)));
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
            }
        }
          goto _L5
        dc1;
        obj = null;
_L6:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                zzb.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", ioexception);
            }
        }
        throw dc1;
_L4:
        zzb.zzaH("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
          goto _L5
_L2:
        zzp.zzbv();
        qa.a(dc1.f, dc1.g, ((String) (obj3)));
          goto _L5
        dc1;
          goto _L6
        obj3;
          goto _L7
    }

    public final dg a(String s)
    {
        s = (dg)d.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return dg.a;
        }
    }

    final Map a(Map map, Map map1)
    {
        map = new LinkedHashMap(map);
        if (map1 == null)
        {
            return map;
        }
        String s;
        Object obj;
        String s1;
        for (map1 = map1.entrySet().iterator(); map1.hasNext(); map.put(s, a(s).a(s1, ((String) (obj)))))
        {
            obj = (java.util.Map.Entry)map1.next();
            s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (String)((java.util.Map.Entry) (obj)).getValue();
            s1 = (String)map.get(s);
        }

        return map;
    }

    public final void a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            c.put("e", TextUtils.join(",", list));
        }
    }

    public final boolean a(dm dm1)
    {
        return a.offer(dm1);
    }
}
