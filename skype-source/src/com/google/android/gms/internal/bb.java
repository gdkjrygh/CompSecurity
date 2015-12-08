// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
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
//            ay, ax, be, gm

public final class bb
{

    BlockingQueue a;
    ExecutorService b;
    LinkedHashMap c;
    String d;
    final Context e;
    final String f;
    private AtomicBoolean g;
    private File h;

    public bb(Context context, String s, String s1, Map map)
    {
        c = new LinkedHashMap();
        e = context;
        f = s;
        d = s1;
        g = new AtomicBoolean(false);
        context = g;
        s = ay.I;
        context.set(((Boolean)p.n().a(s)).booleanValue());
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
        b.execute(new Runnable() {

            final bb a;

            public final void run()
            {
                bb.a(a);
            }

            
            {
                a = bb.this;
                super();
            }
        });
    }

    static void a(bb bb1)
    {
_L5:
        Object obj;
        Object obj1;
        do
        {
            obj1 = (be)bb1.a.take();
            obj = ((be) (obj1)).c();
        } while (TextUtils.isEmpty(((CharSequence) (obj))));
        bb1.c.putAll(((be) (obj1)).d());
        Object obj2 = bb1.c;
        obj1 = Uri.parse(bb1.d).buildUpon();
        java.util.Map.Entry entry;
        for (obj2 = ((Map) (obj2)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); ((android.net.Uri.Builder) (obj1)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
        }

        break MISSING_BLOCK_LABEL_120;
        bb1;
        com.google.android.gms.ads.internal.util.client.b.b("CsiReporter:reporter interrupted", bb1);
        return;
        Object obj3;
        obj1 = new StringBuilder(((android.net.Uri.Builder) (obj1)).build().toString());
        ((StringBuilder) (obj1)).append("&it=").append(((String) (obj)));
        obj3 = ((StringBuilder) (obj1)).toString();
        if (!bb1.g.get()) goto _L2; else goto _L1
_L1:
        obj = bb1.h;
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
            com.google.android.gms.ads.internal.util.client.b.b("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
        }
          goto _L5
        obj3;
        obj1 = null;
_L7:
        obj = obj1;
        com.google.android.gms.ads.internal.util.client.b.b("CsiReporter: Cannot write to file: sdk_csi_data.txt.", ((Throwable) (obj3)));
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.google.android.gms.ads.internal.util.client.b.b("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
            }
        }
          goto _L5
        bb1;
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
                com.google.android.gms.ads.internal.util.client.b.b("CsiReporter: Cannot close file: sdk_csi_data.txt.", ioexception);
            }
        }
        throw bb1;
_L4:
        com.google.android.gms.ads.internal.util.client.b.c("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
          goto _L5
_L2:
        p.e();
        gm.a(bb1.e, bb1.f, ((String) (obj3)));
          goto _L5
        bb1;
          goto _L6
        obj3;
          goto _L7
    }

    public final void a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            c.put("e", TextUtils.join(",", list));
        }
    }

    public final boolean a(be be1)
    {
        return a.offer(be1);
    }
}
