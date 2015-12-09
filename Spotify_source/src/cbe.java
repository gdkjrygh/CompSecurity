// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cbe
{

    BlockingQueue a;
    public LinkedHashMap b;
    String c;
    final Context d;
    final String e;
    AtomicBoolean f;
    File g;
    private ExecutorService h;
    private Map i;

    public cbe(Context context, String s, String s1, Map map)
    {
        b = new LinkedHashMap();
        i = new HashMap();
        d = context;
        e = s;
        c = s1;
        f = new AtomicBoolean(false);
        context = f;
        s = cbb.w;
        context.set(((Boolean)bkv.n().a(s)).booleanValue());
        if (f.get())
        {
            context = Environment.getExternalStorageDirectory();
            if (context != null)
            {
                g = new File(context, "sdk_csi_data.txt");
            }
        }
        for (context = map.entrySet().iterator(); context.hasNext(); b.put(s.getKey(), s.getValue()))
        {
            s = (java.util.Map.Entry)context.next();
        }

        a = new ArrayBlockingQueue(30);
        h = Executors.newSingleThreadExecutor();
        h.execute(new Runnable() {

            private cbe a;

            public final void run()
            {
                cbe cbe1 = a;
_L5:
                Object obj;
                Object obj1;
                do
                {
                    obj1 = (cbk)cbe1.a.take();
                    obj = ((cbk) (obj1)).c();
                } while (TextUtils.isEmpty(((CharSequence) (obj))));
                Object obj2 = cbe1.a(cbe1.b, ((cbk) (obj1)).d());
                obj1 = Uri.parse(cbe1.c).buildUpon();
                java.util.Map.Entry entry;
                for (obj2 = ((Map) (obj2)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); ((android.net.Uri.Builder) (obj1)).appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
                }

                break MISSING_BLOCK_LABEL_127;
                obj;
                bka.c("CsiReporter:reporter interrupted", ((Throwable) (obj)));
                return;
                Object obj3;
                obj1 = new StringBuilder(((android.net.Uri.Builder) (obj1)).build().toString());
                ((StringBuilder) (obj1)).append("&it=").append(((String) (obj)));
                obj3 = ((StringBuilder) (obj1)).toString();
                if (!cbe1.f.get()) goto _L2; else goto _L1
_L1:
                obj = cbe1.g;
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
                    bka.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
                }
                  goto _L5
                obj3;
                obj1 = null;
_L7:
                obj = obj1;
                bka.c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", ((Throwable) (obj3)));
                if (obj1 != null)
                {
                    try
                    {
                        ((FileOutputStream) (obj1)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        bka.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
                    }
                }
                  goto _L5
                Exception exception;
                exception;
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
                        bka.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", ioexception);
                    }
                }
                throw exception;
_L4:
                bka.e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                  goto _L5
_L2:
                bkv.e();
                cjj.a(cbe1.d, cbe1.e, ((String) (obj3)));
                  goto _L5
                exception;
                  goto _L6
                obj3;
                  goto _L7
            }

            
            {
                a = cbe.this;
                super();
            }
        });
        i.put("action", cbh.b);
        i.put("ad_format", cbh.b);
        i.put("e", cbh.c);
    }

    public final cbh a(String s)
    {
        s = (cbh)i.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return cbh.a;
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

    public final boolean a(cbk cbk)
    {
        return a.offer(cbk);
    }
}
