// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

public final class btw
{

    private static String a = "WakeLockTracker";
    private static btw b = new btw();
    private static Integer c;

    public btw()
    {
    }

    public static btw a()
    {
        return b;
    }

    public static void a(Context context, String s, int i, String s1, String s2, int j, List list, long l)
    {
        if (c == null)
        {
            c = Integer.valueOf(b());
        }
        if (c.intValue() != btr.b)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            if (TextUtils.isEmpty(s))
            {
                Log.e(a, (new StringBuilder("missing wakeLock key. ")).append(s).toString());
                return;
            }
            long l1 = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i)
            {
                s = new WakeLockEvent(l1, i, s1, 1, list, s, SystemClock.elapsedRealtime(), cns.a(context), null, context.getPackageName(), cns.b(context), l);
                try
                {
                    context.startService((new Intent()).setComponent(btr.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", s));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.wtf(a, context);
                }
                return;
            }
        }
    }

    public static void a(Context context, String s, String s1, List list)
    {
        a(context, s, 8, s1, null, 1, list, 0L);
    }

    private static int b()
    {
        int i;
        try
        {
            i = btr.b;
        }
        catch (SecurityException securityexception)
        {
            return btr.b;
        }
        return i;
    }

}
