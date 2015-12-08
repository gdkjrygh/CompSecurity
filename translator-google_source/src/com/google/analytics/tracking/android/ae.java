// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.analytics.tracking.android:
//            j, aq, bk, bg, 
//            q, ag, ah, ai, 
//            af, GAServiceProxy, be, ar, 
//            au, am, k

final class ae extends Thread
    implements j
{

    private static ae i;
    private final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private volatile boolean b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile List e;
    private volatile ar f;
    private volatile String g;
    private volatile String h;
    private volatile be j;
    private final Context k;

    private ae(Context context)
    {
        super("GAThread");
        b = false;
        c = false;
        if (context != null)
        {
            k = context.getApplicationContext();
        } else
        {
            k = context;
        }
        start();
    }

    static ae a(Context context)
    {
        if (i == null)
        {
            i = new ae(context);
        }
        return i;
    }

    static String a(ae ae1)
    {
        return ae1.h;
    }

    private static String a(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    static void a(ae ae1, Map map)
    {
        String s;
        String s1;
        String s2;
        PackageManager packagemanager;
        packagemanager = ae1.k.getPackageManager();
        s = ae1.k.getPackageName();
        s2 = packagemanager.getInstallerPackageName(s);
        s1 = null;
        Object obj = packagemanager.getPackageInfo(ae1.k.getPackageName(), 0);
        if (obj == null) goto _L2; else goto _L1
_L1:
        ae1 = packagemanager.getApplicationLabel(((PackageInfo) (obj)).applicationInfo).toString();
        obj = ((PackageInfo) (obj)).versionName;
        s1 = ((String) (obj));
_L5:
        a(map, "appName", ((String) (ae1)));
        a(map, "appVersion", s1);
        a(map, "appId", s);
        a(map, "appInstallerId", s2);
        map.put("apiVersion", "1");
        return;
        ae1;
        ae1 = s;
_L3:
        aq.b((new StringBuilder("Error retrieving package info: appName set to ")).append(ae1).toString());
        continue; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (true) goto _L3; else goto _L2
_L2:
        ae1 = s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(Runnable runnable)
    {
        a.add(runnable);
    }

    private static void a(Map map, String s, String s1)
    {
        if (!map.containsKey(s))
        {
            map.put(s, s1);
        }
    }

    private boolean a(String s)
    {
        try
        {
            FileOutputStream fileoutputstream = k.openFileOutput("gaClientId", 0);
            fileoutputstream.write(s.getBytes());
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aq.b("Error creating clientId file.");
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aq.b("Error writing to clientId file.");
            return false;
        }
        return true;
    }

    private static String b(Context context)
    {
        Object obj;
        byte abyte0[];
        int l;
        obj = context.openFileInput("gaInstallData");
        abyte0 = new byte[8192];
        l = ((FileInputStream) (obj)).read(abyte0, 0, 8192);
        if (((FileInputStream) (obj)).available() <= 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        aq.b("Too much campaign data, ignoring it.");
        ((FileInputStream) (obj)).close();
        context.deleteFile("gaInstallData");
        return null;
        try
        {
            ((FileInputStream) (obj)).close();
            context.deleteFile("gaInstallData");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            aq.c("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            aq.b("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (l > 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        aq.f("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, l);
        aq.c((new StringBuilder("Campaign found: ")).append(((String) (obj))).toString());
        return ((String) (obj));
    }

    static void b(ae ae1, Map map)
    {
label0:
        {
            Object obj = (String)map.get("rawException");
            if (obj == null)
            {
                break label0;
            }
            map.remove("rawException");
            obj = new ByteArrayInputStream(bk.e(((String) (obj))));
            ArrayList arraylist;
            try
            {
                obj = new ObjectInputStream(((java.io.InputStream) (obj)));
                Object obj1 = ((ObjectInputStream) (obj)).readObject();
                ((ObjectInputStream) (obj)).close();
                if (!(obj1 instanceof Throwable))
                {
                    break label0;
                }
                obj = (Throwable)obj1;
            }
            // Misplaced declaration of an exception variable
            catch (ae ae1)
            {
                aq.f("IOException reading exception");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ae ae1)
            {
                aq.f("ClassNotFoundException reading exception");
                return;
            }
            arraylist = new ArrayList();
            map.put("exDescription", (new bg(ae1.k, arraylist)).a((String)map.get("exceptionThreadName"), ((Throwable) (obj))));
        }
    }

    static boolean b(ae ae1)
    {
        return ae1.d;
    }

    static boolean b(Map map)
    {
        if (map.get("sampleRate") != null)
        {
            double d1 = bk.b((String)map.get("sampleRate"));
            if (d1 <= 0.0D)
            {
                return true;
            }
            if (d1 < 100D)
            {
                map = (String)map.get("clientId");
                if (map != null && (double)(Math.abs(map.hashCode()) % 10000) >= d1 * 100D)
                {
                    return true;
                }
            }
        }
        return false;
    }

    static String c(ae ae1)
    {
        return ae1.g;
    }

    static void c(Map map)
    {
        Object obj = bk.d((String)map.get("campaign"));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = bk.a(((String) (obj)));
            map.put("campaignContent", ((Map) (obj)).get("utm_content"));
            map.put("campaignMedium", ((Map) (obj)).get("utm_medium"));
            map.put("campaignName", ((Map) (obj)).get("utm_campaign"));
            map.put("campaignSource", ((Map) (obj)).get("utm_source"));
            map.put("campaignKeyword", ((Map) (obj)).get("utm_term"));
            map.put("campaignId", ((Map) (obj)).get("utm_id"));
            map.put("gclid", ((Map) (obj)).get("gclid"));
            map.put("dclid", ((Map) (obj)).get("dclid"));
            map.put("gmob_t", ((Map) (obj)).get("gmob_t"));
        }
    }

    private String d()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        obj1 = null;
        Object obj;
        FileInputStream fileinputstream;
        int l;
        fileinputstream = k.openFileInput("gaClientId");
        obj = new byte[128];
        l = fileinputstream.read(((byte []) (obj)), 0, 128);
        if (fileinputstream.available() > 0)
        {
            aq.b("clientId file seems corrupted, deleting it.");
            fileinputstream.close();
            k.deleteFile("gaInstallData");
        }
        if (l > 0) goto _L2; else goto _L1
_L1:
        aq.b("clientId file seems empty, deleting it.");
        fileinputstream.close();
        k.deleteFile("gaInstallData");
        obj = obj1;
_L8:
        obj1 = obj;
        if (obj == null)
        {
            obj = UUID.randomUUID().toString().toLowerCase();
            obj1 = obj;
            if (!a(((String) (obj))))
            {
                obj1 = "0";
            }
        }
        return ((String) (obj1));
_L2:
        obj = new String(((byte []) (obj)), 0, l);
        fileinputstream.close();
        continue; /* Loop/switch isn't completed */
        obj;
        obj = obj2;
_L6:
        aq.b("Error reading clientId file, deleting it.");
        k.deleteFile("gaInstallData");
        continue; /* Loop/switch isn't completed */
        obj;
        obj = obj3;
_L4:
        aq.b("cliendId file doesn't have long value, deleting it.");
        k.deleteFile("gaInstallData");
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        continue; /* Loop/switch isn't completed */
        FileNotFoundException filenotfoundexception1;
        filenotfoundexception1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static String d(ae ae1)
    {
        ae1.g = null;
        return null;
    }

    static String d(Map map)
    {
label0:
        {
label1:
            {
                String s1 = (String)map.get("internalHitUrl");
                String s = s1;
                if (s1 == null)
                {
                    if (!map.containsKey("useSecure"))
                    {
                        break label0;
                    }
                    if (!bk.c((String)map.get("useSecure")))
                    {
                        break label1;
                    }
                    s = "https://ssl.google-analytics.com/collect";
                }
                return s;
            }
            return "http://www.google-analytics.com/collect";
        }
        return "https://ssl.google-analytics.com/collect";
    }

    static ar e(ae ae1)
    {
        return ae1.f;
    }

    static List f(ae ae1)
    {
        return ae1.e;
    }

    static be g(ae ae1)
    {
        return ae1.j;
    }

    public final void a()
    {
        a(((Runnable) (new ag(this))));
    }

    public final void a(am am)
    {
        a(((Runnable) (new ah(this, am))));
    }

    public final void a(k k1)
    {
        a(((Runnable) (new ai(this, k1))));
    }

    public final void a(Map map)
    {
        map = new HashMap(map);
        long l = System.currentTimeMillis();
        map.put("hitTime", Long.toString(l));
        a(((Runnable) (new af(this, map, l))));
    }

    public final LinkedBlockingQueue b()
    {
        return a;
    }

    public final Thread c()
    {
        return this;
    }

    public final void run()
    {
        Runnable runnable;
        Object obj;
        try
        {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedexception)
        {
            aq.f("sleep interrupted in GAThread initialize");
        }
        try
        {
            if (j == null)
            {
                j = new GAServiceProxy(k, this, (byte)0);
            }
            j.d();
            e = new ArrayList();
            e.add(new Command("appendVersion", "_v", "ma1b6"));
            e.add(new Command("appendQueueTime", "qt", null));
            e.add(new Command("appendCacheBuster", "z", null));
            f = new ar();
            au.a(f);
            d = k.getFileStreamPath("gaOptOut").exists();
            h = d();
            g = b(k);
        }
        catch (Throwable throwable)
        {
            aq.b((new StringBuilder("Error initializing the GAThread: ")).append(a(throwable)).toString());
            aq.b("Google Analytics will not start up.");
            b = true;
        }
        if (c)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)a.take();
        if (!b)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            aq.c(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aq.b((new StringBuilder("Error on GAThread: ")).append(a(((Throwable) (obj)))).toString());
            aq.b("Google Analytics is shutting down.");
            b = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_178;
_L1:
    }
}
