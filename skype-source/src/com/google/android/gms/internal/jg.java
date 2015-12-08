// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jn, jq

public class jg
{
    public static interface a
    {

        public abstract void a(jn jn1);

        public abstract void a(jn jn1, Activity activity);
    }


    private static final a a[] = new a[0];
    private static jg b;
    private final Application c;
    private jn d;
    private final List e = new ArrayList();
    private jq f;

    private jg(Application application)
    {
        y.a(application);
        c = application;
    }

    public static jg a(Context context)
    {
        y.a(context);
        context = (Application)context.getApplicationContext();
        y.a(context);
        com/google/android/gms/internal/jg;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new jg(context);
        }
        context = b;
        com/google/android/gms/internal/jg;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/internal/jg;
        JVM INSTR monitorexit ;
        throw context;
    }

    private a[] c()
    {
label0:
        {
            a aa[];
            synchronized (e)
            {
                if (!e.isEmpty())
                {
                    break label0;
                }
                aa = a;
            }
            return aa;
        }
        a aa1[] = (a[])e.toArray(new a[e.size()]);
        list;
        JVM INSTR monitorexit ;
        return aa1;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final jn a()
    {
        return d;
    }

    public final void a(a a1)
    {
        y.a(a1);
        synchronized (e)
        {
            e.remove(a1);
            e.add(a1);
        }
        return;
        a1;
        list;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void a(jn jn1, Activity activity)
    {
        boolean flag;
        flag = false;
        y.a(jn1);
        if (!jn1.f()) goto _L2; else goto _L1
_L1:
        a aa[];
        if (d != null)
        {
            jn1.a(d.b());
            jn1.b(d.a());
        }
        aa = c();
        for (int i = 0; i < aa.length; i++)
        {
            aa[i].a(jn1, activity);
        }

        jn1.g();
        if (!TextUtils.isEmpty(jn1.a())) goto _L4; else goto _L3
_L3:
        return;
_L4:
        activity = aa;
_L5:
        if (d != null && d.b() == jn1.b())
        {
            d = jn1;
            return;
        }
        d = null;
        d = jn1;
        Object obj = activity;
        int j = ((flag) ? 1 : 0);
        if (activity == null)
        {
            obj = c();
            j = ((flag) ? 1 : 0);
        }
        while (j < obj.length) 
        {
            obj[j].a(jn1);
            j++;
        }
        if (true) goto _L3; else goto _L2
_L2:
        activity = null;
          goto _L5
    }

    public final void b()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            Log.i("com.google.android.gms.measurement.ScreenViewService", "AutoScreeViewTracking is not supported on API 14 or earlier devices");
        } else
        {
            boolean flag;
            if (f != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                f = new jq(this);
                c.registerActivityLifecycleCallbacks(f);
                return;
            }
        }
    }

}
