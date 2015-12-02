// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.androidcompat.AndroidCompat;
import com.facebook.tools.dextr.runtime.detour.ExecutorDetour;
import com.facebook.tools.dextr.runtime.detour.TracerDetour;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.common.udppriming.client:
//            UDPPrimingDNSInfo, UDPPacketSender, EncryptChannelInformation

public class ColdStartPrimingInformation
{

    private static final ColdStartPrimingInformation a = new ColdStartPrimingInformation();
    private static final ExecutorService b = Executors.newSingleThreadExecutor();
    private SharedPreferences c;
    private Context d;
    private String e;
    private volatile String f;
    private volatile String g;
    private volatile long h;
    private volatile int i;
    private volatile String j;
    private volatile String k;
    private volatile String l;
    private volatile String m;
    private volatile boolean n;
    private volatile boolean o;
    private volatile boolean p;
    private volatile boolean q;

    private ColdStartPrimingInformation()
    {
        f = null;
        g = null;
        h = -1L;
        i = -1;
        j = null;
        k = null;
        l = null;
        m = null;
        n = false;
        o = false;
        p = false;
        q = false;
    }

    public static ColdStartPrimingInformation a()
    {
        return a;
    }

    private void b(boolean flag)
    {
        if (l())
        {
            return;
        }
        if (Math.max(Runtime.getRuntime().availableProcessors(), 1) > 2)
        {
            c(flag);
            return;
        } else
        {
            d(flag);
            return;
        }
    }

    private void c(boolean flag)
    {
        ExecutorDetour.a(b, new _cls1(flag), 0x136b5c);
    }

