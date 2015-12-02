// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android_src.a.a.a;
import android_src.c.f;

// Referenced classes of package android_src.mms.transaction:
//            g, h, e

public class d
{

    private static final String a[] = {
        "thread_id", "date", "_id", "sub", "sub_cs"
    };
    private static final String b[] = {
        "thread_id", "date", "address", "subject", "body"
    };
    private static final g c = new g(null);
    private static final Uri d = Uri.parse("content://mms-sms/undelivered");
    private static h e = new h();
    private static Intent f;
    private static Handler g = new Handler();

    private d()
    {
    }

    public static void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.android.mms.NOTIFICATION_DELETED_ACTION");
        context.registerReceiver(e, intentfilter);
        f = new Intent("com.android.mms.NOTIFICATION_DELETED_ACTION");
    }

    public static void a(Context context, int i)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(i);
    }

    public static void a(Context context, long l)
    {
        a(context, true, l, false);
    }

    public static void a(Context context, boolean flag)
    {
        a(context, false, 0L, flag);
    }

    private static void a(Context context, boolean flag, long l, boolean flag1)
    {
    }

    public static void a(Context context, boolean flag, boolean flag1)
    {
        (new Thread(new e(context, flag, flag1))).start();
    }

    public static void b(Context context)
    {
        if (c(context) < 1)
        {
            a(context, 531);
        }
    }

    public static void b(Context context, boolean flag, boolean flag1)
    {
    }

    private static int c(Context context)
    {
        context = android_src.a.a.a.a(context, context.getContentResolver(), f.a, null, (new StringBuilder()).append("m_type=").append(String.valueOf(130)).append(" AND ").append("st").append("=").append(String.valueOf(135)).toString(), null, null);
        if (context == null)
        {
            return 0;
        } else
        {
            int i = context.getCount();
            context.close();
            return i;
        }
    }

}
