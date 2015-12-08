// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.util.EnumSet;

// Referenced classes of package com.devicecollector:
//            CollectorProcess, AbstractCollectorProcess

public final class DeviceCollector
{

    private String a;
    private String b;
    private StatusListener c;
    private Activity d;
    private AbstractCollectorProcess e;
    private EnumSet f;

    public DeviceCollector(Activity activity)
    {
        d = activity;
    }

    private void a(ErrorCode errorcode, Exception exception)
    {
        if (c != null)
        {
            c.a(errorcode, exception);
        }
    }

    private boolean a()
    {
        NetworkInfo networkinfo;
        boolean flag;
        try
        {
            networkinfo = ((ConnectivityManager)d.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
        catch (Exception exception)
        {
            a(ErrorCode.f, exception);
            return false;
        }
        if (networkinfo == null) goto _L2; else goto _L1
_L1:
        if (!networkinfo.isConnectedOrConnecting()) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        a(ErrorCode.a, ((Exception) (null)));
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean a(String s, String s1, String s2)
    {
        if (s == null || !s.matches("^https?://[\\w-]+(\\.[\\w-]+)+(/[^?]*)?$"))
        {
            a(ErrorCode.b, ((Exception) (null)));
            return false;
        }
        if (s1 == null || !s1.matches("^\\d{1,6}$"))
        {
            a(ErrorCode.c, ((Exception) (null)));
            return false;
        }
        if (s2 == null || !s2.matches("^[\\w-]{1,32}$"))
        {
            a(ErrorCode.d, ((Exception) (null)));
            return false;
        } else
        {
            return true;
        }
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(String s, long l)
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        if (!a() || !a(a, b, s)) goto _L4; else goto _L3
_L3:
        e = new CollectorProcess(d, c, f);
        e.a(l);
        if (android.os.Build.VERSION.SDK_INT <= 10) goto _L6; else goto _L5
_L5:
        e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
            a, b, s
        });
_L4:
        return;
_L6:
        e.execute(new String[] {
            a, b, s
        });
        return;
_L2:
        if (c != null)
        {
            if (!e.a())
            {
                c.a(ErrorCode.f, new RuntimeException("Already running. Will not start collecting again."));
                return;
            } else
            {
                c.a(ErrorCode.f, new RuntimeException("Already completed. Will not start collecting again."));
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void b(String s)
    {
        b = s;
    }

    public void c(String s)
    {
        a(s, -1L);
    }

    private class StatusListener
    {

        public abstract void a();

        public abstract void a(ErrorCode errorcode, Exception exception);

        public abstract void b();
    }


    private class ErrorCode extends Enum
    {

        public static final ErrorCode a;
        public static final ErrorCode b;
        public static final ErrorCode c;
        public static final ErrorCode d;
        public static final ErrorCode e;
        public static final ErrorCode f;
        private static final ErrorCode g[];

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/devicecollector/DeviceCollector$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])g.clone();
        }

        static 
        {
            a = new ErrorCode("NO_NETWORK", 0);
            b = new ErrorCode("INVALID_URL", 1);
            c = new ErrorCode("INVALID_MERCHANT", 2);
            d = new ErrorCode("INVALID_SESSION", 3);
            e = new ErrorCode("MERCHANT_CANCELLED", 4);
            f = new ErrorCode("RUNTIME_FAILURE", 5);
            g = (new ErrorCode[] {
                a, b, c, d, e, f
            });
        }

        private ErrorCode(String s, int i)
        {
            super(s, i);
        }
    }

}