    private void d(boolean flag)
    {
        android.os.StrictMode.ThreadPolicy threadpolicy;
        threadpolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy())).permitNetwork().build());
        a(flag);
        StrictMode.setThreadPolicy(threadpolicy);
        return;
        Exception exception;
        exception;
        StrictMode.setThreadPolicy(threadpolicy);
        throw exception;
    }

    private boolean g()
    {
        return o;
    }

    private boolean h()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = c;
        if (sharedpreferences != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        f = c.getString("COLD_START_PRIME_INFO/FIRST_FETCH_STRING", null);
        g = c.getString("COLD_START_PRIME_INFO/STORY_CURSOR", null);
        h = c.getLong("COLD_START_PRIME_INFO/LAST_HEAD_FETCH_TIME", -1L);
        i = c.getInt("COLD_START_PRIME_INFO/FROZEN_FEED_TIME", -1);
        j = c.getString("COLD_START_PRIME_INFO/USER_AGENT", null);
        k = c.getString("COLD_START_PRIME_INFO/USER_ID", null);
        m = c.getString("COLD_START_PRIME_INFO/HOST_NAME", null);
        n = c.getBoolean("COLD_START_PRIME_INFO/COLD_START_ADVANCE_PRIME_ENABLED", false);
        o = c.getBoolean("COLD_START_PRIME_INFO/COLD_START_ADVANCE_PRIME_FROM_NODEX_ENABLED", false);
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void i()
    {
        Throwable throwable1 = null;
        FileInputStream fileinputstream = d.openFileInput("FB4A_UDP_REQUEST_ID.txt");
        Object obj1 = new BufferedReader(new InputStreamReader(fileinputstream));
        String s = ((BufferedReader) (obj1)).readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (!s.isEmpty())
        {
            l = s;
            q = true;
        }
        ((BufferedReader) (obj1)).close();
        if (fileinputstream == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        fileinputstream.close();
        (new File(d.getFilesDir(), "FB4A_UDP_REQUEST_ID.txt")).delete();
        return;
        Throwable throwable;
        throwable;
        throw throwable;
        Object obj;
        obj;
_L8:
        if (throwable == null) goto _L2; else goto _L1
_L1:
        ((BufferedReader) (obj1)).close();
_L7:
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        throw throwable;
        obj;
_L9:
        if (fileinputstream == null) goto _L4; else goto _L3
_L3:
        if (throwable == null) goto _L6; else goto _L5
_L5:
        fileinputstream.close();
_L4:
        throw obj;
        obj;
        (new File(d.getFilesDir(), "FB4A_UDP_REQUEST_ID.txt")).delete();
        return;
        obj1;
        AndroidCompat.addSuppressed(throwable, ((Throwable) (obj1)));
          goto _L7
_L2:
        ((BufferedReader) (obj1)).close();
          goto _L7
        throwable1;
        AndroidCompat.addSuppressed(throwable, throwable1);
          goto _L4
        obj;
        Log.e("ColdStartPrimingInformation", "FB4A_UDP_REQUEST_ID.txt exception while reading", ((Throwable) (obj)));
        (new File(d.getFilesDir(), "FB4A_UDP_REQUEST_ID.txt")).delete();
        return;
_L6:
        fileinputstream.close();
          goto _L4
        obj;
        (new File(d.getFilesDir(), "FB4A_UDP_REQUEST_ID.txt")).delete();
        throw obj;
        obj;
        throwable = null;
          goto _L8
        obj;
        throwable = throwable1;
          goto _L9
    }

    private void j()
    {
        Throwable throwable1 = null;
        if (d != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        FileOutputStream fileoutputstream = d.openFileOutput("FB4A_UDP_REQUEST_ID.txt", 0);
        Object obj1 = new OutputStreamWriter(fileoutputstream);
        ((OutputStreamWriter) (obj1)).write(l);
        ((OutputStreamWriter) (obj1)).close();
        if (fileoutputstream == null) goto _L1; else goto _L3
        Throwable throwable;
        throwable;
        throw throwable;
        Object obj;
        obj;
_L11:
        if (throwable == null) goto _L5; else goto _L4
_L4:
        ((OutputStreamWriter) (obj1)).close();
_L10:
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        throw throwable;
        obj;
_L12:
        if (fileoutputstream == null) goto _L7; else goto _L6
_L6:
        if (throwable == null) goto _L9; else goto _L8
_L8:
        fileoutputstream.close();
_L7:
        throw obj;
_L3:
        try
        {
            fileoutputstream.close();
            return;
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            Log.e("ColdStartPrimingInformation", "FB4A_UDP_REQUEST_ID.txt file not present for write, not expected");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("ColdStartPrimingInformation", "FB4A_UDP_REQUEST_ID.txt exception while writing", ((Throwable) (obj)));
        }
        return;
        obj1;
        AndroidCompat.addSuppressed(throwable, ((Throwable) (obj1)));
          goto _L10
_L5:
        ((OutputStreamWriter) (obj1)).close();
          goto _L10
        throwable1;
        AndroidCompat.addSuppressed(throwable, throwable1);
          goto _L7
_L9:
        fileoutputstream.close();
          goto _L7
        obj;
        throwable = null;
          goto _L11
        obj;
        throwable = throwable1;
          goto _L12
    }

    private static UUID k()
    {
        android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskReads();
        UUID uuid = UUID.randomUUID();
        StrictMode.setThreadPolicy(threadpolicy);
        return uuid;
        Exception exception;
        exception;
        StrictMode.setThreadPolicy(threadpolicy);
        throw exception;
    }

    private boolean l()
    {
        while (h == -1L || i == -1 || System.currentTimeMillis() >= h + (long)i) 
        {
            return false;
        }
        return true;
    }

    public final void a(long l1, int i1)
    {
        if (c != null && (l1 != h || i1 != i))
        {
            android.content.SharedPreferences.Editor editor = c.edit();
            if (l1 != h)
            {
                h = l1;
                editor.putLong("COLD_START_PRIME_INFO/LAST_HEAD_FETCH_TIME", h);
            }
            if (i1 != i)
            {
                i = i1;
                editor.putInt("COLD_START_PRIME_INFO/FROZEN_FEED_TIME", i);
            }
            editor.commit();
        }
    }

    public final void a(Boolean boolean1)
    {
        if (o != boolean1.booleanValue())
        {
            o = boolean1.booleanValue();
            if (c != null)
            {
                boolean1 = c.edit();
                boolean1.putBoolean("COLD_START_PRIME_INFO/COLD_START_ADVANCE_PRIME_FROM_NODEX_ENABLED", o);
                boolean1.commit();
                return;
            }
        }
    }

    public final void a(String s)
    {
        if ((s != null || g != null) && (s == null || !s.equals(g)))
        {
            g = s;
            if (c != null)
            {
                s = c.edit();
                s.putString("COLD_START_PRIME_INFO/STORY_CURSOR", g);
                s.commit();
                return;
            }
        }
    }

    public final void a(String s, String s1, String s2)
    {
        if (s != null && s1 != null && s2 != null)
        {
            Object obj = Pattern.compile("%22[a-zA-Z0-9]{70,100}[%3D]*%22").matcher(s);
            if (((Matcher) (obj)).find())
            {
                s = s.replace(((Matcher) (obj)).group(0), "CURSOR_BOOKMARK");
                obj = Pattern.compile("%22\\d*_\\d*_[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}%22").matcher(s);
                if (((Matcher) (obj)).find())
                {
                    String s3 = ((Matcher) (obj)).group(0);
                    obj = s3.substring(3, s3.indexOf('_'));
                    s = s.replace(s3, "REQUEST_ID_BOOKMARK");
                    if (s != null && obj != null)
                    {
                        p = true;
                        if (!s.equals(f) || !s1.equals(j))
                        {
                            f = s;
                            j = s1;
                            k = ((String) (obj));
                            m = s2;
                            if (c != null)
                            {
                                s = c.edit();
                                s.putString("COLD_START_PRIME_INFO/FIRST_FETCH_STRING", f);
                                s.putString("COLD_START_PRIME_INFO/USER_AGENT", j);
                                s.putString("COLD_START_PRIME_INFO/USER_ID", k);
                                s.putString("COLD_START_PRIME_INFO/HOST_NAME", m);
                                s.commit();
                                return;
                            }
                        }
                    }
                } else
                {
                    Log.e("ColdStartPrimingInformation", "Fail to match request id pattern!");
                    f = null;
                    return;
                }
            } else
            {
                f = null;
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        if (f != null && j != null && k != null && g != null && UDPPrimingDNSInfo.a().b(m) != null)
        {
            long l1 = System.currentTimeMillis() / 1000L;
            l = (new StringBuilder()).append(k).append("_").append(Long.toString(l1)).append("_").append(k().toString()).toString();
            String s = f.replace("CURSOR_BOOKMARK", (new StringBuilder("%22")).append(g).append("%22").toString()).replace("REQUEST_ID_BOOKMARK", (new StringBuilder("%22")).append(l).append("%22").toString());
            int i1 = UDPPacketSender.a(s, j, l1, m);
            if (i1 > 0 && i1 <= 1472)
            {
                e = s;
                q = true;
                if (flag)
                {
                    j();
                    return;
                }
            }
        }
    }

    public final boolean a(Context context)
    {
        c = context.getSharedPreferences("COLD_START_PRIMING_INFO_STORAGE", 0);
        d = context;
        return h();
    }

    public final String b()
    {
        return l;
    }

    public final void b(Context context)
    {
        if (a(context) && o && EncryptChannelInformation.a().a(context) && UDPPrimingDNSInfo.a().a(context))
        {
            b(true);
        }
    }

    public final void b(Boolean boolean1)
    {
        if (n != boolean1.booleanValue())
        {
            n = boolean1.booleanValue();
            if (c != null)
            {
                boolean1 = c.edit();
                boolean1.putBoolean("COLD_START_PRIME_INFO/COLD_START_ADVANCE_PRIME_ENABLED", n);
                boolean1.commit();
                return;
            }
        }
    }

    public final boolean c()
    {
        return q;
    }

    public final void d()
    {
        q = false;
    }

    public final boolean e()
    {
        boolean flag;
        if (p && f != null && j != null && k != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return n && !flag;
    }

    public final void f()
    {
        TracerDetour.a("ColdStartPrimingInformation.mayFireEarlyUDPPrimingInMainTabActivity", 0x9de8c0e2);
        if (g())
        {
            i();
        }
        if (!q && n)
        {
            b(false);
        }
        TracerDetour.a(0x3c54924c);
        return;
        Exception exception;
        exception;
        TracerDetour.a(0x2adc2d71);
        throw exception;
    }


    private class _cls1
        implements Runnable
    {

        final boolean a;
        final ColdStartPrimingInformation b;

        public void run()
        {
            b.a(a);
        }

        _cls1(boolean flag)
        {
            b = ColdStartPrimingInformation.this;
            a = flag;
            super();
        }
    }

}
