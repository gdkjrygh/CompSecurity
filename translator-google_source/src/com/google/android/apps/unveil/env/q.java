// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.hardware.Camera;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class q
{

    public static Method a;
    public static Method b;
    private static boolean c;

    public static transient Object a(Method method, Object obj, Object aobj[])
    {
        if (method == null)
        {
            return null;
        }
        try
        {
            method = ((Method) (method.invoke(obj, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            method.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            method.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            method.printStackTrace();
            return null;
        }
        return method;
    }

    public static void a()
    {
        com/google/android/apps/unveil/env/q;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/apps/unveil/env/q;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = android/hardware/Camera.getDeclaredMethod("setPreviewTexture", new Class[] {
            Class.forName("android.graphics.SurfaceTexture")
        });
        b = Class.forName("android.view.TextureView").getDeclaredMethod("getSurfaceTexture", new Class[0]);
_L4:
        c = true;
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        obj;
        throw obj;
        obj;
        ((NoSuchMethodException) (obj)).printStackTrace();
          goto _L4
        obj;
        ((SecurityException) (obj)).printStackTrace();
          goto _L4
        obj;
        ((IllegalArgumentException) (obj)).printStackTrace();
          goto _L4
        obj;
        ((ClassNotFoundException) (obj)).printStackTrace();
          goto _L4
    }
}
