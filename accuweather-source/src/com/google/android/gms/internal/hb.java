// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class hb
    implements SafeParcelable
{

    private static final Object FU = new Object();
    private static ClassLoader FV = null;
    private static Integer FW = null;
    private boolean FX;

    public hb()
    {
        FX = false;
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
        ClassLoader classloader = fk();
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

    protected static ClassLoader fk()
    {
        ClassLoader classloader;
        synchronized (FU)
        {
            classloader = FV;
        }
        return classloader;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static Integer fl()
    {
        Integer integer;
        synchronized (FU)
        {
            integer = FW;
        }
        return integer;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean fm()
    {
        return FX;
    }

}
