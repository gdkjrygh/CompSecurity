// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.c;

import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.base.c;
import com.facebook.debug.log.e;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import java.text.SimpleDateFormat;
import java.util.List;

// Referenced classes of package com.facebook.common.c:
//            d, b, c

public class a
    implements c, e
{

    private static final Class a = com/facebook/common/c/a;
    private static final SimpleDateFormat b = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
    private final d c;
    private final String d;
    private final javax.inject.a e;
    private HandlerThread f;
    private Handler g;
    private volatile boolean h;
    private com.facebook.common.c.d i;
    private f j;

    public a(PackageInfo packageinfo, d d1, javax.inject.a a1)
    {
        c = d1;
        d = packageinfo.packageName;
        e = a1;
    }

    static void a(a a1)
    {
        a1.e();
    }

    static com.facebook.common.c.d b(a a1)
    {
        return a1.i;
    }

    static SimpleDateFormat c()
    {
        return b;
    }

    static boolean c(a a1)
    {
        return a1.h;
    }

    static Class d()
    {
        return a;
    }

    static String d(a a1)
    {
        return a1.d;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = ((Boolean)e.b()).booleanValue();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        f();
        h = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new HandlerThread("logger");
            f.start();
            g = new Handler(f.getLooper());
            i = new com.facebook.common.c.d(this, null);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        j = new b(this);
        c.a(j);
        e();
    }

    public void a(int k, String s, String s1)
    {
        if (h)
        {
            g.post(new com.facebook.common.c.c(this, k, s, s1));
        }
    }

    public List b()
    {
        f();
        return i.a();
    }

}
