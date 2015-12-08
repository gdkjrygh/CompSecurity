// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class DowngradeableSafeParcel
    implements SafeParcelable
{
    public static final class DowngradeableSafeParcelHelper
    {

        public static Bundle getExtras(Intent intent, Context context, Integer integer)
        {
            synchronized (DowngradeableSafeParcel.UNPARCEL_PARAMETER_LOCK)
            {
                intent = DowngradeableSafeParcel.getExtras(intent, context, integer);
            }
            return intent;
            intent;
            obj;
            JVM INSTR monitorexit ;
            throw intent;
        }

        public static Parcelable getParcelable(Intent intent, String s, Context context, Integer integer)
        {
            synchronized (DowngradeableSafeParcel.UNPARCEL_PARAMETER_LOCK)
            {
                intent = DowngradeableSafeParcel.getParcelable(intent, s, context, integer);
            }
            return intent;
            intent;
            obj;
            JVM INSTR monitorexit ;
            throw intent;
        }

        public static boolean putParcelable(Bundle bundle, String s, DowngradeableSafeParcel downgradeablesafeparcel, Context context, Integer integer)
        {
            return DowngradeableSafeParcel.putParcelable(bundle, s, downgradeablesafeparcel, context, integer);
        }
    }


    private static final Object UNPARCEL_PARAMETER_LOCK = new Object();
    private static ClassLoader sUnparcelClassLoader = null;
    private static Integer sUnparcelClientVersion = null;
    public boolean mShouldDowngrade;

    public DowngradeableSafeParcel()
    {
        mShouldDowngrade = false;
    }

    public static boolean canUnparcelSafely(String s)
    {
        ClassLoader classloader = getUnparcelClassLoader();
        if (classloader == null)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = isClientClassSafe(classloader.loadClass(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    static Bundle getExtras(Intent intent, Context context, Integer integer)
    {
        Bundle bundle;
        Object obj;
        obj = null;
        bundle = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        setUnparcelParams(context.getClassLoader(), integer);
        bundle = obj;
        if (intent.getExtras() == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        bundle = new Bundle();
        bundle.putAll(intent.getExtras());
        setUnparcelParams(null, null);
        return bundle;
        intent;
_L2:
        setUnparcelParams(null, null);
        throw intent;
        intent;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Parcelable getParcelable(Intent intent, String s, Context context, Integer integer)
    {
        Parcelable parcelable;
        parcelable = null;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        setUnparcelParams(context.getClassLoader(), integer);
        parcelable = intent.getParcelableExtra(s);
        setUnparcelParams(null, null);
        return parcelable;
        intent;
        setUnparcelParams(null, null);
        throw intent;
    }

    private static ClassLoader getUnparcelClassLoader()
    {
        ClassLoader classloader;
        synchronized (UNPARCEL_PARAMETER_LOCK)
        {
            classloader = sUnparcelClassLoader;
        }
        return classloader;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Integer getUnparcelClientVersion()
    {
        Integer integer;
        synchronized (UNPARCEL_PARAMETER_LOCK)
        {
            integer = sUnparcelClientVersion;
        }
        return integer;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static boolean isClientClassSafe(Class class1)
    {
        boolean flag;
        try
        {
            flag = "SAFE_PARCELABLE_NULL_STRING".equals(class1.getField("NULL").get(null));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return false;
        }
        return flag;
    }

    private boolean prepareForClient(Context context, Integer integer)
    {
        if (integer != null)
        {
            return prepareForClientVersion(integer.intValue());
        }
        boolean flag;
        if (!isClientClassSafe(context.getClassLoader().loadClass(getClass().getCanonicalName())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            setShouldDowngrade(flag);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    static boolean putParcelable(Bundle bundle, String s, DowngradeableSafeParcel downgradeablesafeparcel, Context context, Integer integer)
    {
        while (context == null && integer == null || !downgradeablesafeparcel.prepareForClient(context, integer)) 
        {
            return false;
        }
        bundle.putParcelable(s, downgradeablesafeparcel);
        return true;
    }

    private static void setUnparcelParams(ClassLoader classloader, Integer integer)
    {
        synchronized (UNPARCEL_PARAMETER_LOCK)
        {
            sUnparcelClassLoader = classloader;
            sUnparcelClientVersion = integer;
        }
        return;
        classloader;
        obj;
        JVM INSTR monitorexit ;
        throw classloader;
    }

    public abstract boolean prepareForClientVersion(int i);

    public void setShouldDowngrade(boolean flag)
    {
        mShouldDowngrade = flag;
    }


}
