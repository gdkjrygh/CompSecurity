// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class ha
    implements SafeParcelable
{

    private static final Object FX = new Object();
    private static ClassLoader FY = null;
    private static Integer FZ = null;
    private boolean Ga;

    public ha()
    {
        Ga = false;
    }

    private static boolean a(Class class1)
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

    protected static boolean aA(String s)
    {
        ClassLoader classloader = fp();
        if (classloader == null)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = a(classloader.loadClass(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    protected static ClassLoader fp()
    {
        ClassLoader classloader;
        synchronized (FX)
        {
            classloader = FY;
        }
        return classloader;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static Integer fq()
    {
        Integer integer;
        synchronized (FX)
        {
            integer = FZ;
        }
        return integer;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean fr()
    {
        return Ga;
    }

}
