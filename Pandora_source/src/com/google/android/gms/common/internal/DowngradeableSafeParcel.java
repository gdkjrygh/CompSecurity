// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class DowngradeableSafeParcel
    implements SafeParcelable
{

    private static final Object zzTd = new Object();
    private static ClassLoader zzTe = null;
    private static Integer zzTf = null;
    private boolean zzTg;

    public DowngradeableSafeParcel()
    {
        zzTg = false;
    }

    private static boolean zza(Class class1)
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

    protected static boolean zzbK(String s)
    {
        ClassLoader classloader = zzlO();
        if (classloader == null)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = zza(classloader.loadClass(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    protected static ClassLoader zzlO()
    {
        ClassLoader classloader;
        synchronized (zzTd)
        {
            classloader = zzTe;
        }
        return classloader;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static Integer zzlP()
    {
        Integer integer;
        synchronized (zzTd)
        {
            integer = zzTf;
        }
        return integer;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean zzlQ()
    {
        return zzTg;
    }

}
