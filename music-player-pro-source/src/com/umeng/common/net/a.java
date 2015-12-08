// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.umeng.common.Log;

// Referenced classes of package com.umeng.common.net:
//            b, DownloadingService, k

public class com.umeng.common.net.a
{
    static class a
    {

        public String a;
        public String b;
        public String c;
        public String d[];
        public boolean e;

        public static a a(Bundle bundle)
        {
            a a1 = new a(bundle.getString("mComponentName"), bundle.getString("mTitle"), bundle.getString("mUrl"));
            a1.d = bundle.getStringArray("reporturls");
            a1.e = bundle.getBoolean("rich_notification");
            return a1;
        }

        public Bundle a()
        {
            Bundle bundle = new Bundle();
            bundle.putString("mComponentName", a);
            bundle.putString("mTitle", b);
            bundle.putString("mUrl", c);
            bundle.putStringArray("reporturls", d);
            bundle.putBoolean("rich_notification", e);
            return bundle;
        }

        public a(String s, String s1, String s2)
        {
            d = null;
            e = false;
            a = s;
            b = s1;
            c = s2;
        }
    }

    class b extends Handler
    {

        final com.umeng.common.net.a a;

        public void handleMessage(Message message)
        {
            Log.c(com.umeng.common.net.a.b(), (new StringBuilder("DownloadAgent.handleMessage(")).append(message.what).append("): ").toString());
            message.what;
            JVM INSTR tableswitch 3 5: default 220
        //                       3 66
        //                       4 60
        //                       5 136;
               goto _L1 _L2 _L1 _L3
_L1:
            super.handleMessage(message);
            return;
_L2:
            try
            {
                if (com.umeng.common.net.a.a(a) != null)
                {
                    com.umeng.common.net.a.a(a).a(message.arg1);
                    return;
                }
                break; /* Loop/switch isn't completed */
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                Log.c(com.umeng.common.net.a.b(), (new StringBuilder("DownloadAgent.handleMessage(")).append(message.what).append("): ").append(exception.getMessage()).toString());
                return;
            }
_L3:
            com.umeng.common.net.a.h(a).unbindService(com.umeng.common.net.a.i(a));
            if (com.umeng.common.net.a.a(a) == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (message.arg1 == 1)
            {
                com.umeng.common.net.a.a(a).a(message.arg1, message.getData().getString("filename"));
                return;
            }
            com.umeng.common.net.a.a(a).a(0, null);
            Log.c(com.umeng.common.net.a.b(), "DownloadAgent.handleMessage(DownloadingService.DOWNLOAD_COMPLETE_FAIL): ");
            return;
        }

        b()
        {
            a = com.umeng.common.net.a.this;
            super();
        }
    }


    private static final String b = com/umeng/common/net/a.getName();
    final Messenger a = new Messenger(new b());
    private Context c;
    private k d;
    private Messenger e;
    private String f;
    private String g;
    private String h;
    private String i[];
    private boolean j;
    private ServiceConnection k;

    public com.umeng.common.net.a(Context context, String s, String s1, String s2, k k1)
    {
        j = false;
        k = new com.umeng.common.net.b(this);
        c = context.getApplicationContext();
        f = s;
        g = s1;
        h = s2;
        d = k1;
    }

    static k a(com.umeng.common.net.a a1)
    {
        return a1.d;
    }

    static void a(com.umeng.common.net.a a1, Messenger messenger)
    {
        a1.e = messenger;
    }

    static String b()
    {
        return b;
    }

    static String b(com.umeng.common.net.a a1)
    {
        return a1.f;
    }

    static String c(com.umeng.common.net.a a1)
    {
        return a1.g;
    }

    static String d(com.umeng.common.net.a a1)
    {
        return a1.h;
    }

    static String[] e(com.umeng.common.net.a a1)
    {
        return a1.i;
    }

    static boolean f(com.umeng.common.net.a a1)
    {
        return a1.j;
    }

    static Messenger g(com.umeng.common.net.a a1)
    {
        return a1.e;
    }

    static Context h(com.umeng.common.net.a a1)
    {
        return a1.c;
    }

    static ServiceConnection i(com.umeng.common.net.a a1)
    {
        return a1.k;
    }

    public void a()
    {
        Intent intent = new Intent(c, com/umeng/common/net/DownloadingService);
        c.bindService(intent, k, 1);
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public void a(String as[])
    {
        i = as;
    }

}
