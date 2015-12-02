// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.app.ActivityManagerNative;
import android.app.IActivityManager;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

// Referenced classes of package com.b.a:
//            d, g, h, c, 
//            b

class a
{

    private static final String GLOBAL_DEFAULT_INSTANCE = "gDefault";
    private static final String SINGLETON_CLASSNAME = "android.util.Singleton";
    private static final String SINGLETON_INSTANCE = "mInstance";
    private static final String TAG = com/b/a/a.getSimpleName();
    private static c job;
    private static IActivityManager sOldActivityManager;

    a()
    {
    }

    private static IActivityManager createActivityManagerProxy(IActivityManager iactivitymanager)
    {
        b b = createDataProxy();
        switch (android.os.Build.VERSION.SDK_INT)
        {
        default:
            throw new d("IActivityManagerProxy");

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            iactivitymanager = new android.a.a(iactivitymanager, b);
            break;
        }
        return (IActivityManager)Proxy.newProxyInstance(android/app/IActivityManager.getClassLoader(), new Class[] {
            android/app/IActivityManager
        }, iactivitymanager);
    }

    private static b createDataProxy()
    {
        switch (android.os.Build.VERSION.SDK_INT)
        {
        default:
            throw new d("ViolationInfoProxy");

        case 9: // '\t'
        case 10: // '\n'
            return new g(job);

        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            return new h(job);
        }
    }

    public static void enableUniqueViolations(boolean flag, c c)
    {
        job = c;
        com/b/a/a;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (sOldActivityManager != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        c = ActivityManagerNative.getDefault();
        c = createActivityManagerProxy(c);
        sOldActivityManager = replaceActivityManager(c);
        if (sOldActivityManager == null)
        {
            throw new d("replaceActivityManager");
        }
        break MISSING_BLOCK_LABEL_105;
        c;
        com/b/a/a;
        JVM INSTR monitorexit ;
        throw c;
        c;
        Log.e(TAG, "This is likely a new version of Android not yet supported. To add support, look at //android-prebuilt/readme.md", c);
        com/b/a/a;
        JVM INSTR monitorexit ;
        return;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (sOldActivityManager == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        c = replaceActivityManager(sOldActivityManager);
        sOldActivityManager = null;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        throw new d("replaceActivityManager");
        com/b/a/a;
        JVM INSTR monitorexit ;
    }

    private static IActivityManager replaceActivityManager(IActivityManager iactivitymanager)
    {
        ActivityManagerNative.getDefault();
        Object obj;
        Class class1;
        Field field = android/app/ActivityManagerNative.getDeclaredField("gDefault");
        field.setAccessible(true);
        obj = field.get(null);
        class1 = obj.getClass();
        if (!android/app/IActivityManager.isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (IActivityManager)field.get(null);
        field.set(null, iactivitymanager);
        return ((IActivityManager) (obj));
        Object obj1 = class1.getSuperclass();
        if (!((Class) (obj1)).getName().equals("android.util.Singleton"))
        {
            return null;
        }
        IActivityManager iactivitymanager1;
        try
        {
            obj1 = ((Class) (obj1)).getDeclaredField("mInstance");
            ((Field) (obj1)).setAccessible(true);
            iactivitymanager1 = (IActivityManager)((Field) (obj1)).get(obj);
            ((Field) (obj1)).set(obj, iactivitymanager);
        }
        // Misplaced declaration of an exception variable
        catch (IActivityManager iactivitymanager)
        {
            Log.e(TAG, "Failed to replace activity manager.", iactivitymanager);
            return null;
        }
        return iactivitymanager1;
    }

}
