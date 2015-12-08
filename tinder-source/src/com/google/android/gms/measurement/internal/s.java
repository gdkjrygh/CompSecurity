// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.u;

final class s
{

    private static volatile s d;
    private final String a;
    private final Status b;
    private final boolean c;

    private s(Context context)
    {
        boolean flag1 = true;
        super();
        Resources resources = context.getResources();
        int i = resources.getIdentifier("google_app_measurement_enable", "integer", context.getPackageName());
        boolean flag = flag1;
        if (i != 0)
        {
            if (resources.getInteger(i) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        c = flag;
        i = resources.getIdentifier("google_app_id", "string", context.getPackageName());
        if (i == 0)
        {
            if (c)
            {
                b = new Status(10, "Missing an expected resource: 'R.string.google_app_id' for initializing Google services.  Possible causes are missing google-services.json or com.google.gms.google-services gradle plugin.");
            } else
            {
                b = Status.a;
            }
            a = null;
            return;
        }
        context = resources.getString(i);
        if (TextUtils.isEmpty(context))
        {
            if (c)
            {
                b = new Status(10, (new StringBuilder("The resource 'R.string.google_app_id' is invalid, expected an app  identifier and found: '")).append(context).append("'.").toString());
            } else
            {
                b = Status.a;
            }
            a = null;
            return;
        } else
        {
            a = context;
            b = Status.a;
            return;
        }
    }

    public static Status a(Context context)
    {
        u.a(context, "Context must not be null.");
        if (d != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new s(context);
        }
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorexit ;
_L2:
        return d.b;
        context;
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static String a()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            throw new IllegalStateException("Initialize must be called before getGoogleAppId.");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorexit ;
_L2:
        s s1 = d;
        if (!s1.b.b())
        {
            throw new IllegalStateException((new StringBuilder("Initialize must be successful before calling getGoogleAppId.  The result of the previous call to initialize was: '")).append(s1.b).append("'.").toString());
        } else
        {
            return s1.a;
        }
    }

    public static boolean b()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            throw new IllegalStateException("Initialize must be called before isMeasurementEnabled.");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/measurement/internal/s;
        JVM INSTR monitorexit ;
_L2:
        s s1 = d;
        if (!s1.b.b())
        {
            throw new IllegalStateException((new StringBuilder("Initialize must be successful before calling isMeasurementEnabledInternal.  The result of the previous call to initialize was: '")).append(s1.b).append("'.").toString());
        } else
        {
            return s1.c;
        }
    }
}
