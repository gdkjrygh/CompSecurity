// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.app;

import android.content.Context;
import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.common.app:
//            BaseApplicationContext

public final class GmsApplicationContext extends BaseApplicationContext
{

    private static GmsApplicationContext sInstance;

    public GmsApplicationContext(Context context, BaseApplicationContext baseapplicationcontext)
    {
        super(context, baseapplicationcontext);
        com/google/android/gms/common/app/GmsApplicationContext;
        JVM INSTR monitorenter ;
        if (sInstance != null)
        {
            throw new IllegalArgumentException("non-null reference");
        }
        break MISSING_BLOCK_LABEL_31;
        context;
        com/google/android/gms/common/app/GmsApplicationContext;
        JVM INSTR monitorexit ;
        throw context;
        sInstance = this;
        com/google/android/gms/common/app/GmsApplicationContext;
        JVM INSTR monitorexit ;
    }

    public static GmsApplicationContext getInstance()
    {
        Asserts.checkNotNull(sInstance);
        return sInstance;
    }
}
