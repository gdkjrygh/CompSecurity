// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzhn, zzab, zzhg

static final class zzzo
    implements Callable
{

    final Callable zzzo;

    public final Object call()
    {
        Object obj;
        try
        {
            Process.setThreadPriority(10);
            obj = zzzo.call();
        }
        catch (Exception exception)
        {
            zzab.zzaP().zze(exception);
            throw exception;
        }
        return obj;
    }

    (Callable callable)
    {
        zzzo = callable;
        super();
    }
}
