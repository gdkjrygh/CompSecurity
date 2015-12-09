// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.gservices;

import android.os.Binder;
import com.google.android.gms.common.config.GservicesValue;

public final class GServicesHelper
{

    private static final String LOG_PREFIX = (new StringBuilder("[")).append(com/google/android/gms/common/gservices/GServicesHelper.getSimpleName()).append("]").toString();

    public static int getInt(GservicesValue gservicesvalue)
    {
        long l = Binder.clearCallingIdentity();
        int i = ((Integer)gservicesvalue.get()).intValue();
        Binder.restoreCallingIdentity(l);
        return i;
        gservicesvalue;
        Binder.restoreCallingIdentity(l);
        throw gservicesvalue;
    }

    public static long getLong(GservicesValue gservicesvalue)
    {
        long l = Binder.clearCallingIdentity();
        long l1 = ((Long)gservicesvalue.get()).longValue();
        Binder.restoreCallingIdentity(l);
        return l1;
        gservicesvalue;
        Binder.restoreCallingIdentity(l);
        throw gservicesvalue;
    }

    public static String getString(GservicesValue gservicesvalue)
    {
        long l = Binder.clearCallingIdentity();
        gservicesvalue = (String)gservicesvalue.get();
        Binder.restoreCallingIdentity(l);
        return gservicesvalue;
        gservicesvalue;
        Binder.restoreCallingIdentity(l);
        throw gservicesvalue;
    }

}
