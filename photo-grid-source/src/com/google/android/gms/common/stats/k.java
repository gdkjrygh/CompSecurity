// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ve;
import com.google.android.gms.internal.wf;
import com.google.android.gms.internal.wj;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            f, WakeLockEvent, e

public final class k
{

    private static String a = "WakeLockTracker";
    private static k b = new k();
    private static Integer c;

    public k()
    {
    }

    public static k a()
    {
        return b;
    }

    public static void a(Context context, String s, int i, String s1, String s2, int j, List list, long l)
    {
        if (c == null)
        {
            c = Integer.valueOf(b());
        }
        boolean flag;
        if (c.intValue() != f.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (TextUtils.isEmpty(s))
            {
                Log.e(a, (new StringBuilder("missing wakeLock key. ")).append(s).toString());
                return;
            }
            long l1 = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i)
            {
                s = new WakeLockEvent(l1, i, s1, j, list, s, SystemClock.elapsedRealtime(), wj.a(context), s2, context.getPackageName(), wj.b(context), l);
                try
                {
                    context.startService((new Intent()).setComponent(f.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", s));
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

    public static void a(Context context, String s, String s1, String s2, int i, List list)
    {
        a(context, s, 8, s1, s2, i, list, 0L);
    }

    private static int b()
    {
        int i;
        try
        {
            if (wf.a())
            {
                return ((Integer)e.a.d()).intValue();
            }
            i = f.b;
        }
        catch (SecurityException securityexception)
        {
            return f.b;
        }
        return i;
    }

}
